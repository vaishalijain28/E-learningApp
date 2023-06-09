package Enhance;

import java.util.Scanner;

import Enhance.Course;
import Enhance.Educator;
import Enhance.Login;
import Enhance.Payment;
import Enhance.Result;
import Enhance.Student;
import Enhance.Test;

public class main_program {

	public static int get_index() {
		Scanner num1 = new Scanner(System.in);
		System.out.println("\n Choose for what you want to check: ");
		System.out.println("\n Choose what you want to check: ");
		System.out.println("1 for Login");
		System.out.println("2 for Course");
		System.out.println("3 for Student");
		System.out.println("4 for Educator");
		System.out.println("5 for Payment");
		System.out.println("6 for Test");
		System.out.println("7 for Result");
		System.out.println("0 to Exit");
		System.out.println("What you have chosen: ");
		return num1.nextByte();
	}

	public static int get_number() {
		Scanner num = new Scanner(System.in);
		System.out.println("Select from the choices given below:");
		System.out.println("**Press 1 to Insert record**");
		System.out.println("**Press 2 to Delete record**");
		System.out.println("**Press 3 to Display record**");
		System.out.println("**Press 0 for return to Main Menu**");
		System.out.println("What do you want to perform??");
		return num.nextByte();

	}

	public static void main(String args[]) {
		System.out.println("Enhance E-learning App");
		Scanner o_num = new Scanner(System.in);
		Login[] l = new Login[1000];
		Student[] s = new Student[1000];
		Educator[] e = new Educator[1000];
		Course[] c = new Course[1000];
		Payment[] p = new Payment[1000];
		Test[] t = new Test[1000];
		Result[] r = new Result[1000];

		int login = 0;
		int stdnt = 0;
		int ed = 0;
		int cors = 0;
		int pymt = 0;
		int testt = 0;
		int rslt = 0;

		while (true) {
			int n = get_index();
			if (n == 0) {
				System.out.println("Exiting Program....");
				break;
			}

			else {
				switch (n) {
					case 1: {
						System.out.println("LOGIN");
						while (true) {
							int id = get_number();
							if (id == 0) {
								System.out.println("Exiting Operation...");
								break;
							} else {
								l[login] = new Login();
								Scanner sc = new Scanner(System.in);
								switch (id) {
									case 1: {
										System.out.println("Adding Record to Login");
										System.out.println("Enter Login ID:");
										l[login].setlogin_id(o_num.nextInt());
										System.out.println("Enter username:");
										l[login].setusername(sc.next());
										System.out.println("Enter password:");
										l[login].setpassword(sc.next());

										System.out.println("Successfully Entered");
										login++;
										break;
									}
									case 2: {
										System.out.println("Deleting Record from Login");
										System.out.print("Write the Login ID you want to delete:");
										int code = o_num.nextInt();
										boolean checker = false;
										for (int i = 0; i < l.length; i++) {
											if (l[i] == null) {
												continue;
											}
											if (l[i].getlogin_id() == code) {
												l[i] = null;
												System.out.println("Record Deleted");
												checker = true;
											}
											if (checker) {
												break;
											}
										}
										if (!checker) {
											System.out.print(
													"The given record is not in data. Try Again By Choosing Task:");
										}

									}
									case 3: {
										System.out.println("Displaying Record from Login");
										for (Enhance.Login Login : l) {
											if (Login == null) {
												continue;
											}
											Login.display();
											System.out.println("-------------------------------");
										}
										break;
									}
									default:
										System.out.println("Try Again with correct Input...");
								}
							}
						}
					}
					case 2: {
						System.out.println("COURSE");
						while (true) {
							int crs = get_number();
							if (crs == 0) {
								System.out.println("Exiting Operation....");
								break;
							} else {
								c[cors] = new Course();
								Scanner sc_c = new Scanner(System.in);
								switch (crs) {
									case 1: {
										System.out.println("Add Record to Course");
										System.out.println("Enter Course ID:");
										c[cors].setCourseId(sc_c.nextInt());
										System.out.println("Enter Course Name:");
										c[cors].setCourseName(sc_c.next());
										System.out.println("Enter Course Type:");
										c[cors].setCourseType(sc_c.next());
										System.out.println("Enter Course Description:");
										c[cors].setc_Description(sc_c.next());
										System.out.println("Enter Course Duration:");
										c[cors].setc_duration(sc_c.nextInt());
										System.out.println("Successfully Entered");
										cors++;
										break;
									}
									case 2: {
										System.out.println("Deleting Record from Course");
										System.out.println("What do you want to delete??");
										int cId = o_num.nextInt();
										boolean checker = false;
										for (int i = 0; i < c.length; i++) {
											if (c[i] == null) {
												continue;
											}
											if (c[i].getCourseId() == cId) {
												c[i] = null;
												System.out.println("Record Deleted.");
												checker = true;
											}
											if (checker) {
												break;
											}

										}
										if (!checker) {
											System.out.print("The given is not in data. Try Again By Choosing Task:");
										}
										break;
									}
									case 3: {
										System.out.println("Displaying Record from Course");
										for (Enhance.Course Course : c) {
											if (Course == null) {
												continue;
											}
											Course.display();
											System.out.println("----------------------------------------");
										}
									}
									default:
										System.out.println("Try Again With Correct Input...");
								}
							}

						}
					}
					case 3: {
						System.out.println("STUDENT");
						while (true) {
							int st = get_number();
							if (st == 0) {
								System.out.println("Exiting Operation...");
								break;
							} else {
								s[stdnt] = new Student();
								Scanner sc_s = new Scanner(System.in);
								switch (st) {
									case 1: {
										System.out.println("Add Record to Student");
										System.out.println("Enter Student ID:");
										s[stdnt].setStudentId(sc_s.nextInt());
										System.out.println("Enter Student Name:");
										s[stdnt].setStudentName(sc_s.next());
										System.out.println("Enter Student's Birth Date:");
										s[stdnt].setDOB(sc_s.next());
										System.out.println("Enter Student's Mobile No. :");
										s[stdnt].setS_Mobile(sc_s.nextLong());
										System.out.println("Enter Student's Email :");
										s[stdnt].setS_email(sc_s.next());
										System.out.println("Student Address:");
										s[stdnt].setS_address(sc_s.next());
										System.out.println("Successfully Entered");
										stdnt++;
									}
									case 2: {
										System.out.println("Deleting Record from Student");
										int sId = o_num.nextInt();
										boolean checker = false;
										for (int i = 0; i < s.length; i++) {
											if (s[i] == null) {
												continue;
											}
											if (s[i].getStudentId() == sId) {
												s[i] = null;
												System.out.println("Record Deleted");
												checker = true;
											}
											if (checker) {
												break;
											}
										}
										if (!checker) {
											System.out.print("The given is not in data. Try Again By Choosing Task:");
										}
									}
									case 3: {
										System.out.println("Displaying data from Student");
										for (Enhance.Student Student : s) {
											if (Student == null) {
												continue;
											}
											Student.display();
											System.out.println("---------------------------------");
										}
									}
										break;
									default:
										System.out.println("Try Again with correct Input...");
								}

							}
						}
					}
					case 4: {
						System.out.println("EDUCATOR");
						while (true) {
							int edctr = get_number();
							if (edctr == 0) {
								System.out.println("Exiting Operation...");
								break;
							} else {
								e[ed] = new Educator();
								Scanner sc_e = new Scanner(System.in);
								switch (edctr) {
									case 1: {
										System.out.println("Adding Record to Student");
										System.out.println("Enter Educator ID:");
										e[ed].setEducatorId(sc_e.nextInt());
										System.out.println("Enter Educator Name:");
										e[ed].setEducatorName(sc_e.next());
										System.out.println("Enter Educator Address:");
										e[ed].setaddress(sc_e.next());
										System.out.println("Enter Educator Email:");
										e[ed].setEmail(sc_e.next());
										System.out.println("Enter Educator Experience:");
										e[ed].setExperience(sc_e.next());
										ed++;
									}
									case 2: {
										System.out.println("Deleting Record from Educator");
										System.out.println("Write the Educator Id, where you want to delete");
										int edId = o_num.nextInt();
										boolean checker = false;
										for (int i = 0; i < e.length; i++) {
											if (e[i] == null) {
												continue;
											}
											if (e[i].getEducatorId() == edId)
												;
											e[i] = null;
											System.out.println("Record Deleted.");
											checker = true;
										}
										if (checker) {
											break;
										}
										if (!checker) {
											System.out.print(
													"The given record is not in data. Try Again by Choosing Task: ");
										}
									}
									case 3: {
										System.out.println("Displaying Data from Educator");
										for (Educator Educator : e) {
											if (Educator == null) {
												continue;
											}
											Educator.display();
											System.out.println("--------------------------------");
										}
									}
										break;
									default:
										System.out.println("Try Again with Correct Input...");
								}

							}
						}
					}
					case 5: {
						System.out.println("PAYMENT");
						while (true) {
							int paymnt = get_number();
							if (paymnt == 0) {
								System.out.println("Exiting Operation...");
								break;
							} else {
								p[pymt] = new Payment();
								Scanner sc_pay = new Scanner(System.in);
								switch (paymnt) {
									case 1: {
										System.out.println("Adding Record to Student");
										System.out.println("Enter Payment Id: ");
										p[pymt].setpaymentId(sc_pay.nextInt());
										System.out.println("Enter Amount: ");
										p[pymt].setAmount(sc_pay.nextInt());
										System.out.println("Enter Payment Mode: ");
										p[pymt].setpaymentMode(sc_pay.next());
										System.out.println("Enter Username: ");
										p[pymt].setusername(sc_pay.next());
										System.out.println("Enter Password: ");
										p[pymt].setpassword(sc_pay.next());
										System.out.println("Enter Course Name: ");
										p[pymt].setCourseName(sc_pay.next());
										pymt++;

									}
									case 2: {
										System.out.println("Deleting Record from Payment");
										System.out.println("Write the Payment Id, you want to delete:");
										int p_id = o_num.nextInt();
										boolean checker = false;
										for (int i = 0; i < p.length; i++) {
											if (p[i] == null) {
												continue;
											}
											if (p[i].getpaymentId() == p_id) {
												p[i] = null;
												System.out.println("Record Deleted.");
												checker = true;
											}
											if (checker) {
												break;
											}
										}
										if (!checker) {
											System.out.println(
													"The given record is not in data. Try Again By Choosing Task: ");

										}
									}
									case 3: {
										System.out.println("Displaying Record from Payment");
										for (Enhance.Payment Payment : p) {
											if (Payment == null) {
												continue;
											}
											Payment.display();
											System.out.println("---------------------------------------");
										}
									}
										break;
									default:
										System.out.println("Try Again With Correct Input...");
								}
							}
						}

					}
					case 6: {
						System.out.println("TEST");
						while (true) {
							int tst = get_number();
							if (tst == 0) {
								System.out.println("Exiting Operation...");
								break;
							} else {
								t[testt] = new Test();
								Scanner sc_t = new Scanner(System.in);
								switch (tst) {
									case 1: {
										System.out.println("Adding record to Test");
										System.out.println("Enter Test Id: ");
										t[testt].setTestId(sc_t.nextInt());
										System.out.println("Enter Username: ");
										t[testt].setusername(sc_t.next());
										System.out.println("Enter password: ");
										t[testt].setpassword(sc_t.next());
										testt++;
									}
									case 2: {
										System.out.println("Deleting Record from Test ");
										System.out.println("Write the Test Id, Where you want to delete");
										int t_id = o_num.nextInt();
										boolean checker = false;
										for (int i = 0; i < t.length; i++) {
											if (t[i] == null) {
												continue;
											}
											if (t[i].getTestId() == t_id) {
												t[i] = null;
												System.out.println("Record Deleted. ");
												checker = true;
											}
											if (checker) {
												break;
											}
										}
										if (!checker) {
											System.out.println(
													"The given record is not in data. Try Again With Choosing Task:");
										}
									}
									case 3: {
										System.out.println("Displaying Data from Test");
										for (Enhance.Test Test : t) {
											if (Test == null) {
												continue;
											}
											Test.display();
											System.out.println("-------------------------------------");
										}
									}
										break;
									default:
										System.out.println("Try Again By Choosing Correct Input...");
								}
							}
						}
					}
					case 7: {
						System.out.println("RESULT");
						while (true) {
							int rst = get_number();
							if (rst == 0) {
								System.out.println("Exiting Operation...");
								break;
							} else {
								r[rslt] = new Result();
								Scanner sc_r = new Scanner(System.in);
								switch (rst) {
									case 1: {
										System.out.println("Adding Record To result");
										System.out.println("Enter result Id: ");
										r[rslt].setResultId(sc_r.nextInt());
										System.out.println("Enter Score: ");
										r[rslt].setScore(sc_r.nextInt());
										System.out.println("Enter Student Id: ");
										r[rslt].setStudentId(sc_r.nextInt());
										rslt++;
									}
									case 2: {
										System.out.println("Deleting Record from Test");
										System.out.println("Write the Test Id, Where you want to delete");
										int r_id = o_num.nextInt();
										boolean checker = false;
										for (int i = 0; i < r.length; i++) {
											if (r[i] == null) {
												continue;
											}
											if (r[i].getResultId() == r_id) {
												r[i] = null;
												System.out.println("Record Deleted.");
												checker = true;
											}
											if (checker) {
												break;
											}

										}
										if (!checker) {
											System.out.println(
													"The given record is not in data. Try Again With Choosing Task...");
										}

									}
									case 3: {
										System.out.println("Displaying Data from result");
										for (Enhance.Result Result : r) {
											if (Result == null) {
												continue;
											}
											Result.display();
											System.out.println("-------------------------------------");

										}
									}
										break;
									default:
										System.out.println("Try Again By Choosing Correct Input...");
								}
							}

						}
					}
				}
			}
		}

	}
}

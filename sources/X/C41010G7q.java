package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.G7q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41010G7q {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C41011G7r.LJLIL);

    public static String LIZIZ() {
        String uid;
        C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public static Keva LIZJ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static int LIZ() {
        Keva LIZJ = LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("change_post_visibility_status_");
        LIZ2.append(LIZIZ());
        return LIZJ.getInt(X1D.LIZIZ(LIZ2), 0);
    }

    public static int LIZLLL() {
        Keva LIZJ = LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("post_visibility_sub_only_");
        LIZ2.append(LIZIZ());
        return LIZJ.getInt(X1D.LIZIZ(LIZ2), -1);
    }

    public static void LJ(String str, boolean z) {
        String str2;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("enter_from", "video_post_page");
        if (z) {
            str2 = "show";
        } else {
            str2 = "click";
        }
        oszArr[1] = new OSZ("action_type", str2);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (str != null && str.length() != 0) {
            LJJLIIIIJ.put("click_type", str);
        }
        FMX.LJIIL("video_visibility_popup_page", LJJLIIIIJ);
    }

    public static void LJFF(Activity activity, boolean z, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        int LIZIZ;
        boolean z2;
        boolean z3;
        String string;
        String LIZIZ2;
        String LIZIZ3;
        if (activity == null) {
            interfaceC65784Pro2.invoke();
            return;
        }
        if (z) {
            LIZIZ = 4;
        } else {
            LIZIZ = G9D.LIZIZ();
        }
        Keva LIZJ = LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initial_permission_enter_publish_page_");
        LIZ2.append(LIZIZ());
        int i = LIZJ.getInt(X1D.LIZIZ(LIZ2), -1);
        if (C41012G7s.LIZ() || (!z ? LIZIZ != i || LIZLLL() == 4 : LIZIZ != i || LIZLLL() != 4)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (LIZ() == 1) {
                if (LIZIZ == 1) {
                    LIZIZ2 = activity.getString(R.string.cpy);
                    o.LJIIIIZZ(LIZIZ2, "activity.getString(R.str…sibility_pop_up_me_title)");
                    LIZIZ3 = activity.getString(R.string.cpx);
                    o.LJIIIIZZ(LIZIZ3, "activity.getString(R.str…isibility_pop_up_me_desc)");
                } else {
                    C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
                    if (currentUser != null) {
                        z3 = currentUser.LJIILIIL();
                    } else {
                        z3 = false;
                    }
                    if (LIZIZ != 0) {
                        if (LIZIZ != 2) {
                            if (LIZIZ != 4) {
                                string = "";
                            } else {
                                string = activity.getString(R.string.ruf);
                            }
                        } else {
                            string = activity.getString(R.string.cq0);
                        }
                    } else if (z3) {
                        string = activity.getString(R.string.cq2);
                    } else {
                        string = activity.getString(R.string.cpz);
                    }
                    o.LJIIIIZZ(string, "when (lastChangedPermiss… \"\"\n                    }");
                    String string2 = activity.getString(R.string.cq3);
                    o.LJIIIIZZ(string2, "activity.getString(R.str…_visibility_pop_up_title)");
                    LIZIZ2 = Q8U.LIZIZ(new Object[]{string}, 1, string2, "format(format, *args)");
                    String string3 = activity.getString(R.string.cpw);
                    o.LJIIIIZZ(string3, "activity.getString(R.str…t_visibility_pop_up_desc)");
                    LIZIZ3 = Q8U.LIZIZ(new Object[]{string, string}, 2, string3, "format(format, *args)");
                }
                C26227ARb LIZ3 = C3AW.LIZ(activity);
                LIZ3.LJFF(LIZIZ2);
                LIZ3.LIZIZ(LIZIZ3);
                UC0.LIZJ(LIZ3, new AqS111S0300000_7(activity, (Activity) interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 5));
                LIZ3.LIZLLL(G7R.LJLIL);
                LIZ3.LJII = false;
                LIZ3.LJI().LIZLLL();
                return;
            }
        } else if (LIZ() != 2) {
            Keva LIZJ2 = LIZJ();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("change_post_visibility_status_");
            LIZ4.append(LIZIZ());
            LIZJ2.storeInt(X1D.LIZIZ(LIZ4), 1);
            if (z) {
                Keva LIZJ3 = LIZJ();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("post_visibility_sub_only_");
                LIZ5.append(LIZIZ());
                LIZJ3.storeInt(X1D.LIZIZ(LIZ5), 4);
            } else {
                Keva LIZJ4 = LIZJ();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("post_visibility_sub_only_");
                LIZ6.append(LIZIZ());
                LIZJ4.storeInt(X1D.LIZIZ(LIZ6), -1);
            }
        }
        interfaceC65784Pro2.invoke();
    }
}

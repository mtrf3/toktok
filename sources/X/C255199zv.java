package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ujb.o;

/* renamed from: X.9zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C255199zv {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJFF;
    public static int LJI;
    public static boolean LJII;
    public static final ArrayList<C9YH> LIZ = new ArrayList<>();
    public static String LIZIZ = "output";
    public static String LJ = "";

    public static ArrayList LIZJ() {
        ArrayList<C9YH> arrayList = LIZ;
        arrayList.clear();
        if (!LJIIIZ()) {
            arrayList.add(new C9YH(R.raw.icon_camera, R.string.hgh, R.string.hgg, R.string.hge, true));
        }
        if (!LJII()) {
            arrayList.add(new C9YH(R.raw.icon_person, R.string.hgd, R.string.hgc, R.string.hga, true));
        }
        if (LJIIJJI() && !LJIIIIZZ()) {
            arrayList.add(new C9YH(R.raw.icon_phone, R.string.c9t, R.string.c9s, R.string.c9q, true));
        }
        if (!LIZ()) {
            arrayList.add(new C9YH(R.raw.icon_pen_on_doc, R.string.hg_, R.string.hg9, R.string.hg7, true));
        }
        if (LJIIIZ()) {
            arrayList.add(new C9YH(R.raw.icon_camera, R.string.hgh, R.string.hgg, R.string.hgf, false));
        }
        if (LJII()) {
            arrayList.add(new C9YH(R.raw.icon_person, R.string.hgd, R.string.hgc, R.string.hgb, false));
        }
        if (LJIIJJI() && LJIIIIZZ()) {
            arrayList.add(new C9YH(R.raw.icon_phone, R.string.c9t, R.string.c9s, R.string.c9r, false));
        }
        if (LIZ()) {
            arrayList.add(new C9YH(R.raw.icon_pen_on_paper, R.string.hg_, R.string.hg9, R.string.hg8, false));
        }
        return arrayList;
    }

    public static boolean LIZ() {
        String str;
        User LJ2 = LJ();
        if (LJ2 != null) {
            str = LJ2.getSignature();
        } else {
            str = null;
        }
        if (o.LJJJJIZL(str, "", false)) {
            return false;
        }
        return true;
    }

    public static int LIZLLL() {
        User LJ2 = LJ();
        if (LJ2 != null) {
            return LJ2.getCompleteProfileGuideStrategy();
        }
        return 0;
    }

    public static User LJ() {
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            return ((RBX) LJIILL).getCurUser();
        }
        return null;
    }

    public static int LJFF() {
        boolean LJIIIZ = LJIIIZ();
        boolean LIZ2 = LIZ();
        int i = (LJII() ? 1 : 0) + (LIZ2 ? 1 : 0) + (LJIIIZ ? 1 : 0);
        if (LJIIJJI()) {
            return i + (LJIIIIZZ() ? 1 : 0);
        }
        return i;
    }

    public static boolean LJII() {
        List<String> list;
        User LJ2 = LJ();
        if (LJ2 == null || (list = LJ2.boldFields) == null || !list.contains("nickname")) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ() {
        User LJ2 = LJ();
        if (LJ2 != null) {
            return LJ2.isPhoneBinded();
        }
        return true;
    }

    public static boolean LJIIIZ() {
        List<String> list;
        List<String> list2;
        User LJ2 = LJ();
        if (LJ2 == null || (list2 = LJ2.boldFields) == null || !list2.contains("photo")) {
            User LJ3 = LJ();
            if (LJ3 == null || (list = LJ3.boldFields) == null || !list.contains("video")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LJIIJJI() {
        if (LIZLLL() == 4 || LIZLLL() == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (((X.C255219zx.LIZ().showFreqInHour * 3600000) + new X.C255179zt().LIZ().LIZJ.getLong("last_show_time", 0)) >= java.lang.System.currentTimeMillis()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIL() {
        /*
            boolean r0 = LJIIJJI()
            r7 = 0
            if (r0 == 0) goto L88
            boolean r0 = LJIIIIZZ()
            if (r0 != 0) goto L88
            X.9zt r0 = new X.9zt
            r0.<init>()
            X.9zt r0 = r0.LIZ()
            com.bytedance.keva.Keva r0 = r0.LIZJ
            java.lang.String r6 = "click_delete_icon_times"
            int r3 = r0.getInt(r6, r7)
            com.ss.android.ugc.aweme.profile.experiment.GuideUserBindPhoneNumberConfig r0 = X.C255219zx.LIZ()
            int r0 = r0.clickDeleteIconMaxTimes
            r1 = 0
            java.lang.String r5 = "last_show_time"
            if (r3 >= r0) goto L4d
            X.9zt r0 = new X.9zt
            r0.<init>()
            X.9zt r0 = r0.LIZ()
            com.bytedance.keva.Keva r0 = r0.LIZJ
            long r10 = r0.getLong(r5, r1)
            com.ss.android.ugc.aweme.profile.experiment.GuideUserBindPhoneNumberConfig r0 = X.C255219zx.LIZ()
            int r0 = r0.showFreqInHour
            long r8 = (long) r0
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r8 * r3
            long r8 = r8 + r10
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L87
        L4d:
            X.9zt r0 = new X.9zt
            r0.<init>()
            X.9zt r0 = r0.LIZ()
            com.bytedance.keva.Keva r0 = r0.LIZJ
            int r3 = r0.getInt(r6, r7)
            com.ss.android.ugc.aweme.profile.experiment.GuideUserBindPhoneNumberConfig r0 = X.C255219zx.LIZ()
            int r0 = r0.clickDeleteIconMaxTimes
            if (r3 < r0) goto L88
            X.9zt r0 = new X.9zt
            r0.<init>()
            X.9zt r0 = r0.LIZ()
            com.bytedance.keva.Keva r0 = r0.LIZJ
            long r5 = r0.getLong(r5, r1)
            com.ss.android.ugc.aweme.profile.experiment.GuideUserBindPhoneNumberConfig r0 = X.C255219zx.LIZ()
            int r0 = r0.hideFreqInDay
            long r3 = (long) r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 * r0
            long r3 = r3 + r5
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L88
        L87:
            r7 = 1
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255199zv.LJIIL():boolean");
    }

    public static boolean LJIILIIL() {
        if (AV1.LJIIJJI() || LIZ() || LJII() || LJIIIZ()) {
            return false;
        }
        if (LIZLLL() != 1 && !LJIIJJI() && LIZLLL() != 2 && LIZLLL() != 3) {
            return false;
        }
        return true;
    }

    public static boolean LJIILL() {
        if (AV1.LJIIJJI()) {
            return false;
        }
        if (LIZLLL() == 0) {
            return true;
        }
        if (LIZLLL() != 1 && !LJIIJJI()) {
            if (LIZLLL() == 2) {
                if (!LIZ() || !LJII() || !LJIIIZ()) {
                    return false;
                }
                return true;
            }
            if (LIZLLL() == 3) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(User user, String... types) {
        kotlin.jvm.internal.o.LJIIIZ(types, "types");
        if (LJIIJ(user, (String[]) Arrays.copyOf(types, types.length))) {
            return "edit";
        }
        return "add";
    }

    public static boolean LJIIJ(User user, String... types) {
        kotlin.jvm.internal.o.LJIIIZ(types, "types");
        for (String str : types) {
            if (user != null && user.boldFields != null && user.boldFields.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILJJIL(int i, ActivityC45651qj context) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        if (!C2NU.LIZ.LIZIZ()) {
            return false;
        }
        LJI = i;
        if (i > 3 || AV1.LJIIJJI()) {
            return false;
        }
        if (!LJIIJJI() ? !(!LIZ() || !LJII() || !LJIIIZ()) : !(!LIZ() || !LJIIIIZZ() || !LJII() || !LJIIIZ())) {
            return false;
        }
        if (LIZLLL() == 1 || LJIIJJI() || LIZLLL() == 2) {
            return true;
        }
        if (LIZLLL() != 3 || i == 0) {
            return false;
        }
        return true;
    }

    public static Bundle LJI(User user, String str, String... strArr) {
        Bundle bundle = new Bundle();
        String LIZIZ2 = LIZIZ(user, (String[]) Arrays.copyOf(strArr, strArr.length));
        bundle.putString("enter_method", str);
        bundle.putString("btn_name", LIZIZ2);
        return bundle;
    }
}

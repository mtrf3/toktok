package X;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.internal.o;

/* renamed from: X.Ltm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55714Ltm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(ActivityC45651qj activityC45651qj) {
        if (L10.LIZ() && C77266UUc.LIZIZ.LJIILLIIL().LIZJ() && o.LJ(LIZJ(activityC45651qj), "For You")) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj), C78613UtF.LIZJ, null, new C70682q0(activityC45651qj, null), 2);
        }
    }

    public static String LIZJ(ActivityC45651qj activityC45651qj) {
        for (String str : C7NX.LIZ) {
            if (com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).vv0(str)) {
                return str;
            }
        }
        return null;
    }

    public static String LIZLLL(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1525083535) {
            if (hashCode != -1309089240) {
                if (hashCode == 984907784 && str.equals("For You")) {
                    return "homepage_hot";
                }
            } else if (str.equals("FRIENDS_FEED")) {
                return "homepage_friends";
            }
        } else if (str.equals("Following")) {
            return "homepage_follow";
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.ActivityC45651qj r10, com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            java.lang.String r0 = "activity"
            r9 = r10
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            boolean r0 = X.C59522Vg.LIZ()
            r4 = 0
            if (r0 == 0) goto L1d
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r9)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.Lto r1 = new X.Lto
            r1.<init>(r9, r11, r4)
            r0 = 2
            X.XKX.LIZLLL(r3, r2, r4, r1, r0)
        L1c:
            return
        L1d:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "is_start_by_login"
            r5 = 0
            boolean r0 = r1.getBooleanExtra(r0, r5)
            r4 = 1
            if (r0 != 0) goto L3b
            java.lang.String r0 = "from_new_user_journey"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "is_start_by_switch_account"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L91
        L3b:
            r3 = 1
        L3c:
            X.UUc r6 = X.C77266UUc.LIZIZ
            X.UQA r0 = r6.LIZLLL()
            boolean r2 = r0.LIZIZ()
            if (r11 == 0) goto L54
            boolean r0 = X.C63081OpJ.LLIIII(r11)
            if (r0 != 0) goto L54
            boolean r0 = r11.isAd()
            if (r0 == 0) goto L8f
        L54:
            r0 = 1
        L55:
            java.lang.String r1 = LIZJ(r9)
            if (r3 != 0) goto L63
            if (r0 != 0) goto L63
            if (r2 != 0) goto L63
            boolean r0 = X.C57122Ma.LIZ
            if (r0 != 0) goto L6b
        L63:
            X.UQA r0 = r6.LIZLLL()
            r0.LIZLLL()
            goto L1c
        L6b:
            X.UQF r7 = r6.LJJIJIIJIL(r4, r5)
            boolean r0 = r7.LJLIL
            if (r0 != 0) goto L77
            boolean r0 = r7.LJLILLLLZI
            if (r0 == 0) goto L8b
        L77:
            if (r1 == 0) goto L8b
            java.lang.String r8 = LIZLLL(r1)
            X.Ltn r10 = new X.Ltn
            r10.<init>(r9)
            r11 = 16
            X.C54149LMz.LIZ(r6, r7, r8, r9, r10, r11)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L63
        L8b:
            LIZIZ(r9)
            goto L63
        L8f:
            r0 = 0
            goto L55
        L91:
            r3 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55714Ltm.LIZ(X.1qj, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}

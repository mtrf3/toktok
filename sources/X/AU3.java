package X;

import Y.ARunnableS8S0400000_4;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AU3 {
    public static final /* synthetic */ int LIZ = 0;

    public static UrlModel LJ(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
            return null;
        }
        return urlModel;
    }

    public static OSZ LIZLLL(User user, AU7 au7) {
        int i;
        if (au7 == null || (i = AU6.LIZ[au7.ordinal()]) == -1 || i == 1) {
            if (LJ(user.getAvatarMedium()) != null) {
                return new OSZ(user.getAvatarMedium(), AU5.AVATAR_MEDIUM);
            }
            if (LJ(user.getAvatarThumb()) != null) {
                return new OSZ(user.getAvatarThumb(), AU5.AVATAR_THUMB);
            }
            if (LJ(user.getAvatarLarger()) != null) {
                return new OSZ(user.getAvatarLarger(), AU5.AVATAR_LARGE);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C71799SFv r4, X.AU2 r5, java.lang.Object r6) {
        /*
            r2 = 0
            if (r5 == 0) goto L6d
            X.AU7 r3 = r5.LIZIZ
            X.APV r1 = r5.LIZJ
        L7:
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.profile.model.User
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.profile.model.User r6 = (com.ss.android.ugc.aweme.profile.model.User) r6
            if (r1 != 0) goto L11
            X.APT r1 = X.APT.LIZIZ
        L11:
            boolean r0 = r1 instanceof X.APT
            if (r0 == 0) goto L1c
            X.OSZ r3 = LIZLLL(r6, r3)
        L19:
            if (r3 != 0) goto L8f
        L1b:
            return
        L1c:
            boolean r0 = r1 instanceof X.APU
            if (r0 == 0) goto Lb5
            X.APU r1 = (X.APU) r1
            X.Pro<java.lang.Boolean> r0 = r1.LIZIZ
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L33
            goto L1b
        L33:
            X.Ynr<java.lang.Object, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.Boolean> r1 = r1.LIZJ
            X.OSZ r0 = LIZLLL(r6, r3)
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r0.getFirst()
        L3f:
            java.lang.Object r0 = r1.invoke(r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            X.OSZ r3 = LIZLLL(r6, r3)
            if (r3 != 0) goto L8f
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarVideoUri()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = LJ(r0)
            if (r0 != 0) goto L80
            goto L1b
        L5c:
            r0 = r2
            goto L3f
        L5e:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarVideoUri()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = LJ(r0)
            if (r0 != 0) goto L70
            X.OSZ r3 = LIZLLL(r6, r3)
            goto L19
        L6d:
            r3 = r2
            r1 = r2
            goto L7
        L70:
            X.OSZ r3 = new X.OSZ
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarVideoUri()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = LJ(r0)
            X.AU5 r0 = X.AU5.AVATAR_VIDEO
            r3.<init>(r1, r0)
            goto L8f
        L80:
            X.OSZ r3 = new X.OSZ
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarVideoUri()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = LJ(r0)
            X.AU5 r0 = X.AU5.AVATAR_VIDEO
            r3.<init>(r1, r0)
        L8f:
            java.lang.Object r0 = r3.getFirst()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            if (r0 != 0) goto L98
            return
        L98:
            X.2cu r1 = new X.2cu
            java.util.List r0 = r0.getUrlList()
            r1.<init>(r0)
            if (r5 == 0) goto Lab
            X.APV r0 = r5.LIZJ
            if (r0 == 0) goto Lab
            X.Yns r2 = r0.LIZ()
        Lab:
            java.lang.Object r0 = r3.getSecond()
            X.AU5 r0 = (X.AU5) r0
            LIZJ(r4, r1, r0, r2)
            return
        Lb5:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU3.LIZIZ(X.SFv, X.AU2, java.lang.Object):void");
    }

    public static void LIZ(C71799SFv view, Object data, AU5 au5, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(data, "data");
        C71799SFv.LJIIJ(view, data, "AvatarImageBindHelper", false, new AU4(new C72242sW(), interfaceC88472Yns, au5), 54);
    }

    public static void LIZJ(C71799SFv c71799SFv, C62562cu c62562cu, AU5 au5, InterfaceC88472Yns interfaceC88472Yns) {
        if (((Boolean) C26312AUi.LIZIZ.getValue()).booleanValue()) {
            C37179EiV.LIZJ(false).execute(new ARunnableS8S0400000_4(c71799SFv, c62562cu, au5, interfaceC88472Yns, 5));
        } else {
            LIZ(c71799SFv, c62562cu, au5, interfaceC88472Yns);
        }
    }
}

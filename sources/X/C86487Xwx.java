package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Xwx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86487Xwx {
    public static final List<Integer> LIZ = C47261Igj.LJJIJIL(Integer.valueOf(R.layout.ba_), Integer.valueOf(R.layout.baf), Integer.valueOf(R.layout.bab), Integer.valueOf(R.layout.bac), Integer.valueOf(R.layout.bad), Integer.valueOf(R.layout.baa), Integer.valueOf(R.layout.bae), Integer.valueOf(R.layout.ba9));

    public static void LIZ(InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        String str;
        String str2;
        String topImageUrl;
        String str3;
        String str4;
        String str5;
        List<String> avatarUrls;
        List<String> avatarUrls2;
        boolean z = true;
        if (((Boolean) C53334KwU.LIZIZ.getValue()).booleanValue() && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            List<String> avatarUrls3 = uiTemplate.getAvatarUrls();
            if ((avatarUrls3 != null && !avatarUrls3.isEmpty()) || C78857UxB.LJJJIL(uiTemplate.getAvatarRightLabelUrl()) || C78857UxB.LJJJIL(uiTemplate.getRightImageUrl()) || C78857UxB.LJJJIL(uiTemplate.getTopImageUrl())) {
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                C86478Xwo.LIZ("InnerPushViewPreload", "preloadImage enter");
                String str6 = null;
                if (uiTemplate2 != null && (avatarUrls2 = uiTemplate2.getAvatarUrls()) != null && !avatarUrls2.isEmpty()) {
                    z = false;
                }
                String str7 = "";
                if (!z) {
                    C72242sW c72242sW = new C72242sW();
                    c72242sW.element = System.currentTimeMillis();
                    C86478Xwo.LIZ("InnerPushViewPreload", "preloadImage avatarUrls");
                    if (uiTemplate2 == null || (avatarUrls = uiTemplate2.getAvatarUrls()) == null || (str5 = (String) ListProtector.get(avatarUrls, 0)) == null) {
                        str5 = "";
                    }
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str5);
                    LJIIIIZZ.LIZJ = C84763XOl.LJIIIIZZ();
                    LJIIIIZZ.LJIIIZ(new C86488Xwy(innerPushMessage, c72242sW, uiTemplate2));
                }
                if (uiTemplate2 != null) {
                    str = uiTemplate2.getAvatarRightLabelUrl();
                } else {
                    str = null;
                }
                if (C78857UxB.LJJJIL(str)) {
                    C86478Xwo.LIZ("InnerPushViewPreload", "preloadImage avatarRightLabelUrl");
                    C72242sW c72242sW2 = new C72242sW();
                    c72242sW2.element = System.currentTimeMillis();
                    if (uiTemplate2 == null || (str4 = uiTemplate2.getAvatarRightLabelUrl()) == null) {
                        str4 = "";
                    }
                    W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str4);
                    LJIIIIZZ2.LIZJ = C84763XOl.LJIIIIZZ();
                    LJIIIIZZ2.LJIIIZ(new C86489Xwz(innerPushMessage, c72242sW2, uiTemplate2));
                }
                if (uiTemplate2 != null) {
                    str2 = uiTemplate2.getRightImageUrl();
                } else {
                    str2 = null;
                }
                if (C78857UxB.LJJJIL(str2)) {
                    C86478Xwo.LIZ("InnerPushViewPreload", "preloadImage rightImageUrl");
                    C72242sW c72242sW3 = new C72242sW();
                    c72242sW3.element = System.currentTimeMillis();
                    if (uiTemplate2 == null || (str3 = uiTemplate2.getRightImageUrl()) == null) {
                        str3 = "";
                    }
                    W5F LJIIIIZZ3 = W5U.LJIIIIZZ(str3);
                    LJIIIIZZ3.LIZJ = C84763XOl.LJIIIIZZ();
                    LJIIIIZZ3.LJIIIZ(new C86490Xx0(innerPushMessage, c72242sW3, uiTemplate2));
                }
                if (uiTemplate2 != null) {
                    str6 = uiTemplate2.getTopImageUrl();
                }
                if (C78857UxB.LJJJIL(str6)) {
                    C86478Xwo.LIZ("InnerPushViewPreload", "preloadImage topImageUrl");
                    C72242sW c72242sW4 = new C72242sW();
                    c72242sW4.element = System.currentTimeMillis();
                    if (uiTemplate2 != null && (topImageUrl = uiTemplate2.getTopImageUrl()) != null) {
                        str7 = topImageUrl;
                    }
                    W5F LJIIIIZZ4 = W5U.LJIIIIZZ(str7);
                    LJIIIIZZ4.LIZJ = C84763XOl.LJIIIIZZ();
                    LJIIIIZZ4.LJIIIZ(new C86491Xx1(innerPushMessage, c72242sW4, uiTemplate2));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r8) {
        /*
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r0 = r8.getUiTemplate()
            r7 = 0
            if (r0 != 0) goto L8
            return r7
        L8:
            X.Ol8 r0 = X.C53334KwU.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 == 0) goto L78
            X.XxD r0 = r8.getTracker()
            int r0 = r0.LJJJI
            if (r0 != r3) goto L20
            return r3
        L20:
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r6 = r8.getUiTemplate()
            if (r6 == 0) goto L78
            java.util.List r0 = r6.getAvatarUrls()
            if (r0 == 0) goto L32
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L76
        L32:
            r0 = 1
        L33:
            r4 = 0
            if (r0 != 0) goto L41
            X.XxD r0 = r8.getTracker()
            long r1 = r0.LJII
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L74
        L41:
            r2 = 1
        L42:
            java.lang.String r0 = r6.getAvatarRightLabelUrl()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L59
            if (r2 == 0) goto L72
            X.XxD r0 = r8.getTracker()
            long r1 = r0.LJIIIIZZ
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L72
            r2 = 1
        L59:
            java.lang.String r0 = r6.getRightImageUrl()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L79
            if (r2 == 0) goto L70
            X.XxD r0 = r8.getTracker()
            long r1 = r0.LJIIIZ
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L70
            r7 = 1
        L70:
            r2 = r7
            goto L79
        L72:
            r2 = 0
            goto L59
        L74:
            r2 = 0
            goto L42
        L76:
            r0 = 0
            goto L33
        L78:
            r2 = 1
        L79:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "preloadPicCompleted onCompleted:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ...."
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "InnerPushViewPreload"
            X.C86478Xwo.LIZ(r0, r1)
            if (r2 == 0) goto L9b
            X.XxD r0 = r8.getTracker()
            r0.LJJJI = r3
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86487Xwx.LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    public static boolean LIZJ(InnerPushMessage innerPushMessage) {
        if (C53334KwU.LIZIZ()) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && C57419MgB.LJ(LJIIIIZZ) != null) {
                Iterator<Integer> it = LIZ.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    boolean LIZ2 = C16970lZ.LIZ(intValue, C84763XOl.LJIIIIZZ());
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("preloadXmlCompleted id:");
                    LIZ3.append(intValue);
                    LIZ3.append(" hasCacheView:");
                    LIZ3.append(LIZ2);
                    C86478Xwo.LIZ("InnerPushViewPreload", X1D.LIZIZ(LIZ3));
                    if (!LIZ2) {
                        return false;
                    }
                }
            }
            innerPushMessage.getTracker().LJJJ = 1;
        }
        return true;
    }
}

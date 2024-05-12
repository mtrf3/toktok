package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.IpE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47788IpE implements InterfaceC47892Iqu {
    public final /* synthetic */ C47780Ip6 LIZ;

    public C47788IpE(C47780Ip6 c47780Ip6) {
        this.LIZ = c47780Ip6;
    }

    public final void LIZ(C47789IpF c47789IpF, String str) {
        if (c47789IpF != null) {
            String str2 = c47789IpF.LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get token return error code: ");
            LIZ.append(c47789IpF.LIZ);
            LIZ.append(", internal:");
            LIZ.append(c47789IpF.LIZIZ);
            LIZ.append(", description:");
            LIZ.append(c47789IpF.LIZLLL);
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ));
            if (!str2.contains("Canceled")) {
                C47780Ip6 c47780Ip6 = this.LIZ;
                c47780Ip6.LJI.sendMessage(c47780Ip6.LJI.obtainMessage(1, c47789IpF));
                return;
            }
            return;
        }
        C47780Ip6 c47780Ip62 = this.LIZ;
        if (c47780Ip62.LIZIZ == null) {
            return;
        }
        try {
            if (c47780Ip62.LIZ == null) {
                c47780Ip62.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            this.LIZ.LIZ.getDeclaredMethod("processTokenComplete", String.class).invoke(this.LIZ.LIZIZ, str);
        } catch (ClassNotFoundException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("class not found:");
            LIZ2.append(e.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ2));
        } catch (IllegalAccessException e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("method invoke failied:");
            LIZ3.append(e2.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ3));
        } catch (NoSuchMethodException e3) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("method not found:");
            LIZ4.append(e3.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ4));
        } catch (InvocationTargetException e4) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("method invoke failied:");
            LIZ5.append(e4.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ5));
        }
    }
}

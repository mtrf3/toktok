package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Ip6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47780Ip6 {
    public Class<?> LIZ;
    public Object LIZIZ;
    public Object LIZJ;
    public Object LIZLLL;
    public final C47985IsP LJ = new C47985IsP();
    public C47858IqM LJFF;
    public HandlerC47771Iox LJI;

    public final void LIZJ() {
        TTVideoEngineLog.d("IntertrustDrmHelper", "stop enter");
        if (this.LIZIZ == null) {
            return;
        }
        try {
            if (this.LIZ == null) {
                this.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            ((Integer) this.LIZ.getDeclaredMethod("stop", new Class[0]).invoke(this.LIZIZ, new Object[0])).intValue();
        } catch (ClassNotFoundException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("class not found:");
            LIZ.append(e.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ));
        } catch (IllegalAccessException e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("method invoke failied:");
            LIZ2.append(e2.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ2));
        } catch (NoSuchMethodException e3) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("method not found:");
            LIZ3.append(e3.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ3));
        } catch (InvocationTargetException e4) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("method invoke failied:");
            LIZ4.append(e4.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ4));
        }
    }

    public final void LIZIZ(String str) {
        TTVideoEngineLog.d("IntertrustDrmHelper", "setTokenUrlTemplate enter");
        if (this.LIZIZ == null) {
            return;
        }
        try {
            if (this.LIZ == null) {
                this.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            this.LIZ.getDeclaredMethod("setTokenUrlTemplate", String.class).invoke(this.LIZIZ, str);
        } catch (ClassNotFoundException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("class not found:");
            LIZ.append(e.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ));
        } catch (IllegalAccessException e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("method invoke failied:");
            LIZ2.append(e2.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ2));
        } catch (NoSuchMethodException e3) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("method not found:");
            LIZ3.append(e3.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ3));
        } catch (InvocationTargetException e4) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("method invoke failied:");
            LIZ4.append(e4.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ4));
        }
    }

    public final int LIZ(int i, String str, String str2) {
        TTVideoEngineLog.d("IntertrustDrmHelper", "processToken enter");
        if (this.LIZIZ == null) {
            return -1;
        }
        try {
            if (this.LIZ == null) {
                this.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.LIZ.getDeclaredMethod("processToken", Integer.TYPE, String.class, String.class).invoke(this.LIZIZ, Integer.valueOf(i), str, str2)).intValue();
        } catch (ClassNotFoundException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("class not found:");
            LIZ.append(e.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ));
            return -1;
        } catch (IllegalAccessException e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("method invoke failied:");
            LIZ2.append(e2.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ2));
            return -1;
        } catch (NoSuchMethodException e3) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("method not found:");
            LIZ3.append(e3.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ3));
            return -1;
        } catch (InvocationTargetException e4) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("method invoke failied:");
            LIZ4.append(e4.getLocalizedMessage());
            C78253UnR.LIZLLL("IntertrustDrmHelper", X1D.LIZIZ(LIZ4));
            return -1;
        }
    }
}

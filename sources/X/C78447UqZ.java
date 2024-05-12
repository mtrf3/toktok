package X;

import Y.ARunnableS0S1301000_13;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.text.TextUtils;
import defpackage.a1;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.UqZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78447UqZ extends C78448Uqa {
    public final /* synthetic */ GLSurfaceView LJLIL;
    public final /* synthetic */ C78446UqY LJLILLLLZI;

    public C78447UqZ(C78446UqY c78446UqY, GLSurfaceView gLSurfaceView) {
        this.LJLILLLLZI = c78446UqY;
        this.LJLIL = gLSurfaceView;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        String str;
        Activity activity;
        String glGetString = gl10.glGetString(7937);
        String glGetString2 = gl10.glGetString(7936);
        if (!TextUtils.isEmpty(glGetString) && !TextUtils.isEmpty(glGetString2)) {
            str = a1.LJ(glGetString2, " ", glGetString);
        } else {
            str = null;
        }
        try {
            WeakReference<Activity> weakReference = this.LJLILLLLZI.LIZ;
            if (weakReference != null && (activity = weakReference.get()) != null) {
                activity.runOnUiThread(new ARunnableS0S1301000_13(1, this, str, activity, this.LJLIL, 0));
            }
        } catch (Throwable unused) {
        }
        C78446UqY c78446UqY = this.LJLILLLLZI;
        c78446UqY.LIZ = null;
        c78446UqY.LIZIZ = null;
        c78446UqY.LIZJ = null;
    }
}

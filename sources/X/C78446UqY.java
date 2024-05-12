package X;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: X.UqY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78446UqY implements InterfaceC30552Byu {
    public static String LIZLLL;
    public WeakReference<Activity> LIZ;
    public WeakReference<ViewGroup> LIZIZ;
    public WeakReference<InterfaceC30737C4n> LIZJ;

    @Override // X.InterfaceC30552Byu
    public final String LIZ(Context context) {
        String str;
        String str2 = LIZLLL;
        if (str2 != null) {
            return str2;
        }
        if (context != null && (str = (String) C29889BoD.LIZIZ(context).LIZLLL("hardware_info_gpu_name", EnumC29921Boj.STRING, null)) != null) {
            LIZLLL = str;
        }
        return LIZLLL;
    }

    @Override // X.InterfaceC30552Byu
    public final void LIZIZ(ActivityC45651qj activityC45651qj, View view, InterfaceC30737C4n interfaceC30737C4n) {
        String str = LIZLLL;
        if (str != null) {
            interfaceC30737C4n.LIZ(str);
            return;
        }
        if (activityC45651qj == null) {
            return;
        }
        String LIZ = LIZ(activityC45651qj);
        if (LIZ != null) {
            interfaceC30737C4n.LIZ(LIZ);
            return;
        }
        if (!(view instanceof ViewGroup) || this.LIZ != null) {
            return;
        }
        this.LIZ = new WeakReference<>(activityC45651qj);
        ViewGroup viewGroup = (ViewGroup) view;
        this.LIZIZ = new WeakReference<>(viewGroup);
        this.LIZJ = new WeakReference<>(interfaceC30737C4n);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(activityC45651qj);
        gLSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        gLSurfaceView.setRenderer(new C78447UqZ(this, gLSurfaceView));
        gLSurfaceView.setId(View.generateViewId());
        viewGroup.addView(gLSurfaceView);
    }
}

package X;

import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes16.dex */
public final class Y62 extends OrientationEventListener {
    public final /* synthetic */ Y6H LIZ;

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        Y6H y6h = this.LIZ;
        WindowManager windowManager = y6h.LIZIZ;
        Y6V y6v = y6h.LIZLLL;
        if (windowManager != null && y6v != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            Y6H y6h2 = this.LIZ;
            if (rotation != y6h2.LIZ) {
                y6h2.LIZ = rotation;
                Y6I y6i = (Y6I) y6v;
                y6i.LIZ.LJLJI.postDelayed(new ARunnableS51S0100000_15(y6i, 17), 250L);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y62(Y6H y6h, Context context) {
        super(context, 3);
        this.LIZ = y6h;
    }
}

package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.KKq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51540KKq implements W4Z<InterfaceC81599W0t> {
    public final View LIZ;

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LIZJ(String str) {
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
    }

    public C51540KKq(C62846OlW c62846OlW) {
        this.LIZ = c62846OlW;
    }

    @Override // X.W4Z
    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
    }

    @Override // X.W4Z
    public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        if (interfaceC81599W0t != null) {
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            int width = (int) (r5.getWidth() * (layoutParams.height / r5.getHeight()));
            if (width == layoutParams.width) {
                return;
            }
            layoutParams.width = width;
            this.LIZ.setLayoutParams(layoutParams);
        }
    }
}

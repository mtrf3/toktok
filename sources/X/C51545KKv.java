package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.KKv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51545KKv extends W4V<InterfaceC81599W0t> {
    public final View LIZIZ;

    public C51545KKv(W5G w5g) {
        this.LIZIZ = w5g;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        if (interfaceC81599W0t != null) {
            int width = interfaceC81599W0t.getWidth();
            int height = interfaceC81599W0t.getHeight();
            if (height > 0) {
                ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                layoutParams.width = (layoutParams.height * width) / height;
                this.LIZIZ.setLayoutParams(layoutParams);
            }
        }
    }
}

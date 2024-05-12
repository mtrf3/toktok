package X;

import android.graphics.drawable.Animatable;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;

/* renamed from: X.KKu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51544KKu implements W4Z<InterfaceC81599W0t> {
    public final /* synthetic */ StickerPropDetailFragment LIZ;

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

    public C51544KKu(StickerPropDetailFragment stickerPropDetailFragment) {
        this.LIZ = stickerPropDetailFragment;
    }

    @Override // X.W4Z
    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
    }

    @Override // X.W4Z
    public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t2 = interfaceC81599W0t;
        if (this.LIZ.getContext() == null || interfaceC81599W0t2 == null || interfaceC81599W0t2.getWidth() == 0 || interfaceC81599W0t2.getHeight() == 0) {
            return;
        }
        this.LIZ.LLII.setLayoutParams(new FrameLayout.LayoutParams((int) ((KL2.LIZJ(this.LIZ.getContext(), 25.0f) * interfaceC81599W0t2.getWidth()) / interfaceC81599W0t2.getHeight()), (int) KL2.LIZJ(this.LIZ.getContext(), 25.0f)));
    }
}

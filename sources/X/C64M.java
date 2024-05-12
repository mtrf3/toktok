package X;

import Y.ARunnableS2S0310000_2;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.64M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64M implements InterfaceC1544864m {
    public final /* synthetic */ C64I LIZ;

    public C64M(C64I c64i) {
        this.LIZ = c64i;
    }

    @Override // X.InterfaceC1544864m
    public final void LIZ(C64W c64w, C1559169z stickerEditLayout, boolean z) {
        o.LJIIIZ(stickerEditLayout, "stickerEditLayout");
        stickerEditLayout.setFrameworkAfterExitListener(new AqS91S0300000_2(this, c64w, stickerEditLayout, 15));
        C64I c64i = this.LIZ;
        FrameLayout frameLayout = c64i.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.post(new ARunnableS2S0310000_2(c64i, stickerEditLayout, c64w, z, 3));
        } else {
            o.LJIJI("stickerEditLayer");
            throw null;
        }
    }
}

package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75106Tdm implements InterfaceC75124Te4 {
    public final /* synthetic */ C75103Tdj LIZ;

    @Override // X.InterfaceC75124Te4
    public final void LIZ() {
        if (!this.LIZ.LJJIJIL()) {
            return;
        }
        try {
            if (this.LIZ.LLF != null && (!r0.isRunning())) {
                Animatable animatable = this.LIZ.LLF;
                if (animatable != null) {
                    animatable.start();
                }
                C75103Tdj c75103Tdj = this.LIZ;
                C47061t0 c47061t0 = c75103Tdj.LJLLILLLL;
                if (c47061t0 != null) {
                    c47061t0.postDelayed(new ARunnableS49S0100000_13(c75103Tdj, 149), 1240L);
                    this.LIZ.LJJIJLIJ();
                    return;
                } else {
                    o.LJIJI("followView");
                    throw null;
                }
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.InterfaceC75124Te4
    public final void LIZIZ() {
        if (!this.LIZ.LJJIJIL()) {
            return;
        }
        C47061t0 c47061t0 = this.LIZ.LJLLILLLL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
            this.LIZ.LJJIJLIJ();
        } else {
            o.LJIJI("followView");
            throw null;
        }
    }

    @Override // X.InterfaceC75124Te4
    public final User LIZJ() {
        User user = this.LIZ.LLD;
        if (user != null) {
            return user;
        }
        o.LJIJI("oTargetUser");
        throw null;
    }

    public C75106Tdm(C75103Tdj c75103Tdj) {
        this.LIZ = c75103Tdj;
    }
}

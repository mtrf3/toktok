package X;

import Y.ALAdapterS4S0100000_5;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bq5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30005Bq5 implements InterfaceC30008Bq8 {
    public final C29701Eo LIZ;
    public String LIZIZ = "flowers_lottie.zip";

    @Override // X.InterfaceC30008Bq8
    public final void LIZ() {
        C29701Eo c29701Eo = this.LIZ;
        if (c29701Eo != null) {
            if (c29701Eo.isAnimating()) {
                return;
            }
            C29701Eo c29701Eo2 = this.LIZ;
            if (c29701Eo2 != null) {
                C15490jB.LJIIJ(c29701Eo2, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), this.LIZIZ, true);
                return;
            } else {
                o.LJIJI("flowerAnimation");
                throw null;
            }
        }
        o.LJIJI("flowerAnimation");
        throw null;
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZIZ() {
        C29701Eo c29701Eo = this.LIZ;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        } else {
            o.LJIJI("flowerAnimation");
            throw null;
        }
    }

    public C30005Bq5(View view) {
        View findViewById = view.findViewById(R.id.dj9);
        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.flowers_lottie)");
        C29701Eo c29701Eo = (C29701Eo) findViewById;
        this.LIZ = c29701Eo;
        c29701Eo.addAnimatorListener(new ALAdapterS4S0100000_5(this, 74));
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZJ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC30008Bq8
    public final void setVisibility(int i) {
        C29701Eo c29701Eo = this.LIZ;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(i);
        } else {
            o.LJIJI("flowerAnimation");
            throw null;
        }
    }
}

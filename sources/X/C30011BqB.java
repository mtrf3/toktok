package X;

import Y.ALAdapterS4S0100000_5;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.BqB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30011BqB implements InterfaceC30008Bq8 {
    public final C29701Eo LIZ;
    public String LIZIZ;

    @Override // X.InterfaceC30008Bq8
    public final void LIZ() {
        C29701Eo c29701Eo = this.LIZ;
        if (c29701Eo != null) {
            if (!c29701Eo.isAnimating()) {
                C29701Eo c29701Eo2 = this.LIZ;
                if (c29701Eo2 != null) {
                    c29701Eo2.setVisibility(0);
                    C29701Eo c29701Eo3 = this.LIZ;
                    if (c29701Eo3 != null) {
                        C15490jB.LJIIJ(c29701Eo3, "tiktok_live_watch_resource_normal_1", this.LIZIZ, true);
                        C29701Eo c29701Eo4 = this.LIZ;
                        if (c29701Eo4 != null) {
                            c29701Eo4.playAnimation();
                            return;
                        } else {
                            o.LJIJI("bubblesAnimation");
                            throw null;
                        }
                    }
                    o.LJIJI("bubblesAnimation");
                    throw null;
                }
                o.LJIJI("bubblesAnimation");
                throw null;
            }
            return;
        }
        o.LJIJI("bubblesAnimation");
        throw null;
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZIZ() {
        C29701Eo c29701Eo = this.LIZ;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
            C29701Eo c29701Eo2 = this.LIZ;
            if (c29701Eo2 != null) {
                c29701Eo2.cancelAnimation();
                return;
            } else {
                o.LJIJI("bubblesAnimation");
                throw null;
            }
        }
        o.LJIJI("bubblesAnimation");
        throw null;
    }

    public C30011BqB(View container) {
        o.LJIIIZ(container, "container");
        this.LIZIZ = "full_progress_bubbles_lottie.zip";
        View findViewById = container.findViewById(R.id.b0s);
        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.bubbles)");
        C29701Eo c29701Eo = (C29701Eo) findViewById;
        this.LIZ = c29701Eo;
        c29701Eo.addAnimatorListener(new ALAdapterS4S0100000_5(this, 73));
        if (LiveLikePerformanceOptimizeSettings.INSTANCE.enablePerformanceOptimize()) {
            c29701Eo.useHardwareAcceleration();
        }
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZJ(String str) {
        this.LIZIZ = i0.LJFF(str, ".zip");
    }

    @Override // X.InterfaceC30008Bq8
    public final void setVisibility(int i) {
        C29701Eo c29701Eo = this.LIZ;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(i);
        } else {
            o.LJIJI("bubblesAnimation");
            throw null;
        }
    }
}

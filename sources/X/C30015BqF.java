package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.BqF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30015BqF implements InterfaceC30008Bq8 {
    public final C47061t0 LIZ;
    public final C15540jG LIZIZ;
    public String LIZJ;

    @Override // X.InterfaceC30008Bq8
    public final void LIZ() {
        Animatable animatable = this.LIZIZ.LJIIJJI;
        if (animatable == null || !animatable.isRunning()) {
            C47061t0 c47061t0 = this.LIZ;
            if (c47061t0 != null) {
                c47061t0.setVisibility(0);
                C15540jG c15540jG = this.LIZIZ;
                c15540jG.LIZIZ();
                c15540jG.LJ();
                return;
            }
            o.LJIJI("bubblesAnimation");
            throw null;
        }
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZIZ() {
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
            this.LIZIZ.LIZ();
        } else {
            o.LJIJI("bubblesAnimation");
            throw null;
        }
    }

    public C30015BqF(View container) {
        o.LJIIIZ(container, "container");
        C15540jG c15540jG = new C15540jG();
        this.LIZIZ = c15540jG;
        this.LIZJ = "full_progress_bubbles_lottie.webp";
        View findViewById = container.findViewById(R.id.b0t);
        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.bubbles_webp)");
        C47061t0 c47061t0 = (C47061t0) findViewById;
        this.LIZ = c47061t0;
        c15540jG.LJFF = true;
        c15540jG.LJI = 1;
        c15540jG.LJIIL = true;
        c15540jG.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c15540jG.LIZJ(this.LIZJ);
        c15540jG.LIZ = c47061t0;
        c15540jG.LJ = new C30014BqE(this);
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZJ(String str) {
        String LJFF = i0.LJFF(str, ".webp");
        this.LIZJ = LJFF;
        this.LIZIZ.LIZJ(LJFF);
    }

    @Override // X.InterfaceC30008Bq8
    public final void setVisibility(int i) {
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null) {
            c47061t0.setVisibility(i);
        } else {
            o.LJIJI("bubblesAnimation");
            throw null;
        }
    }
}

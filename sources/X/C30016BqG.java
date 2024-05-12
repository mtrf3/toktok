package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BqG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30016BqG implements InterfaceC30008Bq8 {
    public final C47061t0 LIZ;
    public final C15540jG LIZIZ;
    public String LIZJ;

    @Override // X.InterfaceC30008Bq8
    public final void LIZ() {
        Animatable animatable = this.LIZIZ.LJIIJJI;
        if (animatable == null || !animatable.isRunning()) {
            C15540jG c15540jG = this.LIZIZ;
            c15540jG.LIZIZ();
            c15540jG.LJ();
        }
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZIZ() {
        this.LIZIZ.LIZ();
    }

    public C30016BqG(View view) {
        C15540jG c15540jG = new C15540jG();
        this.LIZIZ = c15540jG;
        this.LIZJ = "live_digg_extra_scence.webp";
        View findViewById = view.findViewById(R.id.dj_);
        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.flowers_webp)");
        C47061t0 c47061t0 = (C47061t0) findViewById;
        this.LIZ = c47061t0;
        c15540jG.LJFF = true;
        c15540jG.LJI = 1;
        c15540jG.LIZ = c47061t0;
        c15540jG.LJIIL = true;
        c15540jG.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c15540jG.LIZJ(this.LIZJ);
        c15540jG.LJ = new C30017BqH(this);
    }

    @Override // X.InterfaceC30008Bq8
    public final void LIZJ(String str) {
        this.LIZJ = str;
        C15540jG c15540jG = this.LIZIZ;
        c15540jG.getClass();
        c15540jG.LIZJ = str;
    }

    @Override // X.InterfaceC30008Bq8
    public final void setVisibility(int i) {
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null) {
            c47061t0.setVisibility(i);
        } else {
            o.LJIJI("flowerAnimationWebp");
            throw null;
        }
    }
}

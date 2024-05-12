package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1T {
    public final View LIZ;
    public boolean LIZIZ;
    public final C31597Caf LIZJ;
    public final AppCompatImageView LIZLLL;
    public final C47061t0 LJ;
    public long LJFF;
    public int LJI;

    public U1T(View view) {
        this.LIZ = view;
        View findViewById = view.findViewById(R.id.fcd);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.iv_user_icon)");
        this.LIZJ = (C31597Caf) findViewById;
        View findViewById2 = view.findViewById(R.id.fcf);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_user_stroke)");
        this.LIZLLL = (AppCompatImageView) findViewById2;
        this.LJ = (C47061t0) view.findViewById(R.id.fce);
        this.LJFF = -1L;
        this.LJI = -1;
    }

    public final void LIZ(boolean z) {
        boolean z2;
        int i = 0;
        if (z && !this.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        C47061t0 c47061t0 = this.LJ;
        if (!z2) {
            i = 8;
        }
        c47061t0.setVisibility(i);
        if (z2) {
            if (C76265TwT.LIZ.LJIIJJI) {
                C15490jB.LJ(this.LJ, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_pk_army_mvp_sfx.png");
            } else {
                C15490jB.LJ(this.LJ, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "ttlive_pk_army_mvp.png");
            }
        }
    }
}

package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.Tvh */
/* loaded from: classes14.dex */
public final class C76217Tvh extends FrameLayout {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C47061t0 LJLIL;
    public final C29701Eo LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    public final void LIZ() {
        C29306Beo.LJI(this.LJLILLLLZI);
        C29306Beo.LJI(this.LJLIL);
    }

    public static /* synthetic */ void LIZJ(C76217Tvh c76217Tvh) {
        c76217Tvh.LIZIZ(14.0f);
    }

    public final void LIZIZ(float f) {
        C29701Eo c29701Eo;
        C29701Eo c29701Eo2 = this.LJLILLLLZI;
        if (c29701Eo2 != null && c29701Eo2.getVisibility() == 0 && (c29701Eo = this.LJLILLLLZI) != null) {
            c29701Eo.setVisibility(8);
        }
        C47061t0 c47061t0 = this.LJLIL;
        if (c47061t0 != null) {
            C78866UxK.LJJLJ(C15380j0.LIZ(f), c47061t0);
        }
        C47061t0 c47061t02 = this.LJLIL;
        if (c47061t02 != null) {
            C78866UxK.LJJLIL(c47061t02, C15380j0.LIZ(f));
        }
        C15490jB.LJFF(this.LJLIL, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "ttlive_match_best_teammate_icon_red.png", ImageView.ScaleType.CENTER_CROP, null);
        C29306Beo.LJJLJLI(this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76217Tvh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = true;
        this.LJLJJI = true;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d_v, this, true);
        this.LJLIL = (C47061t0) findViewById(R.id.eza);
        this.LJLILLLLZI = (C29701Eo) findViewById(R.id.gau);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(this, 108)));
    }
}

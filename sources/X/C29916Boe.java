package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.Boe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29916Boe extends FrameLayout {
    public C2A8 LJLIL;
    public ConstraintLayout LJLILLLLZI;
    public C47061t0 LJLJI;
    public C47061t0 LJLJJI;

    public final void LIZ() {
        TextPaint paint;
        Float valueOf;
        C15490jB.LJFF(this.LJLJI, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "ttlive_match_best_teammate_icon_red.png", ImageView.ScaleType.FIT_START, null);
        C15490jB.LJFF(this.LJLJJI, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_best_teammate_icon_blue.png", ImageView.ScaleType.FIT_START, null);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ol2);
        C2A8 c2a8 = this.LJLIL;
        if (c2a8 != null && (paint = c2a8.getPaint()) != null && (valueOf = Float.valueOf(paint.measureText(LJIILJJIL))) != null) {
            if (valueOf.floatValue() > C15380j0.LIZ(267.0f)) {
                C29306Beo.LJJJJJL(C15380j0.LIZ(0.0f), this.LJLILLLLZI);
            } else {
                C29306Beo.LJJJJJL(C15380j0.LIZ(14.0f), this.LJLILLLLZI);
            }
        }
        C2A8 c2a82 = this.LJLIL;
        if (c2a82 == null) {
            return;
        }
        c2a82.setText(LJIILJJIL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL = (C2A8) findViewById(R.id.m0l);
        this.LJLILLLLZI = (ConstraintLayout) findViewById(R.id.bcc);
        this.LJLJI = (C47061t0) findViewById(R.id.f55);
        this.LJLJJI = (C47061t0) findViewById(R.id.f56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29916Boe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d_u, this, true);
    }
}

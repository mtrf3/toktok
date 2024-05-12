package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.U1d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76513U1d extends FrameLayout implements InterfaceC76517U1h {
    public AppCompatImageView LJLIL;
    public C2A8 LJLILLLLZI;
    public LiveIconView LJLJI;
    public View LJLJJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL = (AppCompatImageView) findViewById(R.id.f60);
        this.LJLILLLLZI = (C2A8) findViewById(R.id.mo0);
        this.LJLJI = (LiveIconView) findViewById(R.id.f42);
        this.LJLJJI = findViewById(R.id.eyu);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76513U1d(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dbq, this, true);
    }

    @Override // X.InterfaceC76517U1h
    public final void LIZ(C76515U1f c76515U1f) {
        AppCompatImageView appCompatImageView = this.LJLIL;
        if (appCompatImageView != null) {
            appCompatImageView.getLayoutParams();
        }
        C2A8 c2a8 = this.LJLILLLLZI;
        if (c2a8 != null) {
            c2a8.setText("");
        }
        AbstractC76516U1g abstractC76516U1g = c76515U1f.LIZ;
        if (!o.LJ(abstractC76516U1g, C76518U1i.LIZ)) {
            if (o.LJ(abstractC76516U1g, C76519U1j.LIZ)) {
                setVisibility(0);
                C2A8 c2a82 = this.LJLILLLLZI;
                if (c2a82 != null) {
                    c2a82.setText(c76515U1f.LIZJ);
                }
                C15490jB.LJ(this.LJLIL, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_item_card_guide_icon.png");
                LiveIconView liveIconView = this.LJLJI;
                if (liveIconView == null) {
                    return;
                }
                liveIconView.setVisibility(0);
                return;
            }
            o.LJ(abstractC76516U1g, C76520U1k.LIZ);
        }
    }

    @Override // X.InterfaceC76517U1h
    public void setBackgroundAlpha(float f) {
        View view = this.LJLJJI;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }
}

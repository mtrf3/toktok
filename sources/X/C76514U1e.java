package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.U1e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76514U1e extends FrameLayout implements InterfaceC76517U1h {
    public AppCompatImageView LJLIL;
    public U5I LJLILLLLZI;
    public LiveIconView LJLJI;

    @Override // X.InterfaceC76517U1h
    public void setBackgroundAlpha(float f) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL = (AppCompatImageView) findViewById(R.id.f60);
        this.LJLILLLLZI = (U5I) findViewById(R.id.mo0);
        this.LJLJI = (LiveIconView) findViewById(R.id.f42);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76514U1e(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dbp, this, true);
    }

    @Override // X.InterfaceC76517U1h
    public final void LIZ(C76515U1f c76515U1f) {
        AbstractC76516U1g abstractC76516U1g = c76515U1f.LIZ;
        if (!o.LJ(abstractC76516U1g, C76518U1i.LIZ) && !o.LJ(abstractC76516U1g, C76519U1j.LIZ) && o.LJ(abstractC76516U1g, C76520U1k.LIZ)) {
            setVisibility(0);
            U5I u5i = this.LJLILLLLZI;
            if (u5i != null) {
                U5I.LIZIZ(u5i, new SpannableStringBuilder(c76515U1f.LIZJ));
            }
            C15490jB.LJ(this.LJLIL, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_item_card_guide_icon.png");
            LiveIconView liveIconView = this.LJLJI;
            if (liveIconView == null) {
                return;
            }
            liveIconView.setVisibility(0);
        }
    }
}

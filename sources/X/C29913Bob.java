package X;

import Y.ACListenerS25S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.gift.GiftDialogHeightEvent;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.api.event.BattleVictoryLapActivityEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemGuideLayoutShowChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchColorEggsUiOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.Bob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29913Bob extends FrameLayout {
    public final DataChannel LJLIL;
    public boolean LJLILLLLZI;
    public final String LJLJI;
    public AppCompatImageView LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLILLLLZI = false;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        super.onDetachedFromWindow();
    }

    public final void LIZ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C29913Bob, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new IDAListenerS74S0100000_5(this, 7));
        ofFloat.start();
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 267)));
        C1JD.LJIJ();
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(BattleItemGuideLayoutShowChannel.class, Boolean.TRUE);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C29915Bod c29915Bod;
        super.onAttachedToWindow();
        this.LJLILLLLZI = true;
        findViewById(R.id.f42);
        this.LJLJJI = (AppCompatImageView) findViewById(R.id.f6v);
        setAlpha(0.0f);
        C15490jB.LJ(this.LJLJJI, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_item_card_guide_icon.png");
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel == null || (c29915Bod = (C29915Bod) dataChannel.kv0(BattleVictoryLapActivityEvent.class)) == null || c29915Bod.LIZ == 0) {
            LIZ();
        } else {
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null) {
                dataChannel2.mv0(BattleVictoryLapActivityEvent.class, this, new AqS171S0100000_5(this, 512));
            }
        }
        if (LiveMatchColorEggsUiOpt.INSTANCE.getValue()) {
            DataChannel dataChannel3 = this.LJLIL;
            if (dataChannel3 != null) {
                dataChannel3.mv0(BattleBonusTaskShowChannel.class, this, new AqS171S0100000_5(this, 513));
            }
            DataChannel dataChannel4 = this.LJLIL;
            if (dataChannel4 != null) {
                dataChannel4.mv0(GiftDialogHeightEvent.class, this, new AqS171S0100000_5(this, 514));
            }
        }
    }

    public final DataChannel getDataChannel() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29913Bob(Context context, DataChannel dataChannel) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = dataChannel;
        this.LJLJI = MatchItemCardLynxUrlSetting.INSTANCE.getMatchFaq();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dbn, this, true);
    }
}

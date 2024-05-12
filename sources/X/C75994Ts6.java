package X;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLinkedAnchorNumChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ts6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75994Ts6 implements InterfaceViewOnClickListenerC30227Btf {
    public final LifecycleOwner LJLIL;
    public InterfaceC30237Btp LJLILLLLZI;
    public LiveIconView LJLJI;
    public C2A4 LJLJJI;
    public AppCompatImageView LJLJJL;
    public C47121t6 LJLJJLL;
    public MultiMatchAnchorWidget LJLJL;
    public boolean LJLJLJ;
    public LiveIconView LJLJLLL;
    public DataChannel LJLL;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final void LIZIZ() {
        if (this.LJLJLJ) {
            LiveIconView liveIconView = this.LJLJI;
            if (liveIconView != null) {
                liveIconView.setImageResource(R.drawable.cwy);
            }
            LiveIconView liveIconView2 = this.LJLJLLL;
            if (liveIconView2 != null) {
                liveIconView2.setIcon(R.drawable.cwz);
                return;
            }
            return;
        }
        LiveIconView liveIconView3 = this.LJLJI;
        if (liveIconView3 == null) {
            return;
        }
        liveIconView3.setImageResource(R.drawable.cwy);
    }

    public final void LIZJ() {
        if (this.LJLJLJ) {
            LiveIconView liveIconView = this.LJLJI;
            if (liveIconView != null) {
                liveIconView.setImageResource(R.drawable.cww);
            }
            LiveIconView liveIconView2 = this.LJLJLLL;
            if (liveIconView2 != null) {
                liveIconView2.setIcon(R.drawable.cwx);
                return;
            }
            return;
        }
        LiveIconView liveIconView3 = this.LJLJI;
        if (liveIconView3 == null) {
            return;
        }
        liveIconView3.setImageResource(R.drawable.cww);
    }

    public final void LJ() {
        C2A4 c2a4 = this.LJLJJI;
        if (c2a4 != null) {
            c2a4.setVisibility(0);
        }
        C2A4 c2a42 = this.LJLJJI;
        if (c2a42 != null) {
            c2a42.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_lottie_icon_time_countdown.webp"));
        }
        C2A4 c2a43 = this.LJLJJI;
        if (c2a43 != null) {
            c2a43.LJII();
        }
        AppCompatImageView appCompatImageView = this.LJLJJL;
        if (appCompatImageView == null) {
            return;
        }
        appCompatImageView.setVisibility(0);
    }

    public C75994Ts6(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
    }

    public final void LIZLLL(int i) {
        InterfaceC30237Btp interfaceC30237Btp;
        if (i == 0 && ((interfaceC30237Btp = this.LJLILLLLZI) == null || interfaceC30237Btp.getVisibility() != 0)) {
            JSONObject LIZLLL = FT5.LIZLLL("event_id", "battle_icon_show");
            C05630Jz.LJFF(LIZLLL, "channel_id", B5G.LIZIZ().LJFF);
            C75192TfA.LJIIJ(null, LIZLLL);
            C05630Jz.LIZ(C76272Twa.LIZIZ ? 1 : 0, "is_sdk", LIZLLL);
            C76272Twa.LJIJ(LIZLLL);
            C0K2.LJIIIIZZ("ttlive_client_anchor_match_icon_monitor", 0, LIZLLL);
        }
        InterfaceC30237Btp interfaceC30237Btp2 = this.LJLILLLLZI;
        if (interfaceC30237Btp2 == null) {
            return;
        }
        interfaceC30237Btp2.setVisibility(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C76265TwT.LIZ.LJIIL = false;
        MultiMatchAnchorWidget multiMatchAnchorWidget = this.LJLJL;
        if (multiMatchAnchorWidget != null) {
            multiMatchAnchorWidget.LLFFF();
        }
    }

    public final void LIZ(EnumC76178Tv4 enumC76178Tv4, int i) {
        Integer num;
        DataChannel dataChannel;
        View view;
        if (enumC76178Tv4 == null) {
            return;
        }
        if (enumC76178Tv4 == EnumC76178Tv4.INVITED) {
            if (!InterfaceC30442Bx8.LLIIJI.LIZJ().booleanValue()) {
                InterfaceC30237Btp interfaceC30237Btp = this.LJLILLLLZI;
                if (interfaceC30237Btp != null) {
                    view = interfaceC30237Btp.LJFF();
                } else {
                    view = null;
                }
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mpb);
                if (LJIILJJIL == null) {
                    LJIILJJIL = "";
                }
                C30770C5u.LIZJ(view, LJIILJJIL, C09.ANCHOR_BATTLE, CMF.LJLIL);
            }
            LIZIZ();
            LJ();
            return;
        }
        if (enumC76178Tv4 == EnumC76178Tv4.RECEIVED || enumC76178Tv4 == EnumC76178Tv4.ACCEPTED) {
            LIZIZ();
            LJ();
            return;
        }
        if (EnumC76178Tv4.START.compareTo(enumC76178Tv4) <= 0 && enumC76178Tv4.compareTo(EnumC76178Tv4.END) < 0) {
            C30770C5u.LIZIZ(C09.ANCHOR_BATTLE);
            C2A4 c2a4 = this.LJLJJI;
            if (c2a4 != null) {
                c2a4.clearAnimation();
            }
            C2A4 c2a42 = this.LJLJJI;
            if (c2a42 != null) {
                c2a42.setVisibility(8);
            }
            AppCompatImageView appCompatImageView = this.LJLJJL;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            LIZJ();
            return;
        }
        C30770C5u.LIZIZ(C09.ANCHOR_BATTLE);
        C2A4 c2a43 = this.LJLJJI;
        if (c2a43 != null) {
            c2a43.clearAnimation();
        }
        C2A4 c2a44 = this.LJLJJI;
        if (c2a44 != null) {
            c2a44.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = this.LJLJJL;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(8);
        }
        LIZIZ();
        DataChannel dataChannel2 = this.LJLL;
        if (dataChannel2 == null || (num = (Integer) dataChannel2.kv0(BattleLinkedAnchorNumChannel.class)) == null || num.intValue() != 2 || !C76265TwT.LJI() || i == 1 || (dataChannel = this.LJLL) == null || dataChannel.kv0(BattleReMatchStateChannel.class) == null) {
            return;
        }
        LIZ(enumC76178Tv4, 1);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLJL = null;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        this.LJLL = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJLJ = z;
        this.LJLILLLLZI = interfaceC30237Btp;
        this.LJLJI = (LiveIconView) interfaceC30237Btp.LIZ(R.id.f51);
        this.LJLJJI = (C2A4) interfaceC30237Btp.LIZ(R.id.f52);
        this.LJLJJL = (AppCompatImageView) interfaceC30237Btp.LIZ(R.id.f54);
        this.LJLJJLL = (C47121t6) interfaceC30237Btp.LIZ(R.id.bwf);
        if (this.LJLJLJ) {
            TextView textView = (TextView) interfaceC30237Btp.LIZ(R.id.ldm);
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.mrg));
            }
            this.LJLJLLL = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
        }
        interfaceC30237Btp.getContext();
        LIZJ();
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLIL, BattleStateChannel.class, new AqS179S0100000_13(this, 51));
            dataChannel.lv0(this.LJLIL, BattleReMatchStateChannel.class, new AqS144S0200000_13(this, dataChannel, 0));
            dataChannel.lv0(this.LJLIL, BattleInvitingTimeLeftChannel.class, new AqS144S0200000_13(this, dataChannel, 1));
        }
    }
}

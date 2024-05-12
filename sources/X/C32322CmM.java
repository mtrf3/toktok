package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeOptPhase1;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.CmM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32322CmM extends FrameLayout {
    public DataChannel LJLIL;
    public C47061t0 LJLILLLLZI;
    public C2A8 LJLJI;
    public boolean LJLJJI;

    public final void LIZIZ() {
        Room room;
        if (LiveFirstRechargeOptPhase1.INSTANCE.getValue() == 3) {
            C15490jB.LJ(this.LJLILLLLZI, "tiktok_live_revenue_normal_1", "ttlive_first_recharge_coins_v2.png");
        } else {
            C15490jB.LJ(this.LJLILLLLZI, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_normal_1"), "ttlive_fast_welcome_pack_icon.png");
        }
        if (this.LJLJJI) {
            C2A8 c2a8 = this.LJLJI;
            if (c2a8 != null) {
                c2a8.setText(R.string.nv1);
            }
            C2A8 c2a82 = this.LJLJI;
            if (c2a82 != null) {
                C29306Beo.LJJLJLI(c2a82);
            }
        } else {
            C2A8 c2a83 = this.LJLJI;
            if (c2a83 != null) {
                C29306Beo.LJI(c2a83);
            }
        }
        C32282Cli.LIZIZ("show", "welcome_pack", true);
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        BJH.LIZ(room);
    }

    public final void LIZ() {
        long j;
        int LIZ = C5J.LIZ() + 1;
        if (LiveFirstRechargeOptPhase1.INSTANCE.getValue() == 3) {
            InterfaceC30442Bx8.N1.LIZJ(Double.valueOf(LIZ));
        } else {
            InterfaceC30442Bx8.M1.LIZJ(Double.valueOf(LIZ));
        }
        Room room = null;
        AbstractC32320CmK.LIZJ(AbstractC32320CmK.LIZ, getContext(), "shortcut_gift", null, 56);
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        }
        GiftManager inst = GiftManager.inst();
        long j2 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Gift fastGift = inst.getFastGift(j);
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        if (fastGift != null) {
            j2 = fastGift.id;
        }
        c32785Ctp.LJJI(j2, true, false, "convenient_icon", "", "click", 0, "welcome_pack");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32322CmM(DataChannel dataChannel, Context context) {
        super(context, null);
        boolean z;
        Boolean bool;
        a1.LJFF(context, "context");
        this.LJLIL = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJJI = z;
        if (z) {
            View LJI = C20910rv.LJI(R.layout.do6, null, false, 12);
            this.LJLILLLLZI = (C47061t0) LJI.findViewById(R.id.ldp);
            C2A8 c2a8 = (C2A8) LJI.findViewById(R.id.ldm);
            this.LJLJI = c2a8;
            if (c2a8 != null) {
                C29306Beo.LJI(c2a8);
            }
            setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 418)));
            addView(LJI);
        } else {
            this.LJLILLLLZI = new C47061t0(getContext());
            setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 419)));
            int LIZJ = (int) KL2.LIZJ(getContext(), 5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15380j0.LIZ(26.0f), C15380j0.LIZ(26.0f));
            layoutParams.topMargin = LIZJ;
            layoutParams.setMarginStart(LIZJ);
            C47061t0 c47061t0 = this.LJLILLLLZI;
            if (c47061t0 != null) {
                c47061t0.setLayoutParams(layoutParams);
            }
            addView(this.LJLILLLLZI);
        }
        LIZIZ();
        setClipChildren(false);
    }
}

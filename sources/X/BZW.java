package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS109S0300000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZW extends BZU {
    public LiveIconView LJLIL;
    public View LJLILLLLZI;
    public DataChannel LJLJI;
    public final BZX LJLJJI;
    public EnumC12540eQ LJLJJL;

    public final boolean LIZ() {
        Boolean bool;
        Room room;
        Room room2;
        PaidEvent paidEvent;
        if (!LiveBGMSetting.INSTANCE.inLiveBGMUpgrade()) {
            return false;
        }
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null && (paidEvent = room2.paidEvent) != null && paidEvent.paidType == 1) {
            return false;
        }
        DataChannel dataChannel2 = this.LJLJI;
        if (dataChannel2 != null) {
            bool = (Boolean) dataChannel2.kv0(ECLiveStatusChangeChannel.class);
        } else {
            bool = null;
        }
        if (!C29306Beo.LJIILLIIL(bool)) {
            return false;
        }
        DataChannel dataChannel3 = this.LJLJI;
        if (dataChannel3 != null && (room = (Room) dataChannel3.kv0(RoomChannel.class)) != null && room.liveSubOnly == 1) {
            return false;
        }
        return true;
    }

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final boolean ud() {
        if (EnumC12540eQ.ON == this.LJLJJL && !C7N.LJII().isUsingAccompanimentBusiness()) {
            if ((C30355Bvj.LJIILJJIL() && LIZ()) || C29829BnF.LIZ) {
                return false;
            }
            return true;
        }
        return false;
    }

    public BZW(Context mContext) {
        o.LJIIIZ(mContext, "mContext");
        this.LJLJJI = BZX.LJLIL;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BCD.LIZ(this.LJLJI, this.LJLJJI, new AqS171S0100000_5(this, 737), BZY.LJLIL, C15380j0.LJIILJJIL(R.string.mp9), Boolean.FALSE);
    }

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        super.i(interfaceC30237Btp, dataChannel);
        this.LJLJI = dataChannel;
        this.LJLIL = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
        this.LJLILLLLZI = interfaceC30237Btp.LIZ(R.id.ldl);
        BCD.LIZIZ(this.LJLJJI, new AqS109S0300000_5(this, dataChannel, interfaceC30237Btp, 3));
        C30355Bvj.LJIIJJI();
        if (C32141Ny.LIZIZ()) {
            LiveIconView liveIconView = this.LJLIL;
            if (liveIconView != null) {
                liveIconView.setIcon(R.drawable.d61);
            }
        } else {
            LiveIconView liveIconView2 = this.LJLIL;
            if (liveIconView2 != null) {
                liveIconView2.setIcon(R.drawable.d60);
            }
        }
        if (C7N.LJII().isUsingAccompanimentBusiness() || ((C30355Bvj.LJIILJJIL() && LIZ()) || C29829BnF.LIZ || BYI.LIZ(BWZ.VOICE_EFFECT))) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(interfaceC30237Btp.LJFF(), (Property<View, Float>) View.ALPHA, 1.0f, 0.4f);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
    }
}

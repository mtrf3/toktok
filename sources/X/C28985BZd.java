package X;

import Y.AObjectS45S0101000_13;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BGMInitDataChannel;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BZd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28985BZd extends BZU {
    public DataChannel LJLIL;
    public final InterfaceC28986BZe LJLILLLLZI;

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final boolean ud() {
        C30355Bvj.LJIIJJI();
        if (!C32141Ny.LIZIZ() && !Boolean.TRUE.equals(this.LJLIL.kv0(ECLiveStatusChangeChannel.class))) {
            return true;
        }
        return false;
    }

    public C28985BZd(InterfaceC28986BZe interfaceC28986BZe) {
        this.LJLILLLLZI = interfaceC28986BZe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Boolean bool = (Boolean) this.LJLIL.kv0(ECLiveStatusChangeChannel.class);
        if (bool != null && bool.booleanValue()) {
            HashMap LIZJ = C03660Ck.LIZJ("extra", "ecom");
            BPM bpm = new BPM();
            bpm.LIZJ = R.string.meu;
            bpm.LJ = LIZJ;
            bpm.LIZLLL = true;
            bpm.LJFF = this.LJLIL;
            bpm.LIZIZ = "pm_live_bgmusic_playlist_music_cannot_enter";
            C30868C9o.LJII(bpm);
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_conflict_toast_show");
            LIZ.LJIILLIIL(this.LJLIL);
            LIZ.LJJIIJZLJL();
            return;
        }
        C30355Bvj.LJIIJJI();
        if (C32141Ny.LIZIZ()) {
            C30868C9o.LIZJ(R.string.mf1);
            return;
        }
        if (BYI.LIZIZ(BWZ.KARAOKE)) {
            HashMap LIZJ2 = C03660Ck.LIZJ("extra", "karaoke");
            BPM bpm2 = new BPM();
            bpm2.LIZJ = R.string.jvq;
            bpm2.LIZIZ = "pm_mt_LIVEKaraoke_LIVEhostPage_musicKaraokeToast";
            bpm2.LIZLLL = true;
            bpm2.LJFF = this.LJLIL;
            bpm2.LJ = LIZJ2;
            C30868C9o.LJII(bpm2);
            return;
        }
        if (this.LJLILLLLZI.LIZIZ() == null || this.LJLIL.kv0(BGMInitDataChannel.class) == Boolean.FALSE) {
            if (LiveBGMSetting.INSTANCE.inLiveBGMUpgrade()) {
                InterfaceC28986BZe interfaceC28986BZe = this.LJLILLLLZI;
                LiveDialogFragment liveBGMDialog = C7N.LJII().getLiveBGMDialog();
                o.LJIIIIZZ(liveBGMDialog, "effectService.liveBGMDialog");
                interfaceC28986BZe.LIZ(liveBGMDialog);
            } else {
                InterfaceC28986BZe interfaceC28986BZe2 = this.LJLILLLLZI;
                LiveDialogFragment liveMusicDialog = C7N.LJII().getLiveMusicDialog();
                o.LJIIIIZZ(liveMusicDialog, "effectService.liveMusicDialog");
                interfaceC28986BZe2.LIZ(liveMusicDialog);
            }
        }
        Room room = (Room) this.LJLIL.kv0(RoomChannel.class);
        FragmentManager fragmentManager = this.LJLILLLLZI.getFragmentManager();
        LiveDialogFragment LIZIZ = this.LJLILLLLZI.LIZIZ();
        if (fragmentManager != null && LIZIZ != null) {
            LIZIZ.show(fragmentManager, "MUSIC");
            if (room != null) {
                str = String.valueOf(room.getOwnerUserId());
            } else {
                str = "";
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_icon_click");
            LIZ2.LJIILLIIL(this.LJLIL);
            C06490Nh.LIZLLL(LIZ2, str, "anchor_id", "decorate", "enter_from");
            C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_ENHANCE_BGM);
            EnumC30204BtI.MUSIC.setRedDotVisible(this.LJLIL, false);
            this.LJLIL.pv0(EffectRedDotStatusChangeEvent.class);
        }
    }

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        super.i(interfaceC30237Btp, dataChannel);
        this.LJLIL = dataChannel;
        LiveBGMSetting liveBGMSetting = LiveBGMSetting.INSTANCE;
        if (liveBGMSetting.inLiveBGMUpgradeV1() || liveBGMSetting.inLiveBGMUpgradeV3()) {
            C30444BxA.LIZIZ(EnumC30410Bwc.LIVE_BROADCAST_ENHANCE_BGM, dataChannel.LJLJJI, null, new AObjectS45S0101000_13(0, dataChannel, 0));
        }
        Boolean bool = (Boolean) dataChannel.kv0(ECLiveStatusChangeChannel.class);
        C30355Bvj.LJIIJJI();
        if (C32141Ny.LIZIZ() || (bool != null && bool.booleanValue())) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(interfaceC30237Btp.LJFF(), (Property<View, Float>) View.ALPHA, 1.0f, 0.4f);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
    }
}

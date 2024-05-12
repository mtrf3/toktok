package X;

import Y.IDcS16S0300000_5;
import android.content.Context;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcaseAudioDetectionHitSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bcp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29183Bcp implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 203;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        LiveMode liveMode;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(abstractC65782Prm));
        Context context = bik.LIZ;
        if (LiveBroadcaseAudioDetectionHitSetting.INSTANCE.showHitDialog()) {
            String str = null;
            if (C29219BdP.LIZ(context, null)) {
                C47071t1 c47071t1 = new C47071t1(context);
                c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.n0h);
                c47071t1.LJII(C15380j0.LJIILJJIL(R.string.n0g));
                c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.n0e), new IDcS16S0300000_5(this, bik, c84654XKg, 4));
                c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.n0f), new IDcS16S0300000_5(this, bik, c84654XKg, 5));
                c47071t1.LJIILL = false;
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-6702251972809973610")).LIZ) {
                    LIZ.show();
                }
                DataChannel dataChannel = bik.LIZIZ;
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_microphone_occupied_popup_show");
                LIZ2.LJIILLIIL(dataChannel);
                if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
                    str = C28509BGv.LIZ(liveMode);
                }
                LIZ2.LJIJJ(str, "live_type");
                LIZ2.LJJIIJZLJL();
                return c84654XKg.LIZ();
            }
        }
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        c84654XKg.resumeWith(bool);
        return c84654XKg.LIZ();
    }

    public final void LIZJ(DataChannel dataChannel, String str) {
        String str2;
        LiveMode liveMode;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_microphone_occupied_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = null;
        }
        C06490Nh.LIZLLL(LIZ, str2, "live_type", str, "btn_type");
    }
}

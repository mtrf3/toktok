package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveSettingEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BNY extends BTV<C28826BTa> {
    public final List<String> LIZIZ = C47261Igj.LJJIJ("webcast_rank_setting");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        ActivityC45651qj LJIILL;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        if (C29306Beo.LJJI()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((C32537Cpp) dataChannelGlobal.gv0(C29033BaP.class)).LIZ = "pop_window";
            dataChannelGlobal.rv0(PreviewLiveSettingEvent.class);
            return true;
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal2.mv0(C29044Baa.class);
        if (room == null || ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() != room.getOwnerUserId() || (LJIILL = g0.LJIILL(((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity())) == null || (supportFragmentManager = LJIILL.getSupportFragmentManager()) == null) {
            return false;
        }
        ((C32537Cpp) dataChannelGlobal2.gv0(C29033BaP.class)).LIZ = "pop_window";
        LiveAdminSettingDialog Kd0 = ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).Kd0(true);
        if (Kd0 != null) {
            Kd0.show(supportFragmentManager, "LiveAdminSettingDialog");
        }
        return true;
    }
}

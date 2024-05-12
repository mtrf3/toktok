package X;

import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BC4 implements InterfaceC72822Si2 {
    public final /* synthetic */ LiveCommentSettingFragment LJLIL;

    public BC4(LiveCommentSettingFragment liveCommentSettingFragment) {
        this.LJLIL = liveCommentSettingFragment;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.android.livesdk.message.proto.StarCommentConfig, O] */
    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        if (o.LJ(c199097rd.LJLIL, "star_comment_setting_event") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null) {
            LiveCommentSettingFragment liveCommentSettingFragment = this.LJLIL;
            try {
                ?? starCommentConfig = new StarCommentConfig();
                starCommentConfig.starCommentSwitch = interfaceC78280Uns.getBoolean("star_comment_switch");
                starCommentConfig.grantGroup = interfaceC78280Uns.getInt("grant_group");
                starCommentConfig.grantLevel = interfaceC78280Uns.getInt("grant_level");
                starCommentConfig.starCommentQualification = true;
                if (o.LJ(liveCommentSettingFragment.LJLJJI, "from_page_preview")) {
                    DataChannel LJIILIIL = C51029K0z.LJIILIIL(liveCommentSettingFragment);
                    if (LJIILIIL != null) {
                        ((C32536Cpo) LJIILIIL.gv0(C2E0.class)).LIZ = starCommentConfig;
                    }
                    liveCommentSettingFragment.LJLJJL = true;
                    return;
                }
                Room xl = liveCommentSettingFragment.xl();
                if (xl != null) {
                    xl.starCommentConfig = starCommentConfig;
                }
            } catch (Exception unused) {
            }
        }
    }
}

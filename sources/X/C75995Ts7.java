package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiSubSceneTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchFinishUpdateBattleIdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.Ts7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75995Ts7 extends AbstractC65781Prl implements InterfaceC88472Yns<EnumC76178Tv4, C76800UCe> {
    public static final C75995Ts7 LJLIL = new C75995Ts7();

    public C75995Ts7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC76178Tv4 state) {
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        InterfaceC75441TjB LJJIJL2;
        U8H LJJZZI2;
        long j;
        String str;
        String str2;
        InterfaceC75441TjB LJJIJL3;
        U8H LJJZZI3;
        o.LJIIIZ(state, "state");
        long j2 = 0;
        if (state == EnumC76178Tv4.START) {
            Keva repo = Keva.getRepo("live_match");
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null) {
                j = ((C29374Bfu) LIZIZ).getCurrentUserId();
            } else {
                j = 0;
            }
            String LLD = ORZ.LLD(C8E.LIZLLL().LJIILJJIL(), ",", null, null, C75998TsA.LJLIL, 30);
            if (C8E.LIZLLL().LJIILJJIL().size() == 4) {
                str = "2v2";
            } else {
                str = "1v1";
            }
            repo.storeString("match_type", str);
            repo.storeString("uid_list", LLD);
            repo.storeLong("channel_id", B5G.LIZIZ().LJFF);
            repo.storeLong("current_user_id", j);
            repo.storeLong("current_anchor_id", C76271TwZ.LJJIIZ());
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j2 = room.getId();
            }
            repo.storeLong("room_id", j2);
            repo.storeInt("linked_count", C8E.LIZLLL().LJIILJJIL().size());
            repo.storeBoolean("is_background", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground());
            C75883TqJ LJI = C8E.LIZLLL().LJI(j);
            if (LJI == null || (str2 = LJI.LJII) == null) {
                str2 = "";
            }
            repo.storeString("link_mic_id", str2);
            repo.storeLong("battle_id", C76265TwT.LIZ.LIZIZ());
            C0NB.LIZIZ("pk_interrupt", "recordBattleInfo");
            if (LinkMicSeiSubSceneTechSwitchSetting.INSTANCE.enable() && (LJJIJL3 = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI3 = LJJIJL3.LJJZZI()) != null) {
                LJJZZI3.LJJIJIIJIL("battle_start");
            }
        } else if (state == EnumC76178Tv4.END) {
            if (MatchFinishUpdateBattleIdSetting.INSTANCE.getValue() && (LJJIJL2 = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI2 = LJJIJL2.LJJZZI()) != null) {
                LJJZZI2.LJJZ(0L);
            }
            C76271TwZ.LJJIIJZLJL();
            C75622Tm6.LJIIIZ(2);
            if (LinkMicSeiSubSceneTechSwitchSetting.INSTANCE.enable() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI = LJJIJL.LJJZZI()) != null) {
                LJJZZI.LJJIJIIJIL("battle_end");
            }
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.comp.impl.game.ui.GameShortVideoAdDetailPageDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZG implements InterfaceC72822Si2 {
    public final /* synthetic */ GameShortVideoAdDetailPageDialogFragment LJLIL;

    public UZG(GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment) {
        this.LJLIL = gameShortVideoAdDetailPageDialogFragment;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String LJJIJIL;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String LJJIJIL2;
        String str14 = c199097rd.LJLIL;
        String str15 = "";
        if (o.LJ(str14, "updateNavBarPartnershipDownloadButton")) {
            GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LJLIL;
            gameShortVideoAdDetailPageDialogFragment.getClass();
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                z = u.LJJIIZI(interfaceC78280Uns, "show", false);
            } else {
                z = false;
            }
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 == null || (str = u.LJJIJIL(interfaceC78280Uns2, "taskID", "")) == null) {
                str = "";
            }
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns3 == null || (str2 = u.LJJIJIL(interfaceC78280Uns3, "roomID", "")) == null) {
                str2 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns4 == null || (str3 = u.LJJIJIL(interfaceC78280Uns4, "anchorID", "")) == null) {
                str3 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns5 == null || (str4 = u.LJJIJIL(interfaceC78280Uns5, "gameID", "")) == null) {
                str4 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns6 == null || (str5 = u.LJJIJIL(interfaceC78280Uns6, WM7.SCENE_SERVICE, "")) == null) {
                str5 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns7 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns7 == null || (str6 = u.LJJIJIL(interfaceC78280Uns7, "deepLink", "")) == null) {
                str6 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns8 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns8 == null || (str7 = u.LJJIJIL(interfaceC78280Uns8, "gameName", "")) == null) {
                str7 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns9 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns9 == null || (str8 = u.LJJIJIL(interfaceC78280Uns9, "appID", "")) == null) {
                str8 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns10 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns10 == null || (str9 = u.LJJIJIL(interfaceC78280Uns10, "packageName", "")) == null) {
                str9 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns11 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns11 == null || (str10 = u.LJJIJIL(interfaceC78280Uns11, "siteID", "")) == null) {
                str10 = "";
            }
            InterfaceC78280Uns interfaceC78280Uns12 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns12 != null && (LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns12, "sourceID", "")) != null) {
                str15 = LJJIJIL2;
            }
            String str16 = null;
            gameShortVideoAdDetailPageDialogFragment.LJLJLJ = new UZI(z, str, str3, str4, str5, str6, str7, str2, str9, null, str8, false, str15, str10, 2560);
            C2A7 c2a7 = gameShortVideoAdDetailPageDialogFragment.LJLJI;
            if (c2a7 != null) {
                c2a7.setVisibility(0);
            }
            if (z) {
                C47121t6 c47121t6 = gameShortVideoAdDetailPageDialogFragment.LLFF;
                if (c47121t6 != null) {
                    c47121t6.setText(str7);
                }
                C2A7 c2a72 = gameShortVideoAdDetailPageDialogFragment.LJLJI;
                if (c2a72 != null) {
                    c2a72.setAlpha(1.0f);
                }
                C29306Beo.LJJLJLI(gameShortVideoAdDetailPageDialogFragment.LJLJI);
                C29306Beo.LJJLJLI(gameShortVideoAdDetailPageDialogFragment.LLFF);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - gameShortVideoAdDetailPageDialogFragment.LLFFF < 1000) {
                    return;
                }
                gameShortVideoAdDetailPageDialogFragment.LLFFF = currentTimeMillis;
                UZI uzi = gameShortVideoAdDetailPageDialogFragment.LJLJLJ;
                DataChannel dataChannel = gameShortVideoAdDetailPageDialogFragment.dataChannel;
                BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_btn_show");
                String str17 = null;
                if (uzi != null) {
                    str11 = uzi.LJLLL;
                } else {
                    str11 = null;
                }
                LIZ.LJIJJ(str11, "item_id");
                if (uzi != null) {
                    str12 = uzi.LJLLJ;
                } else {
                    str12 = null;
                }
                LIZ.LJIJJ(str12, "page_id");
                if (uzi != null) {
                    str16 = uzi.LJLJJI;
                }
                LIZ.LJIJJ(str16, "game_id");
                if (uzi != null) {
                    str17 = uzi.LJLJL;
                }
                LIZ.LJIJJ(str17, "game_name");
                LIZ.LJIJJ("download", "btn_name");
                LIZ.LJIJJ("user", "user_type");
                LIZ.LJIJJ("user_game_detail", "page_name");
                LIZ.LJIJJ("ttcm", "source_entrance");
                if (C28835BTj.LIZLLL(dataChannel)) {
                    str13 = "ad";
                } else {
                    str13 = "normal";
                }
                LIZ.LJIJJ(str13, "traffic_source");
                LIZ.LJJIIJZLJL();
                return;
            }
            C29306Beo.LJIIIZ(gameShortVideoAdDetailPageDialogFragment.LJLJI);
            C29306Beo.LJIIIZ(gameShortVideoAdDetailPageDialogFragment.LLFF);
            return;
        }
        if (!o.LJ(str14, "loadHeaderImage")) {
            return;
        }
        GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment2 = this.LJLIL;
        gameShortVideoAdDetailPageDialogFragment2.getClass();
        InterfaceC78280Uns interfaceC78280Uns13 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns13 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns13, "url", "")) != null) {
            str15 = LJJIJIL;
        }
        gameShortVideoAdDetailPageDialogFragment2.wl(str15);
    }
}

package X;

import Y.ACListenerS22S0210000_13;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestOpenWaitingDialog;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.ToU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75770ToU {
    public static final void LIZIZ(View view, InterfaceC75774ToY interfaceC75774ToY) {
        if (C44432HcC.LJIIJ().isMultiCoHost()) {
            EnumC75620Tm4 LLII = C8E.LIZLLL().LLII();
            if (LLII == EnumC75620Tm4.Invited) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "entrance.context");
                C75850Tpm.LIZ(context, EnumC75769ToT.INVITE_PAIR, new AqS163S0100000_13(interfaceC75774ToY, 327), C75772ToW.LJLIL);
                return;
            } else if (LLII == EnumC75620Tm4.Applied) {
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "entrance.context");
                C75850Tpm.LIZ(context2, EnumC75769ToT.APPLY_PAIR, new AqS163S0100000_13(interfaceC75774ToY, 328), C75773ToX.LJLIL);
                return;
            }
        }
        interfaceC75774ToY.fa();
    }

    public static final void LIZLLL(C2A7 c2a7, RivalsListsData.BannerText bannerText) {
        o.LJIIIZ(bannerText, "bannerText");
        c2a7.setText(bannerText.buttonText);
        c2a7.setEnabled(true);
        if (!bannerText.isMatchValid) {
            c2a7.setEnabled(false);
            c2a7.setIcon((Drawable) null);
            return;
        }
        c2a7.setIcon((Drawable) null);
        if (RandomLinkMicManager.LJIIIZ()) {
            c2a7.setEnabled(false);
        }
        if (C31073CHl.LIZJ()) {
            Boolean LIZJ = InterfaceC30442Bx8.LLIILII.LIZJ();
            o.LJIIIIZZ(LIZJ, "HAS_CLICK_RANDOM_LINK_MIC_ENTRANCE_WHEN_BAN.value");
            if (LIZJ.booleanValue()) {
                c2a7.setEnabled(false);
            }
        }
        if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
            c2a7.setEnabled(false);
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).ta0()) {
            c2a7.setEnabled(false);
        }
        if (c2a7.isEnabled()) {
            InterfaceC30442Bx8.LLIILII.LIZ(Boolean.FALSE);
        }
    }

    public static final void LIZ(View entrance, InterfaceC75774ToY container, boolean z) {
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(container, "container");
        new C75688TnA().LJIILLIIL("auto_match_click");
        if (C31073CHl.LIZJ()) {
            if ((entrance instanceof C2A7) && entrance != null) {
                entrance.setEnabled(false);
            }
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.k0l));
            InterfaceC30442Bx8.LLIILII.LIZ(Boolean.TRUE);
            BZI LIZ = C28787BRn.LIZ("livesdk_connection_click_banned");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(EnumC75546Tks.RANDOM_MATCH.getType(), "invitee_list");
            LIZ.LJIJJ("anchor", "connection_type");
            LIZ.LJIJJ(Long.valueOf(C31073CHl.LIZIZ()), "banned_time");
            LIZ.LJJIIJZLJL();
            return;
        }
        if (!C44432HcC.LJIIJ().isMultiCoHost() && B5G.LIZIZ().LIZJ() != EnumC75636TmK.DISABLED) {
            C30868C9o.LIZJ(R.string.lzc);
            return;
        }
        if (C74838TYs.LJ().LJIIIZ) {
            DataChannelGlobal.LJLJJI.rv0(MultiGuestOpenWaitingDialog.class);
            return;
        }
        DataChannel dataChannel = B5G.LIZIZ().LIZIZ;
        User LIZIZ = C05200Ii.LIZIZ();
        if (LIZIZ != null && LIZIZ.getSecret() == 1) {
            if (z) {
                Context context = entrance.getContext();
                o.LJIIIIZZ(context, "entrance.context");
                C75970Tri.LIZ(context, EnumC75949TrN.REQUEST, null, new AqS160S0200000_13(entrance, container, 28));
                return;
            } else {
                Context context2 = entrance.getContext();
                o.LJIIIIZZ(context2, "entrance.context");
                C75227Tfj.LIZ(context2, new C75771ToV(dataChannel, entrance, container), true, EnumC75614Tly.RANDOM_LINK_MIC_INVITE, "");
                return;
            }
        }
        LIZIZ(entrance, container);
    }

    public static final void LIZJ(C2A7 c2a7, InterfaceC75774ToY container, boolean z) {
        o.LJIIIZ(container, "container");
        C16880lQ.LJJIII(c2a7, new ACListenerS22S0210000_13(c2a7, container, z, 1));
    }
}

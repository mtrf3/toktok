package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TtK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76070TtK extends C78948Uye {
    public static void LJJIFFI(AbstractC76221Tvl abstractC76221Tvl) {
        User user;
        C2A7 LLLLLLLZIL = abstractC76221Tvl.LLLLLLLZIL();
        if (LLLLLLLZIL != null) {
            LLLLLLLZIL.setMaxWidth(Integer.MAX_VALUE);
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        ImageModel imageModel = null;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        C31597Caf N = abstractC76221Tvl.N();
        if (N != null) {
            if (user != null) {
                imageModel = user.getAvatarThumb();
            }
            C31665Cbl.LJIIJ(N, imageModel, N.getWidth(), N.getHeight(), R.drawable.cuk);
        }
        View LJJJLL = abstractC76221Tvl.LJJJLL();
        if (LJJJLL != null) {
            C16880lQ.LJIIJ(B86.LJLIL, LJJJLL);
        }
    }

    public static void LJJ(InterfaceC76075TtP viewHolder, C76069TtJ data) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(data, "data");
        LJIL(viewHolder, data, false);
    }

    public static void LJIL(InterfaceC76075TtP interfaceC76075TtP, C76069TtJ c76069TtJ, boolean z) {
        View LJJJLL;
        String str;
        C2A7 LLLLLLLZIL = interfaceC76075TtP.LLLLLLLZIL();
        if (LLLLLLLZIL != null) {
            C75770ToU.LIZLLL(LLLLLLLZIL, c76069TtJ.LJLIL);
        }
        if (!z) {
            C47121t6 k = interfaceC76075TtP.k();
            if (k != null) {
                k.setText(c76069TtJ.LJLIL.title);
            }
            C47121t6 LJJLL = interfaceC76075TtP.LJJLL();
            if (LJJLL != null) {
                LJJLL.setText(c76069TtJ.LJLIL.subTitle);
            }
            C41081jM LJJJJZI = interfaceC76075TtP.LJJJJZI();
            if (c76069TtJ.LJLILLLLZI) {
                str = "ttlive_bg_upgrade_random_linkmic_small.png";
            } else {
                str = "ttlive_bg_upgrade_random_linkmic.png";
            }
            C15490jB.LJ(LJJJJZI, "tiktok_live_interaction_normal_1", str);
            View LJJJLL2 = interfaceC76075TtP.LJJJLL();
            if (LJJJLL2 != null) {
                LJJJLL2.setVisibility(8);
            }
            if (!c76069TtJ.LJLJI) {
                c76069TtJ.LJLJI = true;
                C75642TmQ.LIZ.LJJLIIIJJI(C44432HcC.LJIIIIZZ().getType(), c76069TtJ.LJLIL.isMatchValid);
            }
        }
        C2A7 LLLLLLLZIL2 = interfaceC76075TtP.LLLLLLLZIL();
        if (LLLLLLLZIL2 == null || LLLLLLLZIL2.isEnabled() || !C31073CHl.LIZJ() || (LJJJLL = interfaceC76075TtP.LJJJLL()) == null) {
            return;
        }
        LJJJLL.setVisibility(0);
    }

    @Override // X.C78948Uye
    public final /* bridge */ /* synthetic */ void LJIJI(InterfaceC75966Tre interfaceC75966Tre, InterfaceC28306B9a interfaceC28306B9a, int i) {
        LJJ((InterfaceC76075TtP) interfaceC75966Tre, (C76069TtJ) interfaceC28306B9a);
    }

    public static void LJJI(InterfaceC76075TtP viewHolder, C76069TtJ data, int i, List payloads) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.size() <= 0) {
            LJJ(viewHolder, data);
        } else {
            LJIL(viewHolder, data, true);
        }
    }
}

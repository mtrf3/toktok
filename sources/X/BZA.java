package X;

import Y.AfS20S0400000_5;
import Y.IDDListenerS145S0100000_5;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.dialog.GameFloatWindowTipsDialog;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastInteractionLibraSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BZA implements InterfaceC28918BWo {
    public String LIZ = "go_live_page";

    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 111;
    }

    public final void LIZJ() {
        BZI LIZ = C28787BRn.LIZ("livesdk_overlay_permission_banner_show");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        C06490Nh.LIZLLL(LIZ, this.LIZ, "enter_from", "before_live", "scene_type");
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        FragmentManager supportFragmentManager;
        this.LIZ = "go_live_page";
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(abstractC65782Prm));
        if (BroadcastInteractionLibraSetting.INSTANCE.getValue() != 2 || C40210FqI.LJ(bik.LIZ)) {
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            c84654XKg.resumeWith(bool);
        } else {
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(bik.LIZ);
            if (LIZIZ == null || (supportFragmentManager = LIZIZ.getSupportFragmentManager()) == null) {
                String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_unauthorized_toast");
                if (LIZ == null) {
                    LIZ = C15380j0.LJIILJJIL(R.string.n1p);
                }
                C30868C9o.LJI(LIZ);
                Boolean bool2 = Boolean.TRUE;
                C3C5.m7constructorimpl(bool2);
                c84654XKg.resumeWith(bool2);
            } else {
                C73521StJ c73521StJ = new C73521StJ();
                GameFloatWindowTipsDialog Co = ((IGameService) CN1.LIZ(IGameService.class)).Co("before_live");
                if (Co != null) {
                    Co.setOnDismissListener(new IDDListenerS145S0100000_5(c73521StJ, 13));
                }
                C34K c34k = new C34K();
                c34k.element = true;
                ((InterfaceC29205BdB) new C73469SsT(c73521StJ, new BPJ(((InterfaceC29856Bng) new C73931Szv(bik.LIZJ.getLifecycle(), C73931Szv.LIZJ).LIZIZ.LIZJ(C73933Szx.LJ(bik.LIZJ))).LIZIZ(new AfS20S0400000_5(bik, Co, c34k, this, 2)), bik, this, c84654XKg)).LIZLLL(C73933Szx.LJ(bik.LIZJ))).LIZ();
                if (Co != null) {
                    Co.show(supportFragmentManager, "GameFloatWindowTipsDialog");
                }
                LIZJ();
            }
        }
        return c84654XKg.LIZ();
    }
}

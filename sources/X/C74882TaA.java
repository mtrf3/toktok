package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestUserInfoDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TaA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C74882TaA extends TBS implements InterfaceC88472Yns<EnumC74884TaC, C76800UCe> {
    public C74882TaA(Object obj) {
        super(1, obj, GameLinkGuestUserInfoDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/comp/impl/game/linkmic/dialog/GameLinkDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC74884TaC enumC74884TaC) {
        BaseFragment baseFragment;
        EnumC74884TaC p0 = enumC74884TaC;
        o.LJIIIZ(p0, "p0");
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog = (GameLinkGuestUserInfoDialog) this.receiver;
        gameLinkGuestUserInfoDialog.getClass();
        if (C29306Beo.LJIJJLI(p0.getSource())) {
            gameLinkGuestUserInfoDialog.LJLJLLL = p0.getSource();
        }
        int i = C74883TaB.LIZ[p0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                baseFragment = (BaseFragment) gameLinkGuestUserInfoDialog.LJLLI.getValue();
            } else {
                throw new C162476Zf();
            }
        } else {
            TWQ twq = gameLinkGuestUserInfoDialog.LJLJJLL;
            if (twq != null) {
                twq.LJ = false;
            }
            GameLinkUserInfoFragment gameLinkUserInfoFragment = (GameLinkUserInfoFragment) gameLinkGuestUserInfoDialog.LJLL.getValue();
            TWA twa = gameLinkGuestUserInfoDialog.LJLJJL;
            TWQ twq2 = gameLinkGuestUserInfoDialog.LJLJJLL;
            gameLinkUserInfoFragment.LJLLILLLL = twa;
            gameLinkUserInfoFragment.LJLZ = twq2;
            baseFragment = (BaseFragment) gameLinkGuestUserInfoDialog.LJLL.getValue();
        }
        gameLinkGuestUserInfoDialog.LJLJL = baseFragment;
        FragmentManager childFragmentManager = gameLinkGuestUserInfoDialog.getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        if (p0.getGoNextPage()) {
            LIZ.LJIIJJI(R.anim.hc, R.anim.h_, 0, 0);
        } else {
            LIZ.LJIIJJI(R.anim.h9, R.anim.hd, 0, 0);
        }
        BaseFragment baseFragment2 = gameLinkGuestUserInfoDialog.LJLJL;
        if (baseFragment2 != null) {
            LIZ.LJIIJ(baseFragment2, null, R.id.dqg);
            LIZ.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }
}

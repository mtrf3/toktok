package X;

import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LuU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55758LuU implements InterfaceC55778Luo {
    public final /* synthetic */ RecFeedShareComponentController LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC55778Luo
    public final void LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        RecFeedShareComponentController recFeedShareComponentController = this.LIZ;
        if (recFeedShareComponentController.LJLJLJ) {
            recFeedShareComponentController.LJLIL.onInternalEvent(new C50420Jqa(44));
        }
        RecFeedShareComponentController.LJLLL = true;
        ((ArrayList) recFeedShareComponentController.LJLLI).add(aweme);
    }

    @Override // X.InterfaceC55778Luo
    public final void LIZJ(AbstractC55764Lua reason) {
        o.LJIIIZ(reason, "reason");
        RecFeedShareComponentController recFeedShareComponentController = this.LIZ;
        recFeedShareComponentController.LJLLJ = null;
        RecFeedShareComponentController.LJLLL = false;
        recFeedShareComponentController.LJLIL.onInternalEvent(new C50420Jqa(59));
        if (reason instanceof C55762LuY) {
            this.LIZ.LIZLLL(((C55762LuY) reason).LIZ);
        } else {
            if (!(reason instanceof C55763LuZ)) {
                return;
            }
            this.LIZ.LIZLLL(((C55763LuZ) reason).LIZ);
        }
    }

    public C55758LuU(RecFeedShareComponentController recFeedShareComponentController, boolean z) {
        this.LIZ = recFeedShareComponentController;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC55778Luo
    public final void LIZIZ(EnumC55775Lul enumC55775Lul, Aweme aweme) {
        int i;
        RecFeedShareComponentController recFeedShareComponentController = this.LIZ;
        recFeedShareComponentController.LJLLJ = null;
        RecFeedShareComponentController.LJLLL = false;
        boolean z = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dialog show fail: ");
        LIZ.append(enumC55775Lul);
        LIZ.append(", ");
        LIZ.append(z);
        C221018lt.LJFF("@LinkRelation_OldLogic", X1D.LIZIZ(LIZ));
        if (aweme == null) {
            if (enumC55775Lul == EnumC55775Lul.FAIL_FRIENDS_ONLY) {
                i = R.string.tmo;
            } else if (enumC55775Lul == EnumC55775Lul.FAIL_PRIVATE) {
                i = R.string.tmp;
            } else if (enumC55775Lul == EnumC55775Lul.FAIL_SUBSCRIBERS_ONLY) {
                i = R.string.ru1;
            } else {
                i = R.string.tmq;
            }
            ActivityC45651qj requireActivity = recFeedShareComponentController.LJLIL.getFragment().requireActivity();
            o.LJIIIIZZ(requireActivity, "panel.fragment.requireActivity()");
            C26045AKb c26045AKb = new C26045AKb(requireActivity);
            c26045AKb.LJIIIIZZ(i);
            c26045AKb.LJIIJ();
            return;
        }
        if (C70412pZ.LIZ()) {
            A7X landAutoMsgToChatHelper = IMService.createIIMServicebyMonsterPlugin(false).getLandAutoMsgToChatHelper();
            landAutoMsgToChatHelper.LIZIZ();
            landAutoMsgToChatHelper.LIZ(recFeedShareComponentController.LJLIL.getContext(), new AqS156S0200000_9(recFeedShareComponentController, aweme, 115));
            return;
        }
        recFeedShareComponentController.LIZLLL(aweme);
    }
}

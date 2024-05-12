package X;

import Y.AObserverS67S0200000_3;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.page.PowerPageState;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.7Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187907Za extends C7ZP {
    public final ProfileViewerFragment LJLJI;
    public final /* synthetic */ ProfileViewerFragment LJLJJI;

    @Override // X.C7ZQ
    public final LifecycleOwner getLifecycleOwner() {
        return this.LJLJI;
    }

    public C187907Za(ProfileViewerFragment profileViewerFragment) {
        this.LJLJJI = profileViewerFragment;
        this.LJLJI = profileViewerFragment;
    }

    @Override // X.SYX
    public final void LJIIL(SZZ data) {
        o.LJIIIZ(data, "data");
        if (!IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJII()) {
            return;
        }
        PowerPageState powerPageState = data.LJLIL.LIZJ;
        if ((powerPageState != PowerPageState.End && powerPageState != PowerPageState.Loaded) || this.LJLJJI._$_findCachedViewById(R.id.ncu) == null) {
            return;
        }
        int size = ((ArrayList) ((SYL) this.LJLJJI._$_findCachedViewById(R.id.ncu)).getState().LJII()).size();
        for (int i = 0; i < size; i++) {
            InterfaceC57784Mm4 LJI = ((SYL) this.LJLJJI._$_findCachedViewById(R.id.ncu)).getState().LJI(i);
            if (LJI instanceof C187917Zb) {
                C187917Zb c187917Zb = (C187917Zb) LJI;
                String uid = c187917Zb.LJLIL.user.getUid();
                if (uid != null && uid.length() != 0 && c187917Zb.LJLIL.user.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
                    C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
                    String uid2 = c187917Zb.LJLIL.user.getUid();
                    o.LJIIIIZZ(uid2, "item.viewer.user.uid");
                    ActivityStatus LJIIJ = activityStatusViewModel.LJIIJ(uid2);
                    C72808Sho<InterfaceC57784Mm4> state = ((SYL) this.LJLJJI._$_findCachedViewById(R.id.ncu)).getState();
                    Boolean bool = null;
                    if (LJIIJ != null) {
                        bool = Boolean.valueOf(OUP.LJJII(LJIIJ, null, null, 3));
                    }
                    state.LJIILL(i, C187917Zb.LIZ(c187917Zb, null, bool, LJIIJ, null, 19));
                    String uid3 = c187917Zb.LJLIL.user.getUid();
                    o.LJIIIIZZ(uid3, "item.viewer.user.uid");
                    C7ZR.LIZ(this, uid3, new AObserverS67S0200000_3(this.LJLJJI, LJI, 2));
                }
            }
        }
    }
}

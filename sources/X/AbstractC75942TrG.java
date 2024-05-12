package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;

/* renamed from: X.TrG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75942TrG extends InteractDialogFragmentBaseContract$AbsPresenter<MultiCoHostBeInvitedContract$AbsView> {
    public abstract boolean LIZJ(int i);

    public abstract void LIZLLL(LinkerInviteContent linkerInviteContent, C75678Tn0 c75678Tn0, int i, boolean z, boolean z2);

    public abstract void LJ(LinkerInviteContent linkerInviteContent, int i, java.util.Map<String, ? extends Object> map);

    public abstract void LJFF(C75678Tn0 c75678Tn0, int i, java.util.Map<String, ? extends Object> map);

    public abstract void LJI(LinkerInviteContent linkerInviteContent, int i, java.util.Map<String, ? extends Object> map);

    public abstract void LJII(C75678Tn0 c75678Tn0, int i, java.util.Map<String, ? extends Object> map);

    public abstract void LJIIIIZZ(long j);

    public abstract void LJIIIZ(boolean z);

    public abstract void LJIIJ(boolean z);

    public AbstractC75942TrG(MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment) {
        super(multiCoHostBeInvitedFragment);
    }
}

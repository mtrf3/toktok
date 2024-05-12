package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import kotlin.jvm.internal.o;

/* renamed from: X.TpD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75815TpD extends AbstractC65781Prl implements InterfaceC88472Yns<UserState, UserState> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ LinkStatusViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75815TpD(int i, boolean z, boolean z2, LinkStatusViewModel linkStatusViewModel) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = linkStatusViewModel;
    }

    @Override // X.InterfaceC88472Yns
    public final UserState invoke(UserState userState) {
        UserState changeLocalUserStateImmediately = userState;
        o.LJIIIZ(changeLocalUserStateImmediately, "$this$changeLocalUserStateImmediately");
        int i = changeLocalUserStateImmediately.LJLILLLLZI;
        int i2 = this.LJLIL;
        int i3 = i & i2;
        if (i3 != 0 ? !(i3 <= 0 || !this.LJLILLLLZI) : !this.LJLILLLLZI) {
            i ^= i2;
        }
        boolean z = this.LJLJI;
        if (z) {
            i = ((i >> 6) << 6) + changeLocalUserStateImmediately.audioMuted;
        }
        LinkStatusViewModel linkStatusViewModel = this.LJLJJI;
        boolean z2 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeAudioSource, source = ");
        LIZ.append(i2);
        LIZ.append(", enable = ");
        LIZ.append(z2);
        LIZ.append(", attach = ");
        LIZ.append(z);
        LIZ.append(", audioSource = ");
        LIZ.append(i);
        linkStatusViewModel.jv0(X1D.LIZIZ(LIZ));
        return UserState.LIZ(changeLocalUserStateImmediately, 0, 0, 0, 0, 0, i, 511);
    }
}

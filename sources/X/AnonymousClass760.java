package X;

import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.now.interaction.api.LikeState;
import kotlin.jvm.internal.o;

/* renamed from: X.760, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass760 extends AbstractC65781Prl implements InterfaceC88472Yns<InteractionSyncViewModelState, InteractionSyncViewModelState> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass760(long j, boolean z, boolean z2, String str) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final InteractionSyncViewModelState invoke(InteractionSyncViewModelState interactionSyncViewModelState) {
        InteractionSyncViewModelState setState = interactionSyncViewModelState;
        o.LJIIIZ(setState, "$this$setState");
        return InteractionSyncViewModelState.copy$default(setState, new LikeState(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI), null, null, null, null, null, null, null, 254, null);
    }
}

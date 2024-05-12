package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MjX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57627MjX extends AbstractC65781Prl implements InterfaceC88472Yns<C57629MjZ, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ RecSwipeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57627MjX(int i, int i2, RecSwipeViewModel recSwipeViewModel) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = recSwipeViewModel;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57629MjZ c57629MjZ) {
        C57629MjZ it = c57629MjZ;
        o.LJIIIZ(it, "it");
        if (Math.max(this.LJLIL - 5, 0) == this.LJLILLLLZI && !(it.LJLJJI instanceof C72922tc) && it.LJLIL != null) {
            RecSwipeViewModel recSwipeViewModel = this.LJLJI;
            recSwipeViewModel.getClass();
            recSwipeViewModel.withState(new AqS175S0100000_9(recSwipeViewModel, 603));
        }
        return C76800UCe.LIZ;
    }
}

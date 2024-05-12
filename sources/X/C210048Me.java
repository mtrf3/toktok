package X;

import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionProgressBarComponent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionProgressBarComponent$setProgressBarCount$1", f = "FeedCollectionProgressBarComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8Me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210048Me extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FeedCollectionProgressBarComponent LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210048Me(FeedCollectionProgressBarComponent feedCollectionProgressBarComponent, int i, InterfaceC67352kd<? super C210048Me> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = feedCollectionProgressBarComponent;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C210048Me(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        FeedCollectionProgressBarComponent feedCollectionProgressBarComponent = this.LJLIL;
        if (feedCollectionProgressBarComponent.LLFII == null) {
            feedCollectionProgressBarComponent.LLII = new Integer(this.LJLILLLLZI);
        } else {
            feedCollectionProgressBarComponent.LLII = null;
            C210118Ml c210118Ml = this.LJLIL.LLFII;
            if (c210118Ml != null) {
                c210118Ml.LJ(this.LJLILLLLZI);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

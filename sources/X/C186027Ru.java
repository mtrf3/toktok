package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import fjb.a;
import kotlin.jvm.internal.AqS8S0010000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM$toggleFavorite$1$1$3", f = "MovieDetailVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186027Ru extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MovieDetailVM LJLIL;
    public final /* synthetic */ InterfaceC70422pa LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186027Ru(MovieDetailVM movieDetailVM, InterfaceC70422pa interfaceC70422pa, boolean z, InterfaceC67352kd<? super C186027Ru> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = movieDetailVM;
        this.LJLILLLLZI = interfaceC70422pa;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186027Ru(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        TopicRawInfo topicRawInfo;
        C141335gf.LIZJ(obj);
        C7OG.LIZLLL(C7PV.MOVIE, this.LJLIL.gv0(), this.LJLIL.LJLILLLLZI);
        MovieDetail LIZ = this.LJLIL.getState().LJLIL.LIZ();
        if (LIZ != null) {
            topicRawInfo = LIZ.LIZ();
        } else {
            topicRawInfo = null;
        }
        C2U8.LIZ(new C184807Nc(topicRawInfo, this.LJLIL.LJLILLLLZI));
        this.LJLIL.setState(new AqS8S0010000_3(this.LJLJI, 18));
        C48841JEv.LIZJ(this.LJLILLLLZI, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

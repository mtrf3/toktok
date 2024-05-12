package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM$syncVideoLikeStatus$2", f = "TopVideoHolderVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67732lF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67732lF(int i, Aweme aweme, InterfaceC67352kd<? super C67732lF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C67732lF c67732lF = new C67732lF(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c67732lF.LJLIL = obj;
        return c67732lF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C4 c3c4;
        C3C4 c3c42;
        C141335gf.LIZJ(obj);
        int i = this.LJLILLLLZI;
        Aweme aweme = this.LJLJI;
        try {
            HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("type", String.valueOf(i)), new OSZ("aweme_id", aweme.getAid()), new OSZ("channel_id", String.valueOf(C55688LtM.LIZ("search_result"))));
            C59955Nfz.LIZIZ("search_result", null, LJJJLZIJ);
            C15070iV<String, Integer> LIZJ = FeedActionApi.LIZJ(LJJJLZIJ);
            String str = LIZJ.LIZ;
            Integer num = LIZJ.LIZIZ;
            if (str == null || num == null) {
                c3c42 = null;
            } else {
                int intValue = num.intValue();
                String str2 = str;
                AwemeService.LIZ().l6(intValue, str2);
                aweme.setUserDigg(intValue);
                IEvent iEvent = new IEvent(str2) { // from class: X.2Ot
                    public final String LJLIL;

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof C57832Ot) && o.LJ(this.LJLIL, ((C57832Ot) obj2).LJLIL);
                    }

                    public final int hashCode() {
                        String str3 = this.LJLIL;
                        if (str3 == null) {
                            return 0;
                        }
                        return str3.hashCode();
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C2U8.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C2U8.LIZIZ(this);
                        return this;
                    }

                    public final String toString() {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("TopVideoLikeChangeEvent(aid=");
                        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
                    }

                    {
                        this.LJLIL = str2;
                    }
                };
                C2U8.LIZ(iEvent);
                c3c42 = iEvent;
            }
            C3C5.m7constructorimpl(c3c42);
            c3c4 = c3c42;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            c3c4 = LIZ;
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
        if (m10exceptionOrNullimpl == null) {
            return null;
        }
        return new Integer(android.util.Log.d("TopVideoVm", "syncVideoLikeStatus error: " + m10exceptionOrNullimpl));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

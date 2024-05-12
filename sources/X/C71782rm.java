package X;

import fjb.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.resource.StickerStoreResourceManager$loadData$1$5", f = "StickerStoreResourceManager.kt", l = {114}, m = "invokeSuspend")
/* renamed from: X.2rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71782rm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLILLLLZI;
    public final /* synthetic */ List<KEY> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71782rm(AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp, List<KEY> list, InterfaceC67352kd<? super C71782rm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC71812rp;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71782rm(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp = this.LJLILLLLZI;
            Collection collection = this.LJLJI;
            this.LJLIL = 1;
            obj = abstractC71812rp.LIZLLL(collection, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            List<KEY> list = this.LJLJI;
            AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp2 = this.LJLILLLLZI;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                abstractC71812rp2.LIZIZ.put(it.next(), EnumC71872rv.NETWORK);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

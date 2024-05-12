package X;

import fjb.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.resource.StickerStoreResourceManager$loadData$1$6", f = "StickerStoreResourceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71792rn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLILLLLZI;
    public final /* synthetic */ List<KEY> LJLJI;
    public final /* synthetic */ List<KEY> LJLJJI;
    public final /* synthetic */ List<KEY> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71792rn(boolean z, AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp, List<KEY> list, List<KEY> list2, List<? extends KEY> list3, InterfaceC67352kd<? super C71792rn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = abstractC71812rp;
        this.LJLJI = list;
        this.LJLJJI = list2;
        this.LJLJJL = list3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71792rn(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL) {
            this.LJLILLLLZI.LJIILL();
        }
        AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp = this.LJLILLLLZI;
        CopyOnWriteArrayList<OBSERVER> copyOnWriteArrayList = abstractC71812rp.LIZLLL;
        Collection collection = this.LJLJJL;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC71482rI it2 = (InterfaceC71482rI) it.next();
            o.LJIIIIZZ(it2, "it");
            abstractC71812rp.LJIILJJIL(collection, it2);
        }
        if ((!this.LJLJI.isEmpty()) || (!this.LJLJJI.isEmpty())) {
            this.LJLILLLLZI.LJIL(ORZ.LLIIIZ(this.LJLJJI, this.LJLJI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

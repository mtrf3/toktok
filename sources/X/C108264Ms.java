package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.FilteredListModelImpl$mergeAndNotify$1", f = "FilteredListModelImpl.kt", l = {259}, m = "invokeSuspend")
/* renamed from: X.4Ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108264Ms extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C108274Mt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108264Ms(C108274Mt c108274Mt, InterfaceC67352kd<? super C108264Ms> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c108274Mt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C108264Ms(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                AbstractC108324My abstractC108324My = this.LJLILLLLZI.LJLLILLLL;
                if (abstractC108324My != null) {
                    List<C63120Opw> LJIIIZ = abstractC108324My.LJIIIZ();
                    ArrayList arrayList = new ArrayList();
                    for (C63120Opw c63120Opw : LJIIIZ) {
                        if (c63120Opw.isFiltered()) {
                            arrayList.add(c63120Opw);
                        }
                    }
                    Collection<C63120Opw> values = this.LJLILLLLZI.LJIIIZ().values();
                    o.LJIIIIZZ(values, "filteredNormalConversationMap.values");
                    List LLIIIZ = ORZ.LLIIIZ(arrayList, values);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((ArrayList) LLIIIZ).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (hashSet.add(((C63120Opw) next).getConversationId())) {
                            arrayList2.add(next);
                        }
                    }
                    List LLILII = ORZ.LLILII((Comparator) this.LJLILLLLZI.LJLIL.getValue(), arrayList2);
                    XIF xif = EXV.LIZ;
                    C108294Mv c108294Mv = new C108294Mv(this.LJLILLLLZI, LLILII, null);
                    this.LJLIL = 1;
                    if (XKX.LJI(xif, c108294Mv, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    o.LJIJI("strangerProvider");
                    throw null;
                }
            }
        } catch (Exception e) {
            C63322OtC.LJ("FilteredListModelImpl", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

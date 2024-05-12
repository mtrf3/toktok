package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.processor.GroupChatApplyInfoProcessor$newApplyInfoObserver$1$1", f = "GroupChatApplyInfoProcessor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.39E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39E extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<Long> LJLIL;
    public final /* synthetic */ C39G LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39E(List<Long> list, C39G c39g, InterfaceC67352kd<? super C39E> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c39g;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39E(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r5;
        C3L5 LIZIZ;
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new apply comes! ");
        LIZ.append(this.LJLIL);
        C81843Jc.LIZIZ("SessionRefactor-GroupChatApplyInfo", X1D.LIZIZ(LIZ));
        List<Long> list = this.LJLIL;
        if (list != null) {
            r5 = new ArrayList();
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LJIIZILJ = C4WC.LJIIZILJ(new Long(longValue));
                if (LJIIZILJ != null && (LIZIZ = C82473Ln.LIZIZ(LJIIZILJ, null, true, 6)) != null) {
                    r5.add(LIZIZ);
                }
            }
        } else {
            r5 = C61878OQg.INSTANCE;
        }
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(r5, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (C3L4 c3l4 : r5) {
            OSZ osz = new OSZ(c3l4.LJFF(), c3l4.LIZLLL());
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        InterfaceC88472Yns<? super InterfaceC81693In, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI.LJLIL.LJLJI;
        if (interfaceC88472Yns != null) {
            final java.util.Set keySet = linkedHashMap.keySet();
            interfaceC88472Yns.invoke(new InterfaceC81693In(keySet, linkedHashMap) { // from class: X.39F
                public final Collection<String> LIZ;
                public final java.util.Map<String, CharSequence> LIZIZ;
                public final String LIZJ;

                @Override // X.InterfaceC81703Io
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC81693In
                public final Collection<String> LIZJ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC81703Io
                public final C3L4 LIZLLL(C3L4 c3l42) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("contentMap[session.sessionID] : ");
                    LIZ2.append((Object) this.LIZIZ.get(c3l42.LJFF()));
                    C81843Jc.LIZIZ("SessionRefactor-GroupChatApplyInfo", X1D.LIZIZ(LIZ2));
                    CharSequence charSequence = this.LIZIZ.get(c3l42.LJFF());
                    if (charSequence == null) {
                        charSequence = c3l42.LIZLLL();
                    }
                    c3l42.LJLJJL = charSequence;
                    return c3l42;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    o.LJIIIZ(keySet, "targetSessionIdList");
                    this.LIZ = keySet;
                    this.LIZIZ = linkedHashMap;
                    this.LIZJ = "GroupChatApplyInfoUpdater-UpdateOperation";
                }
            });
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

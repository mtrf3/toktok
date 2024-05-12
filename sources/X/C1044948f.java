package X;

import Y.IDcS364S0100000_1;
import com.bytedance.im.core.proto.ReferenceInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCardManager$queryQuotedMsgList$1", f = "AwemeCardManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.48f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1044948f extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ List<C109544Rq> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1044948f(String str, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1044948f c1044948f = new C1044948f(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
        c1044948f.LJLIL = obj;
        return c1044948f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        EnumC109604Rw enumC109604Rw;
        C141335gf.LIZJ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C109544Rq> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C109544Rq> it = list.iterator();
        while (true) {
            long j = 0;
            if (!it.hasNext()) {
                break;
            }
            C109544Rq next = it.next();
            AnonymousClass489.LIZ.getClass();
            ReferenceInfo referenceInfo = next.getReferenceInfo();
            if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1809 && ((enumC109604Rw = referenceInfo.referenced_message_status) != EnumC109604Rw.DELETED || enumC109604Rw != EnumC109604Rw.NOT_EXIST)) {
                j = next.getRefMsgId();
            }
            arrayList.add(new OSZ(new Long(j), next));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((Number) ((OSZ) next2).getFirst()).longValue() > 0) {
                arrayList2.add(next2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            long longValue = ((Number) osz.getFirst()).longValue();
            Object second = osz.getSecond();
            List list2 = (List) linkedHashMap.get(new Long(longValue));
            if (list2 != null) {
                list2.add(second);
            } else {
                linkedHashMap.put(new Long(longValue), ORZ.LLJILJILJ(C47261Igj.LJJIJ(second)));
            }
        }
        if (linkedHashMap.isEmpty()) {
            return C76800UCe.LIZ;
        }
        AnonymousClass489.LIZ.getClass();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue2 = ((Number) entry.getKey()).longValue();
            Collection collection = (Collection) entry.getValue();
            java.util.Map<Long, List<C109544Rq>> map = AnonymousClass489.LIZLLL;
            List list3 = (List) ((LinkedHashMap) map).get(Long.valueOf(longValue2));
            if (list3 != null) {
                list3.addAll(collection);
            } else {
                map.put(Long.valueOf(longValue2), collection);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            long longValue3 = ((Number) entry2.getKey()).longValue();
            List list4 = (List) entry2.getValue();
            C109544Rq LJIIIIZZ = C106674Gp.LJIIIIZZ(String.valueOf(longValue3));
            if (LJIIIIZZ != null) {
                AnonymousClass489.LIZ.getClass();
                AnonymousClass489.LIZIZ(LJIIIIZZ, list4);
            } else {
                C109544Rq c109544Rq = new C109544Rq();
                c109544Rq.setMsgId(longValue3);
                arrayList3.add(c109544Rq);
            }
        }
        if (!arrayList3.isEmpty()) {
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe.LIZIZ.LIZLLL(new IDcS364S0100000_1(linkedHashMap, 16), this.LJLJI, arrayList3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

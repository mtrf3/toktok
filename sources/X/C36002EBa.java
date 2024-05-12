package X;

import fjb.a;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.ecommerce.useract.UserActManagerNew$updateUserActionData$1", f = "UserActManagerNew.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EBa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36002EBa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36002EBa(String str, String str2, java.util.Map<String, Object> map, InterfaceC67352kd<? super C36002EBa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36002EBa(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        java.util.Map map;
        Object obj2;
        C35689DzZ c35689DzZ;
        java.util.Map<String, Object> map2;
        C141335gf.LIZJ(obj);
        C36033ECf c36033ECf = C36033ECf.LIZ;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        java.util.Map<String, Object> map3 = this.LJLJI;
        synchronized (c36033ECf) {
            java.util.Map<String, LinkedList<java.util.Map<String, Object>>> map4 = C36033ECf.LIZLLL;
            if (((LinkedHashMap) map4).get(str) == null) {
                map4.put(str, new LinkedList<>());
            }
            java.util.Map<String, java.util.Map<String, C35689DzZ>> map5 = C36033ECf.LIZJ;
            if (((LinkedHashMap) map5).get(str) == null) {
                map5.put(str, new LinkedHashMap());
            }
            java.util.Map map6 = (java.util.Map) ((LinkedHashMap) map5).get(str);
            Object obj3 = null;
            if (map6 != null && ((C35689DzZ) map6.get(str2)) != null) {
                java.util.Map map7 = (java.util.Map) ((LinkedHashMap) map5).get(str);
                if (map7 != null) {
                    c35689DzZ = (C35689DzZ) map7.get(str2);
                } else {
                    c35689DzZ = null;
                }
                for (Map.Entry<String, Object> entry : map3.entrySet()) {
                    if (c35689DzZ != null) {
                        c35689DzZ.LIZ(str, entry.getValue(), entry.getKey());
                    }
                }
                java.util.Map<String, LinkedList<java.util.Map<String, Object>>> map8 = C36033ECf.LIZLLL;
                LinkedList linkedList = (LinkedList) ((LinkedHashMap) map8).get(str);
                if (linkedList != null) {
                    if (c35689DzZ == null) {
                        map2 = null;
                    } else {
                        map2 = c35689DzZ.LIZ;
                    }
                    C65777Prh.LIZ(linkedList).remove(map2);
                }
                LinkedList linkedList2 = (LinkedList) ((LinkedHashMap) map8).get(str);
                if (linkedList2 != null) {
                    if (c35689DzZ != null) {
                        obj3 = c35689DzZ.LIZ;
                    }
                    linkedList2.addFirst(obj3);
                }
            } else {
                LinkedList linkedList3 = (LinkedList) ((LinkedHashMap) map4).get(str);
                if (linkedList3 != null) {
                    i = linkedList3.size();
                } else {
                    i = 0;
                }
                if (i >= EH7.LIZ(str)) {
                    LinkedList linkedList4 = (LinkedList) ((LinkedHashMap) map4).get(str);
                    if (linkedList4 != null) {
                        map = (java.util.Map) linkedList4.removeLast();
                    } else {
                        map = null;
                    }
                    java.util.Map map9 = (java.util.Map) ((LinkedHashMap) map5).get(str);
                    if (map9 != null) {
                        if (map != null && (obj2 = map.get(str2)) != null) {
                            obj3 = obj2.toString();
                        }
                    }
                }
                C35689DzZ c35689DzZ2 = new C35689DzZ(map3);
                LinkedList linkedList5 = (LinkedList) ((LinkedHashMap) map4).get(str);
                if (linkedList5 != null) {
                    linkedList5.addFirst(c35689DzZ2.LIZ);
                }
                java.util.Map map10 = (java.util.Map) ((LinkedHashMap) map5).get(str);
                if (map10 != null) {
                    map10.put(str2, c35689DzZ2);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

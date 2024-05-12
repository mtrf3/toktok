package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4Kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107574Kb implements InterfaceC70422pa {
    public static final C107574Kb LJLIL = new C107574Kb();
    public static final XIA LJLILLLLZI = C78613UtF.LIZJ;
    public static final java.util.Map<String, java.util.Map<IMContact, C33R<EnumC107604Ke>>> LJLJI = new LinkedHashMap();
    public static final java.util.Map<String, java.util.Map<IMContact, C107584Kc>> LJLJJI = new LinkedHashMap();

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return LJLILLLLZI;
    }

    public static C33R LIZ(IMContact iMContact, String uuid) {
        o.LJIIIZ(uuid, "uuid");
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJLJI;
        Object obj = linkedHashMap.get(uuid);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(uuid, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        Object obj2 = map.get(iMContact);
        if (obj2 == null) {
            obj2 = V8H.LIZ(EnumC107604Ke.INIT);
            map.put(iMContact, obj2);
        }
        return (C33R) obj2;
    }
}

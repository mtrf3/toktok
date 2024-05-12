package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.AqS91S0101000_1;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPU implements InterfaceC42234Ghq<InterfaceC43620HAa> {
    public final CreativeInfo LIZ;
    public final CreativeInfo LIZIZ;
    public final InterfaceC88471Ynr<String, String, C76800UCe> LIZJ;
    public final java.util.Map<String, String> LIZLLL = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZLLL;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = (String) C60903NvH.LJIIJJI().LJJJI().LJIIJ().LIZ(str, this.LIZ, this.LIZIZ).getSecond();
            linkedHashMap.put(str, obj);
            if (obj == null) {
                return;
            }
        }
        if (!o.LJ(obj, str)) {
            interfaceC88472Yns.invoke(obj);
            this.LIZJ.invoke(str, obj);
        }
    }

    public GPU(CreativeInfo creativeInfo, CreativeInfo creativeInfo2, AqS186S0100000_4 aqS186S0100000_4) {
        this.LIZ = creativeInfo;
        this.LIZIZ = creativeInfo2;
        this.LIZJ = aqS186S0100000_4;
    }

    @Override // X.InterfaceC42234Ghq
    public final void LJ(Field field, Object any, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(any, "any");
        Object obj = field.get(any);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }");
        LJFF((String) obj, new AqS138S0200000_7(field, any, 71));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZIZ(Field arrayField, String[] strArr, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(arrayField, "arrayField");
        LJFF(strArr[i], new AqS95S0101000_7(i, strArr, 17));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZJ(Field listField, List list, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(listField, "listField");
        Object obj = ListProtector.get(list, i);
        o.LJIIIIZZ(obj, "list[index]");
        LJFF((String) obj, new AqS91S0101000_1(list, (List<String>) i, 3));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZLLL(Field mapField, java.util.Map map, Object obj, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(mapField, "mapField");
        Object obj2 = map.get(obj);
        o.LJIIIIZZ(obj2, "map[key]");
        LJFF((String) obj2, new AqS132S0200000_1(obj, map, 71));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZ(Field setField, java.util.Set set, String str, InterfaceC43620HAa interfaceC43620HAa, List replaceList) {
        o.LJIIIZ(setField, "setField");
        o.LJIIIZ(replaceList, "replaceList");
        LJFF(str, new AqS55S1100000_1(replaceList, (List<OSZ<String, String>>) str, (String) 7));
    }
}

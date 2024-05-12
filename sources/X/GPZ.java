package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.AqS91S0101000_1;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPZ implements InterfaceC42234Ghq<InterfaceC43620HAa> {
    public final /* synthetic */ java.util.Map<String, String> LIZ;

    public GPZ(java.util.Map<String, String> map) {
        this.LIZ = map;
    }

    @Override // X.InterfaceC42234Ghq
    public final void LJ(Field field, Object any, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(any, "any");
        java.util.Map<String, String> map = this.LIZ;
        Object obj = field.get(any);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }");
        C43659HBn.LJII(map, (String) obj, new AqS138S0200000_7(field, any, 78));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZIZ(Field arrayField, String[] strArr, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(arrayField, "arrayField");
        C43659HBn.LJII(this.LIZ, strArr[i], new AqS95S0101000_7(i, strArr, 19));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZJ(Field listField, List list, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(listField, "listField");
        java.util.Map<String, String> map = this.LIZ;
        Object obj = ListProtector.get(list, i);
        o.LJIIIIZZ(obj, "list[index]");
        C43659HBn.LJII(map, (String) obj, new AqS91S0101000_1(list, (List<String>) i, 5));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZLLL(Field mapField, java.util.Map map, Object obj, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(mapField, "mapField");
        java.util.Map<String, String> map2 = this.LIZ;
        Object obj2 = map.get(obj);
        o.LJIIIIZZ(obj2, "map[key]");
        C43659HBn.LJII(map2, (String) obj2, new AqS132S0200000_1(obj, map, 75));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZ(Field setField, java.util.Set set, String str, InterfaceC43620HAa interfaceC43620HAa, List replaceList) {
        o.LJIIIZ(setField, "setField");
        o.LJIIIZ(replaceList, "replaceList");
        C43659HBn.LJII(this.LIZ, str, new AqS55S1100000_1(replaceList, (List<OSZ<String, String>>) str, (String) 9));
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.AqS91S0101000_1;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GPa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41462GPa implements InterfaceC42234Ghq<InterfaceC43620HAa> {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<String, String, C76800UCe> LIZIZ;
    public final /* synthetic */ CreativeInfo LIZJ;
    public final /* synthetic */ List<DraftFileSaveResult> LIZLLL;
    public final /* synthetic */ List<DraftFileSaveResult> LJ;

    @Override // X.InterfaceC42234Ghq
    public final void LJ(Field field, Object any, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(any, "any");
        java.util.Map<String, String> map = this.LIZ;
        InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
        CreativeInfo creativeInfo = this.LIZJ;
        List<DraftFileSaveResult> list = this.LIZLLL;
        List<DraftFileSaveResult> list2 = this.LJ;
        Object obj = field.get(any);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }");
        GX4.LJ(map, interfaceC88471Ynr, creativeInfo, list, list2, (String) obj, interfaceC43620HAa, new AqS138S0200000_7(field, any, 77));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZIZ(Field arrField, String[] strArr, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(arrField, "arrField");
        GX4.LJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, strArr[i], interfaceC43620HAa, new AqS95S0101000_7(i, strArr, 18));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZJ(Field listField, List list, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(listField, "listField");
        java.util.Map<String, String> map = this.LIZ;
        InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
        CreativeInfo creativeInfo = this.LIZJ;
        List<DraftFileSaveResult> list2 = this.LIZLLL;
        List<DraftFileSaveResult> list3 = this.LJ;
        Object obj = ListProtector.get(list, i);
        o.LJIIIIZZ(obj, "list[index]");
        GX4.LJ(map, interfaceC88471Ynr, creativeInfo, list2, list3, (String) obj, interfaceC43620HAa, new AqS91S0101000_1(list, (List<String>) i, 4));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZLLL(Field mapField, java.util.Map map, Object obj, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(mapField, "mapField");
        java.util.Map<String, String> map2 = this.LIZ;
        InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
        CreativeInfo creativeInfo = this.LIZJ;
        List<DraftFileSaveResult> list = this.LIZLLL;
        List<DraftFileSaveResult> list2 = this.LJ;
        Object obj2 = map.get(obj);
        o.LJIIIIZZ(obj2, "map[key]");
        GX4.LJ(map2, interfaceC88471Ynr, creativeInfo, list, list2, (String) obj2, interfaceC43620HAa, new AqS132S0200000_1(obj, map, 74));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41462GPa(java.util.Map<String, String> map, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr, CreativeInfo creativeInfo, List<DraftFileSaveResult> list, List<DraftFileSaveResult> list2) {
        this.LIZ = map;
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = creativeInfo;
        this.LIZLLL = list;
        this.LJ = list2;
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZ(Field setField, java.util.Set set, String str, InterfaceC43620HAa interfaceC43620HAa, List replaceList) {
        o.LJIIIZ(setField, "setField");
        o.LJIIIZ(replaceList, "replaceList");
        GX4.LJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, str, interfaceC43620HAa, new AqS55S1100000_1(replaceList, (List<OSZ<String, String>>) str, (String) 8));
    }
}

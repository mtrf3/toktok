package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPY implements InterfaceC42234Ghq<InterfaceC43620HAa> {
    public final /* synthetic */ java.util.Map<String, Boolean> LIZ;
    public final /* synthetic */ CreativeInfo LIZIZ;
    public final /* synthetic */ List<DraftFileCheckResult> LIZJ;
    public final /* synthetic */ List<DraftFileCheckResult> LIZLLL;

    @Override // X.InterfaceC42234Ghq
    public final void LJ(Field field, Object any, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(any, "any");
        java.util.Map<String, Boolean> map = this.LIZ;
        CreativeInfo creativeInfo = this.LIZIZ;
        List<DraftFileCheckResult> list = this.LIZJ;
        List<DraftFileCheckResult> list2 = this.LIZLLL;
        Object obj = field.get(any);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }");
        GX8.LIZJ(map, creativeInfo, list, list2, (String) obj, interfaceC43620HAa, field);
    }

    public GPY(java.util.Map<String, Boolean> map, CreativeInfo creativeInfo, List<DraftFileCheckResult> list, List<DraftFileCheckResult> list2) {
        this.LIZ = map;
        this.LIZIZ = creativeInfo;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZIZ(Field arrayField, String[] strArr, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(arrayField, "arrayField");
        GX8.LIZJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, strArr[i], interfaceC43620HAa, arrayField);
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZJ(Field listField, List list, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(listField, "listField");
        java.util.Map<String, Boolean> map = this.LIZ;
        CreativeInfo creativeInfo = this.LIZIZ;
        List<DraftFileCheckResult> list2 = this.LIZJ;
        List<DraftFileCheckResult> list3 = this.LIZLLL;
        Object obj = ListProtector.get(list, i);
        o.LJIIIIZZ(obj, "list[index]");
        GX8.LIZJ(map, creativeInfo, list2, list3, (String) obj, interfaceC43620HAa, listField);
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZLLL(Field mapField, java.util.Map map, Object obj, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(mapField, "mapField");
        java.util.Map<String, Boolean> map2 = this.LIZ;
        CreativeInfo creativeInfo = this.LIZIZ;
        List<DraftFileCheckResult> list = this.LIZJ;
        List<DraftFileCheckResult> list2 = this.LIZLLL;
        Object obj2 = map.get(obj);
        o.LJIIIIZZ(obj2, "map[key]");
        GX8.LIZJ(map2, creativeInfo, list, list2, (String) obj2, interfaceC43620HAa, mapField);
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZ(Field setField, java.util.Set set, String str, InterfaceC43620HAa interfaceC43620HAa, List replaceList) {
        o.LJIIIZ(setField, "setField");
        o.LJIIIZ(replaceList, "replaceList");
        GX8.LIZJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, str, interfaceC43620HAa, setField);
    }
}

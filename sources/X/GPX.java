package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.AqS91S0101000_1;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPX implements InterfaceC42234Ghq<InterfaceC43620HAa> {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ AwemeDraft LIZIZ;
    public final /* synthetic */ CreativeInfo LIZJ;
    public final /* synthetic */ CreativeInfo LIZLLL;
    public final /* synthetic */ List<DraftFileRestoreResult> LJ;
    public final /* synthetic */ List<DraftFileRestoreResult> LJFF;

    @Override // X.InterfaceC42234Ghq
    public final void LJ(Field field, Object any, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(any, "any");
        java.util.Map<String, String> map = this.LIZ;
        AwemeDraft awemeDraft = this.LIZIZ;
        CreativeInfo creativeInfo = this.LIZJ;
        CreativeInfo creativeInfo2 = this.LIZLLL;
        List<DraftFileRestoreResult> list = this.LJ;
        List<DraftFileRestoreResult> list2 = this.LJFF;
        Object obj = field.get(any);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }");
        C168796jr.LIZIZ(map, awemeDraft, creativeInfo, creativeInfo2, list, list2, (String) obj, interfaceC43620HAa, new AqS138S0200000_7(field, any, 79));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZIZ(Field arrayField, String[] strArr, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(arrayField, "arrayField");
        C168796jr.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, strArr[i], interfaceC43620HAa, new AqS95S0101000_7(i, strArr, 20));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZJ(Field listField, List list, int i, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(listField, "listField");
        java.util.Map<String, String> map = this.LIZ;
        AwemeDraft awemeDraft = this.LIZIZ;
        CreativeInfo creativeInfo = this.LIZJ;
        CreativeInfo creativeInfo2 = this.LIZLLL;
        List<DraftFileRestoreResult> list2 = this.LJ;
        List<DraftFileRestoreResult> list3 = this.LJFF;
        Object obj = ListProtector.get(list, i);
        o.LJIIIIZZ(obj, "list[index]");
        C168796jr.LIZIZ(map, awemeDraft, creativeInfo, creativeInfo2, list2, list3, (String) obj, interfaceC43620HAa, new AqS91S0101000_1(list, (List<String>) i, 7));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZLLL(Field mapField, java.util.Map map, Object obj, InterfaceC43620HAa interfaceC43620HAa) {
        o.LJIIIZ(mapField, "mapField");
        java.util.Map<String, String> map2 = this.LIZ;
        AwemeDraft awemeDraft = this.LIZIZ;
        CreativeInfo creativeInfo = this.LIZJ;
        CreativeInfo creativeInfo2 = this.LIZLLL;
        List<DraftFileRestoreResult> list = this.LJ;
        List<DraftFileRestoreResult> list2 = this.LJFF;
        Object obj2 = map.get(obj);
        o.LJIIIIZZ(obj2, "map[key]");
        C168796jr.LIZIZ(map2, awemeDraft, creativeInfo, creativeInfo2, list, list2, (String) obj2, interfaceC43620HAa, new AqS132S0200000_1(obj, map, 76));
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZ(Field setField, java.util.Set set, String str, InterfaceC43620HAa interfaceC43620HAa, List replaceList) {
        o.LJIIIZ(setField, "setField");
        o.LJIIIZ(replaceList, "replaceList");
        C168796jr.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, str, interfaceC43620HAa, new AqS55S1100000_1(replaceList, (List<OSZ<String, String>>) str, (String) 10));
    }

    public GPX(java.util.Map<String, String> map, AwemeDraft awemeDraft, CreativeInfo creativeInfo, CreativeInfo creativeInfo2, List<DraftFileRestoreResult> list, List<DraftFileRestoreResult> list2) {
        this.LIZ = map;
        this.LIZIZ = awemeDraft;
        this.LIZJ = creativeInfo;
        this.LIZLLL = creativeInfo2;
        this.LJ = list;
        this.LJFF = list2;
    }
}

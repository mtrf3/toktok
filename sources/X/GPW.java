package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPW implements InterfaceC42234Ghq<Object> {
    public final /* synthetic */ java.util.Set<String> LIZ;

    public GPW(C43068GvI c43068GvI) {
        this.LIZ = c43068GvI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42234Ghq
    public final void LJ(Field field, Object any, Object obj) {
        o.LJIIIZ(any, "any");
        java.util.Set<String> set = this.LIZ;
        Object obj2 = field.get(any);
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }");
        set.add(obj2);
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZIZ(Field arrayField, String[] strArr, int i, Object obj) {
        o.LJIIIZ(arrayField, "arrayField");
        this.LIZ.add(strArr[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42234Ghq
    public final void LIZJ(Field listField, List<String> list, int i, Object obj) {
        o.LJIIIZ(listField, "listField");
        java.util.Set<String> set = this.LIZ;
        Object obj2 = ListProtector.get(list, i);
        o.LJIIIIZZ(obj2, "list[index]");
        set.add(obj2);
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZLLL(Field mapField, java.util.Map<Object, String> map, Object obj, Object obj2) {
        o.LJIIIZ(mapField, "mapField");
        java.util.Set<String> set = this.LIZ;
        String str = map.get(obj);
        o.LJIIIIZZ(str, "map[key]");
        set.add(str);
    }

    @Override // X.InterfaceC42234Ghq
    public final void LIZ(Field setField, java.util.Set<String> set, String str, Object obj, List<OSZ<String, String>> replaceList) {
        o.LJIIIZ(setField, "setField");
        o.LJIIIZ(replaceList, "replaceList");
        this.LIZ.add(str);
    }
}

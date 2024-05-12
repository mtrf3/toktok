package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.0vS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23100vS extends LinkedHashMap<Long, List<? extends String>> {
    public static final C23090vR Companion = new Object() { // from class: X.0vR
    };
    public InterfaceC88472Yns<? super Map.Entry<Long, List<String>>, C76800UCe> LJLIL;

    public final List<String> toList() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, List<String>> entry : entrySet()) {
            arrayList.add(String.valueOf(entry.getKey().longValue()));
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<Long, List<String>>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<Long, List<String>>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<Long> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<List<String>> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Long> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<List<String>> values() {
        return getValues();
    }

    public final InterfaceC88472Yns<Map.Entry<Long, List<String>>, C76800UCe> getOnEvictionListener() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23100vS(List<String> list) {
        super(30, 0.75f, true);
        o.LJIIIZ(list, "list");
        int i = 0;
        int LJIJ = C78939UyV.LJIJ(0, list.size() - 1, 4);
        if (LJIJ < 0) {
            return;
        }
        while (true) {
            if (i + 3 < list.size()) {
                put(Long.valueOf(CastLongProtector.parseLong((String) ListProtector.get(list, i))), list.subList(i + 1, i + 4));
            }
            if (i != LJIJ) {
                i += 4;
            } else {
                return;
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return containsKey((Long) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return containsValue((List<String>) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return get((Long) obj);
    }

    public final void registerOnEvictionListener(InterfaceC88472Yns<? super Map.Entry<Long, List<String>>, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, List<? extends String>> entry) {
        if (size() > 30) {
            InterfaceC88472Yns<? super Map.Entry<Long, List<String>>, C76800UCe> interfaceC88472Yns = this.LJLIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(entry);
            }
            return true;
        }
        return false;
    }

    public final void setOnEvictionListener(InterfaceC88472Yns<? super Map.Entry<Long, List<String>>, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    public /* bridge */ boolean containsKey(Long l) {
        return super.containsKey((Object) l);
    }

    public /* bridge */ boolean containsValue(List<String> list) {
        return super.containsValue((Object) list);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ List<String> get(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return get((Long) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ List<String> remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    public /* bridge */ List<String> get(Long l) {
        return (List) super.get((Object) l);
    }

    public /* bridge */ List<String> remove(Long l) {
        return (List) super.remove((Object) l);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Long)) {
            return obj2;
        }
        return getOrDefault((Long) obj, (List<String>) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Long) || !(obj2 instanceof List)) {
            return false;
        }
        return remove((Long) obj, (List<String>) obj2);
    }

    public final /* bridge */ List getOrDefault(Object obj, List list) {
        if (!(obj instanceof Long)) {
            return list;
        }
        return getOrDefault((Long) obj, (List<String>) list);
    }

    public /* bridge */ boolean remove(Long l, List<String> list) {
        return super.remove((Object) l, (Object) list);
    }

    public /* bridge */ List<String> getOrDefault(Long l, List<String> list) {
        return (List) super.getOrDefault((Object) l, (Long) list);
    }
}

package X;

import java.util.AbstractMap;

/* renamed from: X.PmS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65452PmS extends AbstractMap<String, Object> {
    public final Object LJLIL;
    public final C65453PmT LJLILLLLZI;

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new C65455PmV(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C65454PmU LIZ;
        if (!(obj instanceof String) || (LIZ = this.LJLILLLLZI.LIZ((String) obj)) == null) {
            return null;
        }
        return LIZ.LIZ(this.LJLIL);
    }

    public C65452PmS(Object obj, boolean z) {
        this.LJLIL = obj;
        this.LJLILLLLZI = C65453PmT.LIZIZ(obj.getClass(), z);
        C77357UXp.LJFF(!r0.LIZ.isEnum());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        C65454PmU LIZ = this.LJLILLLLZI.LIZ(str2);
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "no field of key ".concat(valueOf);
        } else {
            str = new String("no field of key ");
        }
        C77357UXp.LJI(LIZ, str);
        Object LIZ2 = LIZ.LIZ(this.LJLIL);
        Object obj3 = this.LJLIL;
        obj2.getClass();
        LIZ.LIZLLL(obj3, obj2);
        return LIZ2;
    }
}

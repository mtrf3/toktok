package X;

import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: X.PmL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65445PmL extends AbstractMap<String, Object> implements Cloneable {
    public java.util.Map<String, Object> LJLIL;
    public final C65453PmT LJLILLLLZI;

    public C65445PmL() {
        this(EnumSet.noneOf(PO2.class));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<String, Object>> entrySet() {
        return new C65451PmR(this);
    }

    @Override // java.util.AbstractMap
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public C65445PmL clone() {
        try {
            C65445PmL c65445PmL = (C65445PmL) super.clone();
            C65444PmK.LIZIZ(this, c65445PmL);
            c65445PmL.LJLIL = (java.util.Map) C65444PmK.LIZ(this.LJLIL);
            return c65445PmL;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public C65445PmL(EnumSet<PO2> enumSet) {
        this.LJLIL = new C65446PmM();
        this.LJLILLLLZI = C65453PmT.LIZIZ(getClass(), enumSet.contains(PO2.IGNORE_CASE));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C65454PmU LIZ = this.LJLILLLLZI.LIZ(str);
        if (LIZ != null) {
            return LIZ.LIZ(this);
        }
        if (this.LJLILLLLZI.LIZIZ) {
            str = str.toLowerCase();
        }
        return this.LJLIL.get(str);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            LIZIZ(entry.getValue(), entry.getKey());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.LJLILLLLZI.LIZ(str) == null) {
            if (this.LJLILLLLZI.LIZIZ) {
                str = str.toLowerCase();
            }
            return this.LJLIL.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public void LIZIZ(Object obj, String str) {
        C65454PmU LIZ = this.LJLILLLLZI.LIZ(str);
        if (LIZ != null) {
            LIZ.LIZLLL(this, obj);
            return;
        }
        if (this.LJLILLLLZI.LIZIZ) {
            str = str.toLowerCase();
        }
        this.LJLIL.put(str, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        C65454PmU LIZ = this.LJLILLLLZI.LIZ(str);
        if (LIZ != null) {
            Object LIZ2 = LIZ.LIZ(this);
            LIZ.LIZLLL(this, obj2);
            return LIZ2;
        }
        if (this.LJLILLLLZI.LIZIZ) {
            str = str.toLowerCase();
        }
        return this.LJLIL.put(str, obj2);
    }
}

package X;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41281jg implements Map.Entry<Object, Object>, EHP {
    public final Object LJLIL;
    public Object LJLILLLLZI;
    public final /* synthetic */ C1IH<Object, Object> LJLJI;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.LJLIL;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LJLILLLLZI;
    }

    public C41281jg(C1IH<Object, Object> c1ih) {
        this.LJLJI = c1ih;
        Map.Entry<? extends Object, ? extends Object> entry = c1ih.LJLJJI;
        o.LJI(entry);
        this.LJLIL = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = c1ih.LJLJJI;
        o.LJI(entry2);
        this.LJLILLLLZI = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1IH<Object, Object> c1ih = this.LJLJI;
        if (c1ih.LJLIL.LIZ().LIZLLL == c1ih.LJLJI) {
            Object obj2 = this.LJLILLLLZI;
            c1ih.LJLIL.put(this.LJLIL, obj);
            this.LJLILLLLZI = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}

package androidx.databinding;

import X.AbstractC024407s;
import X.InterfaceC024507t;
import android.view.View;
import defpackage.i0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC024407s {
    public final Set<Class<? extends AbstractC024407s>> LIZ = new HashSet();
    public final List<AbstractC024407s> LIZIZ = new CopyOnWriteArrayList();
    public final List<String> LIZJ = new CopyOnWriteArrayList();

    public final boolean LJFF() {
        Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC024407s.class.isAssignableFrom(cls)) {
                    LIZLLL((AbstractC024407s) cls.newInstance());
                    ((CopyOnWriteArrayList) this.LIZJ).remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return z;
    }

    public final void LIZLLL(AbstractC024407s abstractC024407s) {
        if (((HashSet) this.LIZ).add(abstractC024407s.getClass())) {
            ((CopyOnWriteArrayList) this.LIZIZ).add(abstractC024407s);
            Iterator<AbstractC024407s> it = abstractC024407s.LIZ().iterator();
            while (it.hasNext()) {
                LIZLLL(it.next());
            }
        }
    }

    public final void LJ(String str) {
        ((CopyOnWriteArrayList) this.LIZJ).add(i0.LJFF(str, ".DataBinderMapperImpl"));
    }

    @Override // X.AbstractC024407s
    public final ViewDataBinding LIZIZ(InterfaceC024507t interfaceC024507t, View view, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ViewDataBinding LIZIZ = ((AbstractC024407s) it.next()).LIZIZ(interfaceC024507t, view, i);
            if (LIZIZ != null) {
                return LIZIZ;
            }
        }
        if (LJFF()) {
            return LIZIZ(interfaceC024507t, view, i);
        }
        return null;
    }

    @Override // X.AbstractC024407s
    public final ViewDataBinding LIZJ(InterfaceC024507t interfaceC024507t, View[] viewArr, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ViewDataBinding LIZJ = ((AbstractC024407s) it.next()).LIZJ(interfaceC024507t, viewArr, i);
            if (LIZJ != null) {
                return LIZJ;
            }
        }
        if (LJFF()) {
            return LIZJ(interfaceC024507t, viewArr, i);
        }
        return null;
    }
}

package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.LDf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC53895LDf {
    public AbstractC53892LDc LJLIL;
    public final CopyOnWriteArrayList<InterfaceC53896LDg> LJLILLLLZI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<Object> LJLJI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC53905LDp> LJLJJI = new CopyOnWriteArrayList<>();

    public abstract Bundle LJIIIZ();

    public abstract Class<? extends Fragment> LJIIJ();

    public String LJIIL() {
        return "";
    }

    public abstract String tag();

    public final LinkedList<AbstractC53895LDf> LJIIJJI() {
        LinkedList<AbstractC53895LDf> linkedList = new LinkedList<>();
        for (AbstractC53895LDf abstractC53895LDf = this; abstractC53895LDf != null; abstractC53895LDf = abstractC53895LDf.LJLIL) {
            linkedList.add(0, abstractC53895LDf);
        }
        return linkedList;
    }

    public void LJIIIIZZ(InterfaceC53907LDr observer) {
        o.LJIIJ(observer, "observer");
        if (!ORZ.LJLJJI(observer, this.LJLILLLLZI)) {
            if (observer instanceof InterfaceC53896LDg) {
                this.LJLILLLLZI.add(observer);
            }
            if (observer instanceof InterfaceC53905LDp) {
                this.LJLJJI.add(observer);
                return;
            }
            return;
        }
        throw new RuntimeException("have been added, cannot add again");
    }

    public final void LJIILL(AbstractC53892LDc abstractC53892LDc) {
        String str;
        if (abstractC53892LDc == null) {
            str = android.util.Log.getStackTraceString(new Exception());
        } else {
            str = "";
        }
        o.LJFF(str, "if (value == null) {\n   …         \"\"\n            }");
        L9I l9i = L9J.LIZ;
        if (l9i != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set parent: child: ");
            LIZ.append(this);
            LIZ.append(", parent: ");
            LIZ.append(abstractC53892LDc);
            LIZ.append(", extra: ");
            LIZ.append(str);
            l9i.log(X1D.LIZIZ(LIZ));
        }
        this.LJLIL = abstractC53892LDc;
    }

    public void LJIILIIL(AbstractC53895LDf abstractC53895LDf, AbstractC53895LDf abstractC53895LDf2, List<InterfaceC53894LDe> hoxVisibleObserver) {
        String str;
        String str2;
        o.LJIIJ(hoxVisibleObserver, "hoxVisibleObserver");
        if (abstractC53895LDf2 != null) {
            if (abstractC53895LDf != null) {
                str = abstractC53895LDf.tag();
            } else {
                str = null;
            }
            if (o.LJ(str, abstractC53895LDf2.tag())) {
                return;
            }
            for (InterfaceC53894LDe interfaceC53894LDe : hoxVisibleObserver) {
                if (abstractC53895LDf != null) {
                    str2 = abstractC53895LDf.tag();
                } else {
                    str2 = null;
                }
                interfaceC53894LDe.LJLJL(str2, abstractC53895LDf2.tag());
            }
        }
    }

    public void LJIILJJIL(AbstractC53895LDf abstractC53895LDf, AbstractC53895LDf currentChild, CopyOnWriteArrayList<InterfaceC53894LDe> changNodeObserver) {
        String str;
        o.LJIIJ(currentChild, "currentChild");
        o.LJIIJ(changNodeObserver, "changNodeObserver");
        Iterator<InterfaceC53894LDe> it = changNodeObserver.iterator();
        while (it.hasNext()) {
            InterfaceC53894LDe next = it.next();
            if (abstractC53895LDf != null) {
                str = abstractC53895LDf.tag();
            } else {
                str = null;
            }
            next.LJLJL(str, currentChild.tag());
        }
    }
}

package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.LDc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC53892LDc extends AbstractC53895LDf {
    public AbstractC53895LDf LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJJL = true;
    public final List<AbstractC53895LDf> LJLJLJ = new ArrayList();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C53893LDd.LJLIL);

    public abstract boolean LJIJI();

    public abstract void LJJ(Bundle bundle, String str);

    public final void LJIILLIIL(AbstractC53895LDf abstractC53895LDf) {
        if (!((ArrayList) this.LJLJLJ).contains(abstractC53895LDf)) {
            L9I l9i = L9J.LIZ;
            if (l9i != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add child: parent > ");
                LIZ.append(this);
                LIZ.append(", child > ");
                LIZ.append(abstractC53895LDf);
                l9i.log(X1D.LIZIZ(LIZ));
            }
            abstractC53895LDf.LJIILL(this);
            ((ArrayList) this.LJLJLJ).add(abstractC53895LDf);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addChild(), already has childNode ");
        LIZ2.append(abstractC53895LDf.tag());
        throw new RuntimeException(X1D.LIZIZ(LIZ2));
    }

    public final void LJIIZILJ(InterfaceC53894LDe interfaceC53894LDe) {
        ((CopyOnWriteArrayList) this.LJLJLLL.getValue()).add(interfaceC53894LDe);
    }

    public final void LJIJJ(Bundle bundle) {
        CopyOnWriteArrayList<InterfaceC53896LDg> copyOnWriteArrayList;
        this.LJLJL = false;
        if (this.LJLJJL) {
            return;
        }
        AbstractC53895LDf abstractC53895LDf = this.LJLJJLL;
        if (abstractC53895LDf instanceof AbstractC53892LDc) {
            if (abstractC53895LDf != null) {
                ((AbstractC53892LDc) abstractC53895LDf).LJIJJ(bundle);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
            }
        }
        AbstractC53895LDf abstractC53895LDf2 = this.LJLJJLL;
        if (abstractC53895LDf2 != null && (copyOnWriteArrayList = abstractC53895LDf2.LJLILLLLZI) != null) {
            Iterator<InterfaceC53896LDg> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LLLLILI(bundle);
            }
        }
    }

    public final void LJIJJLI(Bundle bundle) {
        CopyOnWriteArrayList<InterfaceC53896LDg> copyOnWriteArrayList;
        CopyOnWriteArrayList<InterfaceC53896LDg> copyOnWriteArrayList2;
        AbstractC53895LDf abstractC53895LDf = this.LJLJJLL;
        if (abstractC53895LDf != null && (copyOnWriteArrayList2 = abstractC53895LDf.LJLILLLLZI) != null) {
            copyOnWriteArrayList2.size();
        }
        this.LJLJL = true;
        AbstractC53895LDf abstractC53895LDf2 = this.LJLJJLL;
        if (abstractC53895LDf2 != null && (copyOnWriteArrayList = abstractC53895LDf2.LJLILLLLZI) != null) {
            Iterator<InterfaceC53896LDg> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LLLLLLZ(bundle);
            }
        }
        if (this.LJLJJL) {
            this.LJLJJL = false;
            return;
        }
        AbstractC53895LDf abstractC53895LDf3 = this.LJLJJLL;
        if (abstractC53895LDf3 instanceof AbstractC53892LDc) {
            if (abstractC53895LDf3 != null) {
                ((AbstractC53892LDc) abstractC53895LDf3).LJIJJLI(bundle);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
        }
    }

    public final void LJIL(InterfaceC53894LDe interfaceC53894LDe) {
        ((CopyOnWriteArrayList) this.LJLJLLL.getValue()).remove(interfaceC53894LDe);
    }

    public final void LJIJ(String tag, Bundle bundle, CopyOnWriteArrayList<InterfaceC53894LDe> changNodeObserver, CopyOnWriteArrayList<InterfaceC53894LDe> changeEndNodeObserver) {
        String str;
        String str2;
        o.LJIIJ(tag, "tag");
        o.LJIIJ(changNodeObserver, "changNodeObserver");
        o.LJIIJ(changeEndNodeObserver, "changeEndNodeObserver");
        Iterator it = ((ArrayList) this.LJLJLJ).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (o.LJ(((AbstractC53895LDf) next).tag(), tag)) {
                    if (i < ((ArrayList) this.LJLJLJ).size()) {
                        AbstractC53895LDf LJJIFFI = UC0.LJJIFFI(this.LJLJJLL);
                        AbstractC53895LDf abstractC53895LDf = this.LJLJJLL;
                        LJIJJ(bundle);
                        this.LJLJJLL = (AbstractC53895LDf) ListProtector.get(this.LJLJLJ, i);
                        LJIJJLI(bundle);
                        AbstractC53895LDf LJJIFFI2 = UC0.LJJIFFI(this.LJLJJLL);
                        AbstractC53895LDf abstractC53895LDf2 = this.LJLJJLL;
                        if (abstractC53895LDf2 != null) {
                            abstractC53895LDf2.LJIILIIL(abstractC53895LDf, abstractC53895LDf2, (CopyOnWriteArrayList) this.LJLJLLL.getValue());
                        }
                        if (LJJIFFI2 != null) {
                            LJJIFFI2.LJIILJJIL(LJJIFFI, LJJIFFI2, changNodeObserver);
                            if (LJJIFFI != null) {
                                str = LJJIFFI.tag();
                            } else {
                                str = null;
                            }
                            if (!o.LJ(str, LJJIFFI2.tag())) {
                                Iterator<InterfaceC53894LDe> it2 = changeEndNodeObserver.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC53894LDe next2 = it2.next();
                                    if (LJJIFFI != null) {
                                        str2 = LJJIFFI.tag();
                                    } else {
                                        str2 = null;
                                    }
                                    next2.LJLJL(str2, LJJIFFI2.tag());
                                }
                            }
                        }
                    } else {
                        StringBuilder LJ = C7MY.LJ("dispatchVisible(), out of childrenList size, index = ", i, ", childrenList size = ");
                        LJ.append(((ArrayList) this.LJLJLJ).size());
                        throw new RuntimeException(X1D.LIZIZ(LJ));
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}

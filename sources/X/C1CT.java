package X;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1CT, reason: invalid class name */
/* loaded from: classes.dex */
public class C1CT extends AbstractC03490Bt {
    public int LLIFFJFJJ;
    public ArrayList<AbstractC03490Bt> LLFZ = new ArrayList<>();
    public boolean LLI = true;
    public boolean LLII = false;
    public int LLIIII = 0;

    @Override // X.AbstractC03490Bt
    public final void LJJII() {
        this.LJLLL = true;
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJII();
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJJIFFI() {
        if (this.LLFZ.isEmpty()) {
            LJJIJIIJIL();
            LJIIL();
            return;
        }
        C1CS c1cs = new C1CS(this) { // from class: X.1i3
            public final C1CT LJLIL;

            {
                this.LJLIL = this;
            }

            @Override // X.C1CS, X.InterfaceC03480Bs
            public final void LIZIZ(AbstractC03490Bt abstractC03490Bt) {
                C1CT c1ct = this.LJLIL;
                if (!c1ct.LLII) {
                    c1ct.LJJIJIIJIL();
                    this.LJLIL.LLII = true;
                }
            }

            @Override // X.C1CS, X.InterfaceC03480Bs
            public final void LIZJ(AbstractC03490Bt abstractC03490Bt) {
                C1CT c1ct = this.LJLIL;
                int i = c1ct.LLIFFJFJJ - 1;
                c1ct.LLIFFJFJJ = i;
                if (i == 0) {
                    c1ct.LLII = false;
                    c1ct.LJIIL();
                }
                abstractC03490Bt.LJIL(this);
            }
        };
        Iterator<AbstractC03490Bt> it = this.LLFZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c1cs);
        }
        this.LLIFFJFJJ = this.LLFZ.size();
        if (!this.LLI) {
            for (int i = 1; i < this.LLFZ.size(); i++) {
                AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) ListProtector.get(this.LLFZ, i - 1);
                final AbstractC03490Bt abstractC03490Bt2 = (AbstractC03490Bt) ListProtector.get(this.LLFZ, i);
                abstractC03490Bt.LIZ(new C1CS() { // from class: X.1i2
                    @Override // X.C1CS, X.InterfaceC03480Bs
                    public final void LIZJ(AbstractC03490Bt abstractC03490Bt3) {
                        AbstractC03490Bt.this.LJJIFFI();
                        abstractC03490Bt3.LJIL(this);
                    }
                });
            }
            AbstractC03490Bt abstractC03490Bt3 = (AbstractC03490Bt) ListProtector.get(this.LLFZ, 0);
            if (abstractC03490Bt3 != null) {
                abstractC03490Bt3.LJJIFFI();
                return;
            }
            return;
        }
        Iterator<AbstractC03490Bt> it2 = this.LLFZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIFFI();
        }
    }

    @Override // X.AbstractC03490Bt
    /* renamed from: LJIIIZ */
    public final AbstractC03490Bt clone() {
        C1CT c1ct = (C1CT) super.clone();
        c1ct.LLFZ = new ArrayList<>();
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            AbstractC03490Bt clone = ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).clone();
            c1ct.LLFZ.add(clone);
            clone.LJLJLLL = c1ct;
        }
        return c1ct;
    }

    @Override // X.AbstractC03490Bt
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // X.AbstractC03490Bt
    public final AbstractC03490Bt LIZ(InterfaceC03480Bs interfaceC03480Bs) {
        super.LIZ(interfaceC03480Bs);
        return this;
    }

    @Override // X.AbstractC03490Bt
    public final void LIZIZ(View view) {
        for (int i = 0; i < this.LLFZ.size(); i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LIZIZ(view);
        }
        this.LJLJJLL.add(view);
    }

    @Override // X.AbstractC03490Bt
    public final void LIZLLL(C03860De c03860De) {
        if (LJIJI(c03860De.LIZIZ)) {
            Iterator<AbstractC03490Bt> it = this.LLFZ.iterator();
            while (it.hasNext()) {
                AbstractC03490Bt next = it.next();
                if (next.LJIJI(c03860De.LIZIZ)) {
                    next.LIZLLL(c03860De);
                    c03860De.LIZJ.add(next);
                }
            }
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJFF(C03860De c03860De) {
        super.LJFF(c03860De);
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJFF(c03860De);
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJI(C03860De c03860De) {
        if (LJIJI(c03860De.LIZIZ)) {
            Iterator<AbstractC03490Bt> it = this.LLFZ.iterator();
            while (it.hasNext()) {
                AbstractC03490Bt next = it.next();
                if (next.LJIJI(c03860De.LIZIZ)) {
                    next.LJI(c03860De);
                    c03860De.LIZJ.add(next);
                }
            }
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJIILIIL(ViewGroup viewGroup) {
        super.LJIILIIL(viewGroup);
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJIILIIL(viewGroup);
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJIJJLI(View view) {
        super.LJIJJLI(view);
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJIJJLI(view);
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJIL(InterfaceC03480Bs interfaceC03480Bs) {
        super.LJIL(interfaceC03480Bs);
    }

    @Override // X.AbstractC03490Bt
    public final void LJJ(View view) {
        for (int i = 0; i < this.LLFZ.size(); i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJ(view);
        }
        this.LJLJJLL.remove(view);
    }

    @Override // X.AbstractC03490Bt
    public final void LJJI(View view) {
        super.LJJI(view);
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJI(view);
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJJIIJ(AbstractC03470Br abstractC03470Br) {
        this.LLD = abstractC03470Br;
        this.LLIIII |= 8;
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJIIJ(abstractC03470Br);
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJJIIZ(QXX qxx) {
        super.LJJIIZ(qxx);
        this.LLIIII |= 4;
        if (this.LLFZ != null) {
            for (int i = 0; i < this.LLFZ.size(); i++) {
                ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJIIZ(qxx);
            }
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJJIIZI(QXX qxx) {
        this.LL = qxx;
        this.LLIIII |= 2;
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJIIZI(qxx);
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJJIJ(ViewGroup viewGroup) {
        this.LJLLJ = viewGroup;
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJIJ(viewGroup);
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LJJIJIIJI(long j) {
        this.LJLILLLLZI = j;
    }

    @Override // X.AbstractC03490Bt
    public final String LJJIJIL(String str) {
        String LJJIJIL = super.LJJIJIL(str);
        for (int i = 0; i < this.LLFZ.size(); i++) {
            StringBuilder LIZJ = b1.LIZJ(LJJIJIL, "\n");
            AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) ListProtector.get(this.LLFZ, i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("  ");
            LIZJ.append(abstractC03490Bt.LJJIJIL(X1D.LIZIZ(LIZ)));
            LJJIJIL = X1D.LIZIZ(LIZJ);
        }
        return LJJIJIL;
    }

    public final void LJJIJL(AbstractC03490Bt abstractC03490Bt) {
        this.LLFZ.add(abstractC03490Bt);
        abstractC03490Bt.LJLJLLL = this;
        long j = this.LJLJI;
        if (j >= 0) {
            abstractC03490Bt.LJJIII(j);
        }
        if ((this.LLIIII & 1) != 0) {
            abstractC03490Bt.LJJIIJZLJL(this.LJLJJI);
        }
        if ((this.LLIIII & 2) != 0) {
            abstractC03490Bt.LJJIIZI(this.LL);
        }
        if ((this.LLIIII & 4) != 0) {
            abstractC03490Bt.LJJIIZ(this.LLF);
        }
        if ((this.LLIIII & 8) != 0) {
            abstractC03490Bt.LJJIIJ(this.LLD);
        }
    }

    @Override // X.AbstractC03490Bt
    /* renamed from: LJJIJLIJ, reason: merged with bridge method [inline-methods] */
    public final void LJJIII(long j) {
        ArrayList<AbstractC03490Bt> arrayList;
        this.LJLJI = j;
        if (j >= 0 && (arrayList = this.LLFZ) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJIII(j);
            }
        }
    }

    @Override // X.AbstractC03490Bt
    /* renamed from: LJJIL, reason: merged with bridge method [inline-methods] */
    public final void LJJIIJZLJL(TimeInterpolator timeInterpolator) {
        this.LLIIII |= 1;
        ArrayList<AbstractC03490Bt> arrayList = this.LLFZ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC03490Bt) ListProtector.get(this.LLFZ, i)).LJJIIJZLJL(timeInterpolator);
            }
        }
        this.LJLJJI = timeInterpolator;
    }

    public final void LJJIZ(int i) {
        if (i != 0) {
            if (i == 1) {
                this.LLI = false;
                return;
            }
            throw new AndroidRuntimeException(KMP.LJ("Invalid parameter for TransitionSet ordering: ", i));
        }
        this.LLI = true;
    }

    @Override // X.AbstractC03490Bt
    public final void LJIIJJI(ViewGroup viewGroup, C03870Df c03870Df, C03870Df c03870Df2, ArrayList<C03860De> arrayList, ArrayList<C03860De> arrayList2) {
        long j = this.LJLILLLLZI;
        int size = this.LLFZ.size();
        for (int i = 0; i < size; i++) {
            AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) ListProtector.get(this.LLFZ, i);
            if (j > 0 && (this.LLI || i == 0)) {
                long j2 = abstractC03490Bt.LJLILLLLZI;
                if (j2 > 0) {
                    abstractC03490Bt.LJJIJIIJI(j2 + j);
                } else {
                    abstractC03490Bt.LJJIJIIJI(j);
                }
            }
            abstractC03490Bt.LJIIJJI(viewGroup, c03870Df, c03870Df2, arrayList, arrayList2);
        }
    }
}

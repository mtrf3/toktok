package X;

import Y.AfS57S0100000_5;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CV5<T> extends ArrayList<T> {
    public final int LJLIL;
    public final long LJLILLLLZI;
    public final Looper LJLJI;
    public C73411SrX LJLJJI;
    public InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> LJLJJL;
    public InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> timeoutArrive;

    public final void LIZJ() {
        AbstractC73946T0k LIZIZ;
        InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> interfaceC88472Yns;
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C29306Beo.LJJJJI(c73411SrX);
            if ((!isEmpty()) && (interfaceC88472Yns = this.LJLJJL) != null) {
                interfaceC88472Yns.invoke(this);
            }
        }
        C73401SrN LJJLIIIJLJLI = AbstractC73672Svk.LJJLIIIJLJLI(this.LJLILLLLZI, TimeUnit.MILLISECONDS);
        Looper looper = this.LJLJI;
        if (looper != null) {
            LIZIZ = C73969T1h.LIZ(looper);
        } else {
            LIZIZ = C73969T1h.LIZIZ();
        }
        this.LJLJJI = (C73411SrX) LJJLIIIJLJLI.LJJJ(LIZIZ).LJJJLIIL(new AfS57S0100000_5(this, 277), new AfS57S0100000_5(this, 278));
    }

    public final void dispose() {
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this);
        }
        clear();
    }

    public final ArrayList<T> replaceAndClear() {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.addAll(this);
        clear();
        return arrayList;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        if (size() == 0) {
            LIZJ();
        }
        boolean add = super.add(t);
        if (size() >= this.LJLIL) {
            C73411SrX c73411SrX = this.LJLJJI;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> interfaceC88472Yns = this.timeoutArrive;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(replaceAndClear());
            }
        }
        return add;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        if (size() == 0) {
            LIZJ();
        }
        boolean addAll = super.addAll(elements);
        if (size() >= this.LJLIL) {
            C73411SrX c73411SrX = this.LJLJJI;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> interfaceC88472Yns = this.timeoutArrive;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(replaceAndClear());
            }
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void setCountDownDispose(InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> timeoutArrive) {
        o.LJIIIZ(timeoutArrive, "timeoutArrive");
        this.timeoutArrive = timeoutArrive;
    }

    public final void setDisposeCallback(InterfaceC88472Yns<? super ArrayList<T>, C76800UCe> disposeCallback) {
        o.LJIIIZ(disposeCallback, "disposeCallback");
        this.LJLJJL = disposeCallback;
    }

    public CV5(int i, long j, Looper looper) {
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = looper;
    }

    public /* synthetic */ CV5(int i, long j, Looper looper, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? 1500L : j, looper);
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SzY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73908SzY<T, K, V> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final Object LJLJLLL = new Object();
    public static final long serialVersionUID = -3688291656102519502L;
    public final InterfaceC116954iR<? super R3B<K, V>> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends K> LJLILLLLZI;
    public final InterfaceC48038ItG<? super T, ? extends V> LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public InterfaceC92693kP LJLJL;
    public final AtomicBoolean LJLJLJ = new AtomicBoolean();
    public final java.util.Map<Object, C73911Szb<K, V>> LJLJJLL = new ConcurrentHashMap();

    @Override // X.InterfaceC92693kP
    public void dispose() {
        if (this.LJLJLJ.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.LJLJL.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        return this.LJLJLJ.get();
    }

    @Override // X.InterfaceC116954iR
    public void onComplete() {
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.LJLJJLL).values());
        ((ConcurrentHashMap) this.LJLJJLL).clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C73907SzX<T, K> c73907SzX = ((C73911Szb) it.next()).LJLILLLLZI;
            c73907SzX.LJLJJL = true;
            c73907SzX.LIZIZ();
        }
        this.LJLIL.onComplete();
    }

    public void cancel(K k) {
        if (k == null) {
            k = (K) LJLJLLL;
        }
        ((ConcurrentHashMap) this.LJLJJLL).remove(k);
        if (decrementAndGet() == 0) {
            this.LJLJL.dispose();
        }
    }

    @Override // X.InterfaceC116954iR
    public void onError(Throwable th) {
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.LJLJJLL).values());
        ((ConcurrentHashMap) this.LJLJJLL).clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C73907SzX<T, K> c73907SzX = ((C73911Szb) it.next()).LJLILLLLZI;
            c73907SzX.LJLJJLL = th;
            c73907SzX.LJLJJL = true;
            c73907SzX.LIZIZ();
        }
        this.LJLIL.onError(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC116954iR
    public void onNext(T t) {
        Object obj;
        try {
            K apply = this.LJLILLLLZI.apply(t);
            if (apply != null) {
                obj = apply;
            } else {
                obj = LJLJLLL;
            }
            C73911Szb c73911Szb = (C73911Szb) ((ConcurrentHashMap) this.LJLJJLL).get(obj);
            if (c73911Szb == null) {
                if (this.LJLJLJ.get()) {
                    return;
                }
                c73911Szb = new C73911Szb(apply, new C73907SzX(this.LJLJJI, this, apply, this.LJLJJL));
                ((ConcurrentHashMap) this.LJLJJLL).put(obj, c73911Szb);
                getAndIncrement();
                this.LJLIL.onNext(c73911Szb);
            }
            try {
                V apply2 = this.LJLJI.apply(t);
                C73320Sq4.LIZ(apply2, "The value supplied is null");
                C73907SzX<T, K> c73907SzX = c73911Szb.LJLILLLLZI;
                c73907SzX.LJLILLLLZI.offer(apply2);
                c73907SzX.LIZIZ();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                this.LJLJL.dispose();
                onError(th);
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLJL.dispose();
            onError(th2);
        }
    }

    @Override // X.InterfaceC116954iR
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJL, interfaceC92693kP)) {
            this.LJLJL = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73908SzY(InterfaceC116954iR<? super R3B<K, V>> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends K> interfaceC48038ItG, InterfaceC48038ItG<? super T, ? extends V> interfaceC48038ItG2, int i, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = interfaceC48038ItG2;
        this.LJLJJI = i;
        this.LJLJJL = z;
        lazySet(1);
    }
}

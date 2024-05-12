package X;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Svk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73672Svk<T> implements InterfaceC115714gR<T> {
    public abstract void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR);

    public final T LIZLLL() {
        C42611Gnv c42611Gnv = new C42611Gnv();
        LIZ(c42611Gnv);
        T t = (T) c42611Gnv.LIZ();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    public final C73775SxP LJIILIIL() {
        return new C73775SxP(this, C73320Sq4.LIZ);
    }

    public final T0A LJJJJIZL() {
        AtomicReference atomicReference = new AtomicReference();
        return new T0A(new T0C(atomicReference), this, atomicReference);
    }

    public final T06 LJJJJLL() {
        AtomicReference atomicReference = new AtomicReference();
        return new T06(new C73697Sw9(new C73699SwB(atomicReference), this, atomicReference));
    }

    public final InterfaceC92693kP LJJJJZ() {
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        return LJJJLZIJ(c42222Ghe, C73674Svm.LJFF, C73674Svm.LIZJ, c42222Ghe);
    }

    public final C73717SwT LJJLIL() {
        C73320Sq4.LIZIZ(16, "capacityHint");
        return new C73717SwT(this);
    }

    public static <T> AbstractC73672Svk<T> LJIIIIZZ(InterfaceC115714gR<? extends T>... interfaceC115714gRArr) {
        if (interfaceC115714gRArr.length == 0) {
            return C73536StY.LJLIL;
        }
        if (interfaceC115714gRArr.length == 1) {
            InterfaceC115714gR<? extends T> interfaceC115714gR = interfaceC115714gRArr[0];
            C73320Sq4.LIZ(interfaceC115714gR, "source is null");
            if (interfaceC115714gR instanceof AbstractC73672Svk) {
                return (AbstractC73672Svk) interfaceC115714gR;
            }
            return new C115744gU(interfaceC115714gR);
        }
        return new C73706SwI(LJJIIJ(interfaceC115714gRArr), C73674Svm.LIZ, AbstractC73745Swv.LJLIL, EnumC73710SwM.BOUNDARY);
    }

    public static C73673Svl LJIIIZ(Iterable iterable) {
        int i = AbstractC73745Swv.LJLIL;
        C73693Sw5 LJJIIZ = LJJIIZ(iterable);
        C73320Sq4.LIZIZ(i, "maxConcurrency");
        C73320Sq4.LIZIZ(i, "prefetch");
        return new C73673Svl(LJJIIZ, EnumC73710SwM.BOUNDARY, i, i);
    }

    public static C73390SrC LJIIJ(InterfaceC86003Zc interfaceC86003Zc) {
        C73320Sq4.LIZ(interfaceC86003Zc, "source is null");
        return new C73390SrC(interfaceC86003Zc);
    }

    public static C73431Srr LJJI(Throwable th) {
        C73320Sq4.LIZ(th, "e is null");
        return new C73431Srr(new CallableC73721SwX(th));
    }

    public static <T> AbstractC73672Svk<T> LJJIIJ(T... tArr) {
        if (tArr.length == 0) {
            return C73536StY.LJLIL;
        }
        if (tArr.length == 1) {
            return LJJIJIL(tArr[0]);
        }
        return new C73696Sw8(tArr);
    }

    public static CallableC73559Stv LJJIIJZLJL(Callable callable) {
        return new CallableC73559Stv(callable);
    }

    public static C73693Sw5 LJJIIZ(Iterable iterable) {
        C73320Sq4.LIZ(iterable, "source is null");
        return new C73693Sw5(iterable);
    }

    public static C73565Su1 LJJIJIL(Object obj) {
        C73320Sq4.LIZ(obj, "The item is null");
        return new C73565Su1(obj);
    }

    public static <T> AbstractC73672Svk<T> LJJIJLIJ(Iterable<? extends InterfaceC115714gR<? extends T>> iterable) {
        return (AbstractC73672Svk<T>) LJJIIZ(iterable).LJJIII(C73674Svm.LIZ, false);
    }

    @Override // X.InterfaceC115714gR
    public final void LIZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73320Sq4.LIZ(interfaceC116954iR, "observer is null");
        try {
            LJJJZ(interfaceC116954iR);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final Object LIZJ(InterfaceC73684Svw interfaceC73684Svw) {
        C73320Sq4.LIZ(interfaceC73684Svw, "converter is null");
        return interfaceC73684Svw.LIZ(this);
    }

    public final <R> AbstractC73672Svk<R> LJII(C3EO<? super T, ? extends R> c3eo) {
        C73320Sq4.LIZ(c3eo, "composer is null");
        InterfaceC115714gR<? extends R> LIZ = c3eo.LIZ(this);
        C73320Sq4.LIZ(LIZ, "source is null");
        if (LIZ instanceof AbstractC73672Svk) {
            return (AbstractC73672Svk) LIZ;
        }
        return new C115744gU(LIZ);
    }

    public final C73775SxP LJIILJJIL(InterfaceC73786Sxa interfaceC73786Sxa) {
        C73320Sq4.LIZ(interfaceC73786Sxa, "comparer is null");
        return new C73775SxP(this, interfaceC73786Sxa);
    }

    public final C73675Svn LJIILL(InterfaceC64592gB interfaceC64592gB) {
        return new C73675Svn(this, interfaceC64592gB);
    }

    public final C73429Srp LJIILLIIL(InterfaceC29937Boz interfaceC29937Boz) {
        return new C73429Srp(this, interfaceC29937Boz);
    }

    public final C73422Sri LJIIZILJ(InterfaceC29937Boz interfaceC29937Boz) {
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        return LJIJI(c42222Ghe, c42222Ghe, interfaceC29937Boz);
    }

    public final C73423Srj LJIJ(InterfaceC29937Boz interfaceC29937Boz) {
        return new C73423Srj(this, C73674Svm.LIZLLL, interfaceC29937Boz);
    }

    public final C73422Sri LJIJJ(InterfaceC64592gB interfaceC64592gB) {
        return LJIJI(C73674Svm.LIZLLL, interfaceC64592gB, C73674Svm.LIZJ);
    }

    public final C73422Sri LJIJJLI(InterfaceC64592gB interfaceC64592gB) {
        return LJIJI(interfaceC64592gB, C73674Svm.LIZLLL, C73674Svm.LIZJ);
    }

    public final C73423Srj LJIL(InterfaceC64592gB interfaceC64592gB) {
        return new C73423Srj(this, interfaceC64592gB, C73674Svm.LIZJ);
    }

    public final C73422Sri LJJ(InterfaceC29937Boz interfaceC29937Boz) {
        return LJIJI(C73674Svm.LIZLLL, new C73679Svr(interfaceC29937Boz), interfaceC29937Boz);
    }

    public final C73603Sud LJJIFFI(InterfaceC73592SuS interfaceC73592SuS) {
        return new C73603Sud(this, interfaceC73592SuS);
    }

    public final C73805Sxt LJJIJL(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73805Sxt(this, interfaceC48038ItG);
    }

    public final C73454SsE LJJJ(AbstractC73946T0k abstractC73946T0k) {
        int i = AbstractC73745Swv.LJLIL;
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        C73320Sq4.LIZIZ(i, "bufferSize");
        return new C73454SsE(this, abstractC73946T0k, i);
    }

    public final C73805Sxt LJJJI(Class cls) {
        C73320Sq4.LIZ(cls, "clazz is null");
        return LJJIFFI(new C73677Svp(cls)).LJJIJL(new C73678Svq(cls));
    }

    public final C73615Sup LJJJIL(AbstractC73672Svk abstractC73672Svk) {
        C73320Sq4.LIZ(abstractC73672Svk, "next is null");
        return new C73615Sup(this, new CallableC73721SwX(abstractC73672Svk), false);
    }

    public final C73425Srl LJJJJ(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73425Srl(this, interfaceC48038ItG);
    }

    public final C73615Sup LJJJJI(C73536StY c73536StY) {
        C73320Sq4.LIZ(c73536StY, "next is null");
        return new C73615Sup(this, new CallableC73721SwX(c73536StY), true);
    }

    public final C73618Sus LJJJJJ(long j) {
        return LJJJJJL(j, C73674Svm.LJI);
    }

    public final C73891SzH LJJJJL(InterfaceC48038ItG interfaceC48038ItG) {
        C73320Sq4.LIZ(interfaceC48038ItG, "handler is null");
        return new C73891SzH(this, interfaceC48038ItG);
    }

    public final InterfaceC92693kP LJJJJZI(InterfaceC64592gB<? super T> interfaceC64592gB) {
        return LJJJLZIJ(interfaceC64592gB, C73674Svm.LJFF, C73674Svm.LIZJ, C73674Svm.LIZLLL);
    }

    public final C73428Sro LJJL(AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73428Sro(this, abstractC73946T0k);
    }

    public final C73622Suw LJJLI(InterfaceC115714gR interfaceC115714gR) {
        C73320Sq4.LIZ(interfaceC115714gR, "other is null");
        return new C73622Suw(this, interfaceC115714gR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC73672Svk<R> LJJLIIIIJ(InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> interfaceC48038ItG) {
        int i = AbstractC73745Swv.LJLIL;
        C73320Sq4.LIZIZ(i, "bufferSize");
        if (this instanceof I97) {
            Object call = ((I97) this).call();
            if (call == null) {
                return C73536StY.LJLIL;
            }
            return new C73566Su2(interfaceC48038ItG, call);
        }
        return new C73589SuP(this, interfaceC48038ItG, i);
    }

    public final C73456SsG LJJLIIIJ(long j) {
        if (j >= 0) {
            return new C73456SsG(this, j);
        }
        throw new IllegalArgumentException(C61845OOz.LIZ("count >= 0 required but it was ", j));
    }

    public final AbstractC73745Swv<T> LJJLIIJ(EnumC73681Svt enumC73681Svt) {
        C73676Svo c73676Svo = new C73676Svo(this);
        int i = C73680Svs.LIZ[enumC73681Svt.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        int i2 = AbstractC73745Swv.LJLIL;
                        C73320Sq4.LIZIZ(i2, "bufferSize");
                        return new C73736Swm(c73676Svo, i2);
                    }
                    return new C73738Swo(c73676Svo);
                }
                return c73676Svo;
            }
            return new C73737Swn(c73676Svo);
        }
        return new C73735Swl(c73676Svo);
    }

    public static C73453SsD LJJIJIIJI(long j, TimeUnit timeUnit) {
        return LJJIJ(j, j, timeUnit, T16.LIZIZ);
    }

    public static AbstractC73672Svk LJJIZ(AbstractC73672Svk abstractC73672Svk, InterfaceC115714gR interfaceC115714gR) {
        C73320Sq4.LIZ(abstractC73672Svk, "source1 is null");
        C73320Sq4.LIZ(interfaceC115714gR, "source2 is null");
        AbstractC73672Svk LJJIIJ = LJJIIJ(abstractC73672Svk, interfaceC115714gR);
        C73689Sw1 c73689Sw1 = C73674Svm.LIZ;
        LJJIIJ.getClass();
        return LJJIIJ.LJJII(2, AbstractC73745Swv.LJLIL, c73689Sw1, false);
    }

    public static C73401SrN LJJLIIIJLJLI(long j, TimeUnit timeUnit) {
        return LJJLIIIJLLLLLLLZ(j, timeUnit, T16.LIZIZ);
    }

    public static C73903SzT LJJLJ(Iterable iterable, InterfaceC48038ItG interfaceC48038ItG) {
        return new C73903SzT(null, iterable, interfaceC48038ItG, AbstractC73745Swv.LJLIL);
    }

    public final C73841SyT LJ(long j, TimeUnit timeUnit) {
        return LJFF(j, timeUnit, T16.LIZIZ, Integer.MAX_VALUE);
    }

    public final C73714SwQ LJIIJJI(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73714SwQ(j, this, abstractC73946T0k, timeUnit);
    }

    public final C73713SwP LJIIL(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73713SwP(this, j, timeUnit, abstractC73946T0k);
    }

    public final <R> AbstractC73672Svk<R> LJJIII(InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> interfaceC48038ItG, boolean z) {
        return LJJII(Integer.MAX_VALUE, AbstractC73745Swv.LJLIL, interfaceC48038ItG, z);
    }

    public final C73618Sus LJJJJJL(long j, InterfaceC73592SuS interfaceC73592SuS) {
        if (j >= 0) {
            return new C73618Sus(this, j, interfaceC73592SuS);
        }
        throw new IllegalArgumentException(C61845OOz.LIZ("times >= 0 required but it was ", j));
    }

    public final C73877Sz3 LJJJJLI(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73877Sz3(this, j, timeUnit, abstractC73946T0k);
    }

    public final InterfaceC92693kP LJJJLIIL(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2) {
        return LJJJLZIJ(interfaceC64592gB, interfaceC64592gB2, C73674Svm.LIZJ, C73674Svm.LIZLLL);
    }

    public final C73708SwK LJJLIIIJILLIZJL(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73708SwK(j, this, abstractC73946T0k, timeUnit);
    }

    public final C73870Syw LJJLIIIJJI(long j, TimeUnit timeUnit) {
        return LJJLIIIJL(j, null, T16.LIZIZ, timeUnit);
    }

    public static C73901SzR LJI(InterfaceC115714gR interfaceC115714gR, InterfaceC115714gR interfaceC115714gR2, RTU rtu) {
        C73320Sq4.LIZ(interfaceC115714gR, "source1 is null");
        C73320Sq4.LIZ(interfaceC115714gR2, "source2 is null");
        C73337SqL c73337SqL = new C73337SqL(rtu);
        int i = AbstractC73745Swv.LJLIL;
        InterfaceC115714gR[] interfaceC115714gRArr = {interfaceC115714gR, interfaceC115714gR2};
        C73320Sq4.LIZIZ(i, "bufferSize");
        return new C73901SzR(interfaceC115714gRArr, c73337SqL, i << 1);
    }

    public static C73453SsD LJJIIZI(long j, long j2, TimeUnit timeUnit) {
        return LJJIJ(j, j2, timeUnit, T16.LIZIZ);
    }

    public static AbstractC73672Svk LJJIL(AbstractC73672Svk abstractC73672Svk, AbstractC73672Svk abstractC73672Svk2, AbstractC73672Svk abstractC73672Svk3) {
        C73320Sq4.LIZ(abstractC73672Svk2, "source2 is null");
        AbstractC73672Svk LJJIIJ = LJJIIJ(abstractC73672Svk, abstractC73672Svk2, abstractC73672Svk3);
        C73689Sw1 c73689Sw1 = C73674Svm.LIZ;
        LJJIIJ.getClass();
        return LJJIIJ.LJJII(3, AbstractC73745Swv.LJLIL, c73689Sw1, false);
    }

    public static C73401SrN LJJLIIIJLLLLLLLZ(long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73401SrN(Math.max(j, 0L), timeUnit, abstractC73946T0k);
    }

    public static AbstractC73672Svk LJJLL(InterfaceC115714gR interfaceC115714gR, AbstractC73672Svk abstractC73672Svk, RTU rtu) {
        C73320Sq4.LIZ(interfaceC115714gR, "source1 is null");
        C73320Sq4.LIZ(abstractC73672Svk, "source2 is null");
        C73337SqL c73337SqL = new C73337SqL(rtu);
        int i = AbstractC73745Swv.LJLIL;
        InterfaceC115714gR[] interfaceC115714gRArr = {interfaceC115714gR, abstractC73672Svk};
        C73320Sq4.LIZIZ(i, "bufferSize");
        return new C73903SzT(interfaceC115714gRArr, null, c73337SqL, i);
    }

    public final C73422Sri LJIJI(InterfaceC64592gB interfaceC64592gB, InterfaceC64592gB interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz) {
        return new C73422Sri(this, interfaceC64592gB, interfaceC64592gB2, interfaceC29937Boz);
    }

    public final InterfaceC92693kP LJJJLL(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz) {
        return LJJJLZIJ(interfaceC64592gB, interfaceC64592gB2, interfaceC29937Boz, C73674Svm.LIZLLL);
    }

    public final C73870Syw LJJLIIIJJIZ(long j, TimeUnit timeUnit, InterfaceC115714gR interfaceC115714gR) {
        return LJJLIIIJL(j, interfaceC115714gR, T16.LIZIZ, timeUnit);
    }

    public static C73453SsD LJJIJ(long j, long j2, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73453SsD(Math.max(0L, j), Math.max(0L, j2), timeUnit, abstractC73946T0k);
    }

    public static AbstractC73672Svk LJJLJLI(AbstractC73672Svk abstractC73672Svk, AbstractC73672Svk abstractC73672Svk2, AbstractC73672Svk abstractC73672Svk3, final InterfaceC89813fl interfaceC89813fl) {
        InterfaceC48038ItG<Object[], R> interfaceC48038ItG = new InterfaceC48038ItG<Object[], R>(interfaceC89813fl) { // from class: X.3gn
            public final InterfaceC89813fl<T1, T2, T3, R> LJLIL;

            {
                this.LJLIL = interfaceC89813fl;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object[] objArr) {
                Object[] objArr2 = objArr;
                if (objArr2.length == 3) {
                    return this.LJLIL.LIZJ(objArr2[0], objArr2[1], objArr2[2]);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Array of size 3 expected but got ");
                LIZ.append(objArr2.length);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        };
        int i = AbstractC73745Swv.LJLIL;
        InterfaceC115714gR[] interfaceC115714gRArr = {abstractC73672Svk, abstractC73672Svk2, abstractC73672Svk3};
        C73320Sq4.LIZIZ(i, "bufferSize");
        return new C73903SzT(interfaceC115714gRArr, null, interfaceC48038ItG, i);
    }

    public final C73841SyT LJFF(long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k, int i) {
        Callable asCallable = J0V.asCallable();
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        C73320Sq4.LIZ(asCallable, "bufferSupplier is null");
        C73320Sq4.LIZIZ(i, "count");
        return new C73841SyT(this, j, j, timeUnit, abstractC73946T0k, asCallable, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC73672Svk LJJII(int i, int i2, InterfaceC48038ItG interfaceC48038ItG, boolean z) {
        C73320Sq4.LIZIZ(i, "maxConcurrency");
        C73320Sq4.LIZIZ(i2, "bufferSize");
        if (this instanceof I97) {
            Object call = ((I97) this).call();
            if (call == null) {
                return C73536StY.LJLIL;
            }
            return new C73566Su2(interfaceC48038ItG, call);
        }
        return new C73707SwJ(this, interfaceC48038ItG, z, i, i2);
    }

    public final InterfaceC92693kP LJJJLZIJ(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz, InterfaceC64592gB<? super InterfaceC92693kP> interfaceC64592gB3) {
        C73320Sq4.LIZ(interfaceC64592gB, "onNext is null");
        C73320Sq4.LIZ(interfaceC64592gB2, "onError is null");
        C73320Sq4.LIZ(interfaceC29937Boz, "onComplete is null");
        C73411SrX c73411SrX = new C73411SrX(interfaceC64592gB, interfaceC64592gB2, interfaceC29937Boz, interfaceC64592gB3);
        LIZ(c73411SrX);
        return c73411SrX;
    }

    public final C73870Syw LJJLIIIJL(long j, InterfaceC115714gR interfaceC115714gR, AbstractC73946T0k abstractC73946T0k, TimeUnit timeUnit) {
        C73320Sq4.LIZ(timeUnit, "timeUnit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73870Syw(this, j, timeUnit, abstractC73946T0k, interfaceC115714gR);
    }

    public static AbstractC73672Svk<Long> LJJIJIIJIL(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        if (j2 >= 0) {
            if (j2 == 0) {
                C73536StY c73536StY = C73536StY.LJLIL;
                c73536StY.getClass();
                C73320Sq4.LIZ(timeUnit, "unit is null");
                C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
                return new C73713SwP(c73536StY, j3, timeUnit, abstractC73946T0k);
            }
            long j5 = (j2 - 1) + j;
            if (j <= 0 || j5 >= 0) {
                C73320Sq4.LIZ(timeUnit, "unit is null");
                C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
                return new C73452SsC(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, abstractC73946T0k);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        throw new IllegalArgumentException(C61845OOz.LIZ("count >= 0 required but it was ", j2));
    }
}

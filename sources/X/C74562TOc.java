package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TOc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74562TOc<T1, T2, R> implements RTU<Object, InterfaceC88472Yns<? super Integer, ? extends C76800UCe>, Object> {
    public final /* synthetic */ AbstractC74560TOa LJLIL;
    public final /* synthetic */ InterfaceC74566TOg LJLILLLLZI;

    public C74562TOc(AbstractC74560TOa abstractC74560TOa, C74563TOd c74563TOd) {
        this.LJLIL = abstractC74560TOa;
        this.LJLILLLLZI = c74563TOd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RTU
    public final Object apply(Object obj, InterfaceC88472Yns<? super Integer, ? extends C76800UCe> interfaceC88472Yns) {
        InterfaceC74566TOg interfaceC74566TOg;
        InterfaceC74566TOg interfaceC74566TOg2;
        InterfaceC88472Yns<? super Integer, ? extends C76800UCe> progressSubject = interfaceC88472Yns;
        o.LJIIIZ(progressSubject, "progressSubject");
        XP8 xp8 = new XP8();
        try {
            this.LJLIL.LJFF(obj, new TOZ(xp8, progressSubject));
            C74564TOe c74564TOe = (C74564TOe) xp8.get();
            Object obj2 = c74564TOe.LJLIL;
            Object obj3 = c74564TOe.LJLILLLLZI;
            boolean z = c74564TOe.LJLJI;
            Object obj4 = c74564TOe.LJLJJI;
            Long l = c74564TOe.LJLJJL;
            Exception exc = c74564TOe.LJLJJLL;
            if (obj3 == null) {
                InterfaceC74566TOg interfaceC74566TOg3 = this.LJLILLLLZI;
                if (interfaceC74566TOg3 != null) {
                    interfaceC74566TOg3.LIZJ(obj2, l, exc, obj4);
                }
                throw new C74572TOm(exc);
            }
            if (!z && (interfaceC74566TOg2 = this.LJLILLLLZI) != null) {
                interfaceC74566TOg2.LIZ(l, obj2, obj4);
            }
            return obj3;
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            if (!(e2 instanceof C74572TOm) && !(e2 instanceof InterruptedException) && (interfaceC74566TOg = this.LJLILLLLZI) != null) {
                interfaceC74566TOg.LIZJ(obj, 0L, e2, null);
            }
            throw e2;
        }
    }
}

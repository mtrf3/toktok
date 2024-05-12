package X;

import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import defpackage.s1;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$cleanCacheForRecord$cleanCacheTime$1$job2$1", f = "RecordConditionCheck.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EkD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37285EkD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Long>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ C68322mC<AtomicLong> LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37285EkD(Context context, C68322mC<AtomicLong> c68322mC, boolean z, InterfaceC67352kd<? super C37285EkD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = context;
        this.LJLJI = c68322mC;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C37285EkD c37285EkD = new C37285EkD(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c37285EkD.LJLIL = obj;
        return c37285EkD;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        EE1 initTask;
        C141335gf.LIZJ(obj);
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        o.LJIIIIZZ(LJIIJ, "getStorageList()");
        Iterator it = ((ArrayList) LJIIJ).iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (obj2 instanceof AbstractC43051Gv1) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        if (obj2 == null && (initTask = AVExternalServiceImpl.LIZ().initService().initTask(1)) != null) {
            initTask.run(this.LJLILLLLZI);
        }
        if (this.LJLJJI) {
            List<InterfaceC37286EkE> LJIIJ2 = P8H.LJIIJ();
            arrayList = s1.LIZIZ(LJIIJ2, "getStorageList()");
            Iterator it2 = ((ArrayList) LJIIJ2).iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                InterfaceC37286EkE interfaceC37286EkE = (InterfaceC37286EkE) next;
                if (interfaceC37286EkE != null) {
                    str3 = interfaceC37286EkE.LJ();
                } else {
                    str3 = null;
                }
                if (!o.LJ(str3, "RESOURCE")) {
                    if (interfaceC37286EkE != null) {
                        str4 = interfaceC37286EkE.LJ();
                    } else {
                        str4 = null;
                    }
                    if (o.LJ(str4, "CACHE")) {
                    }
                }
                arrayList.add(next);
            }
        } else {
            List<InterfaceC37286EkE> LJIIJ3 = P8H.LJIIJ();
            ArrayList LIZIZ = s1.LIZIZ(LJIIJ3, "getStorageList()");
            Iterator it3 = ((ArrayList) LJIIJ3).iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (!(next2 instanceof AbstractC43051Gv1)) {
                    LIZIZ.add(next2);
                }
            }
            arrayList = new ArrayList();
            Iterator it4 = LIZIZ.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                InterfaceC37286EkE interfaceC37286EkE2 = (InterfaceC37286EkE) next3;
                if (interfaceC37286EkE2 != null) {
                    str = interfaceC37286EkE2.LJ();
                } else {
                    str = null;
                }
                if (!o.LJ(str, "RESOURCE")) {
                    if (interfaceC37286EkE2 != null) {
                        str2 = interfaceC37286EkE2.LJ();
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, "CACHE")) {
                    }
                }
                arrayList.add(next3);
            }
        }
        C72242sW c72242sW = new C72242sW();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            c72242sW.element = ((InterfaceC37286EkE) it5.next()).LIZIZ() + c72242sW.element;
        }
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((InterfaceC37286EkE) it6.next()).LIZJ();
        }
        return new Long(this.LJLJI.element.addAndGet(c72242sW.element));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Long> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import X.C33Q;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214238ax<S extends C33Q, VM extends AssemViewModel<S>, T extends ReusedAssem<? extends C3C8>, ITEM> implements InterfaceC212858Wz<S, VM> {
    public final AbstractC241239dP LIZ;
    public final T LIZIZ;
    public final InterfaceC65350Pko<VM> LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final InterfaceC65784Pro<C8YR<S>> LJ;
    public final InterfaceC65784Pro<ViewModelProvider.Factory> LJFF;
    public final InterfaceC88472Yns<S, S> LJI;
    public final InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S> LJII;
    public final InterfaceC88471Ynr<ITEM, S, ITEM> LJIIIIZZ;
    public final InterfaceC65784Pro<C7C3> LJIIIZ;
    public final InterfaceC65784Pro<C8VA> LJIIJ;
    public VM LJIIJJI;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // X.InterfaceC212858Wz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final VM LIZ() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214238ax.LIZ():com.bytedance.assem.arch.viewModel.AssemViewModel");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        AbstractC241239dP abstractC241239dP = this.LIZ;
        int i = 0;
        if (abstractC241239dP == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC241239dP.hashCode();
        }
        int LIZLLL = C1JX.LIZLLL(this.LJ, C1JX.LIZLLL(this.LIZLLL, (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (hashCode * 31)) * 31)) * 31, 31), 31);
        InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro = this.LJFF;
        if (interfaceC65784Pro == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC65784Pro.hashCode();
        }
        int LIZIZ = QZY.LIZIZ(this.LJI, (LIZLLL + hashCode2) * 31, 31);
        InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S> interfaceC88473Ynt = this.LJII;
        if (interfaceC88473Ynt == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC88473Ynt.hashCode();
        }
        int i2 = (LIZIZ + hashCode3) * 31;
        InterfaceC88471Ynr<ITEM, S, ITEM> interfaceC88471Ynr = this.LJIIIIZZ;
        if (interfaceC88471Ynr == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC88471Ynr.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        InterfaceC65784Pro<C7C3> interfaceC65784Pro2 = this.LJIIIZ;
        if (interfaceC65784Pro2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = interfaceC65784Pro2.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        InterfaceC65784Pro<C8VA> interfaceC65784Pro3 = this.LJIIJ;
        if (interfaceC65784Pro3 != null) {
            i = interfaceC65784Pro3.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "CellScopeViewModelProvideData(scope=" + this.LIZ + ", host=" + this.LIZIZ + ", viewModelClass=" + this.LIZJ + ", keyFactory=" + this.LIZLLL + ", dispatcherFactory=" + this.LJ + ", factoryProducer=" + this.LJFF + ", argumentsAcceptor=" + this.LJI + ", itemSync2StateAcceptor=" + this.LJII + ", state2ItemAcceptor=" + this.LJIIIIZZ + ", hierarchyDataStore=" + this.LJIIIZ + ", hierarchyServiceStore=" + this.LJIIJ + ')';
    }

    public final AbstractC241239dP LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C214238ax)) {
            return false;
        }
        C214238ax c214238ax = (C214238ax) obj;
        if (o.LJ(this.LIZ, c214238ax.LIZ) && o.LJ(this.LIZIZ, c214238ax.LIZIZ) && o.LJ(this.LIZJ, c214238ax.LIZJ) && o.LJ(this.LIZLLL, c214238ax.LIZLLL) && o.LJ(this.LJ, c214238ax.LJ) && o.LJ(this.LJFF, c214238ax.LJFF) && o.LJ(this.LJI, c214238ax.LJI) && o.LJ(this.LJII, c214238ax.LJII) && o.LJ(this.LJIIIIZZ, c214238ax.LJIIIIZZ) && o.LJ(this.LJIIIZ, c214238ax.LJIIIZ) && o.LJ(this.LJIIJ, c214238ax.LJIIJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C214238ax(ReusedAssem host, AbstractC241239dP abstractC241239dP, InterfaceC65784Pro interfaceC65784Pro, C214458bJ c214458bJ, InterfaceC65784Pro interfaceC65784Pro2, AqS153S0100000_3 aqS153S0100000_3, AqS153S0100000_3 aqS153S0100000_32, InterfaceC88472Yns argumentsAcceptor, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88473Ynt interfaceC88473Ynt, C65776Prg c65776Prg) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        this.LIZ = abstractC241239dP;
        this.LIZIZ = host;
        this.LIZJ = c65776Prg;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = c214458bJ;
        this.LJFF = interfaceC65784Pro2;
        this.LJI = argumentsAcceptor;
        this.LJII = interfaceC88473Ynt;
        this.LJIIIIZZ = interfaceC88471Ynr;
        this.LJIIIZ = aqS153S0100000_3;
        this.LJIIJ = aqS153S0100000_32;
    }
}

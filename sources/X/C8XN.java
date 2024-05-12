package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8XN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XN implements InterfaceC212978Xl<InterfaceC212998Xn<Object, Object>, Object> {
    public C8XE LIZ;
    public ReusedUIAssem<?> LIZIZ;

    @Override // X.InterfaceC212978Xl
    public final void LIZIZ() {
        C8XE c8xe;
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cell unbindProxy ");
            LIZ.append(this.LIZIZ);
            LIZ.append(", position=");
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        ReusedUIAssem<?> reusedUIAssem = this.LIZIZ;
        if (reusedUIAssem != null && (c8xe = reusedUIAssem.LJLJLJ) != null) {
            c8xe.LJIILL();
        }
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC212978Xl
    public final void LJ(boolean z) {
        C8XE c8xe;
        ReusedUIAssem<?> reusedUIAssem = this.LIZIZ;
        if (reusedUIAssem != null && (c8xe = reusedUIAssem.LJLJLJ) != null) {
            if (z) {
                if (c8xe instanceof C8XH) {
                    c8xe.LJIIIZ();
                    return;
                }
                return;
            }
            c8xe.LJIIIZ();
        }
    }

    @Override // X.InterfaceC212978Xl
    public final void LIZLLL(int i, Object obj) {
        C8XE c8xe;
        ReusedUIAssem<?> reusedUIAssem = this.LIZIZ;
        if (reusedUIAssem != null && (c8xe = reusedUIAssem.LJLJLJ) != null) {
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Any");
            c8xe.LJFF(i, obj);
        }
    }

    @Override // X.InterfaceC212978Xl
    public final void LIZJ(int i, InterfaceC212998Xn<InterfaceC212998Xn<Object, Object>, Object> newHolder, Object obj, List<? extends Object> list, InterfaceC88472Yns<? super Object, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Integer> interfaceC65784Pro) {
        C8XE c8xf;
        o.LJIIIZ(newHolder, "newHolder");
        this.LIZIZ = ((C8XZ) newHolder).LP().LIZ;
        if (this.LIZ == null) {
            if (C214368bA.LJIJJ) {
                c8xf = new C8XH();
            } else {
                c8xf = new C8XF();
            }
            this.LIZ = c8xf;
        } else {
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                c8v7.log("AssemList", "cell bindProxy: assemProxy already existed");
            }
        }
        C8V7 c8v72 = C214368bA.LIZIZ;
        if (c8v72 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cell bindProxy: position=");
            LIZ.append(i);
            LIZ.append(", item=");
            LIZ.append(obj);
            c8v72.log("AssemList", X1D.LIZIZ(LIZ));
        }
        C8XE c8xe = this.LIZ;
        o.LJI(c8xe);
        ReusedUIAssem<?> reusedUIAssem = this.LIZIZ;
        o.LJI(reusedUIAssem);
        c8xe.LIZLLL(reusedUIAssem, obj, list, interfaceC88472Yns, interfaceC65784Pro);
    }
}

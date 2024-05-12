package X;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43911nv extends AbstractC35421aE implements InterfaceC24390xX {
    public final boolean LJLILLLLZI;
    public final float LJLJI;
    public final InterfaceC24760y8<C11850dJ> LJLJJI;
    public final InterfaceC24760y8<C23180va> LJLJJL;
    public final C23210vd LJLJJLL;
    public final ParcelableSnapshotMutableState LJLJL;
    public final ParcelableSnapshotMutableState LJLJLJ;
    public long LJLJLLL;
    public int LJLL;
    public final IDqS420S0100000 LJLLI;

    public C43911nv() {
        throw null;
    }

    @Override // X.InterfaceC24390xX
    public final void LIZJ() {
    }

    public final void LJII() {
        C23210vd c23210vd = this.LJLJJLL;
        c23210vd.getClass();
        this.LJLJL.setValue(null);
        C23220ve c23220ve = c23210vd.LJLJJI;
        c23220ve.getClass();
        C23250vh c23250vh = (C23250vh) ((java.util.Map) c23220ve.LIZ).get(this);
        if (c23250vh != null) {
            c23250vh.LIZIZ();
            c23210vd.LJLJJI.LIZ(this);
            ((ArrayList) c23210vd.LJLJI).add(c23250vh);
        }
    }

    @Override // X.InterfaceC24390xX
    public final void LIZIZ() {
        LJII();
    }

    @Override // X.InterfaceC24390xX
    public final void LIZLLL() {
        LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0SW
    public final void LIZ(InterfaceC43021mU interfaceC43021mU) {
        int LJJIJ;
        o.LJIIIZ(interfaceC43021mU, "<this>");
        this.LJLJLLL = interfaceC43021mU.LIZIZ();
        if (Float.isNaN(this.LJLJI)) {
            LJJIJ = O6R.LJJIIZ(C23200vc.LIZ(interfaceC43021mU, this.LJLILLLLZI, interfaceC43021mU.LIZIZ()));
        } else {
            LJJIJ = interfaceC43021mU.LJJIJ(this.LJLJI);
        }
        this.LJLL = LJJIJ;
        long j = this.LJLJJI.getValue().LIZ;
        float f = this.LJLJJL.getValue().LIZLLL;
        interfaceC43021mU.LJJLIIIIJ();
        LJFF(this.LJLJI, j, interfaceC43021mU);
        InterfaceC11750d9 LIZ = interfaceC43021mU.LJJIII().LIZ();
        ((Boolean) this.LJLJLJ.getValue()).booleanValue();
        C23250vh c23250vh = (C23250vh) this.LJLJL.getValue();
        if (c23250vh != null) {
            c23250vh.LJ(interfaceC43021mU.LIZIZ(), j, f, this.LJLL);
            o.LJIIIZ(LIZ, "<this>");
            c23250vh.draw(((C1QR) LIZ).LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC35421aE
    public final void LJI(C1OJ interaction) {
        o.LJIIIZ(interaction, "interaction");
        C23250vh c23250vh = (C23250vh) this.LJLJL.getValue();
        if (c23250vh != null) {
            c23250vh.LIZLLL();
        }
    }

    @Override // X.AbstractC35421aE
    public final void LJ(C1OJ interaction, InterfaceC70422pa scope) {
        o.LJIIIZ(interaction, "interaction");
        o.LJIIIZ(scope, "scope");
        C23210vd c23210vd = this.LJLJJLL;
        c23210vd.getClass();
        C23220ve c23220ve = c23210vd.LJLJJI;
        c23220ve.getClass();
        C23250vh rippleHostView = (C23250vh) ((java.util.Map) c23220ve.LIZ).get(this);
        if (rippleHostView == null) {
            rippleHostView = (C23250vh) ORS.LJJLJLI(c23210vd.LJLJI);
            if (rippleHostView == null) {
                if (c23210vd.LJLJJL > C47261Igj.LJJI(c23210vd.LJLILLLLZI)) {
                    Context context = c23210vd.getContext();
                    o.LJIIIIZZ(context, "context");
                    rippleHostView = new C23250vh(context);
                    c23210vd.addView(rippleHostView);
                    ((ArrayList) c23210vd.LJLILLLLZI).add(rippleHostView);
                } else {
                    rippleHostView = (C23250vh) ListProtector.get(c23210vd.LJLILLLLZI, c23210vd.LJLJJL);
                    C23220ve c23220ve2 = c23210vd.LJLJJI;
                    c23220ve2.getClass();
                    o.LJIIIZ(rippleHostView, "rippleHostView");
                    C43911nv c43911nv = (C43911nv) ((java.util.Map) c23220ve2.LIZIZ).get(rippleHostView);
                    if (c43911nv != null) {
                        c43911nv.LJLJL.setValue(null);
                        c23210vd.LJLJJI.LIZ(c43911nv);
                        rippleHostView.LIZIZ();
                    }
                }
                int i = c23210vd.LJLJJL;
                if (i < c23210vd.LJLIL - 1) {
                    c23210vd.LJLJJL = i + 1;
                } else {
                    c23210vd.LJLJJL = 0;
                }
            }
            C23220ve c23220ve3 = c23210vd.LJLJJI;
            c23220ve3.getClass();
            ((java.util.Map) c23220ve3.LIZ).put(this, rippleHostView);
            ((java.util.Map) c23220ve3.LIZIZ).put(rippleHostView, this);
        }
        rippleHostView.LIZ(interaction, this.LJLILLLLZI, this.LJLJLLL, this.LJLL, this.LJLJJI.getValue().LIZ, this.LJLJJL.getValue().LIZLLL, this.LJLLI);
        this.LJLJL.setValue(rippleHostView);
    }

    public C43911nv(boolean z, float f, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2, C23210vd c23210vd) {
        super(interfaceC35811ar2, z);
        this.LJLILLLLZI = z;
        this.LJLJI = f;
        this.LJLJJI = interfaceC35811ar;
        this.LJLJJL = interfaceC35811ar2;
        this.LJLJJLL = c23210vd;
        this.LJLJL = C78966Uyw.LJJJIL(null);
        this.LJLJLJ = C78966Uyw.LJJJIL(Boolean.TRUE);
        this.LJLJLLL = C10430b1.LIZIZ;
        this.LJLL = -1;
        this.LJLLI = new IDqS420S0100000(this, 167);
    }
}

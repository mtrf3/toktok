package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8NH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NH extends C8NL<ReusedUISlotAssem<? extends C3C8>> {
    public ReusedUISlotAssem<? extends C3C8> LIZJ;
    public int LIZLLL;
    public C212518Vr LJ = C212518Vr.LIZ;
    public View LJFF;

    @Override // X.C8NL
    /* renamed from: LIZIZ */
    public final ReusedUISlotAssem<? extends C3C8> build() {
        ReusedUISlotAssem<? extends C3C8> reusedUISlotAssem = (ReusedUISlotAssem) super.build();
        reusedUISlotAssem.LJLZ = this.LIZLLL;
        reusedUISlotAssem.l4(this.LJ);
        View view = this.LJFF;
        if (view != null) {
            reusedUISlotAssem.LJLLJ = view;
        }
        return reusedUISlotAssem;
    }

    @Override // X.C8NL, X.C8VP
    public final C8W0 build() {
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) super.build();
        reusedUISlotAssem.LJLZ = this.LIZLLL;
        reusedUISlotAssem.l4(this.LJ);
        View view = this.LJFF;
        if (view != null) {
            reusedUISlotAssem.LJLLJ = view;
        }
        return reusedUISlotAssem;
    }

    @Override // X.C8NL
    public final /* bridge */ /* synthetic */ ReusedUISlotAssem<? extends C3C8> LIZJ() {
        return this.LIZJ;
    }

    public final void LJFF(C212518Vr c212518Vr) {
        o.LJIIIZ(c212518Vr, "<set-?>");
        this.LJ = c212518Vr;
    }
}

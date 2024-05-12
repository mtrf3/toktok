package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;

/* renamed from: X.TMk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74518TMk implements TN0 {
    public InterfaceC65784Pro<? extends InterfaceC74566TOg<Effect, C44371HbD>> LIZ;
    public final boolean LIZIZ = true;
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZJ;
    public final InterfaceC65784Pro<TN3> LIZLLL;

    @Override // X.TN0
    public final C74515TMh create() {
        C74520TMm c74520TMm = new C74520TMm(this.LIZJ);
        C74526TMs c74526TMs = new C74526TMs(c74520TMm, new AqS162S0100000_12(this, 1256));
        InterfaceC65784Pro<? extends InterfaceC74566TOg<Effect, C44371HbD>> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null) {
            c74526TMs.LJ(interfaceC65784Pro.invoke());
        }
        return new C74515TMh(this.LIZLLL.invoke(), new TMW(this.LIZJ), new TMT(this.LIZIZ, this.LIZJ), new C74517TMj(c74520TMm, c74526TMs), c74526TMs, c74520TMm);
    }

    public C74518TMk(C74524TMq c74524TMq, AqS72S0400000_12 aqS72S0400000_12) {
        this.LIZJ = c74524TMq;
        this.LIZLLL = aqS72S0400000_12;
    }
}

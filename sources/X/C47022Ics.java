package X;

import com.ss.android.ugc.aweme.player.sdk.psmv3.DynamicConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Ics, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47022Ics implements InterfaceC47034Id4 {
    public final C46999IcV LIZ;
    public final InterfaceC47032Id2 LIZIZ;
    public final C47039Id9 LIZJ;
    public final C47029Icz LIZLLL;
    public final AqS174S0100000_8 LJ;
    public final ArrayList<InterfaceC47033Id3> LJFF;

    @Override // X.InterfaceC47034Id4
    public final int type() {
        return 4;
    }

    @Override // X.InterfaceC47032Id2
    public final void release() {
        this.LIZJ.LIZ(C47024Icu.LJLIL);
        ((LinkedList) this.LIZJ.LIZJ).clear();
    }

    @Override // X.InterfaceC47034Id4
    public final boolean LIZ(C47007Icd c47007Icd) {
        boolean z = false;
        if (c47007Icd == null) {
            return false;
        }
        c47007Icd.LJII();
        Iterator<InterfaceC47033Id3> it = this.LJFF.iterator();
        while (true) {
            if (it.hasNext()) {
                InterfaceC47033Id3 next = it.next();
                if (!next.LIZ(c47007Icd)) {
                    C16880lQ.LJLLJ(next.getClass());
                    break;
                }
            } else {
                C47039Id9 c47039Id9 = this.LIZJ;
                if (!((LinkedList) c47039Id9.LIZJ).contains(c47007Icd)) {
                    if (((LinkedList) c47039Id9.LIZJ).size() >= c47039Id9.LIZ) {
                        c47039Id9.LIZIZ.LIZ(c47039Id9, c47007Icd);
                    }
                    if (((LinkedList) c47039Id9.LIZJ).size() < c47039Id9.LIZ) {
                        z = ((LinkedList) c47039Id9.LIZJ).offer(c47007Icd);
                    }
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("save | success : ");
        LIZ.append(z);
        LIZ.append(" | ");
        LIZ.append(c47007Icd);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        String msg2 = o.LJIILLIIL(this.LIZJ, "save after | ");
        o.LJIIIZ(msg2, "msg");
        if (!z) {
            c47007Icd.LJI();
            c47007Icd.LJFF();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r1 == null) goto L3;
     */
    @Override // X.InterfaceC47032Id2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47007Icd LIZIZ(X.IX4 r4) {
        /*
            r3 = this;
            if (r4 != 0) goto Le
        L2:
            X.Id2 r0 = r3.LIZIZ
            X.Icd r1 = r0.LIZIZ(r4)
        L8:
            X.Icz r0 = r3.LIZLLL
            r0.invoke(r1)
            return r1
        Le:
            java.util.ArrayList<X.Id3> r0 = r3.LJFF
            java.util.Iterator r2 = r0.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            X.Id3 r1 = (X.InterfaceC47033Id3) r1
            boolean r0 = r1.LIZIZ(r4)
            if (r0 != 0) goto L14
            java.lang.Class r0 = r1.getClass()
            X.C16880lQ.LJLLJ(r0)
            goto L2
        L2e:
            X.IcV r0 = r3.LIZ
            r0.getClass()
            X.IcV r0 = r3.LIZ
            boolean r0 = r0.LIZJ
            if (r0 != 0) goto L46
            X.Id9 r1 = r3.LIZJ
            X.Ici r0 = X.C47012Ici.LJLIL
            java.lang.Object r1 = r1.LJ(r0)
            X.Icd r1 = (X.C47007Icd) r1
        L43:
            if (r1 != 0) goto L8
            goto L2
        L46:
            X.Id9 r2 = r3.LIZJ
            kotlin.jvm.internal.AqS174S0100000_8 r1 = new kotlin.jvm.internal.AqS174S0100000_8
            r0 = 229(0xe5, float:3.21E-43)
            r1.<init>(r4, r0)
            java.lang.Object r1 = r2.LJ(r1)
            kotlin.jvm.internal.AqS174S0100000_8 r0 = r3.LJ
            r0.invoke(r1)
            X.Icd r1 = (X.C47007Icd) r1
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47022Ics.LIZIZ(X.IX4):X.Icd");
    }

    public C47022Ics(C46999IcV playSessionConfig, C47010Icg sessionProvider) {
        o.LJIIIZ(playSessionConfig, "playSessionConfig");
        o.LJIIIZ(sessionProvider, "sessionProvider");
        this.LIZ = playSessionConfig;
        this.LIZIZ = sessionProvider;
        this.LIZJ = new C47039Id9(playSessionConfig.LJFF, new C47704Ins());
        this.LIZLLL = C47029Icz.LJLIL;
        this.LJ = new AqS174S0100000_8(this, 228);
        ArrayList<InterfaceC47033Id3> arrayList = new ArrayList<>();
        this.LJFF = arrayList;
        DynamicConfig LJJIL = IZ8.LJJIL();
        if (LJJIL.getDisableAudioRecycle()) {
            arrayList.add(new C47028Icy());
        }
        if (LJJIL.getDisable264Recycle()) {
            arrayList.add(new C47026Icw());
        }
        if (LJJIL.getDisable266Recycle()) {
            arrayList.add(new C47025Icv());
        }
        if (LJJIL.getDisableSoftwareDecodeRecycle()) {
            arrayList.add(new C47027Icx());
        }
        if (LJJIL.getDisableSRRecycle()) {
            arrayList.add(new C47018Ico());
        }
        if (IZ8.LJIL()) {
            arrayList.add(new C47023Ict());
        }
    }
}

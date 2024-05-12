package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43045Guv;
import X.C5I4;
import X.C5IG;
import X.C68322mC;
import X.C72242sW;
import X.C76800UCe;
import X.EnumC124724uy;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* loaded from: classes3.dex */
public class AqS0S2520000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public boolean z7;
    public boolean z8;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S2520000_2 aqS0S2520000_2) {
        C43045Guv.LIZLLL(new AqS0S2520000_2((C5I4) aqS0S2520000_2.l2, aqS0S2520000_2.z7, (AVMusic) aqS0S2520000_2.l3, aqS0S2520000_2.s0, (C72242sW) aqS0S2520000_2.l4, aqS0S2520000_2.s1, aqS0S2520000_2.z8, (C68322mC) aqS0S2520000_2.l5, (InterfaceC65784Pro) aqS0S2520000_2.l6, 1), 0L);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2520000_2 aqS0S2520000_2) {
        ((C5I4) aqS0S2520000_2.l2).LJJIFFI(aqS0S2520000_2.z7, (AVMusic) aqS0S2520000_2.l3, aqS0S2520000_2.s0, ((C72242sW) aqS0S2520000_2.l4).element, aqS0S2520000_2.s1, 0L, aqS0S2520000_2.z8);
        ((C5I4) aqS0S2520000_2.l2).LJIILLIIL();
        final C5I4 c5i4 = (C5I4) aqS0S2520000_2.l2;
        AVMusic aVMusic = (AVMusic) aqS0S2520000_2.l3;
        boolean z = c5i4.LJIILLIIL;
        final C68322mC c68322mC = (C68322mC) aqS0S2520000_2.l5;
        final boolean z2 = aqS0S2520000_2.z7;
        final InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS0S2520000_2.l6;
        c5i4.LJII(aVMusic, z, false, new C5IG() { // from class: X.5I6
            @Override // X.C5IG
            public final void onFailed() {
                if (c68322mC.element == EnumC124724uy.COMMIT) {
                    C79057V0z.LJJ(c5i4.LJIIZILJ()).LJFF();
                    C5ID c5id = c5i4.LJJ;
                    if (c5id != null) {
                        c5id.LIZIZ();
                    }
                }
                c5i4.LJIILIIL(z2, c68322mC.element, true, interfaceC65784Pro);
            }

            @Override // X.C5IG
            public final void onSuccess() {
                c5i4.LJIILIIL(z2, c68322mC.element, true, interfaceC65784Pro);
            }
        });
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS0S2520000_2(C5I4 c5i4, C5I4 c5i42, boolean z, AVMusic aVMusic, String str, C72242sW c72242sW, String str2, boolean z2, C68322mC<EnumC124724uy> c68322mC, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l2 = c5i4;
        this.z7 = c5i42;
        this.l3 = z;
        this.s0 = aVMusic;
        this.l4 = str;
        this.s1 = c72242sW;
        this.z8 = str2;
        this.l5 = z2;
        this.l6 = c68322mC;
    }
}

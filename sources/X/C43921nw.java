package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43921nw extends AbstractC35421aE implements InterfaceC24390xX {
    public final boolean LJLILLLLZI;
    public final float LJLJI;
    public final InterfaceC24760y8<C11850dJ> LJLJJI;
    public final InterfaceC24760y8<C23180va> LJLJJL;
    public final C41311jj<C1OJ, C23190vb> LJLJJLL;

    public C43921nw() {
        throw null;
    }

    @Override // X.InterfaceC24390xX
    public final void LIZJ() {
    }

    @Override // X.InterfaceC24390xX
    public final void LIZIZ() {
        this.LJLJJLL.clear();
    }

    @Override // X.InterfaceC24390xX
    public final void LIZLLL() {
        this.LJLJJLL.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0SW
    public final void LIZ(InterfaceC43021mU interfaceC43021mU) {
        float floatValue;
        Float valueOf;
        o.LJIIIZ(interfaceC43021mU, "<this>");
        long j = this.LJLJJI.getValue().LIZ;
        interfaceC43021mU.LJJLIIIIJ();
        LJFF(this.LJLJI, j, interfaceC43021mU);
        Object it = this.LJLJJLL.LJLILLLLZI.iterator();
        while (((C0O7) it).hasNext()) {
            C23190vb c23190vb = (C23190vb) ((Map.Entry) ((C1IH) it).next()).getValue();
            float f = this.LJLJJL.getValue().LIZLLL;
            if (f != 0.0f) {
                long LIZIZ = C11850dJ.LIZIZ(j, f);
                c23190vb.getClass();
                if (c23190vb.LIZLLL == null) {
                    long LIZIZ2 = interfaceC43021mU.LIZIZ();
                    c23190vb.LIZLLL = Float.valueOf(Math.max(C10430b1.LIZLLL(LIZIZ2), C10430b1.LIZIZ(LIZIZ2)) * 0.3f);
                }
                if (c23190vb.LJ == null) {
                    if (Float.isNaN(c23190vb.LIZIZ)) {
                        valueOf = Float.valueOf(C23200vc.LIZ(interfaceC43021mU, c23190vb.LIZJ, interfaceC43021mU.LIZIZ()));
                    } else {
                        valueOf = Float.valueOf(interfaceC43021mU.LJJJJIZL(c23190vb.LIZIZ));
                    }
                    c23190vb.LJ = valueOf;
                }
                if (c23190vb.LIZ == null) {
                    c23190vb.LIZ = new C10370av(interfaceC43021mU.LJJL());
                }
                if (c23190vb.LJFF == null) {
                    c23190vb.LJFF = new C10370av(C78923UyF.LIZ(C10430b1.LIZLLL(interfaceC43021mU.LIZIZ()) / 2.0f, C10430b1.LIZIZ(interfaceC43021mU.LIZIZ()) / 2.0f));
                }
                if (((Boolean) c23190vb.LJIIJJI.getValue()).booleanValue() && !((Boolean) c23190vb.LJIIJ.getValue()).booleanValue()) {
                    floatValue = 1.0f;
                } else {
                    floatValue = c23190vb.LJI.LIZJ().floatValue();
                }
                Float f2 = c23190vb.LIZLLL;
                o.LJI(f2);
                float floatValue2 = f2.floatValue();
                Float f3 = c23190vb.LJ;
                o.LJI(f3);
                float LJJJJLI = C79146V4k.LJJJJLI(floatValue2, f3.floatValue(), c23190vb.LJII.LIZJ().floatValue());
                C10370av c10370av = c23190vb.LIZ;
                o.LJI(c10370av);
                float LIZLLL = C10370av.LIZLLL(c10370av.LIZ);
                C10370av c10370av2 = c23190vb.LJFF;
                o.LJI(c10370av2);
                float LJJJJLI2 = C79146V4k.LJJJJLI(LIZLLL, C10370av.LIZLLL(c10370av2.LIZ), c23190vb.LJIIIIZZ.LIZJ().floatValue());
                C10370av c10370av3 = c23190vb.LIZ;
                o.LJI(c10370av3);
                float LJ = C10370av.LJ(c10370av3.LIZ);
                C10370av c10370av4 = c23190vb.LJFF;
                o.LJI(c10370av4);
                long LIZ = C78923UyF.LIZ(LJJJJLI2, C79146V4k.LJJJJLI(LJ, C10370av.LJ(c10370av4.LIZ), c23190vb.LJIIIIZZ.LIZJ().floatValue()));
                long LIZIZ3 = C11850dJ.LIZIZ(LIZIZ, C11850dJ.LIZLLL(LIZIZ) * floatValue);
                if (c23190vb.LIZJ) {
                    float LIZLLL2 = C10430b1.LIZLLL(interfaceC43021mU.LIZIZ());
                    float LIZIZ4 = C10430b1.LIZIZ(interfaceC43021mU.LIZIZ());
                    C33681Tw LJJIII = interfaceC43021mU.LJJIII();
                    long LIZIZ5 = LJJIII.LIZIZ();
                    LJJIII.LIZ().LJIIL();
                    LJJIII.LIZ.LIZIZ(0.0f, 0.0f, LIZLLL2, LIZIZ4, 1);
                    C14720hw.LIZJ(interfaceC43021mU, LIZIZ3, LJJJJLI, LIZ, 0.0f, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                    LJJIII.LIZ().LJIIJ();
                    LJJIII.LIZJ(LIZIZ5);
                } else {
                    C14720hw.LIZJ(interfaceC43021mU, LIZIZ3, LJJJJLI, LIZ, 0.0f, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                }
            }
        }
    }

    @Override // X.AbstractC35421aE
    public final void LJI(C1OJ interaction) {
        o.LJIIIZ(interaction, "interaction");
        C23190vb c23190vb = this.LJLJJLL.get(interaction);
        if (c23190vb != null) {
            c23190vb.LJIIJJI.setValue(Boolean.TRUE);
            c23190vb.LJIIIZ.LJJLI(C76800UCe.LIZ);
        }
    }

    @Override // X.AbstractC35421aE
    public final void LJ(C1OJ interaction, InterfaceC70422pa scope) {
        C10370av c10370av;
        o.LJIIIZ(interaction, "interaction");
        o.LJIIIZ(scope, "scope");
        Iterator it = this.LJLJJLL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            C23190vb c23190vb = (C23190vb) ((Map.Entry) it.next()).getValue();
            c23190vb.LJIIJJI.setValue(Boolean.TRUE);
            c23190vb.LJIIIZ.LJJLI(C76800UCe.LIZ);
        }
        if (this.LJLILLLLZI) {
            c10370av = new C10370av(interaction.LIZ);
        } else {
            c10370av = null;
        }
        C23190vb c23190vb2 = new C23190vb(c10370av, this.LJLJI, this.LJLILLLLZI);
        this.LJLJJLL.put(interaction, c23190vb2);
        XKX.LIZLLL(scope, null, null, new C2G3(c23190vb2, this, interaction, null), 3);
    }

    public C43921nw(boolean z, float f, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2) {
        super(interfaceC35811ar2, z);
        this.LJLILLLLZI = z;
        this.LJLJI = f;
        this.LJLJJI = interfaceC35811ar;
        this.LJLJJL = interfaceC35811ar2;
        this.LJLJJLL = new C41311jj<>();
    }
}

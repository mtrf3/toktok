package X;

import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oxc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63596Oxc implements InterfaceC63617Oxx {
    public int LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final InterfaceC65784Pro<C114444eO> LIZLLL;
    public final InterfaceC65784Pro<C63308Osy> LJ;
    public final InterfaceC65784Pro<Long> LJFF;
    public final C62822Ol8 LJI;

    @Override // X.InterfaceC63617Oxx
    public final void reset() {
        this.LIZ = 0;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
    }

    public final C63615Oxv LIZJ() {
        return (C63615Oxv) this.LJI.getValue();
    }

    @Override // X.InterfaceC63617Oxx
    public final boolean LIZ() {
        if (LIZJ().LIZIZ <= 0 || this.LIZ < LIZJ().LIZIZ) {
            return false;
        }
        int i = LIZJ().LIZJ * 1000;
        if (i > 0 && this.LJFF.invoke().longValue() - this.LIZJ > i) {
            reset();
            return false;
        }
        C63322OtC.LJI("WSFailureDetector", "shouldDiscardWS return true", null);
        return true;
    }

    @Override // X.InterfaceC63617Oxx
    public final void LIZIZ() {
        if (LIZJ().LIZIZ > 0) {
            int i = LIZJ().LIZ * 1000;
            long longValue = this.LJFF.invoke().longValue();
            if (this.LIZ == 0) {
                this.LIZIZ = longValue;
            } else if (i > 0 && this.LJFF.invoke().longValue() - this.LIZIZ > i) {
                this.LIZ = 0;
                this.LIZIZ = longValue;
            }
            if (this.LIZ < LIZJ().LIZIZ) {
                int i2 = this.LIZ + 1;
                this.LIZ = i2;
                if (i2 >= LIZJ().LIZIZ) {
                    this.LIZJ = longValue;
                    this.LJ.invoke().LJIIIZ();
                }
            }
        }
    }

    public C63596Oxc(int i) {
        C63604Oxk clientOptions = C63604Oxk.LJLIL;
        C63610Oxq client = C63610Oxq.LJLIL;
        C93M currentTimeMillis = C93M.LJLIL;
        o.LJIIIZ(clientOptions, "clientOptions");
        o.LJIIIZ(client, "client");
        o.LJIIIZ(currentTimeMillis, "currentTimeMillis");
        this.LIZ = 0;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = clientOptions;
        this.LJ = client;
        this.LJFF = currentTimeMillis;
        this.LJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 586));
    }
}

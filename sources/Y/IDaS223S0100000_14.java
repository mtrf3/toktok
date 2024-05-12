package Y;

import X.C44694HgQ;
import X.C82573Wav;
import X.C82574Waw;
import X.EnumC72807Shn;
import X.InterfaceC29937Boz;
import X.W5F;
import X.W5U;
import X.WQW;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDaS223S0100000_14 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS223S0100000_14 iDaS223S0100000_14) {
        ((WQW) iDaS223S0100000_14.l0).LJLJL.set(null);
    }

    public static final void run$1(IDaS223S0100000_14 iDaS223S0100000_14) {
        C82573Wav c82573Wav = (C82573Wav) iDaS223S0100000_14.l0;
        W5F LJFF = W5U.LJFF(C44694HgQ.LJIIIIZZ(c82573Wav.LLFFF));
        LJFF.LIZLLL = true;
        LJFF.LJIJJ = EnumC72807Shn.FIT_CENTER;
        SmartImageView smartImageView = c82573Wav.LJLJLJ;
        if (smartImageView != null) {
            LJFF.LJJIIJ = smartImageView;
            LJFF.LIZLLL(new C82574Waw(c82573Wav));
        } else {
            o.LJIJI("originalView");
            throw null;
        }
    }

    public IDaS223S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

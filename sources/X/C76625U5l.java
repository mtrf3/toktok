package X;

import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.U5l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76625U5l extends AbstractC76627U5n {
    public final /* synthetic */ C76624U5k LIZ;

    public C76625U5l(C76624U5k c76624U5k) {
        this.LIZ = c76624U5k;
    }

    @Override // X.AbstractC76627U5n
    public final void LIZ(long j) {
        AbstractC76627U5n abstractC76627U5n = this.LIZ.LJLJL;
        if (abstractC76627U5n != null) {
            abstractC76627U5n.LIZ(j);
        }
    }

    @Override // X.AbstractC76627U5n
    public final void LIZIZ(long j) {
        AbstractC76627U5n abstractC76627U5n = this.LIZ.LJLJL;
        if (abstractC76627U5n != null) {
            abstractC76627U5n.LIZIZ(j);
        }
    }

    @Override // X.AbstractC76627U5n
    public final void LIZJ(long j) {
        C2A3 c2a3 = this.LIZ.LJLILLLLZI;
        if (c2a3 != null) {
            String string = C15380j0.LJIIJ().getString(R.string.spx);
            o.LJIIIIZZ(string, "getResources().getString…ematch_countdown_postfix)");
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{String.valueOf(j)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c2a3.setText(LLLZ);
            AbstractC76627U5n abstractC76627U5n = this.LIZ.LJLJL;
            if (abstractC76627U5n != null) {
                abstractC76627U5n.LIZJ(j);
                return;
            }
            return;
        }
        o.LJIJI("rematchCountdownView");
        throw null;
    }
}

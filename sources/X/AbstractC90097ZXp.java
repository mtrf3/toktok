package X;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* renamed from: X.ZXp, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90097ZXp {
    public final Context LJLIL;
    public final C90095ZXn LJLILLLLZI;
    public final HandlerC90094ZXm LJLJI = new HandlerC90094ZXm(this);
    public AbstractC90090ZXi LJLJJI;
    public C90524Zfs LJLJJL;
    public boolean LJLJJLL;
    public C90099ZXr LJLJL;
    public boolean LJLJLJ;

    public void LJIILJJIL(C90524Zfs c90524Zfs) {
    }

    public AbstractC90599Zh5 LJIIJJI(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public AbstractC90096ZXo LJIIL(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final void LJIILL(C90099ZXr c90099ZXr) {
        ZY5.LIZIZ();
        if (this.LJLJL != c90099ZXr) {
            this.LJLJL = c90099ZXr;
            if (!this.LJLJLJ) {
                this.LJLJLJ = true;
                this.LJLJI.sendEmptyMessage(1);
            }
        }
    }

    public final void LJIILLIIL(C90524Zfs c90524Zfs) {
        ZY5.LIZIZ();
        if (Objects.equals(this.LJLJJL, c90524Zfs)) {
            return;
        }
        this.LJLJJL = c90524Zfs;
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            this.LJLJI.sendEmptyMessage(2);
        }
    }

    public AbstractC90097ZXp(Context context, C90095ZXn c90095ZXn) {
        if (context != null) {
            this.LJLIL = context;
            if (c90095ZXn == null) {
                this.LJLILLLLZI = new C90095ZXn(new ComponentName(context, getClass()));
                return;
            } else {
                this.LJLILLLLZI = c90095ZXn;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public AbstractC90096ZXo LJIILIIL(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return LJIIL(str);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
}

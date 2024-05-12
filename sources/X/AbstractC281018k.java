package X;

import android.content.Context;
import android.view.LayoutInflater;
import com.zhiliaoapp.musically.R;

/* renamed from: X.18k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC281018k implements C02O {
    public final Context LJLIL;
    public Context LJLILLLLZI;
    public C281318n LJLJI;
    public final LayoutInflater LJLJJI;
    public C02N LJLJJL;
    public final int LJLJJLL = R.layout.cw;
    public final int LJLJL = R.layout.cv;
    public C02Q LJLJLJ;
    public int LJLJLLL;

    @Override // X.C02O
    public final boolean LJ(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJI(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final int getId() {
        return this.LJLJLLL;
    }

    public AbstractC281018k(Context context) {
        this.LJLIL = context;
        this.LJLJJI = C16880lQ.LLZIL(context);
    }

    @Override // X.C02O
    public final void LJIIIZ(C02N c02n) {
        this.LJLJJL = c02n;
    }
}

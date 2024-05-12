package X;

import Y.ACListenerS35S0100000_15;
import android.content.Context;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xo5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85937Xo5 extends C25860ACy {
    public final Context LJLJJL;
    public final String LJLJJLL;

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        return new C25859ACx(this.LJLJJLL, null, new ACListenerS35S0100000_15(this, 211), null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388602);
    }

    @Override // X.C25860ACy, X.AG6
    public final /* bridge */ /* synthetic */ C25859ACx LJIIIIZZ() {
        return LJIIIIZZ();
    }

    public C85937Xo5(Context context) {
        super(null);
        String string;
        this.LJLJJL = context;
        this.LJLJJLL = (context == null || (string = context.getString(R.string.f1p)) == null) ? "" : string;
    }
}

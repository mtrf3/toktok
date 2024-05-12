package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45456Hsi extends F9E {
    public final Fragment LJLIL;
    public final Context LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final C76878UFe LJLJJL;
    public final int LJLJJLL;
    public final java.util.Map<String, Object> LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), this.LJLJJL, Integer.valueOf(this.LJLJJLL), this.LJLJL};
    }

    public C45456Hsi(Fragment fragment, ActivityC45651qj activityC45651qj, int i, int i2, C76878UFe c76878UFe, int i3, java.util.Map logInfo) {
        o.LJIIIZ(logInfo, "logInfo");
        this.LJLIL = fragment;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = c76878UFe;
        this.LJLJJLL = i3;
        this.LJLJL = logInfo;
    }
}

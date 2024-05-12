package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.PuF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65935PuF extends F9E {
    public final Application LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), this.LJLJJI, Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), this.LJLJL, this.LJLJLJ, this.LJLJLLL};
    }

    public C65935PuF(Application application, int i, long j, String channel, boolean z, String str, String str2, String str3) {
        o.LJIIIZ(channel, "channel");
        this.LJLIL = application;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = channel;
        this.LJLJJL = false;
        this.LJLJJLL = z;
        this.LJLJL = str;
        this.LJLJLJ = str2;
        this.LJLJLLL = str3;
    }
}

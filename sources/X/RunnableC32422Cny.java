package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cny, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32422Cny implements Runnable {
    public final /* synthetic */ C32425Co1 LJLIL;
    public final /* synthetic */ C32423Cnz LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ long LJLJLLL;

    public RunnableC32422Cny(C32425Co1 c32425Co1, C32423Cnz c32423Cnz, C76732zl c76732zl, long j, String str, String str2, String str3, int i, long j2) {
        this.LJLIL = c32425Co1;
        this.LJLILLLLZI = c32423Cnz;
        this.LJLJI = c76732zl;
        this.LJLJJI = j;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = i;
        this.LJLJLLL = j2;
    }

    public final void LIZ() {
        long resourceId = this.LJLIL.getResourceId();
        Long l = (Long) ((LinkedHashMap) this.LJLILLLLZI.LIZ).get(this.LJLIL.getResourceRequest().LIZ);
        Long l2 = (Long) ((LinkedHashMap) this.LJLILLLLZI.LIZIZ).get(this.LJLIL.getResourceRequest().LIZ);
        int i = this.LJLJI.element;
        String c32425Co1 = this.LJLIL.toString();
        String md5 = this.LJLIL.getResourceRequest().LJ;
        java.util.Map map = this.LJLIL.getResourceRequest().LJIIIIZZ;
        if (map == null) {
            map = new LinkedHashMap();
        }
        int i2 = this.LJLIL.getResourceRequest().LJII;
        long j = this.LJLJJI;
        String str = this.LJLJJL;
        String str2 = this.LJLJJLL;
        String str3 = this.LJLJL;
        int i3 = this.LJLJLJ;
        o.LJIIIIZZ(md5, "md5");
        C32710Csc.LIZLLL(resourceId, j, l, l2, str, str2, str3, i, c32425Co1, i3, null, md5, null, this.LJLJLLL, map, i2, 5120);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

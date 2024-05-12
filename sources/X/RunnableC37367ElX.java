package X;

import com.bytedance.pia.core.bridge.methods.CacheSaveMethod;
import com.google.gson.m;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ElX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37367ElX implements Runnable {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ m LJLJI;
    public final /* synthetic */ List LJLJJI;
    public final /* synthetic */ BQ6 LJLJJL;
    public final /* synthetic */ BQ6 LJLJJLL;

    public RunnableC37367ElX(android.net.Uri uri, String str, m mVar, List list, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        this.LJLIL = uri;
        this.LJLILLLLZI = str;
        this.LJLJI = mVar;
        this.LJLJJI = list;
        this.LJLJJL = c37399Em3;
        this.LJLJJLL = c37400Em4;
    }

    public final void LIZ() {
        try {
            android.net.Uri uri = this.LJLIL;
            o.LJFF(uri, "uri");
            this.LJLJJL.accept(new CacheSaveMethod.Result(C37376Elg.LJIILIIL(uri, this.LJLILLLLZI, this.LJLJI, this.LJLJJI)));
        } catch (Exception e) {
            BQ6 bq6 = this.LJLJJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Cache] PIA Cache Save Failed, reason: (");
            LIZ.append(e.getMessage());
            LIZ.append(')');
            bq6.accept(new C37394Ely(X1D.LIZIZ(LIZ)));
        }
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

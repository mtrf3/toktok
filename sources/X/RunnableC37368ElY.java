package X;

import android.text.TextUtils;
import com.bytedance.pia.core.bridge.methods.CacheGetContentMethod;
import com.bytedance.pia.core.cache.IPiaCacheProvider;

/* renamed from: X.ElY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37368ElY implements Runnable {
    public final /* synthetic */ BQ6 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ BQ6 LJLJI;

    public RunnableC37368ElY(C37399Em3 c37399Em3, C37400Em4 c37400Em4, String str) {
        this.LJLIL = c37399Em3;
        this.LJLILLLLZI = str;
        this.LJLJI = c37400Em4;
    }

    public final void LIZ() {
        try {
            String str = "";
            if (!C37376Elg.LJ.get()) {
                this.LJLIL.accept(new CacheGetContentMethod.Result(""));
                return;
            }
            String str2 = null;
            IPiaCacheProvider.CacheConfig LJIIIZ = C37376Elg.LJIIIZ(null, this.LJLILLLLZI);
            if (LJIIIZ != null) {
                Number number = LJIIIZ.expire;
                String str3 = LJIIIZ.version;
                if (number != null && number.longValue() > System.currentTimeMillis() && !TextUtils.isEmpty(str3)) {
                    str2 = C37376Elg.LJIIIIZZ(this.LJLILLLLZI);
                }
            }
            BQ6 bq6 = this.LJLIL;
            if (str2 != null) {
                str = str2;
            }
            bq6.accept(new CacheGetContentMethod.Result(str));
        } catch (Exception e) {
            BQ6 bq62 = this.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Cache] PIA Cache Get Content Failed, reason: (");
            LIZ.append(e.getMessage());
            LIZ.append(')');
            bq62.accept(new C37394Ely(X1D.LIZIZ(LIZ)));
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

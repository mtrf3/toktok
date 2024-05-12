package X;

import X.AbstractC08540Ve;
import X.AbstractC08550Vf;
import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: X.0Ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08540Ve<B extends AbstractC08540Ve<?, ?>, W extends AbstractC08550Vf> {
    public UUID LIZ;
    public C19380pS LIZIZ;
    public final java.util.Set<String> LIZJ;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1NL] */
    public final C1NL LIZ() {
        final C1NK c1nk = (C1NK) this;
        ?? r2 = new AbstractC08550Vf(c1nk) { // from class: X.1NL
            {
                super(c1nk.LIZ, c1nk.LIZIZ, c1nk.LIZJ);
            }
        };
        C0VP c0vp = this.LIZIZ.LJIIIZ;
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if ((i < 24 || ((HashSet) c0vp.LJII.LIZ).size() <= 0) && !c0vp.LIZLLL && !c0vp.LIZIZ && (i < 23 || !c0vp.LIZJ)) {
            z = false;
        }
        if (!this.LIZIZ.LJIILLIIL || !z) {
            this.LIZ = UUID.randomUUID();
            C19380pS c19380pS = new C19380pS(this.LIZIZ);
            this.LIZIZ = c19380pS;
            c19380pS.LIZ = this.LIZ.toString();
            return r2;
        }
        throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
    }

    public AbstractC08540Ve(Class<? extends ListenableWorker> cls) {
        HashSet hashSet = new HashSet();
        this.LIZJ = hashSet;
        this.LIZ = UUID.randomUUID();
        this.LIZIZ = new C19380pS(this.LIZ.toString(), cls.getName());
        hashSet.add(cls.getName());
    }
}

package com.ss.android.ugc.aweme.commercialize;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AwemeContextServiceImpl implements IAwemeContextService {
    public WeakReference<Aweme> LIZ;
    public WeakReference<Aweme> LIZIZ;
    public WeakReference<Aweme> LIZJ;

    public static IAwemeContextService LJ() {
        Object LIZ = C58096Mr6.LIZ(IAwemeContextService.class, false);
        if (LIZ != null) {
            return (IAwemeContextService) LIZ;
        }
        if (C58096Mr6.LLLIIL == null) {
            synchronized (IAwemeContextService.class) {
                if (C58096Mr6.LLLIIL == null) {
                    C58096Mr6.LLLIIL = new AwemeContextServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLIIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAwemeContextService
    public final Aweme LIZ() {
        WeakReference<Aweme> weakReference = this.LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAwemeContextService
    public final Aweme LIZJ() {
        WeakReference<Aweme> weakReference = this.LIZJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAwemeContextService
    public final boolean LIZLLL(String aid) {
        String str;
        Aweme aweme;
        o.LJIIIZ(aid, "aid");
        WeakReference<Aweme> weakReference = this.LIZ;
        if (weakReference != null && (aweme = weakReference.get()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return o.LJ(str, aid);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAwemeContextService
    public final void LIZIZ(Aweme aweme, Aweme aweme2, Aweme aweme3) {
        this.LIZ = new WeakReference<>(aweme);
        this.LIZIZ = new WeakReference<>(aweme2);
        this.LIZJ = new WeakReference<>(aweme3);
    }
}

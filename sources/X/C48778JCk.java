package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JCk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48778JCk implements InterfaceC48234IwQ {
    public final /* synthetic */ C48774JCg LIZ;

    public C48778JCk(C48774JCg c48774JCg) {
        this.LIZ = c48774JCg;
    }

    @Override // X.InterfaceC48234IwQ
    public final OSZ LIZ(Aweme aweme, C48780JCm c48780JCm) {
        boolean z;
        String str;
        C48774JCg c48774JCg = this.LIZ;
        if (c48774JCg.LJZL) {
            Aweme aweme2 = c48774JCg.LJIJJLI().LJLILLLLZI;
            if (aweme2 != null) {
                str = C78927UyJ.LIZIZ(aweme2);
            } else {
                str = null;
            }
            if (o.LJ(str, this.LIZ.LJLLL)) {
                z = true;
                return new OSZ(Boolean.valueOf(!z), this.LIZ.LJIILLIIL());
            }
        }
        z = false;
        return new OSZ(Boolean.valueOf(!z), this.LIZ.LJIILLIIL());
    }

    @Override // X.InterfaceC48234IwQ
    public final java.util.Map LIZIZ(Aweme aweme, C48780JCm c48780JCm) {
        return this.LIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC48234IwQ
    public final java.util.Map LIZJ(Aweme aweme, C48780JCm c48780JCm) {
        return this.LIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC48234IwQ
    public final java.util.Map LIZLLL(Aweme aweme, C48780JCm c48780JCm) {
        return this.LIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC48234IwQ
    public final java.util.Map LJ(Aweme aweme, C48780JCm c48780JCm) {
        return this.LIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC48234IwQ
    public final java.util.Map LJFF(Aweme aweme, C48780JCm c48780JCm) {
        return this.LIZ.LJIILLIIL();
    }
}

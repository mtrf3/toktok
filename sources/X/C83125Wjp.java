package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.Wjp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83125Wjp extends C83148WkC {
    public boolean LIZJ;

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final float LJIILIIL(ComposerBeauty composerBeauty, ILU gender, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
        return f;
    }

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final void LJIILL(ComposerBeauty composerBeauty, ILU gender, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
    }

    public C83125Wjp() {
        super("exterior_scene");
    }

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final boolean LLJILJILJ() {
        return this.LIZJ;
    }

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final void LJIIIZ(boolean z) {
        this.LIZJ = z;
    }
}

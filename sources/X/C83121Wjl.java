package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.Wjl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83121Wjl extends C83148WkC {
    public static final Keva LIZJ;

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

    static {
        Keva repo = Keva.getRepo("story_ulike_repo");
        o.LJIIIIZZ(repo, "getRepo(KEVA_STORY_ULIKE_REPO)");
        LIZJ = repo;
    }

    public C83121Wjl() {
        super("");
    }

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final boolean LLJILJILJ() {
        return LIZJ.getBoolean("key_disable_all_beauty", false);
    }

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final void LJIIIZ(boolean z) {
        LIZJ.storeBoolean("key_disable_all_beauty", z);
    }
}

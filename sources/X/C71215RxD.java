package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* renamed from: X.RxD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71215RxD extends C08Z {
    public final /* synthetic */ AbstractC71187Rwl LIZ;

    public C71215RxD(AbstractC71187Rwl abstractC71187Rwl) {
        this.LIZ = abstractC71187Rwl;
    }

    @Override // X.C08Z
    public final void onFragmentPaused(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentPaused(fm, f);
        String tag = f.getTag();
        if (tag == null) {
            return;
        }
        switch (tag.hashCode()) {
            case 69820330:
                if (!tag.equals("INPUT")) {
                    return;
                }
                break;
            case 171425331:
                if (!tag.equals("pdp_fragment")) {
                    return;
                }
                break;
            case 298291402:
                if (!tag.equals("BulletPopUp")) {
                    return;
                }
                break;
            case 911085005:
                if (!tag.equals("live_profile_detail_dialog")) {
                    return;
                }
                break;
            default:
                return;
        }
        C71195Rwt c71195Rwt = this.LIZ.LJLJL;
        if (!c71195Rwt.LIZLLL || !c71195Rwt.LIZJ || !c71195Rwt.LJ) {
            return;
        }
        c71195Rwt.LJ = false;
        c71195Rwt.LIZIZ();
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentResumed(fm, f);
        String tag = f.getTag();
        if (tag == null) {
            return;
        }
        switch (tag.hashCode()) {
            case 69820330:
                if (!tag.equals("INPUT")) {
                    return;
                }
                break;
            case 171425331:
                if (!tag.equals("pdp_fragment")) {
                    return;
                }
                C71195Rwt c71195Rwt = this.LIZ.LJLJL;
                c71195Rwt.getClass();
                c71195Rwt.LJIIIIZZ = "next";
                C71195Rwt c71195Rwt2 = this.LIZ.LJLJL;
                if (!c71195Rwt2.LIZLLL || !c71195Rwt2.LIZJ || c71195Rwt2.LJ) {
                    return;
                }
                c71195Rwt2.LJ = true;
                c71195Rwt2.LIZ();
                return;
            case 298291402:
                if (!tag.equals("BulletPopUp")) {
                    return;
                }
                break;
            case 911085005:
                if (!tag.equals("live_profile_detail_dialog")) {
                    return;
                }
                break;
            default:
                return;
        }
        C71195Rwt c71195Rwt3 = this.LIZ.LJLJL;
        c71195Rwt3.getClass();
        c71195Rwt3.LJIIIIZZ = "other";
        C71195Rwt c71195Rwt4 = this.LIZ.LJLJL;
        if (!c71195Rwt4.LIZLLL || !c71195Rwt4.LIZJ || c71195Rwt4.LJ) {
            return;
        }
        c71195Rwt4.LJ = true;
        c71195Rwt4.LIZ();
    }
}

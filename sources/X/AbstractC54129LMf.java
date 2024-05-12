package X;

import Y.AObserverS77S0100000_9;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.LMf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54129LMf implements LM4, LNI {
    public final LNP LJLIL;
    public AObserverS77S0100000_9 LJLILLLLZI;
    public final String LJLJI = LMF.SEARCH.getTag();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C54130LMg.LJLIL);

    @Override // X.LM4
    public void LIZ() {
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return 8388629;
    }

    @Override // X.LM4
    public void LIZJ() {
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
    }

    public void LJI() {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    public abstract void LJIIJJI(int i);

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.LM4
    public final void onCreate() {
    }

    @Override // X.LM4
    public final void onDestroyView() {
    }

    @Override // X.LM4
    public final void onPause() {
    }

    @Override // X.LM4
    public final void onResume() {
    }

    public final ISearchService LJIIIIZZ() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-searchService>(...)");
        return (ISearchService) value;
    }

    public final void LJIIIZ() {
        ActivityC45651qj activity;
        if (this.LJLILLLLZI == null || (activity = this.LJLIL.getActivity()) == null) {
            return;
        }
        AObserverS77S0100000_9 aObserverS77S0100000_9 = this.LJLILLLLZI;
        NextLiveData LIZJ = LNH.LIZJ(activity);
        if (aObserverS77S0100000_9 != null) {
            LIZJ.removeObserver(aObserverS77S0100000_9);
            this.LJLILLLLZI = null;
        } else {
            "Java has declared not null, follow previous logic".toString();
            throw new IllegalArgumentException("Java has declared not null, follow previous logic");
        }
    }

    @Override // X.LM4
    public final boolean enabled() {
        String LLLLLZ = this.LJLIL.LLLLLZ();
        if ((!TextUtils.equals(LLLLLZ, "homepage_hot") && !TextUtils.equals(LLLLLZ, "homepage_follow") && !TextUtils.equals(LLLLLZ, "homepage_popular") && !TextUtils.equals(LLLLLZ, "homepage_friends") && !TextUtils.equals(LLLLLZ, "homepage_nearby") && !TextUtils.equals(LLLLLZ, "homepage_explore") && !LO7.LIZIZ.J1(LLLLLZ)) || AV1.LJIIJJI()) {
            return false;
        }
        return true;
    }

    @Override // X.LM4
    public final String getTag() {
        return this.LJLJI;
    }

    public AbstractC54129LMf(LNP lnp) {
        this.LJLIL = lnp;
    }

    public final boolean LIZLLL(View searchView) {
        o.LJIIIZ(searchView, "searchView");
        ActivityC45651qj activity = this.LJLIL.getActivity();
        if (activity == null || LRD.LIZ(activity).LJ() || LRD.LIZ(activity).LIZJ()) {
            return false;
        }
        if (a.LJIIIZ().LIZJ()) {
            AnonymousClass030.LJ(searchView, R.string.g9g);
            return false;
        }
        return true;
    }
}

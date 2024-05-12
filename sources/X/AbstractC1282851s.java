package X;

import androidx.fragment.app.Fragment;
import com.ss.ugc.android.editor.base.functions.ShowPanelFragmentEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.51s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1282851s implements C52A {
    public final ActivityC45651qj LIZ;
    public final int LIZIZ;
    public final C151035wJ LIZJ;
    public Fragment LIZLLL;

    @Override // X.C52A
    public boolean LIZLLL(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        return false;
    }

    @Override // X.C52A
    public final void LIZJ() {
        Fragment fragment = this.LIZLLL;
        if (fragment != null && fragment.isAdded()) {
            this.LIZJ.getClass();
            C151035wJ.LIZ(fragment);
            this.LIZLLL = null;
        }
    }

    public AbstractC1282851s(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = R.id.cjl;
        C151035wJ c151035wJ = new C151035wJ(Integer.valueOf(R.id.cjl));
        this.LIZJ = c151035wJ;
        c151035wJ.LIZIZ = activity;
    }

    public final void LJ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZLLL = fragment;
        this.LIZJ.LIZLLL(fragment);
        ShowPanelFragmentEvent showPanelFragmentEvent = (ShowPanelFragmentEvent) C5G0.LIZ(ShowPanelFragmentEvent.class);
        showPanelFragmentEvent.LJLIL.setValue(C16880lQ.LJLLILLLL(fragment.getClass()));
    }
}

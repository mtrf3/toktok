package Y;

import X.AnonymousClass474;
import X.AnonymousClass486;
import X.C109544Rq;
import X.C34B;
import X.C46U;
import X.C4RY;
import X.C4YJ;
import X.C4YK;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCListenerS242S0100000_1 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            case 3:
                onViewAttachedToWindow$3(this, view);
                return;
            case 4:
                onViewAttachedToWindow$4(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                return;
            case 3:
                o.LJIIIZ(view, "v");
                return;
            case 4:
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    public IDCListenerS242S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        C4YJ c4yj;
        ReadStateViewModel readStateVM;
        o.LJIIIZ(v, "v");
        Fragment fragment = ((C4YJ) iDCListenerS242S0100000_1.l0).getFragment();
        if (fragment != null && (readStateVM = (c4yj = (C4YJ) iDCListenerS242S0100000_1.l0).getReadStateVM()) != null) {
            readStateVM.gv0(fragment, c4yj);
        }
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        o.LJIIIZ(v, "v");
        AnonymousClass486 anonymousClass486 = (AnonymousClass486) iDCListenerS242S0100000_1.l0;
        anonymousClass486.getClass();
        if (SuggestedReplyExperiment.LIZJ() && SuggestedReplyExperiment.LJ()) {
            C109544Rq c109544Rq = anonymousClass486.LIZIZ;
            if ((c109544Rq != null && C46U.LJFF(c109544Rq)) || !anonymousClass486.LJI) {
                return;
            }
            anonymousClass486.LIZLLL();
        }
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        C4YK c4yk;
        ReadStateViewModel readStateVM;
        o.LJIIIZ(v, "v");
        Fragment fragment = ((C4YK) iDCListenerS242S0100000_1.l0).getFragment();
        if (fragment != null && (readStateVM = (c4yk = (C4YK) iDCListenerS242S0100000_1.l0).getReadStateVM()) != null) {
            readStateVM.gv0(fragment, c4yk);
        }
    }

    public static final void onViewAttachedToWindow$3(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        o.LJIIIZ(v, "v");
        ((AnonymousClass474) iDCListenerS242S0100000_1.l0).LIZ();
    }

    public static final void onViewAttachedToWindow$4(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        o.LJIIIZ(v, "v");
        if (((C4RY) iDCListenerS242S0100000_1.l0).LJLIL.getViewTreeObserver().isAlive()) {
            ((C4RY) iDCListenerS242S0100000_1.l0).LJLIL.getViewTreeObserver().addOnDrawListener((C4RY) iDCListenerS242S0100000_1.l0);
        }
        ((C4RY) iDCListenerS242S0100000_1.l0).LJLIL.removeOnAttachStateChangeListener(iDCListenerS242S0100000_1);
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        o.LJIIIZ(v, "v");
        ValueAnimator valueAnimator = ((C4YJ) iDCListenerS242S0100000_1.l0).LJLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ReadStateViewModel readStateVM = ((C4YJ) iDCListenerS242S0100000_1.l0).getReadStateVM();
        if (readStateVM != null) {
            C4YJ observer = (C4YJ) iDCListenerS242S0100000_1.l0;
            o.LJIIIZ(observer, "observer");
            C34B.LIZIZ("ReadStateViewModel", "detachObserver");
            if (!readStateVM.LJLILLLLZI) {
                return;
            }
            readStateVM.LJLIL.LIZJ().removeObserver(observer);
        }
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        o.LJIIIZ(v, "v");
        AnonymousClass486 anonymousClass486 = (AnonymousClass486) iDCListenerS242S0100000_1.l0;
        anonymousClass486.getClass();
        if (!SuggestedReplyExperiment.LIZJ() || !SuggestedReplyExperiment.LJ() || anonymousClass486.LIZJ() == null) {
            return;
        }
        anonymousClass486.LIZ();
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS242S0100000_1 iDCListenerS242S0100000_1, View v) {
        o.LJIIIZ(v, "v");
        ((C4YK) iDCListenerS242S0100000_1.l0).getClass();
        ReadStateViewModel readStateVM = ((C4YK) iDCListenerS242S0100000_1.l0).getReadStateVM();
        if (readStateVM != null) {
            C4YK observer = (C4YK) iDCListenerS242S0100000_1.l0;
            o.LJIIIZ(observer, "observer");
            C34B.LIZIZ("ReadStateViewModel", "detachObserver");
            if (!readStateVM.LJLILLLLZI) {
                return;
            }
            readStateVM.LJLIL.LIZJ().removeObserver(observer);
        }
    }
}

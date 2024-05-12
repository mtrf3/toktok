package X;

import Y.ALAdapterS6S0200000_8;
import Y.AObserverS76S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.play.core.appupdate.v;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS46S1000000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JEF extends JEG {
    public JEE LJIJI;
    public PipFeedWindowVM LJIJJ;
    public C48813JDt LJIJJLI;
    public final C62822Ol8 LJIL;

    @Override // X.JEG
    public final void LIZIZ() {
        JE0 value;
        super.LIZIZ();
        JEE jee = this.LJIJI;
        if (jee != null) {
            jee.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            jee.LJLILLLLZI.clear();
            jee.LIZLLL();
        }
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM != null && (value = pipFeedWindowVM.LJLILLLLZI.getValue()) != null) {
            JEI.LIZIZ(new JEJ(value, this.LJIIIIZZ, this.LJIIIZ, this.LJIILJJIL));
        }
    }

    @Override // X.JEG
    public final C48813JDt LJ() {
        return this.LJIJJLI;
    }

    public JEF(Context context) {
        super(context);
        float f = JEG.LJIIZILJ;
        String string = JEI.LIZ().getString("last_window_size", "DEFAULT");
        o.LJIIIIZZ(string, "keva.getString(KV_WINDOW… WindowMode.DEFAULT.name)");
        this.LJIJJLI = new C48813JDt(f, true, C48814JDu.LIZIZ(JE0.valueOf(string)));
        this.LJIL = C221108m2.LIZIZ(new AqS46S1000000_8("PipFeedFloatingWindow", 1));
    }

    @Override // X.JEG
    public final void LIZJ(ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM != null) {
            JE0 value = pipFeedWindowVM.LJLILLLLZI.getValue();
            if (value == null || pipFeedWindowVM.LJLJJL == value) {
                return;
            }
            animator.addListener(new ALAdapterS6S0200000_8(pipFeedWindowVM, value, 5));
            Iterator it = ((ArrayList) pipFeedWindowVM.LJLJJLL).iterator();
            while (it.hasNext()) {
                InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) it.next();
                JE0 je0 = pipFeedWindowVM.LJLJJL;
                if (je0 != null) {
                    Object animatedValue = animator.getAnimatedValue();
                    o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    interfaceC88473Ynt.invoke(animatedValue, je0, value);
                }
            }
            return;
        }
        o.LJIJI("vm");
        throw null;
    }

    @Override // X.JEG
    public final void LIZLLL(String str) {
        JE0 value;
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM != null) {
            pipFeedWindowVM.LJLJI.postValue(str);
            PipFeedWindowVM pipFeedWindowVM2 = this.LJIJJ;
            if (pipFeedWindowVM2 != null && (value = pipFeedWindowVM2.LJLILLLLZI.getValue()) != null) {
                JEI.LIZIZ(new JEJ(value, this.LJIIIIZZ, this.LJIIIZ, this.LJIILJJIL));
                return;
            }
            return;
        }
        o.LJIJI("vm");
        throw null;
    }

    @Override // X.JEG
    public final void LJII(C48811JDr c48811JDr) {
        super.LJII(c48811JDr);
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM != null) {
            pipFeedWindowVM.LJLJJI.postValue(Boolean.TRUE);
        } else {
            o.LJIJI("vm");
            throw null;
        }
    }

    public final JEE LJIIJ(Context context) {
        View view;
        o.LJIIIZ(context, "context");
        JEE jee = new JEE(context);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bzf, jee, true);
        jee.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        jee.LIZJ();
        v vVar = jee.LJLJJL;
        vVar.getClass();
        Iterator it = ((List) vVar.LIZ).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((JEO) it.next()).LIZ).iterator();
            while (it2.hasNext()) {
                JEA jea = (JEA) it2.next();
                jea.getClass();
                int i = jea.LJLIL;
                if (i != -1) {
                    view = jee.findViewById(i);
                    o.LJIIIIZZ(view, "{\n            viewGroup.…entContainerId)\n        }");
                } else {
                    view = jee;
                }
                Context context2 = jee.getContext();
                o.LJIIIIZZ(context2, "viewGroup.context");
                jea.LJLJJL = context2;
                jea.LJLJJI = jee.getResources();
                if (view instanceof ViewGroup) {
                    Context context3 = jee.getContext();
                    o.LJIIIIZZ(context3, "viewGroup.context");
                    View LJI = jea.LJI(context3, jee);
                    jea.LJLILLLLZI = LJI;
                    if (LJI != null) {
                        ((ViewGroup) view).addView(LJI);
                    }
                } else if (view instanceof ViewStub) {
                    jea.LJLILLLLZI = ((ViewStub) view).inflate();
                }
                View view2 = jea.LJLILLLLZI;
                if (view2 != null) {
                    jea.LJIILJJIL(view2);
                }
            }
        }
        this.LJIJI = jee;
        PipFeedWindowVM pipFeedWindowVM = (PipFeedWindowVM) new ViewModelProvider(jee.getViewModelStore(), jee.getDefaultViewModelProviderFactory(), null, 4, null).get(PipFeedWindowVM.class);
        this.LJIJJ = pipFeedWindowVM;
        if (pipFeedWindowVM != null) {
            pipFeedWindowVM.LJLILLLLZI.observe(jee, new AObserverS76S0100000_8(this, 0));
            PipFeedWindowVM pipFeedWindowVM2 = this.LJIJJ;
            if (pipFeedWindowVM2 != null) {
                pipFeedWindowVM2.LJLIL.observe(jee, new AObserverS76S0100000_8(this, 1));
                return jee;
            }
            o.LJIJI("vm");
            throw null;
        }
        o.LJIJI("vm");
        throw null;
    }

    public final void LJIIJJI(WindowManager.LayoutParams layoutParams) {
        int i;
        int i2;
        String string = JEI.LIZ().getString("last_window_size", "DEFAULT");
        o.LJIIIIZZ(string, "keva.getString(KV_WINDOW… WindowMode.DEFAULT.name)");
        boolean z = false;
        JEJ jej = new JEJ(JE0.valueOf(string), new Point(JEI.LIZ().getInt("last_window_position_x", 0), JEI.LIZ().getInt("last_window_position_y", 0)), JEI.LIZ().getBoolean("last_window_adhere_to_left", false), JEI.LIZ().getFloat("last_window_position_y_relative", -1.0f));
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LJIL.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[setDefaultPosition] recover last position with state ");
        LIZ.append(jej);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (jej.LIZJ) {
            i = this.LIZLLL.left;
        } else {
            i = this.LIZLLL.right;
        }
        layoutParams.x = i;
        Float valueOf = Float.valueOf(jej.LIZLLL);
        float floatValue = valueOf.floatValue();
        if (floatValue > 0.0f && floatValue < 1.0f) {
            z = true;
        }
        if (z) {
            float floatValue2 = valueOf.floatValue();
            int i3 = this.LJIIJJI;
            i2 = ((int) (floatValue2 * ((i3 - r1) - this.LJIILIIL))) + this.LJIIL;
        } else {
            i2 = jej.LIZIZ.y;
        }
        Rect rect = this.LIZLLL;
        layoutParams.y = C78609UtB.LJJIIZ(i2, rect.top, rect.bottom);
        this.LJIIIZ = jej.LIZJ;
        PipFeedWindowVM pipFeedWindowVM = this.LJIJJ;
        if (pipFeedWindowVM != null) {
            pipFeedWindowVM.LJLILLLLZI.setValue(jej.LIZ);
            this.LJIIIIZZ.set(layoutParams.x, layoutParams.y);
        } else {
            o.LJIJI("vm");
            throw null;
        }
    }
}

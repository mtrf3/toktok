package X;

import Y.IDAListenerS41S0200000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Nph, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60557Nph extends FrameLayout implements InterfaceC60585Nq9, InterfaceC60582Nq6 {
    public static final /* synthetic */ int LJLJJLL = 0;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLIL;
    public C60563Npn LJLILLLLZI;
    public boolean LJLJI;
    public View LJLJJI;
    public HashMap LJLJJL;

    @Override // X.InterfaceC60582Nq6
    public final void LIZ() {
        setVisibility(0);
        ViewPropertyAnimator animate = animate();
        o.LJFF(animate, "this.animate()");
        ViewPropertyAnimator LJFF = LJFF(animate, this.LJLILLLLZI.LJLIL, 0.0f, 0.0f);
        LJFF.setDuration(200L);
        LJFF.start();
        this.LJLJI = true;
    }

    @Override // X.InterfaceC60582Nq6
    public final void LIZIZ() {
        this.LJLJI = true;
        ViewPropertyAnimator animate = animate();
        o.LJFF(animate, "animate()");
        ViewPropertyAnimator LJFF = LJFF(animate, this.LJLILLLLZI.LJLIL, r3.LJLILLLLZI, r3.LJLJI);
        LJFF.setDuration(200L);
        LJFF.setListener(new IDAListenerS41S0200000_10(LJFF, this, 1));
        LJFF.start();
    }

    @Override // X.InterfaceC60582Nq6
    public final void LIZLLL() {
        this.LJLJI = false;
        ViewPropertyAnimator animate = animate();
        o.LJFF(animate, "animate()");
        ViewPropertyAnimator LJFF = LJFF(animate, this.LJLILLLLZI.LJLIL, r3.LJLILLLLZI, r3.LJLJI);
        LJFF.setDuration(200L);
        LJFF.setListener(new IDAListenerS41S0200000_10(LJFF, this, 2));
        LJFF.start();
    }

    public final View LJ(int i) {
        if (this.LJLJJL == null) {
            this.LJLJJL = new HashMap();
        }
        View view = (View) this.LJLJJL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJLJJL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C60557Nph(Context context) {
        super(context, null, 0);
        this.LJLILLLLZI = new C60563Npn(false, 0, 0, 0, (int) (0 * 0.73f), -1, null);
        this.LJLJI = true;
    }

    @Override // X.InterfaceC60585Nq9
    public final void LIZJ(int i, Integer num, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        if (z) {
            if (num != null) {
                int min = Math.min(num.intValue(), this.LJLILLLLZI.LJLJJL);
                View view = this.LJLJJI;
                if (view != null && (layoutParams4 = view.getLayoutParams()) != null) {
                    layoutParams4.height = min;
                }
                View LJ = LJ(R.id.btd);
                if (LJ != null && (layoutParams3 = LJ.getLayoutParams()) != null) {
                    layoutParams3.height = min;
                }
            }
            setPadding(0, 0, 0, i);
            return;
        }
        View view2 = this.LJLJJI;
        if (view2 != null && (layoutParams2 = view2.getLayoutParams()) != null) {
            layoutParams2.height = this.LJLILLLLZI.LJLJJL;
        }
        View LJ2 = LJ(R.id.btd);
        if (LJ2 != null && (layoutParams = LJ2.getLayoutParams()) != null) {
            layoutParams.height = this.LJLILLLLZI.LJLJJL;
        }
        setPadding(0, 0, 0, 0);
    }

    public static ViewPropertyAnimator LJFF(ViewPropertyAnimator viewPropertyAnimator, boolean z, float f, float f2) {
        ViewPropertyAnimator translationY;
        String str;
        if (z) {
            translationY = viewPropertyAnimator.translationX(f2);
            str = "viewPropertyAnimator.translationX(targetRightIn)";
        } else {
            translationY = viewPropertyAnimator.translationY(f);
            str = "viewPropertyAnimator.translationY(targetBottomUp)";
        }
        o.LJFF(translationY, str);
        return translationY;
    }
}

package X;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.K4a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51108K4a extends WindowInsetsAnimation.Callback {
    public final /* synthetic */ AbstractSearchIntermediateFragmentNew LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51108K4a(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew) {
        super(1);
        this.LIZ = abstractSearchIntermediateFragmentNew;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation animation) {
        o.LJIIIZ(animation, "animation");
        if (AbstractSearchIntermediateFragmentNew.Kl(this.LIZ)) {
            C79043V0l.LJJIIZI(this.LIZ.LJZ);
            C80413VhB c80413VhB = this.LIZ.LJZ;
            if (c80413VhB != null) {
                c80413VhB.setAlpha(1.0f);
            }
        } else {
            C79043V0l.LJIIJ(this.LIZ.LJZ);
        }
        super.onEnd(animation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation animation) {
        o.LJIIIZ(animation, "animation");
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = this.LIZ;
        abstractSearchIntermediateFragmentNew.LJZI = AbstractSearchIntermediateFragmentNew.Jl(abstractSearchIntermediateFragmentNew);
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew2 = this.LIZ;
        C80413VhB c80413VhB = abstractSearchIntermediateFragmentNew2.LJZ;
        if (c80413VhB != null) {
            C26338AVi.LJI(c80413VhB, null, null, null, Integer.valueOf(abstractSearchIntermediateFragmentNew2.LJZI), false, 23);
        }
        super.onPrepare(animation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets p0, List<WindowInsetsAnimation> p1) {
        WindowInsetsAnimation windowInsetsAnimation;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        Iterator<WindowInsetsAnimation> it = p1.iterator();
        while (true) {
            if (it.hasNext()) {
                windowInsetsAnimation = it.next();
                if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
                    break;
                }
            } else {
                windowInsetsAnimation = null;
                break;
            }
        }
        WindowInsetsAnimation windowInsetsAnimation2 = windowInsetsAnimation;
        if (windowInsetsAnimation2 == null) {
            return p0;
        }
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = this.LIZ;
        if (!abstractSearchIntermediateFragmentNew.LLD) {
            return p0;
        }
        C80413VhB c80413VhB = abstractSearchIntermediateFragmentNew.LJZ;
        if (c80413VhB != null) {
            C26338AVi.LJI(c80413VhB, null, null, null, Integer.valueOf(abstractSearchIntermediateFragmentNew.LJZL + ((int) ((1 - windowInsetsAnimation2.getInterpolatedFraction()) * (abstractSearchIntermediateFragmentNew.LJZI - r4)))), false, 23);
        }
        if (AbstractSearchIntermediateFragmentNew.Kl(this.LIZ)) {
            C80413VhB c80413VhB2 = this.LIZ.LJZ;
            if (c80413VhB2 != null) {
                c80413VhB2.setAlpha(Math.min(1.0f, Math.max(windowInsetsAnimation2.getInterpolatedFraction() - 0.1f, 0.0f) * 5.0f));
            }
        } else {
            C80413VhB c80413VhB3 = this.LIZ.LJZ;
            if (c80413VhB3 != null) {
                c80413VhB3.setAlpha(Math.min(1.0f, Math.max((1 - windowInsetsAnimation2.getInterpolatedFraction()) - 0.1f, 0.0f) * 5.0f));
            }
        }
        return p0;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation animation, WindowInsetsAnimation.Bounds bounds) {
        o.LJIIIZ(animation, "animation");
        o.LJIIIZ(bounds, "bounds");
        XKQ xkq = this.LIZ.LL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = this.LIZ;
        abstractSearchIntermediateFragmentNew.LJZL = AbstractSearchIntermediateFragmentNew.Jl(abstractSearchIntermediateFragmentNew);
        C79043V0l.LJJIIZI(this.LIZ.LJZ);
        WindowInsetsAnimation.Bounds onStart = super.onStart(animation, bounds);
        o.LJIIIIZZ(onStart, "super.onStart(animation, bounds)");
        return onStart;
    }
}

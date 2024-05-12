package com.ss.android.ugc.feed.platform.cell.clean;

import X.AbstractC48820JEa;
import X.C221108m2;
import X.C2K0;
import X.C55096Ljo;
import X.C62822Ol8;
import X.InterfaceC55102Lju;
import X.JBR;
import X.LDF;
import X.LDG;
import X.X1D;
import Y.ALAdapterS7S0100000_9;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CellCleanComponent extends BaseCellContentComponent implements ICellCleanAbility, InterfaceC55102Lju {
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public Animator LLFF;
    public ViewGroup LLFFF;
    public ViewGroup LLFII;
    public ViewGroup LLFZ;
    public View LLI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1312751005) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final void unBind() {
    }

    public CellCleanComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(LDG.LJLIL);
        this.LLD = C221108m2.LIZIZ(new AqS159S0100000_9(this, 711));
        this.LLF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 712));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFFF = (ViewGroup) view.findViewById(R.id.niu);
        this.LLFII = (ViewGroup) view.findViewById(R.id.eq0);
        this.LLI = view.findViewById(R.id.hrs);
        this.LLFZ = (ViewGroup) view.findViewById(R.id.hqw);
    }

    public final void b4(boolean z, float f, boolean z2) {
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LLFFF;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(f);
        }
        ViewGroup viewGroup3 = this.LLFZ;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(f);
        }
        if (z2 && (viewGroup = this.LLFII) != null) {
            viewGroup.setAlpha(f);
        }
        if (!z || (view = this.LLI) == null) {
            return;
        }
        view.setAlpha(((Number) this.LLF.getValue()).floatValue() * f);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility
    public final void lV(boolean z, Animator animator, boolean z2) {
        boolean z3;
        float f;
        long j;
        TimeInterpolator linearInterpolator;
        long j2;
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LL.getValue();
        StringBuilder LJI = JBR.LJI("toggleClean request: clean ", z, ", hasCustomAnimation: ");
        int i = 0;
        if (animator != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        LJI.append(z3);
        LJI.append(" immediately: ");
        LJI.append(z2);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LJI));
        Animator animator2 = this.LLFF;
        if (animator2 != null) {
            animator2.end();
        }
        this.LLFF = null;
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        if (z2) {
            b4(true, f, true);
            if (z) {
                i = 4;
            }
            ViewGroup viewGroup = this.LLFFF;
            if (viewGroup != null) {
                viewGroup.setVisibility(i);
            }
            ViewGroup viewGroup2 = this.LLFZ;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(i);
            }
            ViewGroup viewGroup3 = this.LLFII;
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.setVisibility(i);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        if (animator != null) {
            j = animator.getDuration();
        } else {
            j = 200;
        }
        ofFloat.setDuration(j);
        if (animator == null || (linearInterpolator = animator.getInterpolator()) == null) {
            linearInterpolator = new LinearInterpolator();
        }
        ofFloat.setInterpolator(linearInterpolator);
        if (animator != null) {
            j2 = animator.getStartDelay();
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.addUpdateListener(new LDF(this));
        ofFloat.addListener(new ALAdapterS7S0100000_9(this, 6));
        ofFloat.start();
        this.LLFF = ofFloat;
    }
}

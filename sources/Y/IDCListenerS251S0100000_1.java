package Y;

import X.C018905p;
import X.C0NB;
import X.C15380j0;
import X.C29306Beo;
import X.C4YG;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C75422Tis;
import X.InterfaceC1032043g;
import X.X1D;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.tikbot.TakoChatInputAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class IDCListenerS251S0100000_1 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS251S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS251S0100000_1 iDCListenerS251S0100000_1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BaseListFragmentPanel baseListFragmentPanel;
        BottomToastVM bottomToastVM;
        if (i == i5 && i2 == i6 && i4 == i8 && i3 == i7) {
            return;
        }
        BaseListFragmentPanel baseListFragmentPanel2 = (BaseListFragmentPanel) iDCListenerS251S0100000_1.l0;
        if (!baseListFragmentPanel2.mIsViewPagerLayout) {
            baseListFragmentPanel2.mIsViewPagerLayout = true;
        }
        baseListFragmentPanel2.adaptation();
        if (i4 != i8 && (bottomToastVM = (baseListFragmentPanel = (BaseListFragmentPanel) iDCListenerS251S0100000_1.l0).bottomToastVM) != null) {
            bottomToastVM.iv0(baseListFragmentPanel.getFragment());
        }
    }

    public static final void onLayoutChange$1(IDCListenerS251S0100000_1 iDCListenerS251S0100000_1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        ViewGroup.LayoutParams layoutParams;
        C018905p c018905p;
        int LIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (i6 == i2 || i2 <= 0 || (view2 = ((C75422Tis) iDCListenerS251S0100000_1.l0).LIZLLL) == null || view2.getHeight() <= 0) {
            return;
        }
        View view3 = ((C75422Tis) iDCListenerS251S0100000_1.l0).LIZLLL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C018905p) || (c018905p = (C018905p) layoutParams) == null || c018905p.bottomToBottom != 0) {
            return;
        }
        int LIZ2 = C15380j0.LIZ(12.0f) + (i4 - i2);
        Animator animator = ((C75422Tis) iDCListenerS251S0100000_1.l0).LJIIL;
        if (animator != null) {
            animator.cancel();
        }
        if (Math.abs(i6 - i2) < 25) {
            C29306Beo.LJJJJJL(LIZ2, ((C75422Tis) iDCListenerS251S0100000_1.l0).LIZLLL);
            return;
        }
        C75422Tis c75422Tis = (C75422Tis) iDCListenerS251S0100000_1.l0;
        View view4 = c75422Tis.LIZLLL;
        if (view4 != null) {
            layoutParams2 = view4.getLayoutParams();
        }
        if ((layoutParams2 instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            LIZ = marginLayoutParams.bottomMargin;
        } else {
            LIZ = C15380j0.LIZ(12.0f);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(LIZ, LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getMoveUpAnimatorForPreviewContainer targetBottom ");
        LIZ3.append(LIZ2);
        LIZ3.append(" currentBottom ");
        LIZ3.append(LIZ);
        C0NB.LIZIZ("MultiGuestPreviewAnimationHelper", X1D.LIZIZ(LIZ3));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(view4, 36));
        c75422Tis.LJIIL = ofFloat;
        Animator animator2 = ((C75422Tis) iDCListenerS251S0100000_1.l0).LJIIL;
        if (animator2 == null) {
            return;
        }
        animator2.start();
    }

    public static final void onLayoutChange$2(IDCListenerS251S0100000_1 iDCListenerS251S0100000_1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Editable editable;
        int i9 = i8 - i6;
        int i10 = i4 - i2;
        if (i9 != i10) {
            C4YG c4yg = ((BaseInputView) iDCListenerS251S0100000_1.l0).LJLILLLLZI;
            if (c4yg != null) {
                editable = c4yg.getText();
            } else {
                editable = null;
            }
            String valueOf = String.valueOf(editable);
            Iterator<InterfaceC1032043g> it = ((BaseInputView) iDCListenerS251S0100000_1.l0).LJLLL.iterator();
            while (it.hasNext()) {
                it.next().LIZ(i9, i10, valueOf);
            }
        }
    }

    public static final void onLayoutChange$3(IDCListenerS251S0100000_1 iDCListenerS251S0100000_1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        List LJIJ;
        if (i8 - i6 != i4 - i2 && (LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ((TakoChatInputAssem) iDCListenerS251S0100000_1.l0), MessageListProtocol.class)) != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                ((MessageListProtocol) it.next()).LLLILZ();
            }
        }
    }
}

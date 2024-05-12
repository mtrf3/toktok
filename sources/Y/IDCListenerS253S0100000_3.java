package Y;

import X.C207248Bk;
import X.C221018lt;
import X.C51029K0z;
import X.C7UK;
import X.EnumC196967oC;
import X.InterfaceC194547kI;
import X.InterfaceC88472Yns;
import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.detail.arch.videos.CollisionResolver;
import com.ss.android.ugc.aweme.detail.prefab.videos.DetailVideoCell;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowAreaMonitorAssem;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCListenerS253S0100000_3 implements View.OnLayoutChangeListener {
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
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS253S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS253S0100000_3);
        CollisionResolver collisionResolver = (CollisionResolver) ((DetailVideoCell) iDCListenerS253S0100000_3.l0).LJLJL.getValue();
        if (((ArrayList) collisionResolver.LJLIL).size() < 2) {
            return;
        }
        for (int size = ((ArrayList) collisionResolver.LJLIL).size() - 1; -1 < size; size--) {
            C7UK c7uk = (C7UK) ListProtector.get(collisionResolver.LJLIL, size);
            if (c7uk.g0()) {
                for (int i9 = size - 1; -1 < i9; i9--) {
                    C7UK c7uk2 = (C7UK) ListProtector.get(collisionResolver.LJLIL, i9);
                    Rect P0 = c7uk.P0();
                    Rect P02 = c7uk2.P0();
                    if (c7uk2.g0() && P0 != null && P02 != null && P0.right >= P02.left && P0.left <= P02.right && P0.bottom >= P02.top && P0.top <= P02.bottom) {
                        c7uk2.LLLJL();
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$1(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((KeyboardDialogFragment) iDCListenerS253S0100000_3.l0).Nl();
    }

    public static final void onLayoutChange$2(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS253S0100000_3);
        AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(view, (TextView) iDCListenerS253S0100000_3.l0, 24);
        if (((TextView) iDCListenerS253S0100000_3.l0).getWidth() <= 0) {
            ((TextView) iDCListenerS253S0100000_3.l0).post(new ARunnableS39S0100000_3((Object) aqS150S0200000_3, 43));
        } else {
            aqS150S0200000_3.invoke();
        }
    }

    public static final void onLayoutChange$3(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS253S0100000_3);
        C221018lt.LIZ("AddYoursEntranceButtonAssem", "safelyStartAnimator, doOnNextLayout");
        ((AddYoursEntranceButtonAssem) iDCListenerS253S0100000_3.l0).q4();
        AnimatorSet animatorSet = ((AddYoursEntranceButtonAssem) iDCListenerS253S0100000_3.l0).LLIIIZ;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public static final void onLayoutChange$4(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL((NowAreaMonitorAssem) iDCListenerS253S0100000_3.l0)).LLLIL()) {
            return;
        }
        NowAreaMonitorAssem nowAreaMonitorAssem = (NowAreaMonitorAssem) iDCListenerS253S0100000_3.l0;
        EnumC196967oC enumC196967oC = EnumC196967oC.LAYOUT_CHANGE;
        nowAreaMonitorAssem.a4(enumC196967oC, false);
        ((NowAreaMonitorAssem) iDCListenerS253S0100000_3.l0).g4(enumC196967oC);
    }

    public static final void onLayoutChange$5(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        if (((Boolean) ((InterfaceC88472Yns) iDCListenerS253S0100000_3.l0).invoke(view)).booleanValue()) {
            view.removeOnLayoutChangeListener(iDCListenerS253S0100000_3);
        }
    }

    public static final void onLayoutChange$6(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C207248Bk) iDCListenerS253S0100000_3.l0).LJI();
    }

    public static final void onLayoutChange$7(IDCListenerS253S0100000_3 iDCListenerS253S0100000_3, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        if (((Boolean) ((InterfaceC88472Yns) iDCListenerS253S0100000_3.l0).invoke(view)).booleanValue()) {
            view.removeOnLayoutChangeListener(iDCListenerS253S0100000_3);
        }
    }
}

package X;

import Y.IDUListenerS263S0100000;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.2E7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2E7 extends C515620q {
    public final C1O4 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;

    public final ValueAnimator LJFF() {
        return (ValueAnimator) this.LJLJJLL.getValue();
    }

    public C2E7(C1O4 c1o4) {
        super(C12960f6.LJI, c1o4);
        this.LJLJJL = c1o4;
        this.LJLJJLL = C221108m2.LIZIZ(C515720r.LJLIL);
    }

    @Override // X.C515620q
    public final boolean LIZJ(C006900z dialogStatus) {
        o.LJIIIZ(dialogStatus, "dialogStatus");
        return LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canStatusWidgetsAlphaXfer(dialogStatus.LIZ.LIZLLL);
    }

    @Override // X.C515620q
    /* renamed from: LJ */
    public final void onChanged(C006900z dialogStatus) {
        int i;
        int i2;
        View view;
        o.LJIIIZ(dialogStatus, "dialogStatus");
        super.onChanged(dialogStatus);
        LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = LiveGiftTrayPublicScreenTranslateSetting.INSTANCE;
        if (liveGiftTrayPublicScreenTranslateSetting.giftTrayTranslateWithPublicScreen(dialogStatus.LIZ.LIZLLL)) {
            C29602Bja c29602Bja = dialogStatus.LIZ;
            if (c29602Bja.LIZ) {
                this.LJLJL = c29602Bja.LIZIZ;
            } else {
                this.LJLJL = 0;
                C29602Bja c29602Bja2 = dialogStatus.LIZIZ;
                if (c29602Bja2 != null && liveGiftTrayPublicScreenTranslateSetting.giftTrayTranslateWithPublicScreen(c29602Bja2.LIZLLL)) {
                    this.LJLJL = c29602Bja2.LIZIZ;
                }
            }
            int i3 = this.LJLJL;
            if (i3 > 0) {
                int height = this.LJLJJL.getContainer().getHeight();
                ConstraintProperty constraintPropertyById = this.LJLJJL.getConstraintPropertyById(R.id.eqg);
                if (constraintPropertyById != null && (view = constraintPropertyById.getView()) != null) {
                    i2 = view.getBottom();
                } else {
                    i2 = 0;
                }
                i = i3 - (height - i2);
            } else {
                i = 0;
            }
            float f = -i;
            LJFF().cancel();
            LJFF().removeAllUpdateListeners();
            ConstraintProperty LIZIZ = LIZIZ();
            if (LIZIZ == null || LIZIZ.translationY() == f) {
                return;
            }
            LJFF().setFloatValues(LIZIZ.translationY(), f);
            LJFF().addUpdateListener(new IDUListenerS263S0100000(LIZIZ, 27));
            LJFF().start();
        }
    }

    @Override // X.C515620q, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C006900z c006900z) {
        onChanged(c006900z);
    }
}

package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OH extends C6O6 {
    public final ViewGroup LIZIZ;
    public final C6OA LIZJ;
    public final C6OI LIZLLL;
    public final C62822Ol8 LJ;

    public final void LIZIZ() {
        int i;
        if (u.LJIJ(this.LIZJ.LIZJ.LJ)) {
            i = 22;
        } else {
            i = 28;
        }
        OSZ<Integer, Integer> osz = this.LIZJ.LJFF.LJIIIZ;
        int intValue = osz.getFirst().intValue();
        int intValue2 = osz.getSecond().intValue();
        C6OI c6oi = this.LIZLLL;
        if (c6oi != null) {
            Integer valueOf = Integer.valueOf(intValue);
            Integer valueOf2 = Integer.valueOf(intValue2);
            C6OK textSizeHelper = c6oi.getTextSizeHelper();
            textSizeHelper.getClass();
            if (valueOf != null) {
                textSizeHelper.LIZLLL = valueOf.intValue() / i;
            }
            if (valueOf2 != null) {
                textSizeHelper.LJ = valueOf2.intValue() / i;
            }
        }
        C159366Ng c159366Ng = (C159366Ng) this.LJ.getValue();
        if (c159366Ng != null) {
            c159366Ng.setDefaultTextSize(i);
        }
        C159366Ng c159366Ng2 = (C159366Ng) this.LJ.getValue();
        if (c159366Ng2 != null) {
            c159366Ng2.setMinTextSize(intValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OH(ViewGroup viewGroup, C6OA abilityContainer) {
        super(abilityContainer);
        o.LJIIIZ(abilityContainer, "abilityContainer");
        this.LIZIZ = viewGroup;
        this.LIZJ = abilityContainer;
        C6OI c6oi = (C6OI) viewGroup.findViewById(R.id.l56);
        this.LIZLLL = c6oi;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 725));
        if (c6oi != null) {
            C1NS<TextStickerModel> stateContainer = abilityContainer.LIZJ;
            o.LJIIIZ(stateContainer, "stateContainer");
            c6oi.LJLJJLL = stateContainer;
            LIZIZ();
            c6oi.setEnableTextAnimOpt(abilityContainer.LJFF.LJIIZILJ);
        }
        if (C90193gN.LIZ()) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).gravity = 8388629;
        }
        if (c6oi != null) {
            c6oi.setOnTextSizeChangedListener(new C6BH() { // from class: X.6OV
                @Override // X.C6BH
                public final void LIZ() {
                    C159366Ng c159366Ng = (C159366Ng) C6OH.this.LJ.getValue();
                    if (c159366Ng != null) {
                        c159366Ng.LJLLLLLL = false;
                    }
                    C6OH.this.getClass();
                }
            });
            c6oi.setOnAdjustTextRollbarListener(new AqS152S0100000_2(this, 724));
        }
    }
}

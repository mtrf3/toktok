package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78835Uwp implements LHW {
    public final /* synthetic */ OptionCategoryPanelFragment LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C78835Uwp(OptionCategoryPanelFragment optionCategoryPanelFragment) {
        this.LJLIL = optionCategoryPanelFragment;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
        Drawable drawable = tab.LIZIZ;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(127);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    @Override // X.InterfaceC54357LUz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C78856UxA r8) {
        /*
            r7 = this;
            java.lang.String r0 = "tab"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment r6 = r7.LJLIL
            java.lang.CharSequence r0 = r8.LIZJ
            java.lang.String r5 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJLLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L75
            boolean r0 = X.C78886Uxe.LJJJ(r0)
            if (r0 != r2) goto L75
            java.lang.String r1 = "mix_other_effects"
        L1b:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJLLL
            if (r0 == 0) goto L26
            boolean r0 = X.C78886Uxe.LJJJ(r0)
            if (r0 != r2) goto L26
            r3 = 1
        L26:
            r4 = 0
            if (r3 == 0) goto L70
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJLLL
            if (r0 == 0) goto L6e
        L2d:
            java.lang.String r3 = r0.getName()
        L31:
            X.5oB r2 = new X.5oB
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.LJI(r0, r1)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click"
            r2.LJI(r1, r0)
            java.lang.String r0 = "entry_effect_identifier"
            r2.LJI(r0, r3)
            java.lang.String r0 = "effect_category"
            r2.LJI(r0, r5)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "eventMap"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "click_stackable_effect_category"
            X.C78880UxY.LJJLIIIJL(r0, r1)
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment r0 = r7.LJLIL
            X.0CM r1 = r0.LJLJI
            if (r1 == 0) goto L78
            int r0 = r8.LJ
            r1.setCurrentItem(r0)
            android.graphics.drawable.Drawable r1 = r8.LIZIZ
            if (r1 != 0) goto L68
        L67:
            return
        L68:
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
            goto L67
        L6e:
            r3 = r4
            goto L31
        L70:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJLJ
            if (r0 == 0) goto L7e
            goto L2d
        L75:
            java.lang.String r1 = "prop_click"
            goto L1b
        L78:
            java.lang.String r0 = "viewPager"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        L7e:
            java.lang.String r0 = "panelEffect"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78835Uwp.LIZIZ(X.UxA):void");
    }
}

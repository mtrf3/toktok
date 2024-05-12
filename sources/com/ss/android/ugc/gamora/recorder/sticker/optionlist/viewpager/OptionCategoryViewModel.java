package com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager;

import X.AbstractC78795UwB;
import X.ActivityC45651qj;
import X.F9J;
import X.InterfaceC78821Uwb;
import X.InterfaceC84497XEf;
import android.app.Activity;
import android.content.SharedPreferences;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class OptionCategoryViewModel extends ViewModel {
    public final Activity LJLIL;
    public final InterfaceC84497XEf LJLILLLLZI;
    public final InterfaceC78821Uwb LJLJI;
    public final Effect LJLJJI;
    public final Effect LJLJJL;
    public final SharedPreferences LJLJJLL;
    public boolean LJLJL;
    public final MediatorLiveData<AbstractC78795UwB> LJLJLJ;
    public final MediatorLiveData LJLJLLL;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(X.C78820Uwa r7) {
        /*
            r6 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJJL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L7b
            boolean r0 = X.C78886Uxe.LJJJ(r0)
            if (r0 != r2) goto L7b
            java.lang.String r1 = "mix_other_effects"
        Le:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJJL
            if (r0 == 0) goto L19
            boolean r0 = X.C78886Uxe.LJJJ(r0)
            if (r0 != r2) goto L19
            r3 = 1
        L19:
            r4 = 0
            if (r3 == 0) goto L78
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJJL
            if (r0 == 0) goto L76
        L20:
            java.lang.String r5 = r0.getName()
        L24:
            X.5oB r3 = new X.5oB
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r3.LJI(r0, r1)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click"
            r3.LJI(r1, r0)
            java.lang.String r0 = "entry_effect_identifier"
            r3.LJI(r0, r5)
            X.Uw5 r0 = r7.LJ
            if (r0 == 0) goto L74
            java.lang.String r1 = r0.LIZ
        L40:
            java.lang.String r0 = "effect_category"
            r3.LJI(r0, r1)
            java.lang.String r1 = r7.LIZ
            java.lang.String r0 = "effect_subcategory"
            r3.LJI(r0, r1)
            X.Uw5 r0 = r7.LJ
            if (r0 == 0) goto L58
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LJFF
            if (r0 == 0) goto L58
            java.lang.String r4 = r0.getEffectId()
        L58:
            java.lang.String r0 = "stackable_item_id"
            r3.LJI(r0, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "eventMap"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "select_other_stackable_effects"
            X.C78880UxY.LJJLIIIJL(r0, r1)
            X.Uwb r1 = r6.LJLJI
            X.UwU r0 = new X.UwU
            r0.<init>(r6, r7)
            r1.LIZLLL(r7, r0, r2)
            return
        L74:
            r1 = r4
            goto L40
        L76:
            r5 = r4
            goto L24
        L78:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LJLJJI
            goto L20
        L7b:
            java.lang.String r1 = "prop_click"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel.gv0(X.Uwa):void");
    }

    public OptionCategoryViewModel(ActivityC45651qj activityC45651qj, InterfaceC84497XEf effectPlatform, InterfaceC78821Uwb manager, Effect panelEffect, Effect effect) {
        SharedPreferences LIZIZ = F9J.LIZIZ(activityC45651qj, 0, "OptionCategoryPanelViewModel");
        o.LJIIIIZZ(LIZIZ, "activity.getSharedPrefer…AG, Context.MODE_PRIVATE)");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(manager, "manager");
        o.LJIIIZ(panelEffect, "panelEffect");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = effectPlatform;
        this.LJLJI = manager;
        this.LJLJJI = panelEffect;
        this.LJLJJL = effect;
        this.LJLJJLL = LIZIZ;
        this.LJLJL = LIZIZ.getBoolean("firstTimeSelectShown", false);
        MediatorLiveData<AbstractC78795UwB> mediatorLiveData = new MediatorLiveData<>();
        this.LJLJLJ = mediatorLiveData;
        this.LJLJLLL = mediatorLiveData;
    }
}

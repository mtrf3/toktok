package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C47261Igj;
import X.C61878OQg;
import X.C74310TEk;
import X.C74322TEw;
import X.C74413TIj;
import X.C78866UxK;
import X.EnumC74323TEx;
import X.T4J;
import X.TE8;
import X.TEN;
import Y.AObserverS80S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class StickerListViewModel extends BaseStickerListViewModel {
    public final AObserverS80S0100000_12 LJLLJ;
    public final LifecycleOwner LJLLL;
    public final boolean LJLLLL;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void do0(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
        if (ujb.o.LJJJJJL(categoryKey)) {
            return;
        }
        C74310TEk.LIZ(this.LJLJLLL.LJJJJLL().LIZ(), categoryKey, true, 12).observe(this.LJLLL, this.LJLLJ);
    }

    public final void kv0(List<? extends Effect> effectList) {
        o.LJIIIZ(effectList, "effectList");
        ((T4J) this.LJLJLJ.getValue()).LIZ(0, effectList);
        this.LJLILLLLZI.setValue(effectList);
    }

    public void lv0(C74413TIj<CategoryEffectModel> wrapper) {
        List<Effect> list;
        o.LJIIIZ(wrapper, "wrapper");
        EnumC74323TEx enumC74323TEx = wrapper.LIZIZ;
        if (enumC74323TEx == null) {
            return;
        }
        int i = C74322TEw.LIZ[enumC74323TEx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                CategoryEffectModel categoryEffectModel = wrapper.LIZ;
                ArrayList arrayList = null;
                if (categoryEffectModel != null) {
                    list = categoryEffectModel.getEffects();
                } else {
                    list = null;
                }
                if (this.LJLLLL) {
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Effect effect : list) {
                            if (!effect.isBusiness()) {
                                arrayList.add(effect);
                            }
                        }
                    }
                    list = arrayList;
                }
                if (categoryEffectModel == null || list == null || list.isEmpty()) {
                    this.LJLJJL.setValue(TEN.EMPTY);
                    return;
                } else {
                    this.LJLJJL.setValue(TEN.NONE);
                    kv0(list);
                    return;
                }
            }
            this.LJLJJL.setValue(TEN.ERROR);
            return;
        }
        this.LJLJJL.setValue(TEN.LOADING);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public List gv0(TE8 request, int i) {
        List LJJIJIIJI;
        Effect effect;
        o.LJIIIZ(request, "request");
        if (i == 1) {
            List<Effect> value = this.LJLILLLLZI.getValue();
            if (value != null) {
                effect = C78866UxK.LJJIIZI(this.LJLJLLL, value, request.LJLILLLLZI);
            } else {
                effect = null;
            }
            return C47261Igj.LJJIJ(effect);
        }
        List<Effect> value2 = this.LJLILLLLZI.getValue();
        if (value2 != null && (LJJIJIIJI = C78866UxK.LJJIJIIJI(this.LJLJLLL, value2, request.LJLILLLLZI, i)) != null) {
            return LJJIJIIJI;
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StickerListViewModel(androidx.lifecycle.LifecycleOwner r3, X.TEZ r4, X.InterfaceC46204IBk r5, X.TEF r6, X.InterfaceC73367Sqp r7, boolean r8, int r9) {
        /*
            r2 = this;
            r0 = r9 & 16
            if (r0 == 0) goto L12
            X.Sqo r7 = new X.Sqo
            X.THp r0 = r4.LJJJJLL()
            X.SrB r1 = r0.LJ()
            r0 = 0
            r7.<init>(r1, r0)
        L12:
            r0 = r9 & 32
            if (r0 == 0) goto L17
            r8 = 0
        L17:
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "stickerDataManager"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "clickController"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "tagHandler"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "stickerStatesStore"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r2.<init>(r3, r4, r5, r6, r7)
            r2.LJLLL = r3
            r2.LJLLLL = r8
            Y.AObserverS80S0100000_12 r1 = new Y.AObserverS80S0100000_12
            r0 = 141(0x8d, float:1.98E-43)
            r1.<init>(r2, r0)
            r2.LJLLJ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel.<init>(androidx.lifecycle.LifecycleOwner, X.TEZ, X.IBk, X.TEF, X.Sqp, boolean, int):void");
    }
}

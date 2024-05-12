package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.C61878OQg;
import X.C74319TEt;
import X.C74413TIj;
import X.EnumC74323TEx;
import X.InterfaceC46204IBk;
import X.InterfaceC73367Sqp;
import X.TEF;
import X.TEN;
import X.TEZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class FixedStickerListViewModel extends StickerListViewModel {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void mv0(C74413TIj<List<Effect>> c74413TIj) {
        EnumC74323TEx enumC74323TEx = c74413TIj.LIZIZ;
        if (enumC74323TEx == null) {
            return;
        }
        int i = C74319TEt.LIZ[enumC74323TEx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                List<Effect> list = c74413TIj.LIZ;
                if (list == null || list.isEmpty()) {
                    kv0(C61878OQg.INSTANCE);
                    this.LJLJJL.setValue(TEN.EMPTY);
                    return;
                } else {
                    kv0(list);
                    this.LJLJJL.setValue(TEN.NONE);
                    return;
                }
            }
            kv0(C61878OQg.INSTANCE);
            this.LJLJJL.setValue(TEN.ERROR);
            return;
        }
        kv0(C61878OQg.INSTANCE);
        this.LJLJJL.setValue(TEN.LOADING);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedStickerListViewModel(EffectTemplateCategoryFragment lifecycleOwner, TEZ tez, InterfaceC46204IBk clickController, TEF tagHandler, InterfaceC73367Sqp interfaceC73367Sqp) {
        super(lifecycleOwner, tez, clickController, tagHandler, interfaceC73367Sqp, false, 32);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
    }
}

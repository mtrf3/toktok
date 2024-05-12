package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.C74310TEk;
import X.C78555UsJ;
import X.InterfaceC46204IBk;
import X.InterfaceC67352kd;
import X.InterfaceC73367Sqp;
import X.InterfaceC74309TEj;
import X.OSZ;
import X.TEF;
import X.TEZ;
import X.XKS;
import Y.AObserverS75S0200000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateEffectsViewModel extends FixedStickerListViewModel {
    public final InterfaceC74309TEj LJLLLLLL;

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.FixedStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Object nv0(InterfaceC67352kd<? super OSZ<? extends Throwable, ? extends List<? extends Effect>>> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        LiveData LIZ = C74310TEk.LIZ(this.LJLLLLLL, "create", true, 12);
        LIZ.observe(this.LJLLL, new AObserverS75S0200000_12(xks, LIZ, 14));
        return xks.LJIIJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateEffectsViewModel(EffectTemplateCategoryFragment lifecycleOwner, TEZ tez, InterfaceC46204IBk clickController, TEF tagHandler, InterfaceC73367Sqp interfaceC73367Sqp) {
        super(lifecycleOwner, tez, clickController, tagHandler, interfaceC73367Sqp);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
        this.LJLLLLLL = tez.LJJJJLL().LIZ();
    }
}

package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import X.C135285Sq;
import X.C149905uU;
import X.C173546rW;
import X.C173556rX;
import X.C269113v;
import X.C29901Fi;
import X.C5H3;
import X.C82622Wbi;
import X.InterfaceC135635Tz;
import X.InterfaceC143655kP;
import X.InterfaceC146775pR;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditAudioEffectViewModel extends LifecycleAwareViewModel<FTCEditAudioEffectState> implements InterfaceC146775pR, InterfaceC135635Tz {
    public final C82622Wbi LJLJL;
    public final C5H3 LJLJLJ;
    public final LiveEvent<CategoryPageModel> LJLJLLL;

    private final InterfaceC143655kP Lv0() {
        return (InterfaceC143655kP) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditAudioEffectState kv0() {
        return new FTCEditAudioEffectState(null, null, 3, null);
    }

    @Override // X.InterfaceC146775pR
    public void show() {
        setStateImmediate(C173556rX.LJLIL);
    }

    @Override // X.InterfaceC146775pR
    public LiveEvent<CategoryPageModel> cA() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJL;
    }

    public FTCEditAudioEffectViewModel(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJL = diContainer;
        this.LJLJLJ = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJLLL = new C29901Fi();
    }

    public final void Kv0(CategoryPageModel categoryPageModel) {
        LiveEvent<CategoryPageModel> cA = cA();
        o.LJII(cA, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel?>");
        ((C29901Fi) cA).LJII(categoryPageModel);
    }

    @Override // X.InterfaceC146775pR
    public void wi0(VideoPublishEditModel videoPublishEditModel) {
        Lv0().MK(C135285Sq.LIZIZ());
        C149905uU.LIZLLL(videoPublishEditModel);
        setStateImmediate(C173546rW.LJLIL);
    }
}

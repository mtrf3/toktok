package com.bytedance.android.live.effect.voiceeffect;

import X.C1O0;
import X.C2DU;
import X.C42181l8;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class VoiceEffectViewModel extends BaseEffectViewModel<LiveEffect> {
    public final C1O0 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEffectViewModel(C1O0 dataRepository, C42181l8 resourceRepository) {
        super(dataRepository, resourceRepository);
        o.LJIIIZ(dataRepository, "dataRepository");
        o.LJIIIZ(resourceRepository, "resourceRepository");
        this.LJLJJI = dataRepository;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2DU(this, null), 3);
    }
}

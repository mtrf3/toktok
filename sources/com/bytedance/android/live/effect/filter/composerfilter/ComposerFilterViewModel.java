package com.bytedance.android.live.effect.filter.composerfilter;

import X.C1VF;
import X.C2FD;
import X.C43361n2;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ComposerFilterViewModel extends BaseEffectViewModel<LiveEffect> {
    public final C1VF LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerFilterViewModel(C1VF dataRepository, C43361n2 resourceRepository) {
        super(dataRepository, resourceRepository);
        o.LJIIIZ(dataRepository, "dataRepository");
        o.LJIIIZ(resourceRepository, "resourceRepository");
        this.LJLJJI = dataRepository;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2FD(this, null), 3);
    }
}

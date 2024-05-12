package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchSugViewModel;

/* renamed from: X.afc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94352afc<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ VoiceSearchSugViewModel LIZ;

    public C94352afc(VoiceSearchSugViewModel voiceSearchSugViewModel) {
        this.LIZ = voiceSearchSugViewModel;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        if (c10k.LJIILIIL()) {
            this.LIZ.LJLIL.setValue(new C50764Jw8<>(c10k.LJIIJJI()));
        } else if (c10k.LJIILJJIL()) {
            NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData = this.LIZ.LJLIL;
            c10k.LJIIJ();
            nextLiveData.setValue(new C50764Jw8<>());
        } else {
            NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData2 = this.LIZ.LJLIL;
            c10k.LJIIJ();
            nextLiveData2.setValue(new C50764Jw8<>());
        }
        return C76800UCe.LIZ;
    }
}

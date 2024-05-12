package com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel;

import X.InterfaceC45930I0w;
import X.InterfaceC68472mR;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KidsDraftFeedViewModel extends ViewModel {
    public final InterfaceC68472mR LJLIL;
    public final MutableLiveData<InterfaceC45930I0w> LJLILLLLZI;
    public final MutableLiveData<List<VideoPublishEditModel>> LJLJI;

    public KidsDraftFeedViewModel(InterfaceC68472mR profileRepository) {
        o.LJIIIZ(profileRepository, "profileRepository");
        this.LJLIL = profileRepository;
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new MutableLiveData<>();
    }
}

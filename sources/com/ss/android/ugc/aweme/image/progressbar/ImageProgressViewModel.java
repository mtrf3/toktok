package com.ss.android.ugc.aweme.image.progressbar;

import X.C6XL;
import X.C81656W2y;
import X.C81657W2z;
import X.W30;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.jvm.internal.AqS18S0010000_14;

/* loaded from: classes15.dex */
public final class ImageProgressViewModel extends LifecycleAwareViewModel<ImagesProgressState> implements C6XL {
    public final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public ImagesProgressState kv0() {
        return new ImagesProgressState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.C6XL
    public void o3() {
        this.LJLJL.setValue(Boolean.TRUE);
    }

    @Override // X.C6XL
    public void resume() {
        setState(W30.LJLIL);
    }

    @Override // X.C6XL
    public void show() {
        setState(C81657W2z.LJLIL);
    }

    @Override // X.C6XL
    public LiveData<Boolean> jR() {
        return this.LJLJL;
    }

    @Override // X.C6XL
    public void jp(boolean z) {
        setState(new AqS18S0010000_14(z, 2));
    }

    @Override // X.C6XL
    public void ka(boolean z) {
        setStateImmediate(new AqS18S0010000_14(z, 1));
    }

    @Override // X.C6XL
    public void oE(int i, float f) {
        setState(new C81656W2y(i, f));
    }
}

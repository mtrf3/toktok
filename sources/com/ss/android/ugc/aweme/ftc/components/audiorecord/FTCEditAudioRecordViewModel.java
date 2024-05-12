package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import X.C158666Ko;
import X.C158676Kp;
import X.C158686Kq;
import X.C29901Fi;
import X.InterfaceC146715pL;
import X.OSZ;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;

/* loaded from: classes3.dex */
public final class FTCEditAudioRecordViewModel extends LifecycleAwareViewModel<FTCEditAudioRecordState> implements InterfaceC146715pL {
    public final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>();
    public final C29901Fi<OSZ<Float, Float>> LJLJLJ;
    public final LiveEvent<OSZ<Float, Float>> LJLJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Kv0, reason: merged with bridge method [inline-methods] */
    public FTCEditAudioRecordState kv0() {
        return new FTCEditAudioRecordState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC146715pL
    public void LJJJJLI() {
        setState(C158686Kq.LJLIL);
    }

    @Override // X.InterfaceC146715pL
    public void hide() {
        setStateImmediate(C158666Ko.LJLIL);
    }

    @Override // X.InterfaceC146715pL
    public void show() {
        setStateImmediate(C158676Kp.LJLIL);
    }

    public FTCEditAudioRecordViewModel() {
        C29901Fi<OSZ<Float, Float>> c29901Fi = new C29901Fi<>();
        this.LJLJLJ = c29901Fi;
        this.LJLJLLL = c29901Fi;
    }

    @Override // X.InterfaceC146715pL
    public LiveData<Boolean> LLIIIZ() {
        return this.LJLJL;
    }

    public final void mJ(boolean z) {
        this.LJLJL.setValue(Boolean.valueOf(z));
    }

    public final void Jv0(float f, float f2) {
        this.LJLJLJ.LJII(new OSZ<>(Float.valueOf(f), Float.valueOf(f2)));
    }
}

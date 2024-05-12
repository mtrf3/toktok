package com.ss.android.ugc.aweme.share.viewmodel;

import X.InterfaceC54249LQv;
import X.InterfaceC59622Vq;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes10.dex */
public final class FeedPanelStateViewModel extends ViewModel implements InterfaceC54249LQv {
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>();
    public final DialogStateLiveData LJLILLLLZI = new DialogStateLiveData();
    public final DialogStateLiveData LJLJI = new DialogStateLiveData();
    public final DialogStateLiveData LJLJJI = new DialogStateLiveData();
    public final DialogStateLiveData LJLJJL = new DialogStateLiveData();
    public final DialogStateLiveData LJLJJLL = new DialogStateLiveData();
    public final DialogStateLiveData LJLJL = new DialogStateLiveData();
    public final DialogStateLiveData LJLJLJ = new DialogStateLiveData();
    public final DialogStateLiveData LJLJLLL = new DialogStateLiveData();
    public final DialogStateLiveData LJLL = new DialogStateLiveData();
    public final DialogStateLiveData LJLLI = new DialogStateLiveData();
    public final DialogStateLiveData LJLLILLLL = new DialogStateLiveData();
    public final DialogStateLiveData LJLLJ = new DialogStateLiveData();
    public final DialogStateLiveData LJLLL = new DialogStateLiveData();
    public final DialogStateLiveData LJLLLL;
    public final DialogStateLiveData LJLLLLLL;
    public final DialogStateLiveData LJLZ;
    public final DialogStateLiveData LJZ;
    public final DialogStateLiveData LJZI;
    public final DialogStateLiveData LJZL;

    public FeedPanelStateViewModel() {
        new DialogStateLiveData();
        this.LJLLLL = new DialogStateLiveData();
        this.LJLLLLLL = new DialogStateLiveData();
        this.LJLZ = new DialogStateLiveData();
        this.LJZ = new DialogStateLiveData();
        this.LJZI = new DialogStateLiveData();
        this.LJZL = new DialogStateLiveData();
    }

    @Override // X.InterfaceC54249LQv
    public final /* bridge */ /* synthetic */ MutableLiveData sR() {
        return this.LJLIL;
    }

    /* loaded from: classes9.dex */
    public final class DialogStateLiveData extends MutableLiveData<Boolean> {
        public InterfaceC59622Vq stateRequestHandler;

        public final InterfaceC59622Vq getStateRequestHandler() {
            return this.stateRequestHandler;
        }

        public DialogStateLiveData() {
        }

        public void postValue(boolean z) {
            super.postValue((DialogStateLiveData) Boolean.valueOf(z));
            FeedPanelStateViewModel.this.LJLIL.postValue(Boolean.valueOf(z));
        }

        public final void setStateRequestHandler(InterfaceC59622Vq interfaceC59622Vq) {
            this.stateRequestHandler = interfaceC59622Vq;
        }

        public void setValue(boolean z) {
            super.setValue((DialogStateLiveData) Boolean.valueOf(z));
            FeedPanelStateViewModel.this.LJLIL.setValue(Boolean.valueOf(z));
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public /* bridge */ /* synthetic */ void postValue(Object obj) {
            postValue(((Boolean) obj).booleanValue());
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public /* bridge */ /* synthetic */ void setValue(Object obj) {
            setValue(((Boolean) obj).booleanValue());
        }
    }
}

package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel;

import X.AbstractC90763hI;
import X.C76800UCe;
import X.InterfaceC91483iS;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class BaseQuickChatRoomViewModel extends ViewModel {
    public final AbstractC90763hI LJLIL;
    public final MutableLiveData<Boolean> LJLILLLLZI;
    public final MutableLiveData LJLJI;
    public final MutableLiveData<C76800UCe> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final MutableLiveData<C76800UCe> LJLJJLL;
    public final MutableLiveData LJLJL;
    public final MutableLiveData<InterfaceC91483iS> LJLJLJ;
    public final MutableLiveData LJLJLLL;

    public abstract LiveData<UrlModel> gv0();

    public abstract LiveData<String> hv0();

    public abstract void iv0();

    public abstract void jv0();

    public abstract void lv0(int i);

    public final void kv0() {
        if (o.LJ(this.LJLILLLLZI.getValue(), Boolean.TRUE)) {
            this.LJLJJLL.postValue(C76800UCe.LIZ);
        } else {
            this.LJLJJI.postValue(C76800UCe.LIZ);
        }
    }

    public BaseQuickChatRoomViewModel(AbstractC90763hI conversationModel) {
        o.LJIIIZ(conversationModel, "conversationModel");
        this.LJLIL = conversationModel;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData3;
        this.LJLJL = mutableLiveData3;
        MutableLiveData<InterfaceC91483iS> mutableLiveData4 = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData4;
        this.LJLJLLL = mutableLiveData4;
        mutableLiveData.setValue(Boolean.FALSE);
    }
}

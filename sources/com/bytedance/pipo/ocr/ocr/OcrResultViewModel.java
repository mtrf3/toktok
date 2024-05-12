package com.bytedance.pipo.ocr.ocr;

import X.Y69;
import Y.AObserverS83S0100000_15;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class OcrResultViewModel extends ViewModel {
    public final MutableLiveData<String> LJLIL;
    public final MutableLiveData<String> LJLILLLLZI;
    public final MutableLiveData<String> LJLJI;
    public final MediatorLiveData<Y69> LJLJJI;
    public final MediatorLiveData<Y69> LJLJJL;
    public final MediatorLiveData<Y69> LJLJJLL;
    public final MediatorLiveData<Boolean> LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;

    public OcrResultViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData3;
        MediatorLiveData<Y69> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.setValue(new Y69(0));
        this.LJLJJI = mediatorLiveData;
        MediatorLiveData<Y69> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.setValue(new Y69(0));
        this.LJLJJL = mediatorLiveData2;
        MediatorLiveData<Y69> mediatorLiveData3 = new MediatorLiveData<>();
        mediatorLiveData3.setValue(new Y69(0));
        this.LJLJJLL = mediatorLiveData3;
        MediatorLiveData<Boolean> mediatorLiveData4 = new MediatorLiveData<>();
        this.LJLJL = mediatorLiveData4;
        mediatorLiveData.addSource(mutableLiveData, new AObserverS83S0100000_15(this, 4));
        mediatorLiveData2.addSource(mutableLiveData2, new AObserverS83S0100000_15(this, 5));
        mediatorLiveData3.addSource(mutableLiveData3, new AObserverS83S0100000_15(this, 6));
        mediatorLiveData4.addSource(mediatorLiveData, new AObserverS83S0100000_15(this, 7));
        mediatorLiveData4.addSource(mediatorLiveData2, new AObserverS83S0100000_15(this, 8));
        mediatorLiveData4.addSource(mediatorLiveData3, new AObserverS83S0100000_15(this, 9));
    }

    public static String gv0(String str, String str2) {
        if (str == null) {
            return "-1";
        }
        if (o.LJ(str, str2)) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }
}

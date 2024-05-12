package com.bytedance.android.livesdk.qa;

import X.AbstractC19190p9;
import X.BVI;
import X.C06900Ow;
import X.C19170p7;
import X.C19180p8;
import X.C28882BVe;
import X.C29306Beo;
import X.C73893SzJ;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SuggestedQuestionViewModel extends PagingViewModel<QuestionEx> {
    public LiveData<AbstractC19190p9<QuestionEx>> LJZI;
    public C28882BVe LJZL;
    public final C19180p8 LLD;
    public final C73893SzJ<Object> LJLZ = new C73893SzJ<>();
    public final Object LJZ = new Object();
    public final BVI LL = new BVI(this);

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    public final void retry() {
        this.LJLZ.onNext(this.LJZ);
    }

    public SuggestedQuestionViewModel() {
        C19170p7 c19170p7 = new C19170p7();
        c19170p7.LIZIZ = 2;
        c19170p7.LIZ = 50;
        this.LLD = c19170p7.LIZ();
    }

    public final void iv0(boolean z, DataChannel dataChannel, boolean z2) {
        o.LJIIIZ(dataChannel, "dataChannel");
        MutableLiveData<Boolean> mutableLiveData = this.LJLJL;
        o.LJIIIIZZ(mutableLiveData, "hasMore()");
        MutableLiveData<C06900Ow> mutableLiveData2 = this.LJLJJL;
        o.LJIIIIZZ(mutableLiveData2, "refreshStat()");
        MutableLiveData<Boolean> mutableLiveData3 = this.LJLJJLL;
        o.LJIIIIZZ(mutableLiveData3, "this.isDataEmpty");
        MutableLiveData<C06900Ow> mutableLiveData4 = this.LJLJJI;
        o.LJIIIIZZ(mutableLiveData4, "networkStat()");
        C28882BVe c28882BVe = new C28882BVe(dataChannel, mutableLiveData, mutableLiveData2, mutableLiveData3, mutableLiveData4, this.LJLZ, z2);
        c28882BVe.LJIIJ = C29306Beo.LJIIJ(dataChannel);
        c28882BVe.LJIIJJI = z;
        this.LJZL = c28882BVe;
    }
}

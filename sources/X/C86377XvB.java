package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedCardWidgetV1;

/* renamed from: X.XvB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86377XvB implements InterfaceC71474S3i {
    public final /* synthetic */ EcLiveFeedCardWidgetV1 LIZ;

    @Override // X.InterfaceC71474S3i
    public final void LIZ() {
        MutableLiveData<Integer> mutableLiveData;
        String LIZIZ;
        FeedLiveViewHolderVM LLF;
        MutableLiveData<String> mutableLiveData2;
        InterfaceC86379XvD interfaceC86379XvD = this.LIZ.LJLJI;
        if (interfaceC86379XvD != null && (LIZIZ = interfaceC86379XvD.LIZIZ()) != null && (LLF = this.LIZ.LLF()) != null && (mutableLiveData2 = LLF.LLFF) != null) {
            mutableLiveData2.setValue(LIZIZ);
        }
        FeedLiveViewHolderVM LLF2 = this.LIZ.LLF();
        if (LLF2 == null || (mutableLiveData = LLF2.LLF) == null) {
            return;
        }
        mutableLiveData.setValue(2);
    }

    @Override // X.InterfaceC71474S3i
    public final void LIZIZ() {
        MutableLiveData<Integer> mutableLiveData;
        FeedLiveViewHolderVM LLF = this.LIZ.LLF();
        if (LLF == null || (mutableLiveData = LLF.LLF) == null) {
            return;
        }
        mutableLiveData.setValue(0);
    }

    @Override // X.InterfaceC71474S3i
    public final void onDismiss() {
        C0NB.LIZIZ(this.LIZ.LJLJJLL, "product card dismiss");
        this.LIZ.LL().setVisibility(8);
    }

    @Override // X.InterfaceC71474S3i
    public final void onShow() {
        C0NB.LIZIZ(this.LIZ.LJLJJLL, "product card show");
    }

    public C86377XvB(EcLiveFeedCardWidgetV1 ecLiveFeedCardWidgetV1) {
        this.LIZ = ecLiveFeedCardWidgetV1;
    }
}

package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedCardWidgetV2;

/* renamed from: X.XvC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86378XvC implements InterfaceC71474S3i {
    public final /* synthetic */ EcLiveFeedCardWidgetV2 LIZ;

    @Override // X.InterfaceC71474S3i
    public final void LIZ() {
        String LIZIZ;
        FeedLiveViewHolderVM LLF;
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        FeedLiveViewHolderVM LLF2 = this.LIZ.LLF();
        if (LLF2 != null && (mutableLiveData2 = LLF2.LLF) != null) {
            mutableLiveData2.setValue(1);
        }
        InterfaceC86379XvD interfaceC86379XvD = this.LIZ.LJLJI;
        if (interfaceC86379XvD == null || (LIZIZ = interfaceC86379XvD.LIZIZ()) == null || (LLF = this.LIZ.LLF()) == null || (mutableLiveData = LLF.LLFF) == null) {
            return;
        }
        mutableLiveData.setValue(LIZIZ);
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

    public C86378XvC(EcLiveFeedCardWidgetV2 ecLiveFeedCardWidgetV2) {
        this.LIZ = ecLiveFeedCardWidgetV2;
    }
}

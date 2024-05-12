package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.o;
import webcast.api.room.FrequencyControlData;

/* renamed from: X.XuV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86335XuV implements InterfaceC28696BOa {
    public final /* synthetic */ LivePreviewGuideEnterVM LJLIL;
    public final /* synthetic */ LiveRoomStruct LJLILLLLZI;

    @Override // X.InterfaceC28696BOa
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC28696BOa
    public final void onFailed(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    @Override // X.InterfaceC28696BOa
    public final void LIZ(FrequencyControlData frequencyControlData) {
        if (!this.LJLIL.gv0(false)) {
            if (frequencyControlData.result) {
                C86343Xud hv0 = this.LJLIL.hv0();
                if (hv0 != null && C78963Uyt.LJIIIIZZ(hv0)) {
                    this.LJLIL.LJLJJI.setValue(Boolean.TRUE);
                } else {
                    MutableLiveData<Boolean> mutableLiveData = this.LJLIL.LJLJI;
                    Boolean bool = Boolean.TRUE;
                    mutableLiveData.setValue(bool);
                    this.LJLIL.LJLILLLLZI.setValue(bool);
                }
                long j = this.LJLILLLLZI.id;
                C77699UeV.LIZ.put(Long.valueOf(j), Long.valueOf(j));
                this.LJLIL.LJLLJ = true;
                return;
            }
            if (TextUtils.isEmpty(frequencyControlData.avoidReason)) {
                return;
            }
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = this.LJLIL;
            String str = frequencyControlData.avoidReason;
            o.LJIIIIZZ(str, "data.avoidReason");
            livePreviewGuideEnterVM.jv0(str);
            return;
        }
        this.LJLIL.jv0("ad");
    }

    public C86335XuV(LivePreviewGuideEnterVM livePreviewGuideEnterVM, LiveRoomStruct liveRoomStruct) {
        this.LJLIL = livePreviewGuideEnterVM;
        this.LJLILLLLZI = liveRoomStruct;
    }
}

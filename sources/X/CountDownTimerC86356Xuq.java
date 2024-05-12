package X;

import android.os.CountDownTimer;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Xuq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class CountDownTimerC86356Xuq extends CountDownTimer {
    public final /* synthetic */ LabelContainerWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C86323XuJ.LIZIZ(this.LIZ.LJLZ(), this.LIZ.LL);
        LivePreviewPlayerVM LLF = this.LIZ.LLF();
        if (LLF != null) {
            EnumC83095WjL status = EnumC83095WjL.HIDE;
            o.LJIIIZ(status, "status");
            LLF.LJLLILLLL = status;
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LIZ.LJLLLLLL.getValue();
        if (subscribeMaskLayerVM != null) {
            subscribeMaskLayerVM.LJLILLLLZI.setValue(C76800UCe.LIZ);
            subscribeMaskLayerVM.gv0(false);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        LiveRoomStruct liveRoomStruct;
        Long valueOf;
        LiveRoomStruct liveRoomStruct2;
        Long valueOf2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        LabelContainerWidget labelContainerWidget = this.LIZ;
        C86343Xud LJLZ = labelContainerWidget.LJLZ();
        if (LJLZ != null && (liveRoomStruct4 = LJLZ.LIZIZ) != null) {
            liveRoomStruct4.allowPreviewTime = j;
        }
        TuxTextView tuxTextView = labelContainerWidget.LLD;
        if (tuxTextView != null) {
            tuxTextView.setText(LabelContainerWidget.LJZL(j));
        }
        C86343Xud LJLZ2 = this.LIZ.LJLZ();
        if (LJLZ2 != null && (liveRoomStruct3 = LJLZ2.LIZIZ) != null) {
            j2 = liveRoomStruct3.maxPreviewTime;
        } else {
            j2 = -1;
        }
        C28668BMy.LJFF = false;
        if (j2 > 60000 && j2 - j > 60000) {
            C86343Xud LJLZ3 = this.LIZ.LJLZ();
            if (LJLZ3 == null || (liveRoomStruct2 = LJLZ3.LIZIZ) == null || (valueOf2 = Long.valueOf(liveRoomStruct2.id)) == null || C77699UeV.LIZ.get(valueOf2) == null) {
                C86343Xud LJLZ4 = this.LIZ.LJLZ();
                if (LJLZ4 != null && (liveRoomStruct = LJLZ4.LIZIZ) != null && (valueOf = Long.valueOf(liveRoomStruct.id)) != null) {
                    C77699UeV.LIZ.put(valueOf, valueOf);
                }
                LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LIZ.LJZ.getValue();
                if (livePreviewGuideEnterVM != null && (mutableLiveData2 = livePreviewGuideEnterVM.LJLJI) != null) {
                    mutableLiveData2.setValue(Boolean.TRUE);
                }
                LivePreviewGuideEnterVM livePreviewGuideEnterVM2 = (LivePreviewGuideEnterVM) this.LIZ.LJZ.getValue();
                if (livePreviewGuideEnterVM2 == null || (mutableLiveData = livePreviewGuideEnterVM2.LJLILLLLZI) == null) {
                    return;
                }
                mutableLiveData.setValue(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC86356Xuq(long j, LabelContainerWidget labelContainerWidget) {
        super(j, 1000L);
        this.LIZ = labelContainerWidget;
    }
}

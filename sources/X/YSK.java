package X;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.controller.RefactorVideoController;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes16.dex */
public class YSK implements WeakHandler.IHandler {
    public final /* synthetic */ RefactorVideoController LJLIL;

    public YSK(RefactorVideoController refactorVideoController) {
        this.LJLIL = refactorVideoController;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i;
        boolean z;
        int i2;
        C79985VaH c79985VaH;
        TTVideoEngine tTVideoEngine;
        C79994VaQ c79994VaQ;
        if (C81332Vw0.LIZ[EnumC81331Vvz.getMsg(message.what).ordinal()] != 1) {
            return;
        }
        RefactorVideoController refactorVideoController = this.LJLIL;
        C79985VaH c79985VaH2 = refactorVideoController.playEntity;
        if (c79985VaH2 == null || (c79994VaQ = c79985VaH2.LJIIIIZZ) == null || (i = c79994VaQ.LIZLLL) <= 0) {
            i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        if (refactorVideoController.videoPlayStatusQuery.LIZ != null) {
            Object obj = message.obj;
            if (obj != null && ((Boolean) obj).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            int currentPosition = this.LJLIL.getCurrentPosition();
            TTVideoEngine tTVideoEngine2 = this.LJLIL.videoInfoQuery.LIZ;
            if (tTVideoEngine2 != null) {
                i2 = tTVideoEngine2.LJIL();
            } else {
                i2 = 0;
            }
            if (currentPosition >= i2) {
                currentPosition = i2;
            }
            if (i2 > 0 && (!z || currentPosition < i)) {
                RefactorVideoController refactorVideoController2 = this.LJLIL;
                if (refactorVideoController2.videoPlayListener != null && !refactorVideoController2.filterProgressUpdate(currentPosition)) {
                    RefactorVideoController refactorVideoController3 = this.LJLIL;
                    refactorVideoController3.videoPlayListener.onProgressUpdate(refactorVideoController3.videoStateInquirer, refactorVideoController3.playEntity, currentPosition, i2);
                }
            }
            if (!this.LJLIL.videoPlayStatusQuery.LIZ() && currentPosition > 0 && (c79985VaH = this.LJLIL.playEntity) != null && !TextUtils.isEmpty(c79985VaH.LIZ)) {
                RefactorVideoController refactorVideoController4 = this.LJLIL;
                C25990AHy.LIZIZ(currentPosition, refactorVideoController4.playEntity.LIZ, refactorVideoController4.shouldMarkPushTime);
            }
        }
        if (this.LJLIL.videoPlayStatusQuery.LIZ() || (tTVideoEngine = this.LJLIL.videoPlayStatusQuery.LIZ) == null || tTVideoEngine.LJJIJIIJIL() != 1) {
            return;
        }
        this.LJLIL.handler.sendMessageDelayed(this.LJLIL.handler.obtainMessage(EnumC81331Vvz.UPDATE_PROGRESS.getWhat()), i);
    }
}

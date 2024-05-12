package X;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.slot.FrameSlotController;

/* renamed from: X.CcW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31712CcW implements InterfaceC25704A6y {
    public final /* synthetic */ C31723Cch LIZ;
    public final /* synthetic */ InterfaceC31710CcU LIZIZ;
    public final /* synthetic */ FrameSlotController LIZJ;

    @Override // X.InterfaceC25704A6y
    public final void LIZ(boolean z) {
        java.util.Map<String, String> dataContainerLiveShowTimeMap = this.LIZJ.getDataContainerLiveShowTimeMap();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(SystemClock.uptimeMillis());
        LIZ.append("");
        dataContainerLiveShowTimeMap.put("param_live_slot_prepare_to_show", X1D.LIZIZ(LIZ));
        C31723Cch c31723Cch = this.LIZ;
        c31723Cch.LIZLLL = true;
        c31723Cch.LIZJ = z;
        if (this.LIZIZ.LLJJJJJIL()) {
            this.LIZJ.mediateSlots(this.LIZ);
            return;
        }
        Message obtainMessage = this.LIZJ.mHandler.obtainMessage(1);
        obtainMessage.obj = this.LIZ;
        this.LIZJ.mHandler.sendMessage(obtainMessage);
    }

    public C31712CcW(FrameSlotController frameSlotController, C31723Cch c31723Cch, InterfaceC31710CcU interfaceC31710CcU) {
        this.LIZJ = frameSlotController;
        this.LIZ = c31723Cch;
        this.LIZIZ = interfaceC31710CcU;
    }
}

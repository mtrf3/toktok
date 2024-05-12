package X;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.slot.IconSlotController;

/* renamed from: X.CcV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31711CcV implements InterfaceC25704A6y {
    public final /* synthetic */ C31723Cch LIZ;
    public final /* synthetic */ IconSlotController LIZIZ;

    @Override // X.InterfaceC25704A6y
    public final void LIZ(boolean z) {
        java.util.Map<String, String> dataContainerLiveShowTimeMap = this.LIZIZ.getDataContainerLiveShowTimeMap();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(SystemClock.uptimeMillis());
        LIZ.append("");
        dataContainerLiveShowTimeMap.put("param_live_slot_prepare_to_show", X1D.LIZIZ(LIZ));
        C31723Cch c31723Cch = this.LIZ;
        c31723Cch.LIZLLL = true;
        c31723Cch.LIZJ = z;
        if (c31723Cch.LIZIZ.LLJJJJJIL()) {
            this.LIZIZ.mediateSlots(this.LIZ);
            return;
        }
        Message obtainMessage = this.LIZIZ.mHandler.obtainMessage(1);
        obtainMessage.obj = this.LIZ;
        this.LIZIZ.mHandler.sendMessage(obtainMessage);
    }

    public C31711CcV(IconSlotController iconSlotController, C31723Cch c31723Cch) {
        this.LIZIZ = iconSlotController;
        this.LIZ = c31723Cch;
    }
}

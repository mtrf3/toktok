package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.ttve.nativePort.VEBingoManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class P65 extends Handler {
    public final java.util.Map<Integer, int[]> LIZ;
    public final String[] LIZIZ;
    public final java.util.Map<Integer, P67> LIZJ;
    public final List<Integer> LIZLLL;
    public final P69 LJ;
    public final TEVideoUtilsCallback LJFF;
    public final AtomicInteger LJI;
    public final /* synthetic */ VEBingoManager LJII;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what != 1 || this.LJ.LIZIZ || this.LJI.get() >= this.LIZLLL.size()) {
            return;
        }
        int intValue = ((Integer) ListProtector.get(this.LIZLLL, this.LJI.getAndIncrement())).intValue();
        String str = this.LIZIZ[intValue];
        int[] iArr = this.LIZ.get(Integer.valueOf(intValue));
        P67 p67 = this.LIZJ.get(Integer.valueOf(intValue));
        this.LJFF.setListener(new P66(this.LJII, intValue, str, iArr.length, new P68(this, intValue, str)));
        int nativeGetVideoFrameMore = TEVideoUtils.nativeGetVideoFrameMore(str, iArr, p67.LIZ, p67.LIZIZ, false, false, 1, true, this.LJFF);
        StringBuilder LIZJ = C06460Ne.LIZJ("getVideoFramesMore result: ", nativeGetVideoFrameMore, " , index: ", intValue, ", videoPath: ");
        LIZJ.append(str);
        LIZJ.append(", thread: ");
        LIZJ.append(C16880lQ.LLLLIIIILLL().getName());
        P4Q.LJFF("VEBingoManager", X1D.LIZIZ(LIZJ));
        if (nativeGetVideoFrameMore == 0) {
            return;
        }
        removeCallbacksAndMessages(null);
        this.LJ.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P65(VEBingoManager vEBingoManager, Looper looper, java.util.Map<Integer, int[]> map, String[] strArr, java.util.Map<Integer, P67> map2, List<Integer> list, P69 p69) {
        super(looper);
        this.LJII = vEBingoManager;
        this.LJFF = new TEVideoUtilsCallback();
        this.LJI = new AtomicInteger(0);
        this.LIZ = map;
        this.LIZIZ = strArr;
        this.LIZJ = map2;
        this.LIZLLL = list;
        this.LJ = p69;
    }
}

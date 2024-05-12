package X;

import Y.IDHandlerS21S0100000_8;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.preload.experiment.VideoCoverPreloadConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class IH1 {
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(IH4.LJLIL);
    public static final VideoCoverPreloadConfig LJFF = (VideoCoverPreloadConfig) IH2.LIZIZ.getValue();
    public final ArrayList<IH7> LIZ = new ArrayList<>();
    public String LIZIZ = "";
    public final IF0 LIZJ;
    public final IDHandlerS21S0100000_8 LIZLLL;

    public static final IH1 LIZJ() {
        return (IH1) LJ.getValue();
    }

    public IH1() {
        HandlerThread handlerThread = new HandlerThread("VideoCoverPreloader");
        this.LIZJ = new IF0(this);
        if (LJFF.enablePreload) {
            handlerThread.start();
            this.LIZLLL = new IDHandlerS21S0100000_8(this, handlerThread.getLooper(), 7);
            C47242IgQ.LIZ().LJII().addPreloadCallback(new C46297IEz(this));
        }
    }

    public final int LIZIZ(String str) {
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((IH7) ListProtector.get(this.LIZ, i)).LIZ)) {
                return i;
            }
        }
        return -1;
    }

    public final void LIZLLL(String str) {
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8;
        Message obtainMessage;
        if (!LJFF.enablePreload || str == null || str.length() == 0 || (iDHandlerS21S0100000_8 = this.LIZLLL) == null || (obtainMessage = iDHandlerS21S0100000_8.obtainMessage(6, str)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }

    public final void LIZ(String str, List list, boolean z) {
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8;
        Message obtainMessage;
        if (!LJFF.enablePreload || list == null || list.isEmpty() || str == null || str.length() == 0 || (iDHandlerS21S0100000_8 = this.LIZLLL) == null || (obtainMessage = iDHandlerS21S0100000_8.obtainMessage(1, new IH8(new ArrayList(list), z, str))) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }
}

package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes15.dex */
public final class VLI extends Handler {
    public final VSW LIZ;

    public VLI(VSW vsw) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = vsw;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1000) {
            if (i != 2000) {
                if (i != 3000) {
                    return;
                }
                VSW vsw = this.LIZ;
                if (vsw.LJLJJL == null) {
                    return;
                }
                vsw.LLILZIL.postDelayed(new ARunnableS50S0100000_14(vsw, 238), 200L);
                return;
            }
            this.LIZ.LJFF(EnumC79550VJy.FLING);
            return;
        }
        this.LIZ.invalidate();
    }
}

package X;

import Y.ARunnableS44S0100000_8;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes9.dex */
public final class J2K implements Choreographer.FrameCallback, Handler.Callback {
    public static final J2K LJLLI = new J2K();
    public volatile int LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public Choreographer LJLJLLL;
    public int LJLL;
    public volatile long LJLIL = -9223372036854775807L;
    public volatile long LJLILLLLZI = -9223372036854775807L;
    public final Handler LJLJL = new Handler(C06M.LIZ("Vsync:Handler").getLooper(), this);
    public final Bundle LJLJLJ = new Bundle();

    public J2K() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 69));
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Message obtainMessage = this.LJLJL.obtainMessage(2);
        this.LJLJLJ.putLong("time", j);
        obtainMessage.setData(this.LJLJLJ);
        obtainMessage.sendToTarget();
        this.LJLJLLL.postFrameCallback(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Choreographer choreographer;
        Choreographer choreographer2;
        int i = message.what;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return false;
                    }
                    this.LJLJJI = message.getData().getLong("vsync");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("refresh rate = ");
                    LIZ.append(this.LJLJJI);
                    X1D.LIZIZ(LIZ);
                    return true;
                }
                long j = message.getData().getLong("time");
                if (this.LJLJJI != 0) {
                    this.LJLIL = j;
                    if (this.LJLILLLLZI == -9223372036854775807L) {
                        this.LJLILLLLZI = this.LJLIL;
                    } else {
                        long j2 = this.LJLIL - this.LJLILLLLZI;
                        if (j2 <= 0) {
                            this.LJLILLLLZI = -9223372036854775807L;
                        } else {
                            long j3 = this.LJLJJI;
                            long j4 = j2 - j3;
                            if (j4 > 0) {
                                i2 = Math.round(((float) j4) / ((float) j3));
                            }
                            this.LJLJI += i2;
                            int i3 = (int) (1000000000 / j2);
                            this.LJLJJL = i3;
                            int i4 = this.LJLJJLL;
                            if (i4 != 0) {
                                i3 = Math.min(i4, i3);
                            }
                            this.LJLJJLL = i3;
                            this.LJLILLLLZI = this.LJLIL;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("vsync diff = ");
                            LIZ2.append(((float) j2) * 1.0E-6f);
                            LIZ2.append(", skipped frame = ");
                            LIZ2.append(i2);
                            LIZ2.append(", total = ");
                            LIZ2.append(this.LJLJI);
                            LIZ2.append(", fps = ");
                            LIZ2.append(this.LJLJJL);
                            LIZ2.append(", lowest fps = ");
                            LIZ2.append(this.LJLJJLL);
                            X1D.LIZIZ(LIZ2);
                        }
                    }
                }
                return true;
            }
            this.LJLL--;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("remove observer cnt = ");
            LIZ3.append(this.LJLL);
            X1D.LIZIZ(LIZ3);
            if (this.LJLL == 0 && (choreographer2 = this.LJLJLLL) != null) {
                choreographer2.removeFrameCallback(this);
                this.LJLIL = -9223372036854775807L;
                this.LJLILLLLZI = -9223372036854775807L;
                this.LJLJI = 0;
                this.LJLJJL = 0;
                this.LJLJJLL = 0;
            }
            return true;
        }
        this.LJLL++;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("add observer cnt = ");
        LIZ4.append(this.LJLL);
        X1D.LIZIZ(LIZ4);
        if (this.LJLL == 1 && (choreographer = this.LJLJLLL) != null) {
            choreographer.postFrameCallback(this);
        }
        return true;
    }
}

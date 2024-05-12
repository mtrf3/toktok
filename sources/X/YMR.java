package X;

import android.os.HandlerThread;

/* loaded from: classes16.dex */
public final class YMR extends HandlerThread {
    public final /* synthetic */ YMI LJLIL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.LJLIL.LJI = new VLD(getLooper(), this.LJLIL);
        this.LJLIL.LJII = new VLD(getLooper(), this.LJLIL);
        this.LJLIL.LJIIIIZZ = new VLD(getLooper(), this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YMR(YMI ymi) {
        super("UplinkClient");
        this.LJLIL = ymi;
    }
}

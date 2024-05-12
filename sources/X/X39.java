package X;

import com.ss.android.socialbase.downloader.downloader.Downloader;

/* loaded from: classes16.dex */
public final class X39 implements InterfaceC84163X1j {
    @Override // X.InterfaceC84163X1j
    public final void LJJJIL(int i, int i2) {
        if (i2 == 1) {
            Downloader.getInstance(C84212X3g.LJ()).pause(i);
        } else {
            if (i2 != 2) {
                return;
            }
            Downloader.getInstance(C84212X3g.LJ()).cancel(i);
        }
    }
}

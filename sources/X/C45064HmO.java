package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.HmO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45064HmO implements InterfaceC84907XTz {
    public final /* synthetic */ C45059HmJ LIZ;

    public C45064HmO(C45059HmJ c45059HmJ) {
        this.LIZ = c45059HmJ;
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        String str;
        C45059HmJ c45059HmJ = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchAndDownloadMusic onFailed: onLoadMusicFail error msg=");
        String str2 = null;
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        c45059HmJ.getClass();
        C45059HmJ c45059HmJ2 = this.LIZ;
        if (exc != null) {
            str2 = V0N.LJJIJL(exc);
        }
        c45059HmJ2.LIZIZ(1002, Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT), str2);
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        if (aVMusic == null) {
            return;
        }
        C45059HmJ c45059HmJ = this.LIZ;
        c45059HmJ.LJ.LJ = aVMusic;
        c45059HmJ.LIZ(aVMusic);
    }
}

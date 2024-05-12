package Y;

import X.C84924XUq;
import X.C86622Xz8;
import X.InterfaceC86630XzG;
import android.net.Uri;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Map;

/* loaded from: classes16.dex */
public class ARunnableS1S1301000_15 implements Runnable {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS1S1301000_15 aRunnableS1S1301000_15) {
        C84924XUq c84924XUq = (C84924XUq) aRunnableS1S1301000_15.l1;
        MusicModel musicModel = (MusicModel) aRunnableS1S1301000_15.l2;
        MusicWaveBean musicWaveBean = (MusicWaveBean) aRunnableS1S1301000_15.l3;
        String str = aRunnableS1S1301000_15.s0;
        int i = aRunnableS1S1301000_15.i4;
        c84924XUq.LIZLLL.LJ.LLLLZLL(false, false);
        musicModel.setMusicWaveBean(musicWaveBean);
        musicModel.setDownloadComplete(true);
        c84924XUq.LIZLLL.LJ.LLJILLL(str, musicModel, i);
    }

    public static final void run$1(ARunnableS1S1301000_15 aRunnableS1S1301000_15) {
        boolean LIZ;
        try {
            InterfaceC86630XzG interfaceC86630XzG = (InterfaceC86630XzG) aRunnableS1S1301000_15.l1;
            C86622Xz8 c86622Xz8 = new C86622Xz8();
            c86622Xz8.LIZ = aRunnableS1S1301000_15.s0;
            c86622Xz8.LIZIZ = Integer.valueOf(aRunnableS1S1301000_15.i4);
            c86622Xz8.LIZJ = (Map) aRunnableS1S1301000_15.l2;
            c86622Xz8.LIZLLL = ((Uri) aRunnableS1S1301000_15.l3).toString();
            interfaceC86630XzG.LIZ(c86622Xz8, "");
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1301000_15(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
        this.i4 = i;
    }
}

package X;

import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public final class HWT implements Runnable {
    public final /* synthetic */ HWS LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ HWR LJLJJI;

    public HWT(HWS hws, boolean z, boolean z2, HWR hwr) {
        this.LJLIL = hws;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = hwr;
    }

    public final void LIZ() {
        String str;
        this.LJLIL.LIZ(this.LJLILLLLZI);
        if (this.LJLJI) {
            this.LJLJJI.LJ(null, null);
            AddYourRecordParam addYourRecordParam = this.LJLJJI.LIZJ;
            long currentTimeMillis = System.currentTimeMillis();
            HWR hwr = this.LJLJJI;
            long j = currentTimeMillis - hwr.LJII;
            MusicModel musicModel = hwr.LJ;
            if (musicModel == null || (str = musicModel.getMusicId()) == null) {
                str = "";
            }
            C223978qf.LIZ(addYourRecordParam, false, j, str, this.LJLJJI.LJIIIIZZ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

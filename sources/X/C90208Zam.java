package X;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import org.json.JSONObject;

/* renamed from: X.Zam, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90208Zam {
    public MediaInfo LIZ;
    public MediaQueueData LIZIZ;
    public Boolean LIZJ = Boolean.TRUE;
    public long LIZLLL = -1;
    public double LJ = 1.0d;
    public long[] LJFF;
    public JSONObject LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;

    public final MediaLoadRequestData LIZ() {
        return new MediaLoadRequestData(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI);
    }
}

package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6aD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162816aD implements C6ZK {
    public final String LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final Bundle LIZJ;
    public XKQ LIZLLL;
    public final C62822Ol8 LJ;

    @Override // X.C6ZK
    public final String getFilePath() {
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttn-video-");
        LIZ.append(C43075GvP.LIZ(".mp4"));
        String absolutePath = new File(str, X1D.LIZIZ(LIZ)).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "File(cacheDir, PREFIX + …DEO_SUFFIX)).absolutePath");
        return absolutePath;
    }

    @Override // X.C6ZK
    public final void LIZ(AqS168S0100000_2 aqS168S0100000_2, IDqS427S0100000_2 iDqS427S0100000_2) {
        XKQ xkq = this.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LIZLLL = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new H2Q(this, iDqS427S0100000_2, aqS168S0100000_2, null), 3);
    }

    public C162816aD(String str, VideoPublishEditModel videoPublishEditModel, Bundle publishBundle) {
        o.LJIIIZ(publishBundle, "publishBundle");
        this.LIZ = str;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = publishBundle;
        this.LJ = C221108m2.LIZIZ(C162836aF.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttn-video-");
        LIZ.append(C43075GvP.LIZ(".mp4"));
        videoPublishEditModel.mOutputFile = new File(str, X1D.LIZIZ(LIZ)).getAbsolutePath();
    }
}

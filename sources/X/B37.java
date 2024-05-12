package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B37 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final long LIZ;
    public final LiveMode LIZIZ;
    public final StreamUrlExtra.SrConfig LIZJ;
    public final B3F LIZLLL;
    public final B3F LJ;
    public boolean LJFF;
    public B4V LJI;
    public InterfaceC28740BPs LJII;

    public B37(long j, LiveMode streamType, StreamUrlExtra.SrConfig srConfig, B3F b3f, B3F b3f2, boolean z) {
        o.LJIIIZ(streamType, "streamType");
        this.LIZ = j;
        this.LIZIZ = streamType;
        this.LIZJ = srConfig;
        this.LIZLLL = b3f;
        this.LJ = b3f2;
        this.LJFF = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("roomId = ");
        LIZ.append(j);
        LIZ.append(",streamType = ");
        LIZ.append(streamType);
        LIZ.append(" , srConfig = ");
        LIZ.append(srConfig);
        LIZ.append(",isLandscape = ");
        LIZ.append(this.LJFF);
        B3U.LIZ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("landStreamConfig = ");
        LIZ2.append(b3f);
        B3U.LIZ(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("portStreamConfig = ");
        LIZ3.append(b3f2);
        B3U.LIZ(X1D.LIZIZ(LIZ3));
    }
}

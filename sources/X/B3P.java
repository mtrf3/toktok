package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* loaded from: classes6.dex */
public final class B3P {
    public final boolean LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public EnterRoomConfig LJ;

    public B3P(long j) {
        this.LIZJ = j;
    }

    public B3P(long j, EnterRoomConfig enterRoomConfig) {
        this.LIZJ = j;
        this.LJ = enterRoomConfig;
    }

    public B3P(long j, EnterRoomConfig enterRoomConfig, String str) {
        this.LIZJ = j;
        this.LJ = enterRoomConfig;
        this.LIZIZ = str;
    }

    public B3P(long j, EnterRoomConfig enterRoomConfig, boolean z, boolean z2) {
        this.LIZJ = j;
        this.LJ = enterRoomConfig;
        this.LIZ = z;
        this.LIZLLL = z2;
    }
}

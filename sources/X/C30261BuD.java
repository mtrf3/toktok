package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;

/* renamed from: X.BuD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30261BuD {
    public final EnumC30250Bu2 LIZ;
    public final EnumC30254Bu6 LIZIZ;
    public final LiveMode LIZJ;
    public final boolean LIZLLL;

    public C30261BuD(EnumC30250Bu2 role, EnumC30254Bu6 orientation, LiveMode liveMode, boolean z) {
        o.LJIIIZ(role, "role");
        o.LJIIIZ(orientation, "orientation");
        o.LJIIIZ(liveMode, "liveMode");
        this.LIZ = role;
        this.LIZIZ = orientation;
        this.LIZJ = liveMode;
        this.LIZLLL = z;
    }
}

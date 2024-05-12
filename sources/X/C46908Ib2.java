package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ib2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46908Ib2 implements InterfaceC46911Ib5 {
    public String LIZ;
    public long LIZIZ;
    public long LIZJ;

    @Override // X.InterfaceC46904Iay
    public final float LJ() {
        return C46910Ib4.LIZ(this);
    }

    @Override // X.InterfaceC46904Iay
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC46904Iay
    public final List<InterfaceC46904Iay> LIZJ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC46904Iay
    public final long LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC46904Iay
    public final String key() {
        return this.LIZ;
    }

    public C46908Ib2(String videoId) {
        o.LJIIIZ(videoId, "videoId");
        this.LIZ = "";
    }

    @Override // X.InterfaceC46911Ib5
    public final void LIZ(long j, long j2, String key) {
        o.LJIIIZ(key, "key");
        this.LIZ = key;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}

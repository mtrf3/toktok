package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JjU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49980JjU implements InterfaceC49992Jjg {
    public final InterfaceC49985JjZ LIZ;

    public C49980JjU(JVP jvp) {
        this.LIZ = jvp;
    }

    @Override // X.InterfaceC49295JWh
    public final AbstractC49294JWg LJ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return C49990Jje.LIZ(this, videoEvent);
    }

    @Override // X.InterfaceC49992Jjg
    public final AbstractC49294JWg LIZ(int i, Aweme aweme) {
        return C49989Jjd.LIZ(i, aweme);
    }

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        if (C50452Jr6.LIZ() && aweme.isLive()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49992Jjg
    public final int LIZJ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(videoEvent, "videoEvent");
        return this.LIZ.LJJLIIIJL(aweme.getAid());
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa c50420Jqa, Aweme aweme) {
        return C49989Jjd.LIZIZ(c50420Jqa, aweme, this);
    }
}
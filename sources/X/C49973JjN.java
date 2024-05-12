package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JjN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49973JjN implements InterfaceC49991Jjf {
    public final InterfaceC49985JjZ LIZ;
    public final InterfaceC65784Pro<String> LIZIZ;

    @Override // X.InterfaceC49295JWh
    public final AbstractC49294JWg LJ(C50420Jqa c50420Jqa) {
        return C49990Jje.LIZ(this, c50420Jqa);
    }

    public C49973JjN(JVP jvp, AqS158S0100000_8 aqS158S0100000_8) {
        this.LIZ = jvp;
        this.LIZIZ = aqS158S0100000_8;
    }

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        if (C49834Jh8.LIZ() && C78857UxB.LJJJIL(this.LIZIZ.invoke())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        String invoke = this.LIZIZ.invoke();
        if (invoke == null) {
            return C49296JWi.LIZ;
        }
        OSZ<Aweme, Integer> LJJZ = this.LIZ.LJJZ(invoke);
        if (LJJZ == null) {
            return C49296JWi.LIZ;
        }
        return new JWZ(LJJZ.getSecond().intValue(), LJJZ.getFirst(), null);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Jjd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49989Jjd {
    public static AbstractC49294JWg LIZ(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (i < 0) {
            return C49296JWi.LIZ;
        }
        return new JWZ(i, aweme, null);
    }

    public static AbstractC49294JWg LIZIZ(C50420Jqa videoEvent, Aweme aweme, InterfaceC49992Jjg interfaceC49992Jjg) {
        o.LJIIIZ(videoEvent, "videoEvent");
        o.LJIIIZ(aweme, "aweme");
        return interfaceC49992Jjg.LIZ(interfaceC49992Jjg.LIZJ(videoEvent, aweme), aweme);
    }
}

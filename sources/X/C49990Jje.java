package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Jje, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49990Jje {
    public static AbstractC49294JWg LIZ(InterfaceC49991Jjf interfaceC49991Jjf, C50420Jqa videoEvent) {
        Aweme aweme;
        o.LJIIIZ(videoEvent, "videoEvent");
        Object obj = videoEvent.LJLILLLLZI;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null) {
            return C49296JWi.LIZ;
        }
        if (interfaceC49991Jjf.LIZIZ(videoEvent, aweme)) {
            return interfaceC49991Jjf.LIZLLL(videoEvent, aweme);
        }
        return C49296JWi.LIZ;
    }
}

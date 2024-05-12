package X;

import Y.IDhS109S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zok, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91074Zok {
    public static C73425Srl LIZ(InterfaceC91296ZsK interfaceC91296ZsK) {
        String mediaId = interfaceC91296ZsK.LJIIIIZZ().getDspMusic().getPlayInfo().getMediaId();
        int mediaType = interfaceC91296ZsK.getMediaType();
        o.LJIIIZ(mediaId, "mediaId");
        return C91086Zow.LIZ().getPlayInfo(mediaId, mediaType).LJJL(T16.LIZ()).LJJIJL(new IDhS109S0100000_29(interfaceC91296ZsK, 0)).LJJJJ(new IDhS109S0100000_29(interfaceC91296ZsK, 1));
    }
}

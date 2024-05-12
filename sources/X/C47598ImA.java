package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ImA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47598ImA implements InterfaceC47596Im8 {
    public static final List<String> LIZ = Collections.unmodifiableList(Arrays.asList("h264", "bytevc1", "bytevc2"));

    @Override // X.InterfaceC47595Im7
    public final void LIZ() {
    }

    @Override // X.InterfaceC47595Im7
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC47595Im7
    public final void LIZJ() {
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VidPlayAuthTokenSource{vid='");
        LIZ2.append((String) null);
        LIZ2.append('\'');
        LIZ2.append(", playAuthToken='");
        LIZ2.append((String) null);
        LIZ2.append('\'');
        LIZ2.append(", encodeType='");
        LIZ2.append((String) null);
        LIZ2.append('\'');
        LIZ2.append(", supportedEncodeTypes=");
        LIZ2.append((Object) null);
        LIZ2.append(", resolution=");
        LIZ2.append((Object) null);
        LIZ2.append(", codecStrategy=");
        LIZ2.append(0);
        LIZ2.append('}');
        return X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC47595Im7
    public final EnumC47602ImE type() {
        return EnumC47602ImE.VID_PLAY_AUTH_TOKEN_SOURCE;
    }
}

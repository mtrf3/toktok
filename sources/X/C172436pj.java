package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172436pj {
    public static InterfaceC172476pn LIZ;

    public static InterfaceC172476pn LIZ() {
        InterfaceC172476pn interfaceC172476pn = LIZ;
        if (interfaceC172476pn != null) {
            return interfaceC172476pn;
        }
        throw new IllegalStateException("Media service not initialized");
    }

    public static OSZ LIZIZ(C173856s1 videoInfo) {
        o.LJIIIZ(videoInfo, "videoInfo");
        int i = videoInfo.LIZJ;
        int i2 = videoInfo.LIZLLL;
        int i3 = videoInfo.LJII;
        if (i3 == 90 || i3 == 270) {
            i2 = i;
            i = i2;
        }
        return new OSZ(Integer.valueOf(i), Integer.valueOf(i2));
    }
}

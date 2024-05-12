package X;

/* renamed from: X.aYQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93906aYQ {
    public C26231ARf LIZ;

    public static void LIZ(String str, java.util.Map map, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(map);
        if (z) {
            c188727au.LJI("button_voice", str);
            FMX.LJIIL("click_turn_on_microphone", c188727au.LIZ);
        } else {
            FMX.LJIIL("turn_on_microphone", c188727au.LIZ);
        }
    }
}

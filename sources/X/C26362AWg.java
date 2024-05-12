package X;

/* renamed from: X.AWg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26362AWg {
    public static final /* synthetic */ int LIZ = 0;

    public static final EnumC80902Vp4 LIZ() {
        if (C186557Tv.LIZ() && C26360AWe.LIZ()) {
            return EnumC80902Vp4.ALWAYS;
        }
        if (C186557Tv.LIZ()) {
            return EnumC80902Vp4.ONLY_TOP;
        }
        if (C26360AWe.LIZ()) {
            return EnumC80902Vp4.ONLY_BOTTOM;
        }
        return EnumC80902Vp4.NONE;
    }
}

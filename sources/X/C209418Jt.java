package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.8Jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209418Jt {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC2043380f LIZ(Aweme aweme) {
        if (aweme != null && aweme.isPaidContent) {
            return new InterfaceC2043380f() { // from class: X.8Jw
                @Override // X.InterfaceC2043380f
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC2043380f
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.InterfaceC2043380f
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // X.InterfaceC2043380f
                public final boolean LIZIZ() {
                    if (!C19N.LJ("paid_series_enable_full_screen_key", false)) {
                        return false;
                    }
                    return true;
                }
            };
        }
        return C209428Ju.LIZ;
    }
}

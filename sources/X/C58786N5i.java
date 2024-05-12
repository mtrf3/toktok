package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.N5i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58786N5i {
    public final C0M6<String, EnumC58785N5h> LIZ = new C0M6<>(20);

    public final EnumC58785N5h LIZ(Aweme aweme) {
        String str;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        EnumC58785N5h LIZIZ = this.LIZ.LIZIZ(str);
        if (LIZIZ == null) {
            LIZIZ = EnumC58785N5h.NOT_TRACK;
        }
        o.LJIIIIZZ(LIZIZ, "cacheSurveyShow[key] ?: …ShowEventStatus.NOT_TRACK");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getShowEventTrackStatus key=");
        LIZ.append(str);
        LIZ.append(", status = ");
        LIZ.append(this.LIZ.LIZIZ(str));
        N8M.LIZ(X1D.LIZIZ(LIZ));
        return LIZIZ;
    }

    public final void LIZIZ(Aweme aweme, EnumC58785N5h status) {
        String str;
        o.LJIIIZ(status, "status");
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateShowEventTrackStatus key=");
        LIZ.append(str);
        LIZ.append(", status = ");
        LIZ.append(status);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        this.LIZ.LIZJ(str, status);
    }
}

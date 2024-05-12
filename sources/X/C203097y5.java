package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203097y5 {
    public long LIZ;

    public final void LIZ(Aweme aweme, M89 m89) {
        if (aweme == null || m89 == null || this.LIZ <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        this.LIZ = 0L;
        C50914JyY c50914JyY = new C50914JyY();
        c50914JyY.LJJIIZ(aweme);
        c50914JyY.LJJLIIIIJ = currentTimeMillis;
        String eventType = m89.getEventType();
        o.LJI(eventType);
        c50914JyY.LIZLLL = eventType;
        c50914JyY.LJJJJZI = "story";
        C78866UxK.LJIILIIL(c50914JyY, aweme);
        C78596Usy.LJII(aweme, c50914JyY);
        c50914JyY.LJ("enter_position", C78596Usy.LJJIIZ(m89), InterfaceC1798974f.LIZ);
        c50914JyY.LJIILIIL();
    }
}

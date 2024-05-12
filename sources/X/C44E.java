package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;

/* renamed from: X.44E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44E {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final ChatRoomViewModel LIZ;
    public AnonymousClass449 LIZIZ;
    public C1034544f LIZJ;
    public C99893w1 LIZLLL;
    public C39670Fha LJ;
    public C44F LJFF;
    public C99813vt LJI;
    public u LJII;

    public final void LIZ() {
        C99893w1 c99893w1 = this.LIZLLL;
        if (c99893w1 != null) {
            c99893w1.LIZJ(true);
        }
        C44F c44f = this.LJFF;
        if (c44f != null && (!c44f.LIZIZ().isEmpty())) {
            c44f.LIZIZ().pop();
            if (!c44f.LIZIZ().isEmpty()) {
                c44f.LJLIL = c44f.LIZIZ().peek();
            }
        }
        C99813vt c99813vt = this.LJI;
        if (c99813vt != null) {
            c99813vt.LIZJ = false;
            if (!c99813vt.LIZ().isEmpty()) {
                c99813vt.LIZ().pop();
                if (true ^ c99813vt.LIZ().isEmpty()) {
                    c99813vt.LIZ = c99813vt.LIZ().peek();
                }
            }
        }
    }

    public C44E(C99033ud c99033ud, ChatRoomViewModel chatRoomViewModel) {
        this.LIZ = chatRoomViewModel;
    }
}

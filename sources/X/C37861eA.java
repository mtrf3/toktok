package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCommentComboTraySetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.CommentTrayMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1eA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37861eA implements OnMessageListener {
    public static AnonymousClass148 LJLILLLLZI;
    public static AnonymousClass148 LJLJI;
    public static int LJLJJI;
    public static C259610e LJLJJL;
    public static boolean LJLJJLL;
    public static Room LJLL;
    public static DataChannel LJLLI;
    public static C73411SrX LJLLILLLL;
    public static final C37861eA LJLIL = new C37861eA();
    public static long LJLJL = -1;
    public static long LJLJLJ = -1;
    public static long LJLJLLL = -1;

    public static final void LIZLLL() {
        Long l;
        String str;
        Long l2;
        User owner;
        AnonymousClass148 anonymousClass148 = LJLILLLLZI;
        if (anonymousClass148 != null) {
            anonymousClass148.LJJIIJ();
        }
        AnonymousClass148 anonymousClass1482 = LJLJI;
        if (anonymousClass1482 != null) {
            anonymousClass1482.LJJIIJ();
        }
        LJLJLJ = SystemClock.elapsedRealtime();
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_tray_fadeout");
        LIZ.LJIILLIIL(LJLLI);
        LIZ.LJIJJ("live_take_detail", "event_page");
        C259610e c259610e = LJLJJL;
        if (c259610e != null) {
            l = Long.valueOf(c259610e.LIZ);
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "comment_tray_id");
        Room room = LJLL;
        if (room != null && (owner = room.getOwner()) != null && ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId() == owner.getId()) {
            str = "anchor";
        } else {
            UserAttr userAttr = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getUserAttr();
            if (userAttr != null && userAttr.isAdmin) {
                str = "admin";
            } else {
                str = "user";
            }
        }
        LIZ.LJIJJ(str, "admin_type");
        I9A.LIZ(LJLJLJ, LJLJL, LIZ, "duration");
        C259610e c259610e2 = LJLJJL;
        if (c259610e2 != null) {
            l2 = Long.valueOf(c259610e2.LIZLLL);
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "comment_num");
        LIZ.LJJIIJZLJL();
        LJLJJL = null;
        LJLJJLL = false;
        LJLJL = -1L;
        LJLJLJ = -1L;
        LJLJLLL = C31012CFc.LIZIZ();
    }

    public static final void LJ() {
        C259610e c259610e = LJLJJL;
        if (c259610e == null || !LIZ(c259610e.LJ)) {
            return;
        }
        AnonymousClass148 anonymousClass148 = LJLILLLLZI;
        if (anonymousClass148 != null) {
            anonymousClass148.LJJJJZ(c259610e);
        }
        AnonymousClass148 anonymousClass1482 = LJLJI;
        if (anonymousClass1482 != null) {
            anonymousClass1482.LJJJJZ(c259610e);
        }
    }

    public static final void LJFF() {
        C73411SrX c73411SrX = LJLLILLLL;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
        LJLLILLLL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(LiveCommentComboTraySetting.INSTANCE.getCommentComboTrayDuration(), TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1e8
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C37861eA.LIZLLL();
            }
        }, new InterfaceC64592gB() { // from class: X.1e9
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public static boolean LIZ(long j) {
        boolean z;
        User owner;
        Room room = LJLL;
        if (room != null && (owner = room.getOwner()) != null && ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId() == owner.getId()) {
            z = true;
        } else {
            z = false;
        }
        if (LJLJJI != 0 || j <= LJLJLLL || LJLILLLLZI == null) {
            return false;
        }
        if (z && LJLJI == null) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(C259610e c259610e) {
        Long l;
        String str;
        User owner;
        if (!LIZ(c259610e.LJ)) {
            return;
        }
        if (LJLJJLL) {
            C259610e c259610e2 = LJLJJL;
            if (c259610e2 != null && c259610e.LIZ == c259610e2.LIZ) {
                long j = c259610e.LIZLLL;
                if (j > c259610e2.LIZLLL) {
                    LJLJJL = c259610e;
                    AnonymousClass148 anonymousClass148 = LJLILLLLZI;
                    if (anonymousClass148 != null) {
                        anonymousClass148.LJJJI(j);
                    }
                    AnonymousClass148 anonymousClass1482 = LJLJI;
                    if (anonymousClass1482 != null) {
                        anonymousClass1482.LJJJI(c259610e.LIZLLL);
                    }
                    LJFF();
                    return;
                }
                return;
            }
            return;
        }
        LJLJJL = c259610e;
        AnonymousClass148 anonymousClass1483 = LJLILLLLZI;
        if (anonymousClass1483 != null) {
            anonymousClass1483.LJJJJZ(c259610e);
        }
        AnonymousClass148 anonymousClass1484 = LJLJI;
        if (anonymousClass1484 != null) {
            anonymousClass1484.LJJJJZ(c259610e);
        }
        LJFF();
        LJLJJLL = true;
        LJLJL = SystemClock.elapsedRealtime();
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_tray_show");
        LIZ.LJIILLIIL(LJLLI);
        LIZ.LJIJJ("live_take_detail", "event_page");
        C259610e c259610e3 = LJLJJL;
        if (c259610e3 != null) {
            l = Long.valueOf(c259610e3.LIZ);
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "comment_tray_id");
        Room room = LJLL;
        if (room != null && (owner = room.getOwner()) != null && ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId() == owner.getId()) {
            str = "anchor";
        } else {
            UserAttr userAttr = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getUserAttr();
            if (userAttr != null && userAttr.isAdmin) {
                str = "admin";
            } else {
                str = "user";
            }
        }
        LIZ.LJIJJ(str, "admin_type");
        LIZ.LJJIIJZLJL();
    }

    public final void LIZJ(int i) {
        LJLJJI = i | LJLJJI;
        if (LJLJJLL) {
            C73411SrX c73411SrX = LJLLILLLL;
            if (c73411SrX != null && !c73411SrX.isDisposed()) {
                c73411SrX.dispose();
            }
            LIZLLL();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof CommentTrayMessage) {
            CommentTrayMessage commentTrayMessage = (CommentTrayMessage) iMessage;
            LIZIZ(new C259610e(commentTrayMessage.trayId, commentTrayMessage.contentType, commentTrayMessage.count, commentTrayMessage.chatTime, commentTrayMessage.content));
        }
    }
}

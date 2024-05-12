package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.4lI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118724lI implements InterfaceC86486Xww {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return new int[]{this.LIZ};
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJIIIIZZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
        String str;
        if (i == 0) {
            C188727au c188727au = new C188727au();
            if (this.LIZ == 1006) {
                str = "submit_review";
            } else {
                str = "save_draft";
            }
            c188727au.LJIIIZ("message", str);
            c188727au.LJIIIZ("button_name", "manage");
            c188727au.LJIIIZ("entry_point", this.LIZIZ);
            c188727au.LIZLLL(this.LIZJ ? 1 : 0, "is_new_collection");
            FMX.LJIIL("click_series_status_toast", c188727au.LIZ);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        String str;
        C188727au c188727au = new C188727au();
        if (this.LIZ == 1006) {
            str = "submit_review";
        } else {
            str = "save_draft";
        }
        c188727au.LJIIIZ("message", str);
        c188727au.LJIIIZ("button_name", "manage");
        c188727au.LJIIIZ("entry_point", this.LIZIZ);
        c188727au.LIZLLL(this.LIZJ ? 1 : 0, "is_new_collection");
        FMX.LJIIL("show_series_status_toast", c188727au.LIZ);
        return null;
    }

    public C118724lI(int i, String entryPoint, boolean z) {
        o.LJIIIZ(entryPoint, "entryPoint");
        this.LIZ = i;
        this.LIZIZ = entryPoint;
        this.LIZJ = z;
    }
}

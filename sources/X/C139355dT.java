package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.5dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139355dT {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Keva LIZ;

    public final void LIZJ() {
        this.LIZ.storeBoolean("info_sticker_hint_set", true);
    }

    public C139355dT() {
        Keva repo = Keva.getRepo("text_sticker_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }

    public final void LIZ(boolean z) {
        int i = 4;
        if (z) {
            this.LIZ.storeInt("change_text_toast_shown", 4);
            return;
        }
        Keva keva = this.LIZ;
        int i2 = keva.getInt("change_text_toast_shown", 0) + 1;
        if (i2 <= 4) {
            i = i2;
        }
        keva.storeInt("change_text_toast_shown", i);
    }

    public final void LIZIZ(boolean z) {
        int i = 4;
        if (z) {
            this.LIZ.storeInt("read_text_toast_shown", 4);
            return;
        }
        Keva keva = this.LIZ;
        int i2 = keva.getInt("read_text_toast_shown", 0) + 1;
        if (i2 <= 4) {
            i = i2;
        }
        keva.storeInt("read_text_toast_shown", i);
    }

    public final boolean LIZLLL(int i, String str) {
        int LIZJ = i0.LIZJ("highlight_hint_should_show", str, this.LIZ, 0);
        if (LIZJ >= i) {
            return false;
        }
        this.LIZ.storeInt(i0.LJFF("highlight_hint_should_show", str), LIZJ + 1);
        return true;
    }
}

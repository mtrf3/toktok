package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Xh9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85507Xh9 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public int LJ = -1;

    public final void LIZ(C188727au c188727au) {
        c188727au.LJIIIZ("enterFrom", this.LIZJ);
        c188727au.LJIIIZ("groupId", this.LIZ);
        c188727au.LJIIIZ("userId", this.LIZIZ);
        c188727au.LJIIIZ("enterMethod", this.LIZLLL);
    }

    public final void LIZLLL(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        LIZ(c188727au);
        c188727au.LIZLLL(this.LJ, "previous_save_edit_cnt");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("get_captions_failed", str);
        FMX.LJIIL("enter_edit_captions", c188727au.LIZ);
    }

    public final void LIZIZ(EnumC85506Xh8 iconName, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(iconName, "iconName");
        if (z2) {
            C188727au c188727au = new C188727au();
            LIZ(c188727au);
            c188727au.LJIIIZ("clicked", iconName.getLoggingName());
            FMX.LJIIL("click_in_secondary_edit_captions", c188727au.LIZ);
            return;
        }
        C188727au c188727au2 = new C188727au();
        LIZ(c188727au2);
        c188727au2.LJIIIZ("clicked", iconName.getLoggingName());
        if (z) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        c188727au2.LJIIIZ("status", str);
        c188727au2.LIZLLL(this.LJ, "previous_save_edit_cnt");
        FMX.LJIIL("click_in_edit_captions", c188727au2.LIZ);
    }

    public final void LIZJ(EnumC85506Xh8 clickedIcon, boolean z, boolean z2) {
        o.LJIIIZ(clickedIcon, "clickedIcon");
        if (z2) {
            C188727au c188727au = new C188727au();
            LIZ(c188727au);
            c188727au.LIZLLL(z ? 1 : 0, "confirmed");
            FMX.LJIIL("confirm_cancel_in_secondary_edit_captions", c188727au.LIZ);
            return;
        }
        C188727au c188727au2 = new C188727au();
        LIZ(c188727au2);
        c188727au2.LIZLLL(z ? 1 : 0, "confirmed");
        c188727au2.LJIIIZ("clicked", clickedIcon.getLoggingName());
        c188727au2.LIZLLL(this.LJ, "previous_save_edit_cnt");
        FMX.LJIIL("confirm_click_in_edit_captions", c188727au2.LIZ);
    }

    public C85507Xh9(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}

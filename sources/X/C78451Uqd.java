package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.Uqd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78451Uqd {
    public final Activity LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Bundle LIZLLL;
    public final R47 LJ;
    public final JJ5 LJFF;
    public final boolean LJI;

    public C78451Uqd(C78450Uqc c78450Uqc) {
        this.LIZ = c78450Uqc.LIZ;
        String str = c78450Uqc.LIZIZ;
        this.LIZIZ = str;
        String str2 = c78450Uqc.LIZJ;
        this.LIZJ = str2;
        Bundle bundle = c78450Uqc.LIZLLL;
        bundle = bundle == null ? new Bundle() : bundle;
        this.LIZLLL = bundle;
        this.LJ = c78450Uqc.LJ;
        this.LJFF = c78450Uqc.LJFF;
        this.LJI = c78450Uqc.LJI;
        String str3 = c78450Uqc.LJIIJ;
        String str4 = c78450Uqc.LJIIJJI;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("enter_method", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("login_panel_dynamic_title_login", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("login_panel_dynamic_title_signup", str4);
        }
        bundle.putDouble("login_panel_max_height_ratio", c78450Uqc.LJIIIIZZ);
        bundle.putBoolean("login_panel_adjust_height_automatically", c78450Uqc.LJIIIZ);
        bundle.putBoolean("login_panel_button_horizontal_3p_style", c78450Uqc.LJII);
    }
}

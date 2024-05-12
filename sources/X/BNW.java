package X;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BNW {
    public final String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public BNX LJIILJJIL;
    public final String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public final String LJIL;
    public float LJJ;
    public int LJJI;
    public boolean LJJIFFI;
    public int LJJII;

    public final HybridDialogFragment LIZ() {
        HybridDialogFragment hybridDialogFragment = new HybridDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_url", this.LIZ);
        bundle.putInt("arg_width", this.LIZIZ);
        bundle.putInt("arg_height", this.LIZJ);
        bundle.putInt("arg_gravity", this.LJIIIZ);
        bundle.putInt("arg_radius", this.LJ);
        bundle.putInt("arg_margin", this.LIZLLL);
        bundle.putInt("arg_radius_top_left", this.LJFF);
        bundle.putInt("arg_radius_top_right", this.LJI);
        bundle.putInt("arg_radius_bottom_right", this.LJII);
        bundle.putInt("arg_radius_bottom_left", this.LJIIIIZZ);
        bundle.putBoolean("arg_use_bottom_close", false);
        bundle.putBoolean("arg_landscape_custom_height", this.LJIIJJI);
        bundle.putBoolean("arg_landscape_custom_gravity", false);
        bundle.putBoolean("arg_show_dim", this.LJIIL);
        bundle.putString("arg_monitor_page_service", null);
        bundle.putBoolean("arg_cancel_on_touch_outside", this.LJIILIIL);
        bundle.putString("arg_original_scheme", this.LJIILLIIL);
        bundle.putString("fallback_schema", this.LJIILL);
        bundle.putString("arg_from_label", this.LJIIJ);
        bundle.putInt("hybrid_type", this.LJIILJJIL.ordinal());
        bundle.putString("arg_enter_type", this.LJIIZILJ);
        bundle.putString("arg_title", this.LJIJ);
        bundle.putBoolean("arg_enable_title_bar", this.LJIJI);
        bundle.putBoolean("arg_enable_title_close", this.LJIJJ);
        bundle.putBoolean("arg_enable_title_share", this.LJIJJLI);
        bundle.putBoolean("arg_enable_title_share_add_report_action", false);
        bundle.putString("arg_report_schema", this.LJIL);
        bundle.putFloat("arg_mask_alpha", this.LJJ);
        bundle.putInt("arg_web_bg_color", this.LJJI);
        bundle.putBoolean("arg_enable_pull_down_close", this.LJJIFFI);
        bundle.putInt("arg_variable_height", this.LJJII);
        hybridDialogFragment.setArguments(bundle);
        C29261Be5.LIZ(this.LIZ);
        return hybridDialogFragment;
    }

    public final BNW LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "bottom";
            }
            this.LJIIZILJ = str;
        }
        return this;
    }

    public final BNW LIZJ(String str) {
        float f;
        try {
            o.LJI(str);
            f = CastFloatProtector.parseFloat(str);
        } catch (Exception unused) {
            f = 0.0f;
        }
        this.LJJ = f;
        return this;
    }

    public final BNW LIZLLL(String originalScheme) {
        o.LJIIIZ(originalScheme, "originalScheme");
        this.LJIILLIIL = originalScheme;
        return this;
    }

    public final BNW LJ(int i) {
        this.LJ = i;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        return this;
    }

    public final BNW LJI(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return this;
        }
        try {
            o.LJI(str);
            i = Color.parseColor(C40690Fy2.LIZ(str));
        } catch (Exception unused) {
            i = -1;
        }
        this.LJJI = i;
        return this;
    }

    public BNW(String url, String str) {
        o.LJIIIZ(url, "url");
        this.LIZ = url;
        this.LJIIJ = "";
        this.LJIILIIL = true;
        this.LJIILJJIL = BNX.H5;
        this.LJIILL = "";
        this.LJIILLIIL = "";
        this.LJIIZILJ = "";
        this.LJIJ = "";
        this.LJIL = "";
        this.LJJI = -1;
        this.LJIILL = str == null ? "" : str;
    }

    public final BNW LJFF(int i, int i2) {
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        return this;
    }
}

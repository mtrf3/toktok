package X;

import android.os.Bundle;

/* renamed from: X.2Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56802Ku {
    public boolean LJI;
    public int LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int[] LJIILL;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJII = "";
    public String LJIIIIZZ = "share_panel";
    public String LJIIIZ = "";

    public final void LIZ(Bundle bundle) {
        bundle.putString("tab_name", this.LIZ);
        bundle.putString("impr_id", this.LIZIZ);
        bundle.putInt("screen_orientation", 0);
        bundle.putInt("video_share_page_type", 0);
        bundle.putInt("page_type", this.LJIIJ);
        bundle.putBoolean("is_video_from_discover", this.LJI);
        String str = this.LIZJ;
        if (str != null && str.length() != 0) {
            bundle.putString("search_id", this.LIZJ);
        }
        String str2 = this.LIZLLL;
        if (str2 != null && str2.length() != 0) {
            bundle.putString("search_result_id", this.LIZLLL);
        }
        String str3 = this.LJ;
        if (str3 != null && str3.length() != 0) {
            bundle.putString("tag_id", this.LJ);
        }
        String str4 = this.LJFF;
        if (str4 != null && str4.length() != 0) {
            bundle.putString("extra_parent_tag_id", this.LJFF);
        }
        String str5 = this.LJIIJJI;
        if (str5 != null && str5.length() != 0) {
            bundle.putString("collection_id", this.LJIIJJI);
        }
        String str6 = this.LJIIL;
        if (str6 != null && str6.length() != 0) {
            bundle.putString("collection_name", this.LJIIL);
        }
        int i = this.LJIILIIL;
        if (i > 0 || this.LJIILJJIL > 0) {
            bundle.putInt("longPressDownX", i);
            bundle.putInt("longPressDownY", this.LJIILJJIL);
        }
        int[] iArr = this.LJIILL;
        if (iArr != null) {
            bundle.putIntArray("share_button_location", iArr);
        }
    }
}

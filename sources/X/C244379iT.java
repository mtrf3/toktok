package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.9iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244379iT {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public EnumC26153AOf LJFF;
    public String LJI;
    public String LJII;

    public final java.util.Map<String, String> LIZ() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("nickname", null);
        }
        String str = this.LIZ;
        if (str != null) {
            hashMap.put("signature", str);
        }
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            hashMap.put("unique_id", this.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LIZJ)) {
            hashMap.put("avatar_uri", this.LIZJ);
        }
        if (this.LJ) {
            hashMap.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.LIZLLL)) {
            hashMap.put("video_icon_virtual_URI", this.LIZLLL);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("school_name", null);
        }
        hashMap.put("school_type", String.valueOf(0));
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("ins_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("google_account", null);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("youtube_channel_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("youtube_channel_title", null);
        }
        String str2 = this.LJI;
        if (str2 != null) {
            hashMap.put("bio_url", str2);
        }
        String str3 = this.LJII;
        if (str3 != null) {
            hashMap.put("bio_email", str3);
        }
        EnumC26153AOf enumC26153AOf = this.LJFF;
        if (enumC26153AOf != null) {
            hashMap.put("avatar_source", String.valueOf(enumC26153AOf.getValue()));
        }
        return hashMap;
    }
}

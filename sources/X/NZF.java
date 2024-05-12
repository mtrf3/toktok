package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public enum NZF {
    refresh(R.id.itn, "refresh"),
    copylink(R.id.bva, "copylink"),
    openwithbrowser(R.id.hbo, "openwithbrowser");

    public int id;
    public String key;

    public static NZF valueOf(String str) {
        return (NZF) V0N.LJJJ(NZF.class, str);
    }

    NZF(int i, String str) {
        this.id = i;
        this.key = str;
    }
}

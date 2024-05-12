package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.8vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC227268vy {
    FRIENDS(R.string.j78, "friends"),
    FOLLOWING(R.string.j77, "following"),
    MAF(R.string.j7_, "maf"),
    MORE_FRIENDS(R.string.j79, "find_more");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC227268vy valueOf(String str) {
        return (EnumC227268vy) V0N.LJJJ(EnumC227268vy.class, str);
    }

    public final int getTextRes() {
        return this.LJLIL;
    }

    public final String getTrackName() {
        return this.LJLILLLLZI;
    }

    EnumC227268vy(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}

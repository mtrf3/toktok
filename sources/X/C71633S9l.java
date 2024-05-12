package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.S9l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71633S9l extends F9E implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final boolean LJLLLL;
    public final boolean LJLLLLLL;

    public C71633S9l() {
        this(0);
    }

    public static C71633S9l L(String title, String row1Key, String row1Value, String row2Key, String row2Value, String row3Key, String row3Value, String row4Key, String row4Value, String row5Key, String row5Value, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(row1Key, "row1Key");
        o.LJIIIZ(row1Value, "row1Value");
        o.LJIIIZ(row2Key, "row2Key");
        o.LJIIIZ(row2Value, "row2Value");
        o.LJIIIZ(row3Key, "row3Key");
        o.LJIIIZ(row3Value, "row3Value");
        o.LJIIIZ(row4Key, "row4Key");
        o.LJIIIZ(row4Value, "row4Value");
        o.LJIIIZ(row5Key, "row5Key");
        o.LJIIIZ(row5Value, "row5Value");
        return new C71633S9l(title, row1Key, row1Value, row2Key, row2Value, row3Key, row3Value, row4Key, row4Value, row5Key, row5Value, z, z2, z3, z4, z5);
    }

    public static /* synthetic */ C71633S9l M(C71633S9l c71633S9l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6 = z5;
        String str12 = str6;
        String str13 = str5;
        String str14 = str4;
        String str15 = str3;
        String str16 = str;
        String str17 = str2;
        String str18 = str7;
        String str19 = str9;
        String str20 = str10;
        String str21 = str11;
        String str22 = str8;
        boolean z7 = z3;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z4;
        if ((i & 1) != 0) {
            str16 = c71633S9l.LJLIL;
        }
        if ((i & 2) != 0) {
            str17 = c71633S9l.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str15 = c71633S9l.LJLJI;
        }
        if ((i & 8) != 0) {
            str14 = c71633S9l.LJLJJI;
        }
        if ((i & 16) != 0) {
            str13 = c71633S9l.LJLJJL;
        }
        if ((i & 32) != 0) {
            str12 = c71633S9l.LJLJJLL;
        }
        if ((i & 64) != 0) {
            str18 = c71633S9l.LJLJL;
        }
        if ((i & 128) != 0) {
            str22 = c71633S9l.LJLJLJ;
        }
        if ((i & 256) != 0) {
            str19 = c71633S9l.LJLJLLL;
        }
        if ((i & 512) != 0) {
            str20 = c71633S9l.LJLL;
        }
        if ((i & 1024) != 0) {
            str21 = c71633S9l.LJLLI;
        }
        if ((i & 2048) != 0) {
            z8 = c71633S9l.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            z9 = c71633S9l.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z7 = c71633S9l.LJLLL;
        }
        if ((i & 16384) != 0) {
            z10 = c71633S9l.LJLLLL;
        }
        if ((i & 32768) != 0) {
            z6 = c71633S9l.LJLLLLLL;
        }
        c71633S9l.getClass();
        String str23 = str18;
        String str24 = str13;
        String str25 = str12;
        return L(str16, str17, str15, str14, str24, str25, str23, str22, str19, str20, str21, z8, z9, z7, z10, z6);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, Boolean.valueOf(this.LJLLILLLL), Boolean.valueOf(this.LJLLJ), Boolean.valueOf(this.LJLLL), Boolean.valueOf(this.LJLLLL), Boolean.valueOf(this.LJLLLLLL)};
    }

    public /* synthetic */ C71633S9l(int i) {
        this("", "", "", "", "", "", "", "", "", "", "", true, true, true, true, true);
    }

    public C71633S9l(String title, String row1Key, String row1Value, String row2Key, String row2Value, String row3Key, String row3Value, String row4Key, String row4Value, String row5Key, String row5Value, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(row1Key, "row1Key");
        o.LJIIIZ(row1Value, "row1Value");
        o.LJIIIZ(row2Key, "row2Key");
        o.LJIIIZ(row2Value, "row2Value");
        o.LJIIIZ(row3Key, "row3Key");
        o.LJIIIZ(row3Value, "row3Value");
        o.LJIIIZ(row4Key, "row4Key");
        o.LJIIIZ(row4Value, "row4Value");
        o.LJIIIZ(row5Key, "row5Key");
        o.LJIIIZ(row5Value, "row5Value");
        this.LJLIL = title;
        this.LJLILLLLZI = row1Key;
        this.LJLJI = row1Value;
        this.LJLJJI = row2Key;
        this.LJLJJL = row2Value;
        this.LJLJJLL = row3Key;
        this.LJLJL = row3Value;
        this.LJLJLJ = row4Key;
        this.LJLJLLL = row4Value;
        this.LJLL = row5Key;
        this.LJLLI = row5Value;
        this.LJLLILLLL = z;
        this.LJLLJ = z2;
        this.LJLLL = z3;
        this.LJLLLL = z4;
        this.LJLLLLLL = z5;
    }
}

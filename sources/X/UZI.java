package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZI extends F9E {
    public final boolean LJLIL;
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
    public final String LJLLJ;
    public final String LJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, Boolean.valueOf(this.LJLLILLLL), this.LJLLJ, this.LJLLL};
    }

    public UZI(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, String str11, String str12, int i) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String gameName = str6;
        String str18 = str7;
        String str19 = str8;
        String audienceUID = str9;
        String str20 = str10;
        String str21 = str11;
        boolean z3 = (i & 1) != 0 ? false : z;
        str13 = (i & 2) != 0 ? "" : str13;
        str14 = (i & 4) != 0 ? "" : str14;
        str15 = (i & 8) != 0 ? "" : str15;
        str16 = (i & 16) != 0 ? "" : str16;
        str17 = (i & 32) != 0 ? "" : str17;
        gameName = (i & 64) != 0 ? "" : gameName;
        str18 = (i & 128) != 0 ? "" : str18;
        str19 = (i & 256) != 0 ? "" : str19;
        audienceUID = (i & 512) != 0 ? "" : audienceUID;
        str20 = (i & 1024) != 0 ? "" : str20;
        boolean z4 = (i & 2048) == 0 ? z2 : false;
        str21 = (i & 4096) != 0 ? "" : str21;
        String str22 = (i & FileUtils.BUFFER_SIZE) == 0 ? str12 : "";
        o.LJIIIZ(gameName, "gameName");
        o.LJIIIZ(audienceUID, "audienceUID");
        this.LJLIL = z3;
        this.LJLILLLLZI = str13;
        this.LJLJI = str14;
        this.LJLJJI = str15;
        this.LJLJJL = str16;
        this.LJLJJLL = str17;
        this.LJLJL = gameName;
        this.LJLJLJ = str18;
        this.LJLJLLL = str19;
        this.LJLL = audienceUID;
        this.LJLLI = str20;
        this.LJLLILLLL = z4;
        this.LJLLJ = str21;
        this.LJLLL = str22;
    }
}

package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.NGh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59071NGh {
    public final String LIZ;
    public final String LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;
    public final Long LJIIL;
    public final Long LJIILIIL;

    public C59071NGh(String str, String str2, Long l, Integer num, Integer num2, int i, String str3, String str4, String str5, String str6, Integer num3, Long l2, Long l3, int i2) {
        String str7;
        long j;
        Long l4 = l;
        Integer num4 = num;
        Long l5 = l3;
        Long l6 = l2;
        Integer num5 = num3;
        Integer num6 = num2;
        String str8 = str4;
        int i3 = i;
        String str9 = str3;
        String str10 = str5;
        String str11 = (i2 & 1) != 0 ? "" : str;
        l4 = (i2 & 4) != 0 ? -1L : l4;
        if ((i2 & 8) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        num4 = (i2 & 16) != 0 ? -1 : num4;
        num6 = (i2 & 32) != 0 ? -1 : num6;
        i3 = (i2 & 64) != 0 ? 0 : i3;
        str9 = (i2 & 128) != 0 ? "" : str9;
        str8 = (i2 & 256) != 0 ? "" : str8;
        str10 = (i2 & 512) != 0 ? "" : str10;
        String str12 = (i2 & 1024) == 0 ? str6 : "";
        num5 = (i2 & 2048) != 0 ? -1 : num5;
        if ((i2 & 4096) != 0) {
            j = -1;
            l6 = -1L;
        } else {
            j = -1;
        }
        l5 = (i2 & FileUtils.BUFFER_SIZE) != 0 ? Long.valueOf(j) : l5;
        HH1.LIZ(str11, "geckoChannel", str2, WM7.SCENE_SERVICE, str9, "strategy");
        this.LIZ = str11;
        this.LIZIZ = str2;
        this.LIZJ = l4;
        this.LIZLLL = str7;
        this.LJ = num4;
        this.LJFF = num6;
        this.LJI = i3;
        this.LJII = str9;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str10;
        this.LJIIJ = str12;
        this.LJIIJJI = num5;
        this.LJIIL = l6;
        this.LJIILIIL = l5;
    }
}

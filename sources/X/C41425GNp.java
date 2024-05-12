package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GNp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41425GNp extends C41426GNq {
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public boolean LJIIIZ;
    public final String LJIIJ;

    public C41425GNp() {
        this(0, 255, 0L, null, null, null, null, false);
    }

    public final int hashCode() {
        return this.LJ.hashCode();
    }

    @Override // X.C41426GNq
    public final int LIZ() {
        return this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C41425GNp)) {
            return false;
        }
        C41425GNp c41425GNp = (C41425GNp) obj;
        if (c41425GNp.LIZLLL != this.LIZLLL || !o.LJ(c41425GNp.LJ, this.LJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41425GNp(int i, int i2, long j, String str, String str2, String str3, String str4, boolean z) {
        super(0);
        String creationId = str;
        String coverPath = str2;
        String musicName = str3;
        String time = str4;
        boolean z2 = z;
        i = (i2 & 1) != 0 ? 106 : i;
        creationId = (i2 & 2) != 0 ? "" : creationId;
        coverPath = (i2 & 4) != 0 ? "" : coverPath;
        j = (i2 & 8) != 0 ? 0L : j;
        musicName = (i2 & 16) != 0 ? "" : musicName;
        time = (i2 & 32) != 0 ? "" : time;
        z2 = (i2 & 64) != 0 ? false : z2;
        String musicId = (i2 & 128) == 0 ? null : "";
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(coverPath, "coverPath");
        o.LJIIIZ(musicName, "musicName");
        o.LJIIIZ(time, "time");
        o.LJIIIZ(musicId, "musicId");
        this.LIZLLL = i;
        this.LJ = creationId;
        this.LJFF = coverPath;
        this.LJI = j;
        this.LJII = musicName;
        this.LJIIIIZZ = time;
        this.LJIIIZ = z2;
        this.LJIIJ = musicId;
    }
}

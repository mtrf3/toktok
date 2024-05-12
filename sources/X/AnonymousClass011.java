package X;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.011, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass011 {
    public final long LIZ;
    public final AnonymousClass013 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final List<String> LJFF;
    public final Bundle LJI;

    public String toString() {
        return this.LIZJ;
    }

    public static String LIZ(String fileName) {
        o.LJIIIZ(fileName, "fileName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EnumC31874Cf8.LIVE_KARAOKE.getFullPath());
        LIZ.append(fileName);
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass011(long j, AnonymousClass013 songUrl, String songName, String singerStr, long j2, List<String> coverUrl) {
        o.LJIIIZ(songUrl, "songUrl");
        o.LJIIIZ(songName, "songName");
        o.LJIIIZ(singerStr, "singerStr");
        o.LJIIIZ(coverUrl, "coverUrl");
        this.LIZ = j;
        this.LIZIZ = songUrl;
        this.LIZJ = songName;
        this.LIZLLL = singerStr;
        this.LJ = j2;
        this.LJFF = coverUrl;
        this.LJI = new Bundle();
    }
}

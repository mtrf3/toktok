package X;

import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.afY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94348afY implements InterfaceC87283bg {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final ArrayList<TT2DSPSongInfo> LJLJI;
    public final TT2DSPSongInfo LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94348afY)) {
            return false;
        }
        C94348afY c94348afY = (C94348afY) obj;
        return this.LJLIL == c94348afY.LJLIL && o.LJ(this.LJLILLLLZI, c94348afY.LJLILLLLZI) && o.LJ(this.LJLJI, c94348afY.LJLJI) && o.LJ(this.LJLJJI, c94348afY.LJLJJI) && o.LJ(this.LJLJJL, c94348afY.LJLJJL) && o.LJ(this.LJLJJLL, c94348afY.LJLJJLL) && o.LJ(this.LJLJL, c94348afY.LJLJL) && o.LJ(this.LJLJLJ, c94348afY.LJLJLJ) && o.LJ(this.LJLJLLL, c94348afY.LJLJLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((r0 * 31) + this.LJLILLLLZI.hashCode()) * 31) + this.LJLJI.hashCode()) * 31;
        TT2DSPSongInfo tT2DSPSongInfo = this.LJLJJI;
        return ((((((((((hashCode + (tT2DSPSongInfo == null ? 0 : tT2DSPSongInfo.hashCode())) * 31) + this.LJLJJL.hashCode()) * 31) + this.LJLJJLL.hashCode()) * 31) + this.LJLJL.hashCode()) * 31) + this.LJLJLJ.hashCode()) * 31) + this.LJLJLLL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDspSheetAwemeListInitData(isDspAlreadyAuth=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", ttToDspSongInfos=");
        LIZ.append(this.LJLJI);
        LIZ.append(", curDspSongInfo=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", awemeId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", musicId=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", metaSongId=");
        LIZ.append(this.LJLJL);
        LIZ.append(", musicVolume=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", buttonType=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C94348afY(boolean z, String enterFrom, ArrayList<TT2DSPSongInfo> ttToDspSongInfos, TT2DSPSongInfo tT2DSPSongInfo, String awemeId, String musicId, String metaSongId, String musicVolume, String buttonType) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(ttToDspSongInfos, "ttToDspSongInfos");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(metaSongId, "metaSongId");
        o.LJIIIZ(musicVolume, "musicVolume");
        o.LJIIIZ(buttonType, "buttonType");
        this.LJLIL = z;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = ttToDspSongInfos;
        this.LJLJJI = tT2DSPSongInfo;
        this.LJLJJL = awemeId;
        this.LJLJJLL = musicId;
        this.LJLJL = metaSongId;
        this.LJLJLJ = musicVolume;
        this.LJLJLLL = buttonType;
    }
}

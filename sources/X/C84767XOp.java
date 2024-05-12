package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XOp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84767XOp {
    public final String LIZ;
    public final MusicWaveBean LIZIZ;
    public final Integer LIZJ;
    public final XSX LIZLLL;
    public final Effect LJ;
    public final Integer LJFF;
    public final ExceptionResult LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C84767XOp() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84767XOp)) {
            return false;
        }
        C84767XOp c84767XOp = (C84767XOp) obj;
        return o.LJ(this.LIZ, c84767XOp.LIZ) && o.LJ(this.LIZIZ, c84767XOp.LIZIZ) && o.LJ(this.LIZJ, c84767XOp.LIZJ) && o.LJ(this.LIZLLL, c84767XOp.LIZLLL) && o.LJ(this.LJ, c84767XOp.LJ) && o.LJ(this.LJFF, c84767XOp.LJFF) && o.LJ(this.LJI, c84767XOp.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        MusicWaveBean musicWaveBean = this.LIZIZ;
        int hashCode2 = (hashCode + (musicWaveBean == null ? 0 : musicWaveBean.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        XSX xsx = this.LIZLLL;
        int hashCode4 = (hashCode3 + (xsx == null ? 0 : xsx.hashCode())) * 31;
        Effect effect = this.LJ;
        int hashCode5 = (hashCode4 + (effect == null ? 0 : effect.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ExceptionResult exceptionResult = this.LJI;
        return hashCode6 + (exceptionResult != null ? exceptionResult.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicAndEffectResult(musicFile=");
        LIZ.append(this.LIZ);
        LIZ.append(", waveBean=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", musicStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicDownloadException=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", effect=");
        LIZ.append(this.LJ);
        LIZ.append(", effectStatus=");
        LIZ.append(this.LJFF);
        LIZ.append(", effectExceptionResult=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C84767XOp(String str, MusicWaveBean musicWaveBean, Integer num, XSX xsx, Effect effect, Integer num2, ExceptionResult exceptionResult) {
        this.LIZ = str;
        this.LIZIZ = musicWaveBean;
        this.LIZJ = num;
        this.LIZLLL = xsx;
        this.LJ = effect;
        this.LJFF = num2;
        this.LJI = exceptionResult;
    }

    public /* synthetic */ C84767XOp(String str, MusicWaveBean musicWaveBean, Integer num, XSX xsx, Effect effect, Integer num2, ExceptionResult exceptionResult, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : musicWaveBean, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : xsx, (i & 16) != 0 ? null : effect, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? exceptionResult : null);
    }
}

package X;

import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionLoadEndEvent;
import defpackage.s0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2I {
    public final C75012wz LIZ;
    public final ELP LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC65784Pro<Long> LIZLLL;
    public boolean LJ;
    public Long LJFF;
    public final Y2J LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2I)) {
            return false;
        }
        Y2I y2i = (Y2I) obj;
        return o.LJ(this.LIZ, y2i.LIZ) && o.LJ(this.LIZIZ, y2i.LIZIZ) && this.LIZJ == y2i.LIZJ && o.LJ(this.LIZLLL, y2i.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C75012wz c75012wz = this.LIZ;
        int hashCode = (this.LIZIZ.hashCode() + ((c75012wz == null ? 0 : c75012wz.hashCode()) * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LIZLLL.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionLoadETCollector(commonParams=");
        LIZ.append(this.LIZ);
        LIZ.append(", startParams=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFirstFrameRendered=");
        LIZ.append(this.LIZJ);
        LIZ.append(", getTimeInMs=");
        return C06540Nm.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public Y2I(C75012wz c75012wz, ELP elp, boolean z, IF2 getTimeInMs) {
        o.LJIIIZ(getTimeInMs, "getTimeInMs");
        this.LIZ = c75012wz;
        this.LIZIZ = elp;
        this.LIZJ = z;
        this.LIZLLL = getTimeInMs;
        Y2J y2j = new Y2J();
        y2j.LIZIZ(c75012wz);
        y2j.LIZIZ(elp);
        this.LJI = y2j;
    }

    public final void LIZ(ILM resultCode, final Integer num, final Integer num2, final Integer num3, final Integer num4) {
        final int i;
        o.LJIIIZ(resultCode, "resultCode");
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        Y2J y2j = this.LJI;
        final int value = resultCode.getValue();
        Long l = this.LJFF;
        if (l != null) {
            i = (int) (this.LIZLLL.invoke().longValue() - l.longValue());
        } else {
            i = 0;
        }
        y2j.LIZIZ(new InterfaceC60152Xr(value, i, num, num2, num3, num4) { // from class: X.2Xl
            public final int LJLIL;
            public final int LJLILLLLZI;
            public final Integer LJLJI;
            public final Integer LJLJJI;
            public final Integer LJLJJL;
            public final Integer LJLJJLL;

            @Override // X.InterfaceC54035LIp
            public final boolean LLD() {
                return true;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLILZ() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("result_code", Integer.valueOf(this.LJLIL));
                linkedHashMap.put("duration", Integer.valueOf(this.LJLILLLLZI));
                linkedHashMap.put("player_error_code", this.LJLJI);
                linkedHashMap.put("player_cache_hit", this.LJLJJI);
                linkedHashMap.put("player_download_duration", this.LJLJJL);
                linkedHashMap.put("player_file_size", this.LJLJJLL);
                return linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C60092Xl)) {
                    return false;
                }
                C60092Xl c60092Xl = (C60092Xl) obj;
                return this.LJLIL == c60092Xl.LJLIL && this.LJLILLLLZI == c60092Xl.LJLILLLLZI && o.LJ(this.LJLJI, c60092Xl.LJLJI) && o.LJ(this.LJLJJI, c60092Xl.LJLJJI) && o.LJ(this.LJLJJL, c60092Xl.LJLJJL) && o.LJ(this.LJLJJLL, c60092Xl.LJLJJLL);
            }

            public final int hashCode() {
                int i2 = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
                Integer num5 = this.LJLJI;
                int hashCode = (i2 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Integer num6 = this.LJLJJI;
                int hashCode2 = (hashCode + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.LJLJJL;
                int hashCode3 = (hashCode2 + (num7 == null ? 0 : num7.hashCode())) * 31;
                Integer num8 = this.LJLJJLL;
                return hashCode3 + (num8 != null ? num8.hashCode() : 0);
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLJZ() {
                return LLLILZ();
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLLIL() {
                return C113554cx.LJJJLIIL();
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PerfCaptionLoadEndParams(resultCode=");
                LIZ.append(this.LJLIL);
                LIZ.append(", duration=");
                LIZ.append(this.LJLILLLLZI);
                LIZ.append(", playerErrorCode=");
                LIZ.append(this.LJLJI);
                LIZ.append(", playerCacheHit=");
                LIZ.append(this.LJLJJI);
                LIZ.append(", playerDownloadDuration=");
                LIZ.append(this.LJLJJL);
                LIZ.append(", playerFileSize=");
                return s0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
            }

            {
                this.LJLIL = value;
                this.LJLILLLLZI = i;
                this.LJLJI = num;
                this.LJLJJI = num2;
                this.LJLJJL = num3;
                this.LJLJJLL = num4;
            }
        });
        Y2G.LIZLLL(ClaPerfCaptionLoadEndEvent.class, this.LJI);
    }
}

package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hod, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45203Hod {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final C63A LJI;
    public final List<AutoCutMediaModel> LJII;
    public final AutoCutThemeData LJIIIIZZ;
    public final AutoCutThemeData LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final CreativeInfo LJIIL;
    public final boolean LJIILIIL;
    public final List<InterfaceC45209Hoj> LJIILJJIL;

    public C45203Hod() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45203Hod)) {
            return false;
        }
        C45203Hod c45203Hod = (C45203Hod) obj;
        return this.LIZ == c45203Hod.LIZ && this.LIZIZ == c45203Hod.LIZIZ && this.LIZJ == c45203Hod.LIZJ && this.LIZLLL == c45203Hod.LIZLLL && this.LJ == c45203Hod.LJ && this.LJFF == c45203Hod.LJFF && this.LJI == c45203Hod.LJI && o.LJ(this.LJII, c45203Hod.LJII) && o.LJ(this.LJIIIIZZ, c45203Hod.LJIIIIZZ) && o.LJ(this.LJIIIZ, c45203Hod.LJIIIZ) && o.LJ(this.LJIIJ, c45203Hod.LJIIJ) && this.LJIIJJI == c45203Hod.LJIIJJI && o.LJ(this.LJIIL, c45203Hod.LJIIL) && this.LJIILIIL == c45203Hod.LJIILIIL && o.LJ(this.LJIILJJIL, c45203Hod.LJIILJJIL);
    }

    public final String toString() {
        return "AutoCutProcessConfig(needRecommendMusic=" + this.LIZ + ", needRecommendNLEModel=" + this.LIZIZ + ", needDownloadMusic=" + this.LIZJ + ", recommendMusicNum=" + this.LIZLLL + ", useCommerceMusic=" + this.LJ + ", autoCutIndex=" + this.LJFF + ", autoCutSource=" + this.LJI + ", mediaModelList=" + this.LJII + ", presetTheme=" + this.LJIIIIZZ + ", targetTheme=" + this.LJIIIZ + ", taskId=" + this.LJIIJ + ", soundSyncMode=" + this.LJIIJJI + ", creativeInfo=" + this.LJIIL + ", ignoreCompress=" + this.LJIILIIL + ", callbacks=" + this.LJIILJJIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        ?? r03 = this.LIZJ;
        int i5 = r03;
        if (r03 != 0) {
            i5 = 1;
        }
        int i6 = (((i4 + i5) * 31) + this.LIZLLL) * 31;
        ?? r04 = this.LJ;
        int i7 = r04;
        if (r04 != 0) {
            i7 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJII, (this.LJI.hashCode() + ((((i6 + i7) * 31) + this.LJFF) * 31)) * 31, 31);
        AutoCutThemeData autoCutThemeData = this.LJIIIIZZ;
        int i8 = 0;
        if (autoCutThemeData == null) {
            hashCode = 0;
        } else {
            hashCode = autoCutThemeData.hashCode();
        }
        int i9 = (LIZIZ + hashCode) * 31;
        AutoCutThemeData autoCutThemeData2 = this.LJIIIZ;
        if (autoCutThemeData2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = autoCutThemeData2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str = this.LJIIJ;
        if (str != null) {
            i8 = str.hashCode();
        }
        int i11 = (i10 + i8) * 31;
        ?? r05 = this.LJIIJJI;
        int i12 = r05;
        if (r05 != 0) {
            i12 = 1;
        }
        int hashCode3 = (this.LJIIL.hashCode() + ((i11 + i12) * 31)) * 31;
        if (!this.LJIILIIL) {
            i = 0;
        }
        return this.LJIILJJIL.hashCode() + ((hashCode3 + i) * 31);
    }

    public C45203Hod(boolean z, boolean z2, boolean z3, boolean z4, int i, C63A autoCutSource, List mediaModelList, AutoCutThemeData autoCutThemeData, AutoCutThemeData autoCutThemeData2, String str, boolean z5, CreativeInfo creativeInfo, boolean z6, int i2) {
        int i3;
        AutoCutThemeData autoCutThemeData3 = autoCutThemeData;
        AutoCutThemeData autoCutThemeData4 = autoCutThemeData2;
        String str2 = str;
        boolean z7 = z5;
        if ((i2 & 8) != 0) {
            i3 = C45087Hml.LJIJJ();
        } else {
            i3 = 0;
        }
        i = (i2 & 32) != 0 ? 0 : i;
        autoCutSource = (i2 & 64) != 0 ? C63A.AUTO_CUT : autoCutSource;
        autoCutThemeData3 = (i2 & 256) != 0 ? null : autoCutThemeData3;
        autoCutThemeData4 = (i2 & 512) != 0 ? null : autoCutThemeData4;
        str2 = (i2 & 1024) != 0 ? null : str2;
        z7 = (i2 & 2048) != 0 ? false : z7;
        boolean z8 = (i2 & FileUtils.BUFFER_SIZE) == 0 ? z6 : false;
        List<InterfaceC45209Hoj> callbacks = (i2 & 16384) != 0 ? ORZ.LLJILJILJ(C61878OQg.INSTANCE) : null;
        o.LJIIIZ(autoCutSource, "autoCutSource");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        o.LJIIIZ(callbacks, "callbacks");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = i3;
        this.LJ = z4;
        this.LJFF = i;
        this.LJI = autoCutSource;
        this.LJII = mediaModelList;
        this.LJIIIIZZ = autoCutThemeData3;
        this.LJIIIZ = autoCutThemeData4;
        this.LJIIJ = str2;
        this.LJIIJJI = z7;
        this.LJIIL = creativeInfo;
        this.LJIILIIL = z8;
        this.LJIILJJIL = callbacks;
    }
}

package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import kotlin.jvm.internal.o;

/* renamed from: X.Hof, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45205Hof {
    public final C45203Hod LIZ;
    public final C45256HpU LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final InterfaceC45222How LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45205Hof)) {
            return false;
        }
        C45205Hof c45205Hof = (C45205Hof) obj;
        return o.LJ(this.LIZ, c45205Hof.LIZ) && o.LJ(this.LIZIZ, c45205Hof.LIZIZ) && this.LIZJ == c45205Hof.LIZJ && o.LJ(this.LIZLLL, c45205Hof.LIZLLL) && this.LJ == c45205Hof.LJ && this.LJFF == c45205Hof.LJFF && o.LJ(this.LJI, c45205Hof.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.LIZLLL;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((hashCode2 + i3) * 31) + (this.LJFF ? 1 : 0)) * 31;
        InterfaceC45222How interfaceC45222How = this.LJI;
        return i4 + (interfaceC45222How != null ? interfaceC45222How.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutConfig(processConfig=");
        LIZ.append(this.LIZ);
        LIZ.append(", uiConfig=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", reuseMusic=");
        LIZ.append(this.LIZJ);
        LIZ.append(", oriFirstMediaUriPath=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", useCompressMedia=");
        LIZ.append(this.LJ);
        LIZ.append(", showClearHint=");
        LIZ.append(this.LJFF);
        LIZ.append(", listener=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZ() {
        MusicBuzModel musicBuzModel;
        String str;
        C45203Hod c45203Hod = this.LIZ;
        if (c45203Hod.LIZ) {
            return !c45203Hod.LJII.isEmpty();
        }
        AutoCutThemeData autoCutThemeData = c45203Hod.LJIIIZ;
        if (autoCutThemeData != null && (str = autoCutThemeData.musicId) != null && str.length() > 0) {
            return true;
        }
        AutoCutThemeData autoCutThemeData2 = this.LIZ.LJIIIZ;
        if (autoCutThemeData2 != null && (musicBuzModel = autoCutThemeData2.musicBuzModel) != null && MusicBeanUtilKt.extractAVMusic(musicBuzModel) != null) {
            return true;
        }
        AutoCutThemeData autoCutThemeData3 = this.LIZ.LJIIIZ;
        if (autoCutThemeData3 != null && autoCutThemeData3.templateType == EnumC43998HOo.CUT_SAME.getValue()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C45205Hof(C45203Hod c45203Hod, C45256HpU c45256HpU, boolean z, String str, AbstractC45048Hm8 abstractC45048Hm8) {
        this(c45203Hod, c45256HpU, z, str, false, false, abstractC45048Hm8);
    }

    public C45205Hof(C45203Hod c45203Hod, C45256HpU c45256HpU, boolean z, String str, boolean z2, boolean z3, InterfaceC45222How interfaceC45222How) {
        this.LIZ = c45203Hod;
        this.LIZIZ = c45256HpU;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = interfaceC45222How;
    }
}

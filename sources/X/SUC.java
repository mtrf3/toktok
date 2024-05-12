package X;

import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUC implements InterfaceC87283bg {
    public final List<ExternalMusicInfo> LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final java.util.Map<String, String> LJLJLJ;
    public final OX0 LJLJLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SUC)) {
            return false;
        }
        SUC suc = (SUC) obj;
        return o.LJ(this.LJLIL, suc.LJLIL) && this.LJLILLLLZI == suc.LJLILLLLZI && o.LJ(this.LJLJI, suc.LJLJI) && o.LJ(this.LJLJJI, suc.LJLJJI) && o.LJ(this.LJLJJL, suc.LJLJJL) && o.LJ(this.LJLJJLL, suc.LJLJJLL) && o.LJ(this.LJLJL, suc.LJLJL) && o.LJ(this.LJLJLJ, suc.LJLJLJ) && o.LJ(this.LJLJLLL, suc.LJLJLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChooseThirdMusicData(musicInfoList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isExclusiveResso=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", processId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", musicId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", groupId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", requestId=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", showType=");
        LIZ.append(this.LJLJL);
        LIZ.append(", logExtraMap=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", simpleMusicData=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LJ = C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, (hashCode2 + i) * 31, 31), 31), 31), 31), 31);
        java.util.Map<String, String> map = this.LJLJLJ;
        int i2 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i3 = (LJ + hashCode) * 31;
        OX0 ox0 = this.LJLJLLL;
        if (ox0 != null) {
            i2 = ox0.hashCode();
        }
        return i3 + i2;
    }

    public SUC(List<ExternalMusicInfo> list, boolean z, String str, String str2, String str3, String str4, String str5, java.util.Map<String, String> map, OX0 ox0) {
        this.LJLIL = list;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = map;
        this.LJLJLLL = ox0;
    }
}

package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvl, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91509Zvl implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final UrlModel LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final Long LJLJJL;
    public final Long LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final DspExtraStruct LJLJLLL;
    public final C91395Ztv LJLL;
    public final String LJLLI;
    public final InterfaceC65784Pro<Boolean> LJLLILLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91509Zvl)) {
            return false;
        }
        C91509Zvl c91509Zvl = (C91509Zvl) obj;
        return o.LJ(this.LJLIL, c91509Zvl.LJLIL) && o.LJ(this.LJLILLLLZI, c91509Zvl.LJLILLLLZI) && o.LJ(this.LJLJI, c91509Zvl.LJLJI) && o.LJ(this.LJLJJI, c91509Zvl.LJLJJI) && o.LJ(this.LJLJJL, c91509Zvl.LJLJJL) && o.LJ(this.LJLJJLL, c91509Zvl.LJLJJLL) && this.LJLJL == c91509Zvl.LJLJL && this.LJLJLJ == c91509Zvl.LJLJLJ && o.LJ(this.LJLJLLL, c91509Zvl.LJLJLLL) && o.LJ(this.LJLL, c91509Zvl.LJLL) && o.LJ(this.LJLLI, c91509Zvl.LJLLI) && o.LJ(this.LJLLILLLL, c91509Zvl.LJLLILLLL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        UrlModel urlModel = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LJLJJL;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z = this.LJLJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode6 + i) * 31) + (this.LJLJLJ ? 1 : 0)) * 31;
        DspExtraStruct dspExtraStruct = this.LJLJLLL;
        int hashCode7 = (i2 + (dspExtraStruct == null ? 0 : dspExtraStruct.hashCode())) * 31;
        C91395Ztv c91395Ztv = this.LJLL;
        int hashCode8 = (hashCode7 + (c91395Ztv == null ? 0 : c91395Ztv.hashCode())) * 31;
        String str3 = this.LJLLI;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLLILLLL;
        return hashCode9 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public final String toString() {
        return "LandingPageMusicCellItem(id=" + this.LJLIL + ", pictureUrl=" + this.LJLILLLLZI + ", songName=" + this.LJLJI + ", artistName=" + this.LJLJJI + ", newReleaseStartTime=" + this.LJLJJL + ", playedCount=" + this.LJLJJLL + ", isNewRelease=" + this.LJLJL + ", isHot=" + this.LJLJLJ + ", dspExtra=" + this.LJLJLLL + ", params=" + this.LJLL + ", pageName=" + this.LJLLI + ", isCenter=" + this.LJLLILLLL + ')';
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C91509Zvl(String str, UrlModel urlModel, String str2, String str3, Long l, Long l2, boolean z, boolean z2, DspExtraStruct dspExtraStruct, C91395Ztv c91395Ztv, String str4, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLIL = str;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = l;
        this.LJLJJLL = l2;
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLJLLL = dspExtraStruct;
        this.LJLL = c91395Ztv;
        this.LJLLI = str4;
        this.LJLLILLLL = interfaceC65784Pro;
    }
}

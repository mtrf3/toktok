package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvk, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91508Zvk implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final UrlModel LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;
    public final DspExtraStruct LJLJJL;
    public final C91395Ztv LJLJJLL;
    public final String LJLJL;
    public final InterfaceC65784Pro<Boolean> LJLJLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91508Zvk)) {
            return false;
        }
        C91508Zvk c91508Zvk = (C91508Zvk) obj;
        return o.LJ(this.LJLIL, c91508Zvk.LJLIL) && o.LJ(this.LJLILLLLZI, c91508Zvk.LJLILLLLZI) && o.LJ(this.LJLJI, c91508Zvk.LJLJI) && this.LJLJJI == c91508Zvk.LJLJJI && o.LJ(this.LJLJJL, c91508Zvk.LJLJJL) && o.LJ(this.LJLJJLL, c91508Zvk.LJLJJLL) && o.LJ(this.LJLJL, c91508Zvk.LJLJL) && o.LJ(this.LJLJLJ, c91508Zvk.LJLJLJ);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        UrlModel urlModel = this.LJLILLLLZI;
        int hashCode2 = (((((hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LJLJI.hashCode()) * 31) + C16880lQ.LLJIJIL(this.LJLJJI)) * 31;
        DspExtraStruct dspExtraStruct = this.LJLJJL;
        int hashCode3 = (hashCode2 + (dspExtraStruct == null ? 0 : dspExtraStruct.hashCode())) * 31;
        C91395Ztv c91395Ztv = this.LJLJJLL;
        int hashCode4 = (hashCode3 + (c91395Ztv == null ? 0 : c91395Ztv.hashCode())) * 31;
        String str = this.LJLJL;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJLJ;
        return hashCode5 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LandingPageArtistCellItem(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pictureUrl=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", artistName=");
        LIZ.append(this.LJLJI);
        LIZ.append(", releaseCount=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", dspExtra=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", params=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", pageName=");
        LIZ.append(this.LJLJL);
        LIZ.append(", isCenter=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C91508Zvk(String str, UrlModel urlModel, String str2, long j, DspExtraStruct dspExtraStruct, C91395Ztv c91395Ztv, String str3, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLIL = str;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = str2;
        this.LJLJJI = j;
        this.LJLJJL = dspExtraStruct;
        this.LJLJJLL = c91395Ztv;
        this.LJLJL = str3;
        this.LJLJLJ = interfaceC65784Pro;
    }
}

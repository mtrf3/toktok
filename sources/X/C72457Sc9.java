package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sc9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72457Sc9 implements C33Q {
    public final int LJLIL;
    public final MufPageTrackInfo LJLILLLLZI;
    public final EnumC72449Sc1 LJLJI;
    public final EnumC72462ScE LJLJJI;
    public final C57778Mly LJLJJL;
    public final String LJLJJLL;
    public final List<IMUser> LJLJL;
    public final EnumC72482ScY LJLJLJ;
    public final EnumC72446Sby LJLJLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72457Sc9)) {
            return false;
        }
        C72457Sc9 c72457Sc9 = (C72457Sc9) obj;
        return this.LJLIL == c72457Sc9.LJLIL && o.LJ(this.LJLILLLLZI, c72457Sc9.LJLILLLLZI) && this.LJLJI == c72457Sc9.LJLJI && this.LJLJJI == c72457Sc9.LJLJJI && o.LJ(this.LJLJJL, c72457Sc9.LJLJJL) && o.LJ(this.LJLJJLL, c72457Sc9.LJLJJLL) && o.LJ(this.LJLJL, c72457Sc9.LJLJL) && this.LJLJLJ == c72457Sc9.LJLJLJ && this.LJLJLLL == c72457Sc9.LJLJLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MufListPageVMState(scene=");
        LIZ.append(this.LJLIL);
        LIZ.append(", trackInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mafChunkState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", mufSourceState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", mafSourceState=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", searchText=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", searchResult=");
        LIZ.append(this.LJLJL);
        LIZ.append(", authState=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", pageState=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int i = this.LJLIL * 31;
        MufPageTrackInfo mufPageTrackInfo = this.LJLILLLLZI;
        if (mufPageTrackInfo == null) {
            hashCode = 0;
        } else {
            hashCode = mufPageTrackInfo.hashCode();
        }
        return this.LJLJLLL.hashCode() + ((this.LJLJLJ.hashCode() + AnonymousClass391.LIZIZ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, (this.LJLJJL.hashCode() + ((this.LJLJJI.hashCode() + ((this.LJLJI.hashCode() + ((i + hashCode) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C72457Sc9(int i, MufPageTrackInfo mufPageTrackInfo, EnumC72449Sc1 mafChunkState, EnumC72462ScE mufSourceState, C57778Mly mafSourceState, String searchText, List<? extends IMUser> searchResult, EnumC72482ScY authState, EnumC72446Sby pageState) {
        o.LJIIIZ(mafChunkState, "mafChunkState");
        o.LJIIIZ(mufSourceState, "mufSourceState");
        o.LJIIIZ(mafSourceState, "mafSourceState");
        o.LJIIIZ(searchText, "searchText");
        o.LJIIIZ(searchResult, "searchResult");
        o.LJIIIZ(authState, "authState");
        o.LJIIIZ(pageState, "pageState");
        this.LJLIL = i;
        this.LJLILLLLZI = mufPageTrackInfo;
        this.LJLJI = mafChunkState;
        this.LJLJJI = mufSourceState;
        this.LJLJJL = mafSourceState;
        this.LJLJJLL = searchText;
        this.LJLJL = searchResult;
        this.LJLJLJ = authState;
        this.LJLJLLL = pageState;
    }

    public static C72457Sc9 LIZ(C72457Sc9 c72457Sc9, int i, MufPageTrackInfo mufPageTrackInfo, EnumC72449Sc1 enumC72449Sc1, EnumC72462ScE enumC72462ScE, C57778Mly c57778Mly, String str, List list, EnumC72482ScY enumC72482ScY, EnumC72446Sby enumC72446Sby, int i2) {
        EnumC72446Sby pageState = enumC72446Sby;
        EnumC72482ScY authState = enumC72482ScY;
        List searchResult = list;
        MufPageTrackInfo mufPageTrackInfo2 = mufPageTrackInfo;
        int i3 = i;
        EnumC72449Sc1 mafChunkState = enumC72449Sc1;
        EnumC72462ScE mufSourceState = enumC72462ScE;
        C57778Mly mafSourceState = c57778Mly;
        String searchText = str;
        if ((i2 & 1) != 0) {
            i3 = c72457Sc9.LJLIL;
        }
        if ((i2 & 2) != 0) {
            mufPageTrackInfo2 = c72457Sc9.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            mafChunkState = c72457Sc9.LJLJI;
        }
        if ((i2 & 8) != 0) {
            mufSourceState = c72457Sc9.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            mafSourceState = c72457Sc9.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            searchText = c72457Sc9.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            searchResult = c72457Sc9.LJLJL;
        }
        if ((i2 & 128) != 0) {
            authState = c72457Sc9.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            pageState = c72457Sc9.LJLJLLL;
        }
        c72457Sc9.getClass();
        o.LJIIIZ(mafChunkState, "mafChunkState");
        o.LJIIIZ(mufSourceState, "mufSourceState");
        o.LJIIIZ(mafSourceState, "mafSourceState");
        o.LJIIIZ(searchText, "searchText");
        o.LJIIIZ(searchResult, "searchResult");
        o.LJIIIZ(authState, "authState");
        o.LJIIIZ(pageState, "pageState");
        return new C72457Sc9(i3, mufPageTrackInfo2, mafChunkState, mufSourceState, mafSourceState, searchText, searchResult, authState, pageState);
    }
}

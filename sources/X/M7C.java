package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M7C implements C33Q {
    public final List<Aweme> LJLIL;
    public final C43I<Aweme> LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final MixStruct LJLJL;
    public final AbstractC72932td<C229618zl> LJLJLJ;
    public final C43I<C76800UCe> LJLJLLL;
    public final C43I<Boolean> LJLL;

    public M7C() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M7C)) {
            return false;
        }
        M7C m7c = (M7C) obj;
        return o.LJ(this.LJLIL, m7c.LJLIL) && o.LJ(this.LJLILLLLZI, m7c.LJLILLLLZI) && o.LJ(this.LJLJI, m7c.LJLJI) && this.LJLJJI == m7c.LJLJJI && this.LJLJJL == m7c.LJLJJL && this.LJLJJLL == m7c.LJLJJLL && o.LJ(this.LJLJL, m7c.LJLJL) && o.LJ(this.LJLJLJ, m7c.LJLJLJ) && o.LJ(this.LJLJLLL, m7c.LJLJLLL) && o.LJ(this.LJLL, m7c.LJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        List<Aweme> list = this.LJLIL;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        C43I<Aweme> c43i = this.LJLILLLLZI;
        if (c43i == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<Boolean> c43i2 = this.LJLJI;
        if (c43i2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i2.hashCode();
        }
        int i4 = (((i3 + hashCode3) * 31) + this.LJLJJI) * 31;
        boolean z = this.LJLJJL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (((i4 + i5) * 31) + this.LJLJJLL) * 31;
        MixStruct mixStruct = this.LJLJL;
        if (mixStruct == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = mixStruct.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJLJLJ, (i6 + hashCode4) * 31, 31);
        C43I<C76800UCe> c43i3 = this.LJLJLLL;
        if (c43i3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i3.hashCode();
        }
        int i7 = (LIZ + hashCode5) * 31;
        C43I<Boolean> c43i4 = this.LJLL;
        if (c43i4 != null) {
            i = c43i4.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixVideosState(mixVideos=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectVideoChange=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mixDeleteAction=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pullType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", openBottomDialog=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", requestStatus=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", mixDetail=");
        LIZ.append(this.LJLJL);
        LIZ.append(", panelState=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", clickMixVideosDialog=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", isPanelReq=");
        return C61845OOz.LIZIZ(LIZ, this.LJLL, ')', LIZ);
    }

    public /* synthetic */ M7C(int i) {
        this(null, null, null, 1, false, 0, null, C33X.LIZ, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M7C(List<? extends Aweme> list, C43I<? extends Aweme> c43i, C43I<Boolean> c43i2, int i, boolean z, int i2, MixStruct mixStruct, AbstractC72932td<C229618zl> panelState, C43I<C76800UCe> c43i3, C43I<Boolean> c43i4) {
        o.LJIIIZ(panelState, "panelState");
        this.LJLIL = list;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
        this.LJLJJI = i;
        this.LJLJJL = z;
        this.LJLJJLL = i2;
        this.LJLJL = mixStruct;
        this.LJLJLJ = panelState;
        this.LJLJLLL = c43i3;
        this.LJLL = c43i4;
    }

    public static M7C LIZ(M7C m7c, List list, C43I c43i, C43I c43i2, int i, boolean z, int i2, MixStruct mixStruct, C72912tb c72912tb, C43I c43i3, int i3) {
        C43I<C76800UCe> c43i4;
        C43I c43i5 = c43i3;
        AbstractC72932td<C229618zl> panelState = c72912tb;
        MixStruct mixStruct2 = mixStruct;
        C43I c43i6 = c43i;
        List list2 = list;
        C43I c43i7 = c43i2;
        int i4 = i;
        boolean z2 = z;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            list2 = m7c.LJLIL;
        }
        if ((i3 & 2) != 0) {
            c43i6 = m7c.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            c43i7 = m7c.LJLJI;
        }
        if ((i3 & 8) != 0) {
            i4 = m7c.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            z2 = m7c.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            i5 = m7c.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            mixStruct2 = m7c.LJLJL;
        }
        if ((i3 & 128) != 0) {
            panelState = m7c.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            c43i4 = m7c.LJLJLLL;
        } else {
            c43i4 = null;
        }
        if ((i3 & 512) != 0) {
            c43i5 = m7c.LJLL;
        }
        m7c.getClass();
        o.LJIIIZ(panelState, "panelState");
        return new M7C(list2, c43i6, c43i7, i4, z2, i5, mixStruct2, panelState, c43i4, c43i5);
    }
}

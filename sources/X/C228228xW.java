package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228228xW implements C33Q {
    public final List<Aweme> LJLIL;
    public final List<String> LJLILLLLZI;
    public final List<String> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final List<Aweme> LJLJJLL;
    public final List<String> LJLJL;

    public C228228xW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C228228xW)) {
            return false;
        }
        C228228xW c228228xW = (C228228xW) obj;
        return o.LJ(this.LJLIL, c228228xW.LJLIL) && o.LJ(this.LJLILLLLZI, c228228xW.LJLILLLLZI) && o.LJ(this.LJLJI, c228228xW.LJLJI) && o.LJ(this.LJLJJI, c228228xW.LJLJJI) && o.LJ(this.LJLJJL, c228228xW.LJLJJL) && o.LJ(this.LJLJJLL, c228228xW.LJLJJLL) && o.LJ(this.LJLJL, c228228xW.LJLJL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        List<Aweme> list = this.LJLIL;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<String> list2 = this.LJLILLLLZI;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<String> list3 = this.LJLJI;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJJL, C40328FsC.LIZIZ(this.LJLJJI, (i3 + hashCode3) * 31, 31), 31);
        List<Aweme> list4 = this.LJLJJLL;
        if (list4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list4.hashCode();
        }
        int i4 = (LIZIZ + hashCode4) * 31;
        List<String> list5 = this.LJLJL;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixVideosManageState(mixVideos=");
        LIZ.append(this.LJLIL);
        LIZ.append(", removeFeedsID=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", addFeedsID=");
        LIZ.append(this.LJLJI);
        LIZ.append(", onEditType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", onPlayListChanged=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", addFeedsAweme=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", removeFeedsIdForAddPage=");
        return C1NE.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C228228xW(int i) {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new C43I(Boolean.TRUE), new C43I(Boolean.FALSE), new ArrayList(), new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C228228xW(List<? extends Aweme> list, List<String> list2, List<String> list3, C43I<Boolean> onEditType, C43I<Boolean> onPlayListChanged, List<? extends Aweme> list4, List<String> list5) {
        o.LJIIIZ(onEditType, "onEditType");
        o.LJIIIZ(onPlayListChanged, "onPlayListChanged");
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = list3;
        this.LJLJJI = onEditType;
        this.LJLJJL = onPlayListChanged;
        this.LJLJJLL = list4;
        this.LJLJL = list5;
    }

    public static C228228xW LIZ(C228228xW c228228xW, List list, List list2, List list3, C43I c43i, C43I c43i2, List list4, List list5, int i) {
        List list6 = list5;
        List list7 = list2;
        List list8 = list;
        List list9 = list3;
        C43I onEditType = c43i;
        C43I onPlayListChanged = c43i2;
        List list10 = list4;
        if ((i & 1) != 0) {
            list8 = c228228xW.LJLIL;
        }
        if ((i & 2) != 0) {
            list7 = c228228xW.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            list9 = c228228xW.LJLJI;
        }
        if ((i & 8) != 0) {
            onEditType = c228228xW.LJLJJI;
        }
        if ((i & 16) != 0) {
            onPlayListChanged = c228228xW.LJLJJL;
        }
        if ((i & 32) != 0) {
            list10 = c228228xW.LJLJJLL;
        }
        if ((i & 64) != 0) {
            list6 = c228228xW.LJLJL;
        }
        c228228xW.getClass();
        o.LJIIIZ(onEditType, "onEditType");
        o.LJIIIZ(onPlayListChanged, "onPlayListChanged");
        return new C228228xW(list8, list7, list9, onEditType, onPlayListChanged, list10, list6);
    }
}

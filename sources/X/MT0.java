package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MT0 implements C33Q {
    public final NoticeTabModel LJLIL;
    public final AbstractC56868MTo<Integer> LJLILLLLZI;
    public final AbstractC56868MTo<List<Integer>> LJLJI;
    public final String LJLJJI;
    public final AbstractC72932td<MTK> LJLJJL;
    public final AbstractC72932td<List<MusNotice>> LJLJJLL;
    public final MTT LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final MusNotice LJLL;
    public final C56849MSv LJLLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MT0)) {
            return false;
        }
        MT0 mt0 = (MT0) obj;
        return o.LJ(this.LJLIL, mt0.LJLIL) && o.LJ(this.LJLILLLLZI, mt0.LJLILLLLZI) && o.LJ(this.LJLJI, mt0.LJLJI) && o.LJ(this.LJLJJI, mt0.LJLJJI) && o.LJ(this.LJLJJL, mt0.LJLJJL) && o.LJ(this.LJLJJLL, mt0.LJLJJLL) && this.LJLJL == mt0.LJLJL && this.LJLJLJ == mt0.LJLJLJ && this.LJLJLLL == mt0.LJLJLLL && o.LJ(this.LJLL, mt0.LJLL) && o.LJ(this.LJLLI, mt0.LJLLI);
    }

    public final String toString() {
        return "NoticeResultState(currentTabData=" + this.LJLIL + ", sortType=" + this.LJLILLLLZI + ", filterType=" + this.LJLJI + ", cursor=" + this.LJLJJI + ", tabDataResult=" + this.LJLJJL + ", result=" + this.LJLJJLL + ", requestStatus=" + this.LJLJL + ", isSelected=" + this.LJLJLJ + ", needTabChangeRefresh=" + this.LJLJLLL + ", deletedNotice=" + this.LJLL + ", recommendState=" + this.LJLLI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        NoticeTabModel noticeTabModel = this.LJLIL;
        int i = 0;
        if (noticeTabModel == null) {
            hashCode = 0;
        } else {
            hashCode = noticeTabModel.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJLJJLL, C03090Af.LIZ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, (this.LJLJI.hashCode() + ((this.LJLILLLLZI.hashCode() + (hashCode * 31)) * 31)) * 31, 31), 31), 31);
        MTT mtt = this.LJLJL;
        if (mtt == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mtt.hashCode();
        }
        int i2 = (LIZ + hashCode2) * 31;
        boolean z = this.LJLJLJ;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        if (!this.LJLJLLL) {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        MusNotice musNotice = this.LJLL;
        if (musNotice == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = musNotice.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        C56849MSv c56849MSv = this.LJLLI;
        if (c56849MSv != null) {
            i = c56849MSv.hashCode();
        }
        return i7 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MT0(NoticeTabModel noticeTabModel, AbstractC56868MTo<Integer> sortType, AbstractC56868MTo<? extends List<Integer>> filterType, String str, AbstractC72932td<MTK> tabDataResult, AbstractC72932td<? extends List<? extends MusNotice>> result, MTT mtt, boolean z, boolean z2, MusNotice musNotice, C56849MSv c56849MSv) {
        o.LJIIIZ(sortType, "sortType");
        o.LJIIIZ(filterType, "filterType");
        o.LJIIIZ(tabDataResult, "tabDataResult");
        o.LJIIIZ(result, "result");
        this.LJLIL = noticeTabModel;
        this.LJLILLLLZI = sortType;
        this.LJLJI = filterType;
        this.LJLJJI = str;
        this.LJLJJL = tabDataResult;
        this.LJLJJLL = result;
        this.LJLJL = mtt;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = musNotice;
        this.LJLLI = c56849MSv;
    }

    public static MT0 LIZ(MT0 mt0, NoticeTabModel noticeTabModel, AbstractC56868MTo abstractC56868MTo, AbstractC56868MTo abstractC56868MTo2, String str, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, MTT mtt, boolean z, boolean z2, C56849MSv c56849MSv, int i) {
        MusNotice musNotice;
        C56849MSv c56849MSv2 = c56849MSv;
        boolean z3 = z2;
        boolean z4 = z;
        MTT mtt2 = mtt;
        AbstractC56868MTo sortType = abstractC56868MTo;
        NoticeTabModel noticeTabModel2 = noticeTabModel;
        AbstractC56868MTo filterType = abstractC56868MTo2;
        String cursor = str;
        AbstractC72932td tabDataResult = abstractC72932td;
        AbstractC72932td result = abstractC72932td2;
        if ((i & 1) != 0) {
            noticeTabModel2 = mt0.LJLIL;
        }
        if ((i & 2) != 0) {
            sortType = mt0.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            filterType = mt0.LJLJI;
        }
        if ((i & 8) != 0) {
            cursor = mt0.LJLJJI;
        }
        if ((i & 16) != 0) {
            tabDataResult = mt0.LJLJJL;
        }
        if ((i & 32) != 0) {
            result = mt0.LJLJJLL;
        }
        if ((i & 64) != 0) {
            mtt2 = mt0.LJLJL;
        }
        if ((i & 128) != 0) {
            z4 = mt0.LJLJLJ;
        }
        if ((i & 256) != 0) {
            z3 = mt0.LJLJLLL;
        }
        if ((i & 512) != 0) {
            musNotice = mt0.LJLL;
        } else {
            musNotice = null;
        }
        if ((i & 1024) != 0) {
            c56849MSv2 = mt0.LJLLI;
        }
        mt0.getClass();
        o.LJIIIZ(sortType, "sortType");
        o.LJIIIZ(filterType, "filterType");
        o.LJIIIZ(cursor, "cursor");
        o.LJIIIZ(tabDataResult, "tabDataResult");
        o.LJIIIZ(result, "result");
        return new MT0(noticeTabModel2, sortType, filterType, cursor, tabDataResult, result, mtt2, z4, z3, musNotice, c56849MSv2);
    }
}

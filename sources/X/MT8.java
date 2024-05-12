package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MT8 implements C33Q {
    public final NoticeTabModel LJLIL;
    public final int LJLILLLLZI;
    public final AbstractC72932td<MTK> LJLJI;
    public final MusNotice LJLJJI;
    public final MQ2 LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MT8)) {
            return false;
        }
        MT8 mt8 = (MT8) obj;
        return o.LJ(this.LJLIL, mt8.LJLIL) && this.LJLILLLLZI == mt8.LJLILLLLZI && o.LJ(this.LJLJI, mt8.LJLJI) && o.LJ(this.LJLJJI, mt8.LJLJJI) && this.LJLJJL == mt8.LJLJJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TabDataState(currentTabData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentIndex=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", tabDataResult=");
        LIZ.append(this.LJLJI);
        LIZ.append(", deletedNotice=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", deletedState=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        NoticeTabModel noticeTabModel = this.LJLIL;
        int i = 0;
        if (noticeTabModel == null) {
            hashCode = 0;
        } else {
            hashCode = noticeTabModel.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJLJI, ((hashCode * 31) + this.LJLILLLLZI) * 31, 31);
        MusNotice musNotice = this.LJLJJI;
        if (musNotice != null) {
            i = musNotice.hashCode();
        }
        return this.LJLJJL.hashCode() + ((LIZ + i) * 31);
    }

    public MT8(NoticeTabModel noticeTabModel, int i, AbstractC72932td<MTK> tabDataResult, MusNotice musNotice, MQ2 deletedState) {
        o.LJIIIZ(tabDataResult, "tabDataResult");
        o.LJIIIZ(deletedState, "deletedState");
        this.LJLIL = noticeTabModel;
        this.LJLILLLLZI = i;
        this.LJLJI = tabDataResult;
        this.LJLJJI = musNotice;
        this.LJLJJL = deletedState;
    }

    public static MT8 LIZ(MT8 mt8, NoticeTabModel noticeTabModel, int i, AbstractC72932td abstractC72932td, MusNotice musNotice, MQ2 mq2, int i2) {
        MQ2 deletedState = mq2;
        MusNotice musNotice2 = musNotice;
        AbstractC72932td tabDataResult = abstractC72932td;
        NoticeTabModel noticeTabModel2 = noticeTabModel;
        int i3 = i;
        if ((i2 & 1) != 0) {
            noticeTabModel2 = mt8.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i3 = mt8.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            tabDataResult = mt8.LJLJI;
        }
        if ((i2 & 8) != 0) {
            musNotice2 = mt8.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            deletedState = mt8.LJLJJL;
        }
        mt8.getClass();
        o.LJIIIZ(tabDataResult, "tabDataResult");
        o.LJIIIZ(deletedState, "deletedState");
        return new MT8(noticeTabModel2, i3, tabDataResult, musNotice2, deletedState);
    }
}

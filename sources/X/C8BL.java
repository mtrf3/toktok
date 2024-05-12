package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8BL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BL extends AbstractC51036K1g<Aweme, MvDetailListModel> {
    public int LJLIL;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((MvDetailListModel) t).awemeList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if (t == 0 || (o.LJ(((MvDetailListModel) t).hasMore, Boolean.FALSE) && C79004UzY.LJJIFFI(getItems()))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        Boolean bool;
        T t = this.mData;
        if (t == 0 || (bool = ((MvDetailListModel) t).hasMore) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        Aweme deleteItem = aweme;
        o.LJIIIZ(deleteItem, "deleteItem");
        return C78996UzQ.LJIIIIZZ(getItems(), deleteItem, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel, java.lang.Object] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        ArrayList<Aweme> arrayList;
        int i;
        Aweme aweme;
        String str;
        Aweme aweme2;
        ?? r9 = (MvDetailListModel) obj;
        if (r9 == 0 || (C79004UzY.LJJIFFI(r9.awemeList) && o.LJ(r9.hasMore, Boolean.FALSE))) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            o.LJI(r9);
            ArrayList<Aweme> arrayList2 = r9.awemeList;
            if (arrayList2 != null) {
                Integer valueOf = Integer.valueOf(arrayList2.size());
                int i2 = 0;
                while (true) {
                    if (valueOf != null) {
                        i = valueOf.intValue();
                    } else {
                        i = 0;
                    }
                    if (i2 >= i) {
                        break;
                    }
                    ArrayList<Aweme> arrayList3 = r9.awemeList;
                    if (arrayList3 != null) {
                        aweme = (Aweme) ListProtector.get(arrayList3, i2);
                    } else {
                        aweme = null;
                    }
                    Aweme R1 = AwemeService.LIZ().R1(aweme);
                    ArrayList<Aweme> arrayList4 = r9.awemeList;
                    if (arrayList4 != null && (aweme2 = (Aweme) ListProtector.get(arrayList4, i2)) != null) {
                        int isTop = aweme2.getIsTop();
                        o.LJI(R1);
                        R1.setIsTop(isTop);
                    }
                    IRequestIdService LJ = RequestIdService.LJ();
                    StringBuilder LIZ = X1D.LIZ();
                    if (R1 != null) {
                        str = R1.getAid();
                    } else {
                        str = null;
                    }
                    LIZ.append(str);
                    LIZ.append(this.LJLIL + 11000);
                    LJ.LIZJ(i2, X1D.LIZIZ(LIZ), r9.rid);
                    ArrayList<Aweme> arrayList5 = r9.awemeList;
                    if (arrayList5 != null) {
                        o.LJI(R1);
                        ListProtector.set(arrayList5, i2, R1);
                    }
                    LogPbBean logPbBean = r9.logPb;
                    if (logPbBean != null) {
                        C3A5.LIZ.LJFF(r9.rid, logPbBean);
                    }
                    i2++;
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 != 4) {
                    return;
                }
                ArrayList<Aweme> arrayList6 = r9.awemeList;
                if (arrayList6 != null && (arrayList = ((MvDetailListModel) this.mData).awemeList) != null) {
                    arrayList.addAll(arrayList6);
                }
                MvDetailListModel mvDetailListModel = (MvDetailListModel) this.mData;
                mvDetailListModel.cursor = r9.cursor;
                Boolean bool = r9.hasMore;
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                mvDetailListModel.hasMore = bool;
                return;
            }
            this.mData = r9;
            return;
        }
        T t = this.mData;
        if (t != 0) {
            ((MvDetailListModel) t).hasMore = Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        long j;
        int i;
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((MvDetailListModel) this.mData).cursor;
        }
        Object obj2 = params[2];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        if (4 <= params.length - 1) {
            i = params[4];
        } else {
            i = 1;
        }
        o.LJII(i, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) i).intValue();
        this.LJLIL = intValue;
        FGR.LIZIZ().LIZ(this.mHandler, new C8BM(str, j, this, intValue2), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        int i;
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = params[2];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        if (6 <= params.length - 1) {
            i = params[6];
        } else {
            i = 1;
        }
        o.LJII(i, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) i).intValue();
        this.LJLIL = intValue;
        FGR.LIZIZ().LIZ(this.mHandler, new C8BM(str, 0L, this, intValue2), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new MvDetailListModel();
        }
        T t = this.mData;
        ((MvDetailListModel) t).hasMore = Boolean.TRUE;
        ((MvDetailListModel) t).awemeList = (ArrayList) list;
    }
}

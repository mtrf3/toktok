package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.duet.model.DuetAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7D7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7D7 extends AbstractC51036K1g<Aweme, DuetAwemeList> {
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
        return ((DuetAwemeList) t).items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if (t == 0 || (((DuetAwemeList) t).hasMore == 0 && C79004UzY.LJJIFFI(getItems()))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((DuetAwemeList) t).hasMore != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.ss.android.ugc.aweme.duet.model.DuetAwemeList, java.lang.Object] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        ArrayList<Aweme> arrayList;
        int i;
        Aweme aweme;
        Aweme aweme2;
        ?? r7 = (DuetAwemeList) obj;
        if (r7 != 0 && (!C79004UzY.LJJIFFI(r7.items) || r7.hasMore == 1)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            o.LJI(r7);
            ArrayList<Aweme> arrayList2 = r7.items;
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
                    ArrayList<Aweme> arrayList3 = r7.items;
                    if (arrayList3 != null) {
                        aweme = (Aweme) ListProtector.get(arrayList3, i2);
                    } else {
                        aweme = null;
                    }
                    Aweme R1 = AwemeService.LIZ().R1(aweme);
                    ArrayList<Aweme> arrayList4 = r7.items;
                    if (arrayList4 != null && (aweme2 = (Aweme) ListProtector.get(arrayList4, i2)) != null) {
                        int isTop = aweme2.getIsTop();
                        o.LJI(R1);
                        R1.setIsTop(isTop);
                    }
                    ArrayList<Aweme> arrayList5 = r7.items;
                    if (arrayList5 != null && R1 != null) {
                        ListProtector.set(arrayList5, i2, R1);
                    }
                    i2++;
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 != 4) {
                    return;
                }
                ArrayList<Aweme> arrayList6 = r7.items;
                if (arrayList6 != null && (arrayList = ((DuetAwemeList) this.mData).items) != null) {
                    arrayList.addAll(arrayList6);
                }
                DuetAwemeList duetAwemeList = (DuetAwemeList) this.mData;
                duetAwemeList.cursor = r7.cursor;
                duetAwemeList.hasMore = r7.hasMore;
                return;
            }
            this.mData = r7;
            return;
        }
        T t = this.mData;
        if (t != 0) {
            ((DuetAwemeList) t).hasMore = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        long j;
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((DuetAwemeList) this.mData).cursor;
        }
        if (AV1.LJIIJJI()) {
            return;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new C3IP(str, "", j), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        String str;
        o.LJIIIZ(params, "params");
        if (ORY.LJJJJI(4, params) instanceof String) {
            Object LJJJJI = ORY.LJJJJI(4, params);
            o.LJII(LJJJJI, "null cannot be cast to non-null type kotlin.String");
            str = (String) LJJJJI;
        } else {
            str = "";
        }
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        if (AV1.LJIIJJI()) {
            return;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new C3IP(str2, str, 0L), 0);
    }
}

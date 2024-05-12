package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.duetmode.model.DuetDiscoverAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.8El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208038El extends AbstractC51036K1g<Aweme, DuetDiscoverAwemeList> {
    public final ActivityC45651qj LJLIL;
    public final C208048Em LJLILLLLZI = new C8BT() { // from class: X.8Em
        @Override // X.C8BT
        public final void onSuccess() {
            C208038El.this.getClass();
            C208058En.LIZ(1, 0, System.currentTimeMillis() - C208058En.LIZ, "");
        }

        @Override // X.C8BT
        public final void onFailed(Exception exc) {
            String th;
            if (exc != null && (th = exc.toString()) != null) {
                C208038El.this.getClass();
                C208038El.LJIIJ(-1, th);
            }
        }
    };

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        DuetDiscoverAwemeList duetDiscoverAwemeList = (DuetDiscoverAwemeList) this.mData;
        if (duetDiscoverAwemeList != null) {
            return duetDiscoverAwemeList.items;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if (t == 0 || (((DuetDiscoverAwemeList) t).hasMore == 0 && C79004UzY.LJJIFFI(getItems()))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((DuetDiscoverAwemeList) t).hasMore != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8Em] */
    public C208038El(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    public final void LJIIIZ(final long j) {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null && !C48203Ivv.LJ(activityC45651qj)) {
            C40328FsC.LIZLLL(activityC45651qj, R.string.img);
        }
        if (this.mNotifyListeners.contains(this.LJLILLLLZI)) {
            addNotifyListener(this.LJLILLLLZI);
        }
        C208058En.LIZ = System.currentTimeMillis();
        if (AV1.LJIIJJI()) {
            return;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.3IF
            public final /* synthetic */ int LJLILLLLZI = 20;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj;
                long j2 = j;
                long j3 = this.LJLILLLLZI;
                String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
                InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
                if (LJI != null) {
                    obj = LJI.create(com.ss.android.ugc.aweme.duetmode.api.API.class);
                } else {
                    obj = null;
                }
                o.LJI(obj);
                DuetDiscoverAwemeList duetDiscoverAwemeList = ((com.ss.android.ugc.aweme.duetmode.api.API) obj).getDuetDiscoverAwemeList(j2, j3).get();
                o.LJIIIIZZ(duetDiscoverAwemeList, "api.getDuetDiscoverAwemeList(cursor, count).get()");
                return duetDiscoverAwemeList;
            }
        }, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.ss.android.ugc.aweme.duetmode.model.DuetDiscoverAwemeList, com.ss.android.ugc.aweme.base.api.BaseResponse] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        DuetDiscoverAwemeList duetDiscoverAwemeList;
        ?? r8 = (DuetDiscoverAwemeList) obj;
        int i = 0;
        if (r8 == 0) {
            LJIIJ(-1, "ANDROID response itself is null");
            DuetDiscoverAwemeList duetDiscoverAwemeList2 = (DuetDiscoverAwemeList) this.mData;
            if (duetDiscoverAwemeList2 == null) {
                return;
            }
            duetDiscoverAwemeList2.hasMore = 0;
            return;
        }
        if (!r8.items.isEmpty() || r8.hasMore == 1) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (z) {
            DuetDiscoverAwemeList duetDiscoverAwemeList3 = (DuetDiscoverAwemeList) this.mData;
            if (duetDiscoverAwemeList3 != null) {
                duetDiscoverAwemeList3.hasMore = 0;
            }
            int i2 = r8.error_code;
            String str = r8.message;
            if (str == null) {
                str = "";
            }
            LJIIJ(i2, str);
            return;
        }
        r8.items.iterator();
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : r8.items) {
            int i3 = i + 1;
            if (i >= 0) {
                Aweme aweme2 = aweme;
                Aweme R1 = AwemeService.LIZ().R1(aweme2);
                if (R1 != null) {
                    R1.setIsTop(aweme2.getIsTop());
                }
                o.LJI(R1);
                arrayList.add(R1);
                i = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        r8.items.clear();
        r8.items.addAll(arrayList);
        int i4 = this.mListQueryType;
        if (i4 != 1) {
            if (i4 != 4 || (duetDiscoverAwemeList = (DuetDiscoverAwemeList) this.mData) == null) {
                return;
            }
            duetDiscoverAwemeList.items.addAll(r8.items);
            duetDiscoverAwemeList.cursor = r8.cursor;
            duetDiscoverAwemeList.hasMore = r8.hasMore;
            return;
        }
        this.mData = r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        long j;
        o.LJIIIZ(params, "params");
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((DuetDiscoverAwemeList) this.mData).cursor;
        }
        LJIIIZ(j);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIIIZ(0L);
    }

    public static void LJIIJ(int i, String str) {
        C208058En.LIZ(0, i, System.currentTimeMillis() - C208058En.LIZ, str);
    }
}

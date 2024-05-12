package com.ss.android.ugc.aweme.api;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C242549fW;
import X.C25620zW;
import X.C48860JFo;
import X.C58582Rq;
import X.C62822Ol8;
import X.InterfaceC58942NBi;
import X.NBM;
import X.X1D;
import android.content.Context;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class FeedServiceImpl implements IFeedService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C48860JFo.LJLIL);

    public final Map<String, LruCache<String, InterfaceC58942NBi>> LJFF() {
        return (Map) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LIZ(Context context, String str) {
        if (context == null) {
            return;
        }
        LJFF().remove(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releasePanel,panelName = ");
        LIZ.append(str);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LJ(Context context, Aweme aweme, String str) {
        if (aweme == null || str == null) {
            return;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("preload,panelName = ", str, ",aweme = ");
        LIZIZ2.append(aweme.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZIZ2));
        InterfaceC58942NBi LIZJ = LIZJ(context, aweme, str, true);
        if (LIZJ != null) {
            LIZJ.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LIZIZ(int i, ActivityC45651qj activityC45651qj, String str, List list) {
        InterfaceC58942NBi LIZJ;
        if (list == null || activityC45651qj == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkPrerender,panelName = ");
        LIZ.append(str);
        LIZ.append(",index = ");
        LIZ.append(i);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        if (list.isEmpty() || i < 0 || i > list.size() - 1 || ((Aweme) ListProtector.get(list, i)).isAd()) {
            return;
        }
        int i2 = i + 1;
        if (i2 < list.size() && ((Aweme) ListProtector.get(list, i2)).isAd()) {
            return;
        }
        int i3 = i - 1;
        if (i3 >= 0 && ((Aweme) ListProtector.get(list, i3)).isAd()) {
            return;
        }
        int size = list.size();
        for (int i4 = i + 2; i4 < size; i4++) {
            if (((Aweme) ListProtector.get(list, i4)).isAd()) {
                Aweme aweme = (Aweme) ListProtector.get(list, i4);
                if (aweme == null || (LIZJ = LIZJ(activityC45651qj, aweme, str, true)) == null) {
                    return;
                }
                LIZJ.LIZ();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final InterfaceC58942NBi LIZJ(Context context, Aweme aweme, String str, boolean z) {
        InterfaceC58942NBi interfaceC58942NBi;
        if (aweme == null || str == null || context == null) {
            return null;
        }
        if (LJFF().get(str) == null) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("getFeedItemModule create LruCache,panelName = ", str, ",aweme = ");
            LIZIZ2.append(aweme.getAid());
            C242549fW.LIZ(X1D.LIZIZ(LIZIZ2));
            LJFF().put(str, new LruCache<>(5));
        }
        StringBuilder LIZIZ3 = C25620zW.LIZIZ("getFeedItemModule,panelName = ", str, ",aweme = ");
        LIZIZ3.append(aweme.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZIZ3));
        LruCache<String, InterfaceC58942NBi> lruCache = LJFF().get(str);
        if (lruCache == null || (interfaceC58942NBi = lruCache.get(aweme.getAid())) == null) {
            if (!aweme.isAd() || aweme.getAwemeRawAd() == null || !z) {
                return null;
            }
            NBM nbm = new NBM(context, aweme);
            LruCache<String, InterfaceC58942NBi> lruCache2 = LJFF().get(str);
            if (lruCache2 != null) {
                lruCache2.put(aweme.getAid(), nbm);
            }
            StringBuilder LIZIZ4 = C25620zW.LIZIZ("createItemModule,panelName = ", str, ",aweme = ");
            LIZIZ4.append(aweme.getAid());
            C242549fW.LIZ(X1D.LIZIZ(LIZIZ4));
            return nbm;
        }
        return interfaceC58942NBi;
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LIZLLL(int i, Context context, String str, List list) {
        InterfaceC58942NBi LIZJ;
        if (list == null || context == null) {
            return;
        }
        if (!list.isEmpty() && i >= 0 && i <= list.size() - 1 && !((Aweme) ListProtector.get(list, i)).isAd()) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (((Aweme) ListProtector.get(list, i2)).isAd() && i >= i2 + 6) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("remove cache ,cache key = ");
                    LIZ.append(((Aweme) ListProtector.get(list, i2)).getAid());
                    C58582Rq.LIZ(X1D.LIZIZ(LIZ), null);
                    Aweme aweme = (Aweme) ListProtector.get(list, i2);
                    if (aweme != null && (LIZJ = LIZJ(context, aweme, str, true)) != null) {
                        LIZJ.LJIILJJIL();
                    }
                } else {
                    i2++;
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkRenderCacheRelease,panelName = ");
        LIZ2.append(str);
        LIZ2.append(",index = ");
        LIZ2.append(i);
        C242549fW.LIZ(X1D.LIZIZ(LIZ2));
    }
}

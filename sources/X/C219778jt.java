package X;

import Y.ACallableS3S0110100_3;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219778jt extends AbstractC51036K1g<Aweme, AddYoursDetailResp> implements InterfaceC224118qt {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final List<Aweme> LJLJJL;
    public Boolean LJLJJLL;
    public AddYoursPagination LJLJL;
    public int LJLJLJ;
    public AddYoursTopic LJLJLLL;
    public final boolean LJLL;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        Iterable iterable;
        if (o.LJ(this.LJLJJLL, Boolean.FALSE)) {
            iterable = (Iterable) this.LJLJJI.getValue();
        } else {
            iterable = C61878OQg.INSTANCE;
        }
        return ORZ.LLJILJILJ(ORZ.LLIIIZ(iterable, ORZ.LLIIIZ(this.LJLJJL, (Collection) this.LJLJI.getValue())));
    }

    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        return ((ArrayList) this.LJLJJL).isEmpty();
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        Boolean bool = this.LJLJJLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        long j;
        this.LJLJLJ = ((ArrayList) this.LJLJJL).size();
        boolean LJIIIIZZ = C78996UzQ.LJIIIIZZ(this.LJLJJL, aweme, this.mNotifyListeners);
        if (LJIIIIZZ) {
            AddYoursTopic addYoursTopic = this.LJLJLLL;
            Long videoCount = addYoursTopic.getVideoCount();
            if (videoCount != null) {
                j = videoCount.longValue();
            } else {
                j = 1;
            }
            C2U8.LIZ(new C219248j2(AddYoursTopic.copy$default(addYoursTopic, null, null, null, null, null, Long.valueOf(j - 1), null, null, 0, null, 991, null), EnumC219268j4.VIDEO_DELETION));
        }
        return LJIIIIZZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r6 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r6) {
        /*
            r5 = this;
            com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp r6 = (com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp) r6
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "on data come query type: "
            r1.append(r0)
            int r0 = r5.mListQueryType
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "AYDetailListVM"
            X.C221018lt.LIZ(r0, r1)
            int r1 = r5.mListQueryType
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L49
            r0 = 4
            if (r1 == r0) goto L35
            if (r6 == 0) goto L2a
        L24:
            com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination r0 = r6.pagination
            if (r0 == 0) goto L2a
            r5.LJLJL = r0
        L2a:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r5.LJLJLJ = r0
            return
        L35:
            if (r6 == 0) goto L39
            java.lang.Boolean r4 = r6.hasMore
        L39:
            r5.LJLJJLL = r4
            if (r6 == 0) goto L2a
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r6.videos
            if (r1 == 0) goto L24
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
            goto L24
        L49:
            X.Lq0 r2 = X.C55480Lq0.LIZIZ
            r1 = 249372161(0xedd1e01, float:5.45096E-30)
            r0 = 5
            r2.LIZLLL(r1, r0)
            if (r6 == 0) goto L67
            com.ss.android.ugc.aweme.addyours.model.AddYoursTopic r0 = r6.topicInfo
            if (r0 == 0) goto L65
            X.34l r3 = X.C780334l.LJLIL
            X.XIC r2 = X.C78613UtF.LIZ
            X.8j3 r1 = new X.8j3
            r1.<init>(r0, r4)
            r0 = 2
            X.XKX.LIZLLL(r3, r2, r4, r1, r0)
        L65:
            java.lang.Boolean r4 = r6.hasMore
        L67:
            r5.LJLJJLL = r4
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            if (r6 == 0) goto L2a
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r6.videos
            if (r1 == 0) goto L24
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219778jt.handleData(java.lang.Object):void");
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        boolean z;
        o.LJIIIZ(params, "params");
        Long topicId = this.LJLJLLL.getTopicId();
        if (topicId != null) {
            long longValue = topicId.longValue();
            Boolean fromQuestion = this.LJLJLLL.getFromQuestion();
            if (fromQuestion != null) {
                z = fromQuestion.booleanValue();
            } else {
                z = false;
            }
            FGR.LIZIZ().LIZ(this.mHandler, new ACallableS3S0110100_3(longValue, z, this, 0), 0);
        }
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        boolean z;
        o.LJIIIZ(params, "params");
        Long topicId = this.LJLJLLL.getTopicId();
        if (topicId != null) {
            long longValue = topicId.longValue();
            Boolean fromQuestion = this.LJLJLLL.getFromQuestion();
            if (fromQuestion != null) {
                z = fromQuestion.booleanValue();
            } else {
                z = false;
            }
            C55480Lq0.LIZIZ.LIZLLL(249372161, 4);
            FGR.LIZIZ().LIZ(this.mHandler, new ACallableS3S0110100_3(longValue, z, this, 1), 0);
        }
    }

    public C219778jt(AddYoursTopic topic, int i, String str) {
        o.LJIIIZ(topic, "topic");
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = C221118m3.LIZ(C219788ju.LJLIL);
        this.LJLJJI = C221118m3.LIZ(C219798jv.LJLIL);
        this.LJLJJL = new ArrayList();
        this.LJLJL = new AddYoursPagination(0L, 1);
        this.LJLL = this.mListQueryType == 1;
        this.LJLJLLL = topic;
    }
}

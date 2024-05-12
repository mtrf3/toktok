package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.common.repo.SearchContinuousLoadingApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JT1 extends AbstractC49433Jaf<ContinuousLoadingAwemeList> {
    public int LJLILLLLZI;
    public String LJLJJI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(JT0.LJLIL);
    public String LJLJI = CardStruct.IStatusCode.DEFAULT;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(JT2.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C49205JSv.LJLIL);

    @Override // X.AbstractC49433Jaf
    public final AbstractC73672Svk<ContinuousLoadingAwemeList> LJIIJ() {
        return ((SearchContinuousLoadingApi) this.LJLJJL.getValue()).getAwemeList(LJIIL().LIZ, LJIIL().LIZIZ, LJIIL().LIZJ, LJIIL().LIZLLL, LJIIL().LJ, LJIIL().LJFF);
    }

    public final C49183JRz LJIIL() {
        return (C49183JRz) this.LJLJJLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void onModelBound() {
        super.onModelBound();
        String str = this.LJLJJI;
        if (str != null) {
            C49603JdP.LIZLLL(str, this.LJLJI, ((ContinuousLoadingAwemeList) this.mData).awemeList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49433Jaf, X.C8BS
    /* renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public final void handleData(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        long j;
        super.handleData(continuousLoadingAwemeList);
        if (continuousLoadingAwemeList != null) {
            LJIIL().LIZLLL = continuousLoadingAwemeList.cursor;
            C49183JRz LJIIL = LJIIL();
            Aweme aweme = (Aweme) ORZ.LLFII(getItems());
            if (aweme != null) {
                j = aweme.getCreateTime();
            } else {
                j = 0;
            }
            LJIIL.LJFF = j;
            C49369JZd c49369JZd = C49369JZd.LIZ;
            boolean z = true;
            if (this.mListQueryType != 1) {
                z = false;
            }
            List<Aweme> list = continuousLoadingAwemeList.awemeList;
            int i = this.LJLILLLLZI;
            c49369JZd.getClass();
            this.LJLILLLLZI = C49369JZd.LJ(i, z, list);
            List<Aweme> list2 = continuousLoadingAwemeList.awemeList;
            if (list2 != null) {
                for (Aweme aweme2 : list2) {
                    Object value = this.LJLIL.getValue();
                    o.LJIIIIZZ(value, "<get-mAwemeManager>(...)");
                    IAwemeService iAwemeService = (IAwemeService) value;
                    String aid = aweme2.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    Aweme i6 = iAwemeService.i6(aid);
                    if (i6 != null) {
                        aweme2.setUserDigg(i6.getUserDigg());
                        AwemeStatistics statistics = i6.getStatistics();
                        if (statistics != null) {
                            aweme2.getStatistics().setDiggCount(statistics.getDiggCount());
                        }
                    }
                    Object value2 = this.LJLIL.getValue();
                    o.LJIIIIZZ(value2, "<get-mAwemeManager>(...)");
                    ((IAwemeService) value2).R1(aweme2);
                }
            }
        }
        String str = this.LJLJJI;
        if (str != null) {
            C49603JdP.LIZLLL(str, this.LJLJI, ((ContinuousLoadingAwemeList) this.mData).awemeList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        int i;
        this.mData = continuousLoadingAwemeList;
        List<Aweme> list = continuousLoadingAwemeList.awemeList;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
    }
}

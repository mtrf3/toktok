package X;

import Y.ARunnableS23S0300000_12;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Rv5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71083Rv5 {
    public int LIZ = -1;
    public DefaultFeedEcCardBizView LIZIZ;

    public final void LIZIZ(C222588oQ params, Aweme aweme, FeedEcCardData feedEcCardData, C57532Np c57532Np) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        FeedEcCardData feedEcCardData2;
        FeedEcCardConfig cardConfig;
        Integer contentType;
        ActivityC45651qj LJJIFFI;
        Lifecycle lifecycle;
        FeedEcCardConfig cardConfig2;
        o.LJIIIZ(params, "params");
        String str = null;
        if (feedEcCardData != null && (cardConfig2 = feedEcCardData.getCardConfig()) != null) {
            str = cardConfig2.getPriceType();
        }
        C40207FqF.LIZIZ(c57532Np, str, true);
        DefaultFeedEcCardBizView defaultFeedEcCardBizView = this.LIZIZ;
        if (defaultFeedEcCardBizView == null || !defaultFeedEcCardBizView.LJLJJLL) {
            return;
        }
        defaultFeedEcCardBizView.LJLJLJ = true;
        try {
            C71076Ruy c71076Ruy = defaultFeedEcCardBizView.LJLJJI;
            if (c71076Ruy != null && (feedEcCardData2 = c71076Ruy.LIZJ) != null && (cardConfig = feedEcCardData2.getCardConfig()) != null && (contentType = cardConfig.getContentType()) != null && (contentType.intValue() == 1 || contentType.intValue() == 3)) {
                ActivityC45651qj mo49getActivity = defaultFeedEcCardBizView.LJLILLLLZI.mo49getActivity();
                if (mo49getActivity != null && (LJJIFFI = C45804HyK.LJJIFFI(mo49getActivity)) != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
                    lifecycle.addObserver(defaultFeedEcCardBizView);
                }
                C26059AKp.LIZ().LIZJ("ec_sku_panel_close", defaultFeedEcCardBizView);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C71076Ruy c71076Ruy2 = defaultFeedEcCardBizView.LJLJJI;
        if (c71076Ruy2 != null) {
            c71076Ruy2.LJII = SystemClock.elapsedRealtime();
        }
        C71076Ruy c71076Ruy3 = defaultFeedEcCardBizView.LJLJJI;
        if (c71076Ruy3 != null && (copyOnWriteArrayList = c71076Ruy3.LIZIZ) != null && !copyOnWriteArrayList.contains("tiktokec_card_show")) {
            copyOnWriteArrayList.add("tiktokec_card_show");
            try {
                C38995FSd.LIZJ().execute(new ARunnableS23S0300000_12(defaultFeedEcCardBizView, aweme, feedEcCardData, 3));
            } catch (Throwable unused) {
            }
        }
        C38891fp.LJJIIJ(C76800UCe.LIZ, defaultFeedEcCardBizView.LJLJJL);
    }

    public final void LIZ(C222588oQ params, Aweme aweme, FeedEcCardData feedEcCardData, C57532Np c57532Np, int i) {
        DefaultFeedEcCardBizView defaultFeedEcCardBizView;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(aweme, "aweme");
        int i2 = this.LIZ;
        if (i != i2 || this.LIZIZ == null) {
            if (c57532Np == null) {
                defaultFeedEcCardBizView = null;
            } else if (i2 == 1) {
                defaultFeedEcCardBizView = new DefaultFeedEcCardBizView(c57532Np, params.LIZJ);
            } else {
                defaultFeedEcCardBizView = new DefaultFeedEcCardBizView(c57532Np, params.LIZJ);
            }
            this.LIZIZ = defaultFeedEcCardBizView;
            this.LIZ = i;
        }
        DefaultFeedEcCardBizView defaultFeedEcCardBizView2 = this.LIZIZ;
        if (defaultFeedEcCardBizView2 != null) {
            defaultFeedEcCardBizView2.LIZIZ(aweme, feedEcCardData);
        }
    }

    public final void LIZJ(C222588oQ params, Aweme aweme, FeedEcCardData feedEcCardData, C57532Np c57532Np, boolean z) {
        String str;
        FeedEcCardConfig cardConfig;
        o.LJIIIZ(params, "params");
        if (feedEcCardData != null && (cardConfig = feedEcCardData.getCardConfig()) != null) {
            str = cardConfig.getPriceType();
        } else {
            str = null;
        }
        C40207FqF.LIZIZ(c57532Np, str, false);
        DefaultFeedEcCardBizView defaultFeedEcCardBizView = this.LIZIZ;
        if (defaultFeedEcCardBizView != null) {
            defaultFeedEcCardBizView.LIZJ(z, aweme, feedEcCardData);
        }
    }
}

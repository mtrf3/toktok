package Y;

import X.AnonymousClass843;
import X.C10I;
import X.C10K;
import X.C2054084i;
import X.C2055584x;
import X.C76800UCe;
import X.C79004UzY;
import X.HG3;
import X.RBX;
import android.text.Layout;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AgS73S0300000_3 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    /* JADX WARN: Type inference failed for: r0v3, types: [TContinuationResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [TContinuationResult, java.lang.Object] */
    @Override // X.C10I
    public final TContinuationResult then(C10K<C2055584x> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS73S0300000_3 agS73S0300000_3, C10K c10k) {
        String str;
        Aweme aweme;
        if (((C10K) agS73S0300000_3.l0).LJIIJJI() != null) {
            C2055584x c2055584x = (C2055584x) ((C10K) agS73S0300000_3.l0).LJIIJJI();
            String aid = ((Aweme) agS73S0300000_3.l1).getAid();
            VideoItemParams gv0 = ((C2054084i) agS73S0300000_3.l2).LJLILLLLZI.gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(aid, str)) {
                boolean LIZJ = AnonymousClass843.LIZJ((Aweme) agS73S0300000_3.l1);
                C2054084i c2054084i = (C2054084i) agS73S0300000_3.l2;
                c2054084i.LJLLLLLL = c2055584x;
                c2054084i.LJIIIIZZ(c2055584x, (Aweme) agS73S0300000_3.l1, true, LIZJ);
                C2054084i c2054084i2 = (C2054084i) agS73S0300000_3.l2;
                Layout layout = c2054084i2.LLFFF;
                if (layout != null) {
                    c2054084i2.LJLZ.LJI = true;
                    c2054084i2.LJIIJ(layout, c2054084i2.LLFII);
                }
            }
            return C76800UCe.LIZ;
        }
        throw new NullPointerException("result is null");
    }

    public static final Object then$1(AgS73S0300000_3 agS73S0300000_3, C10K c10k) {
        Aweme aweme;
        FullFeedVideoViewHolder fullFeedVideoViewHolder = (FullFeedVideoViewHolder) agS73S0300000_3.l0;
        ISpecialPlusService iSpecialPlusService = (ISpecialPlusService) agS73S0300000_3.l1;
        Aweme aweme2 = (Aweme) agS73S0300000_3.l2;
        fullFeedVideoViewHolder.getClass();
        if (!iSpecialPlusService.shouldShowSpecialPlus()) {
            return "hide";
        }
        if (iSpecialPlusService.isQuickPromoPlusEnabled()) {
            if (FullFeedVideoViewHolder.LLLLILI()) {
            }
            return "normal";
        }
        if (TextUtils.equals(fullFeedVideoViewHolder.getEventType(), "homepage_hot")) {
            if (HG3.LJIILL() != null && (!((RBX) HG3.LJIILL()).isLogin() || ((aweme = fullFeedVideoViewHolder.LJLLL) != null && !TextUtils.equals(aweme.getAuthorUid(), ((RBX) HG3.LJIILL()).getCurUserId())))) {
                List<String> specialPlusEffectList = iSpecialPlusService.getSpecialPlusEffectList();
                String stickerIDs = aweme2.getStickerIDs();
                if (!C79004UzY.LJJIFFI(specialPlusEffectList) && !TextUtils.isEmpty(stickerIDs)) {
                    for (String str : stickerIDs.split(",")) {
                        if (!specialPlusEffectList.contains(str)) {
                        }
                    }
                }
            }
        }
        return "normal";
        return "show";
    }

    public AgS73S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

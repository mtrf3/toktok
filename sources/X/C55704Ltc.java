package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.talent.model.ProfileAdData;
import com.ss.android.ugc.aweme.commercialize.profile.talent.model.ProfileTalentShareAdResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ltc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55704Ltc implements InterfaceC65753PrJ<ProfileTalentShareAdResult> {
    public final /* synthetic */ TalentAdRevenueShareServiceImpl LIZ;
    public final /* synthetic */ InterfaceC55701LtZ LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl = this.LIZ;
        talentAdRevenueShareServiceImpl.LIZJ = this.LIZJ;
        talentAdRevenueShareServiceImpl.LJ = false;
        this.LIZIZ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(ProfileTalentShareAdResult profileTalentShareAdResult) {
        int i;
        Aweme aweme;
        Aweme aweme2;
        AwemeRawAd awemeRawAd;
        ProfileTalentShareAdResult profileTalentShareAdResult2 = profileTalentShareAdResult;
        TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl = this.LIZ;
        talentAdRevenueShareServiceImpl.LJ = false;
        if (profileTalentShareAdResult2 != null) {
            int i2 = this.LIZJ;
            talentAdRevenueShareServiceImpl.LIZJ = i2;
            talentAdRevenueShareServiceImpl.LIZLLL = i2;
            talentAdRevenueShareServiceImpl.LIZIZ = profileTalentShareAdResult2.adGap;
            List<ProfileAdData> list = profileTalentShareAdResult2.profileAds;
            if (list != null) {
                for (ProfileAdData profileAdData : list) {
                    if (profileAdData != null && (aweme2 = profileAdData.aweme) != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
                        talentAdRevenueShareServiceImpl.LIZ.add(awemeRawAd.getCreativeIdStr());
                    }
                }
            }
        }
        C55699LtX c55699LtX = (C55699LtX) this.LIZIZ;
        if (profileTalentShareAdResult2 == null) {
            c55699LtX.getClass();
            return;
        }
        C55693LtR c55693LtR = c55699LtX.LIZ;
        List<ProfileAdData> list2 = profileTalentShareAdResult2.profileAds;
        c55693LtR.getClass();
        if (list2 != null && !list2.isEmpty() && ((FeedItemList) c55693LtR.mData).getItems() != null && !((FeedItemList) c55693LtR.mData).getItems().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < ((FeedItemList) c55693LtR.mData).getItems().size(); i3++) {
                Aweme aweme3 = (Aweme) ListProtector.get(((FeedItemList) c55693LtR.mData).getItems(), i3);
                arrayList.add(aweme3);
                if (aweme3 != null && !list2.isEmpty()) {
                    Iterator<ProfileAdData> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ProfileAdData next = it.next();
                        if (next != null && !TextUtils.isEmpty(next.previousItemId) && next.previousItemId.equals(aweme3.getAid())) {
                            Aweme aweme4 = next.aweme;
                            if (aweme4 != null && ((i = i3 + 1) >= ((FeedItemList) c55693LtR.mData).getItems().size() || (aweme = (Aweme) ListProtector.get(((FeedItemList) c55693LtR.mData).getItems(), i)) == null || !aweme.isAd())) {
                                arrayList.add(AwemeService.LIZ().R1(aweme4));
                            }
                        }
                    }
                }
            }
            ((FeedItemList) c55693LtR.mData).items = arrayList;
        }
        C2U8.LIZ(new C9G7(((FeedItemList) c55699LtX.LIZ.mData).getItems()));
    }

    public C55704Ltc(TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl, C55699LtX c55699LtX, int i) {
        this.LIZ = talentAdRevenueShareServiceImpl;
        this.LIZIZ = c55699LtX;
        this.LIZJ = i;
    }
}

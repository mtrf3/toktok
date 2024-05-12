package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeCollectListFragment;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeCollectListFragmentData;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes8.dex */
public final class HDP implements IChallengeService {
    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Class<? extends Activity> LIZJ() {
        return ChallengeDetailActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final AbstractC186347Ta LIZ(Context context, Boolean bool) {
        final String string = context.getString(R.string.dgm);
        if ("collect_hashtag".equals(string)) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = string.substring(0, 1);
            Locale locale = Locale.ROOT;
            LIZ.append(substring.toUpperCase(locale));
            LIZ.append(string.substring(1).toLowerCase(locale));
            string = X1D.LIZIZ(LIZ);
        }
        final boolean booleanValue = bool.booleanValue();
        return new AbstractC186347Ta(string, booleanValue) { // from class: X.8Zn
            public final java.util.Map<String, Integer> LJLILLLLZI;
            public final FavoriteTabItemV2 LJLJI;

            @Override // X.AbstractC186347Ta
            public final FavoriteTabItemV2 LIZ() {
                return this.LJLJI;
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onChallengeCollect(C213538Zp e) {
                o.LJIIIZ(e, "e");
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
                Integer num = (Integer) linkedHashMap.get(e.LJLIL.getCid());
                if (num != null && num.intValue() == e.LJLIL.getCollectStatus()) {
                    return;
                }
                String cid = e.LJLIL.getCid();
                o.LJIIIIZZ(cid, "e.challenge.cid");
                linkedHashMap.put(cid, Integer.valueOf(e.LJLIL.getCollectStatus()));
                if (e.LJLIL.getCollectStatus() == 1) {
                    LIZLLL(this.LJLIL);
                } else {
                    LIZIZ(this.LJLIL);
                }
            }

            {
                o.LJIIIZ(string, "pageTitle");
                this.LJLILLLLZI = new LinkedHashMap();
                this.LJLJI = new FavoriteTabItemV2(new ChallengeCollectListFragmentData(booleanValue), string, "challenge", "hashtags");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final AbstractC186377Td LJ(Context context, Boolean bool) {
        final String string = context.getString(R.string.dgm);
        if ("collect_hashtag".equals(string)) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = string.substring(0, 1);
            Locale locale = Locale.ROOT;
            LIZ.append(substring.toUpperCase(locale));
            LIZ.append(string.substring(1).toLowerCase(locale));
            string = X1D.LIZIZ(LIZ);
        }
        final boolean booleanValue = bool.booleanValue();
        return new AbstractC186377Td(string, booleanValue) { // from class: X.8Zo
            public final java.util.Map<String, Integer> LJLILLLLZI;
            public final C213218Yj LJLJI;

            @Override // X.AbstractC186377Td
            public final C213218Yj LIZ() {
                return this.LJLJI;
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onChallengeCollect(C213538Zp e) {
                o.LJIIIZ(e, "e");
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
                Integer num = (Integer) linkedHashMap.get(e.LJLIL.getCid());
                if (num != null && num.intValue() == e.LJLIL.getCollectStatus()) {
                    return;
                }
                String cid = e.LJLIL.getCid();
                o.LJIIIIZZ(cid, "e.challenge.cid");
                linkedHashMap.put(cid, Integer.valueOf(e.LJLIL.getCollectStatus()));
                if (e.LJLIL.getCollectStatus() == 1) {
                    LJFF(this.LJLIL);
                } else {
                    LIZIZ(this.LJLIL);
                }
            }

            {
                o.LJIIIZ(string, "pageTitle");
                this.LJLILLLLZI = new LinkedHashMap();
                ChallengeCollectListFragment challengeCollectListFragment = new ChallengeCollectListFragment();
                challengeCollectListFragment.LJLJJL = booleanValue;
                this.LJLJI = new C213218Yj(challengeCollectListFragment, string, "challenge", "hashtags");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Challenge LIZIZ(int i, String str, boolean z) {
        return ChallengeApi.LIZ(i, str, null, false).challenge;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final void LIZLLL(String str, final String str2, String str3, Music music, HWO hwo) {
        C10K<ChallengeDetail> fetchChallengeDetail;
        final boolean z = false;
        if (CommerceChallengeServiceImpl.LIZIZ().LJIILIIL(str2) && !AV1.LJIIJJI()) {
            fetchChallengeDetail = ChallengeApi.LJII.fetchCommerceChallengeDetail(str2, null, 0, 0);
        } else {
            fetchChallengeDetail = ChallengeApi.LJII.fetchChallengeDetail(str2, null, 0, 0);
            z = true;
        }
        fetchChallengeDetail.LJI(new C10I() { // from class: X.HDO
            @Override // X.C10I
            public final Object then(C10K c10k) {
                Challenge challenge;
                boolean z2 = z;
                String str4 = str2;
                if (c10k.LJIIL() || c10k.LJIILJJIL() || c10k.LJIIJJI() == null) {
                    return null;
                }
                if (!z2 || (challenge = ((ChallengeDetail) c10k.LJIIJJI()).challenge) == null || !CommerceChallengeServiceImpl.LIZIZ().LJIJJ(challenge) || AV1.LJIIJJI()) {
                    return c10k;
                }
                CommerceChallengeServiceImpl.LIZIZ().LIZLLL(challenge);
                return ChallengeApi.LJII.fetchCommerceChallengeDetail(str4, str4, 0, 0);
            }
        }, C10K.LJI, null).LJ(new HWN(str, str3, music, hwo), C10K.LJIIIIZZ, null);
    }
}

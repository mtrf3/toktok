package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Oeu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62436Oeu extends ASB {
    public final C62435Oet LJLJJI;
    public final SharePackage LJLJJL;

    @Override // X.ASG
    public final void LIZ(View v) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AdDislikeInfo dislikeInfo;
        AwemeRawAd awemeRawAd2;
        ITalentAdRevenueShareService LJIIJJI;
        o.LJIIIZ(v, "v");
        ShareExtService shareExtService = C4LD.LIZIZ;
        Aweme aweme2 = this.LJLILLLLZI;
        o.LJI(aweme2);
        C62686Oiw LJJLIIIIJ = shareExtService.LJJLIIIIJ(this.LJLJI, aweme2);
        if (LJJLIIIIJ != null) {
            Aweme aweme3 = this.LJLILLLLZI;
            if (aweme3 != null && (awemeRawAd2 = aweme3.getAwemeRawAd()) != null && (LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI()) != null) {
                LJIIJJI.LJFF(awemeRawAd2);
            }
            Aweme aweme4 = this.LJLILLLLZI;
            if (aweme4 != null && aweme4.isAd() && (aweme = this.LJLILLLLZI) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dislikeInfo = awemeRawAd.getDislikeInfo()) != null && dislikeInfo.getEnable() == 1) {
                Activity LIZIZ = C27740Aue.LIZIZ(v);
                o.LJIIIIZZ(LIZIZ, "getActivity(v)");
                C62485Ofh.LIZJ(LIZIZ, this.LJLJJL, LJJLIIIIJ);
            } else {
                C62485Ofh.LIZJ(EF7.LIZIZ(), this.LJLJJL, LJJLIIIIJ);
            }
            if (TextUtils.equals(this.LJLJI, "homepage_hot") || TextUtils.equals(this.LJLJI, "graphic_detail") || TextUtils.equals(this.LJLJJI.LJLJJI, "graphic_detail")) {
                boolean LIZLLL = C61780OMm.LIZLLL();
                boolean z = !OMU.LIZ.isEmpty();
                if (LIZLLL || z) {
                    C2U8.LIZ(new IEvent() { // from class: X.2KI
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C2U8.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C2U8.LIZIZ(this);
                            return this;
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62436Oeu(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
        this.LJLJJL = actionsManager.LJLJLJ;
    }
}

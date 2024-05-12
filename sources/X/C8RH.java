package X;

import Y.ACListenerS0S4300000_3;
import Y.AfS55S0100000_3;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8RH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RH implements C8RJ, InterfaceC72822Si2 {
    public String LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public AqS153S0100000_3 LJLJJL;
    public WeakReference<Activity> LJLJL;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C199587sQ.LJLIL);
    public final AqS153S0100000_3 LJLJLJ = new AqS153S0100000_3(this, 1713);

    @Override // X.C8RJ
    public final int status() {
        return this.LJLILLLLZI;
    }

    @Override // X.C8RJ
    public final void LIZIZ(C162136Xx c162136Xx) {
        this.LJLJJI = c162136Xx;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Activity activity;
        if (o.LJ(c199097rd.LJLIL, "closeReviewSubmitPage")) {
            String str = this.LJLIL;
            if (str == null) {
                str = "";
            }
            C8RJ.LJJJLL.getClass();
            C8RI.LIZIZ.remove(str);
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            boolean z = false;
            if (interfaceC78280Uns != null) {
                z = u.LJJIIZI(interfaceC78280Uns, "isSubmitReviewSuccess", false);
            }
            C72818Shy.LJII("closeReviewSubmitPage", this);
            if (z) {
                WeakReference<Activity> weakReference = this.LJLJL;
                if (weakReference != null && (activity = weakReference.get()) != null) {
                    C26048AKe c26048AKe = new C26048AKe(activity);
                    c26048AKe.LJI(C86V.LJFF(R.string.ruq));
                    c26048AKe.LIZJ(R.raw.icon_tick_fill);
                    c26048AKe.LJ(R.attr.dj);
                    c26048AKe.LIZ(this.LJLJLJ);
                    c26048AKe.LJII();
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                this.LJLILLLLZI = 5;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                this.LJLJJI = null;
                return;
            }
            this.LJLILLLLZI = 5;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJJI;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
            this.LJLJJI = null;
        }
    }

    @Override // X.C8RJ
    public final void LIZ(final ActivityC45651qj activity, final PoiData poiData) {
        PoiReviewFrequencyControl.FriendPage friendPage;
        PoiReviewFrequencyControl.Frequency frequency;
        o.LJIIIZ(activity, "activity");
        InterfaceC54049LJd LJIJ = NearbyFeedServiceImpl.LJJI().LJIJ();
        if (LJIJ != null && LJIJ.LIZ()) {
            return;
        }
        if (poiData == null) {
            this.LJLILLLLZI = 2;
            return;
        }
        final String poiId = poiData.getPoiId();
        if (poiId == null) {
            return;
        }
        this.LJLIL = poiId;
        this.LJLILLLLZI = 1;
        PoiReviewFrequencyControl.LIZ.getClass();
        PoiReviewFrequencyControl.InnerConfig LIZ = PoiReviewFrequencyControl.LIZ();
        if (LIZ != null && (friendPage = LIZ.friendPage) != null && (frequency = friendPage.poi) != null) {
            int i = frequency.frequencyDay;
            int i2 = frequency.frequencyTimes;
            String LIZIZ = PoiReviewFrequencyControl.LIZIZ("ts_poi_write_review_toast", poiId);
            Keva keva = PoiReviewFrequencyControl.LIZIZ;
            if (System.currentTimeMillis() - keva.getLong(LIZIZ, 0L) <= i * 24 * 60 * 60 * 1000 && keva.getInt(PoiReviewFrequencyControl.LIZIZ("count_poi_write_review_toast", poiId), 0) >= i2) {
                this.LJLILLLLZI = 2;
                return;
            }
        }
        PoiReviewsApi.LIZ.getClass();
        C78540Us4.LJJIIZ(C199057rZ.LIZ().isReviewEligible(poiId, EnumC199047rY.FRIEND_PAGE.getValue())).LJJJLIIL(new InterfaceC64592gB() { // from class: X.8RG
            public final /* synthetic */ String LJLJJL = "homepage_friends";

            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                PoiReviewFrequencyControl.FriendPage friendPage2;
                PoiReviewFrequencyControl.Frequency frequency2;
                PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewsApi.PoiReviewEligibleResponse) obj;
                if (poiReviewEligibleResponse == null || poiReviewEligibleResponse.status_code != 0 || o.LJ(poiReviewEligibleResponse.eligible, Boolean.FALSE)) {
                    C8RH.this.LJLILLLLZI = 2;
                    return;
                }
                PoiReviewFrequencyControl poiReviewFrequencyControl = PoiReviewFrequencyControl.LIZ;
                String poiId2 = poiId;
                poiReviewFrequencyControl.getClass();
                o.LJIIIZ(poiId2, "poiId");
                PoiReviewFrequencyControl.InnerConfig LIZ2 = PoiReviewFrequencyControl.LIZ();
                if (LIZ2 != null && (friendPage2 = LIZ2.friendPage) != null && (frequency2 = friendPage2.poi) != null) {
                    int i3 = frequency2.frequencyDay;
                    int i4 = frequency2.frequencyTimes;
                    String LIZIZ2 = PoiReviewFrequencyControl.LIZIZ("ts_poi_write_review_toast", poiId2);
                    Keva keva2 = PoiReviewFrequencyControl.LIZIZ;
                    if (System.currentTimeMillis() - keva2.getLong(LIZIZ2, 0L) > i3 * 24 * 60 * 60 * 1000) {
                        keva2.storeInt(PoiReviewFrequencyControl.LIZIZ("count_poi_write_review_toast", poiId2), 1);
                        keva2.storeLong(PoiReviewFrequencyControl.LIZIZ("ts_poi_write_review_toast", poiId2), System.currentTimeMillis());
                    } else if (keva2.getInt(PoiReviewFrequencyControl.LIZIZ("count_poi_write_review_toast", poiId2), 0) < i4) {
                        String LIZIZ3 = PoiReviewFrequencyControl.LIZIZ("count_poi_write_review_toast", poiId2);
                        C19N.LIZJ(keva2, LIZIZ3, 0, 1, LIZIZ3);
                    }
                }
                C8RH c8rh = C8RH.this;
                Activity activity2 = activity;
                String str = poiId;
                String name = poiData.getName();
                String str2 = poiReviewEligibleResponse.collectInfo;
                String str3 = this.LJLJJL;
                c8rh.getClass();
                c8rh.LJLJL = new WeakReference<>(activity2);
                c8rh.LJLJI = false;
                AKT akt = new AKT(activity2);
                c8rh.LJLJJL = new AqS153S0100000_3(c8rh, 1714);
                c8rh.LJLILLLLZI = 3;
                akt.LJ(R.style.ux);
                akt.LIZ.LJLILLLLZI = 4;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_map_pin_fill;
                c2068389v.LJ = Integer.valueOf(R.attr.e8);
                akt.LJIIIIZZ(c2068389v);
                akt.LJI(C86V.LJFF(R.string.p1q));
                akt.LIZ.LJLJJI = 0;
                akt.LIZ.LJLJL = C7MY.LIZIZ(61);
                akt.LIZJ(5000L);
                AqS153S0100000_3 aqS153S0100000_3 = c8rh.LJLJJL;
                if (aqS153S0100000_3 != null) {
                    akt.LIZIZ(aqS153S0100000_3);
                }
                akt.LIZ.LJLJLJ = new ACListenerS0S4300000_3(c8rh, activity2, akt, str, name, str3, str2, 1);
                akt.LJII();
                C198847rE.LIZJ(str3, "poi_review_toast", str, str2);
            }
        }, new AfS55S0100000_3(this, 74));
    }
}

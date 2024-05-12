package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NWD implements NMY {
    public final /* synthetic */ NWF LIZ;

    @Override // X.NMY
    public final void LIZ() {
        String str;
        String str2;
        int i;
        EnumC60794NtW enumC60794NtW;
        AbstractC37353ElJ abstractC37353ElJ;
        AbstractC37353ElJ abstractC37353ElJ2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        NOJ noj = this.LIZ.LJLLL;
        String str3 = null;
        if (noj != null && (awemeRawAd2 = noj.LIZIZ) != null) {
            str = awemeRawAd2.getCreativeIdStr();
        } else {
            str = null;
        }
        NOJ noj2 = this.LIZ.LJLLL;
        if (noj2 != null && (awemeRawAd = noj2.LIZIZ) != null) {
            str2 = awemeRawAd.getLogExtra();
        } else {
            str2 = null;
        }
        C59222NMc adWebModel = ((NWI) this.LIZ.LIZ(R.id.uv)).getAdWebModel();
        if (adWebModel != null) {
            str3 = adWebModel.LJIILL;
        }
        C59222NMc adWebModel2 = ((NWI) this.LIZ.LIZ(R.id.uv)).getAdWebModel();
        if (adWebModel2 != null) {
            i = adWebModel2.LJIILLIIL;
        } else {
            i = 1;
        }
        NWB.LIZ(i, str, str2, str3);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView = ((NWI) this.LIZ.LIZ(R.id.uv)).getSparkView();
        if (sparkView == null || (enumC60794NtW = sparkView.LJZI) == null) {
            enumC60794NtW = EnumC60794NtW.INIT;
        }
        if (enumC60794NtW.ordinal() >= EnumC60794NtW.SUCCESS.ordinal()) {
            AdSparkContext sparkContext = ((NWI) this.LIZ.LIZ(R.id.uv)).getSparkContext();
            if (sparkContext != null && (abstractC37353ElJ2 = (AbstractC37353ElJ) sparkContext.LIZIZ(AbstractC37353ElJ.class)) != null) {
                NWF nwf = this.LIZ;
                ShareH5Service.LIZ.getClass();
                C58149Mrx.LIZ().LIZ(abstractC37353ElJ2, ((NWI) nwf.LIZ(R.id.uv)).getWebView());
                return;
            }
            return;
        }
        AdSparkContext sparkContext2 = ((NWI) this.LIZ.LIZ(R.id.uv)).getSparkContext();
        if (sparkContext2 == null || (abstractC37353ElJ = (AbstractC37353ElJ) sparkContext2.LIZIZ(AbstractC37353ElJ.class)) == null) {
            return;
        }
        ShareH5Service.LIZ.getClass();
        C58149Mrx.LIZ().LJIIIIZZ(abstractC37353ElJ);
    }

    @Override // X.NMY
    public final void LIZIZ() {
        if (this.LIZ.LIZIZ(true)) {
            return;
        }
        this.LIZ.getClass();
        this.LIZ.LIZLLL(false);
        NWE titleBarCallback = this.LIZ.getTitleBarCallback();
        if (titleBarCallback != null) {
            titleBarCallback.LIZ();
        }
    }

    public NWD(NWF nwf) {
        this.LIZ = nwf;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAbModel;

/* renamed from: X.YHg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87124YHg extends AbstractC65781Prl implements InterfaceC65784Pro<AdPitayaReRankClientAbModel> {
    public static final C87124YHg LJLIL = new C87124YHg();

    public C87124YHg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAbModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AdPitayaReRankClientAbModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AdPitayaReRankClientAbModel adPitayaReRankClientAbModel = C87121YHd.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("feed_ad_pitaya_re_rank_client", AdPitayaReRankClientAbModel.class, adPitayaReRankClientAbModel);
        if (LJIIIIZZ == 0) {
            return adPitayaReRankClientAbModel;
        }
        return LJIIIIZZ;
    }
}

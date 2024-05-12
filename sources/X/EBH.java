package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagEntranceOptExperiment;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagUIExperiment;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiReTagBottomBarAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EBH implements View.OnClickListener {
    public final /* synthetic */ PoiReTagBottomBarAssem LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    public EBH(PoiReTagBottomBarAssem poiReTagBottomBarAssem, String str, Aweme aweme) {
        this.LJLIL = poiReTagBottomBarAssem;
        this.LJLILLLLZI = str;
        this.LJLJI = aweme;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        if (PoiReTagEntranceOptExperiment.LIZIZ()) {
            if (PoiReTagEntranceOptExperiment.LIZIZ()) {
                EBF.LIZIZ().storeInt(EBF.LJ("key_poi_re_tag_entrance_close_time"), EBF.LIZIZ().getInt(EBF.LJ("key_poi_re_tag_entrance_close_time"), 0) + 1);
            }
        } else {
            java.util.Map LIZLLL = EBF.LIZLLL();
            int LIZJ = EBF.LIZJ();
            PoiReTagUIExperiment.PoiReTagConfig poiReTagConfig = (PoiReTagUIExperiment.PoiReTagConfig) PoiReTagUIExperiment.LIZIZ.getValue();
            if (poiReTagConfig != null) {
                i = poiReTagConfig.closeMaxTimes;
            } else {
                i = 2;
            }
            if (LIZJ < i) {
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService().curUserId");
                LIZLLL.put(curUserId, Integer.valueOf(LIZJ + 1));
                EBF.LIZIZ().storeString("key_poi_re_tag_show_entrance_count", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LIZLLL));
            }
        }
        ViewGroup viewGroup = this.LJLIL.LLFII;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        C2PD.LIZ(Integer.valueOf(this.LJLJI.getAwemeType()), this.LJLILLLLZI, this.LJLJI.getAuthorUid(), this.LJLJI.getGroupId(), false);
    }
}

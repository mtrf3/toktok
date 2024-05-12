package com.ss.android.ugc.aweme.ad.feed.ad4ad;

import X.C16880lQ;
import X.C2055284u;
import X.C59111NHv;
import X.FMX;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Ad4adBottomBarAssem extends BaseCellSlotComponent<Ad4adBottomBarAssem> {
    public ViewGroup LLFII;
    public Ad4adModel LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.a_s;
    }

    public Ad4adBottomBarAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        boolean z;
        String str;
        Ad4adModel LIZJ;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFZ = C59111NHv.LIZJ(item.getAweme());
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        Aweme aweme2 = item.getAweme();
        o.LJIIIIZZ(aweme2, "item.aweme");
        if (C59111NHv.LIZLLL(aweme2) && (LIZJ = C59111NHv.LIZJ(aweme2)) != null && LIZJ.getWhyThisAd() != null) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup viewGroup = this.LLFII;
        if (viewGroup != null) {
            if (z) {
                TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.pt);
                if (tuxTextView != null) {
                    C2055284u.LIZJ(tuxTextView, null);
                    Ad4adModel ad4adModel = this.LLFZ;
                    if (ad4adModel != null) {
                        str = ad4adModel.getWhyThisAd();
                    } else {
                        str = null;
                    }
                    tuxTextView.setText(str);
                    viewGroup.setVisibility(0);
                    C16880lQ.LJIIL(viewGroup, null);
                    FMX.LJIILJJIL("ad4ad_disclaimer_show", C59111NHv.LIZ(aweme));
                    return;
                }
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ViewGroup) view.findViewById(R.id.ps);
    }
}

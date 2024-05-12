package com.ss.android.ugc.aweme.commercialize.feed.assem;

import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C227858wv;
import X.C59408NTg;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8VR;
import X.C8YN;
import X.NXL;
import X.NXN;
import X.NXO;
import X.NXT;
import X.NXU;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.assem.AdAssemUtils;
import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdBesideSponsorLabelTagAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdvertiserFollowerCountLabelAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FeedCommerceAssem extends CommerceContentBaseAssem<FeedCommerceAssem> {
    public final C62822Ol8 LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public Aweme LLFF;

    public FeedCommerceAssem() {
        new LinkedHashMap();
        this.LJZL = C221108m2.LIZIZ(C59408NTg.LJLIL);
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdViewModel.class), NXT.INSTANCE);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdEventViewModel.class), NXU.INSTANCE);
        this.LLF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C227858wv.INSTANCE);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        IAdAssemUtils LIZIZ;
        C65776Prg LIZ;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme2 = item.getAweme();
        this.LLFF = aweme2;
        if (aweme2 != null && C63081OpJ.LJLLI(aweme2)) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(AdInteractiveAssem.class));
        }
        Aweme aweme3 = this.LLFF;
        if (aweme3 != null && C63081OpJ.LL(aweme3)) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(AdPlayFunAssem.class));
        }
        if (C63081OpJ.LJJZ(this.LLFF)) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(AdBesideSponsorLabelTagAssem.class));
        }
        Aweme aweme4 = item.getAweme();
        if (aweme4 != null && aweme4.isAd() && (aweme = item.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getFollowerLabel() != null) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(AdvertiserFollowerCountLabelAssem.class));
        }
        if (C63081OpJ.LJJLIIIJL(this.LLFF) && (LIZIZ = AdAssemUtils.LIZIZ()) != null && (LIZ = LIZIZ.LIZ()) != null) {
            C8VR.LIZJ(this, LIZ);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS176S0100000_10(this, 32));
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.NXV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2309894s) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), NXL.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.NXi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), NXO.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.JBK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLLILLLL;
            }
        }, C213688a4.LIZLLL(), NXN.LJLIL, 4);
    }
}

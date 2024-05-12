package com.ss.android.ugc.aweme.feed.assem.earlyfeedback;

import X.C214348b8;
import X.C47261Igj;
import X.C59908NfE;
import X.C59909NfF;
import X.C59911NfH;
import X.C59912NfI;
import X.C59915NfL;
import X.C59916NfM;
import X.C5H3;
import X.C65352Pkq;
import X.C8YN;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS17S2100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class EarlyFeedbackBannerAssem extends InteractBottomBannerAssem<EarlyFeedbackBannerAssem> {
    public final String LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;

    public EarlyFeedbackBannerAssem() {
        new LinkedHashMap();
        this.LLII = "bottom_banner_early_feedback";
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C59911NfH.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(EarlyFeedbackVM.class), C59912NfI.INSTANCE);
    }

    public final EarlyFeedbackVM I4() {
        return (EarlyFeedbackVM) this.LLIIIILZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String r4() {
        return this.LLII;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void F4(VideoItemParams item) {
        String str;
        o.LJIIIZ(item, "item");
        super.F4(item);
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.a20)) == null) {
            str = "Do you like this video?";
        }
        G4(C47261Igj.LJJIJ(new FeedBottomBannerUIProps.Title(str)));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.NfK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C59915NfL.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.NfG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C59916NfM.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.NdM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJL;
            }
        }, null, C59909NfF.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.NdN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, C59908NfE.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig B4(Context context, FeedBottomBannerConfig.Builder bottomBannerBuilder) {
        String str;
        String str2;
        o.LJIIIZ(bottomBannerBuilder, "bottomBannerBuilder");
        bottomBannerBuilder.setIconWithLocalRes(R.raw.icon_script_fill);
        bottomBannerBuilder.setUpdateTitleSync(true);
        Context context2 = getContext();
        if (context2 == null || (str = context2.getString(R.string.a1z)) == null) {
            str = "Yes";
        }
        Context context3 = getContext();
        if (context3 == null || (str2 = context3.getString(R.string.a1x)) == null) {
            str2 = "No";
        }
        bottomBannerBuilder.setInteractionWithButton(new AqS17S2100000_10(str, str2, this, 0));
        return bottomBannerBuilder.build();
    }
}

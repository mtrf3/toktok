package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C16880lQ;
import X.C2055284u;
import X.C47261Igj;
import X.C51392KEy;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C63081OpJ;
import X.C76800UCe;
import X.EnumC51280KAq;
import X.EnumC51287KAx;
import X.EnumC51288KAy;
import X.EnumC51289KAz;
import X.InterfaceC88472Yns;
import X.KAK;
import X.KB5;
import X.KB7;
import X.KF0;
import X.KF2;
import X.KFD;
import X.KFE;
import X.M2T;
import Y.ACListenerS34S0300000_8;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSuggestWordStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EcWordStruct;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeedEcSearchBottomBarAssem extends BaseCellSlotComponent<FeedEcSearchBottomBarAssem> implements KFE {
    public ConstraintLayout LLFII;
    public final FeedEcSearchBottomBarAssem$descExpandModeProtocol$1 LLFZ;

    @Override // X.InterfaceC70514Rlu
    public final void LLFFF(AqS178S0100000_12 aqS178S0100000_12) {
    }

    @Override // X.InterfaceC70514Rlu
    public final void W0() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aao;
    }

    @Override // X.InterfaceC70514Rlu
    public final void Y0() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssem$descExpandModeProtocol$1] */
    public FeedEcSearchBottomBarAssem() {
        new LinkedHashMap();
        this.LLFZ = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                FeedEcSearchBottomBarAssem.this.Y3().setVisibility(0);
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLFZ));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        List<EcSuggestWordStruct> suggestWords;
        String str;
        EcWordStruct ecWordStruct;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        KFD LIZIZ = C51392KEy.LIZIZ(item);
        boolean LIZ = C51392KEy.LIZ(item, LIZIZ);
        ConstraintLayout constraintLayout = this.LLFII;
        if (constraintLayout != null) {
            if (LIZ) {
                constraintLayout.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) constraintLayout.findViewById(R.id.d7a);
                if (tuxTextView != null) {
                    EcFeedSuggestWordList ecFeedSuggestWordList = item.getAweme().getEcFeedSuggestWordList();
                    if (ecFeedSuggestWordList != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
                        for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                            if (ecSuggestWordStruct != null && o.LJ(ecSuggestWordStruct.getScene(), "feed_bar")) {
                                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) ecSuggestWordStruct.getHintText());
                                List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                                if (words != null && (ecWordStruct = (EcWordStruct) ListProtector.get(words, 0)) != null) {
                                    str = ecWordStruct.getWord();
                                } else {
                                    str = null;
                                }
                                tuxTextView.setText(append.append((CharSequence) String.valueOf(str)));
                            }
                        }
                    }
                    C2055284u.LIZJ(tuxTextView, null);
                }
                C16880lQ.LJIL(constraintLayout, new ACListenerS34S0300000_8(LIZIZ, item, this, 14));
                return;
            }
            constraintLayout.setVisibility(8);
        }
    }

    @Override // X.InterfaceC70514Rlu
    public final void LLZZZZ(KF0 hintWordModel) {
        o.LJIIIZ(hintWordModel, "hintWordModel");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ConstraintLayout) view.findViewById(R.id.d79);
    }

    @Override // X.InterfaceC70514Rlu
    public final boolean LLLFF(KF2 kf2, InterfaceC88472Yns<? super Boolean, C76800UCe> callbackInUIThread) {
        o.LJIIIZ(callbackInUIThread, "callbackInUIThread");
        return false;
    }

    public final void q4(VideoItemParams videoItemParams, KFD kfd) {
        Context context;
        ConstraintLayout constraintLayout = this.LLFII;
        if (constraintLayout != null) {
            context = constraintLayout.getContext();
        } else {
            context = null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//search");
        buildRoute.withParam("in_single_stack", true);
        buildRoute.withParam("keyword", kfd.LIZ);
        buildRoute.withParam("group_id", videoItemParams.getAweme().getGroupId());
        buildRoute.withParam("back_flag", 1);
        buildRoute.withParam("enter_from", videoItemParams.mEventType);
        buildRoute.withParam("enter_method", "related_search_anchor_v2");
        KAK kak = KAK.SHOP;
        buildRoute.withParam("target_tab", kak.getTabName());
        EnumC51280KAq enumC51280KAq = EnumC51280KAq.FEED_BOTTOM_BAR;
        buildRoute.withParam("root_enter_from_type", enumC51280KAq.getValue());
        buildRoute.withParam("set_hint_by_sug_word", false);
        buildRoute.withParam("single_tab_type", kak.getTabName());
        buildRoute.withParam("search_hint_word", kfd.LIZ);
        buildRoute.withParam("traffic_source_list", M2T.LJIIIIZZ(videoItemParams.getAweme()));
        if (C63081OpJ.LJJIJL().LJJIJLIJ(enumC51280KAq)) {
            int value = enumC51280KAq.getValue();
            String value2 = KB5.SOURCE_FEED_BOTTOM_BAR_MIDDLE.getValue();
            buildRoute.withParam("ec_entrance_data", new ECSearchEntranceData(value, null, null, null, null, null, null, EnumC51289KAz.SOURCE_FEED_BOTTOM_BAR.getValue(), value2, null, null, null, null, false, null, null, EnumC51288KAy.SOURCE_FEED_BOTTOM_BAR.getValue(), KB7.CHANNEL_FEED_BOTTOM_BAR.getValue(), null, EnumC51287KAx.TYPE_FEED_BOTTOM_BAR.getValue(), null, null, null, null, null, null, null, 0L, 267714174, null));
        }
        buildRoute.open();
    }
}

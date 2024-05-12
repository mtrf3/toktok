package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C16880lQ;
import X.C211138Qj;
import X.C214348b8;
import X.C241249dQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78605Ut7;
import X.C78685UuP;
import X.C79045V0n;
import X.C8QU;
import X.C8QV;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.view.View;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedSocialRelationTagAssem extends BaseCellSlotComponent<FeedSocialRelationTagAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLFII;
    public TuxTag LLFZ;

    static {
        TBT tbt = new TBT(FeedSocialRelationTagAssem.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aep;
    }

    public FeedSocialRelationTagAssem() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSocialTagViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1303), null, C8QU.INSTANCE, null, null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        List<AwemeHybridLabelModel> hybridLabels;
        Integer LJI;
        Integer LJI2;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme == null || (hybridLabels = aweme.getHybridLabels()) == null || hybridLabels.size() <= 0) {
            return;
        }
        Context context = getContext();
        if (context != null && (LJI2 = C79045V0n.LJI(R.attr.cl, context)) != null) {
            Y3().setBackgroundColor(LJI2.intValue());
        }
        getContainerView().setVisibility(0);
        Y3().setVisibility(0);
        AwemeHybridLabelModel label = (AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), 0);
        TuxTag tuxTag = this.LLFZ;
        String str = null;
        if (tuxTag != null) {
            o.LJIIIIZZ(label, "label");
            C211138Qj.LIZ(tuxTag, aweme, label);
            Context context2 = getContext();
            if (context2 != null && (LJI = C79045V0n.LJI(R.attr.go, C78605Ut7.LJIIIIZZ(context2))) != null) {
                int intValue = LJI.intValue();
                TuxTag tuxTag2 = this.LLFZ;
                if (tuxTag2 != null) {
                    tuxTag2.setTagTextColor(intValue);
                } else {
                    o.LJIJI("relationTag");
                    throw null;
                }
            }
            View Y3 = Y3();
            Object obj = ListProtector.get(aweme.getHybridLabels(), 0);
            o.LJIIIIZZ(obj, "aweme.hybridLabels[0]");
            AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) obj;
            if (C78685UuP.LJJJZ(awemeHybridLabelModel.getRefUrl())) {
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(awemeHybridLabelModel, 6), Y3);
            }
            View Y32 = Y3();
            VideoItemParams videoItemParams2 = (VideoItemParams) ((AssemViewModelWithItem) this.LLFII.LIZ(this, LLI[0])).gv0();
            if (videoItemParams2 != null) {
                str = videoItemParams2.mEventType;
            }
            C8QV.LIZ(Y32, aweme, str);
            return;
        }
        o.LJIJI("relationTag");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.m_d);
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxTag?>(R.id.tv_label)");
        this.LLFZ = (TuxTag) findViewById;
    }
}

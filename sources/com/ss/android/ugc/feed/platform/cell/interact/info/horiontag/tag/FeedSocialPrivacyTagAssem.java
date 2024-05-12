package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C211138Qj;
import X.C214348b8;
import X.C241249dQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8QR;
import X.C8QS;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
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
public final class FeedSocialPrivacyTagAssem extends BaseCellSlotComponent<FeedSocialPrivacyTagAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLFII;
    public TuxTag LLFZ;

    static {
        TBT tbt = new TBT(FeedSocialPrivacyTagAssem.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aen;
    }

    public FeedSocialPrivacyTagAssem() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSocialTagViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1301), null, C8QS.INSTANCE, null, null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        List<AwemeHybridLabelModel> hybridLabels;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme == null || (hybridLabels = aweme.getHybridLabels()) == null || hybridLabels.size() <= 0) {
            return;
        }
        getContainerView().setVisibility(0);
        Y3().setVisibility(0);
        AwemeHybridLabelModel label = (AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), 0);
        TuxTag tuxTag = this.LLFZ;
        if (tuxTag != null) {
            o.LJIIIIZZ(label, "label");
            C211138Qj.LIZ(tuxTag, aweme, label);
        } else {
            o.LJIJI("privacyTag");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.m_d);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_label)");
        this.LLFZ = (TuxTag) findViewById;
        C8YN.LJII(this, (AssemViewModel) this.LLFII.LIZ(this, LLI[0]), new TBT() { // from class: X.8QF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8Q0) obj).LJLILLLLZI;
            }
        }, null, C8QR.LJLIL, 6);
    }
}

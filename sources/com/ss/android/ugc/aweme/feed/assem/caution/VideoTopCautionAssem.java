package com.ss.android.ugc.aweme.feed.assem.caution;

import X.C16880lQ;
import X.C212118Ud;
import X.C214348b8;
import X.C240999d1;
import X.C36922EeM;
import X.C5H3;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72083SQt;
import X.C8UT;
import X.C8UU;
import X.C8UV;
import X.C8UW;
import X.C8UX;
import X.C8UY;
import X.C8UZ;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoTopCautionAssem extends FeedBaseAssem<VideoTopCautionAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;

    static {
        TBT tbt = new TBT(VideoTopCautionAssem.class, "topCautionVM", "getTopCautionVM()Lcom/ss/android/ugc/aweme/feed/assem/caution/VideoTopCautionVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, p4(), new TBT() { // from class: X.8Ue
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C212138Uf) obj).LJLIL);
            }
        }, null, C8UZ.LJLIL, 6);
        C8YN.LJII(this, p4(), new TBT() { // from class: X.8Ug
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212138Uf) obj).LJLILLLLZI;
            }
        }, null, C8UY.LJLIL, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.af4;
    }

    public VideoTopCautionAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTopCautionVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 300), null, C212118Ud.INSTANCE, null, null);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8UT.INSTANCE);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C8UU.INSTANCE);
    }

    public final VideoTopCautionVM p4() {
        return (VideoTopCautionVM) this.LLFFF.LIZ(this, LLI[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        super.E3();
        C36922EeM.LIZLLL(2, "VideoTopCautionAssem", "onInActive");
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return c2(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C72083SQt.LJLIIL(item.getAweme());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        ViewGroup.LayoutParams layoutParams2 = Y3().getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            int i = layoutParams.leftMargin;
            int i2 = layoutParams.topMargin;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            layoutParams.setMargins(i, i2 - C63081OpJ.LJJJJLI(context), layoutParams.rightMargin, layoutParams.bottomMargin);
        }
        TuxIconView tuxIconView = (TuxIconView) Y3().findViewById(R.id.b71);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 61));
        }
        Y3().setVisibility(8);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8Ua
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLILLLLZI;
            }
        }, null, C8UW.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8Ub
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, C8UX.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8Uc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLL;
            }
        }, null, C8UV.LJLIL, 6);
    }
}

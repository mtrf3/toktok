package com.ss.android.ugc.aweme.feed.assem.review;

import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C27740Aue;
import X.C44197HWf;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C86586XyY;
import X.C86587XyZ;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VideoReviewStatusBarAssem extends BaseCellSlotComponent<VideoReviewStatusBarAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;

    static {
        TBT tbt = new TBT(VideoReviewStatusBarAssem.class, "videoReviewStatusVM", "getVideoReviewStatusVM()Lcom/ss/android/ugc/aweme/feed/assem/review/VideoReviewStatusVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.af7;
    }

    public VideoReviewStatusBarAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoReviewStatusVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c240999d1, new AqS165S0100000_15(LIZ, 371), null, C86587XyZ.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C86586XyY.INSTANCE);
        this.LLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 370));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 369));
        this.LLII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 372));
        this.LLIIII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 368));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 367));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJIILLIIL(this, (AssemViewModel) this.LLFII.LIZ(this, LLIIIJ[0]), null, C44197HWf.INSTANCE, 3);
    }

    public final TuxIconView q4() {
        Object value = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value, "<get-iconCircle>(...)");
        return (TuxIconView) value;
    }

    public final TuxIconView r4() {
        Object value = this.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-mArrow>(...)");
        return (TuxIconView) value;
    }

    public final View u4() {
        return (View) this.LLI.getValue();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C27740Aue.LJIIIZ(8, u4());
    }
}

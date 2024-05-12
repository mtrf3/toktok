package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C16880lQ;
import X.C2055284u;
import X.C214348b8;
import X.C42200GhI;
import X.C5H3;
import X.C65352Pkq;
import X.C86574XyM;
import X.C86575XyN;
import X.C8YN;
import X.Q8U;
import X.TBT;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS36S0200000_1;
import Y.ARunnableS0S2300000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ReplaceMusicBottomBarAssem extends BaseCellSlotComponent<ReplaceMusicBottomBarAssem> {
    public ViewGroup LLFII;
    public TuxTextView LLFZ;
    public FrameLayout LLI;
    public VideoItemParams LLIFFJFJJ;
    public final C5H3 LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final AqS165S0100000_15 LLIIIJ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aea;
    }

    public ReplaceMusicBottomBarAssem() {
        new LinkedHashMap();
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C86575XyN.INSTANCE);
        this.LLIIIJ = new AqS165S0100000_15(this, 674);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLIFFJFJJ = item;
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C42200GhI.LIZ(aweme)) {
            this.LLIIIILZ = true;
            this.LLIIIJ.invoke();
            ViewGroup viewGroup = this.LLFII;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            String string = Y3().getResources().getString(R.string.jkj);
            o.LJIIIIZZ(string, "contentView.resources.ge…entryBannerSinglePostCta)");
            String string2 = Y3().getResources().getString(R.string.jki);
            o.LJIIIIZZ(string2, "contentView.resources.ge…rt_entryBannerSinglePost)");
            String LIZIZ = Q8U.LIZIZ(new Object[]{string}, 1, string2, "format(format, *args)");
            TuxTextView tuxTextView = this.LLFZ;
            if (tuxTextView != null) {
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(tuxTextView, new ARunnableS0S2300000_1(tuxTextView, this, LIZIZ, string, tuxTextView, 2));
            }
            FrameLayout frameLayout = this.LLI;
            if (frameLayout != null) {
                C16880lQ.LJIILJJIL(frameLayout, new ACListenerS27S0100000_7(this, 189));
            }
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(item, this, 78), Y3());
            return;
        }
        ViewGroup viewGroup2 = this.LLFII;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLIIII = false;
        this.LLIIIILZ = false;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ivu);
        this.LLFII = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.LLFZ = (TuxTextView) view.findViewById(R.id.ivv);
        this.LLI = (FrameLayout) view.findViewById(R.id.ivs);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.XyL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C86574XyM.LJLIL, 6);
        C2055284u.LIZJ(this.LLFZ, null);
    }
}

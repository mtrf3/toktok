package com.ss.android.ugc.aweme.feed.assem.music.addtodsp;

import X.C16880lQ;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C32151Nz;
import X.C51029K0z;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C7MY;
import X.C8UQ;
import X.C8US;
import X.C8YN;
import X.FMX;
import X.L2J;
import X.O6R;
import X.SWG;
import X.SWI;
import X.SWR;
import X.SWS;
import X.SWU;
import X.SWV;
import X.SWW;
import X.SY4;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import q03.IDaS489S0100000_12;

/* loaded from: classes13.dex */
public final class AddToMusicDspButtonAssem extends BaseCellSlotComponent<AddToMusicDspButtonAssem> {
    public final C62822Ol8 LLFII;
    public SY4 LLFZ;
    public SY4 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.a_z;
    }

    public AddToMusicDspButtonAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 571));
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), SWU.INSTANCE);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), SWV.INSTANCE);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), SWW.INSTANCE);
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 572));
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (!item.getAweme().isAd()) {
            if (SWI.LIZIZ.LJIIL(item.getAweme().getMusic(), item.getAweme().getAid())) {
                Y3().setVisibility(0);
                return;
            }
        }
        Y3().setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFZ = (SY4) view.findViewById(R.id.l1k);
        this.LLI = (SY4) view.findViewById(R.id.l1l);
        if (L2J.LIZ()) {
            SY4 sy4 = this.LLFZ;
            if (sy4 != null) {
                ViewGroup.LayoutParams layoutParams = sy4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C7MY.LIZIZ(32);
                    sy4.setLayoutParams(layoutParams);
                    sy4.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    sy4.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            SY4 sy42 = this.LLI;
            if (sy42 != null) {
                ViewGroup.LayoutParams layoutParams2 = sy42.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = C7MY.LIZIZ(32);
                    sy42.setLayoutParams(layoutParams2);
                    sy42.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    sy42.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 3), Y3());
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.SWQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), SWS.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.SWT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, SWG.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.8Jn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLLL;
            }
        }, null, SWR.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.SWX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFF;
            }
        }, null, C8UQ.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.SWY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFFF;
            }
        }, null, C8US.LJLIL, 6);
    }

    public static final void q4(Aweme aweme, AddToMusicDspButtonAssem addToMusicDspButtonAssem) {
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", aweme.getAid());
        String str = ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).mEventType;
        if (str == null) {
            str = "'";
        }
        hashMap.put("enter_from", str);
        hashMap.put("music_id", aweme.getMusic().getMid());
        hashMap.put("music_volume", aweme.getMusicVolume());
        hashMap.put("button_name", "null");
        hashMap.put("button_type", "big");
        FMX.LJIIL("show_tttodsp_music", hashMap);
    }
}

package com.ss.android.ugc.aweme.dsp.ugcCollect;

import X.ActivityC45651qj;
import X.C110614Vt;
import X.C16880lQ;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C32151Nz;
import X.C51029K0z;
import X.C51645KOr;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C8YN;
import X.C91131Zpf;
import X.C91204Zqq;
import X.C91208Zqu;
import X.C91566Zwg;
import X.C91567Zwh;
import X.C91568Zwi;
import X.C91569Zwj;
import X.C91570Zwk;
import X.C91571Zwl;
import X.C91572Zwm;
import X.InterfaceC115514g7;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.IDRunnableS88S0100000_29;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TTMBrand;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;
import q03.IDaS492S0100000_29;

/* loaded from: classes22.dex */
public final class MusicDspUGCButtonAssem extends BaseCellSlotComponent<MusicDspUGCButtonAssem> {
    public static final C91131Zpf LLIIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILII;
    public FrameLayout LLFII;
    public LinearLayout LLFZ;
    public TuxTextView LLI;
    public TuxIconView LLIFFJFJJ;
    public TuxIconView LLII;
    public final InterfaceC115514g7 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public Animator LLIIIL;
    public final ArrayList<InterfaceC65784Pro<C76800UCe>> LLIIIZ;
    public boolean LLIIJI;
    public final C62822Ol8 LLIIJLIL;

    static {
        TBT tbt = new TBT(MusicDspUGCButtonAssem.class, "mUGCButtonVM", "getMUGCButtonVM()Lcom/ss/android/ugc/aweme/dsp/ugcCollect/MusicDspUgcButtonVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIILII = new InterfaceC74236TBo[]{tbt};
        LLIIL = new C91131Zpf();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.LIZ(this, LLIILII[0]), new TBT() { // from class: X.Zxf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91477ZvF) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C91566Zwg.LJLIL, 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bh;
    }

    public MusicDspUGCButtonAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDspUgcButtonVM.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ, c240999d1, new IDqS421S0100000_29(LIZ, 50), null, C91570Zwk.INSTANCE, null, null);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C91571Zwl.INSTANCE);
        this.LLIIIJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C91572Zwm.INSTANCE);
        this.LLIIIZ = new ArrayList<>();
        this.LLIIJLIL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 51));
    }

    public final void r4() {
        IDqS421S0100000_29 iDqS421S0100000_29 = new IDqS421S0100000_29(this, 52);
        Animator animator = this.LLIIIL;
        if (animator != null && animator.isRunning()) {
            this.LLIIIZ.add(iDqS421S0100000_29);
        } else {
            iDqS421S0100000_29.invoke();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        n4();
        getContainerView().setVisibility(8);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        Music music;
        Dsp dsp;
        String fullClipId;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        LLIIL.getClass();
        if (C91131Zpf.LIZ(item)) {
            if (C51645KOr.LIZIZ.LJIIZILJ(item.getAweme())) {
                Y3().setVisibility(0);
                r4();
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                if (aweme != null && (music = aweme.getMusic()) != null) {
                    long id = music.getId();
                    Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                    if (aweme2 == null || (dsp = aweme2.getDsp()) == null || (fullClipId = dsp.getFullClipId()) == null) {
                        return;
                    }
                    C91208Zqu.LIZ.LIZJ(fullClipId);
                    C91204Zqq.LIZ.put(fullClipId, Long.valueOf(id));
                    return;
                }
                return;
            }
        }
        Y3().setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        TTMBrand brand;
        o.LJIIIZ(item, "item");
        LLIIL.getClass();
        if (!C91131Zpf.LIZ(item)) {
            return false;
        }
        if (!C51645KOr.LIZIZ.LJIIZILJ(item.getAweme())) {
            return false;
        }
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        TTMInfo ttmInfo = aweme.getTtmInfo();
        if (ttmInfo != null && (brand = ttmInfo.getBrand()) != null && brand.isInExp()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Drawable drawable;
        o.LJIIIZ(view, "view");
        getContainerView().post(new IDRunnableS88S0100000_29(this, 10));
        this.LLFII = (FrameLayout) view.findViewById(R.id.is);
        this.LLFZ = (LinearLayout) view.findViewById(R.id.jf);
        this.LLI = (TuxTextView) view.findViewById(R.id.jg);
        this.LLIFFJFJJ = (TuxIconView) view.findViewById(R.id.jd);
        this.LLII = (TuxIconView) view.findViewById(R.id.je);
        C16880lQ.LJIIJ(new IDaS492S0100000_29(this, 1), Y3());
        FrameLayout frameLayout = this.LLFII;
        if (frameLayout != null) {
            Context context = getContext();
            if (context != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
                c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
                drawable = c110614Vt.LIZ(context);
            } else {
                drawable = null;
            }
            frameLayout.setBackground(drawable);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.Zxg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C91567Zwh.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.Zxh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C91568Zwi.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.Zxi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJZL;
            }
        }, null, C91569Zwj.LJLIL, 6);
    }

    public static void q4(ActivityC45651qj activityC45651qj, long j, String str, boolean z) {
        String str2;
        String str3;
        if (z) {
            str2 = "feed_fav_button";
        } else {
            str2 = "full_song_button";
        }
        if (z) {
            str3 = "my_playlist";
        } else {
            str3 = "track_reco";
        }
        C51645KOr.LIZIZ.LJIILIIL(j, activityC45651qj, str2, str3, str);
    }
}

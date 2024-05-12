package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.AbstractC225698tR;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C225688tQ;
import X.C225708tS;
import X.C251659uD;
import X.C26338AVi;
import X.C2K0;
import X.C53320KwG;
import X.C55369LoD;
import X.C55389LoX;
import X.C56448MDk;
import X.C62822Ol8;
import X.C71898SJq;
import X.C7MY;
import X.C81238VuU;
import X.C90193gN;
import X.IHZ;
import X.InterfaceC55102Lju;
import X.JBR;
import X.LFH;
import X.LFQ;
import X.LLY;
import X.X1D;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainPageSeekAssem extends BaseMainPageFragmentUIAssem implements LLY, MainPageSeekAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final IHZ LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public C56448MDk LJLJL;
    public C71898SJq LJLJLJ;
    public ViewGroup LJLJLLL;
    public C55369LoD LJLL;
    public VideoSeekBarMaskView LJLLI;

    @Override // X.LLY
    public final void Vj() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -892200181) {
            return null;
        }
        return this;
    }

    public MainPageSeekAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 50));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 51));
        this.LJLJI = new IHZ("MainPageSeekAssem");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        LFQ.LIZJ(this);
        C55369LoD c55369LoD = this.LJLL;
        if (c55369LoD != null) {
            c55369LoD.onDestroy();
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        VideoSeekBarMaskView videoSeekBarMaskView = this.LJLLI;
        if (videoSeekBarMaskView != null) {
            videoSeekBarMaskView.LJLLLL = C90193gN.LIZ();
            C81238VuU c81238VuU = videoSeekBarMaskView.LJLILLLLZI;
            if (c81238VuU != null) {
                c81238VuU.LJLILLLLZI.LJIILJJIL = C251659uD.LIZ();
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility
    public final void Vk(boolean z) {
        String str;
        IHZ ihz = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        if (z) {
            str = "hide";
        } else {
            str = "show";
        }
        ihz.LJIIIZ("hideSeekBar", null, JBR.LJFF(LIZ, str, " seekbar by MainPageAssem", LIZ));
        if (z) {
            C55369LoD c55369LoD = this.LJLL;
            if (c55369LoD != null) {
                c55369LoD.LIZIZ();
                return;
            }
            return;
        }
        C55369LoD c55369LoD2 = this.LJLL;
        if (c55369LoD2 == null) {
            return;
        }
        c55369LoD2.LIZLLL();
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility
    public final void al(C225708tS tabStyle) {
        o.LJIIIZ(tabStyle, "tabStyle");
        v3(tabStyle, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        C71898SJq c71898SJq;
        VideoSeekBarMaskView videoSeekBarMaskView;
        MutableLiveData<Integer> gv0;
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C53320KwG.LIZIZ()) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                view2 = LIZ.findViewById(R.id.ncx);
            } else {
                view2 = null;
            }
            this.LJLJJL = view2;
        } else {
            this.LJLJJLL = view.findViewById(R.id.kye);
        }
        this.LJLJJI = view.findViewById(R.id.arm);
        this.LJLJL = (C56448MDk) view.findViewById(R.id.n7r);
        this.LJLJLJ = (C71898SJq) view.findViewById(R.id.n7t);
        this.LJLJLLL = (ViewGroup) view.findViewById(R.id.n7s);
        this.LJLLI = (VideoSeekBarMaskView) view.findViewById(R.id.gcb);
        LFQ.LIZIZ(this);
        C56448MDk c56448MDk = this.LJLJL;
        if (c56448MDk != null && (viewGroup = this.LJLJLLL) != null && (c71898SJq = this.LJLJLJ) != null && (videoSeekBarMaskView = this.LJLLI) != null) {
            ImageView thumbnail = (ImageView) view.findViewById(R.id.n7v);
            ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) this.LJLILLLLZI.getValue();
            if (scrollSwitchStateManager != null) {
                o.LJIIIIZZ(thumbnail, "thumbnail");
                this.LJLL = new C55369LoD(new C55389LoX(c56448MDk, viewGroup, c71898SJq, thumbnail, scrollSwitchStateManager, videoSeekBarMaskView));
            }
            VideoSeekBarMaskView videoSeekBarMaskView2 = this.LJLLI;
            if (videoSeekBarMaskView2 != null) {
                videoSeekBarMaskView2.setSeekBarView(c56448MDk);
                videoSeekBarMaskView2.setSeekBarController(this.LJLL);
            }
        }
        HomePageDataViewModel homePageDataViewModel = (HomePageDataViewModel) this.LJLIL.getValue();
        if (homePageDataViewModel != null && (gv0 = homePageDataViewModel.gv0()) != null) {
            gv0.observe(this, new AObserverS77S0100000_9(this, 0));
        }
    }

    @Override // X.LLY
    public final void s0(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
        v3(tabStyle, z);
    }

    public final void v3(AbstractC225698tR abstractC225698tR, boolean z) {
        int i = 0;
        if (o.LJ(abstractC225698tR, C225688tQ.LIZ)) {
            View view = this.LJLJJL;
            if (view != null) {
                C26338AVi.LJI(view, 0, null, null, null, false, 30);
            }
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                C26338AVi.LJI(view2, 0, null, null, null, false, 30);
            }
            C56448MDk c56448MDk = this.LJLJL;
            if (c56448MDk != null) {
                C26338AVi.LJI(c56448MDk, 0, null, null, null, false, 30);
            }
            C71898SJq c71898SJq = this.LJLJLJ;
            if (c71898SJq != null) {
                C26338AVi.LJI(c71898SJq, 0, null, null, null, false, 30);
            }
            ViewGroup viewGroup = this.LJLJLLL;
            if (viewGroup != null) {
                C26338AVi.LJI(viewGroup, 0, null, null, null, false, 30);
            }
            View view3 = this.LJLJJI;
            if (view3 == null) {
                return;
            }
            if (!z) {
                i = 8;
            }
            view3.setVisibility(i);
            return;
        }
        if (!o.LJ(abstractC225698tR, C225708tS.LIZ)) {
            return;
        }
        if (z) {
            LFH.LIZIZ.LIZLLL().LJIIZILJ();
            i = C7MY.LIZIZ(60);
        }
        View view4 = this.LJLJJL;
        if (view4 != null) {
            C26338AVi.LJI(view4, Integer.valueOf(i), null, null, null, false, 30);
        }
        View view5 = this.LJLJJLL;
        if (view5 != null) {
            C26338AVi.LJI(view5, Integer.valueOf(i), null, null, null, false, 30);
        }
        C56448MDk c56448MDk2 = this.LJLJL;
        if (c56448MDk2 != null) {
            C26338AVi.LJI(c56448MDk2, Integer.valueOf(i), null, null, null, false, 30);
        }
        C71898SJq c71898SJq2 = this.LJLJLJ;
        if (c71898SJq2 != null) {
            C26338AVi.LJI(c71898SJq2, Integer.valueOf(i), null, null, null, false, 30);
        }
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 != null) {
            C26338AVi.LJI(viewGroup2, Integer.valueOf(i), null, null, null, false, 30);
        }
        View view6 = this.LJLJJI;
        if (view6 == null) {
            return;
        }
        view6.setVisibility(8);
    }

    @Override // X.LLY
    public final void x9(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
        v3(tabStyle, z);
    }

    public static void x3(int i, int i2, List list) {
        ViewGroup.LayoutParams layoutParams;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                    if (i2 == 0) {
                        layoutParams.width = -1;
                    } else {
                        layoutParams.width = i - i2;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        View view = this.LJLJJLL;
        if (view != null) {
            view.post(new ARunnableS45S0100000_9(this, 15));
        }
    }
}

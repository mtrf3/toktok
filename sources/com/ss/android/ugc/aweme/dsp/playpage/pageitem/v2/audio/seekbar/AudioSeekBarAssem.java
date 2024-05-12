package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar;

import X.AbstractC91590Zx4;
import X.C16880lQ;
import X.C17N;
import X.C212428Vi;
import X.C214348b8;
import X.C243119gR;
import X.C56451MDn;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78842Uww;
import X.C91061ZoX;
import X.C91120ZpU;
import X.C91121ZpV;
import X.C91200Zqm;
import X.C91264Zro;
import X.C91304ZsS;
import X.C91330Zss;
import X.C91334Zsw;
import X.C91395Ztv;
import X.C91476ZvE;
import X.C91489ZvR;
import X.C91563Zwd;
import X.C91605ZxJ;
import X.C9BD;
import X.EnumC91305ZsT;
import X.EnumC91310ZsY;
import X.EnumC91311ZsZ;
import X.EnumC91326Zso;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.InterfaceC91289ZsD;
import X.InterfaceC91296ZsK;
import X.TBT;
import Y.IDCListenerS137S0100000_29;
import Y.IDObserverS226S0100000_29;
import Y.IDRunnableS88S0100000_29;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IStatusViewAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class AudioSeekBarAssem extends BaseDspItemReusedAssem implements InterfaceC91289ZsD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJI;
    public long LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public int LLIFFJFJJ;
    public final C91120ZpU LLII;
    public boolean LLIIII;
    public final Runnable LLIIIILZ;
    public LinearLayout LLIIIJ;
    public C91476ZvE LLIIIL;
    public TuxTextView LLIIIZ;
    public TuxTextView LLIIJI;
    public TuxIconView LLIIJLIL;
    public LinearLayout LLIIL;
    public TuxTextView LLIILII;
    public TuxTextView LLIILZL;
    public TuxTextView LLIIZ;
    public View LLIL;
    public FrameLayout LLILII;
    public TuxIconView LLILIL;
    public SmartAvatarImageView LLILL;
    public TuxTextView LLILLIZIL;
    public FrameLayout LLILLJJLI;
    public C91489ZvR LLILLL;
    public LinearLayout LLILZ;
    public View LLILZIL;
    public C91395Ztv LLILZLL;
    public final InterfaceC115514g7 LLIZ;
    public long LLIZLLLIL;
    public Integer LLJ;

    static {
        TBT tbt = new TBT(AudioSeekBarAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public AudioSeekBarAssem() {
        new LinkedHashMap();
        this.LLII = new C91120ZpU(this);
        this.LLIIIILZ = new IDRunnableS88S0100000_29(this, 9);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLIZ = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 43), null, C91563Zwd.INSTANCE, null, null);
    }

    public final View g4() {
        C91489ZvR c91489ZvR;
        if (this.LLILLL == null) {
            View view = this.LLILZIL;
            if (view == null || (c91489ZvR = (C91489ZvR) view.findViewById(R.id.im)) == null) {
                c91489ZvR = null;
            }
            this.LLILLL = c91489ZvR;
        }
        return this.LLILLL;
    }

    public final View k4() {
        LinearLayout linearLayout;
        if (this.LLILZ == null) {
            View view = this.LLILZIL;
            if (view == null || (linearLayout = (LinearLayout) view.findViewById(R.id.ij)) == null) {
                linearLayout = null;
            }
            this.LLILZ = linearLayout;
        }
        return this.LLILZ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        IAudioPlayerAbility Z3 = Z3();
        if (Z3 != null && (HS = Z3.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
            c91334Zsw.LJIIL(this);
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
        C91476ZvE c91476ZvE;
        if (!b4() || this.LLFZ || this.LLIIII || (c91476ZvE = this.LLIIIL) == null) {
            return;
        }
        c91476ZvE.setMode(EnumC91326Zso.LOADING);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
        C91476ZvE c91476ZvE;
        if (!b4()) {
            return;
        }
        if (!this.LLFZ && !this.LLIIII && (c91476ZvE = this.LLIIIL) != null) {
            c91476ZvE.setMode(EnumC91326Zso.NORMAL);
        }
        C243119gR.LIZIZ(new IDqS421S0100000_29(this, 42));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        TuxIconView tuxIconView;
        FrameLayout frameLayout;
        TuxIconView tuxIconView2;
        IStatusViewAbility LIZLLL;
        AbstractC91590Zx4 HS;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        this.LLILZLL = item;
        Object LIZ = this.LLIZ.LIZ(this, LLJI[0]);
        String str = item.LJLJJL;
        boolean z = item.LJLJJLL;
        LIZ.getClass();
        boolean gv0 = ExpirePlayableVM.gv0(str, z);
        TuxIconView tuxIconView3 = this.LLIIJLIL;
        if ((tuxIconView3 == null || tuxIconView3.getVisibility() != 0) && (tuxIconView = this.LLIIJLIL) != null) {
            tuxIconView.setVisibility(0);
        }
        FrameLayout frameLayout2 = this.LLILII;
        if ((frameLayout2 == null || frameLayout2.getVisibility() != 0) && (frameLayout = this.LLILII) != null) {
            frameLayout.setVisibility(0);
        }
        TuxIconView tuxIconView4 = this.LLILIL;
        if ((tuxIconView4 == null || tuxIconView4.getVisibility() != 0) && (tuxIconView2 = this.LLILIL) != null) {
            tuxIconView2.setVisibility(0);
        }
        long j = 0;
        this.LLFII = 0L;
        this.LLFZ = false;
        this.LLI = false;
        this.LLIIII = false;
        C91476ZvE c91476ZvE = this.LLIIIL;
        if (c91476ZvE != null) {
            c91476ZvE.setMode(EnumC91326Zso.NORMAL);
        }
        C91476ZvE c91476ZvE2 = this.LLIIIL;
        if (c91476ZvE2 != null) {
            c91476ZvE2.removeCallbacks(this.LLIIIILZ);
        }
        long duration = item.LJLIL.getDuration();
        long j2 = this.LLIZLLLIL;
        if (j2 > 0) {
            duration = j2;
        }
        r4(duration);
        p4(item.LJLIL, duration);
        float f = 0.0f;
        if (b4()) {
            IAudioPlayerAbility Z3 = Z3();
            if (Z3 != null && (HS = Z3.HS()) != null) {
                C91330Zss c91330Zss = HS.LJLILLLLZI.LJLJI.LJLILLLLZI;
                if (c91330Zss.LJII()) {
                    C91061ZoX LJIIL = c91330Zss.LJIIL();
                    if (LJIIL.LIZIZ) {
                        j = LJIIL.LIZIZ().LJIJ();
                    }
                }
                int e4 = e4(item.LJLIL, (int) j);
                n4(e4);
                C91476ZvE c91476ZvE3 = this.LLIIIL;
                if (c91476ZvE3 != null) {
                    c91476ZvE3.setProgress(e4);
                }
                if (HS.LJLILLLLZI.LJLJI.LJLILLLLZI.LJII()) {
                    f = r1.LJLJJL / 100.0f;
                }
                z4(f);
            }
            if (!item.LJZL && (LIZLLL = C91264Zro.LIZLLL(this)) != null) {
                LIZLLL.h3(1);
            }
        } else {
            int e42 = e4(item.LJLIL, 0);
            n4(e42);
            C91476ZvE c91476ZvE4 = this.LLIIIL;
            if (c91476ZvE4 != null) {
                c91476ZvE4.setProgress(e42);
            }
            z4(0.0f);
        }
        if (item.LJZI.LJLIL && b4()) {
            u4(false);
        } else {
            u4(true);
        }
        if (gv0) {
            C17N.LJJIIJZLJL(this.LLIIIJ);
        } else {
            C17N.LJJLIIIJJI(this.LLIIIJ);
        }
        q4(0);
        m4(0);
    }

    public final void m4(int i) {
        InterfaceC91296ZsK interfaceC91296ZsK;
        C91395Ztv c91395Ztv = this.LLILZLL;
        if (c91395Ztv != null && (interfaceC91296ZsK = c91395Ztv.LJLIL) != null && interfaceC91296ZsK.LJIILIIL()) {
            TuxTextView tuxTextView = this.LLIIJI;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = this.LLIIJI;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void n4(int i) {
        int i2 = i / 1000;
        TuxTextView tuxTextView = this.LLIIJI;
        if (tuxTextView != null) {
            tuxTextView.setText(C56451MDn.LIZ(i2, false));
        }
        TuxTextView tuxTextView2 = this.LLIILII;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText(C56451MDn.LIZ(i2, false));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
        if (!b4()) {
            return;
        }
        z4(f);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        C91476ZvE c91476ZvE;
        C91476ZvE c91476ZvE2;
        o.LJIIIZ(loadingState, "loadingState");
        if (!b4()) {
            return;
        }
        int i = C91121ZpV.LIZ[loadingState.ordinal()];
        if (i != 1) {
            if ((i != 2 && i != 3) || this.LLFZ || this.LLIIII || (c91476ZvE2 = this.LLIIIL) == null) {
                return;
            }
            c91476ZvE2.setMode(EnumC91326Zso.LOADING);
            return;
        }
        if (this.LLFZ || this.LLIIII || (c91476ZvE = this.LLIIIL) == null) {
            return;
        }
        c91476ZvE.setMode(EnumC91326Zso.NORMAL);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
        this.LLIZLLLIL = 0L;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
        if (!b4()) {
            return;
        }
        u4(!currentState.isPauseState());
        if (this.LLFZ || this.LLIIII) {
            return;
        }
        if (currentState.isPauseState()) {
            this.LLIIII = false;
            C91476ZvE c91476ZvE = this.LLIIIL;
            if (c91476ZvE != null) {
                c91476ZvE.removeCallbacks(this.LLIIIILZ);
            }
            C91476ZvE c91476ZvE2 = this.LLIIIL;
            if (c91476ZvE2 == null) {
                return;
            }
            c91476ZvE2.setMode(EnumC91326Zso.DRAGGING);
            return;
        }
        C91476ZvE c91476ZvE3 = this.LLIIIL;
        if (c91476ZvE3 == null) {
            return;
        }
        c91476ZvE3.setMode(EnumC91326Zso.NORMAL);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
        if (!b4() || this.LLFZ) {
            return;
        }
        long j2 = this.LLFII;
        if (j < j2) {
            j = j2;
        } else {
            this.LLFII = 0L;
        }
        C91395Ztv c91395Ztv = this.LLILZLL;
        if (c91395Ztv != null && c91395Ztv.LJLJJLL) {
            int i = (int) j;
            if (l4(i, c91395Ztv)) {
                return;
            }
            n4(i);
            C91476ZvE c91476ZvE = this.LLIIIL;
            if (c91476ZvE == null) {
                return;
            }
            c91476ZvE.setProgress(i);
            return;
        }
        int i2 = (int) j;
        n4(i2);
        C91476ZvE c91476ZvE2 = this.LLIIIL;
        if (c91476ZvE2 == null) {
            return;
        }
        c91476ZvE2.setProgress(i2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        MutableLiveData<C76800UCe> ej;
        MutableLiveData OO;
        o.LJIIIZ(view, "view");
        this.LLILZIL = view;
        IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
        if (LIZ != null && (OO = LIZ.OO()) != null) {
            OO.observe(this, new IDObserverS226S0100000_29(this, 22));
        }
        IAudioCardUIStateAbility LIZ2 = C91264Zro.LIZ(this);
        if (LIZ2 != null && (ej = LIZ2.ej()) != null) {
            ej.observe(this, new IDObserverS226S0100000_29(this, 23));
        }
        this.LLIIIJ = (LinearLayout) view.findViewById(R.id.gsb);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.gsc);
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "context");
        this.LLIIIL = new C91476ZvE(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        viewGroup.addView(this.LLIIIL, layoutParams);
        this.LLIIIZ = (TuxTextView) view.findViewById(R.id.gsd);
        this.LLIIJI = (TuxTextView) view.findViewById(R.id.gs_);
        this.LLIIJLIL = (TuxIconView) view.findViewById(R.id.gsa);
        this.LLIIL = (LinearLayout) view.findViewById(R.id.gsf);
        this.LLIILII = (TuxTextView) view.findViewById(R.id.gse);
        this.LLIILZL = (TuxTextView) view.findViewById(R.id.gsg);
        this.LLIIZ = (TuxTextView) view.findViewById(R.id.gsh);
        this.LLIL = view.findViewById(R.id.gsl);
        this.LLILII = (FrameLayout) view.findViewById(R.id.gsj);
        this.LLILIL = (TuxIconView) view.findViewById(R.id.gsq);
        this.LLILL = (SmartAvatarImageView) view.findViewById(R.id.gsm);
        this.LLILLIZIL = (TuxTextView) view.findViewById(R.id.gsu);
        this.LLILLJJLI = (FrameLayout) view.findViewById(R.id.gsk);
        this.LLFII = 0L;
        this.LLFZ = false;
        this.LLI = false;
        C91476ZvE c91476ZvE = this.LLIIIL;
        if (c91476ZvE != null) {
            c91476ZvE.setSplitTrack(false);
        }
        IAudioPlayerAbility Z3 = Z3();
        if (Z3 != null && (HS = Z3.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
            c91334Zsw.LJII(this);
        }
        C91476ZvE c91476ZvE2 = this.LLIIIL;
        if (c91476ZvE2 != null) {
            c91476ZvE2.setCustomOnSeekBarChangeListener(this.LLII);
        }
        TuxIconView tuxIconView = this.LLIIJLIL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new IDCListenerS137S0100000_29(this, 4));
        }
        TuxTextView tuxTextView = this.LLIILZL;
        if (tuxTextView != null) {
            tuxTextView.setText("/");
        }
        if (b4()) {
            IXTabPanelAbility LJFF = C91264Zro.LJFF(this);
            C91200Zqm.LIZIZ(this.LLIIIL, C212428Vi.LIZLLL(this), LJFF);
            C91200Zqm.LIZIZ(this.LLIIJLIL, C212428Vi.LIZLLL(this), LJFF);
            C91200Zqm.LIZIZ(this.LLIIIZ, C212428Vi.LIZLLL(this), LJFF);
            C91200Zqm.LIZIZ(this.LLIIJI, C212428Vi.LIZLLL(this), LJFF);
        }
    }

    public final void q4(int i) {
        InterfaceC91296ZsK interfaceC91296ZsK;
        C91395Ztv c91395Ztv = this.LLILZLL;
        if (c91395Ztv != null && (interfaceC91296ZsK = c91395Ztv.LJLIL) != null && interfaceC91296ZsK.LJIILIIL()) {
            TuxTextView tuxTextView = this.LLIIIZ;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = this.LLIIIZ;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void r4(long j) {
        boolean z;
        C91476ZvE c91476ZvE = this.LLIIIL;
        if (c91476ZvE != null) {
            c91476ZvE.setMax((int) j);
        }
        int i = (int) (j / 1000);
        TuxTextView tuxTextView = this.LLIIIZ;
        boolean z2 = false;
        if (tuxTextView != null) {
            if (i > 3600) {
                z = true;
            } else {
                z = false;
            }
            tuxTextView.setText(C56451MDn.LIZ(i, z));
        }
        TuxTextView tuxTextView2 = this.LLIIZ;
        if (tuxTextView2 == null) {
            return;
        }
        if (i > 3600) {
            z2 = true;
        }
        tuxTextView2.setText(C56451MDn.LIZ(i, z2));
    }

    public final void u4(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLIIJLIL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_pause_fill);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLIIJLIL;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setIconRes(R.raw.icon_play_fill);
    }

    public final void z4(float f) {
        if (this.LLI) {
            return;
        }
        if (f > 0.97d) {
            this.LLI = true;
        }
        C91476ZvE c91476ZvE = this.LLIIIL;
        if (c91476ZvE == null) {
            return;
        }
        c91476ZvE.setSecondaryProgress((int) (c91476ZvE.getMax() * f));
    }

    public static int e4(InterfaceC91296ZsK interfaceC91296ZsK, int i) {
        if (!interfaceC91296ZsK.LJIILIIL()) {
            return i;
        }
        Integer previewStartTime = (Integer) interfaceC91296ZsK.LJIILLIIL().first;
        Integer previewEndTime = (Integer) interfaceC91296ZsK.LJIILLIIL().second;
        o.LJIIIIZZ(previewStartTime, "previewStartTime");
        int intValue = previewStartTime.intValue();
        o.LJIIIIZZ(previewEndTime, "previewEndTime");
        if (intValue >= previewEndTime.intValue()) {
            return i;
        }
        return C78842Uww.LJIIL(i, previewStartTime.intValue(), previewEndTime.intValue());
    }

    public static boolean l4(int i, C91395Ztv c91395Ztv) {
        if (c91395Ztv == null) {
            return false;
        }
        Pair<Integer, Integer> pair = c91395Ztv.LJLJL;
        Integer start = (Integer) pair.first;
        Integer end = (Integer) pair.second;
        o.LJIIIIZZ(start, "start");
        if (i >= start.intValue()) {
            o.LJIIIIZZ(end, "end");
            if (i <= end.intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }

    public final void p4(InterfaceC91296ZsK interfaceC91296ZsK, long j) {
        if (j == 0 || interfaceC91296ZsK == null || !interfaceC91296ZsK.LJIILIIL()) {
            C91476ZvE c91476ZvE = this.LLIIIL;
            if (c91476ZvE != null) {
                c91476ZvE.LL = -1.0f;
                c91476ZvE.LLD = -1.0f;
                c91476ZvE.invalidate();
                return;
            }
            return;
        }
        Integer num = (Integer) interfaceC91296ZsK.LJIILLIIL().first;
        Integer num2 = (Integer) interfaceC91296ZsK.LJIILLIIL().second;
        C91476ZvE c91476ZvE2 = this.LLIIIL;
        if (c91476ZvE2 != null) {
            float intValue = num.intValue();
            float f = (float) j;
            c91476ZvE2.LL = intValue / f;
            c91476ZvE2.LLD = num2.intValue() / f;
            c91476ZvE2.invalidate();
        }
    }
}

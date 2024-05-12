package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong;

import X.AbstractC91590Zx4;
import X.C17N;
import X.C212428Vi;
import X.C214348b8;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C91139Zpn;
import X.C91200Zqm;
import X.C91218Zr4;
import X.C91249ZrZ;
import X.C91264Zro;
import X.C91304ZsS;
import X.C91334Zsw;
import X.C91395Ztv;
import X.C91437Zub;
import X.C91561Zwb;
import X.C91605ZxJ;
import X.C9BD;
import X.EnumC91305ZsT;
import X.EnumC91310ZsY;
import X.EnumC91311ZsZ;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.InterfaceC91289ZsD;
import X.InterfaceC91296ZsK;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.YBM;
import Y.IDCListenerS84S0200000_29;
import Y.IDObserverS226S0100000_29;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class SongClipPreviewCTAAssem extends BaseDspItemReusedAssem implements InterfaceC91289ZsD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public C91395Ztv LLFII;
    public View LLFZ;
    public final InterfaceC115514g7 LLI;
    public C91139Zpn LLIFFJFJJ;
    public TuxTextView LLII;

    static {
        TBT tbt = new TBT(SongClipPreviewCTAAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public SongClipPreviewCTAAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 40), null, C91561Zwb.INSTANCE, null, null);
    }

    public final ExpirePlayableVM e4() {
        return (ExpirePlayableVM) this.LLI.LIZ(this, LLIIII[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        IAudioPlayerAbility LIZJ;
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        if (b4() && (LIZJ = C91264Zro.LIZJ(this)) != null && (HS = LIZJ.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
            c91334Zsw.LJIIL(this);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        int i;
        IAudioPlayerAbility Z3;
        C91437Zub FP;
        String str;
        C91139Zpn c91139Zpn;
        C91437Zub FP2;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        this.LLFII = item;
        if (item.LJLJJLL) {
            ExpirePlayableVM e4 = e4();
            String str2 = item.LJLJJL;
            boolean z = item.LJLJJLL;
            e4.getClass();
            boolean gv0 = ExpirePlayableVM.gv0(str2, z);
            YBM.LIZ.getClass();
            boolean LIZIZ = YBM.LIZIZ();
            TuxTextView tuxTextView = this.LLII;
            if (tuxTextView != null) {
                if (LIZIZ) {
                    i = 8;
                } else {
                    i = 0;
                }
                tuxTextView.setVisibility(i);
            }
            if (gv0) {
                if (LIZIZ) {
                    C91139Zpn c91139Zpn2 = this.LLIFFJFJJ;
                    if (c91139Zpn2 != null) {
                        c91139Zpn2.LIZLLL();
                    }
                } else {
                    C91139Zpn c91139Zpn3 = this.LLIFFJFJJ;
                    if (c91139Zpn3 != null) {
                        c91139Zpn3.LIZIZ();
                    }
                }
                View view = this.LLFZ;
                if (view != null) {
                    C17N.LJJLIIIJJI(view);
                    C17N.LJJLIIIJJI(this.LLIFFJFJJ);
                    ExpirePlayableVM e42 = e4();
                    String str3 = item.LJLJJL;
                    e42.getClass();
                    ExpirePlayableVM.hv0(str3, true);
                    if (b4()) {
                        IAudioPlayerAbility Z32 = Z3();
                        if (Z32 != null && (FP2 = Z32.FP()) != null) {
                            FP2.LJFF(true);
                        }
                        if (!LIZIZ && (c91139Zpn = this.LLIFFJFJJ) != null) {
                            c91139Zpn.LJ();
                        }
                        Context context = getContext();
                        if (context != null) {
                            String str4 = item.LJLLI;
                            String str5 = item.LJLJJI.LJI;
                            if (C91218Zr4.LIZLLL(context)) {
                                str = "other_app";
                            } else {
                                str = "app_store";
                            }
                            C91249ZrZ.LJIIL("preview_mode_cta", null, str5, "resso", str4, str, 34);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o.LJIJI("contentView");
                throw null;
            }
            if (b4() && (Z3 = Z3()) != null && (FP = Z3.FP()) != null) {
                FP.LJFF(true);
            }
            View view2 = this.LLFZ;
            if (view2 != null) {
                C17N.LJJIIJZLJL(view2);
                C91139Zpn c91139Zpn4 = this.LLIFFJFJJ;
                if (c91139Zpn4 != null) {
                    c91139Zpn4.LIZIZ();
                }
                C91139Zpn c91139Zpn5 = this.LLIFFJFJJ;
                if (c91139Zpn5 != null) {
                    C17N.LJJIIJZLJL(c91139Zpn5);
                }
                if (item.LJZI.LJLIL) {
                    return;
                }
                ExpirePlayableVM e43 = e4();
                String str6 = item.LJLJJL;
                e43.getClass();
                ExpirePlayableVM.hv0(str6, false);
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        View view3 = this.LLFZ;
        if (view3 != null) {
            C17N.LJJIIJZLJL(view3);
        } else {
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        C91395Ztv c91395Ztv;
        IAudioCardUIStateAbility LIZ;
        MutableLiveData<C76800UCe> ej;
        o.LJIIIZ(currentState, "currentState");
        if (b4() && (c91395Ztv = this.LLFII) != null && currentState == EnumC91310ZsY.PLAYBACK_STATE_START && c91395Ztv.LJLJJLL) {
            ExpirePlayableVM e4 = e4();
            String itemId = c91395Ztv.LJLJJL;
            boolean z = c91395Ztv.LJLJJLL;
            e4.getClass();
            o.LJIIIZ(itemId, "itemId");
            if (z) {
                ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
                if (!expiredPlayableManager.isPreviewPlayableExpiredToday(itemId) || expiredPlayableManager.isWhitePlayable(itemId) || expiredPlayableManager.isTodayPlayableLimited() || (LIZ = C91264Zro.LIZ(this)) == null || (ej = LIZ.ej()) == null) {
                    return;
                }
                ej.setValue(null);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        IXTabPanelAbility LJFF;
        MutableLiveData<C76800UCe> ej;
        MutableLiveData OO;
        IAudioPlayerAbility LIZJ;
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        o.LJIIIZ(view, "view");
        this.LLFZ = view;
        this.LLIFFJFJJ = (C91139Zpn) view.findViewById(R.id.axw);
        View view2 = this.LLFZ;
        if (view2 != null) {
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.jk);
            this.LLII = tuxTextView;
            if (tuxTextView != null) {
                C17N.LJJIIJZLJL(tuxTextView);
            }
            if (b4() && (LIZJ = C91264Zro.LIZJ(this)) != null && (HS = LIZJ.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
                c91334Zsw.LJII(this);
            }
            IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
            if (LIZ != null && (OO = LIZ.OO()) != null) {
                OO.observe(this, new IDObserverS226S0100000_29(this, 18));
            }
            IAudioCardUIStateAbility LIZ2 = C91264Zro.LIZ(this);
            if (LIZ2 != null && (ej = LIZ2.ej()) != null) {
                ej.observe(this, new IDObserverS226S0100000_29(this, 19));
            }
            C91139Zpn c91139Zpn = this.LLIFFJFJJ;
            if (c91139Zpn != null) {
                c91139Zpn.setOnClickListener(new ViewOnClickListenerC13880ga(new IDCListenerS84S0200000_29(view, this, 1)));
            }
            if (b4() && (LJFF = C91264Zro.LJFF(this)) != null) {
                float F7 = LJFF.F7() - C32151Nz.LJIIZILJ(86);
                C91200Zqm.LIZJ(this.LLIFFJFJJ, C212428Vi.LIZLLL(this), LJFF, F7);
                C91200Zqm.LIZJ(this.LLII, C212428Vi.LIZLLL(this), LJFF, F7);
                return;
            }
            return;
        }
        o.LJIJI("contentView");
        throw null;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}

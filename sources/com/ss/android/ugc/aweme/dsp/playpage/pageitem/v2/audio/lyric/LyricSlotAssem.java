package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.lyric;

import X.AbstractC73547Stj;
import X.AbstractC91339Zt1;
import X.AbstractC91590Zx4;
import X.C212428Vi;
import X.C73543Stf;
import X.C73674Svm;
import X.C91067Zod;
import X.C91264Zro;
import X.C91334Zsw;
import X.C91342Zt4;
import X.C91343Zt5;
import X.C91344Zt6;
import X.C91395Ztv;
import X.C91489ZvR;
import X.C91605ZxJ;
import X.CallableC91064Zoa;
import X.T16;
import Y.IDObserverS226S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspSlotReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.BaseLyricsViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class LyricSlotAssem extends BaseDspSlotReusedAssem {
    public C91489ZvR LLI;
    public C91067Zod LLIFFJFJJ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bi;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
    }

    public LyricSlotAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        Music music;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        C91067Zod c91067Zod = this.LLIFFJFJJ;
        String str = null;
        if (c91067Zod != null) {
            AbstractC91339Zt1 abstractC91339Zt1 = c91067Zod.LIZIZ;
            if (abstractC91339Zt1 != null) {
                abstractC91339Zt1.LJLJL = -1;
                abstractC91339Zt1.setVisibility(4);
                abstractC91339Zt1.LJLJI = item;
                abstractC91339Zt1.LJLLI = item.LJLLLLLL;
            }
            View view = c91067Zod.LIZ;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            AbstractC91339Zt1 abstractC91339Zt12 = c91067Zod.LIZIZ;
            if (abstractC91339Zt12 != null) {
                abstractC91339Zt12.LJLJL = -1;
                abstractC91339Zt12.LJI();
                AbstractC91590Zx4 playerController = abstractC91339Zt12.getPlayerController();
                if (playerController != null && (c91605ZxJ = playerController.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
                    c91334Zsw.LJII(abstractC91339Zt12);
                }
                AbstractC91590Zx4 playerController2 = abstractC91339Zt12.getPlayerController();
                if (playerController2 != null) {
                    playerController2.Mu(abstractC91339Zt12);
                }
                abstractC91339Zt12.LJFF();
                BaseLyricsViewModel baseLyricsViewModel = abstractC91339Zt12.LJLILLLLZI;
                if (baseLyricsViewModel != null) {
                    C91395Ztv c91395Ztv2 = abstractC91339Zt12.LJLJI;
                    if (c91395Ztv2 != null) {
                        music = c91395Ztv2.LJLLILLLL;
                        str = c91395Ztv2.LJLJJL;
                    } else {
                        music = null;
                    }
                    int hashCode = abstractC91339Zt12.hashCode();
                    C73543Stf c73543Stf = baseLyricsViewModel.LJLJI;
                    if (c73543Stf != null) {
                        c73543Stf.dispose();
                    }
                    C73543Stf LJIIJ = AbstractC73547Stj.LJI(new CallableC91064Zoa(hashCode, baseLyricsViewModel, music, str)).LJIILIIL(T16.LIZ()).LJ(C73674Svm.LIZLLL, C73674Svm.LIZJ, C91342Zt4.LIZ).LJIIJ(C91344Zt6.LJLIL, C91343Zt5.LIZ);
                    baseLyricsViewModel.LJLJI = LJIIJ;
                    baseLyricsViewModel.LJLIL.LIZ(LJIIJ);
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("lyricsManager");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AbstractC91590Zx4 abstractC91590Zx4;
        boolean z;
        MutableLiveData OO;
        o.LJIIIZ(view, "view");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.iu);
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "context");
        C91489ZvR c91489ZvR = new C91489ZvR(context);
        this.LLI = c91489ZvR;
        c91489ZvR.setId(R.id.im);
        C91489ZvR c91489ZvR2 = this.LLI;
        if (c91489ZvR2 != null) {
            viewGroup.addView(c91489ZvR2, new ViewGroup.LayoutParams(-1, -2));
            View findViewById = view.findViewById(R.id.im);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.m…sp_api_short_lyrics_view)");
            this.LLI = (C91489ZvR) findViewById;
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            C91067Zod c91067Zod = new C91067Zod(context2);
            this.LLIFFJFJJ = c91067Zod;
            C91489ZvR c91489ZvR3 = this.LLI;
            if (c91489ZvR3 != null) {
                c91067Zod.LIZIZ = c91489ZvR3;
                c91067Zod.LIZ = view;
                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
                if (LIZJ != null) {
                    abstractC91590Zx4 = LIZJ.HS();
                } else {
                    abstractC91590Zx4 = null;
                }
                IContainerUtilityAbility LJ = C91264Zro.LJ(this);
                if (LJ != null) {
                    z = LJ.D9();
                } else {
                    z = false;
                }
                AbstractC91339Zt1 abstractC91339Zt1 = c91067Zod.LIZIZ;
                if (abstractC91339Zt1 != null && LIZLLL != null) {
                    abstractC91339Zt1.LJLJJI = abstractC91590Zx4;
                    abstractC91339Zt1.LJLJJL = z;
                    abstractC91339Zt1.LJLILLLLZI = (BaseLyricsViewModel) ViewModelProviders.of(LIZLLL).get(abstractC91339Zt1.getViewModelClass());
                    abstractC91339Zt1.LJFF();
                }
                if (this.LLIFFJFJJ != null) {
                    this.LLFF.getValue();
                    IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
                    if (LIZ != null && (OO = LIZ.OO()) != null) {
                        OO.observe(this, new IDObserverS226S0100000_29(this, 15));
                        return;
                    }
                    return;
                }
                o.LJIJI("lyricsManager");
                throw null;
            }
            o.LJIJI("shortLyricsView");
            throw null;
        }
        o.LJIJI("shortLyricsView");
        throw null;
    }
}

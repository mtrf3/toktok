package com.ss.android.ugc.aweme.recommendationcard.view;

import X.AbstractC51590KMo;
import X.C113554cx;
import X.C222688oa;
import X.C29901Fi;
import X.C46744IWe;
import X.C46745IWf;
import X.C47261Igj;
import X.C48203Ivv;
import X.C49568Jcq;
import X.C51589KMn;
import X.C78880UxY;
import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.InterfaceC47247IgV;
import X.K3S;
import X.KNL;
import X.KNM;
import X.KNO;
import X.KNW;
import X.ORZ;
import X.OSZ;
import X.XKQ;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EffectRecommendationCarouselViewModel extends EffectRecommendationBaseViewModel<AbstractC51590KMo, C51589KMn> implements OnUIPlayListener {
    public final C29901Fi<KNO> LJLJL;
    public final C29901Fi LJLJLJ;
    public InterfaceC47247IgV LJLJLLL;
    public final Map<Integer, InterfaceC47247IgV> LJLL;
    public final List<Aweme> LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public XKQ LJLLLL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C222688oa.LIZIZ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C222688oa.LIZJ(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C222688oa.LJFF(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C222688oa.LJI(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C222688oa.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C222688oa.LJIILJJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C222688oa.LJJIIJ(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        C222688oa.LJJIIJZLJL(this, str, jSONObject, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, IPH iph) {
        C222688oa.LJJIJIIJI(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C222688oa.LJJIJIIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
        C222688oa.LJJJJI(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    public final Aweme lv0() {
        List<CardContent> list;
        int i;
        List<Aweme> list2;
        C51589KMn c51589KMn = (C51589KMn) this.LJLJJL.getValue();
        if (c51589KMn == null || (list = c51589KMn.LIZJ) == null) {
            return null;
        }
        Integer num = c51589KMn.LJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        CardContent cardContent = (CardContent) ORZ.LJLLLLLL(i, list);
        if (cardContent == null || (list2 = cardContent.awemeList) == null) {
            return null;
        }
        return (Aweme) ListProtector.get(list2, 0);
    }

    public final void mv0() {
        C51589KMn c51589KMn;
        C51589KMn c51589KMn2;
        Aweme aweme;
        String str;
        String str2;
        if (this.LJLLILLLL && !this.LJLLL && (c51589KMn = (C51589KMn) this.LJLJJL.getValue()) != null && c51589KMn.LJ != null && (c51589KMn2 = (C51589KMn) this.LJLJJL.getValue()) != null) {
            List<CardContent> list = c51589KMn2.LIZJ;
            if (list != null) {
                int i = 0;
                for (CardContent cardContent : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        CardContent cardContent2 = cardContent;
                        List<Aweme> list2 = cardContent2.awemeList;
                        if (list2 != null) {
                            aweme = (Aweme) ORZ.LJLLLL(list2);
                        } else {
                            aweme = null;
                        }
                        Integer valueOf = Integer.valueOf(nv0(Integer.valueOf(i)));
                        EffectStructV2 effectStructV2 = cardContent2.effect;
                        if (effectStructV2 != null) {
                            str = effectStructV2.effectId;
                        } else {
                            str = null;
                        }
                        if (aweme != null) {
                            str2 = aweme.getAid();
                        } else {
                            str2 = null;
                        }
                        Map LIZ = K3S.LIZ(valueOf, str, "prop_carousel");
                        LIZ.put("music_id", "");
                        if (str2 != null) {
                            LIZ.put("group_id", str2);
                        }
                        C78880UxY.LJJLIIIJL("prop_recommend_card_show", LIZ);
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            Object value = this.LJLILLLLZI.getValue();
            String str3 = c51589KMn2.LJ;
            value.getClass();
            KNW.LIZLLL(str3);
            this.LJLLL = true;
        }
    }

    public final void ov0() {
        Integer num;
        C29901Fi<KNO> c29901Fi = this.LJLJL;
        C51589KMn c51589KMn = (C51589KMn) this.LJLJJL.getValue();
        if (c51589KMn != null) {
            num = c51589KMn.LJI;
        } else {
            num = null;
        }
        c29901Fi.LJII(new KNM(num));
    }

    public EffectRecommendationCarouselViewModel() {
        C29901Fi<KNO> c29901Fi = new C29901Fi<>();
        this.LJLJL = c29901Fi;
        this.LJLJLJ = c29901Fi;
        this.LJLL = new LinkedHashMap();
        this.LJLLI = new ArrayList();
        this.LJLLJ = true;
        this.LJLJJL.setValue(new C51589KMn(0));
    }

    public final void k3() {
        Video video;
        InterfaceC47247IgV interfaceC47247IgV;
        Aweme lv0 = lv0();
        if (lv0 != null) {
            video = lv0.getVideo();
        } else {
            video = null;
        }
        if (this.LJLLILLLL && (interfaceC47247IgV = this.LJLJLLL) != null && interfaceC47247IgV.d4() && video != null) {
            video.setDuration(2000.0d);
            C46744IWe c46744IWe = new C46744IWe();
            SimVideo LJJIJLIJ = b.LJJIJLIJ(video);
            C46745IWf c46745IWf = c46744IWe.LIZ;
            c46745IWf.LIZJ = LJJIJLIJ;
            c46745IWf.LJIILL = true;
            c46745IWf.LJJJJZ = true;
            c46745IWf.LJIIIZ = true;
            c46745IWf.LJJJJJL = 1000;
            C46745IWf LIZ = c46744IWe.LIZ();
            hv0().LJJJLL(this);
            hv0().LJIIL(LIZ);
        }
    }

    public static int nv0(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return 1;
            }
            if (num.intValue() == 1) {
                return 3;
            }
            if (num.intValue() == 2) {
                return 2;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0268 A[EDGE_INSN: B:150:0x0268->B:109:0x0268 BREAK  A[LOOP:0: B:100:0x024b->B:148:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022e  */
    @Override // com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iv0(X.AbstractC51590KMo r36) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel.iv0(java.lang.Object):void");
    }

    public final void kv0(Context context) {
        C51589KMn c51589KMn;
        if (C48203Ivv.LJ(context)) {
            k3();
            mv0();
            return;
        }
        LiveData liveData = this.LJLJJL;
        C51589KMn c51589KMn2 = (C51589KMn) liveData.getValue();
        if (c51589KMn2 != null) {
            c51589KMn = C51589KMn.LIZ(c51589KMn2, null, null, null, null, true, null, 95);
        } else {
            c51589KMn = null;
        }
        liveData.setValue(c51589KMn);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
        ov0();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        Integer num;
        C222688oa.LJJIJLIJ(this, str, it4);
        C29901Fi<KNO> c29901Fi = this.LJLJL;
        C51589KMn c51589KMn = (C51589KMn) this.LJLJJL.getValue();
        String str2 = null;
        if (c51589KMn != null) {
            num = c51589KMn.LJI;
        } else {
            num = null;
        }
        c29901Fi.LJII(new KNL(num));
        XKQ xkq = this.LJLLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        if (this.LJLLJ) {
            this.LJLLLL = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C49568Jcq(this, null), 3);
        }
        Aweme lv0 = lv0();
        if (lv0 != null) {
            str2 = lv0.getAid();
        }
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("enter_from", "homepage_hot_card");
        if (str2 == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("group_id", str2);
        C78880UxY.LJJLIIIJL("video_play", C113554cx.LJJLIIIIJ(oszArr));
    }
}

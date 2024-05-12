package X;

import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JGw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48894JGw implements JGK {
    public final C48881JGj LJLIL;
    public final C50321Joz LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public void LJII(Aweme aweme, JQA jqa, long j) {
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.JGK
    public final void Wf(int i) {
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void contextPause() {
    }

    @Override // X.JGK
    public final void contextResume() {
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return false;
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
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C222688oa.LJI(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
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
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
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

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
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

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public final Aweme LIZIZ() {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            return c48881JGj.LIZJ;
        }
        return null;
    }

    public final String LIZJ() {
        String str;
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj == null || (str = c48881JGj.LJIILLIIL) == null) {
            return "";
        }
        return str;
    }

    public final JQA LIZLLL() {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            return c48881JGj.LJIJJLI;
        }
        return null;
    }

    public final JH1 LJ() {
        return (JH1) this.LJLJI.getValue();
    }

    public final void LJI() {
        String str;
        Long l;
        long currentTimeMillis;
        C48880JGi LJI;
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            c48881JGj.LJJIJIL = -1L;
        }
        C50321Joz c50321Joz = this.LJLILLLLZI;
        if (c50321Joz != null) {
            Aweme LIZIZ = LIZIZ();
            if (LIZIZ == null || (str = C78939UyV.LJIILJJIL(LIZIZ)) == null) {
                str = "";
            }
            c50321Joz.setLastPlayItemId(str);
        }
        if (!C48893JGv.LIZLLL) {
            C48893JGv.LIZLLL = true;
            C48893JGv.LIZIZ = false;
        }
        C48881JGj c48881JGj2 = this.LJLIL;
        if (c48881JGj2 != null && (LJI = c48881JGj2.LJI()) != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (LJI.LIZJ == -1) {
                LJI.LIZJ = currentTimeMillis2;
            }
            l = Long.valueOf(currentTimeMillis2);
        } else {
            l = null;
        }
        if (C48893JGv.LJI) {
            C48881JGj c48881JGj3 = this.LJLIL;
            if (c48881JGj3 != null) {
                c48881JGj3.LJJIIZI = C48893JGv.LJ;
            }
            C48893JGv.LJI = false;
            return;
        }
        C48881JGj c48881JGj4 = this.LJLIL;
        if (c48881JGj4 == null) {
            return;
        }
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        c48881JGj4.LJJIIZI = currentTimeMillis;
    }

    public final void LJFF() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z;
        String str13;
        int i;
        PlayListInfo playListInfo;
        String str14;
        String str15;
        JQA LIZLLL;
        java.util.Map<String, String> map;
        InterfaceC88472Yns<? super Aweme, String> interfaceC88472Yns;
        InterfaceC88472Yns<? super Aweme, String> interfaceC88472Yns2;
        if (LIZIZ() == null) {
            return;
        }
        JH5 jh5 = new JH5(LIZLLL());
        JQA LIZLLL2 = LIZLLL();
        String str16 = null;
        if (LIZLLL2 != null) {
            str = LIZLLL2.LJFF;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = LIZJ();
        } else {
            JQA LIZLLL3 = LIZLLL();
            if (LIZLLL3 != null) {
                str2 = LIZLLL3.LJFF;
            } else {
                str2 = null;
            }
            o.LJI(str2);
        }
        jh5.LIZLLL = str2;
        JQA LIZLLL4 = LIZLLL();
        if (LIZLLL4 != null) {
            str3 = LIZLLL4.LJI;
        } else {
            str3 = null;
        }
        jh5.LJJLIIIJILLIZJL = str3;
        C48881JGj c48881JGj = this.LJLIL;
        String str17 = "";
        if (c48881JGj == null || (str4 = c48881JGj.LJIJI) == null) {
            str4 = "";
        }
        jh5.LJJLIIIJLLLLLLLZ = str4;
        jh5.LJJIIZI(LIZIZ());
        JQA LIZLLL5 = LIZLLL();
        if (LIZLLL5 != null) {
            str5 = LIZLLL5.LJIILLIIL;
        } else {
            str5 = null;
        }
        jh5.LJLLILLLL = str5;
        C48881JGj c48881JGj2 = this.LJLIL;
        if (c48881JGj2 == null || (str6 = c48881JGj2.LJIJ) == null) {
            str6 = "";
        }
        jh5.LJJLIIIJJI = str6;
        if (c48881JGj2 == null || (str7 = c48881JGj2.LJIIZILJ) == null) {
            str7 = "";
        }
        jh5.LJIILL = str7;
        jh5.LJJLL = 0;
        JQA LIZLLL6 = LIZLLL();
        if (LIZLLL6 != null) {
            str8 = LIZLLL6.LJII;
        } else {
            str8 = null;
        }
        jh5.LJLJJLL = str8;
        JQA LIZLLL7 = LIZLLL();
        if (LIZLLL7 != null && (interfaceC88472Yns2 = LIZLLL7.LJJIJIL) != null) {
            str9 = interfaceC88472Yns2.invoke(LIZIZ());
        } else {
            str9 = null;
        }
        jh5.LJJIII = str9;
        JQA LIZLLL8 = LIZLLL();
        if (LIZLLL8 != null) {
            str10 = LIZLLL8.LJII;
        } else {
            str10 = null;
        }
        jh5.LJJIL = str10;
        JQA LIZLLL9 = LIZLLL();
        if (LIZLLL9 != null && (interfaceC88472Yns = LIZLLL9.LJJIIZ) != null) {
            str11 = interfaceC88472Yns.invoke(LIZIZ());
        } else {
            str11 = null;
        }
        jh5.LJJIFFI = str11;
        JQA LIZLLL10 = LIZLLL();
        if (LIZLLL10 != null) {
            str12 = LIZLLL10.LJ;
        } else {
            str12 = null;
        }
        jh5.LJLJL = str12;
        jh5.LIZ(K02.LIZIZ("video_play_finish", LIZIZ(), LIZJ()));
        C48881JGj c48881JGj3 = this.LJLIL;
        if (c48881JGj3 != null) {
            z = c48881JGj3.LJJIIJ;
        } else {
            z = false;
        }
        String str18 = "1";
        if (z) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        jh5.LIZLLL("search_is_caption_translated", str13);
        C48881JGj c48881JGj4 = this.LJLIL;
        if (c48881JGj4 == null || !c48881JGj4.LJJIIJZLJL) {
            str18 = CardStruct.IStatusCode.DEFAULT;
        }
        jh5.LIZLLL("search_is_title_translated", str18);
        if (LIZLLL() != null) {
            JQA LIZLLL11 = LIZLLL();
            o.LJI(LIZLLL11);
            if (LIZLLL11.LJIJJLI.length() > 0) {
                JQA LIZLLL12 = LIZLLL();
                o.LJI(LIZLLL12);
                jh5.LIZLLL("token_type", LIZLLL12.LJIJJLI);
            }
        }
        if (LIZLLL() != null) {
            JQA LIZLLL13 = LIZLLL();
            o.LJI(LIZLLL13);
            if (LIZLLL13.LJIL.length() > 0) {
                JQA LIZLLL14 = LIZLLL();
                o.LJI(LIZLLL14);
                jh5.LIZLLL("is_fullscreen", LIZLLL14.LJIL);
            }
        }
        if (LIZLLL() != null) {
            JQA LIZLLL15 = LIZLLL();
            o.LJI(LIZLLL15);
            if (LIZLLL15.LJJ.length() > 0) {
                JQA LIZLLL16 = LIZLLL();
                o.LJI(LIZLLL16);
                jh5.LIZLLL("max_shoot_time", LIZLLL16.LJJ);
            }
        }
        if (LIZLLL() != null && (LIZLLL = LIZLLL()) != null && (map = LIZLLL.LJJIII) != null && (!map.isEmpty())) {
            JQA LIZLLL17 = LIZLLL();
            o.LJI(LIZLLL17);
            jh5.LIZ(LIZLLL17.LJJIII);
        }
        if (LIZLLL() != null) {
            JQA LIZLLL18 = LIZLLL();
            o.LJI(LIZLLL18);
            if (LIZLLL18.LJIILIIL.length() > 0) {
                JQA LIZLLL19 = LIZLLL();
                if (LIZLLL19 != null) {
                    str15 = LIZLLL19.LJIILIIL;
                } else {
                    str15 = null;
                }
                jh5.LJIIIZ = str15;
            }
        }
        C48881JGj c48881JGj5 = this.LJLIL;
        if (c48881JGj5 != null && (str14 = c48881JGj5.LJJIFFI) != null) {
            str17 = str14;
        }
        if (C78685UuP.LJJJZ(str17)) {
            jh5.LIZLLL("item_rank", str17);
        }
        if (JP2.LIZ(LIZIZ())) {
            jh5.LJJLIIIJL = "playlist_id";
            Aweme LIZIZ = LIZIZ();
            if (LIZIZ != null && (playListInfo = LIZIZ.playlist_info) != null) {
                str16 = playListInfo.getMixId();
            }
            jh5.LJJLIIIJLJLI = str16;
        }
        String LJIILJJIL = C78939UyV.LJIILJJIL(LIZIZ());
        if (LJIILJJIL != null) {
            jh5.LIZLLL("aweme_id", LJIILJJIL);
        }
        C50321Joz c50321Joz = this.LJLILLLLZI;
        if (c50321Joz != null) {
            i = c50321Joz.getTabIndex();
        } else {
            i = -1;
        }
        jh5.LIZLLL("search_type", C50676Jui.LIZ(i));
        jh5.LJIILIIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r14 > (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48894JGw.LJIIIIZZ():void");
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public void LLLJIL() {
        LJ().LLIFFJFJJ(LIZIZ());
        LJ().NE();
        LJ().Fk0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r1 > (-1)) goto L14;
     */
    @Override // X.JGK, X.InterfaceC48907JHj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLJLJLL() {
        /*
            r9 = this;
            X.JQA r0 = r9.LIZLLL()
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.LJFF
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r8 = ""
            if (r0 == 0) goto L50
            java.lang.String r5 = r9.LIZJ()
        L14:
            X.JGj r0 = r9.LJLIL
            r3 = -1
            if (r0 == 0) goto L49
            X.JGi r0 = r0.LJI()
            if (r0 == 0) goto L49
            long r1 = r0.LIZJ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L49
        L26:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L46
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.LIZIZ()
            java.lang.String r0 = X.C78939UyV.LJIILJJIL(r0)
            if (r0 != 0) goto L47
        L39:
            r4 = 0
            java.util.concurrent.ExecutorService r0 = X.C38995FSd.LIZLLL()
            X.JmH r3 = new X.JmH
            r3.<init>(r4, r5, r6, r8)
            r0.execute(r3)
        L46:
            return
        L47:
            r8 = r0
            goto L39
        L49:
            X.JGj r0 = r9.LJLIL
            if (r0 == 0) goto L46
            long r1 = r0.LJJIJIL
            goto L26
        L50:
            X.JQA r0 = r9.LIZLLL()
            if (r0 == 0) goto L5a
            java.lang.String r5 = r0.LJFF
            if (r5 != 0) goto L14
        L5a:
            r5 = r8
            goto L14
        L5c:
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48894JGw.LLLLLJLJLL():void");
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void g9() {
        LJ().release();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r4 > (-1)) goto L21;
     */
    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPausePlay(java.lang.String r8) {
        /*
            r7 = this;
            X.JGj r0 = r7.LJLIL
            if (r0 == 0) goto L7
            r0.LJI()
        L7:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LIZIZ()
            r6 = 0
            if (r0 == 0) goto L16
            boolean r1 = r0.isAd()
            r0 = 1
            if (r1 != r0) goto L16
        L15:
            return
        L16:
            X.JGj r1 = r7.LJLIL
            if (r1 == 0) goto L1e
            boolean r0 = r1.LJJIII
            if (r0 != 0) goto L22
        L1e:
            r7.LJIIIIZZ()
            goto L15
        L22:
            if (r1 == 0) goto L5d
            X.JGi r0 = r1.LJI()
        L28:
            r1 = -1
            if (r0 == 0) goto L56
            long r4 = r0.LIZJ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L56
        L32:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1e
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.LIZIZ()
            if (r5 == 0) goto L1e
            X.JQA r1 = r7.LIZLLL()
            X.JGj r0 = r7.LJLIL
            if (r0 == 0) goto L4b
            boolean r6 = r0.LJJII
        L4b:
            X.3PG r0 = X.C3PG.LIZIZ
            java.lang.String r4 = "play_time_cla_related"
            boolean r0 = r0.LIZ(r4)
            if (r0 == 0) goto L5f
            goto L1e
        L56:
            X.JGj r0 = r7.LJLIL
            if (r0 == 0) goto L1e
            long r4 = r0.LJJIJIL
            goto L32
        L5d:
            r0 = 0
            goto L28
        L5f:
            X.7au r1 = X.C49581Jd3.LIZ(r1, r5, r6)
            java.lang.String r0 = "duration"
            r1.LJ(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.LIZ
            X.FMX.LJIIL(r4, r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48894JGw.onPausePlay(java.lang.String):void");
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        LJFF();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        LJ().onPlayPrepare(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        LJ().onPlayStop(str);
        if (C46442IKo.LIZIZ()) {
            C48881JGj c48881JGj = this.LJLIL;
            if (c48881JGj != null) {
                c48881JGj.LJI();
            }
            Aweme LIZIZ = LIZIZ();
            if (LIZIZ != null && LIZIZ.isAd()) {
                LJIIIIZZ();
            }
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(IT4 it4) {
        String str;
        C48880JGi c48880JGi;
        Aweme LIZIZ;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        int i;
        boolean z2;
        String str17;
        long j;
        long j2;
        long j3;
        String str18;
        PlayListInfo playListInfo;
        String str19;
        String str20;
        InterfaceC88472Yns<? super Aweme, String> interfaceC88472Yns;
        InterfaceC88472Yns<? super Aweme, String> interfaceC88472Yns2;
        C48880JGi LJI;
        if (it4 != null) {
            str = it4.getId();
        } else {
            str = null;
        }
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null && (LJI = c48881JGj.LJI()) != null) {
            LJI.LIZLLL = false;
        }
        C48881JGj c48881JGj2 = this.LJLIL;
        if (c48881JGj2 != null) {
            c48880JGi = c48881JGj2.LJI();
        } else {
            c48880JGi = null;
        }
        if (c48880JGi != null && !c48880JGi.LIZLLL) {
            c48880JGi.LIZLLL = true;
            if (LIZIZ() != null) {
                JH6 jh6 = new JH6(LIZLLL());
                JQA LIZLLL = LIZLLL();
                if (LIZLLL != null) {
                    str2 = LIZLLL.LJFF;
                } else {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    str3 = LIZJ();
                } else {
                    JQA LIZLLL2 = LIZLLL();
                    if (LIZLLL2 != null) {
                        str3 = LIZLLL2.LJFF;
                    } else {
                        str3 = null;
                    }
                    o.LJI(str3);
                }
                jh6.LIZLLL = str3;
                JQA LIZLLL3 = LIZLLL();
                if (LIZLLL3 != null) {
                    str4 = LIZLLL3.LJI;
                } else {
                    str4 = null;
                }
                jh6.LJJZ = str4;
                C48881JGj c48881JGj3 = this.LJLIL;
                String str21 = "";
                if (c48881JGj3 == null || (str5 = c48881JGj3.LJIJI) == null) {
                    str5 = "";
                }
                jh6.LJJLIIIJLLLLLLLZ = str5;
                Aweme LIZIZ2 = LIZIZ();
                jh6.LJIILL(LIZIZ2);
                if (LIZIZ2 != null) {
                    jh6.LJJIIZI(LIZIZ2);
                    jh6.LJJIIZ = C227768wm.LJIIZILJ(LIZIZ2);
                }
                try {
                    if (Settings.System.getInt(EF7.LIZIZ().getContentResolver(), "accelerometer_rotation") == 0) {
                        jh6.LJLJL = 0;
                    } else {
                        jh6.LJLJL = 1;
                    }
                } catch (Throwable unused) {
                }
                JQA LIZLLL4 = LIZLLL();
                if (LIZLLL4 != null) {
                    str6 = LIZLLL4.LJIILLIIL;
                } else {
                    str6 = null;
                }
                jh6.LLF = str6;
                JQA LIZLLL5 = LIZLLL();
                if (LIZLLL5 != null) {
                    str7 = LIZLLL5.LJ;
                } else {
                    str7 = null;
                }
                jh6.LJJLJLI = str7;
                C48881JGj c48881JGj4 = this.LJLIL;
                if (c48881JGj4 == null || (str8 = c48881JGj4.LJIIZILJ) == null) {
                    str8 = "";
                }
                jh6.LJIILL = str8;
                if (c48881JGj4 == null || (str9 = c48881JGj4.LJIJ) == null) {
                    str9 = "";
                }
                jh6.LJJZZI = str9;
                jh6.LJJLL = 0;
                JQA LIZLLL6 = LIZLLL();
                if (LIZLLL6 != null) {
                    str10 = LIZLLL6.LJII;
                } else {
                    str10 = null;
                }
                jh6.LJJIIJZLJL = str10;
                JQA LIZLLL7 = LIZLLL();
                if (LIZLLL7 != null && (interfaceC88472Yns2 = LIZLLL7.LJJIJIL) != null) {
                    str11 = interfaceC88472Yns2.invoke(LIZIZ());
                } else {
                    str11 = null;
                }
                jh6.LJJIII = str11;
                JQA LIZLLL8 = LIZLLL();
                if (LIZLLL8 != null) {
                    str12 = LIZLLL8.LJII;
                } else {
                    str12 = null;
                }
                jh6.LJJIL = str12;
                JQA LIZLLL9 = LIZLLL();
                if (LIZLLL9 != null) {
                    str13 = LIZLLL9.LJIJI;
                } else {
                    str13 = null;
                }
                jh6.LLJILJILJ = str13;
                JQA LIZLLL10 = LIZLLL();
                if (LIZLLL10 != null) {
                    str14 = LIZLLL10.LJIJJ;
                } else {
                    str14 = null;
                }
                jh6.LLJILLL = str14;
                JQA LIZLLL11 = LIZLLL();
                if (LIZLLL11 != null && (interfaceC88472Yns = LIZLLL11.LJJIIZ) != null) {
                    str15 = interfaceC88472Yns.invoke(LIZIZ());
                } else {
                    str15 = null;
                }
                jh6.LJJIFFI = str15;
                jh6.LIZ(K02.LIZIZ("video_play", LIZIZ(), LIZJ()));
                if (LIZLLL() != null) {
                    JQA LIZLLL12 = LIZLLL();
                    o.LJI(LIZLLL12);
                    if (LIZLLL12.LJIJJLI.length() > 0) {
                        JQA LIZLLL13 = LIZLLL();
                        o.LJI(LIZLLL13);
                        jh6.LIZLLL("token_type", LIZLLL13.LJIJJLI);
                    }
                }
                if (LIZLLL() != null) {
                    JQA LIZLLL14 = LIZLLL();
                    o.LJI(LIZLLL14);
                    if (LIZLLL14.LJIL.length() > 0) {
                        JQA LIZLLL15 = LIZLLL();
                        o.LJI(LIZLLL15);
                        jh6.LIZLLL("is_fullscreen", LIZLLL15.LJIL);
                    }
                }
                if (LIZLLL() != null) {
                    JQA LIZLLL16 = LIZLLL();
                    o.LJI(LIZLLL16);
                    if (LIZLLL16.LJJ.length() > 0) {
                        JQA LIZLLL17 = LIZLLL();
                        o.LJI(LIZLLL17);
                        jh6.LIZLLL("max_shoot_time", LIZLLL17.LJJ);
                    }
                }
                if (LIZLLL() != null) {
                    JQA LIZLLL18 = LIZLLL();
                    o.LJI(LIZLLL18);
                    if (LIZLLL18.LJIILIIL.length() > 0) {
                        JQA LIZLLL19 = LIZLLL();
                        if (LIZLLL19 != null) {
                            str20 = LIZLLL19.LJIILIIL;
                        } else {
                            str20 = null;
                        }
                        jh6.LJIIIZ = str20;
                    }
                }
                C48881JGj c48881JGj5 = this.LJLIL;
                if (c48881JGj5 != null && (str19 = c48881JGj5.LJJIFFI) != null) {
                    str21 = str19;
                }
                if (C78685UuP.LJJJZ(str21)) {
                    jh6.LIZLLL("item_rank", str21);
                }
                if (LIZLLL() != null) {
                    o.LJI(LIZLLL());
                    if (!r0.LJJIII.isEmpty()) {
                        JQA LIZLLL20 = LIZLLL();
                        o.LJI(LIZLLL20);
                        jh6.LIZ(LIZLLL20.LJJIII);
                    }
                }
                if (JP2.LIZ(LIZIZ())) {
                    jh6.LJLJJI = "playlist_id";
                    Aweme LIZIZ3 = LIZIZ();
                    if (LIZIZ3 != null && (playListInfo = LIZIZ3.playlist_info) != null) {
                        str18 = playListInfo.getMixId();
                    } else {
                        str18 = null;
                    }
                    jh6.LJLJJL = str18;
                }
                String LJIILJJIL = C78939UyV.LJIILJJIL(LIZIZ());
                if (LJIILJJIL != null) {
                    jh6.LIZLLL("aweme_id", LJIILJJIL);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sendVideoAutoPlayEvent aid:");
                Aweme LIZIZ4 = LIZIZ();
                if (LIZIZ4 != null) {
                    str16 = LIZIZ4.getAid();
                } else {
                    str16 = null;
                }
                LIZ.append(str16);
                X1D.LIZIZ(LIZ);
                C50321Joz c50321Joz = this.LJLILLLLZI;
                if (c50321Joz != null) {
                    i = c50321Joz.getTabIndex();
                } else {
                    i = -1;
                }
                jh6.LIZLLL("search_type", C50676Jui.LIZ(i));
                C48881JGj c48881JGj6 = this.LJLIL;
                if (c48881JGj6 != null) {
                    z2 = c48881JGj6.LJJIIJ;
                } else {
                    z2 = false;
                }
                String str22 = "1";
                if (z2) {
                    str17 = "1";
                } else {
                    str17 = CardStruct.IStatusCode.DEFAULT;
                }
                jh6.LIZLLL("search_is_caption_translated", str17);
                C48881JGj c48881JGj7 = this.LJLIL;
                if (c48881JGj7 == null || !c48881JGj7.LJJIIJZLJL) {
                    str22 = CardStruct.IStatusCode.DEFAULT;
                }
                jh6.LIZLLL("search_is_title_translated", str22);
                C48881JGj c48881JGj8 = this.LJLIL;
                if (c48881JGj8 != null && c48881JGj8.LJJIJIIJI != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("clickSearchTime: ");
                    LIZ2.append(this.LJLIL.LJJIJIIJI);
                    LIZ2.append(" playTime");
                    LIZ2.append(this.LJLIL.LJJIJIIJIL);
                    C0MT.LIZLLL(LIZ2, " currentTime", currentTimeMillis, " start_click_search_end_play");
                    C48881JGj c48881JGj9 = this.LJLIL;
                    long j4 = c48881JGj9.LJJIJIIJIL;
                    Long l = c48881JGj9.LJJIJIIJI;
                    long j5 = 0;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    C48339Iy7.LIZLLL(j4, j, LIZ2, " start_play_end_first_frame");
                    C48339Iy7.LIZLLL(currentTimeMillis, this.LJLIL.LJJIJIIJIL, LIZ2, "start_click_search_end_first_frame");
                    Long l2 = this.LJLIL.LJJIJIIJI;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    LIZ2.append(currentTimeMillis - j2);
                    X1D.LIZIZ(LIZ2);
                    C48881JGj c48881JGj10 = this.LJLIL;
                    long j6 = c48881JGj10.LJJIJIIJIL;
                    Long l3 = c48881JGj10.LJJIJIIJI;
                    if (l3 != null) {
                        j3 = l3.longValue();
                    } else {
                        j3 = 0;
                    }
                    jh6.LIZLLL("start_click_search_end_play", String.valueOf(j6 - j3));
                    jh6.LIZLLL("start_play_end_first_frame", String.valueOf(currentTimeMillis - this.LJLIL.LJJIJIIJIL));
                    Long l4 = this.LJLIL.LJJIJIIJI;
                    if (l4 != null) {
                        j5 = l4.longValue();
                    }
                    jh6.LIZLLL("start_click_search_end_first_frame", String.valueOf(currentTimeMillis - j5));
                    this.LJLIL.LJJIJIIJI = null;
                }
                jh6.LJIILIIL();
            }
        }
        C48881JGj c48881JGj11 = this.LJLIL;
        if (c48881JGj11 != null && c48881JGj11.LJJIII && (LIZIZ = LIZIZ()) != null) {
            JQA LIZLLL21 = LIZLLL();
            C48881JGj c48881JGj12 = this.LJLIL;
            if (c48881JGj12 != null) {
                z = c48881JGj12.LJJII;
            } else {
                z = false;
            }
            FMX.LJIIL("video_play_cla_related", C49581Jd3.LIZ(LIZLLL21, LIZIZ, z).LIZ);
        }
        LJI();
        C46315IFr.LIZ();
        LJ().onRenderFirstFrame(str, it4);
        C49723JfL.LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH playerEvent) {
        int i;
        int i2;
        o.LJIIIZ(playerEvent, "playerEvent");
        String LIZJ = LIZJ();
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            i = c48881JGj.LJIJJ;
        } else {
            i = -1;
        }
        String str = playerEvent.LIZ;
        Aweme LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            i2 = LIZIZ.getAwemeType();
        } else {
            i2 = 0;
        }
        C62682Ois.LIZ(LIZJ, i, str, i2, LIZIZ(), "");
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        LJI();
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public C48894JGw(C48881JGj c48881JGj, C50321Joz c50321Joz) {
        this.LJLIL = c48881JGj;
        this.LJLILLLLZI = c50321Joz;
        JQA LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LJJIIZ = new AqS174S0100000_8(this, 236);
            C48896JGy provider = C48896JGy.LJLIL;
            o.LJIIIZ(provider, "provider");
            LIZLLL.LJJIJIL = provider;
        }
        this.LJLJI = C221108m2.LIZIZ(C48895JGx.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        LJ().onBuffering(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        LJ().onDecoderBuffering(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        LJ().onPlayFailed(str, ipg);
    }
}

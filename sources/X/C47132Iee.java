package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Iee, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47132Iee implements OnUIPlayListener {
    public final InterfaceC46330IGg LJLIL;
    public int LJLILLLLZI;
    public final C47246IgU LJLJJI;
    public Aweme LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final java.util.Map<String, String> LJLLJ;
    public long LJLLL;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 485));
    public final ArrayList<OnUIPlayListener> LJLJJL = new ArrayList<>(2);
    public float LJLL = -1.0f;
    public final int LJLLI = C7MY.LIZIZ(136);
    public final int LJLLILLLL = C7MY.LIZIZ(180);

    public final boolean LJII() {
        Integer num;
        Integer[] numArr = {150, 2, 61};
        Aweme aweme = this.LJLJJLL;
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        } else {
            num = null;
        }
        if (ORY.LJJIJIIJIL(num, numArr)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C222688oa.LIZJ(this, str, j);
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
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
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
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
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

    public final IWH LIZJ() {
        return (IWH) this.LJLJI.getValue();
    }

    public final void LJ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(this.LJLLJ);
        c188727au.LJ(System.currentTimeMillis() - this.LJLLL, "duration");
        FMX.LJIIL("inbox_skylight_card_play_time", c188727au.LIZ);
        this.LJLLL = System.currentTimeMillis();
        if (!LJII()) {
            this.LJLJLJ = false;
            return;
        }
        LIZJ().pause();
        InterfaceC46645ISj LIZJ = LIZJ().LIZJ();
        if (LIZJ != null) {
            LIZJ.LJJJLZIJ(300);
        }
        this.LJLILLLLZI = 3;
    }

    public final void LJIIIIZZ() {
        if (this.LJLILLLLZI == 2 || (!LJII() && this.LJLJLJ)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIIZZ(this.LJLLJ);
            c188727au.LJ(System.currentTimeMillis() - this.LJLLL, "duration");
            FMX.LJIIL("inbox_skylight_card_play_time", c188727au.LIZ);
        }
        this.LJLLL = System.currentTimeMillis();
        this.LJLJLJ = false;
        LIZJ().stop();
    }

    public final void LJI() {
        this.LJLLL = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(this.LJLLJ);
        FMX.LJIIL("inbox_skylight_card_play", c188727au.LIZ);
        if (!LJII()) {
            this.LJLJLJ = true;
            return;
        }
        LIZJ().resume();
        InterfaceC46645ISj LIZJ = LIZJ().LIZJ();
        if (LIZJ != null) {
            LIZJ.LJJJLZIJ(300);
        }
        this.LJLILLLLZI = 2;
    }

    public final void LIZ(Video video) {
        if (video == null) {
            return;
        }
        float height = (video.getHeight() / video.getWidth()) * this.LJLLI;
        if (this.LJLJJI.getView().getHeight() == height || Float.isNaN(height)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getView().getLayoutParams();
        if (Math.abs(O6R.LJJIIZ(height) - this.LJLLILLLL) <= 1) {
            return;
        }
        layoutParams.height = O6R.LJJIIZ(height);
        this.LJLJJI.getView().setLayoutParams(layoutParams);
    }

    public final void LIZIZ(OnUIPlayListener onUIPlayListener) {
        if (onUIPlayListener != null && !this.LJLJJL.contains(onUIPlayListener)) {
            this.LJLJJL.add(onUIPlayListener);
        }
    }

    public final void LJFF(OnUIPlayListener onUIPlayListener) {
        int indexOf;
        if (onUIPlayListener != null && (indexOf = this.LJLJJL.indexOf(onUIPlayListener)) >= 0) {
            ListProtector.remove(this.LJLJJL, indexOf);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        if (!LIZLLL(this.LJLJJLL, str)) {
            return;
        }
        this.LJLILLLLZI = 3;
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (!LIZLLL(this.LJLJJLL, str)) {
            return;
        }
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (!LIZLLL(this.LJLJJLL, str)) {
            return;
        }
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        if (!LIZLLL(this.LJLJJLL, str)) {
            return;
        }
        this.LJLILLLLZI = 1;
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        this.LJLILLLLZI = 0;
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        this.LJLILLLLZI = 2;
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (!LIZLLL(this.LJLJJLL, str)) {
            return;
        }
        this.LJLILLLLZI = 2;
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
    }

    public C47132Iee(ViewGroup viewGroup, InterfaceC46330IGg interfaceC46330IGg) {
        this.LJLIL = interfaceC46330IGg;
        C47246IgU LIZ = C47246IgU.LIZ(viewGroup, false, false, 0, 0);
        this.LJLJJI = LIZ;
        LIZ.N7(new C47133Ief(this));
        this.LJLLJ = new LinkedHashMap();
        this.LJLLL = System.currentTimeMillis();
    }

    public static boolean LIZLLL(Aweme aweme, String str) {
        String str2;
        if (aweme == null) {
            return false;
        }
        if (TextUtils.equals(aweme.getAid(), str)) {
            return true;
        }
        Video video = aweme.getVideo();
        if (video != null) {
            str2 = video.getVideoId();
        } else {
            str2 = null;
        }
        if (!TextUtils.equals(str2, str)) {
            return false;
        }
        return true;
    }

    public static void LJIIIZ(C47132Iee c47132Iee, Aweme aweme) {
        c47132Iee.LJLLJ.put("enter_from", "notification_page");
        java.util.Map<String, String> map = c47132Iee.LJLLJ;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "item.aid");
        map.put("group_id", aid);
        java.util.Map<String, String> map2 = c47132Iee.LJLLJ;
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "item.authorUid");
        map2.put("author_id", authorUid);
        c47132Iee.LJLLJ.put("follow_status", String.valueOf(C54740Le4.LIZIZ(aweme.getAuthor())));
        c47132Iee.LJLLJ.put("enter_position", "top_cell");
        c47132Iee.LJLLJ.put("aweme_type", String.valueOf(aweme.getAwemeType()));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(c47132Iee.LJLLJ);
        FMX.LJIIL("inbox_skylight_card_play", c188727au.LIZ);
        c47132Iee.LJLLL = System.currentTimeMillis();
        c47132Iee.LJLJJLL = aweme;
        if (!c47132Iee.LJII()) {
            c47132Iee.LJLJLJ = true;
            return;
        }
        c47132Iee.LJLJL = true;
        c47132Iee.LJLJLLL = false;
        c47132Iee.LJLL = -1.0f;
        c47132Iee.LIZJ().LJJJLL(c47132Iee);
        c47132Iee.LIZJ().setSurface(c47132Iee.LJLJJI.getSurface());
        IWH LIZJ = c47132Iee.LIZJ();
        C46744IWe c46744IWe = new C46744IWe();
        SimVideo LJJJJ = C51029K0z.LJJJJ(aweme.getVideo());
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LIZJ = LJJJJ;
        c46745IWf.LJIIJ = (int) 0;
        c46745IWf.LJIILL = true;
        c46745IWf.LJJJJZI = true;
        c46745IWf.LJIIIZ = true;
        c46744IWe.LIZLLL("inbox skylight");
        if ("inbox skylight".length() != 0) {
            C46745IWf c46745IWf2 = c46744IWe.LIZ;
            c46745IWf2.getClass();
            c46745IWf2.LJIIZILJ = "inbox skylight";
        }
        LIZJ.LJIIL(c46744IWe.LIZ());
        InterfaceC46645ISj LIZJ2 = c47132Iee.LIZJ().LIZJ();
        if (LIZJ2 == null) {
            return;
        }
        LIZJ2.LJJJLZIJ(300);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        if (this.LJLJLLL) {
            float f = this.LJLL;
            if (f > 0.0f) {
                LIZJ().LJI(f);
                if (this.LJLILLLLZI < 2) {
                    this.LJLL = f;
                }
            }
            this.LJLJLLL = false;
            this.LJLL = -1.0f;
        }
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        this.LJLILLLLZI = 4;
        this.LJLJLLL = false;
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        this.LJLILLLLZI = 2;
        this.LJLJLLL = false;
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onRenderFirstFrame(str, it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onBufferedPercent(str, j, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, IPH iph) {
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        int i = this.LJLILLLLZI;
        if (i == 2 || i == 3) {
            Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
            while (it.hasNext()) {
                it.next().onPlayProgressChange(str, j, j2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        if (this.LJLILLLLZI < 2) {
            this.LJLJLLL = true;
        }
        Iterator<OnUIPlayListener> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onSeekStart(str, i, f);
        }
    }
}

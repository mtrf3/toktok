package X;

import Y.ACListenerS24S0100000_4;
import Y.ACallableS107S0100000_4;
import Y.ACallableS113S0100000_10;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.FeedTitleWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicCoverWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicInfoWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Wd9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82711Wd9 implements InterfaceC82710Wd8, ViewModelStoreOwner, OnUIPlayListener, InterfaceC47667InH {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final View.OnTouchListener LJLJJL;
    public final SmartImageView LJLJJLL;
    public final FrameLayout LJLJL;
    public final TuxIconView LJLJLJ;
    public final View LJLJLLL;
    public final C72434Sbm LJLL;
    public final ImageView LJLLI;
    public final ImageView LJLLILLLL;
    public final ImageView LJLLJ;
    public final ImageView LJLLL;
    public final C47246IgU LJLLLL;
    public final C82705Wd3 LJLLLLLL;
    public Aweme LJLZ;
    public int LJZ;
    public DataCenter LJZI;
    public WidgetManager LJZL;
    public C82709Wd7 LL;
    public C82713WdB LLD;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    @Override // X.InterfaceC82710Wd8
    public final void LIZLLL() {
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(null, "pause_animation");
        }
    }

    @Override // X.InterfaceC82710Wd8
    public final void LJ() {
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(null, "start_animation");
        }
    }

    @Override // X.InterfaceC82710Wd8
    public final Surface getSurface() {
        return this.LJLLLL.getSurface();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }

    @Override // X.InterfaceC82710Wd8
    public final void unBind() {
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "stop_animation");
        }
    }

    @Override // X.InterfaceC82710Wd8
    public final DataCenter LLI() {
        return this.LJZI;
    }

    @Override // X.InterfaceC82710Wd8
    public final Aweme getAweme() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC82710Wd8
    public final int getPosition() {
        return this.LJZ;
    }

    public final void LIZIZ(boolean z) {
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.valueOf(z), "load_progress_bar");
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            LIZIZ(true);
        } else {
            LIZIZ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C82709Wd7 c82709Wd7;
        Aweme aweme = this.LJLZ;
        if (aweme != null && (c82709Wd7 = this.LL) != null) {
            String enterFrom = this.LJLJI;
            int i = this.LJZ;
            String str2 = this.LJLJJI;
            o.LJIIIZ(enterFrom, "enterFrom");
            if (c82709Wd7.LIZ != -1) {
                long currentTimeMillis = System.currentTimeMillis() - c82709Wd7.LIZ;
                if (currentTimeMillis > 50) {
                    String valueOf = String.valueOf(currentTimeMillis);
                    o.LJIIIZ(valueOf, "<set-?>");
                    C51708KRc.LIZIZ = valueOf;
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("enter_from", enterFrom);
                    c198517qh.LIZ.put("duration", String.valueOf(currentTimeMillis));
                    c198517qh.LIZ.put("rank", Integer.valueOf(i + 1));
                    c198517qh.LIZ.put("group_id", aweme.getAid());
                    c198517qh.LIZ.put("author_id", aweme.getAuthorUid());
                    c198517qh.LIZ.put("log_pb", aweme.getLogPbString());
                    if (C78685UuP.LJJJZ(str2)) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        c198517qh.LIZLLL("category_id", str2);
                    }
                    C39398FdC c39398FdC = C39398FdC.LIZ;
                    JSONObject LJ = c198517qh.LJ();
                    c39398FdC.getClass();
                    C39398FdC.LIZIZ("play_time", LJ);
                }
                c82709Wd7.LIZ = -1L;
            }
        }
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "pause_animation");
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        ACallableS107S0100000_4 aCallableS107S0100000_4 = new ACallableS107S0100000_4(this, 13);
        C39398FdC.LIZ.getClass();
        C10K.LIZIZ(aCallableS107S0100000_4, C39398FdC.LIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        LIZIZ(false);
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "pause_animation");
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Aweme aweme;
        VideoControl videoControl;
        DataCenter dataCenter;
        Aweme aweme2 = this.LJLZ;
        if (aweme2 != null && aweme2.getVideoControl() != null && (aweme = this.LJLZ) != null && (videoControl = aweme.getVideoControl()) != null && videoControl.showProgressBar == 1 && (dataCenter = this.LJZI) != null) {
            dataCenter.jv0(Float.valueOf(f), "on_play_progress_change");
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        this.LJLJJLL.setVisibility(0);
        LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        this.LJLJJLL.setVisibility(8);
        ACallableS113S0100000_10 aCallableS113S0100000_10 = new ACallableS113S0100000_10(this, 25);
        C39398FdC.LIZ.getClass();
        C10K.LIZIZ(aCallableS113S0100000_10, C39398FdC.LIZ(), null);
        C82709Wd7 c82709Wd7 = this.LL;
        if (c82709Wd7 != null && c82709Wd7.LIZ == -1) {
            c82709Wd7.LIZ = System.currentTimeMillis();
        }
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "start_animation");
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        this.LJLJJLL.setVisibility(8);
        C82709Wd7 c82709Wd7 = this.LL;
        if (c82709Wd7 != null && c82709Wd7.LIZ == -1) {
            c82709Wd7.LIZ = System.currentTimeMillis();
        }
        DataCenter dataCenter = this.LJZI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "start_animation");
        }
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        C82713WdB c82713WdB = this.LLD;
        if (c82713WdB != null) {
            int i3 = this.LJZ;
            InterfaceC82710Wd8 curViewHolder = c82713WdB.LIZ.getCurViewHolder();
            if (curViewHolder == null || !c82713WdB.LIZ.isFirstSurfaceAvailable || i3 != curViewHolder.getPosition()) {
                return;
            }
            KRZ krz = c82713WdB.LIZ.playController;
            if (krz != null) {
                krz.LJLILLLLZI.setSurface(curViewHolder.getSurface());
                c82713WdB.LIZ.isFirstSurfaceAvailable = false;
                return;
            }
            o.LJIJI("playController");
            throw null;
        }
    }

    public C82711Wd9(View view, Fragment fragment, String enterFrom, String str, View.OnTouchListener tapTouchListener) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        this.LJLJI = enterFrom;
        this.LJLJJI = str;
        this.LJLJJL = tapTouchListener;
        View findViewById = view.findViewById(R.id.d7e);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.feed_item_cover)");
        this.LJLJJLL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.d8e);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.feed_play_view_wrapper)");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.LJLJL = frameLayout;
        View findViewById3 = view.findViewById(R.id.d7h);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.feed_item_img_more)");
        TuxIconView tuxIconView = (TuxIconView) findViewById3;
        this.LJLJLJ = tuxIconView;
        View findViewById4 = view.findViewById(R.id.d7f);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.feed_item_digg_block)");
        this.LJLJLLL = findViewById4;
        View findViewById5 = view.findViewById(R.id.d7g);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.feed_item_img_avatar)");
        C72434Sbm c72434Sbm = (C72434Sbm) findViewById5;
        this.LJLL = c72434Sbm;
        View findViewById6 = view.findViewById(R.id.d7i);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.feed_item_long_press)");
        LongPressLayout longPressLayout = (LongPressLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.bvj);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.corner_top_left)");
        this.LJLLI = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.bvk);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.corner_top_right)");
        this.LJLLILLLL = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.bvd);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.corner_bottom_left)");
        this.LJLLJ = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.bve);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.corner_bottom_right)");
        this.LJLLL = (ImageView) findViewById10;
        C47246IgU LIZ = C47246IgU.LIZ(frameLayout, false, false, 0, 0);
        this.LJLLLL = LIZ;
        this.LJLLLLLL = new C82705Wd3();
        LIZ.N7(this);
        this.LJZI = DataCenter.gv0(C165726eu.LIZ(fragment, this), fragment);
        WidgetManager xl = WidgetManager.xl(null, fragment, view, fragment.getContext());
        this.LJZL = xl;
        if (xl != null) {
            xl.Hl(this.LJZI);
        }
        WidgetManager widgetManager = this.LJZL;
        if (widgetManager != null) {
            widgetManager.vl(R.id.d6z, new FeedTitleWidget());
            widgetManager.vl(R.id.d7k, new MusicInfoWidget());
            widgetManager.vl(R.id.d7j, new MusicCoverWidget());
            widgetManager.vl(R.id.d7f, new DiggWidget());
            widgetManager.vl(R.id.d7c, new VideoProgressBarWidget());
        }
        longPressLayout.setTapListener(tapTouchListener);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 313));
        C16880lQ.LJJIJL(c72434Sbm, new ACListenerS24S0100000_4(this, 314));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        try {
            C82705Wd3.LIZJ = C63081OpJ.LJJJJLI(context);
            C82704Wd2.LIZ(context);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}

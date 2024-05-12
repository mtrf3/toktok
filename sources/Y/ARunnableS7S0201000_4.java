package Y;

import X.AX9;
import X.AnonymousClass948;
import X.C09900aA;
import X.C16880lQ;
import X.C184077Kh;
import X.C198517qh;
import X.C208948Hy;
import X.C211128Qi;
import X.C211248Qu;
import X.C214298b3;
import X.C214348b8;
import X.C214528bQ;
import X.C222588oQ;
import X.C223498pt;
import X.C226108u6;
import X.C2301491m;
import X.C2301791p;
import X.C2301991r;
import X.C2303492g;
import X.C2308394d;
import X.C26240ARo;
import X.C29701Eo;
import X.C31081Jw;
import X.C31319CQx;
import X.C34710Djm;
import X.C36922EeM;
import X.C38354F3m;
import X.C50420Jqa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78841Uwv;
import X.C78926UyI;
import X.C84193Sd;
import X.C8SG;
import X.C91K;
import X.C92D;
import X.C92M;
import X.C92N;
import X.C94C;
import X.C9BD;
import X.C9BE;
import X.CRD;
import X.EF7;
import X.EnumC221088m0;
import X.FAJ;
import X.FN7;
import X.FW4;
import X.HG3;
import X.InterfaceC2302191t;
import X.InterfaceC2302291u;
import X.InterfaceC55219Lln;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import X.KL2;
import X.LEZ;
import X.LFH;
import X.OJM;
import X.RBX;
import X.RunnableC31370CSw;
import X.UW2;
import X.ViewOnAttachStateChangeListenerC40901G3l;
import X.ViewTreeObserverOnGlobalLayoutListenerC26229ARd;
import X.X1D;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.DisableLiveOptimizeStrategy;
import com.bytedance.android.livesdk.watch.WatchLiveService;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyTemp;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ARunnableS7S0201000_4 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            View contentView = ((PopupWindow) this.l0).getContentView();
            if (contentView == null) {
                return;
            }
            AX9.LIZIZ.put(Integer.valueOf(this.i2), (C26240ARo) this.l1);
            int i = this.i2;
            ViewTreeObserverOnGlobalLayoutListenerC26229ARd viewTreeObserverOnGlobalLayoutListenerC26229ARd = new ViewTreeObserverOnGlobalLayoutListenerC26229ARd(contentView, i);
            ViewOnAttachStateChangeListenerC40901G3l viewOnAttachStateChangeListenerC40901G3l = new ViewOnAttachStateChangeListenerC40901G3l(i, contentView);
            ViewTreeObserver viewTreeObserver = contentView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC26229ARd);
            }
            contentView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC40901G3l);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZ$1() {
        WatchLiveService watchLiveService = (WatchLiveService) this.l0;
        int i = this.i2;
        Map map = (Map) this.l1;
        watchLiveService.getClass();
        if (i == 1) {
            String str = (String) map.get("enter_from_merge");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = (String) map.get("enter_method");
            if (str3 != null) {
                str2 = str3;
            }
            String str4 = (String) map.get("action_type");
            if (str4 == null) {
                str4 = "click";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append('-');
            LIZ.append(str2);
            LIZ.append('-');
            LIZ.append(str4);
            if (o.LJ(DisableLiveOptimizeStrategy.INSTANCE.getValue().get(X1D.LIZIZ(LIZ)), Boolean.TRUE)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
            LiveStrategyManager.inst().setRoomInfo(jSONObject.toString(), 50, 0L);
        }
    }

    public static final void run$0(ARunnableS7S0201000_4 aRunnableS7S0201000_4) {
        boolean LIZ;
        try {
            ((VideoViewModel) aRunnableS7S0201000_4.l0).setState(new AqS29S0001000_4(aRunnableS7S0201000_4.i2, 4));
            ((VideoViewModel) aRunnableS7S0201000_4.l0).setState(new AqS94S0101000_4(aRunnableS7S0201000_4.i2, (C2301491m) aRunnableS7S0201000_4.l1, 9));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0201000_4 aRunnableS7S0201000_4) {
        boolean LIZ;
        try {
            aRunnableS7S0201000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S0201000_4 aRunnableS7S0201000_4) {
        TagLayout tagLayout;
        C211248Qu c211248Qu;
        C214298b3 c214298b3;
        VideoPlaySearchViewModel videoPlaySearchViewModel;
        int i = 0;
        switch (aRunnableS7S0201000_4.i2) {
            case 0:
                ARunnableS41S0100000_5 aRunnableS41S0100000_5 = (ARunnableS41S0100000_5) aRunnableS7S0201000_4.l0;
                CRD crd = (CRD) aRunnableS7S0201000_4.l1;
                C31319CQx c31319CQx = (C31319CQx) aRunnableS41S0100000_5.l0;
                if (c31319CQx.mView == 0) {
                    return;
                }
                c31319CQx.LLJJJ.LIZJ(new RunnableC31370CSw(i, c31319CQx, crd));
                c31319CQx.LJJJLL(crd);
                crd.LIZLLL().LIZJ = SystemClock.uptimeMillis();
                c31319CQx.LJLIL.LJFF(crd);
                return;
            case 1:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS7S0201000_4.l0;
                C2308394d c2308394d = (C2308394d) aRunnableS7S0201000_4.l1;
                livePlayFragment.getClass();
                livePlayFragment.Nm(c2308394d.LIZ);
                return;
            case 2:
                VideoViewCell videoViewCell = (VideoViewCell) aRunnableS7S0201000_4.l0;
                C222588oQ c222588oQ = (C222588oQ) aRunnableS7S0201000_4.l1;
                videoViewCell.getClass();
                FAJ.LIZ("tryplay_duration", false);
                FAJ.LIZ("tryplay_videoviewcell_init", false);
                if (FN7.LIZ() && videoViewCell.getActivity() == null) {
                    return;
                }
                videoViewCell.LLLL = (VideoEventDispatchViewModel) C214348b8.LIZJ(videoViewCell, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C92N.INSTANCE, EnumC221088m0.SYNCHRONIZED).getValue();
                Fragment fragment = c222588oQ.LIZJ;
                boolean z = true;
                if (fragment != null && fragment.mo49getActivity() != null) {
                    Fragment component = c222588oQ.LIZJ;
                    o.LJIIIZ(component, "component");
                    if (component.mo49getActivity() == null) {
                        videoPlaySearchViewModel = null;
                    } else {
                        C9BD c9bd = C9BD.LIZ;
                        C65776Prg LIZ = C65352Pkq.LIZ(VideoPlaySearchViewModel.class);
                        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1645);
                        C92M c92m = C92M.INSTANCE;
                        if (o.LJ(c9bd, c9bd)) {
                            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(component, true), C78926UyI.LJJIIJZLJL(component, true), C184077Kh.LJLIL, C78926UyI.LJJ(component, true), C78926UyI.LJIILLIIL(component, true), c92m, LIZ);
                        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
                            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(component, false), C78926UyI.LJJIIJZLJL(component, false), C184077Kh.LJLIL, C78926UyI.LJJ(component, false), C78926UyI.LJIILLIIL(component, false), c92m, LIZ);
                        } else {
                            throw new IllegalArgumentException("Do not support this scope here.");
                        }
                        videoPlaySearchViewModel = (VideoPlaySearchViewModel) c214298b3.getValue();
                    }
                    videoViewCell.LLLLII = videoPlaySearchViewModel;
                }
                View view = c222588oQ.LIZ;
                videoViewCell.LLJJJIL = view.getContext();
                InterfaceC72642tA<C50420Jqa> interfaceC72642tA = c222588oQ.LIZIZ;
                View.OnTouchListener onTouchListener = c222588oQ.LIZLLL;
                Fragment fragment2 = c222588oQ.LIZJ;
                BaseFeedPageParams baseFeedPageParams = videoViewCell.LLLLZLLIL;
                if (TextUtils.equals("from_publish_add_video", baseFeedPageParams.param.getFrom())) {
                    videoViewCell.LLJL = true;
                }
                InterfaceC2302191t interfaceC2302191t = c222588oQ.LJFF;
                View.OnTouchListener onTouchListener2 = c222588oQ.LJII;
                if (onTouchListener2 != null) {
                    videoViewCell.LLL = onTouchListener2;
                }
                C92D c92d = c222588oQ.LJIIIIZZ;
                if (c92d != null) {
                    videoViewCell.LLLF = c92d;
                } else {
                    videoViewCell.LLLF = new C2301791p(videoViewCell.LLJJJIL, baseFeedPageParams);
                }
                videoViewCell.LLLLZLLIL = baseFeedPageParams;
                videoViewCell.LLLLZLLLI = baseFeedPageParams.awemeFromPage;
                videoViewCell.LLLLZIL = interfaceC2302191t;
                try {
                    videoViewCell.LLFII = (SmartImageView) view.findViewById(R.id.cover);
                    videoViewCell.LLIFFJFJJ = view.findViewById(R.id.gradual_bottom);
                    videoViewCell.LLII = (C94C) view.findViewById(R.id.dy6);
                    videoViewCell.LLIIII = view.findViewById(R.id.gradual_top);
                    if (!C34710Djm.LJFF() && (c211248Qu = videoViewCell.LLIIIJ) != null) {
                        View findViewById = view.findViewById(R.id.klb);
                        if (!C2301991r.LIZ()) {
                            c211248Qu.LJ = findViewById;
                        }
                    }
                    if (!((Boolean) C34710Djm.LJJIL.getValue()).booleanValue()) {
                        C211248Qu c211248Qu2 = videoViewCell.LLIIIJ;
                        if (c211248Qu2 != null) {
                            if (!C2301991r.LIZ()) {
                                c211248Qu2.LIZJ = C8SG.LIZIZ.LIZ.LJJII(view);
                            }
                            C211248Qu c211248Qu3 = videoViewCell.LLIIIJ;
                            c211248Qu3.getClass();
                            if (!C2301991r.LIZ()) {
                                c211248Qu3.LIZLLL = C91K.LIZIZ.LIZ.LIZ(view);
                            }
                            C211248Qu c211248Qu4 = videoViewCell.LLIIIJ;
                            c211248Qu4.getClass();
                            if (!C2301991r.LIZ()) {
                                c211248Qu4.LIZIZ = C211128Qi.LIZIZ.LIZ.LIZIZ(view);
                            }
                            C211248Qu c211248Qu5 = videoViewCell.LLIIIJ;
                            C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.n7h);
                            c211248Qu5.getClass();
                            if (!C2301991r.LIZ()) {
                                c211248Qu5.LJI = c29701Eo;
                            }
                        }
                        videoViewCell.LLJJIJI = (C208948Hy) view.findViewById(R.id.c3t);
                        videoViewCell.LLIIIILZ = (C2303492g) view.findViewById(R.id.mhp);
                        videoViewCell.LLJJ = (TextView) view.findViewById(R.id.ms8);
                        videoViewCell.LLJILJIL = (ViewGroup) view.findViewById(R.id.arz);
                    }
                    C211248Qu c211248Qu6 = videoViewCell.LLIIIJ;
                    if (c211248Qu6 != null) {
                        TagLayout tagLayout2 = (TagLayout) view.findViewById(R.id.n8z);
                        if (!C2301991r.LIZ()) {
                            c211248Qu6.LJFF = tagLayout2;
                        }
                    }
                    if (videoViewCell.LLJZIJLIL == null) {
                        videoViewCell.LLJZIJLIL = new CellSurveyTemp(videoViewCell, view, videoViewCell.LLJLILLLLZIIL);
                    }
                    videoViewCell.LLIIIL = (ViewStub) view.findViewById(R.id.itk);
                    videoViewCell.LLIIIZ = (ViewStub) view.findViewById(R.id.d72);
                    ImageView imageView = (ImageView) view.findViewById(R.id.hrs);
                    videoViewCell.LLIIJI = imageView;
                    C78841Uwv.LIZIZ(videoViewCell.LLJJJIL, imageView);
                    videoViewCell.LLILII = (LinearLayout) view.findViewById(R.id.j2q);
                    videoViewCell.LLILL = (ViewGroup) view.findViewById(R.id.adr);
                    videoViewCell.LLILIL = (LinearLayout) view.findViewById(R.id.epl);
                    videoViewCell.LLILLIZIL = (ViewGroup) view.findViewById(R.id.adq);
                    videoViewCell.LLILZ = (FrameLayout) view.findViewById(R.id.view_rootview);
                    videoViewCell.LLILZLL = (FrameLayout) view.findViewById(R.id.i_g);
                    videoViewCell.LLIZ = (FrameLayout) view.findViewById(R.id.c1o);
                    videoViewCell.LLJI = (RelativeLayout) view.findViewById(R.id.lhs);
                    videoViewCell.LLJIJIL = (FrameLayout) view.findViewById(R.id.hqw);
                    videoViewCell.LLJILLL = (ViewGroup) view.findViewById(R.id.n9m);
                    videoViewCell.LLJJI = videoViewCell.V8("download_progress_view", false);
                    videoViewCell.LLJJIII = (FrameLayout) view.findViewById(R.id.eq0);
                    videoViewCell.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.bnf);
                    LFH.LIZIZ.LIZLLL().LJIIZILJ();
                    videoViewCell.LLJILJILJ = LEZ.LIZ.LJ(view);
                    videoViewCell.LLLLIIL = (FrameLayout) view.findViewById(R.id.k5d);
                    View findViewById2 = view.findViewById(R.id.title);
                    if (findViewById2 != null) {
                        C16880lQ.LJIIJ(new ACListenerS30S0101000_13(0, videoViewCell, 6), findViewById2);
                    }
                } catch (IllegalStateException unused) {
                    String name = videoViewCell.getClass().getName();
                    StringBuilder sb = new StringBuilder();
                    StringBuilder LIZJ = b1.LIZJ(name, "type=");
                    LIZJ.append(view.getClass().getName());
                    LIZJ.append('\n');
                    sb.append(X1D.LIZIZ(LIZJ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(name);
                    LIZ2.append("id=");
                    LIZ2.append(view.getId());
                    LIZ2.append('\n');
                    sb.append(X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(name);
                    LIZ3.append("childCount=");
                    LIZ3.append(((ViewGroup) view).getChildCount());
                    sb.append(X1D.LIZIZ(LIZ3));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(name);
                    LIZ4.append("isX2COpen=");
                    LIZ4.append(FW4.LIZIZ);
                    sb.append(X1D.LIZIZ(LIZ4));
                    C36922EeM.LJ(sb.toString());
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("x2c_error", sb.toString());
                    JSONObject LJ = c198517qh.LJ();
                    if (LJ == null) {
                        LJ = new JSONObject();
                    }
                    try {
                        if (!TextUtils.isEmpty("")) {
                            LJ.put("service", "");
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    C09900aA.LJ("x2c_error", LJ);
                }
                videoViewCell.LLLIIII = new C31081Jw((BottomToastVM) ViewModelProviders.of(fragment2).get(BottomToastVM.class));
                LongPressLayout longPressLayout = videoViewCell.LLILLJJLI;
                if (longPressLayout != null) {
                    longPressLayout.setListener(videoViewCell.LLLF);
                }
                if (((RBX) HG3.LJIILL()).isLogin() && C38354F3m.LIZJ(EF7.LJIILIIL, "lark_inhouse")) {
                    z = false;
                }
                videoViewCell.LL = z;
                videoViewCell.LLD = videoViewCell.getEventType().equals("playlist");
                if (videoViewCell.LLFF == null) {
                    videoViewCell.LLFF = videoViewCell.LLFFF(c222588oQ);
                    videoViewCell.LLFZ();
                }
                if (!C226108u6.LIZ()) {
                    AnonymousClass948.LIZ(videoViewCell.LLIFFJFJJ);
                    if (C223498pt.LIZ) {
                        videoViewCell.LLIIII.setBackground(VideoViewCell.LLZLLLL);
                    } else {
                        videoViewCell.LLIIII.setBackgroundResource(R.drawable.aif);
                    }
                    videoViewCell.LLIIII.getLayoutParams().height = (int) KL2.LIZJ(videoViewCell.LLJJJIL, 136.0f);
                }
                videoViewCell.LJLLLLLL = fragment2;
                if (SharePrefCache.inst().getShowPlayerInfoUI().LIZ().booleanValue()) {
                    if (videoViewCell.LLI == null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) KL2.LIZJ(videoViewCell.LLJJJIL, 300.0f), (int) KL2.LIZJ(videoViewCell.LLJJJIL, 500.0f));
                        layoutParams.topMargin = (int) KL2.LIZJ(videoViewCell.LLJJJIL, 100.0f);
                        videoViewCell.LLI = new FrameLayout(videoViewCell.LLJJJIL);
                        int LIZJ2 = (int) KL2.LIZJ(videoViewCell.LLJJJIL, 8.0f);
                        videoViewCell.LLI.setPadding(LIZJ2, LIZJ2, LIZJ2, LIZJ2);
                        videoViewCell.LLILZ.addView(videoViewCell.LLI, layoutParams);
                    }
                    ((InterfaceC2302291u) ServiceManager.get().getService(InterfaceC2302291u.class)).LJJJJI();
                }
                videoViewCell.LLJJJJ = interfaceC72642tA;
                if (TextUtils.equals("upload", videoViewCell.getEventType())) {
                    videoViewCell.LLLLZLLIL.setEventType(null);
                }
                LongPressLayout longPressLayout2 = videoViewCell.LLILLJJLI;
                if (longPressLayout2 != null) {
                    longPressLayout2.setTapListener(onTouchListener);
                }
                videoViewCell.LLLLIIIILLL(false);
                Fragment fragment3 = videoViewCell.LJLLLLLL;
                if (fragment3 != null && fragment3.mo49getActivity() != null) {
                    WidgetManager Gl = WidgetManager.Gl(videoViewCell.LLILZ, videoViewCell.LJLLLLLL);
                    videoViewCell.LLLILZJ = Gl;
                    if (Gl != null) {
                        Gl.Hl(videoViewCell.LLLILZ);
                    }
                    videoViewCell.LL();
                }
                VideoEventDispatchViewModel videoEventDispatchViewModel = videoViewCell.LLLL;
                videoEventDispatchViewModel.LJLJJI = new AObjectS42S0101000_5(2, videoViewCell, 34);
                C211248Qu c211248Qu7 = videoViewCell.LLIIIJ;
                if (c211248Qu7 != null) {
                    o.LJIIIZ(fragment2, "fragment");
                    if (!C2301991r.LIZ()) {
                        videoEventDispatchViewModel.LJLJJL = new AqS49S0400000_3(fragment2, videoViewCell, videoViewCell.LJLLL, c211248Qu7, 16);
                    }
                }
                InterfaceC55219Lln.LJJ.getClass();
                WeakHashMap<Context, OJM<InterfaceC55219Lln>> weakHashMap = UW2.LIZJ;
                if (weakHashMap.get(videoViewCell.LLJJJIL) == null) {
                    weakHashMap.put(videoViewCell.LLJJJIL, new OJM<>());
                }
                weakHashMap.get(videoViewCell.LLJJJIL).LJIIZILJ(videoViewCell);
                C211248Qu c211248Qu8 = videoViewCell.LLIIIJ;
                if (c211248Qu8 != null) {
                    String eventType = videoViewCell.getEventType();
                    int i2 = videoViewCell.LLLLZLLLI;
                    boolean z2 = videoViewCell.LLLLZLLIL.isFromPostList;
                    if (!C2301991r.LIZ() && (tagLayout = c211248Qu8.LJFF) != null) {
                        tagLayout.setEventType(eventType);
                        tagLayout.setFeedFromPage(i2);
                        tagLayout.setFromPostPage(z2);
                    }
                }
                if (fragment2 == null || fragment2.mo49getActivity() == null) {
                    return;
                }
                C84193Sd.LIZ(fragment2.mo49getActivity()).LJZL.observe(fragment2, new AObserverS64S0101000_14(0, videoViewCell, 9));
                FAJ.LJFF("tryplay_videoviewcell_init", false);
                return;
            default:
                ((FilterManager) aRunnableS7S0201000_4.l0).lambda$updateVideoDenoiseFilter$9((JSONObject) aRunnableS7S0201000_4.l1);
                return;
        }
    }

    public static final void run$3(ARunnableS7S0201000_4 aRunnableS7S0201000_4) {
        boolean LIZ;
        try {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.aiu, C16880lQ.LLZIL(((View) aRunnableS7S0201000_4.l0).getContext()), null);
            View view = (View) aRunnableS7S0201000_4.l0;
            view.post(new ARunnableS5S0301000_4(aRunnableS7S0201000_4.i2, view, LLLZIIL, (InterfaceC88472Yns) aRunnableS7S0201000_4.l1, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S0201000_4 aRunnableS7S0201000_4) {
        boolean LIZ;
        try {
            ((InputMethodManager) aRunnableS7S0201000_4.l0).showSoftInput((View) aRunnableS7S0201000_4.l1, aRunnableS7S0201000_4.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S0201000_4 aRunnableS7S0201000_4) {
        boolean LIZ;
        try {
            aRunnableS7S0201000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0201000_4(View view, AqS170S0100000_4 aqS170S0100000_4, int i) {
        this.$t = i;
        this.l0 = view;
        this.i2 = R.id.n90;
        this.l1 = aqS170S0100000_4;
    }

    public ARunnableS7S0201000_4(WatchLiveService watchLiveService, Map map, int i) {
        this.$t = i;
        this.l0 = watchLiveService;
        this.i2 = 1;
        this.l1 = map;
    }

    public ARunnableS7S0201000_4(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip;

import X.A90;
import X.AbstractC234519Ih;
import X.AnonymousClass175;
import X.AnonymousClass176;
import X.C018905p;
import X.C03880Dg;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C188727au;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29306Beo;
import X.C30554Byw;
import X.C30868C9o;
import X.C38350F3i;
import X.C39471gl;
import X.C39481gm;
import X.C39491gn;
import X.C39501go;
import X.C47071t1;
import X.C5ML;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C72818Shy;
import X.C72877Siv;
import X.C72975SkV;
import X.C72977SkX;
import X.C72979SkZ;
import X.C72980Ska;
import X.C72981Skb;
import X.C72982Skc;
import X.C72983Skd;
import X.C72984Ske;
import X.C72985Skf;
import X.C72989Skj;
import X.C72990Skk;
import X.C72991Skl;
import X.C73051Slj;
import X.C73075Sm7;
import X.C76052yf;
import X.C76800UCe;
import X.C78473Uqz;
import X.C78529Urt;
import X.C79045V0n;
import X.C9KF;
import X.CN1;
import X.EnumC72987Skh;
import X.FMX;
import X.HG3;
import X.InterfaceC30442Bx8;
import X.InterfaceC73054Slm;
import X.InterfaceC74236TBo;
import X.InterfaceC88472Yns;
import X.KRJ;
import X.KRL;
import X.O6U;
import X.ORZ;
import X.OSZ;
import X.QOG;
import X.QOJ;
import X.QQG;
import X.RBX;
import X.SY4;
import X.X1D;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS31S0200000_12;
import Y.AfS58S0100000_6;
import Y.AfS64S0100000_12;
import Y.AfS7S0100100_12;
import Y.IDcS171S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage.LiveReplyClipFinishedMessage;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage.LiveReplySocketMessage;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage.LiveReplySpriteMessage;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS53S1200000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;

/* loaded from: classes13.dex */
public final class LiveReplayVideoClipActivity extends O6U implements KRL, QOJ {
    public C73051Slj LJLIL;
    public KRJ LJLILLLLZI;
    public C72975SkV LJLJI;
    public long LJLJJLL;
    public TuxTextView LJLLILLLL;
    public C72979SkZ LJLLJ;
    public A90 LJLLL;
    public C72981Skb LJLLLL;
    public boolean LJLLLLLL;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public String LJLJJI = "";
    public String LJLJJL = "";
    public final C72977SkX<Long> LJLJL = new C72977SkX<>(0L);
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public String LJLL = "";
    public String LJLLI = "";
    public final C72977SkX<Boolean> LJLZ = new C72977SkX<>(Boolean.FALSE);
    public final AqS162S0100000_12 LJZ = new AqS162S0100000_12(this, 755);
    public final AqS162S0100000_12 LJZI = new AqS162S0100000_12(this, 753);
    public final Map<OSZ<Long, Long>, Long> LJZL = new LinkedHashMap();
    public final Map<OSZ<Long, Long>, Long> LL = new LinkedHashMap();
    public final AqS162S0100000_12 LLD = new AqS162S0100000_12(this, 752);
    public final AqS178S0100000_12 LLF = new AqS178S0100000_12(this, 232);

    @Override // X.KRL
    public final void LIZJ(String str) {
    }

    @Override // X.KRL
    public final void LJIIIIZZ(float f, int i) {
    }

    @Override // X.KRL
    public final void LJIILL(String str) {
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KRL
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.KRL
    public final void onBuffering(boolean z) {
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.KRL
    public final void onPausePlay(String str) {
    }

    @Override // X.KRL
    public final void onPlayCompleted(String str) {
    }

    @Override // X.KRL
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.KRL
    public final void onPreparePlay(String str) {
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.KRL
    public final void onResumePlay(String str) {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C188727au LLIIIILZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("room_id", this.LJLJJL);
        c188727au.LJIIIZ("enter_from_page", this.LJLJLJ);
        c188727au.LJIIIZ("enter_from", this.LJLJLLL);
        c188727au.LJIIIZ("last_page", this.LJLL);
        c188727au.LJIIIZ("event_page", "clip_page");
        c188727au.LIZLLL((int) (this.LJLJL.LIZIZ.longValue() / 1000), "total_duration");
        c188727au.LJIIIZ("click_position", this.LJLLI);
        return c188727au;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String BRAND = Build.BRAND;
        if (!"samsung".equalsIgnoreCase(BRAND)) {
            o.LJIIIIZZ(BRAND, "BRAND");
            String lowerCase = BRAND.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!o.LJ(lowerCase, "google")) {
                return;
            }
        }
        this.LJZ.invoke();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78529Urt(new JSONObject()), "onLiveReplayVideoClipActivityDestroy"));
        A90 a90 = this.LJLLL;
        if (a90 != null) {
            a90.dismiss();
        }
        this.LJLLL = null;
        QQG.LIZ().LIZ.LJIJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.QOJ
    public final void LJJLJ(LiveReplySocketMessage liveReplySocketMessage) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveMsg:");
        LIZ.append(liveReplySocketMessage);
        C0NB.LIZIZ("LiveReplayVideoClip", X1D.LIZIZ(LIZ));
        if (liveReplySocketMessage instanceof LiveReplySpriteMessage) {
            C72979SkZ c72979SkZ = this.LJLLJ;
            if (c72979SkZ != null) {
                LiveReplySpriteMessage liveReplySpriteMessage = (LiveReplySpriteMessage) liveReplySocketMessage;
                c72979SkZ.LIZIZ(liveReplySpriteMessage.getStartTime(), true, liveReplySpriteMessage.getEndTime(), liveReplySpriteMessage.getFrameList());
                return;
            } else {
                o.LJIJI("scrollHandleConfig");
                throw null;
            }
        }
        if (!(liveReplySocketMessage instanceof LiveReplyClipFinishedMessage)) {
            return;
        }
        Iterator it = ((LinkedHashMap) this.LJZL).entrySet().iterator();
        while (it.hasNext()) {
            if (((Number) ((Map.Entry) it.next()).getValue()).longValue() == ((LiveReplyClipFinishedMessage) liveReplySocketMessage).getFragmentId()) {
                return;
            }
        }
        Iterator it2 = ((LinkedHashMap) this.LL).entrySet().iterator();
        while (it2.hasNext()) {
            LiveReplyClipFinishedMessage liveReplyClipFinishedMessage = (LiveReplyClipFinishedMessage) liveReplySocketMessage;
            if (((Number) ((Map.Entry) it2.next()).getValue()).longValue() == liveReplyClipFinishedMessage.getFragmentId()) {
                A90 a90 = this.LJLLL;
                if (a90 != null) {
                    a90.LIZLLL(20.0f);
                }
                long fragmentId = liveReplyClipFinishedMessage.getFragmentId();
                ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getLiveReplayFragment(fragmentId).LJJJLIIL(new C72990Skk(this, fragmentId), new AfS7S0100100_12(this, fragmentId, 2));
                return;
            }
        }
    }

    public final void LLIIIJ(long j) {
        long j2;
        C0NB.LIZIZ("LiveReplayVideoClip", "postingRecord key removed");
        this.LJLLLLLL = false;
        C73051Slj c73051Slj = this.LJLIL;
        if (c73051Slj != null) {
            c73051Slj.LJ();
            if (!((Boolean) this.LJZI.invoke()).booleanValue()) {
                AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 754);
                C47071t1 c47071t1 = new C47071t1(this);
                c47071t1.LJII(C15380j0.LJIILJJIL(R.string.nxa));
                AnonymousClass175 anonymousClass175 = new AnonymousClass175();
                C39471gl c39471gl = new C39471gl();
                c39471gl.LIZ = C15380j0.LJIILJJIL(R.string.nxd);
                c39471gl.LIZJ = new IDcS171S0100000_12(aqS162S0100000_12, 7);
                anonymousClass175.LIZ(new C39481gm(c39471gl));
                C39491gn c39491gn = new C39491gn();
                c39491gn.LIZ = C15380j0.LJIILJJIL(R.string.nwr);
                c39491gn.LIZJ = C5ML.LJLIL;
                anonymousClass175.LIZ(new C39501go(c39491gn));
                anonymousClass175.LIZIZ = 2;
                c47071t1.LIZJ(new AnonymousClass176(anonymousClass175));
                c47071t1.LJIILL = false;
                c47071t1.LJIILJJIL = false;
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-7025421254513821745")).LIZ) {
                    LIZ.show();
                }
            } else {
                LLIL("1", "1");
            }
            if ((!this.LL.isEmpty()) && this.LL.size() == 1) {
                j2 = ((Number) ORZ.LJLLILLLL(((LinkedHashMap) this.LL).values())).longValue();
            } else {
                j2 = 0;
            }
            C72991Skl.LIZIZ("termination", String.valueOf(j2));
            C188727au LLIIIILZ = LLIIIILZ();
            LLIIIILZ.LJ(j, "duration");
            LLIIIILZ.LJ(j2, "clip_id");
            FMX.LJIIL("livesdk_live_replay_clip_post_cancel", LLIIIILZ.LIZ);
            ((LinkedHashMap) this.LL).clear();
            return;
        }
        o.LJIJI("playerView");
        throw null;
    }

    public final void LLIIIZ(EnumC72987Skh enumC72987Skh) {
        String str;
        OSZ<Long, Long> osz = (OSZ) this.LLD.invoke();
        long longValue = osz.getFirst().longValue();
        long longValue2 = osz.getSecond().longValue();
        if (enumC72987Skh != EnumC72987Skh.SAVE) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (((Boolean) this.LJZI.invoke()).booleanValue()) {
            LLIL("1", str);
            C30868C9o.LJI(getString(R.string.nx_));
        } else {
            this.LJZL.put(osz, 0L);
            LLII(longValue, longValue2, 1, new AqS53S1200000_12(this, (LiveReplayVideoClipActivity) osz, (OSZ<Long, Long>) str, (String) 5), new AqS143S0200000_12(this, (LiveReplayVideoClipActivity) osz, (OSZ<Long, Long>) 47));
        }
    }

    public final AqS155S0100000_5 LLIIJI(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("room_id", this.LJLJJL);
        c188727au.LJIIIZ("action_type", str);
        return new AqS155S0100000_5(c188727au, 333);
    }

    public final AqS158S0100000_8 LLIIJLIL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("room_id", this.LJLJJL);
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("action_type", str);
        return new AqS158S0100000_8(c188727au.LIZ, (Map<String, String>) 571);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLIILII(String str) {
        OSZ osz = (OSZ) this.LLD.invoke();
        long longValue = ((Number) osz.getFirst()).longValue();
        long longValue2 = ((Number) osz.getSecond()).longValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("room_id", this.LJLJJL);
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJ(longValue2 - longValue, "duration");
        c188727au.LIZLLL((int) (this.LJLJL.LIZIZ.longValue() / 1000), "total_duration");
        c188727au.LJ(longValue, "start_time");
        C72979SkZ c72979SkZ = this.LJLLJ;
        if (c72979SkZ != null) {
            C72977SkX c72977SkX = c72979SkZ.LJJIII;
            InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = C72979SkZ.LJJIJIIJIL;
            InterfaceC74236TBo<Object> property = interfaceC74236TBoArr[0];
            c72977SkX.getClass();
            o.LJIIIZ(property, "property");
            c188727au.LIZLLL(((Number) c72977SkX.LIZIZ).intValue(), "block_cnt");
            C72981Skb c72981Skb = this.LJLLLL;
            if (c72981Skb != null) {
                c188727au.LIZLLL(c72981Skb.getHandleCount(), "handle_cnt");
                C72979SkZ c72979SkZ2 = this.LJLLJ;
                if (c72979SkZ2 != null) {
                    C72977SkX c72977SkX2 = c72979SkZ2.LJJIIJZLJL;
                    InterfaceC74236TBo<Object> property2 = interfaceC74236TBoArr[1];
                    c72977SkX2.getClass();
                    o.LJIIIZ(property2, "property");
                    c188727au.LIZLLL(((Number) c72977SkX2.LIZIZ).intValue(), "move_cnt");
                    c188727au.LJIIIZ("exit_type", str);
                    FMX.LJIIL("livesdk_live_replay_clip_drag", c188727au.LIZ);
                    return;
                }
                o.LJIJI("scrollHandleConfig");
                throw null;
            }
            o.LJIJI("scrollHandle");
            throw null;
        }
        o.LJIJI("scrollHandleConfig");
        throw null;
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onCreate", true);
        super.onCreate(bundle);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "videoUrl");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLJJI = LLJJIJIIJIL;
        this.LJLJL.LIZIZ(Long.valueOf(getIntent().getLongExtra("videoLengthMS", 0L)));
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "videoId");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        this.LJLJJL = LLJJIJIIJIL2;
        this.LJLJJLL = getIntent().getLongExtra("initialTimeMS", 0L);
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "enterFromPage");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        this.LJLJLJ = LLJJIJIIJIL3;
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "enterFrom");
        if (LLJJIJIIJIL4 == null) {
            LLJJIJIIJIL4 = "";
        }
        this.LJLJLLL = LLJJIJIIJIL4;
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "lastPage");
        if (LLJJIJIIJIL5 == null) {
            LLJJIJIIJIL5 = "";
        }
        this.LJLL = LLJJIJIIJIL5;
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "click_position");
        if (LLJJIJIIJIL6 != null) {
            str = LLJJIJIIJIL6;
        }
        this.LJLLI = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initialTime");
        LIZ.append(this.LJLJJLL);
        C0NB.LIZIZ("LiveReplayVideoClip", X1D.LIZIZ(LIZ));
        FMX.LJIIL("livesdk_live_replay_clip_page_show", LLIIIILZ().LIZ);
        setContentView(R.layout.bqg);
        QOG.LJLIL.LIZIZ();
        View findViewById = findViewById(R.id.fy5);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.live_replay_clip_player_view)");
        this.LJLIL = (C73051Slj) findViewById;
        View findViewById2 = findViewById(R.id.fy4);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.live_replay_clip_player_slider)");
        this.LJLJI = (C72975SkV) findViewById2;
        o.LJIIIIZZ(findViewById(R.id.fy3), "findViewById(R.id.live_replay_clip_current_time)");
        View findViewById3 = findViewById(R.id.fy7);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.live_replay_clip_total_time)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLLILLLL = tuxTextView;
        tuxTextView.setText(C73075Sm7.LIZ((int) (((float) this.LJLJL.LIZIZ.longValue()) / 1000.0f)));
        View findViewById4 = findViewById(R.id.jd3);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.scrollhandle)");
        this.LJLLLL = (C72981Skb) findViewById4;
        C73051Slj c73051Slj = this.LJLIL;
        if (c73051Slj != null) {
            this.LJLILLLLZI = new KRJ(c73051Slj);
            KRJ krj = this.LJLILLLLZI;
            if (krj != null) {
                C72977SkX<Long> c72977SkX = this.LJLJL;
                C72977SkX<Boolean> c72977SkX2 = this.LJLZ;
                String str2 = this.LJLJJL;
                long j = this.LJLJJLL - 1000;
                if (j < 0) {
                    j = 0;
                }
                C72979SkZ c72979SkZ = new C72979SkZ(this, krj, c72977SkX, c72977SkX2, str2, j);
                Activity activity = c72979SkZ.LIZ;
                View findViewById5 = activity.findViewById(R.id.fy5);
                o.LJIIIIZZ(findViewById5, "findViewById(R.id.live_replay_clip_player_view)");
                c72979SkZ.LJI = (C73051Slj) findViewById5;
                View findViewById6 = activity.findViewById(R.id.fy3);
                o.LJIIIIZZ(findViewById6, "findViewById(R.id.live_replay_clip_current_time)");
                c72979SkZ.LJII = (TuxTextView) findViewById6;
                View findViewById7 = activity.findViewById(R.id.fy7);
                o.LJIIIIZZ(findViewById7, "findViewById(R.id.live_replay_clip_total_time)");
                c72979SkZ.LJIIIIZZ = (TuxTextView) findViewById7;
                View findViewById8 = activity.findViewById(R.id.jd3);
                o.LJIIIIZZ(findViewById8, "findViewById(R.id.scrollhandle)");
                c72979SkZ.LJIILLIIL = (C72981Skb) findViewById8;
                View findViewById9 = activity.findViewById(R.id.ist);
                o.LJIIIIZZ(findViewById9, "findViewById(R.id.recyclerview)");
                c72979SkZ.LJIIZILJ = (RecyclerView) findViewById9;
                View findViewById10 = activity.findViewById(R.id.fy5);
                o.LJIIIIZZ(findViewById10, "findViewById(R.id.live_replay_clip_player_view)");
                c72979SkZ.LJI = (C73051Slj) findViewById10;
                View findViewById11 = activity.findViewById(R.id.fy4);
                o.LJIIIIZZ(findViewById11, "findViewById(R.id.live_replay_clip_player_slider)");
                c72979SkZ.LJIIIZ = (C72975SkV) findViewById11;
                ViewGroup.LayoutParams layoutParams = activity.findViewById(R.id.fyd).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                c72979SkZ.LJIJ = ((C018905p) layoutParams).guideBegin;
                ViewGroup.LayoutParams layoutParams2 = activity.findViewById(R.id.fyf).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                c72979SkZ.LJIJI = ((C018905p) layoutParams2).guideEnd;
                c72979SkZ.LIZLLL.LIZ();
                KRJ krj2 = c72979SkZ.LIZIZ;
                C72982Skc c72982Skc = new C72982Skc(c72979SkZ);
                krj2.getClass();
                ((ArrayList) krj2.LJIIJJI).add(c72982Skc);
                c72979SkZ.LIZ();
                c72979SkZ.LIZJ();
                c72979SkZ.LIZLLL();
                this.LJLLJ = c72979SkZ;
                C73051Slj c73051Slj2 = this.LJLIL;
                if (c73051Slj2 != null) {
                    c73051Slj2.setCurrentPercentage(c72979SkZ.LJJI);
                    Video video = new Video();
                    LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("live_replay_video_");
                    LIZ2.append(this.LJLJJI);
                    localVideoUrlModel.setSourceId(X1D.LIZIZ(LIZ2));
                    localVideoUrlModel.setUrlList(new ArrayList());
                    localVideoUrlModel.getUrlList().add(this.LJLJJI);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("live_replay_video_");
                    LIZ3.append(this.LJLJJI);
                    localVideoUrlModel.setUrlKey(X1D.LIZIZ(LIZ3));
                    video.setPlayAddr(localVideoUrlModel);
                    KRJ krj3 = this.LJLILLLLZI;
                    if (krj3 != null) {
                        krj3.LIZLLL = video;
                        ((ArrayList) krj3.LJIIJJI).add(this);
                        new C72989Skj();
                        C72989Skj c72989Skj = new C72989Skj();
                        KRJ krj4 = this.LJLILLLLZI;
                        if (krj4 != null) {
                            c72989Skj.LIZ = krj4;
                            c72989Skj.LIZIZ = getWindow();
                            c72989Skj.LIZJ = this.LJLJL.LIZIZ;
                            C73051Slj c73051Slj3 = this.LJLIL;
                            if (c73051Slj3 != null) {
                                c73051Slj3.setParams(c72989Skj);
                                C73051Slj c73051Slj4 = this.LJLIL;
                                if (c73051Slj4 != null) {
                                    c73051Slj4.LJII(0.0f, true);
                                    C252709vu c252709vu = (C252709vu) findViewById(R.id.fye);
                                    Context context = c252709vu.getContext();
                                    o.LJIIIIZZ(context, "context");
                                    Integer LJI = C79045V0n.LJI(R.attr.dj, context);
                                    if (LJI != null) {
                                        i = LJI.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    C235119Kp c235119Kp = new C235119Kp();
                                    C234529Ii LIZJ = s1.LIZJ();
                                    LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
                                    LIZJ.LIZLLL = true;
                                    LIZJ.LIZIZ(this.LJZ);
                                    C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
                                    String string = getString(R.string.nwy);
                                    o.LJIIIIZZ(string, "getString(R.string.pm_re…lip_creatClipPage_header)");
                                    LIZLLL.LIZJ = string;
                                    c235119Kp.LIZJ = LIZLLL;
                                    C234529Ii LIZJ2 = s1.LIZJ();
                                    LIZJ2.LIZJ = R.raw.icon_question_mark_circle_ltr;
                                    LIZJ2.LIZLLL = true;
                                    LIZJ2.LIZIZ(new AqS159S0200000_12(this, c252709vu, 75));
                                    c235119Kp.LIZIZ(LIZJ2);
                                    c252709vu.setNavActions(c235119Kp);
                                    Integer LJI2 = C79045V0n.LJI(R.attr.d4, this);
                                    if (LJI2 != null) {
                                        i2 = LJI2.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    c252709vu.setNavBackground(i2);
                                    ((TextView) c252709vu.findViewById(R.id.gwk)).setTextColor(i);
                                    View findViewById12 = c252709vu.findViewById(R.id.gx0);
                                    o.LJIIIIZZ(findViewById12, "findViewById<LinearLayout>(R.id.nav_start)");
                                    View childAt = ((ViewGroup) findViewById12).getChildAt(0);
                                    o.LJII(childAt, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
                                    View findViewById13 = c252709vu.findViewById(R.id.gwr);
                                    o.LJIIIIZZ(findViewById13, "findViewById<LinearLayout>(R.id.nav_end)");
                                    View childAt2 = ((ViewGroup) findViewById13).getChildAt(0);
                                    o.LJII(childAt2, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
                                    ((TuxIconView) childAt).setTintColor(i);
                                    ((TuxIconView) childAt2).setTintColor(i);
                                    C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.z1;
                                    if (c30554Byw.LIZ() == null) {
                                        LiveClipBottomConfirmDialog liveClipBottomConfirmDialog = new LiveClipBottomConfirmDialog(this, LLIIJI("show"), LLIIJI("click"));
                                        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/clip/LiveClipBottomConfirmDialog", "show", liveClipBottomConfirmDialog, new Object[0], "void", new C65300Pk0(false, "()V", "5357631770258464824")).LIZ) {
                                            liveClipBottomConfirmDialog.show();
                                        }
                                        c30554Byw.LIZJ(Boolean.FALSE);
                                    }
                                    View findViewById14 = findViewById(R.id.fyc);
                                    findViewById14.getClass();
                                    C29306Beo.LJJJLL(findViewById14, 500L, new AqS178S0100000_12(this, 469));
                                    SY4 sy4 = (SY4) findViewById(R.id.fyg);
                                    Context context2 = sy4.getContext();
                                    o.LJIIIIZZ(context2, "context");
                                    Integer LJI3 = C79045V0n.LJI(R.attr.dj, context2);
                                    if (LJI3 != null) {
                                        i3 = LJI3.intValue();
                                    } else {
                                        i3 = 0;
                                    }
                                    sy4.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i3, i3}));
                                    sy4.LLF = false;
                                    sy4.LJJJJ();
                                    C16880lQ.LJJIZ(sy4, new ACListenerS32S0100000_12(this, 154));
                                    QQG.LIZ().LIZ.LJIIZILJ(this);
                                    getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity$addLifeCycle$observer$1
                                        @Override // androidx.lifecycle.LifecycleEventObserver
                                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                            if (event == Lifecycle.Event.ON_RESUME) {
                                                onResume();
                                                return;
                                            }
                                            if (event == Lifecycle.Event.ON_PAUSE) {
                                                onPause();
                                            } else if (event == Lifecycle.Event.ON_STOP) {
                                                onStop();
                                            } else if (event == Lifecycle.Event.ON_DESTROY) {
                                                onDestroy();
                                            }
                                        }

                                        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                                        public final void onDestroy() {
                                            C73051Slj c73051Slj5 = LiveReplayVideoClipActivity.this.LJLIL;
                                            if (c73051Slj5 != null) {
                                                c73051Slj5.LIZIZ();
                                            } else {
                                                o.LJIJI("playerView");
                                                throw null;
                                            }
                                        }

                                        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                                        public final void onResume() {
                                            LiveReplayVideoClipActivity liveReplayVideoClipActivity = LiveReplayVideoClipActivity.this;
                                            C73051Slj c73051Slj5 = liveReplayVideoClipActivity.LJLIL;
                                            if (c73051Slj5 != null) {
                                                c73051Slj5.post(new ARunnableS31S0200000_12(c73051Slj5, liveReplayVideoClipActivity, 16));
                                            } else {
                                                o.LJIJI("playerView");
                                                throw null;
                                            }
                                        }

                                        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                                        public final void onStop() {
                                            C73051Slj c73051Slj5 = LiveReplayVideoClipActivity.this.LJLIL;
                                            if (c73051Slj5 != null) {
                                                InterfaceC73054Slm interfaceC73054Slm = c73051Slj5.LJLJJLL;
                                                if (interfaceC73054Slm != null) {
                                                    interfaceC73054Slm.stop();
                                                    return;
                                                }
                                                return;
                                            }
                                            o.LJIJI("playerView");
                                            throw null;
                                        }

                                        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                                        public final void onPause() {
                                            LiveOuterService.LJJJLL().LJJJIL();
                                            C78473Uqz.LIZIZ(false);
                                            C73051Slj c73051Slj5 = LiveReplayVideoClipActivity.this.LJLIL;
                                            if (c73051Slj5 != null) {
                                                c73051Slj5.LIZLLL();
                                            } else {
                                                o.LJIJI("playerView");
                                                throw null;
                                            }
                                        }
                                    });
                                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity", "onCreate", false);
                                    return;
                                }
                                o.LJIJI("playerView");
                                throw null;
                            }
                            o.LJIJI("playerView");
                            throw null;
                        }
                        o.LJIJI("controller");
                        throw null;
                    }
                    o.LJIJI("controller");
                    throw null;
                }
                o.LJIJI("playerView");
                throw null;
            }
            o.LJIJI("controller");
            throw null;
        }
        o.LJIJI("playerView");
        throw null;
    }

    public final void LLIL(String str, String str2) {
        OSZ osz = (OSZ) this.LLD.invoke();
        long longValue = ((Number) osz.getFirst()).longValue();
        long longValue2 = ((Number) osz.getSecond()).longValue();
        C188727au LLIIIILZ = LLIIIILZ();
        LLIIIILZ.LJ(longValue, "start_time");
        LLIIIILZ.LJ(longValue2 - longValue, "duration");
        LLIIIILZ.LJIIIZ("is_same_clip", str);
        LLIIIILZ.LJIIIZ("is_post_cancel", str2);
        HashMap hashMap = (HashMap) LLIIIILZ.LIZ;
        hashMap.remove("event_page");
        FMX.LJIIL("livesdk_live_replay_clip_save_click", hashMap);
    }

    @Override // X.KRL
    public final void LJLIIL(int i, int i2, long j) {
        boolean z;
        this.LJLJL.LIZIZ(Long.valueOf(j));
        TuxTextView tuxTextView = this.LJLLILLLL;
        if (tuxTextView != null) {
            tuxTextView.setText(C73075Sm7.LIZ((int) (((float) j) / 1000.0f)));
            C73051Slj c73051Slj = this.LJLIL;
            if (c73051Slj != null) {
                c73051Slj.setVideoLength$live_release(j);
                boolean booleanValue = this.LJLZ.LIZIZ.booleanValue();
                C72977SkX<Boolean> c72977SkX = this.LJLZ;
                if (i > i2) {
                    z = true;
                } else {
                    z = false;
                }
                c72977SkX.LIZIZ(Boolean.valueOf(z));
                if (booleanValue == this.LJLZ.LIZIZ.booleanValue()) {
                    this.LJLZ.LIZ();
                }
                C72981Skb c72981Skb = this.LJLLLL;
                if (c72981Skb != null) {
                    c72981Skb.setStart(true);
                    C72975SkV c72975SkV = this.LJLJI;
                    if (c72975SkV != null) {
                        c72975SkV.setStart(true);
                        C72979SkZ c72979SkZ = this.LJLLJ;
                        if (c72979SkZ != null) {
                            c72979SkZ.LIZ();
                            c72979SkZ.LIZJ();
                            C72984Ske.LIZJ(c72979SkZ.LJIIJ, new AqS178S0100000_12(c72979SkZ, 591));
                            C72975SkV c72975SkV2 = c72979SkZ.LJIIIZ;
                            if (c72975SkV2 != null) {
                                c72975SkV2.setMotionEventMoveListener(new C72980Ska(c72979SkZ));
                                C72975SkV c72975SkV3 = c72979SkZ.LJIIIZ;
                                if (c72975SkV3 != null) {
                                    C72984Ske.LIZJ(c72975SkV3.getScrolling(), new AqS178S0100000_12(c72979SkZ, 588));
                                    int i3 = c72979SkZ.LJIJJ / c72979SkZ.LJIIJJI.LIZIZ.LJLJI;
                                    int size = c72979SkZ.LJIILIIL.LIZIZ.size();
                                    if (size % i3 > 0) {
                                        size++;
                                    }
                                    boolean[] zArr = new boolean[size];
                                    for (int i4 = 0; i4 < size; i4++) {
                                        zArr[i4] = true;
                                    }
                                    AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(c72979SkZ, zArr, 85);
                                    aqS159S0200000_12.invoke();
                                    C72983Skd c72983Skd = c72979SkZ.LJIILL;
                                    if (c72983Skd != null) {
                                        C72984Ske.LIZJ(c72983Skd.LJLIL, new AqS143S0200000_12(c72979SkZ, aqS159S0200000_12, 130));
                                        C72983Skd c72983Skd2 = c72979SkZ.LJIILL;
                                        if (c72983Skd2 != null) {
                                            C72984Ske.LIZJ(c72983Skd2.LJLIL, new AqS178S0100000_12(c72979SkZ, 590));
                                            C72983Skd c72983Skd3 = c72979SkZ.LJIILL;
                                            if (c72983Skd3 != null) {
                                                C72984Ske.LIZJ(c72983Skd3.LJLJJI, new AqS143S0200000_12(c72983Skd3, c72979SkZ, 131));
                                                c72979SkZ.LIZLLL();
                                                if (c72979SkZ.LJFF != 0) {
                                                    long j2 = 1000;
                                                    long longValue = c72979SkZ.LIZJ.LIZIZ.longValue() / j2;
                                                    long j3 = c72979SkZ.LJFF / j2;
                                                    C72877Siv c72877Siv = c72979SkZ.LJIIJJI.LIZIZ;
                                                    RecyclerView recyclerView = c72979SkZ.LJIIZILJ;
                                                    if (recyclerView != null) {
                                                        float f = (float) j3;
                                                        float f2 = c72877Siv.LJLJLLL * f;
                                                        if (!C72985Skf.LIZIZ(c72979SkZ.LIZ)) {
                                                            f2 = -f2;
                                                        }
                                                        recyclerView.scrollBy((int) f2, 0);
                                                        C72981Skb c72981Skb2 = c72979SkZ.LJIILLIIL;
                                                        if (c72981Skb2 != null) {
                                                            c72981Skb2.getPlayHeadToStart().invoke();
                                                            long j4 = longValue - c72877Siv.LJLILLLLZI;
                                                            if (j3 > j4) {
                                                                long j5 = j3 - j4;
                                                                C72981Skb c72981Skb3 = c72979SkZ.LJIILLIIL;
                                                                if (c72981Skb3 != null) {
                                                                    float f3 = ((float) j5) * c72877Siv.LJLJLLL;
                                                                    C72877Siv c72877Siv2 = c72981Skb3.LJLLJ.LIZIZ;
                                                                    float f4 = (c72877Siv2.LJLIL - c72877Siv2.LJLJJL) - c72877Siv2.LJLJJLL;
                                                                    int i5 = c72877Siv2.LJLJLJ;
                                                                    Float valueOf = Float.valueOf(c72981Skb3.LJLJJLL.LIZIZ.floatValue() - c72877Siv2.LJLJJL);
                                                                    Float valueOf2 = Float.valueOf((c72877Siv2.LJLIL - c72981Skb3.LJLJJL.LIZIZ.floatValue()) - c72877Siv2.LJLJJLL);
                                                                    if (i5 != 0) {
                                                                        valueOf = valueOf2;
                                                                    }
                                                                    float floatValue = f4 - valueOf.floatValue();
                                                                    if (f3 > floatValue) {
                                                                        f3 = floatValue;
                                                                    }
                                                                    int i6 = c72981Skb3.LJLLJ.LIZIZ.LJLJLJ;
                                                                    Float valueOf3 = Float.valueOf(f3);
                                                                    Float valueOf4 = Float.valueOf(-f3);
                                                                    if (i6 != 0) {
                                                                        valueOf3 = valueOf4;
                                                                    }
                                                                    float floatValue2 = valueOf3.floatValue();
                                                                    C72977SkX<Float> c72977SkX2 = c72981Skb3.LJLJJL;
                                                                    c72977SkX2.LIZIZ(Float.valueOf(c72977SkX2.LIZIZ.floatValue() + floatValue2));
                                                                    C72977SkX<Float> c72977SkX3 = c72981Skb3.LJLJJLL;
                                                                    c72977SkX3.LIZIZ(Float.valueOf(c72977SkX3.LIZIZ.floatValue() + floatValue2));
                                                                    C72977SkX<Float> c72977SkX4 = c72981Skb3.LLFF;
                                                                    c72977SkX4.LIZIZ(Float.valueOf(c72977SkX4.LIZIZ.floatValue() + floatValue2));
                                                                    c72981Skb3.invalidate();
                                                                    long j6 = c72877Siv.LJLILLLLZI - c72877Siv.LJLJL;
                                                                    if (j5 > j6) {
                                                                        long j7 = j5 - j6;
                                                                        if (j7 > 0) {
                                                                            C72981Skb c72981Skb4 = c72979SkZ.LJIILLIIL;
                                                                            if (c72981Skb4 != null) {
                                                                                float f5 = ((float) j7) * c72877Siv.LJLJLLL;
                                                                                C72977SkX<Float> c72977SkX5 = c72981Skb4.LLFF;
                                                                                float floatValue3 = c72977SkX5.LIZIZ.floatValue();
                                                                                int i7 = c72981Skb4.LJLLJ.LIZIZ.LJLJLJ;
                                                                                Float valueOf5 = Float.valueOf(f5);
                                                                                Float valueOf6 = Float.valueOf(-f5);
                                                                                if (i7 != 0) {
                                                                                    valueOf5 = valueOf6;
                                                                                }
                                                                                c72977SkX5.LIZIZ(Float.valueOf(valueOf5.floatValue() + floatValue3));
                                                                            } else {
                                                                                o.LJIJI("scrollHandle");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    o.LJIJI("scrollHandle");
                                                                    throw null;
                                                                }
                                                            }
                                                            c72979SkZ.LJJIFFI.invoke();
                                                            c72979SkZ.LJJII.invoke(Float.valueOf((f * c72877Siv.LJLJLLL) / c72979SkZ.LJIIL.LIZIZ.intValue()));
                                                        } else {
                                                            o.LJIJI("scrollHandle");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("spriteRecyclerView");
                                                        throw null;
                                                    }
                                                }
                                                C72981Skb c72981Skb5 = c72979SkZ.LJIILLIIL;
                                                if (c72981Skb5 != null) {
                                                    C72984Ske.LIZJ(c72981Skb5.getPlayHeadCenterX(), new AqS178S0100000_12(c72979SkZ, 589));
                                                    return;
                                                } else {
                                                    o.LJIJI("scrollHandle");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("spriteImageScrollListener");
                                            throw null;
                                        }
                                        o.LJIJI("spriteImageScrollListener");
                                        throw null;
                                    }
                                    o.LJIJI("spriteImageScrollListener");
                                    throw null;
                                }
                                o.LJIJI("playerSlider");
                                throw null;
                            }
                            o.LJIJI("playerSlider");
                            throw null;
                        }
                        o.LJIJI("scrollHandleConfig");
                        throw null;
                    }
                    o.LJIJI("playerSlider");
                    throw null;
                }
                o.LJIJI("scrollHandle");
                throw null;
            }
            o.LJIJI("playerView");
            throw null;
        }
        o.LJIJI("totalPlayTime");
        throw null;
    }

    public final void LLII(long j, long j2, int i, InterfaceC88472Yns<? super AnchorLiveFragmentEditResponse, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        Long LJJIZ = C38350F3i.LJJIZ(this.LJLJJL);
        if (LJJIZ != null) {
            long longValue = LJJIZ.longValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("clipOrSaveLiveReplayFragment, roomId:");
            LIZ.append(longValue);
            C0NB.LIZIZ("LiveReplayVideoClip", X1D.LIZIZ(LIZ));
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).clipOrSaveLiveReplayFragment(longValue, j, j2, i).LJJJLIIL(new AfS64S0100000_12((InterfaceC88472Yns) interfaceC88472Yns, 30), new AfS58S0100000_6(interfaceC88472Yns2, (InterfaceC88472Yns<? super Throwable, C76800UCe>) 15));
        }
    }
}

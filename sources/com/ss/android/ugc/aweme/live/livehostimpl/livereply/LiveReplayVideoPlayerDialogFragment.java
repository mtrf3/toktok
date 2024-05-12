package com.ss.android.ugc.aweme.live.livehostimpl.livereply;

import X.ActivityC45651qj;
import X.AnonymousClass175;
import X.AnonymousClass176;
import X.AnonymousClass391;
import X.B9K;
import X.C03880Dg;
import X.C0EP;
import X.C0ER;
import X.C0NB;
import X.C10A;
import X.C110614Vt;
import X.C116454hd;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C26338AVi;
import X.C29306Beo;
import X.C29541Dy;
import X.C29S;
import X.C30868C9o;
import X.C39471gl;
import X.C39481gm;
import X.C39491gn;
import X.C39501go;
import X.C3C5;
import X.C47071t1;
import X.C61328O5c;
import X.C61712OJw;
import X.C61713OJx;
import X.C65300Pk0;
import X.C72818Shy;
import X.C72989Skj;
import X.C73051Slj;
import X.C73053Sll;
import X.C73076Sm8;
import X.C73078SmA;
import X.C73079SmB;
import X.C73081SmD;
import X.C73089SmL;
import X.C76052yf;
import X.C76800UCe;
import X.C78473Uqz;
import X.C78529Urt;
import X.C7MY;
import X.C90193gN;
import X.C90903hW;
import X.CN1;
import X.DialogInterfaceOnKeyListenerC73080SmC;
import X.FMX;
import X.HG3;
import X.HandlerC73077Sm9;
import X.InterfaceC73054Slm;
import X.InterfaceC73092SmO;
import X.JIT;
import X.KRJ;
import X.RBX;
import X.SK0;
import X.SY9;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS48S0100000_12;
import Y.AfS64S0100000_12;
import Y.AfS7S0100100_12;
import Y.IDTListenerS120S0100000_12;
import Y.IDcS171S0100000_12;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayVideoGoClipMinimumDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayVideoShowClipEntranceSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class LiveReplayVideoPlayerDialogFragment extends DialogFragment implements InterfaceC73092SmO {
    public static final /* synthetic */ int LLI = 0;
    public KRJ LJLIL;
    public C73051Slj LJLILLLLZI;
    public C73053Sll LJLJI;
    public ConstraintLayout LJLJJI;
    public C116454hd LJLJJL;
    public ConstraintLayout LJLJJLL;
    public int LJLJLJ;
    public long LJLJLLL;
    public Boolean LJLL;
    public SK0 LJLLI;
    public boolean LJLLILLLL;
    public C73079SmB LJLLJ;
    public boolean LJLLL;
    public JIT LJZI;
    public boolean LJZL;
    public boolean LL;
    public HandlerC73077Sm9 LLD;
    public long LLF;
    public boolean LLFFF;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public String LJLJL = "";
    public String LJLLLL = "";
    public String LJLLLLLL = "";
    public String LJLZ = "";
    public String LJZ = "";
    public final int LLFF = LiveReplayVideoGoClipMinimumDurationSetting.getMinimumDuration();
    public final LiveReplayVideoPlayerDialogFragment$observer$1 LLFII = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment$observer$1
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
            C73051Slj c73051Slj = LiveReplayVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73051Slj != null) {
                c73051Slj.LIZIZ();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            C73051Slj c73051Slj = LiveReplayVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73051Slj != null) {
                c73051Slj.post(new ARunnableS48S0100000_12(c73051Slj, 43));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            InterfaceC73054Slm interfaceC73054Slm;
            C73051Slj c73051Slj = LiveReplayVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73051Slj != null && (interfaceC73054Slm = c73051Slj.LJLJJLL) != null) {
                interfaceC73054Slm.stop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            LiveOuterService.LJJJLL().LJJJIL();
            C78473Uqz.LIZIZ(false);
            C73051Slj c73051Slj = LiveReplayVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73051Slj != null) {
                c73051Slj.LIZLLL();
            }
        }
    };

    public static void vl(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-498884875566108783")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void Gl() {
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILLIIL(R.string.maq);
        c47071t1.LJFF(R.string.map);
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        C39471gl c39471gl = new C39471gl();
        c39471gl.LIZ = C15380j0.LJIILJJIL(R.string.man);
        c39471gl.LIZJ = new IDcS171S0100000_12(this, 0);
        anonymousClass175.LIZ(new C39481gm(c39471gl));
        C39491gn c39491gn = new C39491gn();
        c39491gn.LIZ = C15380j0.LJIILJJIL(R.string.mao);
        c39491gn.LIZJ = C73081SmD.LJLIL;
        anonymousClass175.LIZ(new C39501go(c39491gn));
        anonymousClass175.LIZIZ = 2;
        c47071t1.LIZJ(new AnonymousClass176(anonymousClass175));
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        vl(c47071t1.LIZ());
        Jl("livesdk_live_replay_click", "already_scheduled");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (this.LLFFF) {
            long currentTimeMillis = System.currentTimeMillis() - this.LLF;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJIIIZ("room_id", this.LJLLLLLL);
            c188727au.LJIIIZ("enter_from_page", this.LJLZ);
            c188727au.LJIIIZ("enter_from", this.LJZ);
            c188727au.LJIIIZ("event_page", "video_page");
            c188727au.LJ(currentTimeMillis / 1000, "duration");
            FMX.LJIIL("livesdk_live_replay_play_end", c188727au.LIZ);
        }
        HandlerC73077Sm9 handlerC73077Sm9 = this.LLD;
        if (handlerC73077Sm9 != null) {
            handlerC73077Sm9.removeMessages(0);
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78529Urt(new JSONObject()), "onLiveReplayVideoPlayerDialogDestroy"));
            C0ER LIZJ = C0ER.LIZJ();
            C73079SmB c73079SmB = this.LJLLJ;
            LIZJ.getClass();
            C0EP.LJFF().LIZIZ.remove(c73079SmB.LIZIZ());
            C0ER LIZJ2 = C0ER.LIZJ();
            String str = this.LJLLLL;
            String str2 = this.LJLLLLLL;
            C29541Dy c29541Dy = new C29541Dy(str, str2);
            LIZJ2.getClass();
            C0ER.LJ(str, str2, c29541Dy);
            this.LJLIL = null;
            C73051Slj c73051Slj = this.LJLILLLLZI;
            if (c73051Slj != null) {
                c73051Slj.LIZIZ();
            }
            this.LJLILLLLZI = null;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.setRequestedOrientation(1);
            }
            super.onDestroy();
            getLifecycle().removeObserver(this.LLFII);
            C73089SmL.LIZ().LIZ.LJIJ(this);
            this.LJZL = false;
            return;
        }
        o.LJIJI("handler");
        throw null;
    }

    public final void wl() {
        String str;
        C73078SmA.LIZJ(this.LJLLLLLL);
        C0ER LIZJ = C0ER.LIZJ();
        String str2 = this.LJLLLLLL;
        LIZJ.getClass();
        C0EP.LJFF().getClass();
        DownloadInfo LIZLLL = C0EP.LIZLLL(str2);
        C0ER LIZJ2 = C0ER.LIZJ();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (LIZLLL != null) {
            str = LIZLLL.getUrl();
        } else {
            str = null;
        }
        String str3 = this.LJLLLLLL;
        LIZJ2.getClass();
        C0ER.LJI(mo49getActivity, 1, str, str3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r8 != 2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xl() {
        /*
            r14 = this;
            X.SmB r0 = r14.LJLLJ
            r9 = 1
            if (r0 != 0) goto Ld7
        L5:
            X.0ER r2 = X.C0ER.LIZJ()
            java.lang.String r1 = r14.LJLLLL
            java.lang.String r0 = r14.LJLLLLLL
            r2.getClass()
            int r8 = X.C0ER.LIZLLL(r1, r0)
            X.0ER r0 = X.C0ER.LIZJ()
            java.lang.String r2 = r14.LJLLLL
            java.lang.String r1 = r14.LJLLLLLL
            r0.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lca
            X.0EP r0 = X.C0EP.LJFF()
            r0.getClass()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = X.C0EP.LIZLLL(r1)
        L30:
            r5 = 0
            if (r2 == 0) goto Lc7
            int r0 = r2.getStatus()
            int r0 = X.C0ER.LIZIZ(r0)
        L3b:
            r10 = 2
            if (r0 != r10) goto Lc3
            r2.isDownloaded()
        L41:
            X.0EQ r1 = new X.0EQ
            int r0 = r2.getDownloadProcess()
            r1.<init>(r0)
            int r2 = r1.LIZ
        L4c:
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            r7 = 33
            r3 = 2131370640(0x7f0a2290, float:1.8361292E38)
            r0 = 4
            java.lang.String r1 = "livesdk_live_replay_click"
            if (r8 == 0) goto L94
            if (r8 == r9) goto Ldb
            if (r8 == r10) goto L9b
            if (r8 == r0) goto L94
            java.lang.String r0 = "continue"
            r14.Jl(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r7) goto L85
        L69:
            android.view.View r0 = r14._$_findCachedViewById(r3)
            X.9a2 r0 = (X.C239149a2) r0
            r0.setProgress(r2)
        L72:
            X.0ER r0 = X.C0ER.LIZJ()
            android.content.Context r1 = r14.getContext()
            r2 = 0
            java.lang.String r3 = r14.LJLLLL
            java.lang.String r4 = r14.LJLLLLLL
            X.SmB r5 = r14.LJLLJ
            r0.LJFF(r1, r2, r3, r4, r5)
            return
        L85:
            X.1qj r1 = r14.mo49getActivity()
            java.lang.String[] r0 = new java.lang.String[]{r4, r6}
            boolean r0 = X.C76944UHs.LIZIZ(r1, r0)
            if (r0 == 0) goto L72
            goto L69
        L94:
            java.lang.String r0 = "download"
            r14.Jl(r1, r0)
            if (r8 != r10) goto La0
        L9b:
            java.lang.String r0 = "downloaded"
            r14.Jl(r1, r0)
        La0:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r7) goto Lb4
        La4:
            android.view.View r1 = r14._$_findCachedViewById(r3)
            X.9a2 r1 = (X.C239149a2) r1
            r0 = 100
            if (r2 != r0) goto Lb2
        Lae:
            r1.setProgress(r5)
            goto L72
        Lb2:
            r5 = r2
            goto Lae
        Lb4:
            X.1qj r1 = r14.mo49getActivity()
            java.lang.String[] r0 = new java.lang.String[]{r4, r6}
            boolean r0 = X.C76944UHs.LIZIZ(r1, r0)
            if (r0 == 0) goto L72
            goto La4
        Lc3:
            if (r2 != 0) goto L41
            r2 = 0
            goto L4c
        Lc7:
            r0 = 0
            goto L3b
        Lca:
            X.0EP r0 = X.C0EP.LJFF()
            r0.getClass()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = X.C0EP.LIZJ(r2)
            goto L30
        Ld7:
            r0.LIZJ = r9
            goto L5
        Ldb:
            X.0ER r8 = X.C0ER.LIZJ()
            android.content.Context r9 = r14.getContext()
            java.lang.String r11 = r14.LJLLLL
            java.lang.String r12 = r14.LJLLLLLL
            X.SmB r13 = r14.LJLLJ
            r8.LJFF(r9, r10, r11, r12, r13)
            java.lang.String r0 = "downloading"
            r14.Jl(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment.xl():void");
    }

    public final boolean onBackPressed() {
        super.dismiss();
        JIT jit = this.LJZI;
        if (jit != null) {
            jit.LIZ("exit");
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public final void Al(long j) {
        if (this.LL) {
            return;
        }
        this.LL = true;
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).scheduledLiveReplayAutoDownload(j).LJJJLIIL(new AfS7S0100100_12(this, j, 0), new AfS64S0100000_12(this, 29));
    }

    public final void Hl(int i) {
        if (this.LJZL) {
            C30868C9o.LIZJ(i);
        }
    }

    public final void Kl(Integer num) {
        int intValue;
        if (num == null) {
            C0ER LIZJ = C0ER.LIZJ();
            String str = this.LJLLLL;
            String str2 = this.LJLLLLLL;
            LIZJ.getClass();
            int LIZLLL = C0ER.LIZLLL(str, str2);
            if (LIZLLL != 0) {
                intValue = 2;
                if (LIZLLL != 1) {
                    if (LIZLLL != 2) {
                        intValue = 3;
                        if (LIZLLL != 3) {
                            if (LIZLLL != 4) {
                                intValue = 0;
                            }
                        }
                    } else {
                        intValue = 4;
                    }
                }
            }
            intValue = 1;
        } else {
            intValue = num.intValue();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("room_id", this.LJLLLLLL);
        c188727au.LJIIIZ("enter_from_page", this.LJLZ);
        c188727au.LJIIIZ("enter_from", this.LJZ);
        c188727au.LJIIIZ("event_page", "video_page");
        c188727au.LIZLLL(intValue, "download_status");
        FMX.LJIIL("livesdk_live_replay_play_start", c188727au.LIZ);
        this.LLFFF = true;
    }

    @Override // X.InterfaceC73092SmO
    public final void P7(int i) {
        if (i == 1) {
            Hl(R.string.maa);
            onBackPressed();
            wl();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 2) {
            View go_back_btn = _$_findCachedViewById(R.id.dxb);
            o.LJIIIIZZ(go_back_btn, "go_back_btn");
            Dl(this, go_back_btn, Integer.valueOf((int) B9K.LIZ(getContext(), 8.0f)), Integer.valueOf((int) B9K.LIZ(getContext(), 18.0f)), null, null, 24);
            View livehost_ic_live_reply_group = _$_findCachedViewById(R.id.g0g);
            o.LJIIIIZZ(livehost_ic_live_reply_group, "livehost_ic_live_reply_group");
            Dl(this, livehost_ic_live_reply_group, null, null, Integer.valueOf((int) B9K.LIZ(getContext(), 18.0f)), Integer.valueOf((int) B9K.LIZ(getContext(), 18.0f)), 6);
            ConstraintLayout constraintLayout = this.LJLJJI;
            if (constraintLayout != null) {
                C26338AVi.LJIIIZ(constraintLayout, null, 0, null, Integer.valueOf((int) B9K.LIZ(getContext(), 68.0f)), 16);
            }
            this.LJLLL = true;
            View live_reply_clip_video = _$_findCachedViewById(R.id.fyi);
            o.LJIIIIZZ(live_reply_clip_video, "live_reply_clip_video");
            Dl(this, live_reply_clip_video, Integer.valueOf((int) B9K.LIZ(getContext(), 16.0f)), null, null, null, 28);
            return;
        }
        View go_back_btn2 = _$_findCachedViewById(R.id.dxb);
        o.LJIIIIZZ(go_back_btn2, "go_back_btn");
        Dl(this, go_back_btn2, Integer.valueOf((int) B9K.LIZ(getContext(), 8.0f)), Integer.valueOf((int) B9K.LIZ(getContext(), 46.0f)), null, null, 24);
        View livehost_ic_live_reply_group2 = _$_findCachedViewById(R.id.g0g);
        o.LJIIIIZZ(livehost_ic_live_reply_group2, "livehost_ic_live_reply_group");
        Dl(this, livehost_ic_live_reply_group2, null, null, Integer.valueOf((int) B9K.LIZ(getContext(), 18.0f)), Integer.valueOf((int) B9K.LIZ(getContext(), 28.0f)), 6);
        ConstraintLayout constraintLayout2 = this.LJLJJI;
        if (constraintLayout2 != null) {
            C26338AVi.LJIIIZ(constraintLayout2, null, 0, Integer.valueOf((int) B9K.LIZ(getContext(), 10.0f)), Integer.valueOf((int) B9K.LIZ(getContext(), 82.0f)), 16);
        }
        View live_reply_clip_video2 = _$_findCachedViewById(R.id.fyi);
        o.LJIIIIZZ(live_reply_clip_video2, "live_reply_clip_video");
        Dl(this, live_reply_clip_video2, Integer.valueOf((int) B9K.LIZ(getContext(), 16.0f)), null, null, null, 28);
        this.LJLLL = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, android.R.style.Theme.Holo.Light);
        getLifecycle().addObserver(this.LLFII);
    }

    public final void Jl(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("room_id", this.LJLLLLLL);
        c188727au.LJIIIZ("enter_from_page", this.LJLZ);
        c188727au.LJIIIZ("enter_from", this.LJZ);
        c188727au.LJIIIZ("event_page", "video_page");
        if (str2 != null) {
            c188727au.LJI("click_icon", str2);
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        boolean z;
        Window window;
        Window window2;
        C73053Sll c73053Sll;
        ConstraintLayout constraintLayout;
        SK0 sk0;
        C116454hd c116454hd;
        SK0 sk02;
        ImageView imageView;
        View findViewById;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLF = System.currentTimeMillis();
        if (LiveReplayVideoShowClipEntranceSetting.showClipEntrance()) {
            _$_findCachedViewById(R.id.fyi).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.fyi).setVisibility(8);
        }
        this.LJLILLLLZI = (C73051Slj) view.findViewById(R.id.fyh);
        if (getArguments() == null) {
            super.dismiss();
        } else {
            C73051Slj c73051Slj = this.LJLILLLLZI;
            if (c73051Slj != null) {
                this.LJLIL = new KRJ(c73051Slj);
            }
            Video video = new Video();
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("videoUrl");
            } else {
                str = null;
            }
            String str5 = "";
            if (str == null) {
                str = "";
            }
            this.LJLJL = str;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (str2 = arguments2.getString("downloadUrl")) == null) {
                str2 = "";
            }
            this.LJLLLL = str2;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.getInt("downloadStatus");
            }
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (str3 = arguments4.getString("enterFromPage")) == null) {
                str3 = "";
            }
            this.LJLZ = str3;
            Bundle arguments5 = getArguments();
            if (arguments5 == null || (str4 = arguments5.getString("enterFrom")) == null) {
                str4 = "";
            }
            this.LJZ = str4;
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                i = arguments6.getInt("videoLength");
            } else {
                i = 0;
            }
            this.LJLJLJ = i;
            Bundle arguments7 = getArguments();
            if (arguments7 != null && (string = arguments7.getString("roomId")) != null) {
                str5 = string;
            }
            this.LJLLLLLL = str5;
            LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("live_replay_video_");
            LIZ.append(this.LJLJL);
            localVideoUrlModel.setSourceId(X1D.LIZIZ(LIZ));
            localVideoUrlModel.setUrlList(new ArrayList());
            localVideoUrlModel.getUrlList().add(this.LJLJL);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("live_replay_video_");
            LIZ2.append(this.LJLJL);
            localVideoUrlModel.setUrlKey(X1D.LIZIZ(LIZ2));
            video.setPlayAddr(localVideoUrlModel);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("enterFrom: ");
            LIZ3.append(this.LJZ);
            LIZ3.append(", enterFromPage: ");
            LIZ3.append(this.LJLZ);
            C0NB.LIZIZ("ClipEnd", X1D.LIZIZ(LIZ3));
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                arguments8.getInt("position");
            }
            Bundle arguments9 = getArguments();
            if (arguments9 != null) {
                z = arguments9.getBoolean("isMute");
            } else {
                z = false;
            }
            this.LJLLILLLL = z;
            Bundle arguments10 = getArguments();
            if (arguments10 != null) {
                arguments10.getBoolean("isPause");
            }
            Bundle arguments11 = getArguments();
            if (arguments11 != null) {
                arguments11.getBoolean("isAutoPlay");
            }
            video.setVideoLength(this.LJLJLJ * 1000);
            video.setPlayAddrBytevc1(video.getPlayAddr());
            KRJ krj = this.LJLIL;
            if (krj != null) {
                krj.LIZLLL = video;
            }
            new C72989Skj();
            C72989Skj c72989Skj = new C72989Skj();
            c72989Skj.LIZ = this.LJLIL;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                window = mo49getActivity.getWindow();
            } else {
                window = null;
            }
            c72989Skj.LIZIZ = window;
            c72989Skj.LIZJ = Long.valueOf(this.LJLJLJ * 1000);
            Dialog dialog = getDialog();
            if (dialog != null) {
                window2 = dialog.getWindow();
            } else {
                window2 = null;
            }
            c72989Skj.LIZIZ = window2;
            c72989Skj.LJ = true;
            c72989Skj.LIZLLL = false;
            c72989Skj.LJFF = true;
            C73051Slj c73051Slj2 = this.LJLILLLLZI;
            if (c73051Slj2 != null) {
                c73051Slj2.setParams(c72989Skj);
            }
            C73051Slj c73051Slj3 = this.LJLILLLLZI;
            if (c73051Slj3 != null) {
                c73053Sll = (C73053Sll) c73051Slj3.findViewById(R.id.hso);
            } else {
                c73053Sll = null;
            }
            this.LJLJI = c73053Sll;
            if (c73053Sll != null) {
                constraintLayout = (ConstraintLayout) c73053Sll.findViewById(R.id.nk);
            } else {
                constraintLayout = null;
            }
            this.LJLJJI = constraintLayout;
            C73053Sll c73053Sll2 = this.LJLJI;
            if (c73053Sll2 != null && (findViewById = c73053Sll2.findViewById(R.id.bs8)) != null) {
                findViewById.setOnTouchListener(new IDTListenerS120S0100000_12(this, 5));
            }
            this.LJLJJLL = (ConstraintLayout) view.findViewById(R.id.g0g);
            ConstraintLayout constraintLayout2 = this.LJLJJI;
            if (constraintLayout2 != null) {
                C26338AVi.LJIIIZ(constraintLayout2, null, 0, Integer.valueOf((int) B9K.LIZ(getContext(), 10.0f)), Integer.valueOf((int) B9K.LIZ(getContext(), 82.0f)), 16);
            }
            ConstraintLayout constraintLayout3 = this.LJLJJI;
            if (constraintLayout3 != null) {
                sk0 = (SK0) constraintLayout3.findViewById(R.id.k4s);
            } else {
                sk0 = null;
            }
            this.LJLLI = sk0;
            ConstraintLayout constraintLayout4 = this.LJLJJI;
            if (constraintLayout4 != null && (imageView = (ImageView) constraintLayout4.findViewById(R.id.dp9)) != null) {
                imageView.setVisibility(8);
            }
            C73051Slj c73051Slj4 = this.LJLILLLLZI;
            if (c73051Slj4 != null) {
                ((ImageView) c73051Slj4.LIZ(R.id.k4s)).setVisibility(0);
            }
            C73053Sll c73053Sll3 = this.LJLJI;
            if (c73053Sll3 != null) {
                c73053Sll3.findViewById(R.id.l7z);
            }
            C73053Sll c73053Sll4 = this.LJLJI;
            if (c73053Sll4 != null) {
                c116454hd = (C116454hd) c73053Sll4.findViewById(R.id.hro);
            } else {
                c116454hd = null;
            }
            this.LJLJJL = c116454hd;
            if (c116454hd != null) {
                c116454hd.setVisibility(4);
            }
            KRJ krj2 = this.LJLIL;
            if (krj2 != null) {
                ((ArrayList) krj2.LJIIJJI).add(new C73076Sm8(this));
            }
            if (this.LJLLILLLL && (sk02 = this.LJLLI) != null) {
                sk02.callOnClick();
            }
            KRJ krj3 = this.LJLIL;
            if (krj3 != null) {
                krj3.LJIIJ = this.LJLLILLLL;
            }
            C73051Slj c73051Slj5 = this.LJLILLLLZI;
            if (c73051Slj5 != null) {
                c73051Slj5.LJII(0.0f, false);
            }
            C116454hd c116454hd2 = this.LJLJJL;
            if (c116454hd2 != null) {
                c116454hd2.setVisibility(0);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setOnKeyListener(new DialogInterfaceOnKeyListenerC73080SmC(this));
            }
            Context context = getContext();
            if (context != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_trash_bin;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                c2068389v.LIZIZ = C7MY.LIZIZ(20);
                c2068389v.LIZJ = C7MY.LIZIZ(20);
                SY9 LIZ4 = c2068389v.LIZ(context);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
                c110614Vt.LIZJ = C61328O5c.LIZJ(34);
                c110614Vt.LJII = C7MY.LIZIZ(34);
                c110614Vt.LJI = C7MY.LIZIZ(34);
                c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
                c110614Vt.LJFF = Integer.valueOf(R.attr.dh);
                ((ImageView) _$_findCachedViewById(R.id.e9o)).setImageDrawable(C26338AVi.LJIIJ(LIZ4, c110614Vt.LIZ(context)));
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_rectangle_rectangle_screen;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                c2068389v2.LIZIZ = C7MY.LIZIZ(20);
                c2068389v2.LIZJ = C7MY.LIZIZ(20);
                SY9 LIZ5 = c2068389v2.LIZ(context);
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LIZIZ = Integer.valueOf(R.attr.d8);
                c110614Vt2.LIZJ = C61328O5c.LIZJ(34);
                c110614Vt2.LJII = C7MY.LIZIZ(34);
                c110614Vt2.LJI = C7MY.LIZIZ(34);
                c110614Vt2.LIZLLL = AnonymousClass391.LIZJ(1);
                c110614Vt2.LJFF = Integer.valueOf(R.attr.dh);
                ((ImageView) _$_findCachedViewById(R.id.fyj)).setImageDrawable(C26338AVi.LJIIJ(LIZ5, c110614Vt2.LIZ(context)));
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZ = R.raw.icon_scissors;
                c2068389v3.LJ = Integer.valueOf(R.attr.dj);
                c2068389v3.LIZIZ = C7MY.LIZIZ(20);
                c2068389v3.LIZJ = C7MY.LIZIZ(20);
                SY9 LIZ6 = c2068389v3.LIZ(context);
                if (C90193gN.LIZIZ(getContext())) {
                    ((AppCompatTextView) _$_findCachedViewById(R.id.fyi)).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ6, (Drawable) null);
                } else {
                    ((AppCompatTextView) _$_findCachedViewById(R.id.fyi)).setCompoundDrawablesWithIntrinsicBounds(LIZ6, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                ((TextView) _$_findCachedViewById(R.id.fyi)).setEnabled(true);
            }
            if (C29306Beo.LIZIZ(getContext()) != null) {
                C61713OJx LIZ7 = C61712OJw.LIZ(this);
                LIZ7.LIZIZ(false, false);
                LIZ7.LIZIZ.LJIIL();
                LIZ7.LJFF(-16777216);
                LIZ7.LIZIZ.LJII(false);
                LIZ7.LIZJ();
            }
        }
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.fyi), new ACListenerS32S0100000_12(this, 146));
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.dxb), new ACListenerS32S0100000_12(this, 147));
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.e9o), new ACListenerS32S0100000_12(this, 148));
        _$_findCachedViewById(R.id.g0f).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 149)));
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.fyj), new ACListenerS32S0100000_12(this, 150));
        this.LJLLJ = new C73079SmB(this, this.LJLLLL, this.LJLLLLLL);
        C73089SmL.LIZ().LIZ.LJIIZILJ(this);
        this.LJZL = false;
        C0ER LIZJ = C0ER.LIZJ();
        String str6 = this.LJLLLL;
        String str7 = this.LJLLLLLL;
        C73079SmB c73079SmB = this.LJLLJ;
        LIZJ.getClass();
        C0ER.LJ(str6, str7, c73079SmB);
        this.LJZL = true;
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).checkScheduledLiveReplayVideoTask(false, Long.valueOf(CastLongProtector.parseLong(this.LJLLLLLL))).LJJJLIIL(new AfS64S0100000_12(this, 104), new AfS64S0100000_12(this, 105));
        }
        HandlerC73077Sm9 handlerC73077Sm9 = new HandlerC73077Sm9(this, C16880lQ.LLJJJJ());
        this.LLD = handlerC73077Sm9;
        handlerC73077Sm9.sendEmptyMessageDelayed(0, 1000L);
    }

    public final void Il(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("room_id", this.LJLLLLLL);
        c188727au.LJIIIZ("enter_from_page", this.LJLZ);
        c188727au.LJIIIZ("enter_from", this.LJZ);
        c188727au.LJIIIZ("event_page", "video_page");
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("is_grey", str2);
        if (str3 != null) {
            c188727au.LJI("grey_reason", str3);
        }
        FMX.LJIIL("livesdk_live_replay_clip_icon", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.br5, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public static void Dl(LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment, View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = null;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        liveReplayVideoPlayerDialogFragment.getClass();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i5 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (marginLayoutParams2 != null) {
                i2 = marginLayoutParams2.leftMargin;
            } else {
                i2 = 0;
            }
        }
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams4 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (marginLayoutParams3 != null) {
                i3 = marginLayoutParams3.topMargin;
            } else {
                i3 = 0;
            }
        }
        if (num3 != null) {
            i4 = num3.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams4 != null) {
                i4 = marginLayoutParams4.rightMargin;
            } else {
                i4 = 0;
            }
        }
        if (num4 != null) {
            i5 = num4.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = layoutParams6;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams5 != null) {
                i5 = marginLayoutParams5.bottomMargin;
            }
        }
        marginLayoutParams.setMargins(i2, i3, i4, i5);
    }
}

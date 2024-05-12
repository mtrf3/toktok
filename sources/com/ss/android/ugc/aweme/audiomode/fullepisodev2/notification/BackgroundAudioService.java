package com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification;

import X.C10760bY;
import X.C16880lQ;
import X.C1DG;
import X.C221108m2;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C47636Imm;
import X.C47911IrD;
import X.C62822Ol8;
import X.C66163Pxv;
import X.C73318Sq2;
import X.C84729XNd;
import X.C84733XNh;
import X.C84736XNk;
import X.C84739XNn;
import X.C84742XNq;
import X.C84763XOl;
import X.C85068Xa4;
import X.InterfaceC64592gB;
import X.X68;
import X.XO0;
import X.XOX;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BackgroundAudioService extends Service {
    public Aweme LJLILLLLZI;
    public AudioManager LJLJJI;
    public AudioFocusRequest LJLJJL;
    public C84736XNk LJLJJLL;
    public C47911IrD LJLJL;
    public XO0 LJLJLJ;
    public C84742XNq LJLJLLL;
    public C85068Xa4 LJLIL = new C85068Xa4();
    public final int LJLJI = R.drawable.b1z;
    public final C73318Sq2 LJLL = new C73318Sq2();
    public final C84739XNn LJLLI = new C84739XNn(this);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 213));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 214));

    @Override // android.app.Service
    public final void onCreate() {
        int LLJJJJLIIL;
        super.onCreate();
        Context baseContext = getBaseContext();
        o.LJIIIIZZ(baseContext, "baseContext");
        C84742XNq c84742XNq = new C84742XNq(baseContext, this.LJLIL, (ComponentName) this.LJLLILLLL.getValue(), this.LJLILLLLZI);
        MediaSessionCompat.Token token = c84742XNq.LJ.LIZ.LIZIZ;
        o.LJIIIIZZ(token, "mediaSessionCompat.sessionToken");
        this.LJLJLJ = new XO0(this, token, this.LJLIL, (ComponentName) this.LJLLILLLL.getValue(), new IActivityMonitorImpl(), this.LJLJI, this.LJLILLLLZI, new AqS165S0100000_15(this, 215));
        this.LJLJLLL = c84742XNq;
        C10760bY.LIZ(this).LIZIZ((BroadcastReceiver) this.LJLLJ.getValue(), new IntentFilter("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST"));
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        Object LLILL = C16880lQ.LLILL(applicationContext, "audio");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.AudioManager");
        this.LJLJJI = (AudioManager) LLILL;
        C47636Imm.LJIIJ(this);
        AudioManager audioManager = this.LJLJJI;
        if (audioManager != null) {
            C47911IrD c47911IrD = new C47911IrD(audioManager, C84733XNh.LJLIL);
            this.LJLJL = c47911IrD;
            IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.doHWReceiverFix();
            }
            try {
                if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                    ReceiverRegisterLancet.initHandler();
                    registerReceiver(c47911IrD, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
                } else {
                    registerReceiver(c47911IrD, intentFilter);
                }
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    ReceiverRegisterCrashOptimizer.registerReceiver(c47911IrD, intentFilter);
                } else {
                    throw e;
                }
            }
            C47636Imm.LJI(this);
            this.LJLJJLL = new C84736XNk(this);
            C1DG.LIZ().setAutoAudioFocus(false);
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
                C84736XNk c84736XNk = this.LJLJJLL;
                if (c84736XNk != null) {
                    builder.setOnAudioFocusChangeListener(c84736XNk);
                    builder.setWillPauseWhenDucked(true);
                    AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                    builder2.setContentType(2);
                    builder.setAudioAttributes(builder2.build());
                    AudioFocusRequest build = builder.build();
                    o.LJIIIIZZ(build, "Builder(AudioManager.AUD…build()\n                }");
                    this.LJLJJL = build;
                    AudioManager audioManager2 = this.LJLJJI;
                    if (audioManager2 != null) {
                        LLJJJJLIIL = C16880lQ.LLJJJJJIL(audioManager2, build);
                    } else {
                        o.LJIJI("audioManager");
                        throw null;
                    }
                } else {
                    o.LJIJI("afChangeListener");
                    throw null;
                }
            } else {
                AudioManager audioManager3 = this.LJLJJI;
                if (audioManager3 != null) {
                    C84736XNk c84736XNk2 = this.LJLJJLL;
                    if (c84736XNk2 != null) {
                        LLJJJJLIIL = C16880lQ.LLJJJJLIIL(audioManager3, c84736XNk2, 2, 1);
                    } else {
                        o.LJIJI("afChangeListener");
                        throw null;
                    }
                } else {
                    o.LJIJI("audioManager");
                    throw null;
                }
            }
            if (LLJJJJLIIL != 1) {
                stopSelf();
            }
            this.LJLL.LIZ(C84763XOl.LJI().LJJJJZI(new InterfaceC64592gB() { // from class: X.2O5
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    if (!o.LJ(obj, Boolean.TRUE)) {
                        o.LJ(obj, Boolean.FALSE);
                    }
                }
            }));
            return;
        }
        o.LJIJI("audioManager");
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public final void LIZ() {
        C84742XNq c84742XNq = this.LJLJLLL;
        if (c84742XNq != null) {
            c84742XNq.LJ.LJ(true);
            XO0 xo0 = this.LJLJLJ;
            if (xo0 != null) {
                xo0.LIZIZ().LIZ = true;
                C84742XNq c84742XNq2 = this.LJLJLLL;
                if (c84742XNq2 != null) {
                    c84742XNq2.LJ();
                    C84742XNq c84742XNq3 = this.LJLJLLL;
                    if (c84742XNq3 != null) {
                        c84742XNq3.LIZLLL();
                        XO0 xo02 = this.LJLJLJ;
                        if (xo02 != null) {
                            C84742XNq c84742XNq4 = this.LJLJLLL;
                            if (c84742XNq4 != null) {
                                XOX currentPlaybackState = c84742XNq4.LIZIZ.LIZIZ();
                                o.LJIIIZ(currentPlaybackState, "currentPlaybackState");
                                C84729XNd c84729XNd = xo02.LJIIIZ;
                                c84729XNd.LIZ = Boolean.valueOf(currentPlaybackState.isPlayingState());
                                xo02.LJ(c84729XNd);
                                return;
                            }
                            o.LJIJI("xAndroidSessionController");
                            throw null;
                        }
                        o.LJIJI("xNotificationController");
                        throw null;
                    }
                    o.LJIJI("xAndroidSessionController");
                    throw null;
                }
                o.LJIJI("xAndroidSessionController");
                throw null;
            }
            o.LJIJI("xNotificationController");
            throw null;
        }
        o.LJIJI("xAndroidSessionController");
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C84742XNq c84742XNq = this.LJLJLLL;
        if (c84742XNq != null) {
            c84742XNq.LJ.LJ(false);
            XO0 xo0 = this.LJLJLJ;
            if (xo0 != null) {
                xo0.LIZIZ().LIZ = false;
                this.LJLL.LIZLLL();
                C47911IrD c47911IrD = this.LJLJL;
                if (c47911IrD != null) {
                    ReceiverRegisterLancet.loge(c47911IrD, false);
                    unregisterReceiver(c47911IrD);
                    C10760bY.LIZ(this).LIZLLL((BroadcastReceiver) this.LJLLJ.getValue());
                    XO0 xo02 = this.LJLJLJ;
                    if (xo02 != null) {
                        xo02.LIZLLL();
                        C84742XNq c84742XNq2 = this.LJLJLLL;
                        if (c84742XNq2 != null) {
                            c84742XNq2.LIZIZ();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AudioManager audioManager = this.LJLJJI;
                                if (audioManager != null) {
                                    AudioFocusRequest audioFocusRequest = this.LJLJJL;
                                    if (audioFocusRequest != null) {
                                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                                    } else {
                                        o.LJIJI("audioFocusRequest");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("audioManager");
                                    throw null;
                                }
                            } else {
                                AudioManager audioManager2 = this.LJLJJI;
                                if (audioManager2 != null) {
                                    C84736XNk c84736XNk = this.LJLJJLL;
                                    if (c84736XNk != null) {
                                        audioManager2.abandonAudioFocus(c84736XNk);
                                    } else {
                                        o.LJIJI("afChangeListener");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("audioManager");
                                    throw null;
                                }
                            }
                            C1DG.LIZ().setAutoAudioFocus(true);
                            return;
                        }
                        o.LJIJI("xAndroidSessionController");
                        throw null;
                    }
                    o.LJIJI("xNotificationController");
                    throw null;
                }
                o.LJIJI("volumeChangedReceiver");
                throw null;
            }
            o.LJIJI("xNotificationController");
            throw null;
        }
        o.LJIJI("xAndroidSessionController");
        throw null;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new X68(new WeakReference(this));
    }
}

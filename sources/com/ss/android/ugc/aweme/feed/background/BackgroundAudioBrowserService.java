package com.ss.android.ugc.aweme.feed.background;

import X.C10760bY;
import X.C16880lQ;
import X.C1DG;
import X.C221108m2;
import X.C2M9;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C47541IlF;
import X.C47636Imm;
import X.C47909IrB;
import X.C48649J7l;
import X.C48650J7m;
import X.C48652J7o;
import X.C48653J7p;
import X.C62822Ol8;
import X.C66163Pxv;
import X.C73318Sq2;
import X.C79957VZp;
import X.C81176VtU;
import X.C84741XNp;
import X.C84751XNz;
import X.C84763XOl;
import X.EnumC79954VZm;
import X.IIP;
import X.X69;
import X.XNV;
import X.XNX;
import Y.AfS60S0100000_8;
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
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BackgroundAudioBrowserService extends Service {
    public AudioManager LJLJJL;
    public AudioFocusRequest LJLJJLL;
    public C48650J7m LJLJL;
    public C47909IrB LJLJLJ;
    public C84751XNz LJLJLLL;
    public C84741XNp LJLL;
    public final int LJLIL = R.drawable.b1z;
    public C48649J7l LJLILLLLZI = new C48649J7l();
    public C48653J7p LJLJI = new C48653J7p();
    public C48652J7o LJLJJI = new C48652J7o();
    public final C73318Sq2 LJLLI = new C73318Sq2();
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 373));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 374));

    @Override // android.app.Service
    public final void onCreate() {
        int LLJJJJLIIL;
        super.onCreate();
        Context baseContext = getBaseContext();
        o.LJIIIIZZ(baseContext, "baseContext");
        C84741XNp c84741XNp = new C84741XNp(baseContext, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, (ComponentName) this.LJLLILLLL.getValue());
        MediaSessionCompat.Token token = c84741XNp.LJFF.LIZ.LIZIZ;
        o.LJIIIIZZ(token, "mediaSessionCompat.sessionToken");
        this.LJLJLLL = new C84751XNz(this, token, this.LJLILLLLZI, this.LJLJJI, c84741XNp.LIZJ, (ComponentName) this.LJLLILLLL.getValue(), new C81176VtU(), this.LJLIL);
        this.LJLL = c84741XNp;
        C10760bY.LIZ(this).LIZIZ((BroadcastReceiver) this.LJLLJ.getValue(), new IntentFilter("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST"));
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        Object LLILL = C16880lQ.LLILL(applicationContext, "audio");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.AudioManager");
        this.LJLJJL = (AudioManager) LLILL;
        C47636Imm.LJIIJ(this);
        AudioManager audioManager = this.LJLJJL;
        if (audioManager != null) {
            C47909IrB c47909IrB = new C47909IrB(audioManager, IIP.LJLIL);
            this.LJLJLJ = c47909IrB;
            IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.doHWReceiverFix();
            }
            try {
                if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                    ReceiverRegisterLancet.initHandler();
                    registerReceiver(c47909IrB, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
                } else {
                    registerReceiver(c47909IrB, intentFilter);
                }
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    ReceiverRegisterCrashOptimizer.registerReceiver(c47909IrB, intentFilter);
                } else {
                    throw e;
                }
            }
            if (C47636Imm.LJI(this) == 0) {
                C47541IlF.LIZJ = Long.valueOf(System.currentTimeMillis());
            }
            this.LJLJL = new C48650J7m(this);
            C1DG.LIZ().setAutoAudioFocus(false);
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
                C48650J7m c48650J7m = this.LJLJL;
                if (c48650J7m != null) {
                    builder.setOnAudioFocusChangeListener(c48650J7m);
                    builder.setWillPauseWhenDucked(true);
                    AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                    builder2.setContentType(2);
                    builder.setAudioAttributes(builder2.build());
                    AudioFocusRequest build = builder.build();
                    o.LJIIIIZZ(build, "Builder(AudioManager.AUD…build()\n                }");
                    this.LJLJJLL = build;
                    AudioManager audioManager2 = this.LJLJJL;
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
                AudioManager audioManager3 = this.LJLJJL;
                if (audioManager3 != null) {
                    C48650J7m c48650J7m2 = this.LJLJL;
                    if (c48650J7m2 != null) {
                        LLJJJJLIIL = C16880lQ.LLJJJJLIIL(audioManager3, c48650J7m2, 2, 1);
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
            this.LJLLI.LIZ(C84763XOl.LJI().LJJJJZI(new AfS60S0100000_8(this, 21)));
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
        C84741XNp c84741XNp = this.LJLL;
        if (c84741XNp != null) {
            c84741XNp.LJFF.LJ(true);
            C84751XNz c84751XNz = this.LJLJLLL;
            if (c84751XNz != null) {
                c84751XNz.LIZJ().LIZ = true;
                C84741XNp c84741XNp2 = this.LJLL;
                if (c84741XNp2 != null) {
                    c84741XNp2.LJ();
                    C84741XNp c84741XNp3 = this.LJLL;
                    if (c84741XNp3 != null) {
                        c84741XNp3.LIZLLL();
                        C84751XNz c84751XNz2 = this.LJLJLLL;
                        if (c84751XNz2 != null) {
                            C84741XNp c84741XNp4 = this.LJLL;
                            if (c84741XNp4 != null) {
                                EnumC79954VZm currentPlaybackState = c84741XNp4.LIZIZ.LJ();
                                o.LJIIIZ(currentPlaybackState, "currentPlaybackState");
                                if (C79957VZp.LIZ[currentPlaybackState.ordinal()] == 1) {
                                    if (c84751XNz2.LIZJ().LIZIZ) {
                                        c84751XNz2.LIZIZ().removeMessages(1);
                                        c84751XNz2.LIZIZ().removeMessages(2);
                                        c84751XNz2.LIZLLL();
                                        return;
                                    }
                                    return;
                                }
                                XNV xnv = c84751XNz2.LJIIIZ;
                                xnv.LIZ = Boolean.valueOf(currentPlaybackState.isPlayingState());
                                xnv.LIZIZ = Boolean.valueOf(c84751XNz2.LIZLLL.LIZLLL());
                                xnv.LIZJ = Boolean.valueOf(c84751XNz2.LIZLLL.LJFF());
                                c84751XNz2.LJFF(xnv);
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
        this.LJLILLLLZI = new C48649J7l();
        this.LJLJI = new C48653J7p();
        this.LJLJJI = new C48652J7o();
        C84741XNp c84741XNp = this.LJLL;
        if (c84741XNp != null) {
            c84741XNp.LJFF.LJ(false);
            C84751XNz c84751XNz = this.LJLJLLL;
            if (c84751XNz != null) {
                c84751XNz.LIZJ().LIZ = false;
                this.LJLLI.LIZLLL();
                C47909IrB c47909IrB = this.LJLJLJ;
                if (c47909IrB != null) {
                    ReceiverRegisterLancet.loge(c47909IrB, false);
                    unregisterReceiver(c47909IrB);
                    C10760bY.LIZ(this).LIZLLL((BroadcastReceiver) this.LJLLJ.getValue());
                    C84751XNz c84751XNz2 = this.LJLJLLL;
                    if (c84751XNz2 != null) {
                        c84751XNz2.LJ();
                        C84741XNp c84741XNp2 = this.LJLL;
                        if (c84741XNp2 != null) {
                            c84741XNp2.LIZIZ();
                            C2M9.LIZ = false;
                            Iterator it = ((ArrayList) C2M9.LIZIZ).iterator();
                            while (it.hasNext()) {
                                ((XNX) it.next()).LIZIZ();
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                AudioManager audioManager = this.LJLJJL;
                                if (audioManager != null) {
                                    AudioFocusRequest audioFocusRequest = this.LJLJJLL;
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
                                AudioManager audioManager2 = this.LJLJJL;
                                if (audioManager2 != null) {
                                    C48650J7m c48650J7m = this.LJLJL;
                                    if (c48650J7m != null) {
                                        audioManager2.abandonAudioFocus(c48650J7m);
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
        return new X69(new WeakReference(this));
    }
}

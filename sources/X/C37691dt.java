package X;

import Y.IDBReceiverS4S0100000;
import Y.IDHandlerS13S0100000;
import Y.IDRunnableS65S0000000;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.byted.cast.common.Logger;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.1dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37691dt implements InterfaceC21030s7, ILiveStream.ILiveStreamErrorListener {
    public static final int[][] LJLLILLLL = {new int[]{200, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 800, 1}, new int[]{200, 800, LinkMicRtcMixBitrateSetting.DEFAULT, 3}};
    public final Context LJLILLLLZI;
    public InterfaceC21020s6 LJLJI;
    public final Room LJLJJI;
    public InterfaceC21030s7 LJLJJL;
    public IDBReceiverS4S0100000 LJLJLJ;
    public boolean LJLJLLL;
    public final C266712x LJLL;
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLJJLL = false;
    public boolean LJLJL = false;
    public final ConcurrentHashMap<String, IInputVideoStream> LJLLI = new ConcurrentHashMap<>();

    @Override // X.InterfaceC21030s7
    public final void Wg(double d, double d2, double d3) {
    }

    @Override // X.InterfaceC21030s7
    public final void t8() {
        C78842Uww.LJLIL = 1;
        C73943T0h.LIZ().LIZIZ(new C30191Bt5(1));
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.t8();
        }
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void xb(C34941Ys c34941Ys) {
    }

    public final void LIZIZ() {
        IDBReceiverS4S0100000 iDBReceiverS4S0100000;
        InterfaceC21020s6 interfaceC21020s6 = this.LJLJI;
        if (interfaceC21020s6 != null) {
            interfaceC21020s6.LJIJJLI(C78857UxB.LJJIIJ(1476788483, "bpea-488"));
        }
        ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C54992Dv.class);
        C266712x c266712x = this.LJLL;
        c266712x.getClass();
        GameLiveMemoryLeakOptSetting gameLiveMemoryLeakOptSetting = GameLiveMemoryLeakOptSetting.INSTANCE;
        if (gameLiveMemoryLeakOptSetting.getValue()) {
            c266712x.LIZJ.getClass();
            C31026CFq.LJFF();
        }
        AnonymousClass147.LIZIZ();
        if (gameLiveMemoryLeakOptSetting.getValue() && (iDBReceiverS4S0100000 = this.LJLJLJ) != null) {
            C16880lQ.LJJLIIIJL(this.LJLILLLLZI, iDBReceiverS4S0100000);
            this.LJLJLJ = null;
        }
    }

    @Override // X.InterfaceC21030s7
    public final void Wk() {
        this.LJLIL.post(new IDRunnableS65S0000000(14));
        C78842Uww.LJLIL = 0;
        C73943T0h.LIZ().LIZIZ(new C30191Bt5(0));
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.Wk();
            C0TN.LIZIZ();
        }
    }

    @Override // X.InterfaceC21030s7
    public final void bh() {
        if (this.LJLJJLL) {
            C78842Uww.LJLIL = 2;
            C73943T0h.LIZ().LIZIZ(new C30191Bt5(2));
        }
        this.LJLJJLL = true;
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.bh();
        }
    }

    @Override // X.InterfaceC21030s7
    public final void m7() {
        AudioDeviceModule adm;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamStart(). this=");
            LIZ.append(this);
            C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ));
        }
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.m7();
            C266712x c266712x = this.LJLL;
            c266712x.LIZ.getClass();
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("start, audioRecordingCallback: ");
                LIZ2.append(AnonymousClass147.LJFF);
                LIZ2.append(", byteAudioRecordingCallback: ");
                LIZ2.append(AnonymousClass147.LJI);
                C0NB.LJIIIZ("AudioRecordFocusManager", X1D.LIZIZ(LIZ2));
            }
            if (Build.VERSION.SDK_INT > 28) {
                if (AnonymousClass147.LJFF == null) {
                    AnonymousClass147.LIZJ = true;
                    AnonymousClass147.LIZLLL = true;
                    AnonymousClass147.LIZLLL();
                }
                if (AnonymousClass147.LJI == null) {
                    AnonymousClass147.LJI = C38591fL.LIZ;
                    LiveCore liveCore = AnonymousClass147.LIZIZ;
                    if (liveCore != null && (adm = liveCore.getADM()) != null) {
                        adm.registerAudioRecordingCallback(AnonymousClass147.LJI);
                    }
                }
            }
            C0TN.LIZ();
            c266712x.LIZJ.LJ();
        }
    }

    @Override // X.InterfaceC21030s7
    public final void tl() {
        this.LJLIL.post(new IDRunnableS6S0101000(0, this, 36));
        C78842Uww.LJLIL = 1;
        C73943T0h.LIZ().LIZIZ(new C30191Bt5(1));
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.tl();
            C0TN.LIZ();
        }
    }

    @Override // X.InterfaceC21030s7
    public final void v3() {
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.v3();
        }
    }

    @Override // X.InterfaceC21030s7
    public final void x() {
        C18200nY.LIZ("rtmp_connected", String.valueOf(System.currentTimeMillis()));
        IDHandlerS13S0100000 iDHandlerS13S0100000 = C18200nY.LIZ;
        iDHandlerS13S0100000.sendMessage(Message.obtain(iDHandlerS13S0100000, 3));
        ((C29165BcX) ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).startLiveManager()).uc();
        C29689Bkz.LIZ.LJIIL(new InterfaceC88472Yns() { // from class: X.1oZ
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                ((C29688Bky) obj).LJIIIZ("system_event_first_rtmp_connected", "");
                return null;
            }
        });
    }

    @Override // X.InterfaceC21030s7
    public final void z0() {
        C18200nY.LIZ("capture_first_frame", String.valueOf(System.currentTimeMillis()));
        C29689Bkz.LIZ.LJIIL(new C44291oX(0));
    }

    @Override // X.InterfaceC21030s7
    public final void Ec(float f) {
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.Ec(f);
        }
    }

    public final void LIZLLL(Cert cert) {
        InterfaceC21020s6 interfaceC21020s6 = this.LJLJI;
        if (interfaceC21020s6 != null) {
            interfaceC21020s6.LJIJI(cert);
            C1JI.LJJIIJZLJL("release_audio");
            this.LJLJI.LJIILLIIL(cert);
            C1JI.LJJIIJZLJL("release_screen");
            this.LJLJI.stop();
        }
    }

    @Override // X.InterfaceC21030s7
    public final void ha(boolean z) {
        if (z) {
            AnonymousClass147.LJ();
        }
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.ha(z);
        }
    }

    @Override // X.InterfaceC21030s7
    public final void u4(long j) {
        this.LJLJJL.u4(j);
    }

    @Override // X.InterfaceC21030s7
    public final void xj(int i) {
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.xj(i);
        }
    }

    public C37691dt(Context context, Room room) {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GameServiceStrategy(). this=");
            LIZ.append(this);
            C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ));
        }
        this.LJLILLLLZI = context;
        this.LJLJJI = room;
        C78842Uww.LJLIL = 0;
        this.LJLL = new C266712x();
    }

    public final IInputVideoStream LIZ(String str, RectF rectF) {
        LiveCore liveCore;
        VideoMixer.VideoMixerDescription mixerDescription;
        InterfaceC21020s6 interfaceC21020s6 = this.LJLJI;
        if (interfaceC21020s6 == null || (liveCore = interfaceC21020s6.getLiveCore()) == null) {
            return null;
        }
        IInputVideoStream createInputVideoStream = liveCore.createInputVideoStream("extern_device");
        IInputVideoStream originInputVideoStream = liveCore.getOriginInputVideoStream();
        if (createInputVideoStream == null || originInputVideoStream == null || (mixerDescription = originInputVideoStream.getMixerDescription()) == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mixStream:");
        LIZ.append(mixerDescription);
        LIZ.append(", enable alpha:");
        LIZ.append(mixerDescription.isEnableAlphaMode());
        LIZ.append(", alpha:");
        LIZ.append(mixerDescription.alpha);
        Logger.e("ByteCastLink", X1D.LIZIZ(LIZ));
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        if (rectF != null) {
            videoMixerDescription.top = rectF.top;
            videoMixerDescription.left = rectF.left;
            videoMixerDescription.right = rectF.right;
            videoMixerDescription.bottom = rectF.bottom;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("top: ");
            LIZ2.append(rectF.top);
            LIZ2.append(", left: ");
            LIZ2.append(rectF.left);
            LIZ2.append(" right: ");
            LIZ2.append(rectF.right);
            LIZ2.append(" bottom: ");
            LIZ2.append(rectF.bottom);
            C0NB.LJ("GameServiceStrategy", X1D.LIZIZ(LIZ2));
        }
        videoMixerDescription.alpha = -1.0f;
        mixerDescription.setEnableAlphaMode(true);
        videoMixerDescription.setMode(mixerDescription.getMode());
        videoMixerDescription.setzOrder(mixerDescription.getzOrder() + 1);
        videoMixerDescription.setVisibility(true);
        createInputVideoStream.setMixerDescription(videoMixerDescription);
        createInputVideoStream.start();
        IInputVideoStream put = this.LJLLI.put(str, createInputVideoStream);
        if (put != null) {
            put.stop();
            put.release();
        }
        return createInputVideoStream;
    }

    public final boolean LIZJ(Cert cert, boolean z) {
        InterfaceC21020s6 interfaceC21020s6;
        if (this.LJLJJI.getStreamUrl() == null || this.LJLJJI.getStreamUrl().LIZ() == null || (interfaceC21020s6 = this.LJLJI) == null) {
            return false;
        }
        interfaceC21020s6.LJFF(cert);
        C1JI.LJJIIJZLJL("capture_screen");
        this.LJLJI.LIZLLL(cert);
        C1JI.LJJIIJZLJL("capture_audio");
        if (this.LJLJJI.getStreamUrl().pushUrlList != null && !this.LJLJJI.getStreamUrl().pushUrlList.isEmpty()) {
            this.LJLJI.start(this.LJLJJI.getStreamUrl().pushUrlList);
        } else {
            this.LJLJI.start(this.LJLJJI.getStreamUrl().LIZ());
        }
        this.LJLL.LIZIZ.getClass();
        if (C0TN.LIZIZ != null) {
            C0TN.LJIIIIZZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(r0.getFirstCountDownDurationMinutes(), TimeUnit.MINUTES).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1MR
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C0TN.LIZJ = true;
                    C0TN.LIZ();
                }
            }, new InterfaceC64592gB() { // from class: X.1MS
                @Override // X.InterfaceC64592gB
                public final void accept(Object t) {
                    o.LJIIIZ(t, "t");
                }
            });
            return true;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // X.InterfaceC21030s7
    public final void hc(LiveCore liveCore, AbstractC39330Fc6 abstractC39330Fc6) {
        if (liveCore != null) {
            liveCore.registerScreenAudioPlayBack(null, 1, abstractC39330Fc6);
        }
    }

    @Override // X.InterfaceC21030s7
    public final void s2(LiveCore liveCore, Cert cert) {
        this.LJLL.getClass();
        o.LJIIIZ(liveCore, "liveCore");
        AnonymousClass147.LIZ(liveCore);
        liveCore.registerScreenAudioPlayBack(null, 1);
        InterfaceC21030s7 interfaceC21030s7 = this.LJLJJL;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.s2(liveCore, cert);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x001e, code lost:
    
        if (r6 > 0) goto L8;
     */
    @Override // X.InterfaceC21030s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = X.C21040s8.LIZIZ(r6, r0)
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L1e
            boolean r0 = X.C21040s8.LIZJ(r6)
            if (r0 == 0) goto L91
            android.os.Handler r2 = r5.LJLIL
            Y.IDRunnableS6S0101000 r1 = new Y.IDRunnableS6S0101000
            r0 = 37
            r1.<init>(r3, r5, r0)
            r2.post(r1)
        L1e:
            if (r6 <= 0) goto L41
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L2a
            java.lang.String r8 = X.C21040s8.LIZ(r6)
        L2a:
            java.lang.String r0 = "ttlive_obs_stream_end_error"
            X.BlC r2 = X.C18230nb.LIZJ(r0)
            java.lang.String r1 = "error_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.LJFF(r0, r1)
            java.lang.String r0 = "error_msg"
            r2.LJII(r0, r8)
            r2.LJIIIZ()
        L41:
            X.0s7 r0 = r5.LJLJJL
            if (r0 == 0) goto L90
            r0.G(r6, r7, r8)
            X.12x r2 = r5.LJLL
            r2.getClass()
            java.lang.String r0 = "error"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.AnonymousClass147.LIZIZ()
            X.C0TN.LIZIZ()
            X.0TN r0 = r2.LIZIZ
            r0.getClass()
            X.C0TN.LIZJ = r3
            X.C0TN.LIZLLL = r4
            X.C0TN.LJFF = r3
            X.SrX r0 = X.C0TN.LJI
            if (r0 == 0) goto L6a
            r0.dispose()
        L6a:
            r1 = 0
            X.C0TN.LJI = r1
            X.SrX r0 = X.C0TN.LJII
            if (r0 == 0) goto L74
            r0.dispose()
        L74:
            X.C0TN.LJII = r1
            X.SrX r0 = X.C0TN.LJIIIIZZ
            if (r0 == 0) goto L7d
            r0.dispose()
        L7d:
            X.C0TN.LJIIIIZZ = r1
            X.SrX r0 = X.C0TN.LJIIIZ
            if (r0 == 0) goto L86
            r0.dispose()
        L86:
            X.C0TN.LJIIIZ = r1
            X.CFq r0 = r2.LIZJ
            r0.getClass()
            X.C31026CFq.LJFF()
        L90:
            return
        L91:
            if (r6 <= 0) goto L41
            android.os.Handler r1 = r5.LJLIL
            X.0vf r0 = new X.0vf
            r0.<init>(r4, r5)
            r1.post(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37691dt.G(int, int, java.lang.String):void");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i, int i2, Exception exc) {
        ((C29165BcX) ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).startLiveManager()).f2(i);
    }
}

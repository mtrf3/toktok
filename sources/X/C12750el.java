package X;

import Y.IDfS292S0100000;
import android.graphics.RectF;
import com.bytedance.android.live.broadcast.bgbroadcast.game.api.GameDualDeviceApi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.HashMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0el, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12750el {
    public final C37691dt LIZ;
    public final GameBroadcastFragment LIZIZ;
    public final DataChannel LIZJ;
    public EnumC12710eh LIZLLL;
    public EnumC276816u LJ;
    public VideoMixer.VideoMixerDescription LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final HashMap<String, C12740ek> LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final C32871Qt LJIIL;

    public final C12700eg LIZJ() {
        return (C12700eg) this.LJIIIZ.getValue();
    }

    public final long LIZLLL() {
        return ((Number) this.LJI.getValue()).longValue();
    }

    public final void LIZIZ(String str) {
        RectF rectF;
        Integer num;
        if (this.LIZ.LJLLI.get(str) != null) {
            return;
        }
        VideoMixer.VideoMixerDescription videoMixerDescription = this.LJFF;
        if (videoMixerDescription != null) {
            LIZ(str, videoMixerDescription);
            return;
        }
        Integer num2 = null;
        if (LJ(null)) {
            Boolean LJJZZIII = C276716t.LJ.LJJZZIII();
            if (LJJZZIII == null) {
                LJJZZIII = Boolean.FALSE;
            }
            boolean booleanValue = LJJZZIII.booleanValue();
            Boolean LJJZZIII2 = C276716t.LIZLLL.LJJZZIII();
            if (LJJZZIII2 == null) {
                LJJZZIII2 = Boolean.FALSE;
            }
            boolean booleanValue2 = LJJZZIII2.booleanValue();
            EnumC12710eh LJJZZIII3 = C276716t.LIZIZ.LJJZZIII();
            if (LJJZZIII3 != null) {
                C32871Qt c32871Qt = this.LJIIL;
                rectF = LJJZZIII3.getRectPort(booleanValue, booleanValue2, c32871Qt.LJLIL / c32871Qt.LJLILLLLZI);
            } else {
                rectF = null;
            }
            IInputVideoStream LIZ = this.LIZ.LIZ(str, rectF);
            if (LIZ == null) {
                C0JV.LJFF(LIZLLL(), "mix_stream", 2005, 1, null, 16);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("checkCreateDualCameraInputStream, last: ");
            VideoMixer.VideoMixerDescription videoMixerDescription2 = this.LJFF;
            if (videoMixerDescription2 != null) {
                num = Integer.valueOf(videoMixerDescription2.hashCode());
            } else {
                num = null;
            }
            LIZ2.append(num);
            LIZ2.append(", new: ");
            VideoMixer.VideoMixerDescription mixerDescription = LIZ.getMixerDescription();
            if (mixerDescription != null) {
                num2 = Integer.valueOf(mixerDescription.hashCode());
            }
            QZY.LIZJ(LIZ2, num2, LIZ2, "GameDualDeviceStrategy");
            VideoMixer.VideoMixerDescription videoMixerDescription3 = this.LJFF;
            if (videoMixerDescription3 == null) {
                videoMixerDescription3 = LIZ.getMixerDescription();
            }
            this.LJFF = videoMixerDescription3;
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("checkCreateDualCameraInputStream create inputStream for(");
        LIZ3.append(str);
        LIZ3.append(") lately");
        C0NB.LJIIL("GameBroadcastFragment", X1D.LIZIZ(LIZ3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(X.CWI r3) {
        /*
            r2 = this;
            if (r3 != 0) goto Le
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r2.LIZJ
            if (r1 == 0) goto L18
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel> r0 = com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel.class
            java.lang.Object r3 = r1.kv0(r0)
            if (r3 == 0) goto L18
        Le:
            X.CWI r0 = X.CWI.StateConnected
            if (r3 == r0) goto L16
            X.CWI r0 = X.CWI.StatePause
            if (r3 != r0) goto L18
        L16:
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12750el.LJ(X.CWI):boolean");
    }

    public final void LJFF(int i) {
        if (C276716t.LIZJ()) {
            C0JV.LJFF(LIZLLL(), "push_stream", 2007, Integer.valueOf(i), null, 16);
        }
    }

    public final IInputVideoStream LIZ(String str, VideoMixer.VideoMixerDescription videoMixerDescription) {
        LiveCore liveCore;
        VideoMixer.VideoMixerDescription mixerDescription;
        if (this.LIZ.LJLLI.get(str) != null) {
            return null;
        }
        if (LJ(null)) {
            C37691dt c37691dt = this.LIZ;
            InterfaceC21020s6 interfaceC21020s6 = c37691dt.LJLJI;
            if (interfaceC21020s6 != null && (liveCore = interfaceC21020s6.getLiveCore()) != null) {
                IInputVideoStream createInputVideoStream = liveCore.createInputVideoStream("extern_device");
                IInputVideoStream originInputVideoStream = liveCore.getOriginInputVideoStream();
                if (createInputVideoStream != null && originInputVideoStream != null && (mixerDescription = liveCore.getOriginInputVideoStream().getMixerDescription()) != null) {
                    mixerDescription.setEnableAlphaMode(true);
                    videoMixerDescription.setMode(mixerDescription.getMode());
                    videoMixerDescription.setzOrder(mixerDescription.getzOrder() + 1);
                    createInputVideoStream.setMixerDescription(videoMixerDescription);
                    createInputVideoStream.start();
                    IInputVideoStream put = c37691dt.LJLLI.put(str, createInputVideoStream);
                    if (put != null) {
                        put.stop();
                        put.release();
                    }
                    return createInputVideoStream;
                }
            }
            C0JV.LJFF(LIZLLL(), "mix_stream", 2005, 2, null, 16);
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkCreateDualCameraInputStream create inputStream for(");
        LIZ.append(str);
        LIZ.append(") lately");
        C0NB.LJIIL("GameBroadcastFragment", X1D.LIZIZ(LIZ));
        return null;
    }

    public final void LJI(int i, boolean z) {
        Object obj;
        int i2;
        String valueOf;
        DataChannel dataChannel = this.LIZJ;
        Object obj2 = null;
        if (dataChannel != null) {
            obj = dataChannel.kv0(GameBroadcastStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != CWI.StateConnected) {
            DataChannel dataChannel2 = this.LIZJ;
            if (dataChannel2 != null) {
                obj2 = dataChannel2.kv0(GameBroadcastStateChannel.class);
            }
            if (obj2 != CWI.StatePause) {
                return;
            }
        }
        GameDualDeviceApi gameDualDeviceApi = (GameDualDeviceApi) Q7L.LIZIZ(GameDualDeviceApi.class);
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        long LIZLLL = LIZLLL();
        if (i == 0) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(i);
        }
        ((InterfaceC29856Bng) C1EW.LIZ(gameDualDeviceApi.dualDeviceUpdate(i2, LIZLLL, valueOf)).LIZJ(C73933Szx.LIZLLL(this.LIZIZ))).LIZJ(new InterfaceC64592gB() { // from class: X.1Qu
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj3) {
                T t;
                BaseResponse baseResponse = (BaseResponse) obj3;
                if (baseResponse != null && (t = baseResponse.data) != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("response = ");
                    LIZ.append(t);
                    C0NB.LJIIIZ("GameDualDeviceStrategy", X1D.LIZIZ(LIZ));
                }
            }
        }, new InterfaceC64592gB() { // from class: X.1Qv
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("error = ");
                LIZ.append(obj3);
                C0NB.LJIIIZ("GameDualDeviceStrategy", X1D.LIZIZ(LIZ));
            }
        });
    }

    public C12750el(C37691dt c37691dt, GameBroadcastFragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = c37691dt;
        this.LIZIZ = fragment;
        this.LIZJ = dataChannel;
        this.LJI = C221108m2.LIZIZ(C515120l.LJLIL);
        this.LJII = C221108m2.LIZIZ(C515020k.LJLIL);
        this.LJIIIIZZ = new HashMap<>();
        this.LJIIIZ = C221108m2.LIZIZ(new IDqS420S0100000(this, 114));
        this.LJIIJJI = true;
        C32871Qt c32871Qt = new C32871Qt(this);
        this.LJIIL = c32871Qt;
        InterfaceC276916v interfaceC276916v = new InterfaceC276916v() { // from class: X.1Qr
            @Override // X.InterfaceC276916v
            public final void LJIILLIIL(int i) {
                C12750el.this.LJI(i, false);
                C12750el.this.LIZJ().LJ = i;
                C0JV.LJFF(C12750el.this.LIZLLL(), "decode_result", 2002, Integer.valueOf(i), null, 16);
            }

            @Override // X.InterfaceC276916v
            public final void LIZJ(int i, String str) {
                C0JV.LJ(2003, C12750el.this.LIZLLL(), Integer.valueOf(i), "decode_result", str);
            }

            @Override // X.InterfaceC276916v
            public final void LJFF(int i, String str) {
                C12750el.this.LJI(i, false);
                C12750el.this.LIZJ().LJ = i;
                C0JV.LJ(2003, C12750el.this.LIZLLL(), Integer.valueOf(i), "init_sdk", str);
            }

            @Override // X.InterfaceC276916v
            public final void LJIIJ(int i, String str) {
                C0JV.LJ(2001, C12750el.this.LIZLLL(), Integer.valueOf(i), "init_sdk", str);
            }
        };
        ((InterfaceC29856Bng) C276716t.LIZIZ.LJJJ(C73969T1h.LIZIZ()).LJIILIIL().LIZJ(C73933Szx.LIZLLL(fragment))).LIZIZ(new IDfS292S0100000(this, 23));
        if (C276716t.LJIIIIZZ == null) {
            C276716t.LJIIIIZZ = new C39411gf<>();
        }
        C39411gf<InterfaceC277016w> c39411gf = C276716t.LJIIIIZZ;
        if (c39411gf != null) {
            c39411gf.LJIIZILJ(c32871Qt);
        }
        if (C276716t.LJIIIZ == null) {
            C276716t.LJIIIZ = new C39401ge<>();
        }
        C39401ge<InterfaceC276916v> c39401ge = C276716t.LJIIIZ;
        if (c39401ge != null) {
            c39401ge.LJIIZILJ(interfaceC276916v);
        }
        dataChannel.nv0(GameBroadcastStateChannel.class, this, new IDqS416S0100000(this, 204));
        ((InterfaceC29856Bng) C276716t.LIZJ.LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(fragment))).LIZJ(new IDfS292S0100000(this, 24), new InterfaceC64592gB() { // from class: X.1Qq
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJ("GameDualDeviceStrategy", android.util.Log.getStackTraceString((Throwable) obj));
            }
        });
    }
}

package X;

import Y.ACallableS83S0101000_12;
import Y.ARunnableS13S1200000_14;
import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ccb.t;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionBanAuto;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableCacheLastSelectDefinitionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFirstFrameCallbackInsertMqHeadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.MultiLivePlayerLogInstanceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveEnablePreCreatedPlayer;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.texturerender.VideoSurface;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VBw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79340VBw implements InterfaceC28738BPq, BTA, InterfaceC28344BAm, InterfaceC79335VBr, VBG {
    public static final C28746BPy LLIL = new C28746BPy(new BQ1());
    public VBT LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public B4E LJLJJLL;
    public Surface LJLJL;
    public SurfaceHolder LJLJLJ;
    public TextureView LJLJLLL;
    public String LJLLJ;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public BQ5 LJZ;
    public volatile int LJZI;
    public LiveMode LJZL;
    public final C78579Ush LL;
    public SoftReference<BQ7> LLD;
    public final Context LLF;
    public final VB7 LLFF;
    public boolean LLFZ;
    public boolean LLI;
    public long LLII;
    public boolean LLIIIJ;
    public InterfaceC28641BLx LLIIIL;
    public long LLIIL;
    public String LJLL = "";
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public C28746BPy LJLLL = LLIL;
    public String LLFFF = "";
    public boolean LLFII = true;
    public boolean LLIFFJFJJ = true;
    public boolean LLIIII = true;
    public boolean LLIIIILZ = true;
    public final CopyOnWriteArrayList<VC8> LLIIIZ = new CopyOnWriteArrayList<>();
    public final TextureViewSurfaceTextureListenerC79341VBx LLIIJI = new TextureViewSurfaceTextureListenerC79341VBx(this);
    public final SurfaceHolderCallbackC79343VBz LLIIJLIL = new SurfaceHolderCallbackC79343VBz(this);
    public String LLIILII = "";
    public C51093K3l LLIILZL = null;
    public boolean LLIIZ = false;
    public final HandlerC28345BAn LJLZ = new HandlerC28345BAn(C16880lQ.LLJJJJ(), this);

    @Override // X.InterfaceC28737BPp
    public final void LJIILL() {
        LJJJIL(null, null, 0, null, null, null, null);
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJJJL() {
        this.LLIFFJFJJ = true;
    }

    @Override // X.InterfaceC28738BPq
    public final void reset() {
        this.LJZ = null;
        this.LJLLLL = false;
        this.LJLL = "";
        this.LJLLI = "";
        this.LJLLL = LLIL;
        Object obj = this.LJLJJLL;
        if (obj instanceof CVR) {
            ((TextureView) obj).setSurfaceTextureListener(null);
        } else if (obj instanceof C31482CXe) {
            ((TextureView) obj).setSurfaceTextureListener(null);
        } else if (obj instanceof CVS) {
            ((SurfaceView) obj).getHolder().removeCallback(this.LLIIJLIL);
        }
        this.LJLJJLL = null;
        if (this.LJLJLJ != null) {
            this.LJLJLJ = null;
        }
        Surface surface = this.LJLJL;
        if (surface != null) {
            surface.release();
            this.LJLJL = null;
        }
        this.LJZI = 0;
        LJJLIIIJILLIZJL(false);
        LJJLIIIIJ(false);
        LJJLIIIJJI(false);
        this.LLIIII = true;
        this.LJLLLLLL = false;
    }

    @Override // X.InterfaceC28738BPq, X.BTA
    public final JSONObject LIZIZ() {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            return ((VAE) vbt).LIZLLL();
        }
        return new JSONObject();
    }

    @Override // X.InterfaceC28738BPq
    public final void LJFF() {
        C78579Ush c78579Ush = this.LL;
        c78579Ush.LIZ = false;
        c78579Ush.getClass();
    }

    @Override // X.InterfaceC28738BPq
    public final Bitmap LJIILIIL() {
        t tVar;
        VideoSurface videoSurface;
        Object obj = this.LJLJJLL;
        if (obj instanceof TextureView) {
            return ((TextureView) obj).getBitmap();
        }
        VBT vbt = this.LJLIL;
        if (vbt != null && (tVar = ((VAE) vbt).LJLIL) != null && tVar.t5 != 0 && tVar.LLFF != 0 && (videoSurface = tVar.LLD) != null) {
            try {
                videoSurface.LJIJ(null, null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return null;
    }

    @Override // X.InterfaceC28737BPp
    public final void LJIILJJIL() {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJIIIZ(null, null);
            VAE vae = (VAE) this.LJLIL;
            vae.getClass();
            vae.LJI(VAE.LIZJ(13, null));
            this.LJLIL = null;
        }
        reset();
    }

    @Override // X.InterfaceC28738BPq
    public final int LJIILLIIL() {
        VAE vae;
        t tVar;
        VBT vbt = this.LJLIL;
        if (vbt == null || (tVar = (vae = (VAE) vbt).LJLIL) == null || tVar.M() == null) {
            return -1;
        }
        return vae.LJLIL.M().ordinal();
    }

    @Override // X.InterfaceC28738BPq
    public final boolean LJIJJLI() {
        if (this.LJLJJL == 7) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJIII() {
        C28736BPo c28736BPo = new C28736BPo(this);
        C78579Ush c78579Ush = this.LL;
        c78579Ush.LIZ = false;
        c78579Ush.getClass();
        c28736BPo.LJ(this.LLFFF);
        LJJJJ(this.LLFFF, "release all force", true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release player force! -> player: ");
        LIZ.append(hashCode());
        LIZ.append(" release()");
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        this.LJLLLL = false;
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJIIJ();
        }
        VBT vbt2 = this.LJLIL;
        if (vbt2 != null) {
            ((VAE) vbt2).LJIIIZ(null, null);
            VAE vae = (VAE) this.LJLIL;
            vae.getClass();
            vae.LJI(VAE.LIZJ(13, null));
            this.LJLIL = null;
        }
        reset();
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJIIJ() {
        TextureView textureView = this.LJLJLLL;
        if (textureView == null) {
            return;
        }
        ViewParent parent = textureView.getParent();
        if (parent instanceof ViewGroup) {
            C16880lQ.LJLLL(this.LJLJLLL, (ViewGroup) parent);
        }
        B4I.LIZ("LivePlayController", "remove one px texture view");
        this.LJLJLLL.setSurfaceTextureListener(null);
        this.LJLJLLL = null;
    }

    @Override // X.InterfaceC28738BPq
    public final int LJJIIZI() {
        VAE vae;
        t tVar;
        VBT vbt = this.LJLIL;
        if (vbt != null && (tVar = (vae = (VAE) vbt).LJLIL) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getPlayerState: ");
            LIZ.append(tVar.LLIILII);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZJ();
            if (tVar.LLIILII != null) {
                t tVar2 = vae.LJLIL;
                tVar2.getClass();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getPlayerState: ");
                LIZ2.append(tVar2.LLIILII);
                X1D.LIZIZ(LIZ2);
                C46496IMq.LIZJ();
                return tVar2.LLIILII.ordinal();
            }
        }
        return -1;
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJJ() {
        C78579Ush c78579Ush = this.LL;
        c78579Ush.LIZ = true;
        c78579Ush.LIZIZ = C15380j0.LJIIJJI();
        c78579Ush.LIZJ = C15380j0.LJIIL();
        C78583Usl.LJI().LIZ(new ACallableS83S0101000_12(0, c78579Ush, 2));
    }

    @Override // X.InterfaceC28737BPp
    public final int LJJJI() {
        if (C38354F3m.LJ(this.LJLL) && C38354F3m.LJ(this.LJLLI)) {
            return 0;
        }
        if (!C38354F3m.LJ(this.LJLL)) {
            return 1;
        }
        return 2;
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJJJI() {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            VAE vae = (VAE) vbt;
            vae.getClass();
            vae.LJI(VAE.LIZJ(28, null));
        }
    }

    @Override // X.InterfaceC28738BPq
    public final long LJJJJLI() {
        t tVar;
        VBT vbt = this.LJLIL;
        if (vbt == null || (tVar = ((VAE) vbt).LJLIL) == null) {
            return 0L;
        }
        return tVar.W().LIZ;
    }

    @Override // X.InterfaceC28737BPp
    public final long LJJJJLL() {
        t tVar;
        VBT vbt = this.LJLIL;
        if (vbt == null || (tVar = ((VAE) vbt).LJLIL) == null) {
            return 0L;
        }
        return tVar.LJLJJI.LJIIL(100, 0L);
    }

    public final void LJJJLIIL() {
        EnumC79339VBv enumC79339VBv;
        if (this.LJLIL == null) {
            return;
        }
        if (this.LJLILLLLZI) {
            LJJJLL();
        }
        if (((VAE) this.LJLIL).LJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start player -> player: ");
            LIZ.append(hashCode());
            LIZ.append(" is playing. invoke stop");
            B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
            ((VAE) this.LJLIL).LJIIJ();
        }
        LJJLIIIJ();
        this.LJZI = 0;
        LJJLIIIIJ(false);
        LJJLIIIJILLIZJL(false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start player -> player: ");
        LIZ2.append(hashCode());
        LIZ2.append(" setDataSource()");
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ2));
        if (!C38354F3m.LJ(this.LJLLI)) {
            this.LLIIIJ = false;
            boolean isEnable = ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable();
            boolean isEnable2 = EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnable();
            if (isEnable && isEnable2 && LiveMode.isWatchGameLiveOrPCLive(this.LJZL)) {
                boolean LJI = C48189Ivh.LJI(this.LLF);
                C0RN.LIZLLL("setDataSource(). third party or screen live strategy. isWifiEnv=", LJI, "LivePlayController");
                if (LJI) {
                    java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.LLLZ.LIZJ();
                    if (LIZJ != null) {
                        String str = LIZJ.get("sdk_key");
                        String str2 = this.LJLLI;
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "data"), str);
                                this.LJLLILLLL = str;
                                this.LLIIIJ = !"auto".equalsIgnoreCase(str);
                            } catch (JSONException e) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("coldStart(). catch exception. e=");
                                LIZ3.append(e);
                                C0NB.LJ("LivePlayController", X1D.LIZIZ(LIZ3));
                            }
                        }
                    }
                } else {
                    InterfaceC30442Bx8.LLLZ.LIZ(null);
                    if (!"sd".equals(this.LJLLILLLL) && !"ld".equals(this.LJLLILLLL)) {
                        this.LJLLILLLL = "sd";
                    }
                }
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("setDataSource(). mDefaultResolution=");
            LIZ4.append(this.LJLLILLLL);
            LIZ4.append("; mStreamType=");
            LIZ4.append(this.LJZL);
            C0NB.LJIIIZ("LivePlayController", X1D.LIZIZ(LIZ4));
            VBT vbt = this.LJLIL;
            String str3 = this.LJLLI;
            String str4 = this.LJLLILLLL;
            VAE vae = (VAE) vbt;
            vae.getClass();
            vae.LJI(VAE.LIZJ(1, new VBM(str3, str4)));
        } else {
            int i = C79336VBs.LIZ[this.LJZL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        enumC79339VBv = EnumC79339VBv.VIDEO;
                    } else {
                        enumC79339VBv = EnumC79339VBv.SCREENSHOT;
                    }
                } else {
                    enumC79339VBv = EnumC79339VBv.OBS;
                }
            } else {
                enumC79339VBv = EnumC79339VBv.AUDIO;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_params", this.LJLLJ);
            VBT vbt2 = this.LJLIL;
            String str5 = this.LJLL;
            VAE vae2 = (VAE) vbt2;
            vae2.getClass();
            vae2.LJI(VAE.LIZJ(2, new VBS(str5, hashMap, enumC79339VBv)));
            VBT vbt3 = this.LJLIL;
            C28746BPy c28746BPy = this.LJLLL;
            boolean z = c28746BPy.LIZ;
            boolean z2 = c28746BPy.LIZIZ;
            int i2 = c28746BPy.LIZJ;
            VAE vae3 = (VAE) vbt3;
            vae3.getClass();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("setSuperResolutionOptions: ");
            LIZ5.append(z);
            LIZ5.append(",");
            LIZ5.append(z2);
            LIZ5.append(",");
            LIZ5.append(i2);
            vae3.LJFF(X1D.LIZIZ(LIZ5));
            vae3.LJI(VAE.LIZJ(16, new VC9()));
        }
        this.LLIIL = SystemClock.currentThreadTimeMillis();
        VBT vbt4 = this.LJLIL;
        boolean z3 = this.LLIFFJFJJ;
        VAE vae4 = (VAE) vbt4;
        vae4.getClass();
        vae4.LJI(VAE.LIZJ(9, Boolean.valueOf(z3)));
        long j = this.LLII;
        if (j > 0) {
            VAE vae5 = (VAE) this.LJLIL;
            vae5.getClass();
            vae5.LJI(VAE.LIZJ(27, Integer.valueOf(-((int) j))));
        }
        VAE vae6 = (VAE) this.LJLIL;
        vae6.getClass();
        vae6.LJI(VAE.LIZJ(4, null));
        if (ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable() && LiveMode.isWatchGameLiveOrPCLive(this.LJZL)) {
            VBT vbt5 = this.LJLIL;
            boolean z4 = !this.LLIIIJ;
            VAE vae7 = (VAE) vbt5;
            vae7.getClass();
            vae7.LJI(VAE.LIZJ(24, Boolean.valueOf(z4)));
        }
    }

    public final void LJJJLL() {
        C48436Izg c48436Izg;
        VBT vbt = this.LJLIL;
        boolean z = false;
        if (vbt != null) {
            ((VAE) vbt).LJI(VAE.LIZJ(14, null));
            ((VAE) this.LJLIL).LJIIIZ(null, null);
            LJJLIIIIJ(false);
            LJJLIIIJILLIZJL(false);
        }
        this.LJLIL = this.LLFF.LIZ(this.LLF, new C78429UqH(this), new C78576Use(this));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create TTPlayer2 -> player: ");
        LIZ.append(hashCode());
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        t tVar = ((VAE) this.LJLIL).LJLIL;
        if (tVar != null && (c48436Izg = tVar.LJLLL) != null && c48436Izg.LJI()) {
            z = true;
        }
        this.LJLILLLLZI = z;
        ((VAE) this.LJLIL).LJIIIZ(this, this);
        VBT vbt2 = this.LJLIL;
        boolean z2 = this.LLI;
        VAE vae = (VAE) vbt2;
        vae.getClass();
        vae.LJI(VAE.LIZJ(19, Boolean.valueOf(z2)));
        LJJLIIIJ();
    }

    public final void LJJL() {
        B4I.LIZ("LivePlayController", "player callback onStartPulling()");
        BQ5 bq5 = this.LJZ;
        if (bq5 instanceof BQF) {
            try {
                ((BQF) bq5).LJFF();
            } catch (Exception unused) {
            }
        }
        FP1.LJFF("onStartPulling, currentResolution= ", getCurrentResolution(), "LivePlayController");
        DataChannelGlobal.LJLJJI.tv0(AudienceResolutionBanAuto.class, Boolean.valueOf(!"auto".equals(r3)));
    }

    public final void LJJLIIIJ() {
        LiveMode liveMode = this.LJZL;
        if (liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.THIRD_PARTY || liveMode == LiveMode.LIVE_STUDIO || liveMode == LiveMode.OFFICIAL_ACTIVITY) {
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                VAE vae = (VAE) this.LJLIL;
                vae.getClass();
                vae.LJI(VAE.LIZJ(20, "musically_game_live"));
                return;
            } else {
                VAE vae2 = (VAE) this.LJLIL;
                vae2.getClass();
                vae2.LJI(VAE.LIZJ(20, "tiktok_game_live"));
                return;
            }
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
            VAE vae3 = (VAE) this.LJLIL;
            vae3.getClass();
            vae3.LJI(VAE.LIZJ(20, "musically_live"));
        } else {
            VAE vae4 = (VAE) this.LJLIL;
            vae4.getClass();
            vae4.LJI(VAE.LIZJ(20, "tiktok_live"));
        }
    }

    public final void LJJLIIIJJIZ() {
        VBT vbt = this.LJLIL;
        if (vbt == null) {
            return;
        }
        if (this.LLFII) {
            if (this.LLFZ || this.LLIIZ) {
                ((VAE) vbt).LJIIIIZZ(3);
                return;
            } else {
                ((VAE) vbt).LJIIIIZZ(2);
                return;
            }
        }
        ((VAE) vbt).LJIIIIZZ(0);
    }

    @Override // X.InterfaceC28738BPq
    public final String getCurrentResolution() {
        t tVar;
        String str;
        VBT vbt = this.LJLIL;
        if (vbt != null && (tVar = ((VAE) vbt).LJLIL) != null) {
            if (tVar.D3 == 1 && !TextUtils.equals(tVar.LLLILZLLLI, "auto")) {
                str = tVar.s7;
            } else {
                str = tVar.LLZLLIL;
            }
            C0AX.LIZIZ("getStringOption: ", str);
            return str;
        }
        return "";
    }

    @Override // X.InterfaceC28737BPp
    public final String getCurrentUrl() {
        VBT vbt = this.LJLIL;
        if (vbt == null || ((VAE) vbt).LIZLLL() == null) {
            return "";
        }
        return ((VAE) this.LJLIL).LIZLLL().optString("url:", "");
    }

    @Override // X.InterfaceC28737BPp
    public final View getVideoView() {
        Object obj = this.LJLJJLL;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public final int hashCode() {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            return vbt.hashCode();
        }
        return -1;
    }

    @Override // X.InterfaceC28737BPp
    public final boolean isPlaying() {
        boolean z;
        VBT vbt = this.LJLIL;
        if (vbt != null && ((VAE) vbt).LJ()) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playing -> controller");
        LIZ.append(hashCode());
        LIZ.append(" status: ");
        LIZ.append(z);
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        return z;
    }

    @Override // X.InterfaceC28738BPq
    public final boolean isVideoHorizontal() {
        Point point;
        VBT vbt = this.LJLIL;
        if (vbt == null) {
            return false;
        }
        VAE vae = (VAE) vbt;
        if (vae.LJLIL != null) {
            VAD vad = vae.LJLIL.LJLJJI;
            point = new Point(vad.q, vad.r);
        } else {
            point = new Point(0, 0);
        }
        if (point.x <= point.y) {
            return false;
        }
        return true;
    }

    public final void LJJJZ() {
        boolean z;
        VBT vbt;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDisplayStateChanged -> ");
        LIZ.append(this.LJLJJL);
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        if ((this.LJLJJL & 2) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (vbt = this.LJLIL) != null) {
            B4E b4e = this.LJLJJLL;
            if (b4e instanceof CVS) {
                ((VAE) vbt).LJII(this.LJLJLJ);
            } else if ((b4e instanceof CVR) || (b4e instanceof C31482CXe)) {
                ((VAE) vbt).LJI(VAE.LIZJ(5, this.LJLJL));
            }
            if ((this.LJLJJL & 1) > 0 && this.LJLLLL && !((VAE) this.LJLIL).LJ()) {
                VAE vae = (VAE) this.LJLIL;
                vae.getClass();
                vae.LJI(VAE.LIZJ(3, null));
            }
        }
        if (this.LJLJJL == 7 && this.LJLLLL) {
            B4I.LIZ("LivePlayController", "first frame -> send first frame message");
            if (LiveFirstFrameCallbackInsertMqHeadSetting.INSTANCE.getValue()) {
                BQ5 bq5 = this.LJZ;
                if (bq5 != null) {
                    bq5.LIZJ(EnumC79342VBy.DISPLAYED_PLAY, null);
                    return;
                }
                return;
            }
            this.LJLZ.obtainMessage(EnumC79342VBy.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
        }
    }

    @Override // X.InterfaceC28737BPp
    public final void LIZ() {
        try {
            LJJJLL();
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC28738BPq
    public final int LJJIIZ() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC28737BPp
    public final String LJJIJ() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC28738BPq
    public final String getPlayerTag() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC28737BPp
    public final int getVideoSize() {
        return this.LJZI;
    }

    @Override // X.InterfaceC28737BPp
    public final boolean isMute() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC28738BPq
    public final void LIZJ(boolean z) {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJI(VAE.LIZJ(24, Boolean.valueOf(z)));
        }
    }

    @Override // X.InterfaceC28737BPp
    public final void LIZLLL(boolean z) {
        C78579Ush c78579Ush = this.LL;
        if (c78579Ush != null) {
            c78579Ush.LJFF = z;
        }
    }

    @Override // X.InterfaceC28737BPp
    public final void LJ(ArrayList<String> arrayList) {
        if (this.LJLIL != null && !C79004UzY.LJJIFFI(arrayList)) {
            VAE vae = (VAE) this.LJLIL;
            vae.getClass();
            vae.LJI(VAE.LIZJ(25, arrayList));
        }
    }

    @Override // X.InterfaceC28738BPq
    public final void LJI(String str) {
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LJFF(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroy player -> tag ");
        LIZ.append(str);
        LIZ.append(" ,mPlayContextTag: ");
        LIZ.append(this.LLFFF);
        LIZ.append(" ,player: ");
        LIZ.append(hashCode());
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        if (!TextUtils.equals(str, this.LLFFF)) {
            return;
        }
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJIIIZ(null, null);
            VAE vae = (VAE) this.LJLIL;
            vae.getClass();
            vae.LJI(VAE.LIZJ(13, null));
            this.LJLIL = null;
        }
        reset();
    }

    @Override // X.InterfaceC28738BPq
    public final void LJII(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("stopWhenSlideSwitch -> playerTag: ", str, " ,mPlayContextTag:");
        LIZIZ.append(this.LLFFF);
        LIZIZ.append(" ,player: ");
        LIZIZ.append(hashCode());
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZIZ));
        if (!TextUtils.equals(str, this.LLFFF)) {
            return;
        }
        this.LJLLLL = false;
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJIIJ();
        }
        this.LJZ = null;
        this.LLIIIZ.clear();
        VBT vbt2 = this.LJLIL;
        if (vbt2 != null) {
            ((VAE) vbt2).LJI(VAE.LIZJ(5, null));
            VAE vae = (VAE) this.LJLIL;
            vae.getClass();
            vae.LJI(VAE.LIZJ(29, null));
            ((VAE) this.LJLIL).LJII(null);
            VAE vae2 = (VAE) this.LJLIL;
            vae2.getClass();
            vae2.LJI(VAE.LIZJ(7, Boolean.TRUE));
        }
        Object obj = this.LJLJJLL;
        if (obj instanceof CVR) {
            ((TextureView) obj).setSurfaceTextureListener(null);
        } else if (obj instanceof C31482CXe) {
            ((TextureView) obj).setSurfaceTextureListener(null);
        } else if (obj instanceof CVS) {
            ((SurfaceView) obj).getHolder().removeCallback(this.LLIIJLIL);
        }
        this.LJLJJLL = null;
        this.LLIIIILZ = true;
        Surface surface = this.LJLJL;
        if (surface != null) {
            surface.release();
            this.LJLJL = null;
        }
        if (this.LJLJLJ != null) {
            this.LJLJLJ = null;
        }
        LJJLIIIJJI(false);
        this.LLIIII = true;
    }

    @Override // X.InterfaceC28737BPp
    public final void LJIIIZ(boolean z) {
        this.LLIIII = z;
    }

    @Override // X.InterfaceC28737BPp
    public final void LJIIJ(int i) {
        C78579Ush c78579Ush = this.LL;
        if (c78579Ush != null) {
            c78579Ush.LJI = i;
        }
    }

    @Override // X.InterfaceC28737BPp
    public final void LJIIJJI(Context context) {
        String obj;
        if (context == null) {
            obj = "@";
        } else {
            obj = context.toString();
        }
        LJI(obj);
    }

    @Override // X.InterfaceC28738BPq
    public final void LJIIL(long j) {
        this.LLII = j;
    }

    @Override // X.InterfaceC28737BPp
    public final void LJIIZILJ(Context context) {
        String obj;
        if (context == null) {
            obj = "@";
        } else {
            obj = context.toString();
        }
        stop(obj);
    }

    @Override // X.InterfaceC28738BPq
    public final void LJIJ(BQ2 bq2) {
        this.LLD = new SoftReference<>(bq2);
    }

    @Override // X.InterfaceC28737BPp
    public final void LJIJI(InterfaceC28641BLx interfaceC28641BLx) {
        this.LLIIIL = interfaceC28641BLx;
    }

    @Override // X.InterfaceC79335VBr
    public final boolean LJIJJ(EnumC79337VBt enumC79337VBt) {
        if (C79336VBs.LIZIZ[enumC79337VBt.ordinal()] != 11 || !(this.LJLJJLL instanceof SurfaceView) || this.LLIIIILZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJ(boolean z) {
        this.LLI = z;
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJI(VAE.LIZJ(19, Boolean.valueOf(z)));
        }
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJI(C78144Ulg c78144Ulg) {
        this.LLIIIZ.remove(c78144Ulg);
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJIFFI(C78144Ulg c78144Ulg) {
        this.LLIIIZ.add(c78144Ulg);
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJIIJZLJL(C51093K3l c51093K3l) {
        this.LLIILZL = c51093K3l;
    }

    @Override // X.InterfaceC28737BPp
    public final boolean LJJIJIIJI(Context context) {
        String obj;
        if (context == null) {
            obj = "@";
        } else {
            obj = context.toString();
        }
        if (!TextUtils.equals(obj, this.LLFFF)) {
            return false;
        }
        new C28736BPo(this).LJ(obj);
        stop(obj);
        LJI(obj);
        return true;
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJIJIIJIL(boolean z) {
        this.LLIIZ = z;
        LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJIJIL(String str) {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            VAE vae = (VAE) vbt;
            vae.getClass();
            vae.LJI(VAE.LIZJ(22, str));
        }
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJIJLIJ(String str) {
        if (!TextUtils.equals(str, this.LLFFF)) {
            return;
        }
        BQ5 bq5 = this.LJZ;
        if (bq5 != null) {
            bq5.LIZJ(EnumC79342VBy.STOP_WHEN_PLAYING_OTHER, null);
        }
        LJI(str);
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJIZ(String str) {
        if (!TextUtils.equals(str, this.LLFFF)) {
            return;
        }
        BQ5 bq5 = this.LJZ;
        if (bq5 != null) {
            bq5.LIZJ(EnumC79342VBy.STOP_WHEN_JOIN_INTERACT, null);
        }
        LJI(str);
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJJJIZL(boolean z) {
        this.LLIIIILZ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC28738BPq
    public final void LJJJJJ(B4E b4e) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bindSurface -> renderView == null?");
        if (b4e == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        if (b4e == 0) {
            VBT vbt = this.LJLIL;
            if (vbt != null) {
                ((VAE) vbt).LJI(VAE.LIZJ(5, null));
                VAE vae = (VAE) this.LJLIL;
                vae.getClass();
                vae.LJI(VAE.LIZJ(29, null));
                ((VAE) this.LJLIL).LJIIJ();
            }
            Object obj = this.LJLJJLL;
            if (obj instanceof CVS) {
                ((SurfaceView) obj).getHolder().removeCallback(this.LLIIJLIL);
            } else if (obj instanceof CVR) {
                ((TextureView) obj).setSurfaceTextureListener(null);
            } else if (obj instanceof C31482CXe) {
                ((TextureView) obj).setSurfaceTextureListener(null);
            }
            this.LJLJJLL = null;
            Surface surface = this.LJLJL;
            if (surface != null) {
                surface.release();
                this.LJLJL = null;
            }
            this.LJLJLJ = null;
            if ((this.LJLJJL & 2) > 0) {
                LJJLIIIJJI(false);
                return;
            }
            return;
        }
        Object obj2 = this.LJLJJLL;
        if (obj2 == b4e) {
            return;
        }
        if (obj2 instanceof CVS) {
            ((SurfaceView) obj2).getHolder().removeCallback(this.LLIIJLIL);
        } else if (obj2 instanceof CVR) {
            ((TextureView) obj2).setSurfaceTextureListener(null);
        } else if (obj2 instanceof C31482CXe) {
            ((TextureView) obj2).setSurfaceTextureListener(null);
        }
        this.LJLJJLL = null;
        Surface surface2 = this.LJLJL;
        if (surface2 != null) {
            surface2.release();
            this.LJLJL = null;
        }
        this.LJLJJLL = b4e;
        if (b4e instanceof CVS) {
            ((SurfaceView) b4e).getHolder().addCallback(this.LLIIJLIL);
        } else if (b4e instanceof CVR) {
            ((TextureView) b4e).setSurfaceTextureListener(this.LLIIJI);
        } else if (b4e instanceof C31482CXe) {
            ((TextureView) b4e).setSurfaceTextureListener(this.LLIIJI);
        }
        Object obj3 = this.LJLJJLL;
        if (obj3 instanceof CVR) {
            if (((TextureView) obj3).getSurfaceTexture() != null) {
                this.LJLJL = new Surface(((TextureView) this.LJLJJLL).getSurfaceTexture());
                LJJLIIIJJI(true);
                return;
            } else {
                LJJLIIIJJI(false);
                return;
            }
        }
        if (obj3 instanceof C31482CXe) {
            if (((TextureView) obj3).getSurfaceTexture() != null) {
                this.LJLJL = new Surface(((TextureView) this.LJLJJLL).getSurfaceTexture());
                LJJLIIIJJI(true);
                return;
            } else {
                LJJLIIIJJI(false);
                return;
            }
        }
        if (obj3 instanceof CVS) {
            if (((SurfaceView) obj3).getHolder() != null) {
                this.LJLJLJ = ((SurfaceView) this.LJLJJLL).getHolder();
                LJJLIIIJJI(true);
                return;
            } else {
                LJJLIIIJJI(false);
                return;
            }
        }
        LJJLIIIJJI(false);
    }

    public final void LJJLI(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("cdn_play_url");
        if (TextUtils.isEmpty(optString) || TextUtils.equals(optString, LiveGiftNewGifterBadgeSetting.DEFAULT)) {
            return;
        }
        if (TextUtils.isEmpty(this.LLIILII)) {
            this.LLIILII = optString;
            return;
        }
        if (TextUtils.equals(this.LLIILII, optString)) {
            return;
        }
        String str = this.LLIILII;
        String str2 = this.LJLL;
        String str3 = this.LJLLI;
        String str4 = this.LJLLILLLL;
        String str5 = this.LJLLJ;
        C05630Jz.LJI(jSONObject, "device_name", Build.MODEL);
        C05630Jz.LJI(jSONObject, "last_cdn_play_url", str);
        C05630Jz.LJI(jSONObject, "url", str2);
        C05630Jz.LJI(jSONObject, "pull_stream_data", str3);
        C05630Jz.LJI(jSONObject, "default_resolution", str4);
        C05630Jz.LJI(jSONObject, "sdk_params", str5);
        C05630Jz.LJFF(jSONObject, "uid", B83.LIZ().LIZIZ().getCurrentUserId());
        C0K2.LJIIJJI(0, "ttlive_audience_enter_room_stream_switch", jSONObject);
    }

    public final void LJJLIIIIJ(boolean z) {
        if (z) {
            int i = this.LJLJJL | 1;
            this.LJLJJL = i;
            if (this.LJZL == LiveMode.AUDIO) {
                this.LJLJJL = i | 2 | 4;
            }
        } else {
            this.LJLJJL &= -2;
        }
        LJJJZ();
    }

    public final void LJJLIIIJILLIZJL(boolean z) {
        if (z) {
            this.LJLJJL |= 4;
        } else {
            this.LJLJJL &= -5;
        }
        LJJJZ();
    }

    public final void LJJLIIIJJI(boolean z) {
        if (z) {
            this.LJLJJL |= 2;
        } else {
            this.LJLJJL &= -3;
        }
        LJJJZ();
    }

    @Override // X.InterfaceC28738BPq
    public final void changeSRSupportScene(boolean z) {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            VAE vae = (VAE) vbt;
            vae.getClass();
            vae.LJI(VAE.LIZJ(23, Boolean.valueOf(z)));
        }
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        BQ5 bq5;
        int i = message.what;
        if (i == 9) {
            B4I.LIZ("LivePlayController", "restart play -> receive try again msg");
            try {
                LJJJLIIL();
                return;
            } catch (Exception e) {
                B4I.LIZ("LivePlayController", e.getMessage());
                return;
            }
        }
        EnumC79342VBy valueOf = EnumC79342VBy.valueOf(i);
        if (valueOf != EnumC79342VBy.UNKNOWN && (bq5 = this.LJZ) != null) {
            bq5.LIZJ(valueOf, message.obj);
        }
    }

    @Override // X.InterfaceC28737BPp
    public final boolean preCreatedSurface(Context context) {
        ActivityC45651qj LIZIZ;
        if (this.LJLJLLL != null || (LIZIZ = C29306Beo.LIZIZ(context)) == null || LIZIZ.isFinishing() || LIZIZ.getWindow() == null || LIZIZ.isDestroyed()) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) LIZIZ.getWindow().getDecorView().findViewById(R.id.content);
        TextureView textureView = new TextureView(LIZIZ);
        this.LJLJLLL = textureView;
        textureView.setSurfaceTextureListener(new VC1(this));
        viewGroup.addView(this.LJLJLLL, new ViewGroup.LayoutParams(1, 1));
        B4I.LIZ("PreCreateSurface", "add one px texture view into main activity");
        return true;
    }

    @Override // X.InterfaceC28738BPq
    public final void setAnchorInteractMode(boolean z) {
        this.LLFZ = z;
        LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC28738BPq
    public final void setScreenOrientation(boolean z) {
        this.LLFII = z;
        LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC28738BPq
    public final void stop(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("stop -> playerTag: ", str, " ,mPlayContextTag:");
        LIZIZ.append(this.LLFFF);
        LIZIZ.append(" ,player: ");
        LIZIZ.append(hashCode());
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZIZ));
        if (!TextUtils.equals(str, this.LLFFF)) {
            return;
        }
        this.LJLLLL = false;
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJIIJ();
        }
        this.LLIIIZ.clear();
    }

    @Override // X.InterfaceC28737BPp
    public final void switchResolution(String str) {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            VAE vae = (VAE) vbt;
            vae.getClass();
            vae.LJI(VAE.LIZJ(10, str));
            BQ5 bq5 = this.LJZ;
            if (bq5 != null) {
                bq5.LIZJ(EnumC79342VBy.START_SWITCH_RESOLUTION, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C79340VBw(Context context, VB0 vb0) {
        this.LLF = context;
        this.LLFF = vb0;
        if (MultiLivePlayerLogInstanceSetting.INSTANCE.getValue()) {
            this.LL = new C78579Ush(LiveWatchPreloadSettings.INSTANCE.gpuInfoDisable());
        } else {
            C28645BMb.LIZ().getClass();
            this.LL = (C78579Ush) VCT.LIZIZ(C78579Ush.class);
        }
        if (!LiveWatchPreloadSettings.INSTANCE.gpuInfoDisable()) {
            C28645BMb.LIZ().getClass();
            String LIZ = ((InterfaceC30552Byu) VCT.LIZIZ(InterfaceC30552Byu.class)).LIZ(context);
            if (LIZ != null) {
                this.LL.LJ = LIZ;
            }
        }
        reset();
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29051Bah.class)).LIZ = this;
    }

    @Override // X.InterfaceC28738BPq
    public final void LJIIIIZZ(JSONObject jSONObject, boolean z) {
        if (jSONObject != null && jSONObject.has("player_type")) {
            try {
                jSONObject.put("new_sdk", false);
            } catch (JSONException e) {
                C0NB.LJI("LivePlayController", e);
            }
        }
        LJJLI(jSONObject);
        C78579Ush c78579Ush = this.LL;
        c78579Ush.getClass();
        C78583Usl.LJI().LIZ(new CallableC78573Usb(c78579Ush.LIZIZ, c78579Ush.LIZJ, c78579Ush.LIZLLL, c78579Ush.LJ, jSONObject, z));
    }

    @Override // X.InterfaceC28737BPp
    public final void LJIL(String str, String str2) {
        if (LiveEnablePreCreatedPlayer.INSTANCE.getValue()) {
            if (this.LJLIL == null) {
                try {
                    LJJJLL();
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("prepare create player error");
                    LIZ.append(e.getMessage());
                    C0NB.LJ("LivePlayController", X1D.LIZIZ(LIZ));
                }
            }
            VAE vae = (VAE) this.LJLIL;
            vae.getClass();
            vae.LJI(VAE.LIZJ(26, new VBM(str, str2)));
        }
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJII(String str, String str2) {
        if (this.LJLIL == null) {
            try {
                LJJJLL();
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("prepare create player error");
                LIZ.append(e.getMessage());
                C0NB.LJ("LivePlayController", X1D.LIZIZ(LIZ));
            }
        }
        VAE vae = (VAE) this.LJLIL;
        vae.getClass();
        vae.LJI(VAE.LIZJ(30, new VBM(str, str2)));
    }

    @Override // X.InterfaceC28738BPq
    public final void LJJIL(String str, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("player_type")) {
            try {
                jSONObject.put("new_sdk", false);
            } catch (JSONException e) {
                C0NB.LJI("LivePlayController", e);
            }
        }
        LJJLI(jSONObject);
        C78579Ush c78579Ush = this.LL;
        c78579Ush.getClass();
        C78583Usl.LJI().LIZ(new CallableC78574Usc(c78579Ush.LIZIZ, c78579Ush.LIZJ, c78579Ush.LIZLLL, c78579Ush.LJ, jSONObject, str));
    }

    public final void LJJJLZIJ(EnumC79342VBy enumC79342VBy, Object obj) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            BQ5 bq5 = this.LJZ;
            if (bq5 != null) {
                bq5.LIZJ(enumC79342VBy, obj);
                return;
            }
            return;
        }
        this.LJLZ.obtainMessage(enumC79342VBy.ordinal(), obj).sendToTarget();
    }

    @Override // X.InterfaceC28737BPp
    public final void switchResolution(String str, VCA vca) {
        VBT vbt = this.LJLIL;
        if (vbt != null) {
            VAE vae = (VAE) vbt;
            if (vae.LJLJJL == null) {
                vae.LJLJJL = new Handler(vae.LJLJL.getLooper(), vae);
            }
            vae.LJI(Message.obtain(vae.LJLJJL, new ARunnableS13S1200000_14(vca, vae, str, 5)));
            BQ5 bq5 = this.LJZ;
            if (bq5 != null) {
                bq5.LIZJ(EnumC79342VBy.START_SWITCH_RESOLUTION, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    @Override // X.InterfaceC28738BPq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "onDestroy"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Ld
            r0 = 0
            r4.LJLJI = r0
            r4.LJLJJI = r0
        Ld:
            boolean r0 = r4.LJLJI
            if (r0 == 0) goto L13
            r4.LJLJJI = r7
        L13:
            java.lang.String r0 = "live_room_is_not_top_activity"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L91
            r4.LJLJI = r7
            if (r7 != 0) goto L91
            boolean r2 = r4.LJLJJI
        L21:
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r0 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.watch.IWatchLiveService r0 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r0
            boolean r0 = r0.Kd()
            r3 = 1
            if (r0 == 0) goto L31
            r2 = 1
        L31:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "setMute: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " -> playerTag="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " ,mPlayContextTag="
            r1.append(r0)
            java.lang.String r0 = r4.LLFFF
            r1.append(r0)
            java.lang.String r0 = " ,player: "
            r1.append(r0)
            int r0 = r4.hashCode()
            r1.append(r0)
            java.lang.String r0 = "; mute reason="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " , mute = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", mMuteBarrierForNonTopActivity="
            r1.append(r0)
            boolean r0 = r4.LJLJI
            r1.append(r0)
            java.lang.String r0 = ", mLastMuteStatusAfterBarrier="
            r1.append(r0)
            boolean r0 = r4.LJLJJI
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "LivePlayController"
            X.B4I.LIZ(r0, r1)
            java.lang.String r0 = r4.LLFFF
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            if (r0 != 0) goto L93
            return
        L91:
            r2 = r7
            goto L21
        L93:
            java.util.concurrent.CopyOnWriteArrayList<X.VC8> r0 = r4.LLIIIZ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb5
            java.util.concurrent.CopyOnWriteArrayList<X.VC8> r0 = r4.LLIIIZ
            java.util.Iterator r1 = r0.iterator()
        La1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r1.next()
            X.VC8 r0 = (X.VC8) r0
            r0.LIZ(r6)
            boolean r2 = r0.isMute()
            goto La1
        Lb5:
            java.lang.String r0 = "preview"
            boolean r1 = r0.equals(r6)
            boolean r0 = r4.LJLJI
            if (r0 == 0) goto Ld6
            if (r1 != 0) goto Ld6
        Lc1:
            X.VBT r2 = r4.LJLIL
            if (r2 == 0) goto Ld5
            X.VAE r2 = (X.VAE) r2
            r1 = 7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            android.os.Message r0 = X.VAE.LIZJ(r1, r0)
            r2.LJI(r0)
            r4.LJLLLLLL = r3
        Ld5:
            return
        Ld6:
            r3 = r2
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79340VBw.LJJJJ(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0119, code lost:
    
        if (r4 == null) goto L48;
     */
    @Override // X.InterfaceC79335VBr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(X.EnumC79337VBt r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79340VBw.LJJJJJL(X.VBt, int, java.lang.Object):void");
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJJJZ(Context context, String str, boolean z) {
        String obj;
        if (context == null) {
            obj = "@";
        } else {
            obj = context.toString();
        }
        LJJJJ(obj, str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC28738BPq
    public final void LJJIJL(String str, String str2, B4E b4e, int i, C28746BPy c28746BPy, BQ5 bq5, String str3) {
        String str4;
        if (str == null) {
            reset();
            if (this.LJLIL != null) {
                B4I.LIZ("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                VAE vae = (VAE) this.LJLIL;
                vae.LJFF("reset: ");
                vae.LJI(VAE.LIZJ(15, null));
                return;
            }
            return;
        }
        this.LLIILII = "";
        this.LJLL = "";
        if (this.LLIIII) {
            B4I.LIZ("LivePlayController", "start player -> reset controller`s pullStreamData");
            this.LJLLI = "";
        }
        this.LJZL = LiveMode.valueOf(i);
        if (b4e != 0) {
            if (b4e instanceof View) {
                Context context = ((View) b4e).getContext();
                if (context == null) {
                    str4 = "@";
                } else {
                    str4 = context.toString();
                }
            } else {
                str4 = null;
            }
            this.LLFFF = str4;
            LJJJJJ(b4e);
        }
        if (str3 != null) {
            this.LLFFF = str3;
        }
        this.LJZ = bq5;
        this.LJLLLL = true;
        boolean z = !C38354F3m.LIZJ(this.LJLLI, str);
        this.LJLLI = str;
        this.LJLLILLLL = str2;
        if (c28746BPy == null) {
            c28746BPy = LLIL;
        }
        this.LJLLL = c28746BPy;
        if (this.LJLIL == null) {
            LJJJLL();
        } else if (this.LJLILLLLZI) {
            LJJJLL();
        }
        if (this.LLI) {
            ((VAE) this.LJLIL).LJIIIIZZ(1);
        } else {
            ((VAE) this.LJLIL).LJIIIIZZ(0);
        }
        ((VAE) this.LJLIL).LJIIIZ(this, this);
        VBT vbt = this.LJLIL;
        C51093K3l c51093K3l = this.LLIILZL;
        VAE vae2 = (VAE) vbt;
        vae2.getClass();
        if (c51093K3l == null) {
            c51093K3l = new C51093K3l("", "", "");
        }
        vae2.LJI(VAE.LIZJ(21, c51093K3l));
        LJJLIIIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start player -> playerTag: ");
        LIZ.append(str3);
        LIZ.append(" ,mPlayContextTag: ");
        LIZ.append(this.LLFFF);
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        if (!z) {
            int i2 = this.LJLJJL;
            if ((i2 & 1) > 0) {
                if ((i2 & 2) > 0) {
                    B4I.LIZ("LivePlayController", "start player -> share player reuse stream");
                    B4E b4e2 = this.LJLJJLL;
                    if (b4e2 instanceof CVS) {
                        ((VAE) this.LJLIL).LJII(this.LJLJLJ);
                    } else if ((b4e2 instanceof CVR) || (b4e2 instanceof C31482CXe)) {
                        VBT vbt2 = this.LJLIL;
                        Surface surface = this.LJLJL;
                        VAE vae3 = (VAE) vbt2;
                        vae3.getClass();
                        vae3.LJI(VAE.LIZJ(5, surface));
                    }
                    if (!((VAE) this.LJLIL).LJ()) {
                        B4I.LIZ("LivePlayController", "start player -> fallback: live player start pulling");
                        VAE vae4 = (VAE) this.LJLIL;
                        vae4.getClass();
                        vae4.LJI(VAE.LIZJ(3, null));
                    }
                    if ((this.LJLJJL & 4) > 0) {
                        this.LJLZ.obtainMessage(EnumC79342VBy.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!this.LLIIII) {
            return;
        }
        LJJJLIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC28738BPq
    public final void LJJJIL(String str, B4E b4e, int i, C28746BPy c28746BPy, BQ5 bq5, String str2, String str3) {
        boolean z;
        String str4;
        if (str == null) {
            reset();
            if (this.LJLIL != null) {
                B4I.LIZ("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                VAE vae = (VAE) this.LJLIL;
                vae.LJFF("reset: ");
                vae.LJI(VAE.LIZJ(15, null));
                return;
            }
            return;
        }
        this.LLIILII = "";
        this.LJLL = "";
        this.LJLLI = "";
        this.LJZL = LiveMode.valueOf(i);
        if (b4e != 0) {
            if (b4e instanceof View) {
                Context context = ((View) b4e).getContext();
                if (context == null) {
                    str4 = "@";
                } else {
                    str4 = context.toString();
                }
            } else {
                str4 = null;
            }
            this.LLFFF = str4;
            LJJJJJ(b4e);
        }
        if (str3 != null) {
            this.LLFFF = str3;
        }
        BQ5 bq52 = this.LJZ;
        if (bq52 != null) {
            bq52.LIZJ(EnumC79342VBy.PLAYER_DETACHED, null);
        }
        this.LJZ = bq5;
        this.LJLLLL = true;
        try {
            android.net.Uri parse = UriProtector.parse(this.LJLL);
            android.net.Uri parse2 = UriProtector.parse(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(parse.getHost());
            LIZ.append(parse.getPath());
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(parse2.getHost());
            LIZ2.append(parse2.getPath());
            z = !C38354F3m.LIZJ(LIZIZ, X1D.LIZIZ(LIZ2));
        } catch (Exception unused) {
            z = true;
        }
        this.LJLL = str;
        this.LJLLJ = str2;
        if (c28746BPy == null) {
            c28746BPy = LLIL;
        }
        this.LJLLL = c28746BPy;
        if (this.LJLIL == null) {
            LJJJLL();
        } else if (this.LJLILLLLZI) {
            LJJJLL();
        }
        if (this.LLI) {
            ((VAE) this.LJLIL).LJIIIIZZ(1);
        } else {
            ((VAE) this.LJLIL).LJIIIIZZ(0);
        }
        ((VAE) this.LJLIL).LJIIIZ(this, this);
        VBT vbt = this.LJLIL;
        C51093K3l c51093K3l = this.LLIILZL;
        VAE vae2 = (VAE) vbt;
        vae2.getClass();
        if (c51093K3l == null) {
            c51093K3l = new C51093K3l("", "", "");
        }
        vae2.LJI(VAE.LIZJ(21, c51093K3l));
        LJJLIIIJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("start player -> playerTag: ");
        LIZ3.append(str3);
        LIZ3.append(" ,mPlayContextTag: ");
        LIZ3.append(this.LLFFF);
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ3));
        if (!z) {
            int i2 = this.LJLJJL;
            if ((i2 & 1) > 0) {
                if ((i2 & 2) > 0) {
                    B4E b4e2 = this.LJLJJLL;
                    if (b4e2 instanceof CVS) {
                        ((VAE) this.LJLIL).LJII(this.LJLJLJ);
                    } else if ((b4e2 instanceof CVR) || (b4e2 instanceof C31482CXe)) {
                        VBT vbt2 = this.LJLIL;
                        Surface surface = this.LJLJL;
                        VAE vae3 = (VAE) vbt2;
                        vae3.getClass();
                        vae3.LJI(VAE.LIZJ(5, surface));
                    }
                    B4I.LIZ("LivePlayController", "start player -> share player or reuse stream");
                    if (!((VAE) this.LJLIL).LJ()) {
                        B4I.LIZ("LivePlayController", "start player -> fallback: live player start pulling");
                        VAE vae4 = (VAE) this.LJLIL;
                        vae4.getClass();
                        vae4.LJI(VAE.LIZJ(3, null));
                    }
                    if ((this.LJLJJL & 4) > 0) {
                        this.LJLZ.obtainMessage(EnumC79342VBy.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!this.LLIIII) {
            return;
        }
        LJJJLIIL();
    }

    @Override // X.InterfaceC28737BPp
    public final void LJJJJZI(String str, B4L b4l, int i, C28746BPy c28746BPy, BQ5 bq5, String str2, String str3) {
        LJJIJL(str, str2, b4l, i, c28746BPy, bq5, str3);
    }
}

package com.bytedance.ies.xelement.alphavideo;

import X.AbstractC48384Iyq;
import X.AnonymousClass636;
import X.C0NY;
import X.C16880lQ;
import X.C1DD;
import X.C37692Eqm;
import X.C40675Fxn;
import X.C48438Izi;
import X.C48439Izj;
import X.C61259O2l;
import X.C64493PSv;
import X.C65202PiQ;
import X.C68322mC;
import X.C72972SkS;
import X.C79561VKj;
import X.C79876VWm;
import X.C79880VWq;
import X.C79881VWr;
import X.C79882VWs;
import X.C79883VWt;
import X.C79884VWu;
import X.C79885VWv;
import X.C79886VWw;
import X.C79887VWx;
import X.C79888VWy;
import X.C81392Vwy;
import X.CallableC79879VWp;
import X.EWS;
import X.J0G;
import X.PVC;
import X.QZZ;
import X.V9E;
import X.VA1;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VX1;
import X.VX2;
import X.VX3;
import X.VX4;
import X.VX5;
import X.W4W;
import X.W5A;
import X.W5I;
import X.W5P;
import X.X1D;
import Y.ACallableS39S1100000_14;
import Y.ARunnableS15S1100000_14;
import Y.ARunnableS7S1200000_8;
import Y.IDComparatorS38S0000000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.s;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class LynxAlphaVideo extends UISimpleView<C79885VWv> {
    public PlayerController LJLIL;
    public Set<String> LJLILLLLZI;
    public DataSource LJLJI;
    public C48439Izj LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public J0G<C61259O2l> LJLJLJ;
    public Bitmap LJLJLLL;
    public String LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final List<Integer> LJLLL;
    public final List<Integer> LJLLLL;
    public final VX5 LJLLLLLL;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        PlayerController playerController = this.LJLIL;
        if (playerController != null) {
            playerController.release();
            PlayerController playerController2 = this.LJLIL;
            if (playerController2 != null) {
                playerController2.detachAlphaView((ViewGroup) this.mView);
                ((C79885VWv) this.mView).setMPoster(null);
                this.LJLJLLL = null;
                ((C79885VWv) this.mView).setMLastFrame(null);
                PlayerController playerController3 = this.LJLIL;
                if ((playerController3 instanceof PlayerController) && playerController3 != null) {
                    playerController3.setFirstGLFrameListener(null);
                }
                PlayerController playerController4 = this.LJLIL;
                if (playerController4 != null) {
                    playerController4.withVideoAction(null);
                }
                PlayerController playerController5 = this.LJLIL;
                if (playerController5 != null) {
                    playerController5.setMonitor(null);
                    return;
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        PlayerController playerController;
        super.onAttach();
        if (!this.LJLLJ && (playerController = this.LJLIL) != null && this.LJLJJL) {
            playerController.attachAlphaView((ViewGroup) this.mView);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        PlayerController playerController;
        super.onDetach();
        if (!this.LJLLJ && (playerController = this.LJLIL) != null) {
            playerController.detachAlphaView((ViewGroup) this.mView);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        PlayerController playerController = this.LJLIL;
        if (playerController != null) {
            playerController.getView().layout(0, 0, getWidth(), getHeight());
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LynxAlphaVideo(VNU context) {
        this(context, "x-alpha_video-flower");
        o.LJIIJ(context, "context");
    }

    public static String LJIL(String str) {
        byte[] bytes;
        MessageDigest messageDigest;
        Charset charset;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            charset = PVC.LIZ;
        } catch (NoSuchAlgorithmException unused) {
            Charset charset2 = PVC.LIZ;
            if (str != null) {
                bytes = str.getBytes(charset2);
                o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
            }
        }
        if (str != null) {
            byte[] bytes2 = str.getBytes(charset);
            o.LJFF(bytes2, "(this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes2);
            bytes = messageDigest.digest();
            o.LJFF(bytes, "digest.digest()");
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                String hexString = Integer.toHexString(b & 255);
                o.LJFF(hexString, "Integer.toHexString(0xFF and byte.toInt())");
                if (hexString.length() < 2) {
                    hexString = QZZ.LIZIZ('0', hexString);
                }
                sb.append(hexString);
            }
            String sb2 = sb.toString();
            o.LJFF(sb2, "result.toString()");
            return sb2;
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
    }

    public final DataSource LJIJJLI(String str) {
        VideoFileModel videoFileModel;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(i0.LJFF(str, "config.json")));
        try {
            new C68322mC();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            AnonymousClass636.LJFF(bufferedReader, null);
            try {
                videoFileModel = (VideoFileModel) GsonProtectorUtils.fromJson(C65202PiQ.LIZ, sb.toString(), VideoFileModel.class);
            } catch (s e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("parse config.json failed, error msg is ");
                LIZ.append(e);
                LJJI(-3, X1D.LIZIZ(LIZ), this.LJLL);
            }
            if (videoFileModel != null) {
                DataSource dataSource = new DataSource();
                if (videoFileModel.portrait != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(videoFileModel.portrait.path);
                    DataSource.DataInfo dataInfo = new DataSource.DataInfo(X1D.LIZIZ(LIZ2));
                    dataInfo.setScaleType(videoFileModel.portrait.align);
                    dataInfo.setVersion(videoFileModel.portrait.version);
                    dataInfo.setTotalFrame(videoFileModel.portrait.totalFrame);
                    dataInfo.setVideoWidth(videoFileModel.portrait.videoWidth);
                    dataInfo.setVideoHeight(videoFileModel.portrait.videoHeight);
                    dataInfo.setActualWidth(videoFileModel.portrait.actualWidth);
                    dataInfo.setActualHeight(videoFileModel.portrait.actualHeight);
                    dataInfo.setAlphaArea(videoFileModel.portrait.alphaFrame);
                    dataInfo.setRgbArea(videoFileModel.portrait.rgbFrame);
                    dataInfo.setMasks(videoFileModel.portrait.masks);
                    dataSource.setPortraitDataInfo(dataInfo);
                }
                if (videoFileModel.landscape != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str);
                    LIZ3.append(videoFileModel.landscape.path);
                    DataSource.DataInfo dataInfo2 = new DataSource.DataInfo(X1D.LIZIZ(LIZ3));
                    dataInfo2.setScaleType(videoFileModel.landscape.align);
                    dataInfo2.setVersion(videoFileModel.landscape.version);
                    dataInfo2.setTotalFrame(videoFileModel.landscape.totalFrame);
                    dataInfo2.setVideoWidth(videoFileModel.landscape.videoWidth);
                    dataInfo2.setVideoHeight(videoFileModel.landscape.videoHeight);
                    dataInfo2.setActualWidth(videoFileModel.landscape.actualWidth);
                    dataInfo2.setActualHeight(videoFileModel.landscape.actualHeight);
                    dataInfo2.setAlphaArea(videoFileModel.landscape.alphaFrame);
                    dataInfo2.setRgbArea(videoFileModel.landscape.rgbFrame);
                    dataInfo2.setMasks(videoFileModel.landscape.masks);
                    dataSource.setLandscapeDataInfo(dataInfo2);
                }
                Object obj = getProps().get("keep-last-frame");
                Boolean bool = Boolean.TRUE;
                if (o.LJ(obj, bool)) {
                    dataSource.setAutoRelease(false);
                }
                if (o.LJ(getProps().get("loop"), bool)) {
                    dataSource.setLoop(true);
                }
                return dataSource;
            }
            LJJI(-14, "fileModel is null", this.LJLL);
            return null;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r8.equals("https") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.LJJIFFI(java.lang.String):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        Context context2;
        C79885VWv c79885VWv = new C79885VWv(context);
        Configuration configuration = new Configuration();
        Context context3 = null;
        if (context != null) {
            context2 = C16880lQ.LLLLL(context);
        } else {
            context2 = null;
        }
        configuration.setContext(context2);
        configuration.setLifecycleOwner(c79885VWv);
        configuration.setAlphaVideoViewType(1);
        C79883VWt c79883VWt = new C79883VWt(this);
        C79886VWw c79886VWw = new C79886VWw(this);
        try {
            if (context != null) {
                context3 = C16880lQ.LLLLL(context);
            }
            C48439Izj c48439Izj = new C48439Izj(context3);
            this.LJLJJI = c48439Izj;
            this.LJLIL = PlayerController.get(configuration, c48439Izj);
        } catch (Exception e) {
            LJJI(-10, C1DD.LJ("init CustomPlayerImpl failed and try to use DefaultSystemPlayer, the exception is ", e), this.LJLL);
            this.LJLIL = PlayerController.get(configuration, new DefaultSystemPlayer());
        }
        PlayerController playerController = this.LJLIL;
        if (playerController != null) {
            playerController.withVideoAction(c79883VWt);
        }
        PlayerController playerController2 = this.LJLIL;
        if (playerController2 != null) {
            playerController2.setMonitor(c79886VWw);
        }
        PlayerController playerController3 = this.LJLIL;
        if (playerController3 instanceof PlayerController) {
            if (playerController3 != null) {
                playerController3.setFirstGLFrameListener(new VX2(this));
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController");
            }
        }
        PlayerController playerController4 = this.LJLIL;
        if (playerController4 != null) {
            playerController4.setProgressListener(new C79882VWs(this), 5L);
        }
        return c79885VWv;
    }

    @VPD(defaultBoolean = false, name = "android-ignore-attach-status")
    public final void setAndroidIgnoreAttachStatus(boolean z) {
        this.LJLLJ = z;
        T t = this.mView;
        if (t != 0) {
            ((C79885VWv) t).setMIgnoreAttachStatus(z);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.xelement.alphavideo.LynxAlphaVideoView");
    }

    @VPD(defaultBoolean = true, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LJLJJL = z;
        T t = this.mView;
        if (t != 0) {
            ((C79885VWv) t).setMAutoPlay(z);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.xelement.alphavideo.LynxAlphaVideoView");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        Set<String> set;
        super.setEvents(map);
        if (map != null) {
            set = map.keySet();
        } else {
            set = null;
        }
        this.LJLILLLLZI = set;
    }

    @VPD(defaultBoolean = false, name = "frame-hold")
    public final void setFrameHold(boolean z) {
        this.LJLLILLLL = z;
    }

    @VPD(defaultBoolean = false, name = "keep-last-frame")
    public final void setKeepLastFrame(boolean z) {
        if (this.LJLJJLL != z) {
            DataSource dataSource = this.LJLJI;
            if (dataSource != null) {
                dataSource.setAutoRelease(!z);
            }
            this.LJLJJLL = z;
        }
    }

    @VPD(name = "last-frame")
    public final void setLastFrame(String str) {
        if (str == null) {
            return;
        }
        C79876VWm c79876VWm = new C79876VWm(new ACallableS39S1100000_14(this, str, 0));
        c79876VWm.LIZIZ(new C79887VWx(this));
        c79876VWm.LIZ(new C79880VWq(this, str));
    }

    @VPD(defaultBoolean = false, name = "loop")
    public final void setLoop(boolean z) {
        DataSource dataSource = this.LJLJI;
        if (dataSource != null) {
            dataSource.setLoop(z);
        }
    }

    @VPD(name = "poster")
    public final void setPoster(String str) {
        if (str == null) {
            return;
        }
        C79876VWm c79876VWm = new C79876VWm(new ACallableS39S1100000_14(this, str, 1));
        c79876VWm.LIZIZ(new C79888VWy(this));
        c79876VWm.LIZ(new C79881VWr(this, str));
    }

    @VPD(name = "src")
    public final void setSrc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C64493PSv.LIZ().execute(new ARunnableS15S1100000_14(this, str, 7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxAlphaVideo(VNU context, String str) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLJJL = true;
        this.LJLJL = true;
        this.LJLL = "";
        this.LJLLL = new ArrayList();
        this.LJLLLL = new ArrayList();
        this.LJLLLLLL = new VX5(str);
    }

    public final void LJJII(String url, VX3 vx3) {
        o.LJIIJ(url, "url");
        String LIZ = VA1.LIZ(this.mContext, url, false);
        o.LJFF(LIZ, "ImageUrlRedirectUtils.re…rectUrl(lynxContext, URL)");
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(LIZ));
        V9E.LIZIZ(LIZLLL, Bitmap.Config.ARGB_8888);
        W4W<C81392Vwy<W5A>> LJ = W5I.LIZ().LJ(LIZLLL.LIZ(), "x-alpha-video");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        VX4 vx4 = new VX4(vx3, countDownLatch, LJ);
        ((AbstractC48384Iyq) LJ).LJ(vx4, C79561VKj.LJLIL);
        try {
            if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                vx4.LIZ(LJ);
            }
        } catch (InterruptedException unused) {
            vx4.LIZ(LJ);
        }
    }

    public final void LJJIII(String str, String str2) {
        C79876VWm c79876VWm = new C79876VWm(new CallableC79879VWp(this, str, str2));
        c79876VWm.LIZIZ(new C79884VWu(this));
        c79876VWm.LIZ(new VX1(this));
    }

    public final void LJJIIJ(String str, Map<String, Object> map) {
        C64493PSv.LIZJ().execute(new ARunnableS7S1200000_8(map, this, str, 1));
    }

    @EWS
    public final void getDuration(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && this.LJLIL != null) {
            try {
                javaOnlyMap.putBoolean("success", true);
                PlayerController playerController = this.LJLIL;
                if (playerController != null) {
                    int duration = playerController.getDuration();
                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                    javaOnlyMap2.putInt("duration", duration);
                    javaOnlyMap.putMap("data", javaOnlyMap2);
                    callback.invoke(0, javaOnlyMap);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void isPlaying(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && this.LJLIL != null) {
            try {
                javaOnlyMap.putBoolean("success", true);
                PlayerController playerController = this.LJLIL;
                if (playerController != null) {
                    boolean isPlaying = playerController.isPlaying();
                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                    javaOnlyMap2.putBoolean("isPlaying", isPlaying);
                    javaOnlyMap.putMap("data", javaOnlyMap2);
                    callback.invoke(0, javaOnlyMap);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void pause(ReadableMap params, Callback callback) {
        PlayerController playerController;
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (playerController = this.LJLIL) != null) {
            try {
                playerController.pause();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void play(ReadableMap params, Callback callback) {
        PlayerController playerController;
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (playerController = this.LJLIL) != null) {
            try {
                if (!playerController.isPlaying() && this.LJLJI != null) {
                    PlayerController playerController2 = this.LJLIL;
                    if (playerController2 != null) {
                        playerController2.attachAlphaView((ViewGroup) this.mView);
                        PlayerController playerController3 = this.LJLIL;
                        if (playerController3 != null) {
                            playerController3.startWithLastFrameHold(this.LJLJI, this.LJLLILLLL);
                            callback.invoke(0, javaOnlyMap);
                            return;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                callback.invoke(1, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void release(ReadableMap params, Callback callback) {
        PlayerController playerController;
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("success", true);
        javaOnlyMap.putMap("data", new JavaOnlyMap());
        if (this.mView != 0 && (playerController = this.LJLIL) != null) {
            try {
                playerController.release();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void resume(ReadableMap params, Callback callback) {
        PlayerController playerController;
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("success", true);
        javaOnlyMap.putMap("data", new JavaOnlyMap());
        if (this.mView != 0 && (playerController = this.LJLIL) != null && !playerController.isPlaying()) {
            try {
                PlayerController playerController2 = this.LJLIL;
                if (playerController2 != null) {
                    playerController2.attachAlphaView((ViewGroup) this.mView);
                    PlayerController playerController3 = this.LJLIL;
                    if (playerController3 != null) {
                        playerController3.resume();
                        callback.invoke(0, javaOnlyMap);
                        return;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                o.LJIIZILJ();
                throw null;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void seek(ReadableMap readableMap, Callback callback) {
        Integer valueOf;
        C48438Izi c48438Izi;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == 0 || this.LJLIL == null) {
            javaOnlyMap.putString("message", "View or player controller is not available");
            if (callback != null) {
                callback.invoke(1, javaOnlyMap);
                return;
            }
            return;
        }
        if (readableMap == null || (valueOf = Integer.valueOf(readableMap.getInt("ms"))) == null) {
            javaOnlyMap.putString("message", "Invalid 'ms' parameter");
            if (callback != null) {
                callback.invoke(4, javaOnlyMap);
                return;
            }
            return;
        }
        try {
            C48439Izj c48439Izj = this.LJLJJI;
            if (c48439Izj != null && (c48438Izi = c48439Izj.LIZIZ) != null) {
                c48438Izi.LJ(515, 1);
                c48439Izj.LIZIZ.LJ(143, 1);
                c48439Izj.LIZIZ.LJ(110, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            }
            PlayerController playerController = this.LJLIL;
            if (playerController != null) {
                playerController.seekTo(valueOf.intValue());
            }
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
            }
        } catch (Exception e) {
            javaOnlyMap.putString("message", e.getMessage());
            if (callback != null) {
                callback.invoke(1, javaOnlyMap);
            }
        }
    }

    @EWS
    public final void stop(ReadableMap params, Callback callback) {
        PlayerController playerController;
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (playerController = this.LJLIL) != null) {
            try {
                playerController.stop();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void subscribeUpdateEvent(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        int i = params.getInt("ms");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeUpdateEvent: ");
        LIZ.append(i);
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
        if (!((ArrayList) this.LJLLL).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LJLLL).add(Integer.valueOf(i));
            ArrayList arrayList = (ArrayList) this.LJLLL;
            if (arrayList.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS38S0000000_10(1));
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(1, C0NY.LIZIZ("already subscribeUpdateEvent with ", i, " milliseconds"));
    }

    @EWS
    public final void unsubscribeUpdateEvent(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        int i = params.getInt("ms");
        if (((ArrayList) this.LJLLL).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LJLLL).remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(1, C72972SkS.LIZLLL(i, " milliseconds is not subscribed"));
    }

    public static Map LJJ(int i, String str, JavaOnlyMap javaOnlyMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("message", str);
        if (javaOnlyMap != null) {
            for (Map.Entry<String, Object> entry : javaOnlyMap.entrySet()) {
                String key = entry.getKey();
                o.LJFF(key, "it.key");
                Object value = entry.getValue();
                o.LJFF(value, "it.value");
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    public final void LJJI(int i, String str, String str2) {
        LJJIIJ("error", LJJ(i, str, null));
        VX5 vx5 = this.LJLLLLLL;
        vx5.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", String.valueOf(i));
        jSONObject.put("resource_url", str2);
        jSONObject.put("message", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", vx5.LIZ);
        HybridMultiMonitor.getInstance().customReport(str2, "", "alpha_video_runtime_error", jSONObject, null, null, jSONObject2, 2);
        LLog.LIZLLL(4, "x-alpha-video", str);
    }
}

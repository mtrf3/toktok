package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.feed.TtliveGamePreviewStreamScaleOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLandscapeFeedPreviewSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostFeedRemoveOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreviewCardUsePreviewSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CkA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32186CkA implements InterfaceC86353Xun, BQ5 {
    public final InterfaceC32188CkC LIZ;
    public final EnumC72797Shd LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public LiveRoomStruct LJFF;
    public FrameLayout LJI;
    public String LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public C28185B4j LJIILIIL;
    public InterfaceC32193CkH LJIILJJIL;
    public LiveWidget LJIILL;
    public boolean LJIILLIIL;
    public InterfaceC28738BPq LJIIZILJ;
    public C51093K3l LJIJ;
    public InterfaceC28641BLx LJIJI;
    public InterfaceC32187CkB LJIJJ;
    public InterfaceC32190CkE LJIJJLI;
    public InterfaceC88472Yns<? super Rect, C76800UCe> LJIL;

    @Override // X.InterfaceC86353Xun
    public final void LLZLLIL() {
        this.LJIILLIIL = false;
    }

    @Override // X.InterfaceC86353Xun
    public final void e(InterfaceC32195CkJ interfaceC32195CkJ) {
    }

    @Override // X.BQ5
    public final boolean LIZ() {
        InterfaceC32188CkC interfaceC32188CkC = this.LIZ;
        if (interfaceC32188CkC == null || !interfaceC32188CkC.LIZ()) {
            return false;
        }
        return true;
    }

    public final Context LJIIIZ() {
        FrameLayout frameLayout = this.LJI;
        if (frameLayout != null) {
            return frameLayout.getContext();
        }
        return null;
    }

    public final InterfaceC28738BPq LJIIJ() {
        Long l;
        Object obj;
        C86393XvR LJJIJIL;
        if (this.LJIIZILJ == null) {
            InterfaceC28738BPq interfaceC28738BPq = null;
            if (this.LJFF == null) {
                return null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preview_");
            LiveRoomStruct liveRoomStruct = this.LJFF;
            if (liveRoomStruct != null) {
                l = Long.valueOf(liveRoomStruct.id);
            } else {
                l = null;
            }
            LIZ.append(l);
            LIZ.append('_');
            LIZ.append(SystemClock.uptimeMillis());
            this.LIZLLL = X1D.LIZIZ(LIZ);
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
                obj = LJJIJIL.LJJJJZ(this.LIZLLL);
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC28738BPq) {
                interfaceC28738BPq = (InterfaceC28738BPq) obj;
            }
            this.LJIIZILJ = interfaceC28738BPq;
        }
        return this.LJIIZILJ;
    }

    public final void LJIILL() {
        B4I.LIZJ("LivePlayHelper_Preview", "+++++++++++++++++++++ resetPlayer");
        try {
            InterfaceC28738BPq LJIIJ = LJIIJ();
            if (LJIIJ != null) {
                LJIIJ.LJIILL();
                LJIIJ.LJJJJJ(null);
            }
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void LLZLI() {
        C28185B4j c28185B4j = this.LJIILIIL;
        if (c28185B4j != null) {
            View view = c28185B4j.LIZ;
            if ((view instanceof SurfaceView) && (view.getParent() instanceof ViewGroup)) {
                Object parent = c28185B4j.LIZ.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((View) parent).setTranslationX(0.0f);
            }
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void g() {
        if (LiveCoHostFeedRemoveOptSetting.INSTANCE.isEnable()) {
            LJIIIIZZ("resetInteractPreviewViewOnPause", true);
        } else {
            LJIILJJIL("resetInteractPreviewView", true);
        }
    }

    @Override // X.InterfaceC86353Xun
    public final JSONObject LIZIZ() {
        JSONObject LIZIZ;
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ == null || (LIZIZ = LJIIJ.LIZIZ()) == null) {
            return new JSONObject();
        }
        return LIZIZ;
    }

    public final void LJIIL() {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            if (LJIIJ() != null) {
                if (!TextUtils.isEmpty(this.LIZLLL)) {
                    LJIIJ.stop(this.LIZLLL);
                } else {
                    LJIIJ.LJIIZILJ(LJIIIZ());
                }
            }
            this.LJ = null;
            this.LJFF = null;
            this.LJII = null;
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void LLZZLLIL() {
        J0Z j0z;
        J0Z j0z2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append("+++++++++++++++++++++ready to stopStreamData");
        B4I.LIZJ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ));
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null && TextUtils.equals(this.LJ, LJIIJ.LJJIJ())) {
            if (((Boolean) C52361Kgn.LIZ.getValue()).booleanValue()) {
                LJIIL();
                this.LJIJ = null;
                this.LJIJI = null;
                LJIILL();
                C28185B4j c28185B4j = this.LJIILIIL;
                if (c28185B4j != null) {
                    c28185B4j.LIZ();
                }
                C28185B4j c28185B4j2 = this.LJIILIIL;
                if (c28185B4j2 != null && (j0z2 = c28185B4j2.LIZIZ) != null) {
                    j0z2.LJII = true;
                }
                LJIILJJIL("stopWithStreamData", false);
                this.LJIILIIL = null;
                this.LJIILLIIL = false;
                InterfaceC28641BLx interfaceC28641BLx = this.LJIJI;
                if (interfaceC28641BLx != null) {
                    interfaceC28641BLx.LIZIZ();
                    return;
                }
                return;
            }
            C28185B4j c28185B4j3 = this.LJIILIIL;
            if (c28185B4j3 != null) {
                c28185B4j3.LIZ();
            }
            C28185B4j c28185B4j4 = this.LJIILIIL;
            if (c28185B4j4 != null && (j0z = c28185B4j4.LIZIZ) != null) {
                j0z.LJII = true;
            }
            LJIILJJIL("stopWithStreamData", false);
            this.LJIJ = null;
            this.LJIJI = null;
            this.LJIILIIL = null;
            LJIILL();
            LJIIL();
            this.LJIILLIIL = false;
            InterfaceC28641BLx interfaceC28641BLx2 = this.LJIJI;
            if (interfaceC28641BLx2 == null) {
                return;
            }
            interfaceC28641BLx2.LIZIZ();
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void LLZZZIL() {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            LJIIJ.LJIIIZ(false);
        }
    }

    @Override // X.InterfaceC86353Xun
    public final long LLZZZZ() {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            return LJIIJ.LJJJJLI();
        }
        return 0L;
    }

    @Override // X.InterfaceC86353Xun
    public final boolean b() {
        String str;
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            str = LJIIJ.getPlayerTag();
        } else {
            str = null;
        }
        return !TextUtils.equals(str, this.LIZLLL);
    }

    @Override // X.InterfaceC86353Xun
    public final void d() {
        J0Z j0z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append("+++++++++++++++++++++ready to pauseStreamData");
        B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ));
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null && TextUtils.equals(this.LJ, LJIIJ.LJJIJ())) {
            LJIIL();
            this.LJIJ = null;
            this.LJIJI = null;
            LJIILL();
            C28185B4j c28185B4j = this.LJIILIIL;
            if (c28185B4j != null) {
                c28185B4j.LIZ();
            }
            C28185B4j c28185B4j2 = this.LJIILIIL;
            if (c28185B4j2 != null && (j0z = c28185B4j2.LIZIZ) != null) {
                j0z.LJII = true;
            }
            LJIILJJIL("pauseWithStreamData", false);
            this.LJIILIIL = null;
            this.LJIILLIIL = false;
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void destroy() {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            LJIIL();
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                LJIIJ.LJI(this.LIZLLL);
            } else {
                LJIIJ.LJIIJJI(LJIIIZ());
            }
        }
        C28185B4j c28185B4j = this.LJIILIIL;
        if (c28185B4j != null) {
            c28185B4j.LIZ();
        }
        LJIILJJIL("destroy", false);
        this.LJIILIIL = null;
        this.LJIJ = null;
        InterfaceC28641BLx interfaceC28641BLx = this.LJIJI;
        if (interfaceC28641BLx != null) {
            interfaceC28641BLx.LIZIZ();
        }
        this.LJIJI = null;
        this.LJIILLIIL = false;
        this.LJIL = null;
    }

    @Override // X.InterfaceC86353Xun
    public final String getCurrentResolution() {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            return LJIIJ.getCurrentResolution();
        }
        return null;
    }

    @Override // X.InterfaceC86353Xun
    public final void h() {
        String multiStreamDefaultPreviewQualitySdkKey;
        LiveRoomStruct liveRoomStruct;
        String liveStudioExtraStreamDefaultPreviewQualitySdkKey;
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            String str = null;
            if (LJIILIIL(this.LJFF) && (liveRoomStruct = this.LJFF) != null && liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey() != null) {
                LiveRoomStruct liveRoomStruct2 = this.LJFF;
                if (liveRoomStruct2 != null && (liveStudioExtraStreamDefaultPreviewQualitySdkKey = liveRoomStruct2.getLiveStudioExtraStreamDefaultPreviewQualitySdkKey()) != null) {
                    Locale US = Locale.US;
                    o.LJIIIIZZ(US, "US");
                    String lowerCase = liveStudioExtraStreamDefaultPreviewQualitySdkKey.toLowerCase(US);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!TextUtils.equals("auto", lowerCase)) {
                        LiveRoomStruct liveRoomStruct3 = this.LJFF;
                        if (liveRoomStruct3 != null) {
                            str = liveRoomStruct3.getLiveStudioExtraStreamDefaultQualitySdkKey();
                        }
                        LJIIJ.LJJIJIL(str);
                        return;
                    }
                    return;
                }
                return;
            }
            LiveRoomStruct liveRoomStruct4 = this.LJFF;
            if (liveRoomStruct4 == null || (multiStreamDefaultPreviewQualitySdkKey = liveRoomStruct4.getMultiStreamDefaultPreviewQualitySdkKey()) == null) {
                return;
            }
            Locale US2 = Locale.US;
            o.LJIIIIZZ(US2, "US");
            String lowerCase2 = multiStreamDefaultPreviewQualitySdkKey.toLowerCase(US2);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (TextUtils.equals("auto", lowerCase2)) {
                return;
            }
            LiveRoomStruct liveRoomStruct5 = this.LJFF;
            if (liveRoomStruct5 != null) {
                str = liveRoomStruct5.getMultiStreamDefaultQualitySdkKey();
            }
            LJIIJ.LJJIJIL(str);
        }
    }

    @Override // X.InterfaceC86353Xun
    public final String getPlayerTag() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC86353Xun
    public final C28185B4j l() {
        return this.LJIILIIL;
    }

    public static boolean LJIILIIL(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct == null || liveRoomStruct.multiStreamScene != 1 || !LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC86353Xun
    public final void LIZLLL(boolean z) {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            LJIIJ.LIZLLL(z);
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void LJ(ArrayList<String> arrayList) {
        Integer num;
        InterfaceC28738BPq LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LivePlayHelper#preloadResource#streamData.streamData.size=");
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        B4I.LIZ("MPD", X1D.LIZIZ(LIZ));
        if (arrayList != null && !arrayList.isEmpty() && (LJIIJ = LJIIJ()) != null) {
            LJIIJ.LIZ();
            LJIIJ.LJJ(true);
            LJIIJ.LJ(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x007f, code lost:
    
        if (r12 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C28272B7s r12) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32186CkA.LJIIJJI(X.B7s):void");
    }

    @Override // X.InterfaceC86353Xun
    public final void LLZLL(String str) {
        C28185B4j c28185B4j = this.LJIILIIL;
        if (c28185B4j != null) {
            c28185B4j.LIZ();
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void LLZLLLL(LiveRoomStruct liveRoomStruct) {
        this.LJFF = liveRoomStruct;
    }

    @Override // X.InterfaceC86353Xun
    public final void LLZZ(AqS171S0100000_5 aqS171S0100000_5) {
        this.LJIL = aqS171S0100000_5;
    }

    @Override // X.InterfaceC86353Xun
    public final void LLZZJLIL(int i) {
        View view;
        this.LJIIL = i;
        C28185B4j c28185B4j = this.LJIILIIL;
        if (c28185B4j != null && (view = c28185B4j.LIZ) != null) {
            C29306Beo.LJJLIIIJILLIZJL(i, view);
        }
        InterfaceC32187CkB interfaceC32187CkB = this.LJIJJ;
        if (interfaceC32187CkB != null) {
            interfaceC32187CkB.LJIIIZ(i);
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void a(C32192CkG c32192CkG) {
        this.LJIILJJIL = c32192CkG;
    }

    @Override // X.InterfaceC86353Xun
    public final void c(LivePreviewPlayerWidget livePreviewPlayerWidget) {
        this.LJIILL = livePreviewPlayerWidget;
    }

    @Override // X.InterfaceC86353Xun
    public final void changeSRSupportScene(boolean z) {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            LJIIJ.changeSRSupportScene(z);
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void f(LiveRoomStruct liveRoomStruct) {
        String multiStreamDefaultQualitySdkKey;
        String str;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.PullData pullData2;
        if (!this.LJIILLIIL) {
            this.LJFF = liveRoomStruct;
            String multiStreamData = liveRoomStruct.getMultiStreamData();
            EnablePreviewCardUsePreviewSetting enablePreviewCardUsePreviewSetting = EnablePreviewCardUsePreviewSetting.INSTANCE;
            if (enablePreviewCardUsePreviewSetting.getValue() == 1) {
                multiStreamDefaultQualitySdkKey = liveRoomStruct.getMultiStreamDefaultPreviewQualitySdkKey();
            } else {
                multiStreamDefaultQualitySdkKey = liveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            }
            if (LJIILIIL(liveRoomStruct)) {
                StreamUrlStruct streamUrlStruct = liveRoomStruct.multiStreamUrl;
                if (streamUrlStruct != null && (liveCoreSDKData2 = streamUrlStruct.liveCoreSDKData) != null && (pullData2 = liveCoreSDKData2.getPullData()) != null) {
                    str = pullData2.getStreamData();
                } else {
                    str = null;
                }
                if (str != null) {
                    StreamUrlStruct streamUrlStruct2 = liveRoomStruct.multiStreamUrl;
                    if (streamUrlStruct2 != null && (liveCoreSDKData = streamUrlStruct2.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
                        multiStreamData = pullData.getStreamData();
                    } else {
                        multiStreamData = null;
                    }
                    if (enablePreviewCardUsePreviewSetting.getValue() == 1) {
                        LiveRoomStruct liveRoomStruct2 = this.LJFF;
                        if (liveRoomStruct2 != null) {
                            multiStreamDefaultQualitySdkKey = liveRoomStruct2.getLiveStudioExtraStreamDefaultPreviewQualitySdkKey();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("multiStreamUrl in prepare, multiStreamData=");
                            LIZ.append(multiStreamData);
                            B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ));
                        }
                        multiStreamDefaultQualitySdkKey = null;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("multiStreamUrl in prepare, multiStreamData=");
                        LIZ2.append(multiStreamData);
                        B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ2));
                    } else {
                        LiveRoomStruct liveRoomStruct3 = this.LJFF;
                        if (liveRoomStruct3 != null) {
                            multiStreamDefaultQualitySdkKey = liveRoomStruct3.getLiveStudioExtraStreamDefaultQualitySdkKey();
                            StringBuilder LIZ22 = X1D.LIZ();
                            LIZ22.append("multiStreamUrl in prepare, multiStreamData=");
                            LIZ22.append(multiStreamData);
                            B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ22));
                        }
                        multiStreamDefaultQualitySdkKey = null;
                        StringBuilder LIZ222 = X1D.LIZ();
                        LIZ222.append("multiStreamUrl in prepare, multiStreamData=");
                        LIZ222.append(multiStreamData);
                        B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ222));
                    }
                } else {
                    B4I.LIZ("LivePlayHelper_Preview", "multiStreamUrl invalid for innerPlay");
                }
            }
            InterfaceC28738BPq LJIIJ = LJIIJ();
            if (LJIIJ != null) {
                LJIIJ.LJIL(multiStreamData, multiStreamDefaultQualitySdkKey);
            }
            InterfaceC28738BPq LJIIJ2 = LJIIJ();
            if (LJIIJ2 != null) {
                LJIIJ2.LJJJJ(this.LIZLLL, "preview start", false);
            }
            this.LJIILLIIL = true;
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void j(C51093K3l c51093K3l) {
        this.LJIJ = c51093K3l;
    }

    @Override // X.InterfaceC86353Xun
    public final void k(C28642BLy playerLogCache) {
        o.LJIIIZ(playerLogCache, "playerLogCache");
        this.LJIJI = playerLogCache;
    }

    @Override // X.InterfaceC86353Xun
    public final void setMute(boolean z) {
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                LJIIJ.LJJJJ(this.LIZLLL, "preview", z);
            } else {
                if (LJIIJ() == null || LJIIIZ() == null) {
                    return;
                }
                LJIIJ.LJJJJZ(LJIIIZ(), "preview", z);
            }
        }
    }

    public C32186CkA(InterfaceC32188CkC interfaceC32188CkC, EnumC72797Shd pageType) {
        o.LJIIIZ(pageType, "pageType");
        this.LIZ = interfaceC32188CkC;
        this.LIZIZ = pageType;
        this.LJIIIIZZ = -1;
    }

    @Override // X.BQ5
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        InterfaceC32188CkC interfaceC32188CkC;
        InterfaceC32188CkC interfaceC32188CkC2;
        InterfaceC32188CkC interfaceC32188CkC3;
        int i;
        View view;
        int i2;
        long j;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        int i3;
        View view3;
        LiveRoomStruct liveRoomStruct;
        C28185B4j c28185B4j;
        View view4;
        String str;
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" + onPlayerMessage ...");
        LIZ.append(message.name());
        LIZ.append("...");
        B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ));
        int i4 = 0;
        switch (VC2.LIZIZ[message.ordinal()]) {
            case 1:
                InterfaceC32188CkC interfaceC32188CkC4 = this.LIZ;
                if (interfaceC32188CkC4 != null) {
                    if ((obj instanceof String) && (str = (String) obj) != null) {
                        i = CastIntegerProtector.parseInt(str);
                    } else {
                        i = 0;
                    }
                    int i5 = 65535 & i;
                    int i6 = i >> 16;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("width = ");
                    LIZ2.append(i5);
                    LIZ2.append("; height = ");
                    LIZ2.append(i6);
                    B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ2));
                    if (i5 != this.LJIIJ || i6 != this.LJIIJJI) {
                        this.LJIIJ = i5;
                        this.LJIIJJI = i6;
                        C28185B4j c28185B4j2 = this.LJIILIIL;
                        if (c28185B4j2 != null && (view = c28185B4j2.LIZ) != null) {
                            interfaceC32188CkC4.LJIIJ(i5, i6, view);
                        }
                    } else if (TtliveGamePreviewStreamScaleOptimizeSetting.INSTANCE.enable() && (((liveRoomStruct = this.LJFF) == null || this.LJIIIZ != liveRoomStruct.ownerUserId) && ((this.LJIIIIZZ != 0 || liveRoomStruct == null || liveRoomStruct.liveRoomMode != 0) && (c28185B4j = this.LJIILIIL) != null && (view4 = c28185B4j.LIZ) != null))) {
                        interfaceC32188CkC4.LJIIJ(this.LJIIJ, this.LJIIJJI, view4);
                    }
                    LiveRoomStruct liveRoomStruct2 = this.LJFF;
                    if (liveRoomStruct2 != null) {
                        i2 = liveRoomStruct2.liveRoomMode;
                    } else {
                        i2 = -1;
                    }
                    this.LJIIIIZZ = i2;
                    if (liveRoomStruct2 != null) {
                        j = liveRoomStruct2.ownerUserId;
                    } else {
                        j = 0;
                    }
                    this.LJIIIZ = j;
                    C28185B4j c28185B4j3 = this.LJIILIIL;
                    if (c28185B4j3 != null) {
                        if (LivesdkLandscapeFeedPreviewSwitchSetting.INSTANCE.isEnable() && this.LJIIJ > this.LJIIJJI && interfaceC32188CkC4.LIZLLL()) {
                            C28185B4j c28185B4j4 = this.LJIILIIL;
                            if (c28185B4j4 != null && (view2 = c28185B4j4.LIZ) != null) {
                                if (c28185B4j4 != null && (view3 = c28185B4j4.LIZ) != null) {
                                    layoutParams = view3.getLayoutParams();
                                } else {
                                    layoutParams = null;
                                }
                                if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                                    layoutParams2.gravity = 49;
                                    if (layoutParams2.topMargin == 0 && (i3 = this.LJIIL) != 0) {
                                        layoutParams2.topMargin = i3;
                                    }
                                } else {
                                    layoutParams2 = null;
                                }
                                view2.setLayoutParams(layoutParams2);
                            }
                            C28185B4j.LIZLLL(c28185B4j3, 0);
                        } else {
                            C28185B4j.LIZLLL(c28185B4j3, 2);
                        }
                        int i7 = this.LJIIJ;
                        int i8 = this.LJIIJJI;
                        KeyEvent.Callback callback = c28185B4j3.LIZ;
                        if ((callback instanceof B4L) && callback != null) {
                            ((B4L) callback).setVideoSize(i7, i8);
                            break;
                        }
                    }
                }
                break;
            case 2:
                InterfaceC32188CkC interfaceC32188CkC5 = this.LIZ;
                if (interfaceC32188CkC5 != null) {
                    interfaceC32188CkC5.LLLZL();
                }
                InterfaceC32188CkC interfaceC32188CkC6 = this.LIZ;
                if (interfaceC32188CkC6 != null) {
                    interfaceC32188CkC6.LJIIIZ();
                    break;
                }
                break;
            case 3:
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                if (obj instanceof String) {
                    LJIIJJI(new C28272B7s(null, (String) obj));
                } else if (obj instanceof C28272B7s) {
                    LJIIJJI((C28272B7s) obj);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("message hashcode=");
                if (obj != null) {
                    i4 = obj.hashCode();
                }
                LIZ3.append(i4);
                LIZ3.append(", consume sei duration=");
                LIZ3.append(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis);
                Logger.i("ttlive_enter_room_log_sei_info", X1D.LIZIZ(LIZ3));
                break;
            case 4:
                if (obj != null && (interfaceC32188CkC3 = this.LIZ) != null) {
                    interfaceC32188CkC3.LJI(obj.toString());
                    break;
                }
                break;
            case 5:
                if (obj != null && (interfaceC32188CkC2 = this.LIZ) != null) {
                    interfaceC32188CkC2.LJIIIIZZ(obj.toString());
                    break;
                }
                break;
            case 6:
                if (obj != null && (interfaceC32188CkC = this.LIZ) != null) {
                    interfaceC32188CkC.LJIIL(obj.toString());
                    break;
                }
                break;
        }
        InterfaceC32188CkC interfaceC32188CkC7 = this.LIZ;
        if (interfaceC32188CkC7 != null) {
            interfaceC32188CkC7.LIZJ(message, obj);
        }
    }

    public final void LJII(Context context, String str) {
        int i;
        int i2;
        int i3;
        B4L LIZIZ;
        B4L LIZIZ2;
        boolean z;
        View cvr;
        int i4 = 1;
        if (this.LJIILIIL == null && context != null) {
            LiveRoomStruct liveRoomStruct = this.LJFF;
            if (liveRoomStruct != null && liveRoomStruct.liveTypeAudio) {
                z = true;
            } else {
                z = false;
            }
            if (C86373Xv7.LIZ(str)) {
                cvr = new CVS(context);
            } else if (!z) {
                cvr = new C48699J9j(new MutableContextWrapper(context));
            } else {
                cvr = new CVR(context);
            }
            this.LJIILIIL = new C28185B4j(cvr);
        }
        C28185B4j c28185B4j = this.LJIILIIL;
        if (c28185B4j != null && (LIZIZ2 = c28185B4j.LIZIZ()) != null) {
            i = LIZIZ2.getStreamWidth();
        } else {
            i = 0;
        }
        C28185B4j c28185B4j2 = this.LJIILIIL;
        if (c28185B4j2 != null && (LIZIZ = c28185B4j2.LIZIZ()) != null) {
            i2 = LIZIZ.getStreamHeight();
        } else {
            i2 = 0;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        LivesdkLandscapeFeedPreviewSwitchSetting livesdkLandscapeFeedPreviewSwitchSetting = LivesdkLandscapeFeedPreviewSwitchSetting.INSTANCE;
        if (!livesdkLandscapeFeedPreviewSwitchSetting.isEnable() || i <= i2) {
            i4 = 17;
        }
        layoutParams.gravity = i4;
        if (livesdkLandscapeFeedPreviewSwitchSetting.isEnable() && i > i2) {
            i3 = this.LJIIL;
        } else {
            i3 = 0;
        }
        layoutParams.topMargin = i3;
        C28185B4j c28185B4j3 = this.LJIILIIL;
        if (c28185B4j3 != null) {
            C28185B4j.LIZJ(c28185B4j3, layoutParams);
        }
        C28185B4j c28185B4j4 = this.LJIILIIL;
        if (c28185B4j4 != null && c28185B4j4.LIZ.getContext() != null) {
            KL2.LJIILLIIL(0, c28185B4j4.LIZ);
        }
        if (livesdkLandscapeFeedPreviewSwitchSetting.isEnable() && i > i2) {
            C28185B4j c28185B4j5 = this.LJIILIIL;
            if (c28185B4j5 != null) {
                C28185B4j.LIZLLL(c28185B4j5, 0);
                return;
            }
            return;
        }
        C28185B4j c28185B4j6 = this.LJIILIIL;
        if (c28185B4j6 == null) {
            return;
        }
        C28185B4j.LIZLLL(c28185B4j6, 2);
    }

    public final void LJIIIIZZ(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dropUpLayoutContainerLinkMic, source=");
        LIZ.append(str);
        B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ));
        if (LiveCoHostFeedRemoveOptSetting.INSTANCE.isEnable()) {
            InterfaceC32187CkB interfaceC32187CkB = this.LJIJJ;
            if (interfaceC32187CkB != null) {
                interfaceC32187CkB.LIZ();
            }
            this.LJIJJ = null;
        } else if (z) {
            InterfaceC32187CkB interfaceC32187CkB2 = this.LJIJJ;
            if (interfaceC32187CkB2 != null) {
                interfaceC32187CkB2.LIZ();
            }
            this.LJIJJ = null;
        }
        InterfaceC32190CkE interfaceC32190CkE = this.LJIJJLI;
        if (interfaceC32190CkE != null) {
            interfaceC32190CkE.LIZ();
        }
    }

    public final void LJIILJJIL(String str, boolean z) {
        View view;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeSelf, source=");
        LIZ.append(str);
        LIZ.append(", forceRemoveLinkMicView=");
        LIZ.append(z);
        B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ));
        LJIIIIZZ(str, z);
        C28185B4j c28185B4j = this.LJIILIIL;
        if (c28185B4j != null && (view = c28185B4j.LIZ) != null) {
            view.setVisibility(8);
            if (view.getParent() instanceof ViewGroup) {
                ViewParent parent = view.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LJLLL(view, (ViewGroup) parent);
            }
        }
    }

    @Override // X.InterfaceC86353Xun
    public final void switchResolution(String resolutionKey, VCA vca) {
        o.LJIIIZ(resolutionKey, "resolutionKey");
        InterfaceC28738BPq LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            LJIIJ.switchResolution(resolutionKey, vca);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:143|(2:147|(21:151|152|(2:158|(12:162|163|(3:165|(3:167|(1:(1:170)(1:173))(1:174)|171)(1:175)|172)|176|(1:178)|179|180|(2:182|(4:187|(1:200)(1:191)|192|(1:198)))|201|(3:203|(1:(1:206)(1:208))(1:209)|207)|210|211))|219|(1:234)(1:223)|224|(1:233)(1:228)|229|(1:231)|232|163|(0)|176|(0)|179|180|(0)|201|(0)|210|211))|235|152|(4:154|156|158|(13:160|162|163|(0)|176|(0)|179|180|(0)|201|(0)|210|211))|219|(1:221)|234|224|(1:226)|233|229|(0)|232|163|(0)|176|(0)|179|180|(0)|201|(0)|210|211) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03a1, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03af, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0366 A[Catch: all -> 0x03a1, TryCatch #0 {all -> 0x03a1, blocks: (B:180:0x035e, B:182:0x0366, B:185:0x036f, B:187:0x0377, B:189:0x037f, B:191:0x0385, B:192:0x0387, B:194:0x038d, B:196:0x0395, B:198:0x039b), top: B:179:0x035e }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017a A[Catch: Exception -> 0x0222, TryCatch #2 {Exception -> 0x0222, blocks: (B:51:0x00ce, B:53:0x00dd, B:56:0x00e3, B:58:0x00e9, B:59:0x00f4, B:61:0x00f8, B:63:0x0108, B:64:0x010c, B:66:0x0110, B:67:0x0114, B:69:0x0118, B:70:0x011c, B:72:0x0124, B:74:0x0128, B:76:0x012c, B:78:0x0130, B:80:0x0136, B:83:0x0150, B:85:0x0154, B:87:0x0158, B:89:0x015c, B:91:0x0162, B:92:0x0166, B:94:0x016e, B:96:0x0172, B:97:0x0176, B:99:0x017a, B:100:0x017e, B:103:0x01bf, B:105:0x01c3, B:107:0x014a, B:108:0x0191, B:110:0x0197, B:112:0x019b, B:114:0x01a1, B:116:0x01b2, B:118:0x01b6, B:119:0x01b8, B:122:0x01d2, B:124:0x01d8, B:126:0x01e3, B:127:0x01e5, B:129:0x01ed, B:130:0x01ef, B:132:0x01f7, B:133:0x01f9, B:134:0x0200, B:239:0x013f), top: B:50:0x00ce }] */
    @Override // X.InterfaceC86353Xun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r22, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r23, android.widget.FrameLayout r24, boolean r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32186CkA.i(boolean, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, android.widget.FrameLayout, boolean, java.lang.String):void");
    }
}

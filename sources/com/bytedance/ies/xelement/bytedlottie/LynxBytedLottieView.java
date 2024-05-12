package com.bytedance.ies.xelement.bytedlottie;

import X.AbstractC48384Iyq;
import X.C04650Gf;
import X.C04740Go;
import X.C04750Gp;
import X.C0GU;
import X.C0GW;
import X.C0GY;
import X.C0MT;
import X.C0NY;
import X.C16880lQ;
import X.C1E5;
import X.C263911v;
import X.C29701Eo;
import X.C37692Eqm;
import X.C40675Fxn;
import X.C61259O2l;
import X.C72972SkS;
import X.C77919Ui3;
import X.C77920Ui4;
import X.C78750UvS;
import X.C78751UvT;
import X.C79411VEp;
import X.C79561VKj;
import X.C79802VTq;
import X.C79803VTr;
import X.C79808VTw;
import X.C79810VTy;
import X.C79873VWj;
import X.C81392Vwy;
import X.CallableC79805VTt;
import X.EWS;
import X.InterfaceC29711Ep;
import X.InterfaceC78752UvU;
import X.J0G;
import X.O39;
import X.O3B;
import X.V9E;
import X.VA1;
import X.VNA;
import X.VNL;
import X.VNR;
import X.VNU;
import X.VPD;
import X.W4W;
import X.W5A;
import X.W5I;
import X.W5P;
import X.W92;
import X.X1D;
import Y.ACallableS39S1100000_14;
import Y.ARunnableS13S1200000_14;
import Y.AUListenerS101S0100000_14;
import Y.IDAListenerS81S0100000_14;
import Y.IDComparatorS38S0000000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.JsonReader;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxUI;
import defpackage.i0;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes15.dex */
public final class LynxBytedLottieView extends LynxUI<C29701Eo> implements InterfaceC29711Ep {
    public static final /* synthetic */ int LLIIII = 0;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public Set<String> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public O39 LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public ReadableMap LJLLLLLL;
    public J0G<C61259O2l> LJLZ;
    public final List<Integer> LJZ;
    public final HashSet<Integer> LJZI;
    public final C77920Ui4 LJZL;
    public C0GY LL;
    public final C79810VTy LLD;
    public String LLF;
    public final ArrayList<C81392Vwy<?>> LLFF;
    public int LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public volatile boolean LLIFFJFJJ;
    public C79808VTw LLII;

    public LynxBytedLottieView() {
        throw null;
    }

    public final void LJIJJLI() {
        if (this.LJLJLLL != null) {
            this.LJLJLLL = null;
            this.LJLLL = true;
            ((C29701Eo) this.mView).setImageDrawable(null);
            C29701Eo c29701Eo = (C29701Eo) this.mView;
            if (c29701Eo != null) {
                c29701Eo.setImageAssetDelegate(null);
                c29701Eo.cancelAnimation();
            }
        }
    }

    public final void LJJIII() {
        C29701Eo c29701Eo = (C29701Eo) this.mView;
        if (c29701Eo != null) {
            this.LJZI.clear();
            c29701Eo.playAnimation();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ((C29701Eo) this.mView).removeAllAnimatorListeners();
        ((C29701Eo) this.mView).removeAllUpdateListeners();
        ((C29701Eo) this.mView).removeAllLottieOnCompositionLoadedListener();
        ((C29701Eo) this.mView).cancelAnimation();
        synchronized (this) {
            Iterator<C81392Vwy<?>> it = this.LLFF.iterator();
            while (it.hasNext()) {
                C81392Vwy.LJ(it.next());
            }
            this.LLFF.clear();
            Object obj = this.mView;
            if (!(obj instanceof C77919Ui3)) {
                obj = null;
            }
            C77919Ui3 c77919Ui3 = (C77919Ui3) obj;
            if (c77919Ui3 != null) {
                c77919Ui3.setDestroyed(true);
            }
            this.LLIFFJFJJ = true;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LJLILLLLZI && !this.LJLJI && !this.LJLJLJ && this.LJLLL) {
            LJJIII();
        }
        this.LJLJLJ = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxBytedLottieView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLIL = true;
        this.LJLILLLLZI = true;
        this.LJLJJLL = -1;
        this.LJLLJ = true;
        this.LJLLL = true;
        this.LJLLLL = "";
        this.LJZ = new ArrayList();
        this.LJZI = new HashSet<>();
        this.LJZL = new C77920Ui4("");
        this.LLD = new C79810VTy();
        this.LLF = "";
        this.LLFF = new ArrayList<>();
        this.LLFII = Integer.MAX_VALUE;
    }

    public static boolean LJJIFFI(String str) {
        if (!ujb.o.LJJJLIIL(str, "http://", false) && !ujb.o.LJJJLIIL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    @Override // X.C0GP
    public final Bitmap LJIILLIIL(C04750Gp c04750Gp) {
        LLog.LIZLLL(4, "byted-lottie", "fetch bitmap should not be called!!!");
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:3:0x0003, B:5:0x0021, B:10:0x0031, B:13:0x003e, B:16:0x00d3, B:18:0x00d9, B:20:0x00e1, B:21:0x00ea, B:23:0x00f0, B:24:0x00f3, B:28:0x0048, B:30:0x0050, B:33:0x006b, B:36:0x007c, B:38:0x0082, B:40:0x0088, B:41:0x008b, B:43:0x0095, B:46:0x0123, B:47:0x0127, B:52:0x0074, B:55:0x00cb), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:3:0x0003, B:5:0x0021, B:10:0x0031, B:13:0x003e, B:16:0x00d3, B:18:0x00d9, B:20:0x00e1, B:21:0x00ea, B:23:0x00f0, B:24:0x00f3, B:28:0x0048, B:30:0x0050, B:33:0x006b, B:36:0x007c, B:38:0x0082, B:40:0x0088, B:41:0x008b, B:43:0x0095, B:46:0x0123, B:47:0x0127, B:52:0x0074, B:55:0x00cb), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.LJJII(java.lang.String):void");
    }

    public final String LJJIIJ(String str) {
        String result;
        O39 o39 = this.LJLLI;
        if (o39 != null) {
            int i = O3B.LIZ[o39.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (LJJIFFI(str)) {
                            return str;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        return C0MT.LIZ(LIZ, this.LJLJLLL, '/', str, LIZ);
                    }
                } else {
                    if (LJJIFFI(str)) {
                        result = VA1.LIZ(this.mContext, str, false);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        result = C0MT.LIZ(LIZ2, this.LJLJLLL, '/', str, LIZ2);
                    }
                    o.LJFF(result, "result");
                    if (LJJIFFI(result)) {
                        return result;
                    }
                    if (!ujb.o.LJJJLIIL(result, "file:", false)) {
                        result = i0.LJFF("file:", result);
                    }
                    o.LJFF(result, "result");
                    return result;
                }
            } else {
                if (LJJIFFI(str)) {
                    return str;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                return C0MT.LIZ(LIZ3, this.LJLJLLL, '/', str, LIZ3);
            }
        }
        return str;
    }

    public final void LJJIJ(String str) {
        int LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(str, '/', 0, 6);
        if (LJJLIIIJLLLLLLLZ > 0) {
            String substring = str.substring(0, LJJLIIIJLLLLLLLZ);
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            this.LJLJLLL = substring;
            ((C29701Eo) this.mView).setImageAssetDelegate(this);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri is error:");
        LIZ.append(str);
        LLog.LIZLLL(4, "byted-lottie", X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final C29701Eo createView(Context context) {
        boolean z;
        C77919Ui3 c77919Ui3 = new C77919Ui3(context);
        if (Build.VERSION.SDK_INT == 24 && ujb.o.LJJJJIZL("huawei", Build.MANUFACTURER, true)) {
            z = true;
        } else {
            z = false;
        }
        c77919Ui3.useHardwareAcceleration(!z);
        c77919Ui3.enableMergePathsForKitKatAndAbove(true);
        c77919Ui3.disableRecycleBitmap();
        c77919Ui3.addAnimatorListener(new IDAListenerS81S0100000_14(this, 6));
        c77919Ui3.addLottieOnCompositionLoadedListener(new C79802VTq(this, c77919Ui3));
        c77919Ui3.addAnimatorUpdateListener(new AUListenerS101S0100000_14(this, 23));
        return c77919Ui3;
    }

    @VPD(defaultBoolean = true, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LJLILLLLZI = z;
        T t = this.mView;
        if (t != 0) {
            ((C77919Ui3) t).setMAutoPlay(z);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieAnimationView");
    }

    @VPD(name = "bid")
    public final void setBID(String businessID) {
        o.LJIIJ(businessID, "businessID");
        this.LLF = businessID;
    }

    @VPD(defaultInt = -1, name = "end-frame")
    public final void setEndFrame(int i) {
        if (i < 0) {
            LLog.LIZLLL(2, "byted-lottie", "use negative end-frame, switch to MaxValue by default!!");
            this.LLFII = Integer.MAX_VALUE;
            ((C29701Eo) this.mView).setMaxFrame(Integer.MAX_VALUE);
        } else {
            this.LLFII = i;
            ((C29701Eo) this.mView).setMaxFrame(i);
        }
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
        this.LJLJJI = set;
    }

    @VPD(defaultBoolean = false, name = "filter-image")
    public final void setFilterImage(boolean z) {
        this.LLI = z;
    }

    @VPD(defaultBoolean = false, name = "ignore-attach-status")
    public final void setIgnoreAttachStatus(boolean z) {
        Object obj = this.mView;
        if (!(obj instanceof C77919Ui3)) {
            obj = null;
        }
        C77919Ui3 c77919Ui3 = (C77919Ui3) obj;
        if (c77919Ui3 != null) {
            c77919Ui3.setIgnoreAttachStatus(z);
        }
    }

    @VPD(name = "json")
    public final void setJson(final String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.LJLL = str;
        ((C29701Eo) this.mView).setImageAssetDelegate(this);
        final C79808VTw c79808VTw = new C79808VTw(this, str);
        this.LLII = c79808VTw;
        C0GY LIZ = C263911v.LIZIZ.LIZ(null);
        if (C04650Gf.LIZIZ(LIZ)) {
            c79808VTw.LIZIZ(LIZ);
        } else {
            C0GU.LJI.execute(new C0GW(c79808VTw, this) { // from class: X.1Ey
                public final /* synthetic */ String LJLJJL = null;

                public final void LIZ() {
                    String str2 = str;
                    final String str3 = this.LJLJJL;
                    WeakReference<InterfaceC29711Ep> weakReference = this.LJLIL;
                    WeakReference<C0GL> weakReference2 = this.LJLILLLLZI;
                    if (weakReference.get() == null || weakReference2.get() == null) {
                        return;
                    }
                    final C0GL c0gl = weakReference2.get();
                    try {
                        C04650Gf.LJIIL(C04370Fd.LIZ(new JsonReader(new StringReader(str2))), weakReference.get(), new C0GL() { // from class: X.1Ez
                            @Override // X.C0GL
                            public final void LIZ(String str4) {
                                c0gl.LIZ(str4);
                            }

                            @Override // X.C0GL
                            public final void LIZIZ(C0GY c0gy) {
                                C263911v.LIZIZ.LIZIZ(c0gy, str3);
                                c0gl.LIZIZ(c0gy);
                            }
                        });
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    @VPD(defaultBoolean = true, name = "keeplastframe")
    public final void setKeepLastFrame(boolean z) {
        this.LJLIL = z;
    }

    @VPD(defaultBoolean = false, name = "loop")
    public final void setLoop(boolean z) {
        if (z) {
            T mView = this.mView;
            o.LJFF(mView, "mView");
            ((C29701Eo) mView).setRepeatCount(-1);
        } else {
            T mView2 = this.mView;
            o.LJFF(mView2, "mView");
            ((C29701Eo) mView2).setRepeatCount(0);
        }
    }

    @VPD(defaultInt = 1, name = "loop-count")
    public final void setLoopCount(int i) {
        if (i <= 0) {
            T mView = this.mView;
            o.LJFF(mView, "mView");
            ((C29701Eo) mView).setRepeatCount(-1);
        } else {
            T mView2 = this.mView;
            o.LJFF(mView2, "mView");
            ((C29701Eo) mView2).setRepeatCount(i - 1);
        }
    }

    @VPD(name = "objectfit")
    public final void setObjectFit(String objectFit) {
        ImageView.ScaleType scaleType;
        o.LJIIJ(objectFit, "objectFit");
        int hashCode = objectFit.hashCode();
        if (hashCode != 94852023) {
            if (hashCode == 951526612 && objectFit.equals("contain")) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            scaleType = ImageView.ScaleType.CENTER;
        } else {
            if (objectFit.equals("cover")) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            scaleType = ImageView.ScaleType.CENTER;
        }
        T mView = this.mView;
        o.LJFF(mView, "mView");
        ((ImageView) mView).setScaleType(scaleType);
    }

    @VPD(defaultBoolean = false, name = "only-local")
    public final void setOnlyLocal(boolean z) {
        this.LLFZ = z;
    }

    @VPD(name = "playstatus")
    public final void setPlayStatus(String status) {
        o.LJIIJ(status, "status");
        if (o.LJ("play", status)) {
            LJJIII();
            this.LJLJLJ = true;
            this.LJLJI = false;
        } else {
            if (!o.LJ("pause", status)) {
                return;
            }
            ((C29701Eo) this.mView).cancelAnimation();
            this.LJLJI = true;
        }
    }

    @VPD(name = "progress")
    public final void setProgress(float f) {
        if (f >= 0 || f <= 1) {
            T mView = this.mView;
            o.LJFF(mView, "mView");
            ((C29701Eo) mView).setProgress(f);
        }
    }

    @VPD(name = "auto-reverse")
    public final void setReverseMode(boolean z) {
        if (z) {
            T mView = this.mView;
            o.LJFF(mView, "mView");
            ((C29701Eo) mView).setRepeatMode(2);
        } else {
            T mView2 = this.mView;
            o.LJFF(mView2, "mView");
            ((C29701Eo) mView2).setRepeatMode(1);
        }
    }

    @VPD(name = "speed")
    public final void setSpeed(float f) {
        T mView = this.mView;
        o.LJFF(mView, "mView");
        ((C29701Eo) mView).setSpeed(f);
        boolean z = false;
        if (f >= 0) {
            z = true;
        }
        this.LJLIL = z;
    }

    @VPD(name = "src")
    public final void setSrc(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load lottie: ");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        TraceEvent.LIZIZ(LIZIZ);
        if (str == null || ujb.o.LJJJJJL(str)) {
            TraceEvent.LJ(LIZIZ);
            return;
        }
        LJIJJLI();
        ((C29701Eo) this.mView).setImageDrawable(null);
        synchronized (this) {
            Iterator<C81392Vwy<?>> it = this.LLFF.iterator();
            while (it.hasNext()) {
                C81392Vwy.LJ(it.next());
            }
            this.LLFF.clear();
        }
        ((C29701Eo) this.mView).setMinFrame(this.LLFFF);
        ((C29701Eo) this.mView).setMaxFrame(this.LLFII);
        new C79873VWj(new ACallableS39S1100000_14(this, str, 2));
        TraceEvent.LJ(LIZIZ);
    }

    @VPD(name = "src-format")
    public final void setSrcFormat(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        LJIJJLI();
        new C79873VWj(new ACallableS39S1100000_14(this, str, 2));
    }

    @VPD(name = "src-polyfill")
    public final void setSrcPolyfill(ReadableMap readableMap) {
        o.LJIIJ(readableMap, "readableMap");
        this.LJLLLLLL = readableMap;
        C0GY c0gy = this.LL;
        if (c0gy != null) {
            new C79873VWj(new CallableC79805VTt(this, readableMap, new C79803VTr(this), c0gy));
        }
    }

    @VPD(defaultInt = 0, name = "start-frame")
    public final void setStartFrame(int i) {
        this.LLFFF = i;
        ((C29701Eo) this.mView).setMinFrame(i);
    }

    public static Map LJJ(int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
    @Override // X.InterfaceC29711Ep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C04750Gp r9, X.C29751Et r10) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.LJI(X.0Gp, X.1Et):void");
    }

    public final void LJJIIZI(String str, Map<String, Object> map) {
        VNL vnl;
        Set<String> set = this.LJLJJI;
        if (set == null || !set.contains(str)) {
            return;
        }
        if (C79411VEp.LIZ()) {
            VNU vnu = this.mContext;
            if (vnu != null && (vnl = vnu.LJLJJL) != null) {
                vnl.LIZIZ(new VNR(map, getSign(), str));
                return;
            }
            return;
        }
        C79411VEp.LIZJ(new ARunnableS13S1200000_14(map, this, str, 3));
    }

    @EWS
    public final void getCurrentFrame(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(this.LJLJJL));
        }
    }

    @EWS
    public final void getDuration(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            javaOnlyMap.putInt("data", (int) ((C29701Eo) t).getDuration());
            callback.invoke(0, javaOnlyMap);
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @EWS
    public final void isAnimating(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T mView = this.mView;
        if (mView != 0) {
            o.LJFF(mView, "mView");
            javaOnlyMap.putBoolean("data", ((C29701Eo) mView).isAnimating());
            callback.invoke(0, javaOnlyMap);
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @EWS
    public final void listenAnimationUpdate(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0) {
            javaOnlyMap.putBoolean("data", true);
            this.LJLLJ = params.getBoolean("isListen");
            callback.invoke(0, javaOnlyMap);
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @EWS
    public final void pause(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            try {
                ((C29701Eo) t).pauseAnimation();
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
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        String uuid = UUID.randomUUID().toString();
        o.LJFF(uuid, "UUID.randomUUID().toString()");
        this.LJLLLL = uuid;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0) {
            try {
                LJJIII();
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
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        String uuid = UUID.randomUUID().toString();
        o.LJFF(uuid, "UUID.randomUUID().toString()");
        this.LJLLLL = uuid;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            try {
                ((C29701Eo) t).resumeAnimation();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
        if (this.mView == 0) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @EWS
    public final void seek(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            C29701Eo c29701Eo = (C29701Eo) t;
            if (c29701Eo != null) {
                c29701Eo.cancelAnimation();
                Drawable drawable = c29701Eo.getDrawable();
                if (!(drawable instanceof C04740Go)) {
                    drawable = null;
                }
                C04740Go c04740Go = (C04740Go) drawable;
                if (c04740Go != null) {
                    c04740Go.stop();
                }
            }
            int i = params.getInt("frame");
            T mView = this.mView;
            o.LJFF(mView, "mView");
            ((C29701Eo) mView).setFrame(i);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @EWS
    public final void stop(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0) {
            try {
                C29701Eo c29701Eo = (C29701Eo) this.mView;
                if (c29701Eo != null) {
                    c29701Eo.cancelAnimation();
                    Drawable drawable = c29701Eo.getDrawable();
                    if (!(drawable instanceof C04740Go)) {
                        drawable = null;
                    }
                    C04740Go c04740Go = (C04740Go) drawable;
                    if (c04740Go != null) {
                        c04740Go.stop();
                    }
                }
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
        int i = params.getInt("frame");
        if (!((ArrayList) this.LJZ).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LJZ).add(Integer.valueOf(i));
            ArrayList arrayList = (ArrayList) this.LJZ;
            if (arrayList.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS38S0000000_10(2));
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
        callback.invoke(1, C0NY.LIZIZ("already subscribeUpdateEvent with ", i, " frame"));
    }

    @EWS
    public final void unsubscribeUpdateEvent(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        int i = params.getInt("frame");
        if (((ArrayList) this.LJZ).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LJZ).remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(1, C72972SkS.LIZLLL(i, " frame is not subscribed"));
    }

    public final void LJJI(int i, String str, String str2) {
        LJJIIZI("error", LJJ(i, str));
        this.LJZL.LIZIZ(this.LJLL, str2, str);
        LLog.LIZLLL(4, "byted-lottie", str);
    }

    public static Map LJIL(int i, int i2, int i3, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("current", Integer.valueOf(i));
        linkedHashMap.put("total", Integer.valueOf(i2));
        linkedHashMap.put("loopIndex", Integer.valueOf(i3));
        linkedHashMap.put("animationID", str);
        return linkedHashMap;
    }

    public final void LJJIIJZLJL(String url, String id, C04750Gp c04750Gp, InterfaceC78752UvU interfaceC78752UvU) {
        o.LJIIJ(url, "url");
        o.LJIIJ(id, "id");
        String LIZ = VA1.LIZ(this.mContext, url, false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("requestBitmap: ");
        LIZ2.append(LIZ);
        LLog.LIZLLL(2, "byted-lottie", X1D.LIZIZ(LIZ2));
        Uri parse = UriProtector.parse(LIZ);
        if (parse == null || parse.getPath() == null) {
            this.LJLLL = false;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("uri.path is null and uri is ");
            LIZ3.append(parse);
            interfaceC78752UvU.onFailed(X1D.LIZIZ(LIZ3));
            return;
        }
        W5P LIZLLL = W5P.LIZLLL(parse);
        LIZLLL.LJIIIZ = W92.HIGH;
        V9E.LIZIZ(LIZLLL, Bitmap.Config.ARGB_8888);
        String path = parse.getPath();
        if (path != null && !c04750Gp.LJFF) {
            LIZLLL.LJIIJ = new C78750UvS(path, this);
        }
        W4W<C81392Vwy<W5A>> LJ = W5I.LIZ().LJ(LIZLLL.LIZ(), "byted-lottie");
        ((AbstractC48384Iyq) LJ).LJ(new C78751UvT(this, LIZ, interfaceC78752UvU, c04750Gp, id, LJ), C79561VKj.LJLIL);
    }

    public final C81392Vwy<Bitmap> LJJIIZ(C81392Vwy<Bitmap> c81392Vwy, int i, int i2, String str) {
        C81392Vwy<Bitmap> LJIILIIL;
        Bitmap bm = c81392Vwy.LJI();
        try {
            o.LJFF(bm, "bm");
            if (bm.getWidth() == i && bm.getHeight() == i2) {
                LJIILIIL = c81392Vwy.LIZIZ();
            } else {
                LJIILIIL = C81392Vwy.LJIILIIL(Bitmap.createScaledBitmap(bm, i, i2, this.LLI), C1E5.LJFF());
            }
            return LJIILIIL;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("scale image failed, and detail is ");
            LIZ.append(e);
            LJJI(2, X1D.LIZIZ(LIZ), str);
            return null;
        }
    }
}

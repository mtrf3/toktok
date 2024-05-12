package X;

import Y.ARunnableS16S0201000_13;
import Y.ARunnableS24S0300000_13;
import Y.ARunnableS49S0100000_13;
import Y.ARunnableS4S1101000_13;
import Y.AUListenerS102S0200000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayoutKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcMixParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcResolution;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerformanceReportOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlayingAdNotRefreshLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicSeiEnabledBusinessIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostFeedLayoutManagerCrashFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiCommonData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS68S0110000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U8H implements InterfaceC75579TlP {
    public static final UBM LJJJJL = new UBM();
    public static final OSZ<Integer, Integer> LJJJJLI = new OSZ<>(720, 1280);
    public final C76665U6z LIZ;
    public final CopyOnWriteArrayList<Runnable> LIZIZ = new CopyOnWriteArrayList<>();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C76731U9n.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C76730U9m.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C76719U9b.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C76729U9l.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 520));
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS163S0100000_13(this, 509));
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 521));
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 518));
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 514));
    public FrameLayout LJIIJJI;
    public final C74637TQz LJIIL;
    public DslLayout LJIILIIL;
    public final ConcurrentLinkedQueue<InterfaceC76112Tu0> LJIILJJIL;
    public final OnLineMicInfo LJIILL;
    public LinkUser LJIILLIIL;
    public final AtomicBoolean LJIIZILJ;
    public final Rect LJIJ;
    public OSZ<Integer, Integer> LJIJI;
    public OSZ<Integer, Integer> LJIJJ;
    public View LJIJJLI;
    public U8X LJIL;
    public final C62822Ol8 LJJ;
    public final C62822Ol8 LJJI;
    public List<String> LJJIFFI;
    public float LJJII;
    public boolean LJJIII;
    public List<LinkUser> LJJIIJ;
    public List<LinkUser> LJJIIJZLJL;
    public long LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public InterfaceC88472Yns<? super C61162ae, Integer> LJJIJIIJI;
    public final C62822Ol8 LJJIJIIJIL;
    public final C62822Ol8 LJJIJIL;
    public long LJJIJL;
    public SeiAppData LJJIJLIJ;
    public InterfaceC75804Tp2 LJJIL;
    public String LJJIZ;
    public boolean LJJJ;
    public LayoutSlardarMonitor LJJJI;
    public final int LJJJIL;
    public boolean LJJJJ;
    public final C62822Ol8 LJJJJI;
    public final U8I LJJJJIZL;
    public final U6C LJJJJJ;
    public ViewGroup LJJJJJL;

    public static final void LJJJJIZL() {
        C73411SrX c73411SrX = U8K.LJIIIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        U8K.LJIIIZ = null;
    }

    @Override // X.InterfaceC75579TlP
    public final java.util.Map<String, OnLineMicInfo> LIZ() {
        return this.LIZ.LJFF.LIZ();
    }

    @Override // X.InterfaceC75579TlP
    public final void LIZIZ() {
        this.LJIIJJI.setClipChildren(false);
        LJJIII().setClipChildren(false);
    }

    @Override // X.InterfaceC75579TlP
    public final java.util.Map<String, OnLineMicInfo> LIZLLL() {
        return this.LIZ.LJFF.LIZLLL();
    }

    @Override // X.InterfaceC75579TlP
    public final List<LinkUser> LJFF() {
        return this.LIZ.LJFF.LJFF();
    }

    public final void LJI() {
        for (int childCount = this.LJIIJJI.getChildCount() - 1; childCount < 1; childCount++) {
            View childAt = this.LJIIJJI.getChildAt(childCount);
            if (childAt instanceof C76696U8e) {
                C16880lQ.LJLLLL(childAt, this.LJIIJJI);
            }
        }
    }

    public final void LJIIIIZZ() {
        if (LiveCoHostFeedLayoutManagerCrashFixSetting.INSTANCE.isEnable()) {
            ViewGroup viewGroup = this.LJJJJJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("destroyLayoutImmediately fix, tempVP=");
            LIZ.append(viewGroup);
            LIZ.append(", containerFrameLayout=");
            LIZ.append(this.LJIIJJI);
            C0NB.LJIIIZ("LinkLayoutManager", X1D.LIZIZ(LIZ));
            if (viewGroup != null) {
                LJI();
                C16880lQ.LJLLL(this.LJIIJJI, viewGroup);
                this.LJJJJJL = null;
            }
            T2K t2k = new T2K(this.LIZ.LIZ);
            t2k.setId(R.id.lqf);
            this.LJIIJJI = t2k;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("destroyLayoutImmediately raw, viewParent=");
        LIZ2.append(this.LJJJJJL);
        LIZ2.append(", containerFrameLayout=");
        LIZ2.append(this.LJIIJJI);
        C0NB.LJIIIZ("LinkLayoutManager", X1D.LIZIZ(LIZ2));
        ViewGroup viewGroup2 = this.LJJJJJL;
        if (viewGroup2 != null) {
            LJI();
            C16880lQ.LJLLL(this.LJIIJJI, viewGroup2);
        }
        this.LJJJJJL = null;
    }

    public final void LJIILIIL() {
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 511));
    }

    public final HashMap<String, N2K> LJIILL() {
        return (HashMap) this.LJFF.getValue();
    }

    public final HashMap<String, java.util.Map<String, JSONObject>> LJIILLIIL() {
        return (HashMap) this.LJ.getValue();
    }

    public final HashMap<String, java.util.Map<String, String>> LJIIZILJ() {
        return (HashMap) this.LIZLLL.getValue();
    }

    public final HashMap<String, java.util.Map<String, String>> LJIJ() {
        return (HashMap) this.LIZJ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        if (r9 == null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution LJIJI() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8H.LJIJI():com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution");
    }

    public final C76703U8l LJIJJ() {
        return (C76703U8l) this.LJII.getValue();
    }

    public final U92 LJIJJLI() {
        return (U92) this.LJJI.getValue();
    }

    public final UBK LJIL() {
        return (UBK) this.LJJ.getValue();
    }

    public final boolean LJJ() {
        return this.LJIIZILJ.get();
    }

    public final U6E LJJI() {
        return (U6E) this.LJJJJI.getValue();
    }

    public final C76696U8e LJJIII() {
        return (C76696U8e) this.LJIIIZ.getValue();
    }

    public final U9E LJJIIJ() {
        return (U9E) this.LJI.getValue();
    }

    public final U8P LJJIIJZLJL() {
        return (U8P) this.LJIIIIZZ.getValue();
    }

    public final EnumC74829TYj LJJIIZ() {
        return ((U8J) this.LJIIJ.getValue()).LIZLLL;
    }

    public final U8O LJJIIZI() {
        if (this.LIZ.LJ == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return (U8O) this.LJJIJIL.getValue();
        }
        return null;
    }

    public final void LJJIJIL() {
        Resolution LJIJI;
        this.LIZ.LJFF.LJJIJ();
        LJJIJIIJIL("LinkLayoutManager invalideSeiAndUpdateRtcInfo");
        if ((!LJJ() && !LJJIJLIJ()) || (LJIJI = LJIJI()) == null) {
            return;
        }
        RtcLiveVideoParam rtcLiveVideoParam = new RtcLiveVideoParam(1, 2, new RtcMixParam(LinkMicRtcMixBitrateSetting.INSTANCE.getValue()), C47261Igj.LJII(new RtcResolution("rtc_video_param_server_define", LJIJI)), LJIJI.getBusinessId());
        String LJJJ = LJJJ(803);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":updateRtcInfo resolution = ");
        LIZ.append(LJIJI);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        this.LIZ.LJFF.LJJIJIL(rtcLiveVideoParam);
    }

    public final boolean LJJIJLIJ() {
        if (this.LIZ.LJ == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    public final boolean LJJIL() {
        return this.LIZ.LJFF.LJJJ();
    }

    public final void LJJJJ() {
        String LJJJ = LJJJ(769);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":onLinkedUsersChanged");
        C32014ChO.LIZ(LJJJ, X1D.LIZIZ(LIZ));
        Iterator<Runnable> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            Runnable next = it.next();
            next.run();
            this.LIZIZ.remove(next);
        }
    }

    public final void LJJJJI() {
        ViewGroup viewGroup = this.LJJJJJL;
        if (viewGroup != null) {
            viewGroup.post(new ARunnableS49S0100000_13(this, 219));
        }
    }

    public final void LJJJJZ() {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("live_show_sei")) {
            return;
        }
        synchronized (LJIIZILJ()) {
            synchronized (LJIILLIIL()) {
                LJIIZILJ().remove("live_show_sei");
                LJIILLIIL().remove("show_info");
            }
        }
        LJJIJIIJIL("removePermanentData");
    }

    public final void LJJJLZIJ() {
        this.LJJIZ = "";
        this.LJJIJLIJ = null;
        this.LJJIL = null;
        this.LJJIJL = 0L;
    }

    public final void LJJLIIIJILLIZJL() {
        String LJJJ = LJJJ(822);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":startToShow");
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            LJJJLZIJ();
        }
        LJJLL(this, this.LJIILLIIL, null, false, 12);
        LayoutSlardarMonitor layoutSlardarMonitor = this.LJJJI;
        if (layoutSlardarMonitor != null) {
            Long userId = this.LJIILLIIL.getUserId();
            String linkMicId = this.LJIILLIIL.getLinkMicId();
            if (linkMicId == null) {
                linkMicId = "";
            }
            layoutSlardarMonitor.LIZIZ(true, userId, linkMicId, 0, 0, true, LJJIJ());
        }
    }

    public final void LJJLIIIJL() {
        LJIILL().remove("live_sticker_gift_sei");
    }

    @Override // X.InterfaceC75579TlP
    public final void destroy() {
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 510));
    }

    @Override // X.InterfaceC75579TlP
    public final void u1() {
        this.LJJIJL = 0L;
        this.LJJIJLIJ = null;
        this.LJJIL = null;
        this.LJJIZ = "";
    }

    public final String LJJIJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkLayoutManager");
        LIZ.append(this.LJJJIL);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LJJIJIIJI() {
        String str;
        if (x1() == null) {
            return true;
        }
        Layout x1 = x1();
        String str2 = null;
        if (x1 != null) {
            str = x1.getAnchorZoomLayoutId();
        } else {
            str = null;
        }
        if (C29306Beo.LJIJJLI(str)) {
            Layout x12 = x1();
            if (x12 != null) {
                str2 = x12.getZoomLayoutId();
            }
            if (C29306Beo.LJIJJLI(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJJIJL() {
        if (!LJJ() && !LJJIJLIJ()) {
            return true;
        }
        return false;
    }

    public final void LJJJZ() {
        String str;
        if (!LJJIJLIJ() || this.LIZ.LIZIZ == 2 || !LinkMicStateSetting.INSTANCE.enableRTCSend()) {
            return;
        }
        Layout LIZJ = LJIJJ().LIZJ(false);
        if (LIZJ != null) {
            str = LIZJ.getLayoutId();
        } else {
            str = null;
        }
        if (str == null) {
            String LJJJ = LJJJ(1016);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJJIJ());
            LIZ.append(":send rtc room msg layoutId return as is null");
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
            return;
        }
        String LJJJ2 = LJJJ(1016);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJJIJ());
        LIZ2.append(":send rtc room msg layoutId = ");
        LIZ2.append(str);
        C32014ChO.LJFF(LJJJ2, X1D.LIZIZ(LIZ2));
        DslLayout dslLayout = this.LJIILIIL;
        if (dslLayout == null) {
            return;
        }
        LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage("linkMicSDKLayoutChange", new LinkLayerRTCMessageParam(str, dslLayout.getScene(), dslLayout.getVersion(), null, null, true, 24, null), null, null, 0L, null, null, 124, null);
        linkLayerRTCMessage.generateId();
        this.LIZ.LJFF.LJJIJLIJ(linkLayerRTCMessage);
    }

    @Override // X.InterfaceC75579TlP
    public final void l1() {
        LJJLIIIJJIZ(this, DslLayoutKt.getNormalLayout(), false, false, null, 28);
    }

    @Override // X.InterfaceC75579TlP
    public final C76696U8e r1() {
        return LJJIII();
    }

    @Override // X.InterfaceC75579TlP
    public final Layout x1() {
        return LJIJJ().LIZJ(false);
    }

    @Override // X.InterfaceC75579TlP
    public final Layout y1() {
        return LJJIIJZLJL().LIZ();
    }

    public U8H(C76665U6z c76665U6z) {
        this.LIZ = c76665U6z;
        T2K t2k = new T2K(c76665U6z.LIZ);
        t2k.setId(R.id.lqf);
        this.LJIIJJI = t2k;
        this.LJIIL = new C74637TQz();
        this.LJIILJJIL = new ConcurrentLinkedQueue<>();
        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
        builder.setMicPositionData(new MicPositionInfo(1, 0, 0, 0L, 12, null));
        this.LJIILL = builder.build();
        LinkUser.Builder builder2 = new LinkUser.Builder();
        builder2.setUserId(Long.valueOf(c76665U6z.LJ));
        this.LJIILLIIL = builder2.build();
        this.LJIIZILJ = new AtomicBoolean(false);
        this.LJIJ = new Rect();
        this.LJIJJ = LJJJJLI;
        this.LJJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 513));
        this.LJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 512));
        this.LJJII = -1.0f;
        this.LJJIIJ = new CopyOnWriteArrayList();
        this.LJJIIJZLJL = new CopyOnWriteArrayList();
        this.LJJIIZ = -1L;
        this.LJJIJ = -1;
        this.LJJIJIIJIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 508));
        this.LJJIJIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 507));
        this.LJJIZ = "";
        this.LJJJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 519));
        this.LJJJJIZL = new U8I(this);
        this.LJJJJJ = new U6C(this);
        c76665U6z.LJFF.LJJJI(new U8L(this));
        if (c76665U6z.LJII == EnumC76124TuC.LIVE_ROOM && !c76665U6z.LJI) {
            this.LJJJI = new LayoutSlardarMonitor(new U8Y(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), new AqS163S0100000_13(this, 515), new AqS163S0100000_13(this, 516), c76665U6z.LIZJ, c76665U6z.LIZIZ, c76665U6z.LIZLLL, new AqS163S0100000_13(this, 517)));
            if (!LJJIJLIJ() && !c76665U6z.LJI) {
                U8K.LJIIIZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(8L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(U8T.LJLIL);
            }
        }
        this.LJJJIL = hashCode();
    }

    public static String LJJJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_LinkLayoutManager_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_LinkLayoutManager_", i, LIZ2);
    }

    public static void LJJJJLL(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(view, viewGroup);
        }
    }

    public static String LJJJLIIL(String str) {
        return QZP.LIZIZ("(,(.){2}talk\"(.+?),)|(,(.){2}timestamp(.){3}[0-9]*,)|(signResult(.+?)\\})|(,(.){1}canvas(.+)\\})", str, ",");
    }

    public static String LJJJLL(String str) {
        return QZP.LIZIZ("(,.{2}talk(_)*[a-z]*.{2}:(\\d)+)|(,(.){2}timestamp(.){3}[0-9]*,)|(signResult(.+?)\\})|(,(.){1}canvas(.+)\\})", str, ",");
    }

    @Override // X.InterfaceC75579TlP
    public final void A9(boolean z) {
        C29306Beo.LJJJ(new AqS68S0110000_13(this, z, 4));
    }

    @Override // X.InterfaceC75579TlP
    public final void B1(int i) {
        this.LJJIIZI = i;
    }

    @Override // X.InterfaceC75579TlP
    public final void LJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
        this.LIZ.LJFF.LJ(seiAppData);
    }

    public final void LJII(DslLayout dsl) {
        o.LJIIIZ(dsl, "dsl");
        String LJJJ = LJJJ(815);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":createLayout, scene:");
        LIZ.append(dsl.getScene());
        LIZ.append(", version:");
        LIZ.append(dsl.getVersion());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        this.LJIILIIL = dsl;
        this.LJIIL.LJLIL = dsl.getVersion();
        LayoutSlardarMonitor layoutSlardarMonitor = this.LJJJI;
        if (layoutSlardarMonitor != null) {
            layoutSlardarMonitor.LJFF = dsl.getVersion();
        }
        LJJIII();
    }

    @Override // X.InterfaceC75579TlP
    public final void LJIIJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
        this.LIZ.LJFF.LJIIJ(seiAppData);
    }

    public final int LJJIFFI(String layoutName) {
        int i;
        Integer num;
        java.util.Map<String, Layout> data;
        Layout layout;
        o.LJIIIZ(layoutName, "layoutName");
        DslLayout dslLayout = this.LJIILIIL;
        if (dslLayout != null && (data = dslLayout.getData()) != null && (layout = data.get(layoutName)) != null) {
            i = layout.getMicCount();
        } else {
            i = 0;
        }
        Integer num2 = null;
        if (i == 0) {
            String LJJJ = LJJJ(1107);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJJIJ());
            LIZ.append(":getLayoutMaxMicCount dslLayout = ");
            LIZ.append(this.LJIILIIL);
            LIZ.append(" can't find layoutName = ");
            LIZ.append(layoutName);
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
            java.util.Map<Integer, Integer> LIZJ = InterfaceC30442Bx8.a0.LIZJ();
            DslLayout dslLayout2 = this.LJIILIIL;
            if (dslLayout2 != null) {
                num = Integer.valueOf(dslLayout2.getScene());
            } else {
                num = null;
            }
            Integer num3 = LIZJ.get(num);
            if (num3 != null) {
                i = num3.intValue();
            } else {
                i = 4;
            }
        }
        String LJJJ2 = LJJJ(1113);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJJIJ());
        LIZ2.append(":getLayoutMaxMicCount layoutName = ");
        LIZ2.append(layoutName);
        LIZ2.append(" count = ");
        LIZ2.append(i);
        LIZ2.append(" mDslLayout.scene = ");
        DslLayout dslLayout3 = this.LJIILIIL;
        if (dslLayout3 != null) {
            num2 = Integer.valueOf(dslLayout3.getScene());
        }
        LIZ2.append(num2);
        C32014ChO.LIZ(LJJJ2, X1D.LIZIZ(LIZ2));
        return i;
    }

    public final int LJJII(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = 9;
        this.LIZ.LJFF.LJIIZILJ(this.LJIIL.LJLIL, layoutId, new C76659U6t(this, c76732zl));
        return c76732zl.element;
    }

    public final void LJJIJIIJIL(String str) {
        if (LJJIJLIJ() && this.LJJJJJL != null) {
            this.LIZ.LJFF.LJJIIZ(str);
        }
    }

    public final boolean LJJIZ(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        return this.LIZ.LJFF.LJIILL(layoutId);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x0468. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0581  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r27) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8H.LJJJI(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout):void");
    }

    public final void LJJJIL(InterfaceC88472Yns interfaceC88472Yns) {
        String str;
        if (this.LIZ.LJI || this.LJJJ) {
            return;
        }
        LayoutSlardarMonitor layoutSlardarMonitor = this.LJJJI;
        if (layoutSlardarMonitor != null) {
            Layout LIZJ = LJIJJ().LIZJ(false);
            if (LIZJ == null || (str = LIZJ.getTargetLayoutData(Integer.valueOf(LJIJJLI().LJIIIIZZ()))) == null) {
                str = "";
            }
            layoutSlardarMonitor.LIZLLL = str;
        }
        C76696U8e LJJIII = LJJIII();
        LJJIII.getActionCallback();
        LJJIII.invoke(new UBP(), interfaceC88472Yns);
    }

    public final void LJJJJJ(java.util.Map map) {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("resume_cohost")) {
            return;
        }
        synchronized (LJIILLIIL()) {
            LJIILLIIL().put("resume_cohost", map);
        }
        LJJIJIIJIL("postPermanentMixRegionStreamData");
    }

    public final void LJJJJLI(List<String> list) {
        String LJJJ = LJJJ(808);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":refreshSeiForLinkedListChanged newLinkMicIdList:");
        LIZ.append(list);
        C32014ChO.LIZ(LJJJ, X1D.LIZIZ(LIZ));
        this.LJJIFFI = list;
    }

    public final void LJJJJZI(String str) {
        synchronized (LJIIZILJ()) {
            LJIIZILJ().remove(str);
        }
        LJJIJIIJIL("removePermanentData");
    }

    public final void LJJL(boolean z) {
        Rect rect;
        C76696U8e LJJIII = LJJIII();
        if (z) {
            rect = new Rect();
            ViewGroup viewGroup = this.LJJJJJL;
            if (viewGroup != null) {
                viewGroup.getLocalVisibleRect(rect);
            }
        } else {
            rect = null;
        }
        LJJIII.getLayoutMixer().LIZIZ(rect, z);
        LJJIII.LJIIJJI(U9O.SwitchLayout, false, null);
    }

    public final void LJJLI(Bitmap bitmap) {
        ((U8O) this.LJJIJIL.getValue()).LJIIZILJ = bitmap;
        LJJIJIIJIL("updateMaskBg for sharedBg");
    }

    public final void LJJLIIIJ(OSZ<Integer, Integer> streamResolution) {
        o.LJIIIZ(streamResolution, "streamResolution");
        if ((streamResolution.getFirst().intValue() <= 0 && streamResolution.getSecond().intValue() <= 0) || !o.LJ(streamResolution, this.LJIJJ)) {
            if (streamResolution.getFirst().intValue() <= 0 || streamResolution.getSecond().intValue() <= 0) {
                streamResolution = LJJJJLI;
            }
            this.LJIJJ = streamResolution;
            U8K.LJII = streamResolution.getFirst().intValue();
            U8K.LJIIIIZZ = this.LJIJJ.getSecond().intValue();
            String LJJJ = LJJJ(936);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJJIJ());
            LIZ.append(":update player size mPlayerSize:");
            LIZ.append(this.LJIJJ);
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
            Layout LIZJ = LJIJJ().LIZJ(false);
            if (LIZJ == null) {
                String LJJJ2 = LJJJ(939);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJJIJ());
                LIZ2.append(":setParent return as layout is null");
                C32014ChO.LJFF(LJJJ2, X1D.LIZIZ(LIZ2));
                return;
            }
            LJJLIIIJJIZ(this, LIZJ, true, false, null, 24);
        }
    }

    public final void LJJLIIIJLJLI(long j) {
        LayoutSlardarMonitor layoutSlardarMonitor = this.LJJJI;
        if (layoutSlardarMonitor != null) {
            layoutSlardarMonitor.LJ = j;
        }
        U8K.LIZLLL = String.valueOf(j);
    }

    public final void LJJLIIJ(DslLayout dsl) {
        o.LJIIIZ(dsl, "dsl");
        this.LJIILIIL = dsl;
        this.LJIIL.LJLIL = dsl.getVersion();
        LayoutSlardarMonitor layoutSlardarMonitor = this.LJJJI;
        if (layoutSlardarMonitor != null) {
            layoutSlardarMonitor.LJFF = dsl.getVersion();
        }
        String LJJJ = LJJJ(832);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":updateDslLayout, dsl version:");
        LIZ.append(this.LJIIL.LJLIL);
        C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ), null);
    }

    public final void LJJLIL(SurfaceView surfaceView) {
        LJJLJ(true);
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        LinkUser LIZ = LJIL().LIZ(currentUserId);
        if (LIZ == null) {
            String LJJJ = LJJJ(1252);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJJIJ());
            LIZ2.append(":updateGuestSelfSurfaceView return as linkUser is null");
            C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ2), null);
            return;
        }
        if (LJIJJ().LJIILJJIL(new C76701U8j(EnumC75419Tip.StateLinked, Long.valueOf(currentUserId), LIZ.getLinkMicId(), surfaceView, null, null, 240), null) && LJJIIJZLJL().LIZLLL(LIZ.getActualLinkMicId()) != null) {
            LJJJIL(null);
            return;
        }
        String LJJJ2 = LJJJ(1266);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LJJIJ());
        LIZ3.append(":updateGuestSelfSurfaceView updateOrInsert = false, ");
        LIZ3.append(LJJIIJZLJL().LIZLLL(LIZ.getActualLinkMicId()));
        C32014ChO.LIZ(LJJJ2, X1D.LIZIZ(LIZ3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r13 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJ(boolean r13) {
        /*
            r12 = this;
            r0 = 1351(0x547, float:1.893E-42)
            java.lang.String r2 = LJJJ(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r12.LJJIJ()
            r1.append(r0)
            java.lang.String r0 = ":updateIsLinked isLink = "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C32014ChO.LJFF(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.LJIIZILJ
            boolean r0 = r0.getAndSet(r13)
            r8 = 0
            if (r0 == r13) goto Lbc
            if (r13 == 0) goto Lc0
            r12.LJJIJLIJ = r8
            r12.LJJIL = r8
            java.lang.String r0 = ""
            r12.LJJIZ = r0
            r0 = 0
            r12.LJJIJL = r0
        L37:
            boolean r0 = r12.LJJIJLIJ()
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "anchor"
        L3f:
            X.U8K.LIZ = r0
            X.C32014ChO.LJLJJLL = r0
            X.UBK r2 = r12.LJIL()
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r0 = r0.getCurrentUserId()
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r3 = r2.LIZ(r0)
            if (r3 == 0) goto Lb7
            java.lang.String r0 = r3.getLinkMicId()
        L5f:
            X.U8K.LIZIZ = r0
            if (r3 == 0) goto L95
            java.lang.String r2 = r3.getLinkMicId()
            if (r2 == 0) goto L95
            X.C32014ChO.LJLJJI = r2
            X.U6z r0 = r12.LIZ
            java.lang.String r1 = r0.LIZLLL
            java.lang.String r0 = "live_voice"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L95
            com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutViewOptimizeSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutViewOptimizeSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L95
            boolean r0 = r12.LJJIJLIJ()
            if (r0 != 0) goto L95
            X.U8l r0 = r12.LJIJJ()
            X.U8t r0 = r0.LJI(r2)
            if (r0 == 0) goto L96
            X.U8j r0 = r0.LJLIL
            android.view.SurfaceView r0 = r0.LIZLLL
            if (r0 == 0) goto L96
        L95:
            return
        L96:
            X.U8l r0 = r12.LJIJJ()
            X.U8j r4 = new X.U8j
            X.Tip r5 = X.EnumC75419Tip.StateJoined
            java.lang.Long r6 = r3.getUserId()
            java.lang.String r7 = r3.getLinkMicId()
            r11 = 248(0xf8, float:3.48E-43)
            r9 = r8
            r10 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r0.LJIILJJIL(r4, r8)
            if (r0 == 0) goto L95
            r12.LJJJIL(r8)
            goto L95
        Lb7:
            r0 = r8
            goto L5f
        Lb9:
            java.lang.String r0 = "guest"
            goto L3f
        Lbc:
            if (r13 == 0) goto Lc0
            goto L37
        Lc0:
            java.lang.String r0 = "audience"
            X.U8K.LIZ = r0
            X.C32014ChO.LJLJJLL = r0
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8H.LJJLJ(boolean):void");
    }

    public final void LJJLJLI(int i) {
        String LJJJ = LJJJ(1365);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":updateLinkerArchType archType:");
        LIZ.append(i);
        C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ), null);
        this.LJJIJ = i;
        LJJIJIIJIL("LinkLayoutManager updateLinkerArchType");
    }

    public final void LJJZ(long j) {
        String LJJJ = LJJJ(1364);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":updateSeiBattleId battleId:");
        LIZ.append(j);
        C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ), null);
        this.LJJIIZ = j;
        LJJIJIIJIL("LinkLayoutManager updateSeiBattleId");
    }

    @Override // X.InterfaceC75579TlP
    public final void m1(InterfaceC76112Tu0 listener) {
        o.LJIIIZ(listener, "listener");
        if (this.LJIILJJIL.contains(listener)) {
            return;
        }
        this.LJIILJJIL.add(listener);
    }

    @Override // X.InterfaceC75579TlP
    public final void o1(View player) {
        o.LJIIIZ(player, "player");
        this.LJIJJLI = player;
    }

    @Override // X.InterfaceC75579TlP
    public final void p1(InterfaceC76112Tu0 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIILJJIL.remove(listener);
    }

    @Override // X.InterfaceC75579TlP
    public final void t1(int i) {
        LJJIII().setDividerType(i);
    }

    @Override // X.InterfaceC75579TlP
    public final Layout v1(String businessType) {
        o.LJIIIZ(businessType, "businessType");
        DslLayout dslLayout = this.LJIILIIL;
        String str = null;
        if (dslLayout == null) {
            return null;
        }
        Layout layout = dslLayout.getData().get(businessType);
        String LJJJ = LJJJ(1074);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":calculateLayout layoutName = ");
        LIZ.append(businessType);
        LIZ.append(" layoutId = ");
        if (layout != null) {
            str = layout.getLayoutId();
        }
        LIZ.append(str);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        return layout;
    }

    @Override // X.InterfaceC75579TlP
    public final void z1(int i) {
        this.LJJIIZI = i;
        ViewGroup viewGroup = this.LJJJJJL;
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new ARunnableS16S0201000_13(i, this, viewGroup, 7));
    }

    @Override // X.InterfaceC75579TlP
    public final void A1(String str, boolean z) {
        String LJJJ = LJJJ(1074);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":switchLayoutById layoutId :");
        LIZ.append(str);
        LIZ.append(" forceMeasure:");
        LIZ.append(z);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        if (str != null) {
            this.LIZ.LJFF.LJIIZILJ(this.LJIIL.LJLIL, str, new C76660U6u(this, z));
        }
    }

    public final void LIZJ(View view, InterfaceC75787Tol interfaceC75787Tol) {
        if (interfaceC75787Tol.getLayoutId() != null) {
            String layoutName = interfaceC75787Tol.getLayoutName();
            if (layoutName == null) {
                layoutName = EnumC74991Tbv.NORMAL.name();
            }
            if (o.LJ(layoutName, EnumC74991Tbv.FLOAT.name())) {
                LJIIJJI(false, view, interfaceC75787Tol);
            } else if (o.LJ(layoutName, EnumC74991Tbv.GRID_FLOAT.name())) {
                Rect playerRange = interfaceC75787Tol.getPlayerRange();
                ViewGroup viewGroup = this.LJJJJJL;
                if (viewGroup == null) {
                    return;
                }
                if (viewGroup.getWidth() == playerRange.width() && viewGroup.getHeight() == playerRange.height()) {
                    LJIIJJI(true, view, interfaceC75787Tol);
                } else {
                    LJIIJJI(false, view, interfaceC75787Tol);
                }
            } else if (o.LJ(layoutName, EnumC74991Tbv.GRID_FIX.name())) {
                LJIIJJI(false, view, interfaceC75787Tol);
            } else if (o.LJ(layoutName, EnumC74991Tbv.FLOAT_FIX.name())) {
                LJIIJJI(false, view, interfaceC75787Tol);
            } else {
                LJIIJJI(true, view, interfaceC75787Tol);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LJIIJJI(true, view, interfaceC75787Tol);
    }

    public final void LJIIL(View view, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        if (view.getWidth() > 0) {
            interfaceC88472Yns.invoke(view);
        } else {
            view.post(new ARunnableS24S0300000_13(this, view, interfaceC88472Yns, 36));
        }
    }

    public final void LJJJJJL(String str, java.util.Map<String, String> data) {
        o.LJIIIZ(data, "data");
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable(str)) {
            return;
        }
        synchronized (LJIIZILJ()) {
            LJIIZILJ().put(str, data);
        }
        LJJIJIIJIL("postPermanentMixStreamData");
    }

    public final void LJJJJL(java.util.Map map, java.util.Map map2) {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("live_show_sei")) {
            return;
        }
        synchronized (LJIIZILJ()) {
            synchronized (LJIILLIIL()) {
                LJIIZILJ().put("live_show_sei", map);
                LJIILLIIL().put("show_info", map2);
            }
        }
        LJJIJIIJIL("postPermanentMixStreamData");
    }

    public final void LJJLIIIJJI(String businessType, boolean z) {
        Layout layout;
        o.LJIIIZ(businessType, "businessType");
        DslLayout dslLayout = this.LJIILIIL;
        if (dslLayout == null || (layout = dslLayout.getData().get(businessType)) == null) {
            return;
        }
        String LJJJ = LJJJ(1063);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":switchLayout layoutName = ");
        LIZ.append(businessType);
        LIZ.append(" layoutId = ");
        LIZ.append(layout.getLayoutId());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        LJJLIIIJJIZ(this, layout, true, z, null, 16);
    }

    public final void LJJLIIIJLLLLLLLZ(float f, int i) {
        int i2;
        String LJJJ = LJJJ(1371);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":updateContainerOffsetY offsetY:");
        LIZ.append(f);
        LIZ.append(", animate:");
        LIZ.append(true);
        LIZ.append(", duration:");
        LIZ.append(i);
        C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ), null);
        if (!(this.LJIIJJI.getLayoutParams() instanceof C018905p)) {
            return;
        }
        int LIZ2 = C15380j0.LIZ(f);
        ViewGroup.LayoutParams layoutParams = this.LJIIJJI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C018905p c018905p = (C018905p) layoutParams;
        int abs = Math.abs(((ViewGroup.MarginLayoutParams) c018905p).topMargin);
        C76696U8e LJJIII = LJJIII();
        String LJIIIZ = C76696U8e.LJIIIZ(274);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LJJIII.getTAG());
        LIZ3.append(":updateOffsetY offsetY:");
        LIZ3.append(LIZ2);
        C32014ChO.LJFF(LJIIIZ, X1D.LIZIZ(LIZ3));
        LJJIII.LL = LIZ2;
        LJJJIL(null);
        U8J u8j = (U8J) this.LJIIJ.getValue();
        u8j.getClass();
        String LJFF = U8J.LJFF(74);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("updateOffsetY offsetY:");
        LIZ4.append(LIZ2);
        C32014ChO.LJFF(LJFF, X1D.LIZIZ(LIZ4));
        u8j.LIZJ = LIZ2;
        if (f == 0.0f) {
            i2 = abs - C15380j0.LIZ(this.LJJII);
        } else {
            i2 = LIZ2 + abs;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(abs, i2);
        o.LJIIIIZZ(ofInt, "ofInt(sourceTopMargin, targetTopMargin)");
        ofInt.setDuration(i).start();
        ofInt.addUpdateListener(new AUListenerS102S0200000_13(c018905p, this, 12));
        String LJJJ2 = LJJJ(1396);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LJJIJ());
        LIZ5.append(":updateContainerOffsetY invalidateSei offsetY:");
        LIZ5.append(f);
        C32014ChO.LIZ(LJJJ2, X1D.LIZIZ(LIZ5));
        this.LJJII = f;
        LJJIJIIJIL("LinkLayoutManager updateContainerOffsetY");
    }

    public final void LJJZZI(EnumC75419Tip linkState, LinkUser linkUser) {
        o.LJIIIZ(linkState, "linkState");
        o.LJIIIZ(linkUser, "linkUser");
        String LJJJ = LJJJ(1414);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIJ());
        LIZ.append(":updateUserLinkState linkState = ");
        LIZ.append(linkState);
        LIZ.append(" linkUser = ");
        LIZ.append(linkUser);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        C76703U8l.LJIILL(LJIJJ(), new C76701U8j(linkState, linkUser.getUserId(), linkUser.getLinkMicId(), null, null, null, 248));
        LJJJIL(null);
    }

    @Override // X.InterfaceC75579TlP
    public final void s1(String str, java.util.Map map) {
        U9E LJJIIJ = LJJIIJ();
        int i = this.LJIIL.LJLIL;
        LJJIIJ.getClass();
        if (map.equals(LJJIIJ.LJFF) && o.LJ(str, LJJIIJ.LIZLLL)) {
            return;
        }
        LJJIIJ.LJFF = map;
        LJJIIJ.LIZLLL = str;
        LJJIIJ.LIZ.LIZJ(map);
        LJJIIJ.LIZJ = true;
        String str2 = LJJIIJ.LIZLLL;
        if (str2 != null) {
            U6Z.LIZ().LJIIZILJ(i, str2, new U5Y(LJJIIJ, str, map));
        } else {
            LJJIIJ.LJ = null;
        }
    }

    @Override // X.InterfaceC75579TlP
    public final void w1(C28272B7s c28272B7s, C76121Tu9 c76121Tu9) {
        String str;
        String str2;
        String str3;
        SeiAppData LJIIJ = C75806Tp4.LJIIJ(c28272B7s);
        String str4 = null;
        if (LJIIJ != null) {
            if (c76121Tu9 != null) {
                if (C76121Tu9.LIZ(LJIIJ)) {
                    return;
                } else {
                    c76121Tu9.LIZLLL(LJIIJ);
                }
            }
            if (LJIIJ.timestamp <= this.LJJIJL) {
                return;
            }
            String LJJJLIIL = LJJJLIIL(this.LJJIZ);
            if (c28272B7s != null && (str3 = c28272B7s.LIZIZ) != null) {
                str4 = LJJJLIIL(str3);
            }
            if (o.LJ(LJJJLIIL, str4) || o.LJ(this.LJJIJLIJ, LJIIJ)) {
                this.LJJIJL = LJIIJ.timestamp;
                return;
            }
            this.LIZ.LJFF.LJIIJ(LJIIJ);
            this.LIZ.LJFF.LJ(LJIIJ);
            if (c76121Tu9 != null) {
                c76121Tu9.LIZJ(LJIIJ);
            }
            if (c28272B7s == null) {
                return;
            }
            this.LJJJJIZL.LIZIZ(c28272B7s, LJIIJ, true);
            return;
        }
        if (c28272B7s != null) {
            str = c28272B7s.LIZIZ;
        } else {
            str = null;
        }
        SeiCommonData LJIIIZ = C75806Tp4.LJIIIZ(str);
        if (LJIIIZ != null) {
            if (LJIIIZ.timestamp <= this.LJJIJL) {
                return;
            }
            String LJJJLL = LJJJLL(this.LJJIZ);
            if (c28272B7s != null && (str2 = c28272B7s.LIZIZ) != null) {
                str4 = LJJJLL(str2);
            }
            if (!o.LJ(LJJJLL, str4) && !o.LJ(this.LJJIJLIJ, LJIIIZ)) {
                return;
            }
            this.LJJIJL = LJIIIZ.timestamp;
            return;
        }
        if (c76121Tu9 == null) {
            return;
        }
        c76121Tu9.LIZIZ(c28272B7s);
    }

    public final void LJIIIZ(boolean z, View view, InterfaceC75787Tol interfaceC75787Tol) {
        C28212B5k c28212B5k;
        if (z) {
            String layoutName = interfaceC75787Tol.getLayoutName();
            if (layoutName == null) {
                layoutName = EnumC74991Tbv.NORMAL.name();
            }
            c28212B5k = new C28212B5k(-1, -1, 0, 0, 0, true, EnumC74991Tbv.valueOf(layoutName), null, null, 384);
        } else {
            Rect playerRange = interfaceC75787Tol.getPlayerRange();
            ViewGroup viewGroup = this.LJJJJJL;
            if (viewGroup == null) {
                return;
            }
            int width = playerRange.width();
            int height = playerRange.height();
            int i = playerRange.top;
            int i2 = playerRange.left;
            int width2 = viewGroup.getWidth() - playerRange.right;
            String layoutName2 = interfaceC75787Tol.getLayoutName();
            if (layoutName2 == null) {
                layoutName2 = EnumC74991Tbv.NORMAL.name();
            }
            c28212B5k = new C28212B5k(width, height, i, i2, width2, false, EnumC74991Tbv.valueOf(layoutName2), null, null, 384);
        }
        if (c28212B5k.LJFF) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            layoutParams2.gravity = 51;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            view.setLayoutParams(layoutParams2);
            LJIIIZ(false, view, interfaceC75787Tol);
            return;
        }
        C29306Beo.LJJJ(new AqS152S0200000_5(view, c28212B5k, 35));
    }

    public final void LJIIJJI(boolean z, View view, InterfaceC75787Tol interfaceC75787Tol) {
        if (MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable()) {
            Rect playerRange = interfaceC75787Tol.getPlayerRange();
            ViewGroup viewGroup = this.LJJJJJL;
            if (viewGroup == null) {
                return;
            }
            int width = playerRange.width();
            int height = playerRange.height();
            int i = playerRange.top;
            int i2 = playerRange.left;
            int width2 = viewGroup.getWidth() - playerRange.right;
            String layoutName = interfaceC75787Tol.getLayoutName();
            if (layoutName == null) {
                layoutName = EnumC74991Tbv.NORMAL.name();
            }
            C29306Beo.LJJJ(new AqS152S0200000_5(view, new C28212B5k(width, height, i, i2, width2, false, EnumC74991Tbv.valueOf(layoutName), null, null, 384), 36));
            return;
        }
        LJIIIZ(z, view, interfaceC75787Tol);
    }

    public final C76737U9t LJIILJJIL(String str, SeiAppData seiAppData, SeiAppData seiAppData2) {
        SeiRegion seiRegion;
        List<SeiRegion> list;
        SeiRegion seiRegion2;
        int i;
        int i2;
        C76737U9t c76737U9t = null;
        if (seiAppData2 == null) {
            return null;
        }
        List<SeiRegion> list2 = seiAppData2.grids;
        if (list2 != null) {
            Iterator<SeiRegion> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    seiRegion = it.next();
                    if (o.LJ(seiRegion.LIZ(), str)) {
                        break;
                    }
                } else {
                    seiRegion = null;
                    break;
                }
            }
            SeiRegion seiRegion3 = seiRegion;
            if (seiRegion3 != null) {
                int i3 = 0;
                if (seiAppData != null && (list = seiAppData.grids) != null) {
                    Iterator<SeiRegion> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            seiRegion2 = it2.next();
                            if (o.LJ(seiRegion2.LIZ(), str)) {
                                break;
                            }
                        } else {
                            seiRegion2 = null;
                            break;
                        }
                    }
                    SeiRegion seiRegion4 = seiRegion2;
                    if (seiRegion4 != null) {
                        boolean z = seiRegion4.muteVideoBool;
                        boolean z2 = seiRegion3.muteVideoBool;
                        if (z == z2) {
                            boolean z3 = seiRegion4.muteAudioBool;
                            boolean z4 = seiRegion3.muteAudioBool;
                            if (z3 == z4) {
                                int i4 = seiRegion4.onlineUserState;
                                int i5 = seiRegion3.onlineUserState;
                                if (i4 == i5 || i5 != 2) {
                                    SeiDsl seiDsl = seiAppData2.dsl;
                                    if (seiDsl != null) {
                                        i2 = seiDsl.scene;
                                    } else {
                                        i2 = 0;
                                    }
                                    c76737U9t = new C76737U9t(false, new C75786Tok(i2, i5, this.LIZ.LJFF.LJJIIZI().size(), z4, z2));
                                }
                            }
                        }
                        SeiDsl seiDsl2 = seiAppData2.dsl;
                        if (seiDsl2 != null) {
                            i = seiDsl2.scene;
                        } else {
                            i = 0;
                        }
                        c76737U9t = new C76737U9t(true, new C75786Tok(i, seiRegion3.onlineUserState, this.LIZ.LJFF.LJJIIZI().size(), seiRegion3.muteAudioBool, z2));
                    }
                }
                SeiDsl seiDsl3 = seiAppData2.dsl;
                if (seiDsl3 != null) {
                    i3 = seiDsl3.scene;
                }
                c76737U9t = new C76737U9t(true, new C75786Tok(i3, seiRegion3.onlineUserState, this.LIZ.LJFF.LJJIIZI().size(), seiRegion3.muteAudioBool, seiRegion3.muteVideoBool));
            }
        }
        return c76737U9t;
    }

    public final void LJJLIIIIJ(ViewGroup viewParent, boolean z, boolean z2) {
        o.LJIIIZ(viewParent, "viewParent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setParentWithOutVideoSize viewParent=");
        LIZ.append(viewParent);
        LIZ.append(" videoRegion=");
        LIZ.append((Object) null);
        LIZ.append(" isResumeBroadcastWithoutGuest=");
        LIZ.append(z);
        C32014ChO.LJFF("LinkLayoutManager", X1D.LIZIZ(LIZ));
        viewParent.setVisibility(0);
        if (o.LJ(viewParent, this.LJJJJJL)) {
            String LJJJ = LJJJ(846);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJJIJ());
            LIZ2.append(":setParent return as viewParent the same as old");
            C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ2), null);
            return;
        }
        LJIIL(viewParent, new U8U(this, z2, z));
    }

    @Override // X.InterfaceC75579TlP
    public final void n1(ViewGroup viewParent, FrameLayout frameLayout, OSZ<Integer, Integer> osz) {
        boolean z;
        o.LJIIIZ(viewParent, "viewParent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setParent viewParent=");
        LIZ.append(viewParent);
        LIZ.append(" videoRegion=");
        LIZ.append(frameLayout);
        LIZ.append(" playerSize=");
        LIZ.append(osz);
        C0NB.LJIIIZ("LinkLayoutManager", X1D.LIZIZ(LIZ));
        boolean z2 = false;
        viewParent.setVisibility(0);
        if (o.LJ(viewParent, this.LJJJJJL) && (frameLayout == null || o.LJ(frameLayout, this.LJIIJJI))) {
            z = true;
        } else {
            z = false;
        }
        if (osz != null && ((osz.getFirst().intValue() > 0 || osz.getSecond().intValue() > 0) && o.LJ(osz, this.LJIJJ))) {
            z2 = true;
        }
        if (z && z2) {
            String LJJJ = LJJJ(882);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJJIJ());
            LIZ2.append(":setParent return as viewParent and playerSize the same as old");
            C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ2), null);
            return;
        }
        if (frameLayout != null) {
            this.LJIIJJI = frameLayout;
        }
        LJIIL(viewParent, new AqS144S0200000_13(this, (U8H) osz, (OSZ<Integer, Integer>) 76));
    }

    @Override // X.InterfaceC75579TlP
    public final void q1(C28272B7s c28272B7s, Class cls, C76123TuB c76123TuB) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (c28272B7s != null) {
            str = c28272B7s.LIZIZ;
        } else {
            str = null;
        }
        InterfaceC75804Tp2 interfaceC75804Tp2 = (InterfaceC75804Tp2) C75806Tp4.LJIIJJI(cls, str);
        if (interfaceC75804Tp2 != null) {
            if (C76123TuB.LIZ(interfaceC75804Tp2)) {
                return;
            }
            c76123TuB.LIZLLL(interfaceC75804Tp2);
            if (interfaceC75804Tp2.LJ() <= this.LJJIJL) {
                return;
            }
            String LJJJLIIL = LJJJLIIL(this.LJJIZ);
            if (c28272B7s != null && (str4 = c28272B7s.LIZIZ) != null) {
                str5 = LJJJLIIL(str4);
            }
            if (o.LJ(LJJJLIIL, str5) || o.LJ(this.LJJIJLIJ, interfaceC75804Tp2)) {
                this.LJJIJL = interfaceC75804Tp2.LJ();
                return;
            }
            this.LIZ.LJFF.LJIIJ(interfaceC75804Tp2);
            this.LIZ.LJFF.LJ(interfaceC75804Tp2);
            c76123TuB.LIZJ(interfaceC75804Tp2);
            if (c28272B7s == null) {
                return;
            }
            this.LJJJJIZL.LIZIZ(c28272B7s, interfaceC75804Tp2, true);
            return;
        }
        if (c28272B7s != null) {
            str2 = c28272B7s.LIZIZ;
        } else {
            str2 = null;
        }
        SeiCommonData LJIIIZ = C75806Tp4.LJIIIZ(str2);
        if (LJIIIZ != null) {
            if (LJIIIZ.timestamp <= this.LJJIJL) {
                return;
            }
            String LJJJLL = LJJJLL(this.LJJIZ);
            if (c28272B7s != null && (str3 = c28272B7s.LIZIZ) != null) {
                str5 = LJJJLL(str3);
            }
            if (!o.LJ(LJJJLL, str5) && !o.LJ(this.LJJIJLIJ, LJIIIZ)) {
                return;
            }
            this.LJJIJL = LJIIIZ.timestamp;
            return;
        }
        c76123TuB.LIZIZ();
    }

    public static void LJJLL(U8H u8h, LinkUser linkUser, ILayerControl.ILayer iLayer, boolean z, int i) {
        if ((i & 4) != 0) {
            iLayer = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        u8h.getClass();
        String LJJJ = LJJJ(1270);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(u8h.LJJIJ());
        LIZ.append(":updateRoomOwnerUser owner =");
        LIZ.append(linkUser);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        if (linkUser == null) {
            return;
        }
        u8h.LJIILLIIL = linkUser;
        if (!u8h.LJIJJ().LJIILJJIL(new C76701U8j(EnumC75419Tip.StateLinked, linkUser.getUserId(), linkUser.getLinkMicId(), null, new WeakReference(iLayer), null, 224), null) || !z) {
            return;
        }
        u8h.LJJJIL(null);
    }

    public static void LJJLIIIJJIZ(U8H u8h, Layout layout, boolean z, boolean z2, AqS144S0200000_13 aqS144S0200000_13, int i) {
        InterfaceC28296B8q interfaceC28296B8q;
        boolean z3;
        Context context;
        Resources resources;
        Configuration configuration;
        AqS144S0200000_13 aqS144S0200000_132 = aqS144S0200000_13;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            aqS144S0200000_132 = null;
        }
        if (u8h.LJJJ) {
            return;
        }
        if (o.LJ(u8h.LJIJJ().LIZJ(false), layout) && !z && !u8h.LJJIIJ().LIZJ) {
            String LJJJ = LJJJ(1145);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(u8h.LJJIJ());
            LIZ.append(":switchLayoutInternal return is mCurrentLayout the same as old");
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
            return;
        }
        if (LinkMicPlayingAdNotRefreshLayoutSetting.getValue() && u8h.LJJJJ) {
            return;
        }
        Layout LIZJ = u8h.LJIJJ().LIZJ(false);
        u8h.LJIJJ().LJIILIIL(layout);
        if (u8h.LJJIJL() && u8h.LJJJJJL == null) {
            String LJJJ2 = LJJJ(1175);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(u8h.LJJIJ());
            LIZ2.append(":viewParent is null, do nothing");
            C32014ChO.LIZJ(LJJJ2, X1D.LIZIZ(LIZ2), null);
            return;
        }
        Layout LIZ3 = u8h.LJJIIJZLJL().LIZ();
        if (LIZ3 == null) {
            LIZ3 = layout;
        }
        LayoutSlardarMonitor layoutSlardarMonitor = u8h.LJJJI;
        if (layoutSlardarMonitor != null) {
            String toLayoutId = LIZ3.getLayoutId();
            String toLayoutData = LIZ3.getTargetLayoutData(Integer.valueOf(u8h.LIZ.LJFF.LJIIIIZZ()));
            ViewGroup viewGroup = u8h.LJJJJJL;
            if (viewGroup == null || (context = viewGroup.getContext()) == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            String hash = u8h.LJJIJ();
            o.LJIIIZ(toLayoutId, "toLayoutId");
            o.LJIIIZ(toLayoutData, "toLayoutData");
            o.LJIIIZ(hash, "hash");
            LayoutSlardarMonitor.LIZLLL(new RunnableC76713U8v(layoutSlardarMonitor, toLayoutId, toLayoutData, z3, hash));
        }
        if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
            String layoutId = LIZ3.getLayoutId();
            o.LJIIIZ(layoutId, "layoutId");
            C31014CFe.LIZLLL.put("layout_id", layoutId);
        }
        LayoutSlardarMonitor layoutSlardarMonitor2 = u8h.LJJJI;
        if (layoutSlardarMonitor2 != null) {
            int size = layout.getLayoutData().size();
            String hash2 = u8h.LJJIJ();
            o.LJIIIZ(hash2, "hash");
            LayoutSlardarMonitor.LIZLLL(new ARunnableS4S1101000_13(size, layoutSlardarMonitor2, hash2, 1));
        }
        u8h.LJJJI(LIZ3);
        String LJJJ3 = LJJJ(1222);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(u8h.LJJIJ());
        LIZ4.append(":switchLayoutInternal mCurrentLayout = ");
        LIZ4.append(u8h.LJIJJ().LIZJ(false));
        C32014ChO.LJFF(LJJJ3, X1D.LIZIZ(LIZ4));
        if ((!o.LJ(LIZJ, LIZ3) || u8h.LJJIIJ().LIZJ) && !u8h.LIZ.LJI) {
            u8h.LJJJZ();
            if (u8h.LJJIJLIJ()) {
                if (LiveAbLabelSetting.INSTANCE.getBooleanValue("is_enable_linkmic_enter_and_leave_room_opt")) {
                    if (layout.isFixedType() || u8h.LIZ.LJFF.LJJIIZI().size() > 1) {
                        u8h.LIZ.LJFF.LLLLLLLLL(new C76692U8a(u8h));
                    } else {
                        u8h.LIZ.LJFF.LJJJJI();
                    }
                } else {
                    u8h.LIZ.LJFF.LLLLLLLLL(new C76693U8b(u8h));
                }
            }
            u8h.LJJIJIL();
        }
        DataChannel LJIIL = u8h.LIZ.LJFF.LJIIL();
        if (LJIIL != null && (interfaceC28296B8q = (InterfaceC28296B8q) LJIIL.kv0(C28406BCw.class)) != null) {
            interfaceC28296B8q.LJFF();
        }
        if (z2) {
            return;
        }
        AqS117S0300000_13 aqS117S0300000_13 = new AqS117S0300000_13(u8h, (U8H) LIZ3, (Layout) aqS144S0200000_132, (InterfaceC88472Yns<? super String, C76737U9t>) 17);
        if (u8h.LIZ.LJI) {
            aqS117S0300000_13.invoke("unknown");
            return;
        }
        C76696U8e LJJIII = u8h.LJJIII();
        LJJIII.getActionCallback();
        LJJIII.invoke(new UBO(), aqS117S0300000_13);
    }
}

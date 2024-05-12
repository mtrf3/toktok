package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorMaskTouchEventChannel;
import com.bytedance.android.live.liveinteract.api.MuteMicViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestPauseViewShowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMuteTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicAnchorClickOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestPauseViewDiffFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorMuteViewSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSoundWaveBorderSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AddHostTag;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import o53.IDdS478S0100000_13;

/* renamed from: X.Thq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75358Thq extends FrameLayout implements InterfaceC75376Ti8, InterfaceC76717U8z, InterfaceC30431Bwx {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public InterfaceC75179Tex LJLIL;
    public DataChannel LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public C76846UDy LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C31657Cbd LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public C75360Ths LJLLJ;
    public TextureView LJLLL;
    public InterfaceC75179Tex LJLLLL;
    public C73411SrX LJLLLLLL;
    public InterfaceC12560eS LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final C5H3 LJZL;
    public final java.util.Map<Integer, View> LL;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;

    static {
        TBT tbt = new TBT(C75358Thq.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LLD = new InterfaceC74236TBo[]{tbt};
    }

    public final View LIZIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC75252Tg8
    public final void LJJII(int i) {
    }

    @Override // X.InterfaceC76717U8z
    public final boolean isEmpty() {
        return false;
    }

    private final C75366Thy getAvatarImageLoadListener() {
        return (C75366Thy) this.LJZ.getValue();
    }

    private final IDdS478S0100000_13 getGaussBgController() {
        return (IDdS478S0100000_13) this.LJZL.getValue();
    }

    private final C75369Ti1 getGaussBgImageLoadListener() {
        return (C75369Ti1) this.LJZI.getValue();
    }

    private final Animator getPauseAlphaInAnimation() {
        return (Animator) this.LJLLI.getValue();
    }

    private final Animator getPauseAlphaOutAnimation() {
        return (Animator) this.LJLLILLLL.getValue();
    }

    private final C75378TiA getTalkVolumeWaveHandler() {
        return (C75378TiA) this.LJLJLLL.getValue();
    }

    private final ZoomService getZoomService() {
        return (ZoomService) this.LJLL.LIZ(this, LLD[0]);
    }

    public final boolean LIZLLL() {
        Boolean bool;
        if (((IInteractService) CN1.LIZ(IInteractService.class)).Zs0()) {
            if (getMDataHolder().LJJIIZ != EnumC74778TWk.GRID_FIX && C78886Uxe.LJJJJZI(C8E.LJ()) <= 0) {
                ZoomService zoomService = getZoomService();
                if (zoomService != null) {
                    bool = Boolean.valueOf(zoomService.LIZJ());
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void LJ() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        if (!LiveAudioMuteTypeSetting.INSTANCE.canShowMuteMicLayout() || !MultiGuestAnchorMuteViewSwitcherSetting.INSTANCE.isEnable() || !TV3.LIZJ() || TV3.LIZLLL() <= 1) {
            return;
        }
        View view7 = null;
        if (this.LJLJL || C74838TYs.LJ().LJJJI) {
            if (this.LJLZ == null) {
                Object value = C8E.LIZLLL.getValue();
                o.LJIIIIZZ(value, "<get-broadcastService>(...)");
                this.LJLZ = ((IBroadcastService) value).getMuteMicView(getContext());
            }
            Object obj = this.LJLZ;
            if (obj == null) {
                return;
            }
            if ((obj instanceof View) && (view6 = (View) obj) != null) {
                TV3.LJIIJJI(view6);
            }
            Object obj2 = this.LJLZ;
            if (obj2 instanceof View) {
                view = (View) obj2;
            } else {
                view = null;
            }
            addView(view);
            Object obj3 = this.LJLZ;
            if ((obj3 instanceof View) && (view5 = (View) obj3) != null) {
                C87277YNd.LJJIJ(view5);
            }
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.qv0(MuteMicViewStateChangeEvent.class, Boolean.FALSE);
            }
            Object obj4 = this.LJLZ;
            if ((obj4 instanceof View) && (view4 = (View) obj4) != null) {
                layoutParams = view4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.gravity = 1;
                    if (layoutParams2 != null) {
                        layoutParams2.width = -2;
                        layoutParams2.height = -2;
                    }
                }
            } else {
                layoutParams2 = null;
            }
            if (this.LJLIL.LJJIJIL().getLayoutParams().height >= C15380j0.LIZ(149.0f) && this.LJLIL.LJJIJIL().getLayoutParams().width >= C15380j0.LIZ(144.0f)) {
                if (layoutParams2 != null) {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.gravity = 49;
                }
                InterfaceC12560eS interfaceC12560eS = this.LJLZ;
                if (interfaceC12560eS != null) {
                    ((C30659C1n) interfaceC12560eS).LIZ(false);
                }
                int LIZ = C15380j0.LIZ(8.0f);
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(LIZ);
                    layoutParams2.setMarginEnd(LIZ);
                }
                if (C59994Ngc.LIZJ() == EnumC74778TWk.FLOATING) {
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = C15380j0.LIZ(208.0f);
                    }
                } else {
                    int i = (int) (this.LJLIL.LJJIJIL().getLayoutParams().height * 0.11f);
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = i;
                    }
                }
            } else {
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(0);
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.topMargin = 0;
                    layoutParams2.gravity = 81;
                }
                InterfaceC12560eS interfaceC12560eS2 = this.LJLZ;
                if (interfaceC12560eS2 != null) {
                    ((C30659C1n) interfaceC12560eS2).LIZ(true);
                }
                if (this.LJLIL.LJJIJIL().getLayoutParams().height >= C15380j0.LIZ(76.0f)) {
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = C15380j0.LIZ(16.0f);
                    }
                } else if (layoutParams2 != null) {
                    layoutParams2.bottomMargin = C15380j0.LIZ(2.0f);
                }
            }
            Object obj5 = this.LJLZ;
            if ((obj5 instanceof View) && (view3 = (View) obj5) != null) {
                view3.setLayoutParams(layoutParams2);
            }
            Object obj6 = this.LJLZ;
            if ((obj6 instanceof View) && (view2 = (View) obj6) != null) {
                view2.bringToFront();
            }
            InterfaceC12560eS interfaceC12560eS3 = this.LJLZ;
            if (interfaceC12560eS3 != null) {
                interfaceC12560eS3.setClickAction(new AqS163S0100000_13(this, 750));
                return;
            }
            return;
        }
        Object obj7 = this.LJLZ;
        if (obj7 != null) {
            if (obj7 instanceof View) {
                view7 = (View) obj7;
            }
            if (C78996UzQ.LJJIIJZLJL(view7)) {
                C78996UzQ.LJI();
            }
            removeView(view7);
        }
    }

    public final boolean LJFF() {
        String LJJ = this.LJLIL.LJJ();
        boolean z = false;
        if (LJJ == null || LJJ.length() == 0) {
            return true;
        }
        Boolean LJIIJ = getMDataHolder().LJIIJ(LJJ);
        if (LJIIJ != null) {
            z = LJIIJ.booleanValue();
        }
        return !z;
    }

    public final void LJIIIIZZ() {
        View view;
        Object obj = this.LJLZ;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            TV3.LJIIJJI(view);
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(MuteMicViewStateChangeEvent.class, Boolean.TRUE);
        }
    }

    public final void LJIIL() {
        FrameLayout LJJIJIL;
        C32014ChO.LIZJ(LJI(495), "stopAd", null);
        C75360Ths c75360Ths = this.LJLLJ;
        if (c75360Ths != null) {
            c75360Ths.LIZ();
        }
        this.LJLLJ = null;
        if (this.LJLLL != null) {
            InterfaceC75179Tex interfaceC75179Tex = this.LJLLLL;
            if (interfaceC75179Tex != null && (LJJIJIL = interfaceC75179Tex.LJJIJIL()) != null) {
                C16880lQ.LJLLLL(this.LJLLL, LJJIJIL);
            }
            this.LJLLL = null;
        }
    }

    @Override // X.InterfaceC75252Tg8
    public final String LJJ() {
        InterfaceC75179Tex interfaceC75179Tex = this.LJLIL;
        if (interfaceC75179Tex != null) {
            return interfaceC75179Tex.LJJ();
        }
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public String getLinkMicId() {
        return this.LJLIL.LJJ();
    }

    @Override // X.InterfaceC76717U8z
    public Integer getLogicPos() {
        return Integer.valueOf(this.LJLIL.LLLFFI());
    }

    public final MultiGuestDataHolder getMDataHolder() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mDataHolder");
        throw null;
    }

    @Override // X.InterfaceC76717U8z
    public Integer getUiPos() {
        return Integer.valueOf(this.LJLIL.LJZ());
    }

    @Override // X.InterfaceC76717U8z
    public Long getUid() {
        return Long.valueOf(this.LJLIL.LJJIIJZLJL());
    }

    public final boolean LIZJ() {
        Boolean bool;
        if (getMDataHolder().LJJIIZ != EnumC74778TWk.FLOATING_FIX) {
            ZoomService zoomService = getZoomService();
            if (zoomService != null) {
                bool = Boolean.valueOf(zoomService.LJII());
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
    
        if (r10 == null) goto L67;
     */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.W5O, REQUEST] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75358Thq.LJIIIZ():void");
    }

    public final void LJIIJ() {
        View LIZIZ = LIZIZ(R.id.hay);
        if (LIZIZ != null) {
            C29306Beo.LJJLJLI(LIZIZ);
        }
        View LIZIZ2 = LIZIZ(R.id.hb_);
        if (LIZIZ2 != null) {
            C29306Beo.LJJLJLI(LIZIZ2);
        }
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        if (LIZJ == EnumC74778TWk.GRID || LIZJ == EnumC74778TWk.GRID_FIX) {
            View LIZIZ3 = LIZIZ(R.id.hb_);
            if (LIZIZ3 != null) {
                ViewGroup.LayoutParams layoutParams = LIZIZ3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C15380j0.LIZ(36.0f);
                }
                if (LIZIZ3 == null) {
                    return;
                }
                LIZIZ3.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        View LIZIZ4 = LIZIZ(R.id.hb_);
        if (LIZIZ4 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = LIZIZ4.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = C15380j0.LIZ(30.0f);
        }
        if (LIZIZ4 == null) {
            return;
        }
        LIZIZ4.setLayoutParams(layoutParams2);
    }

    public final void LJIILJJIL() {
        Boolean bool;
        InterfaceC75441TjB R6;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        LJIILIIL(Boolean.valueOf(LJFF()));
        ZoomService zoomService = getZoomService();
        if (zoomService != null) {
            bool = Boolean.valueOf(zoomService.LJII());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LJIIJ();
            return;
        }
        if (1 == MultiGuestV3AddHostTag.getValue() && (C59994Ngc.LIZJ() == EnumC74778TWk.GRID_FIX || C59994Ngc.LIZJ() == EnumC74778TWk.FLOATING_FIX || (C59994Ngc.LIZJ() == EnumC74778TWk.GRID && (R6 = C8E.LJ().R6()) != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null && LJJIIZI.size() > 1))) {
            LJIIJ();
            return;
        }
        View LIZIZ = LIZIZ(R.id.hay);
        if (LIZIZ != null) {
            C29306Beo.LJI(LIZIZ);
        }
        View LIZIZ2 = LIZIZ(R.id.hb_);
        if (LIZIZ2 == null) {
            return;
        }
        C29306Beo.LJI(LIZIZ2);
    }

    public final void LJIILL() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams c018905p;
        C018905p c018905p2;
        C74947TbD.LJJII(Long.valueOf(C74947TbD.LJIIIIZZ()), this.LJLILLLLZI, this.LJLIL, (C47061t0) LIZIZ(R.id.hb1));
        View LIZIZ = LIZIZ(R.id.hb1);
        ViewGroup.LayoutParams layoutParams3 = null;
        if (LIZIZ != null) {
            layoutParams = LIZIZ.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C018905p) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        View LIZIZ2 = LIZIZ(R.id.hba);
        if (LIZIZ2 != null) {
            layoutParams2 = LIZIZ2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (!(layoutParams2 instanceof C018905p) || (c018905p = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            c018905p = new C018905p(0, 0);
        }
        int i = (int) (marginLayoutParams.width * 1.6f);
        c018905p.width = i;
        c018905p.height = i;
        c018905p.bottomMargin = marginLayoutParams.bottomMargin;
        C47061t0 c47061t0 = (C47061t0) LIZIZ(R.id.hba);
        if (c47061t0 != null) {
            c47061t0.setLayoutParams(c018905p);
        }
        View LIZIZ3 = LIZIZ(R.id.m35);
        if (LIZIZ3 != null) {
            layoutParams3 = LIZIZ3.getLayoutParams();
        }
        if (!(layoutParams3 instanceof C018905p) || (c018905p2 = (C018905p) layoutParams3) == null) {
            return;
        }
        c018905p2.leftToLeft = R.id.hb1;
        c018905p2.rightToRight = R.id.hb1;
        c018905p2.topToTop = R.id.hb1;
        c018905p2.bottomToBottom = R.id.hb1;
        ((ViewGroup.MarginLayoutParams) c018905p2).width = marginLayoutParams.width;
        ((ViewGroup.MarginLayoutParams) c018905p2).height = marginLayoutParams.height;
        C41541k6 c41541k6 = (C41541k6) LIZIZ(R.id.m35);
        if (c41541k6 == null) {
            return;
        }
        c41541k6.setLayoutParams(c018905p2);
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getAudioMute() {
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null) {
            return mDataHolder.LIZJ(getLinkMicId());
        }
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public int getH() {
        return getHeight();
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getVideoMute() {
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null) {
            return mDataHolder.LJIIJ(getLinkMicId());
        }
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getX() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getLeft();
        }
        return -1;
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getY() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getTop();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01dd, code lost:
    
        if (r0.intValue() == 2) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75358Thq.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DataChannel dataChannel;
        super.onDetachedFromWindow();
        C75378TiA talkVolumeWaveHandler = getTalkVolumeWaveHandler();
        C73411SrX c73411SrX = talkVolumeWaveHandler.LIZLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        talkVolumeWaveHandler.LIZLLL = null;
        C0NB.LJIIIZ("MultiGuestV3AnchorMask", "stopAdByDetach");
        C75360Ths c75360Ths = this.LJLLJ;
        if (c75360Ths != null) {
            c75360Ths.LIZ();
        }
        this.LJLLJ = null;
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.pv0(MultiGuestAdStopEvent.class);
        }
        this.LJLZ = null;
        DataChannel dataChannel3 = this.LJLILLLLZI;
        if (dataChannel3 != null) {
            dataChannel3.jv0(this);
        }
        if (LinkmicAnchorClickOptimizeSetting.INSTANCE.enable() && (dataChannel = this.LJLILLLLZI) != null) {
            dataChannel.rv0(MultiGuestAnchorMaskTouchEventChannel.class, null);
        }
        C76846UDy c76846UDy = this.LJLJLJ;
        if (c76846UDy != null) {
            c76846UDy.LIZJ(this);
        }
        this.LJLJJI = false;
        this.LJLJJL = false;
    }

    public final DataChannel getMDataChannel() {
        return this.LJLILLLLZI;
    }

    public final boolean getMIsNormalAudience() {
        return this.LJLJI;
    }

    public final InterfaceC75179Tex getWindow() {
        return this.LJLIL;
    }

    public static final String LJI(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_MultiGuestV3AnchorMask_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_MultiGuestV3AnchorMask_", i, LIZ2);
    }

    @Override // X.InterfaceC30431Bwx
    public final boolean LIZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if ((LIZLLL() || LIZJ()) && C74947TbD.LJIL(event, this)) {
            return true;
        }
        return false;
    }

    public final void LJII(String str) {
        boolean z;
        Boolean bool;
        Boolean bool2;
        boolean z2;
        MultiGuestSoundWaveBorderSetting multiGuestSoundWaveBorderSetting = MultiGuestSoundWaveBorderSetting.INSTANCE;
        String str2 = "audio";
        String str3 = "";
        if (!multiGuestSoundWaveBorderSetting.isBorderWithoutAvatarWave()) {
            String LJJ = this.LJLIL.LJJ();
            if (LJJ == null) {
                LJJ = "";
            }
            Boolean LIZJ = getMDataHolder().LIZJ(LJJ);
            if (LIZJ != null) {
                z2 = LIZJ.booleanValue();
            } else {
                z2 = false;
            }
            View LIZIZ = LIZIZ(R.id.hb1);
            if (LIZIZ != null && LIZIZ.getVisibility() == 0 && !z2) {
                if (getTalkVolumeWaveHandler().LIZIZ(getMDataHolder().LJIIIZ(LJJ))) {
                    C74787TWt LIZ = C74786TWs.LIZ(str);
                    LIZ.LIZ(C74947TbD.LJIIIIZZ(), "anchor", "audio");
                    C74786TWs.LIZIZ(LIZ);
                }
            } else {
                getTalkVolumeWaveHandler().LIZJ = true;
                ImageView imageView = (ImageView) LIZIZ(R.id.hba);
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }
        if (multiGuestSoundWaveBorderSetting.isBorderWithoutAvatarWave() || multiGuestSoundWaveBorderSetting.isBorderWithAvatarWave()) {
            String LJJ2 = this.LJLIL.LJJ();
            if (LJJ2 != null) {
                str3 = LJJ2;
            }
            Boolean LIZJ2 = getMDataHolder().LIZJ(str3);
            if (LIZJ2 != null) {
                z = LIZJ2.booleanValue();
            } else {
                z = false;
            }
            if (z || this.LJLJJLL) {
                View LIZIZ2 = LIZIZ(R.id.a4s);
                if (LIZIZ2 != null) {
                    C87277YNd.LJJIIZ(LIZIZ2);
                    return;
                }
                return;
            }
            EnumC74778TWk LIZJ3 = C59994Ngc.LIZJ();
            Boolean bool3 = null;
            if (LIZJ3 == EnumC74778TWk.FLOATING || LIZJ3 == EnumC74778TWk.FLOATING_FIX) {
                ZoomService zoomService = getZoomService();
                if (zoomService != null) {
                    bool = Boolean.valueOf(zoomService.LIZJ());
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    ZoomService zoomService2 = getZoomService();
                    if (zoomService2 != null) {
                        bool2 = Boolean.valueOf(zoomService2.LJIIIIZZ(this.LJLIL.LJJ()));
                    } else {
                        bool2 = null;
                    }
                    if (C29306Beo.LJJIFFI(bool2)) {
                        View LIZIZ3 = LIZIZ(R.id.a4s);
                        if (LIZIZ3 == null) {
                            return;
                        }
                        C87277YNd.LJJIIZ(LIZIZ3);
                        return;
                    }
                } else {
                    View LIZIZ4 = LIZIZ(R.id.a4s);
                    if (LIZIZ4 == null) {
                        return;
                    }
                    C87277YNd.LJJIIZ(LIZIZ4);
                    return;
                }
            }
            if (LIZJ3 == EnumC74778TWk.GRID || LIZJ3 == EnumC74778TWk.NORMAL) {
                ZoomService zoomService3 = getZoomService();
                if (zoomService3 != null) {
                    bool3 = Boolean.valueOf(zoomService3.LIZJ());
                }
                if (C29306Beo.LJIILLIIL(bool3) && getMDataHolder().LJIILIIL == 0) {
                    View LIZIZ5 = LIZIZ(R.id.a4s);
                    if (LIZIZ5 == null) {
                        return;
                    }
                    C87277YNd.LJJIIZ(LIZIZ5);
                    return;
                }
            }
            if (!getTalkVolumeWaveHandler().LIZJ(getMDataHolder().LJIIIZ(str3), new AqS163S0100000_13(this, 754))) {
                return;
            }
            View LIZIZ6 = LIZIZ(R.id.a4s);
            if (LIZIZ6 != null) {
                C87277YNd.LJJIJ(LIZIZ6);
            }
            C74787TWt LIZ2 = C74786TWs.LIZ(str);
            long LJIIIIZZ = C74947TbD.LJIIIIZZ();
            View LIZIZ7 = LIZIZ(R.id.hb1);
            if (LIZIZ7 == null || LIZIZ7.getVisibility() != 0) {
                str2 = "video";
            }
            LIZ2.LIZ(LJIIIIZZ, "anchor", str2);
            C74786TWs.LIZIZ(LIZ2);
        }
    }

    public final void LJIILIIL(Boolean bool) {
        if (this.LJLJJLL) {
            return;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            ImageView imageView = (ImageView) LIZIZ(R.id.hb1);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) LIZIZ(R.id.hb4);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            View LIZIZ = LIZIZ(R.id.m35);
            if (LIZIZ == null) {
                return;
            }
            LIZIZ.setVisibility(8);
            return;
        }
        LJIILL();
        LJIIIZ();
    }

    @Override // X.InterfaceC75252Tg8
    public final void LJJI(boolean z) {
        Animator pauseAlphaOutAnimation;
        DataChannel dataChannel;
        if (this.LJLJJLL == z) {
            return;
        }
        this.LJLJJLL = z;
        if (z) {
            if (LIZIZ(R.id.a3b) != null) {
                C15540jG c15540jG = new C15540jG();
                C47061t0 anchor_pause_image = (C47061t0) LIZIZ(R.id.a3b);
                o.LJIIIIZZ(anchor_pause_image, "anchor_pause_image");
                c15540jG.LIZ = anchor_pause_image;
                c15540jG.LIZIZ = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                c15540jG.LIZJ = "ttlive_pause_live_anim.webp";
                c15540jG.LJFF = true;
                C15490jB.LJI(c15540jG);
            }
            LJIIIZ();
            View LIZIZ = LIZIZ(R.id.hb1);
            if (LIZIZ != null) {
                C87277YNd.LJJIIZ(LIZIZ);
            }
            View LIZIZ2 = LIZIZ(R.id.a3a);
            if (LIZIZ2 != null) {
                C87277YNd.LJJIJ(LIZIZ2);
            }
            View LIZIZ3 = LIZIZ(R.id.a4s);
            if (LIZIZ3 != null) {
                C87277YNd.LJJIIZ(LIZIZ3);
            }
            Animator pauseAlphaInAnimation = getPauseAlphaInAnimation();
            if (pauseAlphaInAnimation != null) {
                pauseAlphaInAnimation.start();
            }
            if (LiveSdkMultiGuestPauseViewDiffFixSetting.INSTANCE.isFix() && this.LJLJI && C74838TYs.LJ().LJJ > 0 && (dataChannel = this.LJLILLLLZI) != null) {
                dataChannel.pv0(MultiGuestPauseViewShowEvent.class);
                return;
            }
            return;
        }
        View LIZIZ4 = LIZIZ(R.id.a3a);
        if (LIZIZ4 != null && true == C29306Beo.LJJIIJ(LIZIZ4) && (pauseAlphaOutAnimation = getPauseAlphaOutAnimation()) != null) {
            pauseAlphaOutAnimation.start();
        }
        LJIILIIL(Boolean.valueOf(LJFF()));
    }

    @Override // X.InterfaceC75252Tg8
    public final void LJJIFFI(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[VideoState] call mask switchAnchorVideo ");
        LIZ.append(z);
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "AnchorMask");
        LJIILIIL(Boolean.valueOf(!z));
    }

    public final void LJJIJ(InterfaceC75179Tex linkMicWindow) {
        o.LJIIIZ(linkMicWindow, "linkMicWindow");
        TV3.LJIIJJI(this);
        this.LJLLLL = linkMicWindow;
        linkMicWindow.LJJIJIL().addView(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        View view;
        super.dispatchDraw(canvas);
        if (C30922CBq.LIZIZ) {
            OSZ osz = new OSZ(Boolean.valueOf(C29306Beo.LJIILLIIL(getVideoMute())), Boolean.valueOf(C29306Beo.LJIILLIIL(getAudioMute())));
            if (canvas != null) {
                if (((Boolean) osz.getFirst()).booleanValue() != C29306Beo.LJJIIJ(LIZIZ(R.id.hb1))) {
                    boolean booleanValue = ((Boolean) osz.getSecond()).booleanValue();
                    Object obj = this.LJLZ;
                    if (obj instanceof View) {
                        view = (View) obj;
                    } else {
                        view = null;
                    }
                    if (booleanValue != C29306Beo.LJJIIJ(view)) {
                        z = false;
                        TBH.LIZIZ(canvas, osz, z);
                    }
                }
                z = true;
                TBH.LIZIZ(canvas, osz, z);
            }
        }
    }

    public final void setMDataChannel(DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
    }

    public final void setMDataHolder(MultiGuestDataHolder multiGuestDataHolder) {
        o.LJIIIZ(multiGuestDataHolder, "<set-?>");
        this.mDataHolder = multiGuestDataHolder;
    }

    public final void setMIsNormalAudience(boolean z) {
        this.LJLJI = z;
    }

    public final void setWindow(InterfaceC75179Tex interfaceC75179Tex) {
        o.LJIIIZ(interfaceC75179Tex, "<set-?>");
        this.LJLIL = interfaceC75179Tex;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75358Thq(Context context, InterfaceC75179Tex window, DataChannel dataChannel, boolean z) {
        super(context);
        o.LJIIIZ(window, "window");
        this.LL = new LinkedHashMap();
        this.LJLIL = window;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = z;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 753));
        this.LJLL = new C31657Cbd("ZOOM_SERVICE");
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 751));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 752));
        this.LJZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 747));
        this.LJZI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 749));
        this.LJZL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 748));
        C75559Tl5.LIZIZ.LIZLLL(this);
        ActivityC45651qj LIZJ = C29306Beo.LIZJ(context);
        if (LIZJ != null) {
            FrameLayout.inflate(LIZJ, R.layout.dkg, this);
        }
    }

    public final void LJIIJJI(String adId, int i, int i2, float f, String str) {
        Boolean bool;
        FrameLayout LJJIJIL;
        String LJI = LJI(461);
        StringBuilder LJ = AnonymousClass028.LJ("startAd adId:", adId, ", duration:", i, ", playTimes:");
        LJ.append(i2);
        LJ.append(", seekProgress:");
        LJ.append(f);
        LJ.append(", url:");
        LJ.append(str);
        TextureView textureView = null;
        C32014ChO.LIZJ(LJI, X1D.LIZIZ(LJ), null);
        boolean z = false;
        if (str.length() == 0 || i <= 0 || i2 <= 0) {
            return;
        }
        if (this.LJLLL == null) {
            Context context = getContext();
            if (context != null) {
                textureView = new TextureView(context);
            }
            this.LJLLL = textureView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            TextureView textureView2 = this.LJLLL;
            if (textureView2 != null) {
                textureView2.setLayoutParams(layoutParams);
            }
            C0NB.LIZIZ("MultiGuestV3AnchorMask", "startAd create and add adRenderView");
        }
        TextureView textureView3 = this.LJLLL;
        if (textureView3 == null) {
            return;
        }
        InterfaceC75179Tex interfaceC75179Tex = this.LJLLLL;
        if (interfaceC75179Tex != null && (LJJIJIL = interfaceC75179Tex.LJJIJIL()) != null) {
            LJJIJIL.addView(this.LJLLL);
        }
        if (this.LJLLJ == null) {
            this.LJLLJ = new C75360Ths();
        }
        C75360Ths c75360Ths = this.LJLLJ;
        if (c75360Ths == null) {
            return;
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        }
        C75363Thv c75363Thv = new C75363Thv(this);
        o.LJIIIZ(adId, "adId");
        StringBuilder LJ2 = AnonymousClass028.LJ("start play ad, adId:", adId, ", duration:", i, ", playTimes:");
        LJ2.append(i2);
        LJ2.append(", seekProgress:");
        LJ2.append(f);
        LJ2.append(", url:");
        JBR.LJIIJ(LJ2, str, LJ2, "MultiGuestAdPlayer");
        c75360Ths.LIZIZ = adId;
        c75360Ths.LIZJ = z;
        c75360Ths.LIZLLL = i2;
        c75360Ths.LJI = c75363Thv;
        InterfaceC75370Ti2 interfaceC75370Ti2 = c75360Ths.LIZ;
        if (interfaceC75370Ti2 != null) {
            interfaceC75370Ti2.pause();
        }
        if (c75360Ths.LIZ == null) {
            c75360Ths.LIZ = ((IHostWatch) CN1.LIZ(IHostWatch.class)).getVideoCleanPlayerController(textureView3, str, i, null, "multi_guest_ad", c75360Ths.LJII);
        }
        InterfaceC75370Ti2 interfaceC75370Ti22 = c75360Ths.LIZ;
        if (interfaceC75370Ti22 != null) {
            interfaceC75370Ti22.start();
        }
        InterfaceC75370Ti2 interfaceC75370Ti23 = c75360Ths.LIZ;
        if (interfaceC75370Ti23 == null) {
            return;
        }
        interfaceC75370Ti23.LJJIIJ(f);
    }
}

package X;

import Y.ARunnableS10S1300000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDComparatorS41S0000000_13;
import Y.IDObjectS0S0101000;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PlayerData;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLinkLayoutDividerOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostDividerSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3MaskViewRemoveOptSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76696U8e extends AbstractC75858Tpu implements InterfaceC88471Ynr<AbstractC76785UBp, InterfaceC88472Yns<? super String, ? extends C76737U9t>, C76800UCe> {
    public final U8P LJLJJLL;
    public final C76703U8l LJLJL;
    public final U8M LJLJLJ;
    public final InterfaceC76112Tu0 LJLJLLL;
    public LayoutSlardarMonitor LJLL;
    public final ArrayList<C76699U8h> LJLLI;
    public final FrameLayout LJLLILLLL;
    public final int LJLLJ;
    public final boolean LJLLL;
    public final C62822Ol8 LJLLLL;
    public String LJLLLLLL;
    public final Paint LJLZ;
    public final PorterDuffXfermode LJZ;
    public final Paint LJZI;
    public final Path LJZL;
    public int LL;

    public final InterfaceC88471Ynr<AbstractC76785UBp, InterfaceC88472Yns<? super String, C76737U9t>, C76800UCe> getActionCallback() {
        return this;
    }

    @Override // X.InterfaceC75787Tol
    public final boolean LIZ() {
        Layout LIZJ = this.LJLJL.LIZJ(false);
        if (LIZJ != null) {
            return LIZJ.isNormalType();
        }
        return true;
    }

    @Override // X.T2K, X.InterfaceC30717C3t
    public final boolean LIZIZ() {
        return this.LJLJL.LJIIIZ();
    }

    public final boolean LJIIIIZZ() {
        boolean z = this.LJLLL;
        if (z) {
            if (getMActualShowAreaInWindow().width() == getMAllAreaInWindow().width() && getMActualShowAreaInWindow().height() == getMAllAreaInWindow().height()) {
                return false;
            }
        } else if (!z) {
            if (getMActualShowAreaInWindow().width() == getWidth() && getMActualShowAreaInWindow().height() == getHeight()) {
                return false;
            }
        } else {
            throw new C162476Zf();
        }
        return true;
    }

    @Override // X.AbstractC75858Tpu, X.InterfaceC75787Tol
    public Rect getContainerActualRange() {
        Rect rect = new Rect();
        rect.left = getMActualShowAreaInWindow().left + getMAllAreaInWindow().left;
        rect.top = getMActualShowAreaInWindow().top + getMAllAreaInWindow().top;
        rect.right = getMActualShowAreaInWindow().width() + rect.left;
        rect.bottom = getMActualShowAreaInWindow().height() + rect.top;
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC75858Tpu, X.InterfaceC75787Tol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getLayoutBusinessType() {
        /*
            r2 = this;
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3LayoutQueryOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3LayoutQueryOptSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L1e
            X.U8l r1 = r2.LJLJL
            r0 = 0
            com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r0 = r1.LIZJ(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.getBusinessType()
        L15:
            if (r0 != 0) goto L1d
        L17:
            X.Tbv r0 = X.EnumC74991Tbv.NORMAL
            java.lang.String r0 = r0.getBusinessType()
        L1d:
            return r0
        L1e:
            java.lang.String r1 = r2.getLayoutId()
            if (r1 == 0) goto L17
            X.U8P r0 = r2.LJLJJLL
            X.U8H r0 = r0.LIZ
            com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout r0 = r0.LJIILIIL
            if (r0 == 0) goto L17
            java.util.Map r0 = r0.getBusinessSceneMap()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76696U8e.getLayoutBusinessType():java.lang.String");
    }

    @Override // X.AbstractC75858Tpu, X.InterfaceC75787Tol
    public String getLayoutId() {
        Layout LIZJ = this.LJLJL.LIZJ(false);
        if (LIZJ != null) {
            return LIZJ.getLayoutId();
        }
        return null;
    }

    public final UA1 getLayoutMixer() {
        return (UA1) this.LJLLLL.getValue();
    }

    @Override // X.AbstractC75858Tpu
    public Integer getLayoutScene() {
        Layout LIZJ = this.LJLJL.LIZJ(false);
        if (LIZJ != null) {
            return Integer.valueOf(LIZJ.getScene());
        }
        return null;
    }

    @Override // X.AbstractC75858Tpu, X.InterfaceC75787Tol
    public Rect getContainerAllRange() {
        return getMAllAreaInWindow();
    }

    @Override // X.AbstractC75858Tpu, X.InterfaceC75787Tol
    public String getLayoutName() {
        return C45804HyK.LJI(getLayoutBusinessType()).name();
    }

    @Override // X.AbstractC75858Tpu, X.InterfaceC75787Tol
    public Rect getPlayerRange() {
        return getMPlayerAreaRect();
    }

    public final String getTAG() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("linker_layout_sdk_LayoutView");
        LIZ.append(this.LJLLJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC75858Tpu, X.InterfaceC75787Tol
    public List<InterfaceC75179Tex> getAllLayoutWindows() {
        return this.LJLLI;
    }

    public final String getCurrentDrawLayoutId() {
        return this.LJLLLLLL;
    }

    public final FrameLayout getInteractLayer() {
        return this.LJLLILLLL;
    }

    public final int getMOffsetY() {
        return this.LL;
    }

    public final Path getPath() {
        return this.LJZL;
    }

    @Override // X.AbstractC75858Tpu
    public String getRealDrawLayoutId() {
        return this.LJLLLLLL;
    }

    public final ArrayList<C76699U8h> getWindowList() {
        return this.LJLLI;
    }

    public static final String LJIIIZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_LayoutView_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_LayoutView_", i, LIZ2);
    }

    public static FrameLayout.LayoutParams LJIILIIL(Rect rect) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.OQg] */
    public final void LIZLLL(Layout layout) {
        int i;
        ?? r8;
        List<RectF> divideList;
        RectF rectF;
        o.LJIIIZ(layout, "layout");
        U8P u8p = this.LJLJJLL;
        C76712U8u c76712U8u = u8p.LJ;
        List<RectF> list = null;
        if (c76712U8u.LIZ) {
            int LJIIIIZZ = u8p.LIZJ.LJIIIIZZ();
            Rect actualShowAreaInWindow = getMActualShowAreaInWindow();
            o.LJIIIZ(actualShowAreaInWindow, "actualShowAreaInWindow");
            LayoutArrayList layoutMaskConfigListByOnlineMicCount = layout.getLayoutMaskConfigListByOnlineMicCount(LJIIIIZZ);
            if (layoutMaskConfigListByOnlineMicCount != null) {
                list = layoutMaskConfigListByOnlineMicCount.getDivideList();
            }
            c76712U8u.LJFF = 0.0f;
            c76712U8u.LJI = 0.0f;
            if (list != null) {
                for (RectF rectF2 : list) {
                    if (rectF2.width() > rectF2.height()) {
                        float f = c76712U8u.LJI;
                        float height = rectF2.height();
                        if (f < height) {
                            f = height;
                        }
                        c76712U8u.LJI = f;
                    } else {
                        float f2 = c76712U8u.LJFF;
                        float width = rectF2.width();
                        if (f2 < width) {
                            f2 = width;
                        }
                        c76712U8u.LJFF = f2;
                    }
                }
            }
            c76712U8u.LJFF *= actualShowAreaInWindow.width();
            c76712U8u.LJI *= actualShowAreaInWindow.height();
            setWillNotDraw(false);
            return;
        }
        this.LJZL.reset();
        if (layout.getScene() == 2 && !this.LJLJL.LJIIIZ() && !MultiHostDividerSettings.INSTANCE.getValue().enable) {
            setWillNotDraw(false);
            return;
        }
        U8P u8p2 = this.LJLJJLL;
        Rect showContainerAllArea = getMAllAreaInWindow();
        u8p2.getClass();
        o.LJIIIZ(showContainerAllArea, "showContainerAllArea");
        if (layout.isNormalType()) {
            r8 = C61878OQg.INSTANCE;
        } else {
            LayoutArrayList layoutMaskConfigListByOnlineMicCount2 = layout.getLayoutMaskConfigListByOnlineMicCount(u8p2.LIZJ.LJIIIIZZ());
            if (layoutMaskConfigListByOnlineMicCount2 == null || (divideList = layoutMaskConfigListByOnlineMicCount2.getDivideList()) == null) {
                String LJIIIZ = U8P.LJIIIZ(51);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getAllLineRect return as can't find divideList micCount = ");
                Layout LIZJ = u8p2.LIZIZ.LIZJ(false);
                if (LIZJ != null) {
                    i = LIZJ.getMicCount();
                } else {
                    i = 1;
                }
                LIZ.append(i);
                LIZ.append('!');
                C32014ChO.LIZJ(LJIIIZ, X1D.LIZIZ(LIZ), null);
                r8 = C61878OQg.INSTANCE;
            } else {
                r8 = new ArrayList();
                for (RectF rectF3 : divideList) {
                    if (rectF3 == null) {
                        C32014ChO.LIZJ(U8P.LJIIIZ(79), "createLayoutParamsByData return as  layoutArray is null", null);
                        rectF = new RectF();
                    } else {
                        rectF = new RectF();
                        rectF.left = rectF3.left * showContainerAllArea.width();
                        rectF.top = rectF3.top * showContainerAllArea.height();
                        float f3 = 1;
                        rectF.right = (rectF3.width() * showContainerAllArea.width()) + rectF.left + f3;
                        rectF.bottom = (rectF3.height() * showContainerAllArea.height()) + rectF.top + f3;
                        String LJIIIZ2 = U8P.LJIIIZ(88);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("createLayoutParamsByData newRect = ");
                        LIZ2.append(rectF);
                        C32014ChO.LJFF(LJIIIZ2, X1D.LIZIZ(LIZ2));
                    }
                    r8.add(rectF);
                }
            }
        }
        if (r8.isEmpty()) {
            setWillNotDraw(true);
            return;
        }
        setWillNotDraw(false);
        for (RectF rectF4 : r8) {
            Path path = this.LJZL;
            boolean LJIIIIZZ2 = LJIIIIZZ();
            if (LJIIIIZZ2) {
                rectF4.intersect(new RectF(getMActualShowAreaInWindow()));
            } else if (LJIIIIZZ2) {
                throw new C162476Zf();
            }
            String LJIIIZ3 = LJIIIZ(285);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(getTAG());
            LIZ3.append(":line rect = ");
            LIZ3.append(rectF4);
            C32014ChO.LIZ(LJIIIZ3, X1D.LIZIZ(LIZ3));
            path.addRect(rectF4, Path.Direction.CCW);
        }
    }

    public final InterfaceC75179Tex LJI(String linkMicId) {
        C76699U8h c76699U8h;
        o.LJIIIZ(linkMicId, "linkMicId");
        String LJIIIZ = LJIIIZ(507);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getTAG());
        LIZ.append(":getWindowByLinkMicId:");
        LIZ.append(linkMicId);
        C32014ChO.LIZ(LJIIIZ, X1D.LIZIZ(LIZ));
        Iterator<C76699U8h> it = this.LJLLI.iterator();
        while (true) {
            if (it.hasNext()) {
                c76699U8h = it.next();
                if (o.LJ(c76699U8h.LJLJI.LJLIL.LIZJ, linkMicId)) {
                    break;
                }
            } else {
                c76699U8h = null;
                break;
            }
        }
        return c76699U8h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(PlayerData playerData) {
        LayoutSlardarMonitor.Player player;
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        Iterator<C76699U8h> it = this.LJLLI.iterator();
        while (true) {
            player = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<View> it2 = C78924UyG.LIZLLL(it.next().LJLJI.LJLILLLLZI).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it2;
                if (iDObjectS0S0101000.hasNext()) {
                    View view = (View) iDObjectS0S0101000.next();
                    if (view instanceof InterfaceC76717U8z) {
                        InterfaceC76717U8z interfaceC76717U8z = (InterfaceC76717U8z) view;
                        if (interfaceC76717U8z != null) {
                            Boolean audioMute = interfaceC76717U8z.getAudioMute();
                            if (audioMute != null) {
                                i = !audioMute.booleanValue() ? 1 : 0;
                            } else {
                                i = -1;
                            }
                            Boolean videoMute = interfaceC76717U8z.getVideoMute();
                            if (videoMute != null) {
                                i2 = !videoMute.booleanValue() ? 1 : 0;
                            } else {
                                i2 = -1;
                            }
                            int i5 = !interfaceC76717U8z.isEmpty() ? 1 : 0;
                            Long uid = interfaceC76717U8z.getUid();
                            if (uid != null) {
                                j = uid.longValue();
                            } else {
                                j = -1;
                            }
                            String linkMicId = interfaceC76717U8z.getLinkMicId();
                            if (linkMicId == null) {
                                linkMicId = "";
                            }
                            Integer uiPos = interfaceC76717U8z.getUiPos();
                            if (uiPos != null) {
                                i3 = uiPos.intValue();
                            } else {
                                i3 = -1;
                            }
                            Integer logicPos = interfaceC76717U8z.getLogicPos();
                            if (logicPos != null) {
                                i4 = logicPos.intValue();
                            } else {
                                i4 = -1;
                            }
                            arrayList.add(new LayoutSlardarMonitor.BizWindow(i5, j, linkMicId, i3, i4, i, i2, interfaceC76717U8z.getX(), interfaceC76717U8z.getY(), interfaceC76717U8z.getW(), interfaceC76717U8z.getH()));
                        }
                    }
                }
            }
        }
        LayoutSlardarMonitor layoutSlardarMonitor = this.LJLL;
        if (layoutSlardarMonitor != null) {
            if (playerData != null) {
                player = new LayoutSlardarMonitor.Player(playerData.getStreamW(), playerData.getStreamH(), playerData.getExceptedX(), playerData.getExceptedY(), playerData.getExceptedW(), playerData.getExceptedH(), playerData.getRealX(), playerData.getRealY(), playerData.getRealW(), playerData.getRealH());
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("linker_layout_sdk_LayoutView");
            LIZ.append(hashCode());
            String hash = X1D.LIZIZ(LIZ);
            o.LJIIIZ(hash, "hash");
            LayoutSlardarMonitor.LIZLLL(new ARunnableS10S1300000_13(layoutSlardarMonitor, arrayList, player, hash, 1));
        }
    }

    public final void LJIIL(C76699U8h c76699U8h) {
        SurfaceView LJLJJLL = c76699U8h.LJLJJLL();
        if (LJLJJLL != null) {
            FrameLayout frameLayout = this.LJLLILLLL;
            if (C78996UzQ.LJJIIJZLJL(LJLJJLL)) {
                C78996UzQ.LJI();
            }
            frameLayout.removeViewInLayout(LJLJJLL);
        }
        getLayoutMixer().LIZLLL(c76699U8h.LJLIL, c76699U8h.LJLILLLLZI, c76699U8h.LJLJI);
        try {
            FrameLayout frameLayout2 = this.LJLLILLLL;
            FrameLayout frameLayout3 = c76699U8h.LJLJI.LJLILLLLZI;
            if (C78996UzQ.LJJIIJZLJL(frameLayout3)) {
                C78996UzQ.LJI();
            }
            frameLayout2.removeViewInLayout(frameLayout3);
        } catch (NullPointerException e) {
            String LJIIIZ = LJIIIZ(479);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getTAG());
            LIZ.append(":removeViewInLayout throw npe:");
            LIZ.append(e);
            C32014ChO.LIZJ(LJIIIZ, X1D.LIZIZ(LIZ), null);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        C76712U8u c76712U8u = this.LJLJJLL.LJ;
        Canvas canvas2 = canvas;
        if (c76712U8u.LIZ) {
            ArrayList<C76699U8h> windowList = this.LJLLI;
            c76712U8u.getClass();
            o.LJIIIZ(windowList, "windowList");
            if (canvas2 != null) {
                int saveLayer = canvas2.saveLayer(getLeft(), getTop(), getWidth(), getHeight(), null);
                canvas2.drawColor(c76712U8u.LIZLLL.getColor());
                if (c76712U8u.LIZLLL.getColor() != c76712U8u.LIZJ.getColor()) {
                    Iterator<C76699U8h> it = windowList.iterator();
                    while (it.hasNext()) {
                        C76699U8h next = it.next();
                        ViewGroup.LayoutParams layoutParams4 = next.LJLJI.LJLILLLLZI.getLayoutParams();
                        if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams4) != null && !TextUtils.isEmpty(next.LJJ())) {
                            int i = layoutParams3.leftMargin;
                            float f = c76712U8u.LJFF;
                            int i2 = layoutParams3.topMargin;
                            float f2 = c76712U8u.LJI;
                            canvas2 = canvas2;
                            canvas2.drawRect(i - f, i2 - f2, f + i + layoutParams3.width, i2 + layoutParams3.height + f2, c76712U8u.LIZJ);
                        }
                    }
                }
                c76712U8u.LJII.setXfermode(c76712U8u.LJ);
                Iterator<C76699U8h> it2 = windowList.iterator();
                while (it2.hasNext()) {
                    ViewGroup.LayoutParams layoutParams5 = it2.next().LJLJI.LJLILLLLZI.getLayoutParams();
                    if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams5) != null) {
                        canvas2 = canvas2;
                        canvas2.drawRect(layoutParams2.leftMargin, layoutParams2.topMargin, r2 + layoutParams2.width, r1 + layoutParams2.height, c76712U8u.LJII);
                    }
                }
                c76712U8u.LJII.setXfermode(null);
                canvas2.restoreToCount(saveLayer);
            }
            super.onDraw(canvas2);
            return;
        }
        if (!LivesdkLinkmicLinkLayoutDividerOptimizeSetting.INSTANCE.getValue()) {
            super.onDraw(canvas2);
            if (canvas2 != null) {
                canvas2.drawPath(this.LJZL, this.LJLZ);
                return;
            }
            return;
        }
        if (!this.LJZL.isEmpty()) {
            if (canvas2 != null) {
                int saveLayer2 = canvas2.saveLayer(getLeft(), getTop(), getWidth(), getHeight(), null);
                canvas2.drawColor(-14873558);
                this.LJZI.setXfermode(this.LJZ);
                Iterator<C76699U8h> it3 = this.LJLLI.iterator();
                while (it3.hasNext()) {
                    ViewGroup.LayoutParams layoutParams6 = it3.next().LJLJI.LJLILLLLZI.getLayoutParams();
                    if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams6) != null) {
                        canvas2 = canvas2;
                        canvas2.drawRect(layoutParams.leftMargin, layoutParams.topMargin, r2 + layoutParams.width, r1 + layoutParams.height, this.LJZI);
                    }
                }
                this.LJZI.setXfermode(null);
                canvas2.restoreToCount(saveLayer2);
            }
            super.onDraw(canvas2);
            return;
        }
        super.onDraw(canvas2);
        if (canvas2 == null) {
            return;
        }
        canvas2.drawPath(this.LJZL, this.LJLZ);
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
        this.LJLLILLLL.setClipChildren(z);
        Iterator<C76699U8h> it = this.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJLJI.LJLILLLLZI.setClipChildren(z);
        }
    }

    public final void setCurrentDrawLayoutId(String str) {
        this.LJLLLLLL = str;
    }

    public void setDividerType(int i) {
        int i2 = EnumC75250Tg6.DIVIDER_TYPE_SHARED_BG.type;
        if (i == i2) {
            C76712U8u c76712U8u = this.LJLJJLL.LJ;
            c76712U8u.LIZ = true;
            if (i == EnumC75250Tg6.DIVIDER_TYPE_NORMAL.type) {
                c76712U8u.LIZJ.setColor(ColorProtector.parseColor("#FF1D0C2A"));
                c76712U8u.LIZLLL.setColor(ColorProtector.parseColor("#FF1D0C2A"));
            } else if (i == i2) {
                c76712U8u.LIZJ.setColor(ColorProtector.parseColor("#57FFFFFF"));
                c76712U8u.LIZLLL.setColor(ColorProtector.parseColor("#57FFFFFF"));
            } else if (i == EnumC75250Tg6.DIVIDER_TYPE_TEST.type) {
                c76712U8u.LIZJ.setColor(ColorProtector.parseColor("#FFFF0000"));
                c76712U8u.LIZLLL.setColor(ColorProtector.parseColor("#FFFFFFFF"));
            } else {
                c76712U8u.LIZ = false;
            }
        } else {
            this.LJLJJLL.LJ.LIZ = false;
        }
        LJIIJJI(U9O.ChangeDivider, false, null);
        postInvalidate();
    }

    public final void setMOffsetY(int i) {
        this.LL = i;
    }

    public final void LIZJ(View view, boolean z) {
        FrameLayout frameLayout;
        View findViewWithTag;
        FrameLayout frameLayout2;
        ViewGroup viewGroup;
        if (view == null) {
            return;
        }
        if ((view instanceof SurfaceView) && view.getParent() != null && !(view.getParent() instanceof InterfaceC75787Tol)) {
            return;
        }
        if (view instanceof FrameLayout) {
            ((ViewGroup) view).setClipChildren(getClipChildren());
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(view, viewGroup);
        }
        if (MultiGuestV3MaskViewRemoveOptSetting.INSTANCE.getValue() && (frameLayout = this.LJLLILLLL) != null && (findViewWithTag = frameLayout.findViewWithTag(view.getTag())) != null && (frameLayout2 = this.LJLLILLLL) != null) {
            C16880lQ.LJLLLL(findViewWithTag, frameLayout2);
        }
        try {
            if (z) {
                this.LJLLILLLL.addView(view, 0);
                return;
            }
            if (view instanceof SurfaceView) {
                ((SurfaceView) view).setZOrderMediaOverlay(true);
            }
            this.LJLLILLLL.addView(view);
        } catch (IllegalStateException unused) {
        }
    }

    public void LJII(AbstractC76785UBp actionType, InterfaceC88472Yns<? super String, C76737U9t> interfaceC88472Yns) {
        o.LJIIIZ(actionType, "actionType");
        if (actionType instanceof UBP) {
            C29306Beo.LJJJ(new AqS163S0100000_13(this, 497));
            LJIIJJI(U9O.UpdateWindow, false, interfaceC88472Yns);
            if (getParent() != null) {
                post(new ARunnableS49S0100000_13(this, 213));
                return;
            }
            return;
        }
        if (!(actionType instanceof UBO)) {
            return;
        }
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 498));
        LJIIJJI(U9O.SwitchLayout, true, interfaceC88472Yns);
        post(new ARunnableS49S0100000_13(this, 214));
        if (getParent() == null) {
            return;
        }
        post(new ARunnableS49S0100000_13(this, 215));
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(AbstractC76785UBp abstractC76785UBp, InterfaceC88472Yns<? super String, ? extends C76737U9t> interfaceC88472Yns) {
        LJII(abstractC76785UBp, interfaceC88472Yns);
        return C76800UCe.LIZ;
    }

    public final void LJIIJJI(U9O u9o, boolean z, InterfaceC88472Yns<? super String, C76737U9t> interfaceC88472Yns) {
        ArrayList arrayList;
        LayoutSlardarMonitor layoutSlardarMonitor;
        LayoutSlardarMonitor layoutSlardarMonitor2;
        Layout LIZ = this.LJLJJLL.LIZ();
        if (LIZ == null) {
            String LJIIIZ = LJIIIZ(186);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(getTAG());
            LIZ2.append(":refresh return layout is null,please check");
            C32014ChO.LIZJ(LJIIIZ, X1D.LIZIZ(LIZ2), null);
            return;
        }
        setMIsNeedIntercept(true);
        String LJIIIZ2 = LJIIIZ(190);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(getTAG());
        LIZ3.append(":refresh actionType = ");
        LIZ3.append(u9o);
        LIZ3.append(" needUpdateState = ");
        LIZ3.append(z);
        C32014ChO.LJFF(LJIIIZ2, X1D.LIZIZ(LIZ3));
        if (u9o == U9O.SwitchLayout) {
            this.LJLLI.clear();
            try {
                this.LJLLILLLL.removeAllViewsInLayout();
            } catch (NullPointerException e) {
                String LJIIIZ3 = LJIIIZ(222);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(getTAG());
                LIZ4.append(":removeAllViewsInLayout throw npe:");
                LIZ4.append(e);
                C32014ChO.LIZJ(LJIIIZ3, X1D.LIZIZ(LIZ4), null);
            }
            if (this.LJLJJLL.LIZJ(LIZ) > 0) {
                post(new ARunnableS32S0200000_13(this, LIZ, 118));
            } else {
                C76712U8u c76712U8u = this.LJLJJLL.LJ;
                if (c76712U8u.LIZ) {
                    c76712U8u.LIZIZ.reset();
                } else {
                    this.LJZL.reset();
                }
            }
            int LIZJ = this.LJLJJLL.LIZJ(LIZ) - 1;
            int i = LIZJ + 1;
            for (int i2 = 0; i2 < i; i2++) {
                LJ(i2, 0, LIZJ, this.LJLJL.LJIIL(i2), LIZ, C61878OQg.INSTANCE, u9o, z, interfaceC88472Yns);
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null && (layoutSlardarMonitor2 = this.LJLL) != null) {
                ArrayList<C76699U8h> arrayList2 = this.LJLLI;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("linker_layout_sdk_LayoutView");
                LIZ5.append(hashCode());
                layoutSlardarMonitor2.LIZJ(layoutParams, arrayList2, X1D.LIZIZ(LIZ5));
            }
            this.LJLLLLLL = LIZ.getLayoutId();
            return;
        }
        if (this.LJLJJLL.LIZJ(LIZ) > 0) {
            post(new ARunnableS32S0200000_13(this, LIZ, 119));
        } else {
            C76712U8u c76712U8u2 = this.LJLJJLL.LJ;
            if (c76712U8u2.LIZ) {
                c76712U8u2.LIZIZ.reset();
            } else {
                this.LJZL.reset();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.LJLLI);
        this.LJLLI.clear();
        int max = Math.max(arrayList3.size(), this.LJLJJLL.LIZJ(LIZ));
        if (max > this.LJLJJLL.LIZJ(LIZ)) {
            for (int LIZJ2 = this.LJLJJLL.LIZJ(LIZ); LIZJ2 < max; LIZJ2++) {
                Object obj = ListProtector.get(arrayList3, LIZJ2);
                o.LJIIIIZZ(obj, "snapshotList[pos]");
                LJIIL((C76699U8h) obj);
            }
        }
        int LIZJ3 = this.LJLJJLL.LIZJ(LIZ) - 1;
        if (LIZJ3 >= 0) {
            int i3 = LIZJ3;
            while (true) {
                arrayList = arrayList3;
                LJ(i3, LIZJ3, 0, this.LJLJL.LJIIL(i3), LIZ, arrayList3, u9o, z, interfaceC88472Yns);
                if (i3 == 0) {
                    break;
                } else {
                    i3--;
                }
            }
        } else {
            arrayList = arrayList3;
        }
        ArrayList<C76699U8h> arrayList4 = this.LJLLI;
        if (arrayList4.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList4, new IDComparatorS41S0000000_13(14));
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null && (layoutSlardarMonitor = this.LJLL) != null) {
            ArrayList<C76699U8h> arrayList5 = this.LJLLI;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("linker_layout_sdk_LayoutView");
            LIZ6.append(hashCode());
            layoutSlardarMonitor.LIZJ(layoutParams2, arrayList5, X1D.LIZIZ(LIZ6));
        }
        arrayList.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76696U8e(U8P helper, C76703U8l micDataCenter, Context context, U8M u8m, U6C layoutListener, LayoutSlardarMonitor layoutSlardarMonitor) {
        super(context);
        o.LJIIIZ(helper, "helper");
        o.LJIIIZ(micDataCenter, "micDataCenter");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(layoutListener, "layoutListener");
        new LinkedHashMap();
        this.LJLJJLL = helper;
        this.LJLJL = micDataCenter;
        this.LJLJLJ = u8m;
        this.LJLJLLL = layoutListener;
        this.LJLL = layoutSlardarMonitor;
        this.LJLLI = new ArrayList<>();
        FrameLayout frameLayout = new FrameLayout(context);
        this.LJLLILLLL = frameLayout;
        this.LJLLL = true;
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 499));
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-14873558);
        this.LJLZ = paint;
        this.LJZ = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(0);
        this.LJZI = paint2;
        this.LJZL = new Path();
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.LJLLJ = hashCode();
    }

    public final C76699U8h LJFF(int i, int i2, C76711U8t micWindow, String layoutId, Rect rect, Rect rect2) {
        o.LJIIIZ(micWindow, "micWindow");
        o.LJIIIZ(layoutId, "layoutId");
        C76727U9j c76727U9j = new C76727U9j(micWindow.L(), new C9AH(rect.left, rect.top, rect.right, rect.bottom), new C9AH(rect2.left, rect2.top, rect2.right, rect2.bottom));
        AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this, 561);
        Rect rect3 = new Rect();
        rect3.left = rect2.left + getMAllAreaInWindow().left;
        rect3.top = rect2.top + getMAllAreaInWindow().top;
        rect3.right = rect2.width() + rect3.left;
        rect3.bottom = rect2.height() + rect3.top;
        return new C76699U8h(i, i2, micWindow, layoutId, c76727U9j, aqS179S0100000_13, rect3, getLayoutMixer().LJ(rect2, getMAllAreaInWindow()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x039b, code lost:
    
        if (r9 != null) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r25, int r26, int r27, int r28, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r29, java.util.List<X.C76699U8h> r30, X.U9O r31, boolean r32, X.InterfaceC88472Yns<? super java.lang.String, X.C76737U9t> r33) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76696U8e.LJ(int, int, int, int, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout, java.util.List, X.U9O, boolean, X.Yns):void");
    }
}

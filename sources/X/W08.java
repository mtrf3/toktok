package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS50S0100000_14;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W08 extends AbstractC48231ut<WHV, C81574Vzu, C81578Vzy, C53594L1q> implements WHV, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILII;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public final C29901Fi<Boolean> LJLLL;
    public final C29901Fi<W0C> LJLLLL;
    public final InterfaceC65784Pro<C81578Vzy> LJLLLLLL;
    public final InterfaceC65784Pro<C53594L1q> LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public final SafeHandler LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public View LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public final C5H3 LLIIJLIL;
    public View LLIIL;

    public static /* synthetic */ void LLIIZ() {
    }

    static {
        TBT tbt = new TBT(W08.class, "cameApiComponent", "getCameApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIILII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(W08.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "recordApi", "getRecordApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "duetApi", "getDuetApi()Lcom/ss/android/ugc/aweme/shortvideo/duet/DuetLayoutApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "ugcTemplatePreviewApi", "getUgcTemplatePreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/UgcTemplatePreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyPanelApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W08.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    private final W4F LLIFFJFJJ() {
        return (W4F) this.LLFII.LIZ(this, LLIILII[8]);
    }

    private final InterfaceC45921I0n LLILL() {
        return (InterfaceC45921I0n) this.LLFF.LIZ(this, LLIILII[6]);
    }

    private final I3X LLILZIL() {
        return (I3X) this.LLD.LIZ(this, LLIILII[4]);
    }

    private final int LLILZLL() {
        return ((Number) this.LLIIJLIL.getValue()).intValue();
    }

    private final InterfaceC82062WIo LLIZ() {
        return (InterfaceC82062WIo) this.LL.LIZ(this, LLIILII[3]);
    }

    private final InterfaceC45308HqK LLJ() {
        return (InterfaceC45308HqK) this.LLFFF.LIZ(this, LLIILII[7]);
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJZL.LIZ(this, LLIILII[2]);
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LLFZ.LIZ(this, LLIILII[9]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LLF.LIZ(this, LLIILII[5]);
    }

    public final WRQ LLIIIL() {
        return (WRQ) this.LJZ.LIZ(this, LLIILII[0]);
    }

    public final WLT LLIILZL() {
        return (WLT) this.LJZI.LIZ(this, LLIILII[1]);
    }

    @Override // X.WHV
    public void VD() {
        if (this.LLIIL == null) {
            this.LLIIL = LLIZ().R3(19);
        }
        View view = this.LLIIL;
        if (view != null) {
            j80(view);
        }
    }

    @Override // X.WHV
    public int getNextFlashMode() {
        int i = this.LJLLJ;
        if (i != 0) {
            if (i == 1 || i == 2 || (i != 3 && i != 4)) {
                return 0;
            }
            return 4;
        }
        if (L2F.LIZIZ() == 1) {
            return 1;
        }
        if (L2F.LIZIZ() != 2) {
            return 3;
        }
        return 2;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLI.LIZ(this, LLIILII[10]);
    }

    private final void LLJI() {
        LiveData<Boolean> LLJLILLLLZIIL;
        LiveEvent<Boolean> cg;
        C0IB<Integer> qc;
        getPlanCUIApiComponent().zf0(new C53431Ky3(this));
        LLIILZL().oX().LIZLLL(this, new AObjectS89S0100000_14(this, 225));
        LLIILZL().uB().LIZLLL(this, new AObjectS89S0100000_14(this, 226));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 227));
        LLILZIL().np0().LIZLLL(this, new AObjectS89S0100000_14(this, 228));
        LLILZIL().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 229));
        LLILZIL().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 230));
        InterfaceC45921I0n LLILL = LLILL();
        if (LLILL != null && (qc = LLILL.qc()) != null) {
            qc.LIZIZ(this, new AObjectS89S0100000_14(this, 231));
        }
        InterfaceC45308HqK LLJ = LLJ();
        if (LLJ != null && (cg = LLJ.cg()) != null) {
            cg.LIZLLL(this, new AObjectS89S0100000_14(this, 232));
        }
        W4F LLIFFJFJJ = LLIFFJFJJ();
        if (LLIFFJFJJ != null && (LLJLILLLLZIIL = LLIFFJFJJ.LLJLILLLLZIIL()) != null) {
            LLJLILLLLZIIL.observe(this, new AObserverS77S0100000_9(this, 45));
        }
    }

    private final void LLJJJIL() {
        int parseColor;
        LLJLLIL();
        C62822Ol8 c62822Ol8 = W0A.LIZIZ;
        OSZ<Float, Float> LJLZ = LJLZ(((Keva) c62822Ol8.getValue()).getInt("seekbar_progress", W0A.LIZ));
        float floatValue = LJLZ.getFirst().floatValue();
        float floatValue2 = LJLZ.getSecond().floatValue();
        int i = 0;
        int i2 = ((Keva) c62822Ol8.getValue()).getInt("selected_color", 0);
        if (i2 < C81446Vxq.LIZ().size()) {
            i = i2;
        }
        int i3 = this.LJLLJ;
        if (i3 == 3 || i3 == 4) {
            parseColor = ColorProtector.parseColor((String) ListProtector.get(C81446Vxq.LIZ(), i));
        } else {
            parseColor = -1;
        }
        LJJZZI(new W04(floatValue, floatValue2, parseColor));
    }

    public final void LLJLLIL() {
        getBottomTabApiComponent().setBottomSelectedTextColor(R.attr.do, R.attr.d8);
        getBottomTabApiComponent().updateBottomDotRes(R.drawable.c0c);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().gt0(this);
        LLJI();
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        if (this.LLIIIZ) {
            return;
        }
        if (!getShortVideoContext().LJJII()) {
            this.LLIIIJ = this.LJLLJ;
        }
        LLF(this, false, true, 1, null);
        LLJLIL(false);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        int i;
        super.onResume();
        if (!getShortVideoContext().LJJII() && (i = this.LLIIIJ) != 0) {
            this.LJLLLL.LJII(new W0C(i, false));
        }
    }

    @Override // X.WHV
    public boolean Bm0() {
        return this.LLII;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C81578Vzy> LJJLIIIJJI() {
        return this.LJLLLLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C53594L1q> LJJLIIIJJIZ() {
        return this.LJLZ;
    }

    @Override // X.WHV
    public LiveEvent<Boolean> Ra() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.WHV
    public int ke() {
        return this.LJLLJ;
    }

    @Override // X.WHV
    public int ta() {
        return this.LLIIIJ;
    }

    @Override // X.WHV
    /* renamed from: ta */
    public LiveEvent<W0C> mo45ta() {
        return this.LJLLLL;
    }

    private final OSZ<Float, Float> LJLZ(int i) {
        if (LLILZLL() == 2) {
            i *= 10;
        }
        float f = i;
        return new OSZ<>(Float.valueOf((C81446Vxq.LIZJ * f) + C81446Vxq.LIZIZ), Float.valueOf((f * C81446Vxq.LJ) + C81446Vxq.LIZLLL));
    }

    private final void LLJJIJI(boolean z) {
        this.LJLLJ = 0;
        this.LLIIIILZ = 0;
        if (!z) {
            this.LLIIIJ = 0;
        }
        ShortVideoContext shortVideoContext = getShortVideoContext();
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C188727au c188727au = new C188727au();
        C42091GfX.LIZ(c188727au, shortVideoContext);
        GXR.LIZ("click_flash_button", c188727au.LIZ);
        this.LLIIII.postDelayed(new ARunnableS50S0100000_14(this, 113), 400L);
    }

    private final void LLJJL(View view) {
        LJJZZI(new AqS180S0100000_14(view, 229));
    }

    public final void LLFFF(boolean z) {
        this.LLII = z;
        getPlanCUIApiComponent().eH(this.LLII);
    }

    public final void LLJJI(int i) {
        OSZ<Float, Float> LJLZ = LJLZ(i);
        LJJZZI(new W05(LJLZ.getFirst().floatValue(), LJLZ.getSecond().floatValue()));
    }

    public final void LLJJIII(int i) {
        int i2;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (LLILZLL() == 2) {
            i2 = i * 10;
        } else {
            i2 = i;
        }
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C188727au c188727au = new C188727au();
        C42091GfX.LIZ(c188727au, shortVideoContext);
        c188727au.LIZLLL(i2, "value");
        GXR.LIZ("adjust_flash_light", c188727au.LIZ);
        ((Keva) W0A.LIZIZ.getValue()).storeInt("seekbar_progress", i);
    }

    public final void LLJLIL(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 28));
    }

    @Override // X.WHV
    public void j80(View anchor) {
        o.LJIIIZ(anchor, "anchor");
        int i = this.LJLLJ;
        if (i == 3 || i == 4) {
            LLIZ().cn0();
            this.LLIIIL = anchor;
            LLJJL(anchor);
        }
    }

    @Override // X.WHV
    public void q90(int i) {
        if (!getShortVideoContext().LJJII()) {
            this.LLIIIILZ = i;
        }
    }

    @Override // X.WHV
    public void s9(int i) {
        this.LJLLJ = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        return;
                    }
                    LLJJJIL();
                    return;
                } else {
                    this.LJLLILLLL = true;
                    LLJJJIL();
                    return;
                }
            }
            this.LJLLILLLL = true;
            LLFFF(true);
            return;
        }
        this.LLIIIILZ = 0;
        LLF(this, false, false, 3, null);
        LLFFF(false);
    }

    @Override // X.WHV
    public void wX(InterfaceC65784Pro<C76800UCe> takePhoto) {
        o.LJIIIZ(takePhoto, "takePhoto");
        LLJLIL(true);
        this.LLIIII.postDelayed(new ARunnableS45S0100000_9((InterfaceC65784Pro) takePhoto, 113), 400L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W08(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLL = new C29901Fi<>();
        this.LJLLLL = new C29901Fi<>();
        this.LJLLLLLL = new AqS164S0100000_14(this, 218);
        this.LJLZ = new AqS159S0100000_9(this, 748);
        this.LJZ = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), WLT.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LL = UCI.LJI(getDiContainer(), InterfaceC82062WIo.class, null);
        this.LLD = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LLF = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LLFF = UCI.LJII(getDiContainer(), InterfaceC45921I0n.class, null);
        this.LLFFF = UCI.LJII(getDiContainer(), InterfaceC45308HqK.class, null);
        this.LLFII = UCI.LJII(getDiContainer(), W4F.class, null);
        this.LLFZ = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LLI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLIFFJFJJ = -1;
        this.LLIIII = new SafeHandler(this);
        this.LLIIJLIL = C221108m2.LIZIZ(W09.LJLIL);
    }

    private final void LJZI(boolean z, boolean z2) {
        LJJZZI(new AqS18S0010000_14(z2, 27));
        if (!this.LJLLILLLL) {
            return;
        }
        this.LJLLILLLL = false;
        if (!z) {
            getBottomTabApiComponent().setBottomSelectedTextColor(R.attr.dj, R.attr.dm);
        }
        getBottomTabApiComponent().updateBottomDotRes(R.drawable.c0b);
        this.LJLLJ = 0;
        this.LJLLL.LJII(Boolean.TRUE);
    }

    public final void LLJJ(String color, int i) {
        this.LLIFFJFJJ = ColorProtector.parseColor(color);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(color, "color");
        C188727au c188727au = new C188727au();
        C42091GfX.LIZ(c188727au, shortVideoContext);
        c188727au.LJIIIZ("color", color);
        GXR.LIZ("choose_flash_color", c188727au.LIZ);
        ((Keva) W0A.LIZIZ.getValue()).storeInt("selected_color", i);
        LJJZZI(new AqS180S0100000_14(this, 228));
    }

    public static /* synthetic */ void LLJJIJIL(W08 w08, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        w08.LLJJIJI(z);
    }

    public static /* synthetic */ void LLF(W08 w08, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        w08.LJZI(z, z2);
    }
}

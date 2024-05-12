package X;

import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.WSj */
/* loaded from: classes15.dex */
public final class C82317WSj extends AbstractC29891Fh<I3K> implements I3K, InterfaceC135635Tz {
    public static final C82323WSp LLIIIZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJI;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final Object LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final C46193IAz LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final C82317WSj LJLZ;
    public final C40871j1<Integer> LJZ;
    public final C29901Fi<WS0> LJZI;
    public final C40871j1<C76800UCe> LJZL;
    public final C29901Fi<WS0> LL;
    public final C40871j1<String> LLD;
    public final C29901Fi<C35512Dwi> LLF;
    public boolean LLFF;
    public String LLFFF;
    public I34 LLFII;
    public C81433Vxd LLFZ;
    public final C46611sH<Integer> LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public Object LLIIII;
    public boolean LLIIIILZ;
    public String LLIIIJ;
    public final C5H3 LLIIIL;

    private final String LJJLIIJ(int i) {
        return i != 1 ? (i == 2 || i == 3) ? "slide" : "" : "click";
    }

    static {
        TBT tbt = new TBT(C82317WSj.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIJI = new InterfaceC74236TBo[]{tbt, new TBT(C82317WSj.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C82317WSj.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new TBT(C82317WSj.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C82317WSj.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new TBT(C82317WSj.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C82317WSj.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new TBT(C82317WSj.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0), new TBT(C82317WSj.class, "nowsRecordTabApi", "getNowsRecordTabApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsRecordTabApi;", 0), new TBT(C82317WSj.class, "slideSplipComponent", "getSlideSplipComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/slideslip/SlideSlipBottomStickerApiComponent;", 0), new TBT(C82317WSj.class, "nowsCameraComponent", "getNowsCameraComponent()Lcom/ss/android/ugc/aweme/nows/camera/NowsCameraApiComponent;", 0), new TBT(C82317WSj.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0)};
        LLIIIZ = new C82323WSp();
    }

    private final WXA LJJLIIIIJ() {
        return new C82319WSl(this);
    }

    private final InterfaceC82352WTs LJJLIIIJILLIZJL() {
        return (InterfaceC82352WTs) this.LJLLLL.LIZ(this, LLIIJI[10]);
    }

    private final InterfaceC81634W2c LJJLIIIJJI() {
        return (InterfaceC81634W2c) this.LJLLJ.LIZ(this, LLIIJI[8]);
    }

    private final InterfaceC45979I2t LJJLIIIJJIZ() {
        return (InterfaceC45979I2t) this.LJLJLLL.LIZ(this, LLIIJI[4]);
    }

    private final InterfaceC82129WLd LJJLIIIJLLLLLLLZ() {
        return (InterfaceC82129WLd) this.LJLLL.LIZ(this, LLIIJI[9]);
    }

    private final void LJJLJ() {
        C46193IAz c46193IAz = this.LJLJJLL;
        if (c46193IAz != null && C82398WVm.LIZLLL(c46193IAz) && o.LJ(this.LLFFF, I38.RECORD_NOW.getTag()) && LJLZ() && W2U.LIZ()) {
            IDH LLLF = this.LJLJJLL.LLLF();
            if (LLLF != null) {
                LLLF.hide();
                return;
            }
            return;
        }
        if (o.LJ(a9(), C44269HYz.LIZJ) || !LJZI()) {
            return;
        }
        hd(C44269HYz.LIZIZ, true);
    }

    private final void LJJLJLI() {
        C46193IAz c46193IAz = this.LJLJJLL;
        if (c46193IAz != null && C82398WVm.LIZLLL(c46193IAz) && o.LJ(this.LLFFF, I38.RECORD_NOW.getTag()) && W2U.LIZ()) {
            IDH LLLF = this.LJLJJLL.LLLF();
            if (LLLF != null) {
                LLLF.hide();
                return;
            }
            return;
        }
        String a9 = a9();
        String str = C44269HYz.LIZ;
        if (o.LJ(a9, str)) {
            return;
        }
        hd(str, true);
    }

    private final void LJJLL() {
        C46193IAz c46193IAz = this.LJLJJLL;
        if (c46193IAz != null && C82398WVm.LIZLLL(c46193IAz) && o.LJ(this.LLFFF, I38.RECORD_NOW.getTag()) && W2U.LIZ() && LJZI()) {
            IDH LLLF = this.LJLJJLL.LLLF();
            if (LLLF != null) {
                LLLF.hide();
                return;
            }
            return;
        }
        if (o.LJ(a9(), C44269HYz.LIZJ) || !LJZI()) {
            return;
        }
        hd(C44269HYz.LIZIZ, true);
    }

    private final void LJJZZI() {
        C46193IAz c46193IAz = this.LJLJJLL;
        if (c46193IAz != null && C82398WVm.LIZLLL(c46193IAz) && o.LJ(this.LLFFF, I38.RECORD_NOW.getTag()) && W2U.LIZ()) {
            IDH LLLF = this.LJLJJLL.LLLF();
            if (LLLF != null) {
                LLLF.hide();
                return;
            }
            return;
        }
        String a9 = a9();
        String str = C44269HYz.LIZIZ;
        if (o.LJ(a9, str)) {
            return;
        }
        hd(str, true);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LJLLLLLL.LIZ(this, LLIIJI[11]);
    }

    @Override // X.I3K
    public boolean Fb() {
        Integer LIZ;
        if (!this.LLFF || (LIZ = this.LJZ.LIZ()) == null || LIZ.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.I3K
    public String a9() {
        C81433Vxd c81433Vxd = this.LLFZ;
        if (c81433Vxd != null) {
            ViewOnTouchListenerC81419VxP LLJILJILJ = c81433Vxd.LLJILJILJ();
            return LLJILJILJ.LJ(LLJILJILJ.getCurrentIndex()).toString();
        }
        o.LJIJI("splitShootScene");
        throw null;
    }

    @Override // X.I3K
    public void g80() {
        if (this.LLFF && C52912Kpg.LIZ() && !getCameraApiComponent().e8().LLZLLLL() && !getShortVideoContext().cameraComponentModel.isRetakeMode) {
            LJLJLJ(false, C81440Vxk.LIZIZ(getShortVideoContext().LJ()));
            VV(0);
        }
    }

    @Override // X.I3K
    public int getBottomMargin() {
        C81433Vxd c81433Vxd = this.LLFZ;
        if (c81433Vxd != null) {
            return c81433Vxd.LLI;
        }
        o.LJIJI("splitShootScene");
        throw null;
    }

    public final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLJL.LIZ(this, LLIIJI[2]);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLL.LIZ(this, LLIIJI[5]);
    }

    public final boolean getEnableSwitchDurationAfterRecording() {
        return ((Boolean) this.LLIIIL.getValue()).booleanValue();
    }

    public final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJLLI.LIZ(this, LLIIJI[6]);
    }

    public final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LJLLILLLL.LIZ(this, LLIIJI[7]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLJJI.LIZ(this, LLIIJI[0]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJLJJL.LIZ(this, LLIIJI[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJLJ.LIZ(this, LLIIJI[3]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x006f, code lost:
    
        if (r1.creativeModel.paidContentModel.getCollectionId().length() == 0) goto L37;
     */
    @Override // X.AbstractC29891Fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82317WSj.onCreate():void");
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        H7B.LJ("SplitShootComponent onDestroy");
        super.onDestroy();
        getRecordAdapterApi().NM(null);
    }

    private final boolean LJLZ() {
        if (HYZ.LIZ() != 0 && !getShortVideoContext().LJJJI() && !getShortVideoContext().LJJIIZ()) {
            return true;
        }
        return false;
    }

    private final boolean LJZI() {
        if (C43465H4b.LIZ() != 0 && !getShortVideoContext().LJJJI() && !getShortVideoContext().LJJIIZ() && (!((Boolean) C52826KoI.LIZ.getValue()).booleanValue() || HYZ.LIZ() == 0 || !LJLZ())) {
            return true;
        }
        return false;
    }

    public final boolean LJJZZIII() {
        if (C44245HYb.LIZ() && !this.LLII) {
            return true;
        }
        return false;
    }

    @Override // X.I3K
    public /* bridge */ /* synthetic */ C0IB Ig0() {
        return this.LJZ;
    }

    @Override // X.I3K
    public C29901Fi<WS0> fv0() {
        return this.LL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I3K getApiComponent() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.I3K
    public /* bridge */ /* synthetic */ C0IB pe0() {
        return this.LLD;
    }

    @Override // X.I3K
    public void Ad0(I34 extraInfo) {
        int i;
        int i2;
        boolean z;
        o.LJIIIZ(extraInfo, "extraInfo");
        this.LLFII = extraInfo;
        if (this.LLIFFJFJJ) {
            String str = this.LLFFF;
            WS0 ws0 = extraInfo.LIZJ;
            if (ws0 != null) {
                i2 = ws0.LIZJ;
            } else {
                i2 = 0;
            }
            boolean z2 = extraInfo.LIZ;
            InterfaceC82325WSr nowsSwitcherApi = getNowsSwitcherApi();
            if (nowsSwitcherApi != null) {
                z = nowsSwitcherApi.kT(extraInfo.LIZJ);
            } else {
                z = extraInfo.LIZLLL;
            }
            LJLJJL(null, str, true, i2, z2, z);
        } else {
            if (o.LJ(this.LLFFF, I38.RECORD_NOW.getTag())) {
                getShortVideoContext().shootMode = 16;
            }
            InterfaceC45979I2t LJJLIIIJJIZ = LJJLIIIJJIZ();
            Object obj = this.LLIIII;
            WS0 ws02 = extraInfo.LIZJ;
            if (ws02 != null) {
                i = ws02.LIZJ;
            } else {
                i = 0;
            }
            LJJLIIIJJIZ.notifyBottomTabIndexChange(new WS0(null, obj, i, false, false, true, this.LJLJI, 16));
        }
        this.LJZL.LJI(C76800UCe.LIZ);
    }

    public final void LJLLL(boolean z) {
        if (!this.LLFF) {
            return;
        }
        if (!z || getShortVideoContext().LJIIIIZZ() > 0) {
            if (C52912Kpg.LIZ() && !getCameraApiComponent().e8().LLZLLLL() && !getShortVideoContext().cameraComponentModel.isRetakeMode && !LJJZZIII()) {
                LJLJLJ(false, C81440Vxk.LIZIZ(getShortVideoContext().LJ()));
                VV(0);
                return;
            } else {
                VV(8);
                return;
            }
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode || LJJZZIII()) {
            return;
        }
        if (C52912Kpg.LIZ()) {
            LJLLILLLL(this, true, null, 2, null);
        }
        VV(0);
    }

    @Override // X.I3K
    public void Mc0(boolean z) {
        String LIZ;
        boolean z2;
        if (LJJZZIII()) {
            this.LLII = true;
            if (z) {
                LIZ = "RecordShoot15s";
            } else {
                LIZ = HYY.LIZ(getShortVideoContext().LJIIJJI());
            }
            I34 i34 = this.LLFII;
            if (i34 != null) {
                z2 = i34.LIZLLL;
            } else {
                z2 = true;
            }
            hd(LIZ, z2);
            LJLLL(true);
        }
    }

    @Override // X.I3K
    public void P1(int i) {
        this.LLI.LJI(Integer.valueOf(i));
    }

    @Override // X.I3K
    public void SA(boolean z) {
        this.LLIIIILZ = z;
    }

    @Override // X.I3K
    public void VV(int i) {
        C40871j1<Integer> c40871j1 = this.LJZ;
        if (!this.LLIIIILZ) {
            i = 8;
        }
        c40871j1.LJI(Integer.valueOf(i));
    }

    @Override // X.I3K
    public void gd0(boolean z) {
        int i;
        this.LLFF = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        VV(i);
    }

    @Override // X.I3K
    public void nd(Effect effect) {
        String LJIILJJIL;
        C46193IAz c46193IAz;
        String currentBottomTag = getBottomTabApiComponent().getCurrentBottomTag();
        String str = null;
        if (o.LJ(this.LLFFF, I38.RECORD_NOW.getTag())) {
            if (effect != null) {
                str = V0N.LJIILJJIL(effect);
            }
            if (o.LJ(str, "video_15")) {
                return;
            }
        }
        if (getShortVideoContext().LIZIZ().isEmpty() && o.LJ(currentBottomTag, "RecordShoot180s")) {
            if (((!o.LJ(this.LLIIIJ, "invalid_duration") || (c46193IAz = this.LJLJJLL) == null || !C82398WVm.LIZLLL(c46193IAz)) && o.LJ(this.LLIIIJ, "invalid_duration")) || effect == null || (LJIILJJIL = V0N.LJIILJJIL(effect)) == null) {
                return;
            }
            switch (LJIILJJIL.hashCode()) {
                case 1151385704:
                    if (!LJIILJJIL.equals("video_15")) {
                        return;
                    }
                    LJJLJLI();
                    return;
                case 1151385854:
                    if (!LJIILJJIL.equals("video_60")) {
                        return;
                    }
                    LJJZZI();
                    return;
                case 1333218597:
                    if (!LJIILJJIL.equals("video_180")) {
                        return;
                    }
                    LJJLL();
                    return;
                case 1333223154:
                    if (!LJIILJJIL.equals("video_600")) {
                        return;
                    }
                    LJJLJ();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // X.I3K
    public void setTabSwitchEnabled(boolean z) {
        C81433Vxd c81433Vxd = this.LLFZ;
        if (c81433Vxd != null) {
            ViewOnTouchListenerC81419VxP LLJILJILJ = c81433Vxd.LLJILJILJ();
            LLJILJILJ.setUISwitchEnabled(z);
            LLJILJILJ.setScrollEnabled(z);
            getBottomTabApiComponent().setTabSwitchEnabled(z);
            return;
        }
        o.LJIJI("splitShootScene");
        throw null;
    }

    @Override // X.I3K
    public void va(boolean z) {
        this.LLFF = z;
    }

    @Override // X.I3K
    public void Ju(boolean z, boolean z2) {
        if (this.LLFF) {
            if (C53558L0g.LIZ() && (getShortVideoContext().isDuetMode || o.LJ(getPlanCUIApiComponent().g2().LIZJ(), Boolean.TRUE))) {
                VV(8);
                return;
            }
            if (!z || getShortVideoContext().cameraComponentModel.isRetakeMode || LJJZZIII()) {
                VV(8);
                return;
            }
            if (getShortVideoContext().LJIIIIZZ() > 0) {
                if (C52912Kpg.LIZ() && !getCameraApiComponent().e8().LLZLLLL() && !getShortVideoContext().cameraComponentModel.isRetakeMode) {
                    if (z2) {
                        return;
                    }
                    VV(0);
                    return;
                }
                VV(8);
                return;
            }
            if (C52912Kpg.LIZ()) {
                LJLLILLLL(this, true, null, 2, null);
            }
            VV(0);
        }
    }

    public final void LJLJLJ(boolean z, java.util.Set<String> set) {
        this.LLF.LJII(new C35512Dwi(z, set));
    }

    @Override // X.I3K
    public void hd(String tag, boolean z) {
        o.LJIIIZ(tag, "tag");
        C81433Vxd c81433Vxd = this.LLFZ;
        Integer num = null;
        if (c81433Vxd != null) {
            ViewOnTouchListenerC81419VxP LLJILJILJ = c81433Vxd.LLJILJILJ();
            Iterator<Integer> it = C78842Uww.LJJ(0, LLJILJILJ.getTabCount()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (o.LJ(LLJILJILJ.LJ(next.intValue()), tag)) {
                    num = next;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 != null) {
                LLJILJILJ.LJIIIIZZ(num2.intValue(), true, z);
                return;
            }
            return;
        }
        o.LJIJI("splitShootScene");
        throw null;
    }

    @Override // X.I3K
    public void rG(boolean z, int i) {
        C81433Vxd c81433Vxd = this.LLFZ;
        if (c81433Vxd != null) {
            ViewOnTouchListenerC81419VxP LLJILJILJ = c81433Vxd.LLJILJILJ();
            LLJILJILJ.LJII(LLJILJILJ.getLastIndex(), i, z);
        } else {
            o.LJIJI("splitShootScene");
            throw null;
        }
    }

    public C82317WSj(WMH parentScene, C82622Wbi diContainer, Object parentTag) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentTag, "parentTag");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = parentTag;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJJLL = (C46193IAz) getDiContainer().LJIIIIZZ(null, C46193IAz.class);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC81634W2c.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC82129WLd.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC82352WTs.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LJLZ = this;
        this.LJZ = new C40871j1<>(8);
        C29901Fi<WS0> c29901Fi = new C29901Fi<>();
        this.LJZI = c29901Fi;
        this.LJZL = new C40871j1<>(C76800UCe.LIZ);
        this.LL = c29901Fi;
        this.LLD = new C40871j1<>(null);
        this.LLF = new C29901Fi<>();
        this.LLFFF = C44269HYz.LIZ;
        this.LLI = new C46611sH<>(0);
        this.LLIFFJFJJ = true;
        this.LLII = !HYY.LIZIZ(getShortVideoContext());
        this.LLIIII = "";
        this.LLIIIILZ = true;
        this.LLIIIJ = "";
        this.LLIIIL = C221108m2.LIZIZ(C82321WSn.LJLIL);
    }

    private final void LJJLI(String str, ShortVideoContext shortVideoContext, boolean z, boolean z2) {
        boolean z3;
        if ((!C44269HYz.LIZJ(str) && !o.LJ(C44269HYz.LIZ, str) && !o.LJ("RecordCombinePhoto", str) && !o.LJ(I38.RECORD_NOW.getTag(), str)) || shortVideoContext.LJJJI()) {
            return;
        }
        C45964I2e c45964I2e = new C45964I2e(!C44269HYz.LIZJ(str), true);
        if (o.LJ(str, C44269HYz.LIZJ) || o.LJ(str, C44269HYz.LIZLLL)) {
            z3 = true;
        } else {
            z3 = false;
        }
        c45964I2e.LJLJI = z3;
        c45964I2e.LJLJJL = z;
        c45964I2e.LJLJJI = 2;
        c45964I2e.LJLJJLL = !z2;
        getBottomTabApiComponent().configSwitchDuration(c45964I2e);
    }

    private final void LJLIIL(boolean z, int i, String str, boolean z2) {
        String str2;
        String str3;
        String str4;
        if (o.LJ(this.LLFFF, C44269HYz.LIZ)) {
            str2 = "video_15";
        } else if (o.LJ(this.LLFFF, "RecordCombinePhoto")) {
            str2 = "photo";
        } else if (o.LJ(this.LLFFF, I38.RECORD_LIGHTENING_TEXT.getTag())) {
            str2 = "text";
        } else if (HB4.LIZJ() == 14) {
            str2 = "video_180";
        } else if (HB4.LIZJ() == 18) {
            str2 = "video_600";
        } else if (HB4.LIZJ() == 16) {
            str2 = C60903NvH.LJIIJJI().LJJIII().getNowUIService().getTabName();
        } else {
            str2 = "video_60";
        }
        String str5 = "";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str3 = "";
                    } else {
                        str3 = "cross";
                    }
                } else {
                    str3 = "full_slide";
                }
            } else {
                str3 = "tab_bar_slide";
            }
        } else {
            str3 = "tab_bar_click";
        }
        if (z) {
            str4 = "outer";
        } else {
            str4 = "inner";
        }
        String LIZ = C81440Vxk.LIZ(str);
        if (z2) {
            LIZ = "by_default";
            str3 = "";
        } else {
            str5 = str4;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        c145995oB.LIZ(getShortVideoContext().draftId, "draft_id");
        c145995oB.LJI("to_status", str2);
        c145995oB.LJI("change_type", str5);
        c145995oB.LJI("change_method", str3);
        c145995oB.LJI("from_status", LIZ);
        c145995oB.LJI("shoot_tab_name", str2);
        if (C52912Kpg.LIZ() && getShortVideoContext().LJIIIIZZ() > 0) {
            c145995oB.LJI("enter_from", "video_recording_page");
        } else {
            c145995oB.LJI("enter_from", "video_shoot_page");
        }
        if (o.LJ(str2, "text")) {
            c145995oB.LJI("text_mode_enter_method", LJJLIIJ(i));
        }
        FMX.LJIIL("change_record_mode", c145995oB.LIZ);
    }

    public /* synthetic */ C82317WSj(WMH wmh, C82622Wbi c82622Wbi, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, c82622Wbi, (i & 4) != 0 ? I38.RECORD_SPLIT_3MIN.getTag() : obj);
    }

    private final void LJLJJLL(C45850Hz4 c45850Hz4, String str, ShortVideoContext shortVideoContext, boolean z, String str2) {
        if ((C44269HYz.LIZJ(str) || (o.LJ(C44269HYz.LIZ, str) && !o.LJ(I38.RECORD_NOW.getTag(), str2))) && shortVideoContext.LJJIJIL()) {
            if (shortVideoContext.LJJJIL()) {
                shortVideoContext.cameraComponentModel.mMusicStart = HEG.LIZIZ(shortVideoContext.stitchContext.stitchParams);
            } else if (!z) {
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                if (HCG.LIZ() && extractAVMusic != null && extractAVMusic.isNeedReuse()) {
                    shortVideoContext.cameraComponentModel.mMusicStart = extractAVMusic.getMusicBeginTime();
                } else {
                    shortVideoContext.cameraComponentModel.mMusicStart = 0;
                }
            }
            I9T.LJII(shortVideoContext.cameraComponentModel.mMusicStart, "", shortVideoContext.creativeModel.musicBuzModel);
            HB4.LJII(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath(), MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel), shortVideoContext.cameraComponentModel.mMusicStart);
            c45850Hz4.LIZJ().LLZZJLIL(r1.mMusicStart, shortVideoContext.cameraComponentModel.mTotalRecordingTime, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath(), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LJLLILLLL(C82317WSj c82317WSj, boolean z, java.util.Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        c82317WSj.LJLJLJ(z, set);
    }

    public final void LJLJJL(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        boolean z4;
        InterfaceC82325WSr nowsSwitcherApi;
        this.LLFFF = str2;
        Object LJIIIIZZ = getDiContainer().LJIIIIZZ(null, InterfaceC45979I2t.class);
        o.LJI(LJIIIIZZ);
        C45850Hz4 provideRecordEnv = ((InterfaceC45979I2t) LJIIIIZZ).provideRecordEnv();
        provideRecordEnv.LIZIZ();
        I37 i37 = provideRecordEnv.LIZ;
        if (i37 != null) {
            i37.X2("record");
        }
        int LIZIZ = C44269HYz.LIZIZ(str2);
        provideRecordEnv.LIZLLL().shootMode = LIZIZ;
        String tag = I38.RECORD_NOW.getTag();
        String tag2 = I38.RECORD_LIGHTENING_TEXT.getTag();
        C46193IAz c46193IAz = this.LJLJJLL;
        boolean z5 = false;
        if (c46193IAz == null || !C82398WVm.LIZLLL(c46193IAz) || !W2U.LIZ()) {
            InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
            if (z3 && !o.LJ(str2, tag)) {
                z4 = true;
            } else {
                z4 = false;
            }
            planCUIApiComponent.Qt0(z4);
        }
        if (o.LJ(str, tag) || o.LJ(str2, tag)) {
            Ju(true, false);
            if (!o.LJ(tag2, str) && !o.LJ(tag2, str2)) {
                setTabSwitchEnabled(false);
                if (o.LJ(str, tag) && (nowsSwitcherApi = getNowsSwitcherApi()) != null) {
                    nowsSwitcherApi.i5(false);
                }
            }
        }
        this.LLD.LJI(str2);
        LJLJJLL(provideRecordEnv, str2, provideRecordEnv.LIZLLL(), z, str);
        ShortVideoContext LIZLLL = provideRecordEnv.LIZLLL();
        if (z) {
            I34 i34 = this.LLFII;
            if (i34 != null) {
                z5 = i34.LIZ;
            } else {
                o.LJIJI("extraInfo");
                throw null;
            }
        }
        LJJLI(str2, LIZLLL, z5, z);
        HB4.LJIIIZ(LIZIZ);
        LJLIIL(z, i, str, z2);
        LJJLIIIJJIZ().notifyBottomTabIndexChange(new WS0(str, str2, i, false, false, true, this.LJLJI, 16));
    }
}

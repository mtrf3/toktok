package X;

import X.AbstractC56012Ht;
import X.C0I6;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WWq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82428WWq<API_COMPONENT extends C0I6, SCENE extends AbstractC56012Ht<STATE, ACTION>, STATE, ACTION> extends AbstractC48231ut<API_COMPONENT, SCENE, STATE, ACTION> implements InterfaceC135635Tz, InterfaceC82201WNx {
    public static final C82431WWt LLIIII = new C82431WWt();
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final String LJLLILLLL;
    public I3X LJLLJ;
    public InterfaceC82086WJm LJLLL;
    public InterfaceC45999I3n LJLLLL;
    public I27 LJLLLLLL;
    public InterfaceC45889Hzh LJLZ;
    public InterfaceC45979I2t LJZ;
    public ShortVideoContext LJZI;
    public I0N LJZL;
    public W13 LL;
    public InterfaceC82353WTt LLD;
    public C46193IAz LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final C5H3 LLFZ;
    public boolean LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;

    public void LLILL() {
    }

    public final void LLILZIL(String msg, Throwable th) {
        o.LJIIIZ(msg, "msg");
    }

    public void initData() {
    }

    private final C5HC LJLZ() {
        return (C5HC) this.LLII.getValue();
    }

    private final InterfaceC45540Hu4 LLFFF() {
        return (InterfaceC45540Hu4) this.LLIFFJFJJ.getValue();
    }

    private final C29901Fi<WJ0> LLIIIL() {
        return (C29901Fi) this.LLFZ.getValue();
    }

    private final void LLJ() {
        if (this.LLI) {
            return;
        }
        InterfaceC45540Hu4 LLFFF = LLFFF();
        if (LLFFF != null) {
            LLFFF.registerActivityOnKeyDownListener(LJLZ());
        }
        this.LLI = true;
    }

    public final I27 LJZI() {
        I27 i27 = this.LJLLLLLL;
        if (i27 != null) {
            return i27;
        }
        o.LJIJI("chooseMusicApiComponent");
        throw null;
    }

    public final InterfaceC45889Hzh LLF() {
        InterfaceC45889Hzh interfaceC45889Hzh = this.LJLZ;
        if (interfaceC45889Hzh != null) {
            return interfaceC45889Hzh;
        }
        o.LJIJI("dockBarApiComponent");
        throw null;
    }

    public final W13 LLIFFJFJJ() {
        W13 w13 = this.LL;
        if (w13 != null) {
            return w13;
        }
        o.LJIJI("recordLazyHelperApiComponent");
        throw null;
    }

    public final InterfaceC45979I2t getBottomTabApiComponent() {
        InterfaceC45979I2t interfaceC45979I2t = this.LJZ;
        if (interfaceC45979I2t != null) {
            return interfaceC45979I2t;
        }
        o.LJIJI("bottomTabApiComponent");
        throw null;
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        InterfaceC82086WJm interfaceC82086WJm = this.LJLLL;
        if (interfaceC82086WJm != null) {
            return interfaceC82086WJm;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        InterfaceC45999I3n interfaceC45999I3n = this.LJLLLL;
        if (interfaceC45999I3n != null) {
            return interfaceC45999I3n;
        }
        o.LJIJI("planCUIApiComponent");
        throw null;
    }

    public final I3X getRecordControlApi() {
        I3X i3x = this.LJLLJ;
        if (i3x != null) {
            return i3x;
        }
        o.LJIJI("recordControlApi");
        throw null;
    }

    public final ShortVideoContext getShortVideoContext() {
        ShortVideoContext shortVideoContext = this.LJZI;
        if (shortVideoContext != null) {
            return shortVideoContext;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public final I0N getStickerApiComponent() {
        I0N i0n = this.LJZL;
        if (i0n != null) {
            return i0n;
        }
        o.LJIJI("stickerApiComponent");
        throw null;
    }

    private final void LLJJJIL() {
        InterfaceC45540Hu4 LLFFF = LLFFF();
        if (LLFFF != null) {
            LLFFF.unRegisterActivityOnKeyDownListener(LJLZ());
        }
        this.LLI = false;
    }

    public final boolean LLIILZL() {
        return LLIZ();
    }

    public void LLIIZ() {
        LLJJI((I3X) getDiContainer().LJ(I3X.class, null));
        LLJJ((InterfaceC82086WJm) getDiContainer().LJ(InterfaceC82086WJm.class, null));
        R90((InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null));
        GV((I27) getDiContainer().LJ(I27.class, null));
        KE((InterfaceC45889Hzh) getDiContainer().LJ(InterfaceC45889Hzh.class, null));
        oA((InterfaceC45979I2t) getDiContainer().LJ(InterfaceC45979I2t.class, null));
        LLJJIJI((ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null));
        LLJJIJIL((I0N) getDiContainer().LJ(I0N.class, null));
        LLJJIII((W13) getDiContainer().LJ(W13.class, null));
        this.LLD = (InterfaceC82353WTt) getDiContainer().LJIIIIZZ(null, InterfaceC82353WTt.class);
        this.LLF = (C46193IAz) getDiContainer().LJIIIIZZ(null, C46193IAz.class);
    }

    public boolean LLIZ() {
        if (Po0()) {
            m5("");
            return true;
        }
        return false;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public final void hide() {
        super.hide();
        this.LLFF = false;
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLIIZ();
        LLILL();
        initData();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LLFII = true;
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        this.LLFFF = true;
        LLJJJIL();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        this.LLFFF = false;
        LLJ();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public final void show() {
        super.show();
        this.LLFF = true;
    }

    public LiveEvent<WJ0> wH() {
        return LLIIIL();
    }

    public boolean Po0() {
        return this.LLFF;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    public final void GV(I27 i27) {
        o.LJIIIZ(i27, "<set-?>");
        this.LJLLLLLL = i27;
    }

    public final void KE(InterfaceC45889Hzh interfaceC45889Hzh) {
        o.LJIIIZ(interfaceC45889Hzh, "<set-?>");
        this.LJLZ = interfaceC45889Hzh;
    }

    public final void LLJI(InterfaceC88472Yns<? super STATE, ? extends STATE> block) {
        o.LJIIIZ(block, "block");
        if (C5OG.LIZ()) {
            LJJZZI(block);
        } else {
            LJJLL(block);
        }
    }

    public final void LLJJ(InterfaceC82086WJm interfaceC82086WJm) {
        o.LJIIIZ(interfaceC82086WJm, "<set-?>");
        this.LJLLL = interfaceC82086WJm;
    }

    public final void LLJJI(I3X i3x) {
        o.LJIIIZ(i3x, "<set-?>");
        this.LJLLJ = i3x;
    }

    public final void LLJJIII(W13 w13) {
        o.LJIIIZ(w13, "<set-?>");
        this.LL = w13;
    }

    public final void LLJJIJI(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<set-?>");
        this.LJZI = shortVideoContext;
    }

    public final void LLJJIJIL(I0N i0n) {
        o.LJIIIZ(i0n, "<set-?>");
        this.LJZL = i0n;
    }

    public final void R90(InterfaceC45999I3n interfaceC45999I3n) {
        o.LJIIIZ(interfaceC45999I3n, "<set-?>");
        this.LJLLLL = interfaceC45999I3n;
    }

    @Override // X.InterfaceC82201WNx
    public void m5(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        hide();
    }

    public final void oA(InterfaceC45979I2t interfaceC45979I2t) {
        o.LJIIIZ(interfaceC45979I2t, "<set-?>");
        this.LJZ = interfaceC45979I2t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC82428WWq(WMH _parentScene, C82622Wbi diContainer) {
        super(_parentScene);
        o.LJIIIZ(_parentScene, "_parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = _parentScene;
        this.LJLLI = diContainer;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zxzzz_");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        this.LJLLILLLL = X1D.LIZIZ(LIZ);
        this.LLFZ = C221108m2.LIZIZ(C82429WWr.LJLIL);
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 251));
        this.LLII = C221108m2.LIZIZ(new AqS164S0100000_14(this, LiveCoverMinSizeSetting.DEFAULT));
    }

    @Override // X.InterfaceC82201WNx
    public void P3(String effectId, String enterMethod) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(enterMethod, "enterMethod");
        show();
    }

    public static /* synthetic */ void LLILZLL(AbstractC82428WWq abstractC82428WWq, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            abstractC82428WWq.LLILZIL(str, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logD");
    }
}

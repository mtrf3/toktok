package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.WOo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82218WOo extends AbstractC29891Fh<W4F> implements W4F, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLL;
    public final W4F LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final C5H3 LJLJJL;
    public final C82223WOt LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public final WMH LJLJLJ;
    public final C82622Wbi LJLJLLL;

    static {
        TBT tbt = new TBT(C82218WOo.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82218WOo.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82218WOo.class, "contextMayNull", "getContextMayNull()Landroid/content/Context;", 0, c65351Pkp)};
    }

    private final I37 LJJLIIIJILLIZJL() {
        return (I37) this.LJLJI.LIZ(this, LJLL[1]);
    }

    private final C82226WOw LJJLIIIJJI() {
        return (C82226WOw) this.LJLJJL.getValue();
    }

    private final Context LJJLIIIJJIZ() {
        return (Context) this.LJLJJI.LIZ(this, LJLL[2]);
    }

    private final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJLILLLLZI.LIZ(this, LJLL[0]);
    }

    @Override // X.W4F
    public void HL(W4G beautyAction) {
        o.LJIIIZ(beautyAction, "beautyAction");
    }

    @Override // X.W4F
    public boolean Ps() {
        if (o.LJ(this.LJLJL.getValue(), Boolean.TRUE)) {
            return true;
        }
        NavigationScene LJIL = C78897Uxp.LJIL(this.LJLJLJ);
        if (LJIL != null && C79057V0z.LJIILLIIL(LJIL, LJJLIIIJJI())) {
            return true;
        }
        return false;
    }

    private final boolean LJJLIIIIJ() {
        I37 LJJLIIIJILLIZJL;
        String str;
        InterfaceC83142Wk6 f7;
        BeautyFilterConfig S7;
        if (!LJJLIIIJLLLLLLLZ() || LJJLIIIJJIZ() == null || (LJJLIIIJILLIZJL = LJJLIIIJILLIZJL()) == null) {
            return false;
        }
        if (C47918IrK.LIZ(LJJLIIIJJIZ())) {
            if (!LJJLIIIJILLIZJL.f7().O7().isEmpty()) {
                return false;
            }
            I37 LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL2 == null || (f7 = LJJLIIIJILLIZJL2.f7()) == null || (S7 = f7.S7()) == null || (str = String.valueOf(S7.getBeautyOptimizeEffectChange())) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C82514WZy.LIZ(CardStruct.IStatusCode.DEFAULT, str, CardStruct.IStatusCode.DEFAULT);
            InterfaceC88471Ynr<Context, String, C76800UCe> Gk = LJJLIIIJILLIZJL.Gk();
            if (Gk != null) {
                Context LJJLIIIJJIZ = LJJLIIIJJIZ();
                o.LJI(LJJLIIIJJIZ);
                Gk.invoke(LJJLIIIJJIZ, "");
            }
            if (!LJJLIIIJILLIZJL.Mp0()) {
                LJJLIIIJILLIZJL.aU();
            }
            return true;
        }
        if (LJJLIIJ()) {
            C82514WZy.LIZ("1", "1", "1");
            InterfaceC88471Ynr<Context, String, C76800UCe> Gk2 = LJJLIIIJILLIZJL.Gk();
            if (Gk2 != null) {
                Context LJJLIIIJJIZ2 = LJJLIIIJJIZ();
                o.LJI(LJJLIIIJJIZ2);
                Gk2.invoke(LJJLIIIJJIZ2, "");
            }
            return true;
        }
        if (!LJJLJ() || (!LJJLIIIJILLIZJL.f7().O7().isEmpty())) {
            return false;
        }
        C82514WZy.LIZ("1", "2", "1");
        InterfaceC88471Ynr<Context, String, C76800UCe> Gk3 = LJJLIIIJILLIZJL.Gk();
        if (Gk3 != null) {
            Context LJJLIIIJJIZ3 = LJJLIIIJJIZ();
            o.LJI(LJJLIIIJJIZ3);
            Gk3.invoke(LJJLIIIJJIZ3, "");
        }
        return true;
    }

    private final boolean LJJLIIIJLLLLLLLZ() {
        InterfaceC83142Wk6 f7;
        BeautyFilterConfig S7;
        InterfaceC83142Wk6 f72;
        BeautyFilterConfig S72;
        I37 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null && (f72 = LJJLIIIJILLIZJL.f7()) != null && (S72 = f72.S7()) != null && S72.getBeautyOptimizeEffectChange() == 1) {
            return true;
        }
        I37 LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL2 != null && (f7 = LJJLIIIJILLIZJL2.f7()) != null && (S7 = f7.S7()) != null && S7.getBeautyOptimizeEffectChange() == 2) {
            return true;
        }
        return false;
    }

    private final boolean LJJLIIJ() {
        InterfaceC83142Wk6 f7;
        BeautyFilterConfig S7;
        I37 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null && (f7 = LJJLIIIJILLIZJL.f7()) != null && (S7 = f7.S7()) != null && S7.getBeautyOptimizeEffectChange() == 1) {
            return true;
        }
        return false;
    }

    private final boolean LJJLJ() {
        InterfaceC83142Wk6 f7;
        BeautyFilterConfig S7;
        I37 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null && (f7 = LJJLIIIJILLIZJL.f7()) != null && (S7 = f7.S7()) != null && S7.getBeautyOptimizeEffectChange() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.W4F
    public void S5() {
        InterfaceC82227WOx interfaceC82227WOx = LJJLIIIJJI().LJLL;
        if (interfaceC82227WOx != null) {
            interfaceC82227WOx.S5();
        }
    }

    @Override // X.W4F
    public /* bridge */ /* synthetic */ LiveData LLJLILLLLZIIL() {
        return this.LJLJL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ W4F getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJLLL;
    }

    @Override // X.W4F
    public void CK(boolean z) {
        if (LJJLIIIIJ()) {
            return;
        }
        NavigationScene LJIL = C78897Uxp.LJIL(this.LJLJLJ);
        o.LJI(LJIL);
        if (z && !C79057V0z.LJIILLIIL(LJIL, LJJLIIIJJI())) {
            this.LJLJL.setValue(Boolean.TRUE);
            InterfaceC82353WTt gestureApiComponent = getGestureApiComponent();
            if (gestureApiComponent != null) {
                WTL.LIZ(gestureApiComponent, true);
            }
            LJJLIIIJJI().LJLJJI = new C82221WOr(this);
            C82226WOw LJJLIIIJJI = LJJLIIIJJI();
            C42663Gol c42663Gol = new C42663Gol();
            c42663Gol.LIZ = true;
            c42663Gol.LIZJ = new C82224WOu();
            LJIL.LLJJJJ(LJJLIIIJJI, c42663Gol.LIZ());
            return;
        }
        if (!C79057V0z.LJIILLIIL(LJIL, LJJLIIIJJI())) {
            return;
        }
        LJIL.onBackPressed();
    }

    public C82226WOw LJJLI(C82622Wbi objectContainer) {
        o.LJIIIZ(objectContainer, "objectContainer");
        return new C82226WOw(objectContainer, this.LJLJJLL.LIZ);
    }

    public final void LJJLJLI(boolean z) {
        this.LJLJL.setValue(Boolean.valueOf(z));
    }

    public C82218WOo(WMH parent, C82622Wbi diContainer, InterfaceC88472Yns<? super C82223WOt, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJLJ = parent;
        this.LJLJLLL = diContainer;
        this.LJLIL = this;
        this.LJLILLLLZI = UCI.LJII(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJLJI = UCI.LJII(getDiContainer(), I37.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), Context.class, null);
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 36));
        C82223WOt c82223WOt = new C82223WOt(0);
        this.LJLJJLL = c82223WOt;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c82223WOt);
        }
        this.LJLJL = new MutableLiveData<>();
    }

    public /* synthetic */ C82218WOo(WMH wmh, C82622Wbi c82622Wbi, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, c82622Wbi, (i & 4) != 0 ? null : interfaceC88472Yns);
    }
}

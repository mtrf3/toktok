package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wc9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82649Wc9 extends AbstractC48231ut<InterfaceC45633HvZ, C82666WcQ, C82655WcF, C82652WcC> implements InterfaceC45633HvZ, InterfaceC135635Tz, C0IA {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC65784Pro<C82655WcF> LJLLILLLL;
    public final InterfaceC65784Pro<C82652WcC> LJLLJ;
    public final C29901Fi<Integer> LJLLL;
    public final C29901Fi<Boolean> LJLLLL;
    public final C29901Fi<OSZ<Integer, Integer>> LJLLLLLL;
    public final C29901Fi<OSZ<Integer, Integer>> LJLZ;
    public final LiveEvent<Integer> LJZ;
    public final LiveEvent<Boolean> LJZI;
    public final LiveEvent<OSZ<Integer, Integer>> LJZL;
    public final LiveEvent<OSZ<Integer, Integer>> LL;
    public final C45584Hum<String> LLD;

    static {
        TBT tbt = new TBT(C82649Wc9.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LLF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC45633HvZ
    public void Wi() {
        LJJZZI(C82650WcA.LJLIL);
    }

    @Override // X.InterfaceC45633HvZ
    public void gO() {
        LJJZZI(C82651WcB.LJLIL);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLLI.LIZ(this, LLF[0]);
    }

    @Override // X.InterfaceC45633HvZ
    public MyMediaModel hO() {
        return (MyMediaModel) LJJLIIIJLLLLLLLZ().LIZIZ(new TBT() { // from class: X.WcD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82655WcF) obj).LIZ;
            }
        }).LIZ();
    }

    @Override // X.InterfaceC45633HvZ
    public C45584Hum<String> BY() {
        return this.LLD;
    }

    @Override // X.InterfaceC45633HvZ
    public LiveEvent<Boolean> GF() {
        return this.LJZI;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82655WcF> LJJLIIIJJI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82652WcC> LJJLIIIJJIZ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC45633HvZ
    public LiveEvent<OSZ<Integer, Integer>> mU() {
        return this.LL;
    }

    @Override // X.InterfaceC45633HvZ
    public LiveEvent<OSZ<Integer, Integer>> q70() {
        return this.LJZL;
    }

    @Override // X.InterfaceC45633HvZ
    public LiveEvent<Integer> qU() {
        return this.LJZ;
    }

    @Override // X.InterfaceC45633HvZ
    public void EZ(int i) {
        LJJZZI(new AqS38S0001000_14(i, 6));
    }

    @Override // X.InterfaceC45633HvZ
    public void NZ(List<MyMediaModel> models) {
        o.LJIIIZ(models, "models");
        LJJZZI(new AqS180S0100000_14(models, 163));
        for (MyMediaModel myMediaModel : models) {
            C45584Hum<String> c45584Hum = this.LLD;
            String str = myMediaModel.id;
            o.LJIIIIZZ(str, "it.id");
            MyMediaModel LJIIIIZZ = myMediaModel.LJIIIIZZ();
            if (!c45584Hum.LIZ.containsKey(str)) {
                c45584Hum.LIZ.put(str, LJIIIIZZ);
            }
        }
    }

    @Override // X.InterfaceC45633HvZ
    public void mV(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 16));
    }

    @Override // X.InterfaceC45633HvZ
    public void oW(int i) {
        LJJZZI(new AqS38S0001000_14(i, 7));
    }

    @Override // X.InterfaceC45633HvZ
    public void show(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    @Override // X.InterfaceC45633HvZ
    public void xq(MyMediaModel curMediaModel) {
        o.LJIIIZ(curMediaModel, "curMediaModel");
        this.LJLLL.LJII(Integer.valueOf(curMediaModel.startTime));
        LJJZZI(new AqS180S0100000_14(curMediaModel, 162));
        C45584Hum<String> c45584Hum = this.LLD;
        String str = curMediaModel.id;
        o.LJIIIIZZ(str, "curMediaModel.id");
        MyMediaModel LJIIIIZZ = curMediaModel.LJIIIIZZ();
        if (!c45584Hum.LIZ.containsKey(str)) {
            c45584Hum.LIZ.put(str, LJIIIIZZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82649Wc9(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLILLLL = C82654WcE.LJLIL;
        this.LJLLJ = new AqS164S0100000_14(this, 155);
        C29901Fi<Integer> c29901Fi = new C29901Fi<>();
        this.LJLLL = c29901Fi;
        C29901Fi<Boolean> c29901Fi2 = new C29901Fi<>();
        this.LJLLLL = c29901Fi2;
        C29901Fi<OSZ<Integer, Integer>> c29901Fi3 = new C29901Fi<>();
        this.LJLLLLLL = c29901Fi3;
        C29901Fi<OSZ<Integer, Integer>> c29901Fi4 = new C29901Fi<>();
        this.LJLZ = c29901Fi4;
        this.LJZ = c29901Fi;
        this.LJZI = c29901Fi2;
        this.LJZL = c29901Fi3;
        this.LL = c29901Fi4;
        this.LLD = ((ChooseMediaViewModel) C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(parentScene), parentScene).LIZ(ChooseMediaViewModel.class)).LJLLILLLL;
    }
}

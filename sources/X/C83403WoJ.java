package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WoJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83403WoJ extends AbstractC29891Fh<InterfaceC147645qq> implements InterfaceC147645qq, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final List<AbstractC83417WoX> LJLJJL;
    public final InterfaceC83391Wo7 LJLJJLL;
    public final InterfaceC83391Wo7 LJLJL;

    static {
        TBT tbt = new TBT(C83403WoJ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C83403WoJ.class, "actionAIApi", "getActionAIApi()Lcom/ss/android/ugc/aweme/actionai/bot/ActionAIApi;", 0, c65351Pkp)};
    }

    public InterfaceC147645qq LJJLIIIIJ() {
        return this;
    }

    private final void LJJLIIIJJIZ() {
        C2VQ.LIZ(new AqS164S0100000_14(this, 197));
    }

    public final InterfaceC83402WoI LJJLI() {
        return (InterfaceC83402WoI) this.LJLJJI.LIZ(this, LJLJLJ[1]);
    }

    public final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLJI.LIZ(this, LJLJLJ[0]);
    }

    private final void LJJLIIIJJI() {
        LJJLI().RI(this.LJLJJLL);
    }

    @Override // X.InterfaceC147645qq
    public void JT() {
        LiveData<OSJ<Boolean, Boolean, Boolean>> Zq0;
        OSJ<Boolean, Boolean, Boolean> value;
        InterfaceC143655kP LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null && (Zq0 = LJJLIIIJILLIZJL.Zq0()) != null && (value = Zq0.getValue()) != null && !value.getFirst().booleanValue()) {
            return;
        }
        LJJLI().show();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIJJIZ();
        LJJLIIIJJI();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C45233Hp7.LJLJLJ.getClass();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC147645qq getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public C83403WoJ(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = UCI.LJII(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC83402WoI.class, null);
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new C83405WoL(this);
        this.LJLJL = new C83407WoN();
    }
}

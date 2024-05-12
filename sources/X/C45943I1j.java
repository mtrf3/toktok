package X;

import Y.AObjectS86S0100000_7;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.I1j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45943I1j extends AbstractC29891Fh<InterfaceC45944I1k> implements InterfaceC135635Tz, InterfaceC45944I1k {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC45944I1k LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;

    static {
        TBT tbt = new TBT(C45943I1j.class, "bottomTabApi", "getBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C45943I1j.class, "splitShootApi", "getSplitShootApi()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp)};
    }

    private final InterfaceC45979I2t LJJLI() {
        return (InterfaceC45979I2t) this.LJLJI.LIZ(this, LJLJJL[0]);
    }

    private final I3K LJJLIIIIJ() {
        return (I3K) this.LJLJJI.LIZ(this, LJLJJL[1]);
    }

    private final void handleBackFromTextMode() {
        String string = C78688UuS.LJIJJ(this).getString(R.string.pw8);
        o.LJIIIIZZ(string, "activity.getString(R.str…mode_lightening_text_tag)");
        if (o.LJ(LJJLIIIIJ().a9(), string)) {
            LJJLIIIIJ().rG(true, 7);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIIJ().fv0().LIZLLL(this, new AObjectS86S0100000_7(this, 213));
        if (OI2.LJIIIZ()) {
            OI2.LJIIJ();
        } else {
            OI2.LIZJ();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        handleBackFromTextMode();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45944I1k getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C45943I1j(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), I3K.class, null);
    }

    public final void LJJLIIIJILLIZJL(WS0 ws0) {
        if (o.LJ(ws0.LIZIZ, I38.RECORD_LIGHTENING_TEXT.getTag())) {
            IOpenTextNextService.DefaultImpls.openTextModeCanvas$default(AVExternalServiceImpl.LIZ().openTextNextService(), LJJLI().provideRecordEnv(), ws0.LIZJ, null, 4, null);
        }
    }
}

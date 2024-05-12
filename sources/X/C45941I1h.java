package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.I1h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45941I1h extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C6V1 LJLJJL;
    public final C82632Wbs LJLJJLL;

    static {
        TBT tbt = new TBT(C45941I1h.class, "bottomTabApi", "getBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WJB
    public final void LJFF() {
        IOpenTextNextService.DefaultImpls.openTextModeCanvas$default(AVExternalServiceImpl.LIZ().openTextNextService(), ((InterfaceC45979I2t) this.LJLJJLL.LIZ(this, LJLJL[0])).provideRecordEnv(), 10, null, 4, null);
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6V1] */
    public C45941I1h(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = new WI1() { // from class: X.6V1
            @Override // X.WI1
            public final int LJ() {
                return R.raw.icon_text_background;
            }

            @Override // X.WI1
            public final int LJII() {
                return R.string.e72;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                VLL vll = VLL.SLIDE;
                WJV.LIZ().getText();
                return new WI0(vll, 19, false);
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return C6MP.TEXT;
            }
        };
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC45979I2t.class, null);
    }
}

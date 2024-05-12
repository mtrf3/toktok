package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134315Ox extends AbstractC29891Fh<InterfaceC134335Oz> implements InterfaceC134335Oz, InterfaceC135635Tz, InterfaceC70422pa {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC74322vs LJLJI;
    public final InterfaceC134325Oy LJLJJI;

    static {
        TBT tbt = new TBT(C134315Ox.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC134335Oz LJJLI() {
        return this;
    }

    @Override // X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return C36636EZk.LIZ.plus(T2R.LJIIJJI());
    }

    private final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLILLLLZI.LIZ(this, LJLJJL[0]);
    }

    private final NLEModel LJJLIIIIJ() {
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        if (value != null) {
            return C17N.LJJ(value);
        }
        return null;
    }

    private final void LJJLIIIJJI() {
        NLEModel LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null) {
            return;
        }
        String LIZ = this.LJLJJI.LIZ(LJJLIIIIJ);
        if (!this.LJLJI.LIZIZ(LIZ)) {
            this.LJLJI.LIZJ(this, LIZ);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C48841JEv.LIZJ(this, null);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        LJJLIIIJJI();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC134335Oz getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C134315Ox(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJI = new C74282vo(C78688UuS.LJJIII(this), getDiContainer());
        this.LJLJJI = new C63183Oqx();
    }

    @Override // X.InterfaceC134335Oz
    public Object ra(InterfaceC67352kd<? super String> interfaceC67352kd) {
        return this.LJLJI.LIZ(this.LJLJJI.LIZ(LJJLIIIIJ()), interfaceC67352kd);
    }
}

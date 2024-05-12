package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WZe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82494WZe implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public InterfaceC88472Yns<? super byte[], C76800UCe> LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        TBT tbt = new TBT(C82494WZe.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    public final void LIZ() {
        this.LJLJI = false;
        this.LJLJJI = false;
        ((C5T7) this.LJLJJLL.getValue()).LIZJ(C171196nj.LIZIZ);
        ((C5T7) this.LJLJJLL.getValue()).LIZJ.setRecorderListener(null);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82494WZe(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJJL = C82503WZn.LJLIL;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 286));
        this.LJLJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 285));
    }
}

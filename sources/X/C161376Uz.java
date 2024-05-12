package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161376Uz extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C6V0 LJLJJL;
    public final C82631Wbr LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C62822Ol8 LJLJLJ;

    static {
        TBT tbt = new TBT(C161376Uz.class, "recordAddYoursStickerApi", "getRecordAddYoursStickerApi()Lcom/ss/android/ugc/aweme/addyours/RecordAddYoursStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C161376Uz.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
        C82631Wbr c82631Wbr = this.LJLJJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJLLL;
        InterfaceC161186Ug interfaceC161186Ug = (InterfaceC161186Ug) c82631Wbr.LIZ(this, interfaceC74236TBoArr[0]);
        if (interfaceC161186Ug != null) {
            interfaceC161186Ug.sp();
        }
        C161226Uk.LIZLLL(this.LJLJL.LIZ(this, interfaceC74236TBoArr[1]));
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJLJLJ.getValue()).booleanValue();
    }

    @Override // X.WJB
    public final /* bridge */ /* synthetic */ WI1 LIZJ() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6V0] */
    public C161376Uz(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = new WI1() { // from class: X.6V0
            public final C6MP LJIIIZ;
            public WI0 LJIIJ;

            {
                C6MP toolbarType = C6MP.ADD_YOURS;
                o.LJIIIZ(toolbarType, "toolbarType");
                this.LJIIIZ = toolbarType;
                VLL vll = VLL.SLIDE;
                WJV.LIZ().LIZLLL();
                this.LJIIJ = new WI0(vll, 105, false);
            }

            @Override // X.WI1
            public final int LJFF() {
                return C6UX.LIZ();
            }

            @Override // X.WI1
            public final int LJII() {
                return C6UX.LIZIZ();
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return this.LJIIJ;
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIIZ;
            }

            @Override // X.WI1
            public final void LIZ(WI0 wi0) {
                this.LJIIJ = wi0;
            }
        };
        this.LJLJJLL = UCI.LJII(diContainer, InterfaceC161186Ug.class, null);
        this.LJLJL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 662));
    }
}

package X;

import Y.AObjectS86S0100000_7;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I1l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45945I1l extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82631Wbr LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82047WHz LJLJL;

    static {
        TBT tbt = new TBT(C45945I1l.class, "duetLayoutApiComponent", "getDuetLayoutApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/duet/DuetLayoutApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C45945I1l.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C45945I1l.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        C82622Wbi c82622Wbi = this.LJLJJI;
        if (L2L.LIZ(c82622Wbi)) {
            ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(InterfaceC45921I0n.class, new AqS173S0100000_7(this, 222));
            return;
        }
        C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC45921I0n.class);
        if (c0i6 == null) {
            return;
        }
        InterfaceC45921I0n interfaceC45921I0n = (InterfaceC45921I0n) c0i6;
        interfaceC45921I0n.t5().LIZLLL(this.LJLJI, new AObjectS86S0100000_7(this, 239));
        interfaceC45921I0n.tA().LIZLLL(this.LJLJI, new AObjectS86S0100000_7(this, 240));
    }

    @Override // X.WJB
    public final void LJFF() {
        InterfaceC45921I0n interfaceC45921I0n = (InterfaceC45921I0n) this.LJLJJL.LIZ(this, LJLJLJ[0]);
        if (interfaceC45921I0n != null) {
            interfaceC45921I0n.show(true);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIIZ().LJI());
        c145995oB.LJI("shoot_way", LJIIIZ().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("content_type", LJIIIZ().LIZLLL().getContentType());
        c145995oB.LJI("content_source", LJIIIZ().LIZLLL().getContentSource());
        FMX.LJIIL("click_layout_entrance", c145995oB.LIZ);
    }

    public final ShortVideoContext LJIIIZ() {
        return (ShortVideoContext) this.LJLJJLL.LIZ(this, LJLJLJ[1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.L95.LIZIZ() != false) goto L6;
     */
    @Override // X.WJB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ() {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.LJIIIZ()
            boolean r0 = X.C43846HIs.LIZ(r0)
            if (r0 != 0) goto L19
            X.HEa r0 = X.C78934UyQ.LJLIL
            X.HF1 r0 = r0.LIZLLL()
            r0.getClass()
            boolean r0 = X.L95.LIZIZ()
            if (r0 == 0) goto L21
        L19:
            boolean r0 = X.HWY.LIZ()
            if (r0 != 0) goto L21
            r0 = 1
        L20:
            return r0
        L21:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45945I1l.LJIIIIZZ():boolean");
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C45945I1l(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJII(diContainer, InterfaceC45921I0n.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        C82632Wbs LJI = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJL = new C82047WHz((InterfaceC82086WJm) LJI.LIZ(this, LJLJLJ[2]), LJIIIZ());
    }
}

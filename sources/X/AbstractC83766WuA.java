package X;

import X.InterfaceC36140EGi;
import Y.AObjectS89S0100000_14;
import com.ss.android.ugc.aweme.shortvideo.model.LivePhotoModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WuA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83766WuA<T extends InterfaceC36140EGi> extends AbstractC29891Fh<T> implements InterfaceC36140EGi, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJZL;
    public final InterfaceC70422pa LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final VERecorder LJLJI;
    public final C83770WuE LJLJJI;
    public List<InterfaceC65784Pro<C76800UCe>> LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public final List<EnumC83774WuI> LJLLI;
    public final List<EnumC83774WuI> LJLLILLLL;
    public final VEVideoEncodeSettings LJLLJ;
    public long LJLLL;
    public final InterfaceC29911Fj<AbstractC83786WuU> LJLLLL;
    public final InterfaceC29911Fj<EnumC83774WuI> LJLLLLLL;
    public final C82622Wbi LJLZ;
    public final WMH LJZ;
    public final C83787WuV LJZI;

    static {
        TBT tbt = new TBT(AbstractC83766WuA.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJZL = new InterfaceC74236TBo[]{tbt};
    }

    public static /* synthetic */ void LJJLI() {
    }

    @Override // X.InterfaceC36140EGi
    public Object E90(float f, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return LJJZZI(this, f, interfaceC67352kd);
    }

    public abstract LivePhotoModel LJJLIIIIJ();

    public void LJJLIIIJLLLLLLLZ(int i) {
    }

    public Object LJJLJ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return LJJLJLI(this, interfaceC67352kd);
    }

    public abstract Object LJLIIL(String str, InterfaceC67352kd<? super String> interfaceC67352kd);

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLILLLLZI.LIZ(this, LJZL[0]);
    }

    @Override // X.InterfaceC36140EGi
    public Object nF(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return LJJLIIIJILLIZJL(this, interfaceC67352kd);
    }

    @Override // X.InterfaceC36140EGi
    public boolean B20() {
        if ((this.LJLJJI.LIZIZ.LIZ() != EnumC83774WuI.START && this.LJLJJI.LIZIZ.LIZ() != EnumC83774WuI.END) || !d00() || !jx()) {
            return false;
        }
        return true;
    }

    public final boolean LJJLIIIJJI() {
        if (this.LJLJJI.LIZIZ.LIZ() == EnumC83774WuI.LIVE_PHOTO_RECORDING) {
            return true;
        }
        return false;
    }

    public final void LJJLIIIJJIZ() {
        this.LJLJJI.LIZLLL.LJ(this.LJLLLL);
        this.LJLJJI.LIZIZ.LIZJ(this.LJLLLLLL);
    }

    public void LJJLL() {
        VERecorder vERecorder = this.LJLJI;
        vERecorder.LIZIZ.changeRecordMode(VERecordMode.DEFAULT);
        VERecorder vERecorder2 = this.LJLJI;
        VEVideoEncodeSettings vEVideoEncodeSettings = vERecorder2.LIZIZ.mVideoEncodeSettings;
        if (vEVideoEncodeSettings != null) {
            C87278YNe c87278YNe = new C87278YNe(vEVideoEncodeSettings);
            VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe.LIZIZ;
            vEVideoEncodeSettings2.maxCacheDuration = -1;
            vEVideoEncodeSettings2.keyFrameDuration = -1;
            vERecorder2.LIZIZ.changeVideoEncodeSettings(c87278YNe.LIZ());
        } else {
            C87278YNe c87278YNe2 = new C87278YNe(1);
            VEVideoEncodeSettings vEVideoEncodeSettings3 = c87278YNe2.LIZIZ;
            vEVideoEncodeSettings3.maxCacheDuration = -1;
            vEVideoEncodeSettings3.keyFrameDuration = -1;
            vERecorder2.LIZIZ.changeVideoEncodeSettings(c87278YNe2.LIZ());
        }
        try {
            C82891Wg3.LIZLLL().i("livephoto clear all frags");
            this.LJLJI.LIZIZ.clearAllFrags();
        } catch (VEException e) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("livephoto ");
            LIZ.append(e.getMessage());
            LIZLLL.i(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC36140EGi
    public boolean X50() {
        return !this.LJLLI.contains(this.LJLJJI.LIZIZ.LIZ());
    }

    @Override // X.InterfaceC36140EGi
    public boolean p50() {
        return this.LJLLILLLL.contains(this.LJLJJI.LIZIZ.LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC36140EGi
    public void mb0() {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("livephoto on first frame, shouldStart: ");
        LIZ.append(d00());
        LIZLLL.i(X1D.LIZIZ(LIZ));
        boolean z = false;
        this.LJLJLLL = false;
        C83770WuE c83770WuE = this.LJLJJI;
        T LIZ2 = c83770WuE.LIZIZ.LIZ();
        o.LJIIIIZZ(LIZ2, "statusMachine.status.value");
        EnumC83774WuI enumC83774WuI = (EnumC83774WuI) LIZ2;
        if (d00() && jx()) {
            z = true;
        }
        c83770WuE.LIZ(new C83772WuG(enumC83774WuI, z));
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getCameraApiComponent().Ch0().LIZLLL(this, new AObjectS89S0100000_14(this, 155));
        getCameraApiComponent().oX().LIZLLL(this, new AObjectS89S0100000_14(this, 156));
        getCameraApiComponent().HJ().LIZLLL(this, new AObjectS89S0100000_14(this, 157));
        LJJLIIIJJIZ();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C48841JEv.LIZJ(this.LJLIL, null);
        this.LJLJJI.LIZLLL.LJFF(this.LJLLLL);
        this.LJLJJI.LIZIZ.LJFF(this.LJLLLLLL);
        this.LJLJJL.clear();
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLZ;
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
    }

    public void LJJLIIJ(InterfaceC65784Pro<C76800UCe> onDone) {
        o.LJIIIZ(onDone, "onDone");
        C82891Wg3.LIZLLL().d("livephoto stop pre record");
        this.LJLJI.LJIILJJIL(new C83769WuD(this, onDone));
    }

    @Override // X.InterfaceC36140EGi
    public void ZT(InterfaceC65784Pro<C76800UCe> actionAfter) {
        o.LJIIIZ(actionAfter, "actionAfter");
        C82891Wg3.LIZLLL().i("livephoto stop prerecord");
        if (this.LJLJJI.LIZIZ.LIZ() == EnumC83774WuI.LIVE_PHOTO_RECORDING) {
            VP(false, false, true, true);
        }
        this.LJLJJL.add(actionAfter);
    }

    @Override // X.InterfaceC36140EGi
    public void kq0(long j) {
        XKX.LIZLLL(this.LJLIL, null, null, new C36139EGh(this, j, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object LJJLIIIJILLIZJL(AbstractC83766WuA abstractC83766WuA, InterfaceC67352kd interfaceC67352kd) {
        C83770WuE c83770WuE = abstractC83766WuA.LJLJJI;
        T LIZ = c83770WuE.LIZIZ.LIZ();
        o.LJIIIIZZ(LIZ, "statusMachine.status.value");
        c83770WuE.LIZ(new C83778WuM((EnumC83774WuI) LIZ));
        return C76800UCe.LIZ;
    }

    public static Object LJJLJLI(AbstractC83766WuA abstractC83766WuA, InterfaceC67352kd interfaceC67352kd) {
        Object LJI = XKX.LJI(EXX.LIZ, new C83767WuB(abstractC83766WuA, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJJZZIII(String scene, boolean z) {
        o.LJIIIZ(scene, "scene");
        this.LJLJL = scene;
        C83770WuE c83770WuE = this.LJLJJI;
        T LIZ = c83770WuE.LIZIZ.LIZ();
        o.LJIIIIZZ(LIZ, "statusMachine.status.value");
        c83770WuE.LIZ(new C83775WuJ((EnumC83774WuI) LIZ));
    }

    public final void LJLJJL(String scene, boolean z) {
        o.LJIIIZ(scene, "scene");
        XKX.LIZLLL(this.LJLIL, null, null, new C36141EGj(this, scene, z, null), 3);
    }

    public AbstractC83766WuA(C82622Wbi diContainer, WMH parentScene, C83787WuV config) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(config, "config");
        this.LJLZ = diContainer;
        this.LJZ = parentScene;
        C64962gm LIZIZ = C48841JEv.LIZIZ();
        this.LJLIL = LIZIZ;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJI = getCameraApiComponent().rX().LJ();
        this.LJLJJI = new C83770WuE(LIZIZ);
        this.LJLJJL = new ArrayList();
        throw null;
    }

    public static Object LJJZZI(AbstractC83766WuA abstractC83766WuA, float f, InterfaceC67352kd interfaceC67352kd) {
        Object LJI = XKX.LJI(EXX.LIZ, new C83765Wu9(abstractC83766WuA, f, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC36140EGi
    public void VP(boolean z, boolean z2, boolean z3, boolean z4) {
        C83770WuE c83770WuE = this.LJLJJI;
        T LIZ = c83770WuE.LIZIZ.LIZ();
        o.LJIIIIZZ(LIZ, "statusMachine.status.value");
        c83770WuE.LIZ(new C83781WuP((EnumC83774WuI) LIZ, z));
    }
}

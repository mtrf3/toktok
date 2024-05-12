package X;

import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS0S0130000_2;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS45S0110000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169236kZ extends AbstractC48231ut<C5U4, C169376kn, C169356kl, C169316kh> implements C5U4, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public boolean LJLZ;

    static {
        TBT tbt = new TBT(C169236kZ.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C169236kZ.class, "aeVoiceChangeApiComponent", "getAeVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/AEVoiceChangeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C169236kZ.class, "aeVolumeApiComponent", "getAeVolumeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/volume/AEVolumeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C169236kZ.class, "aeRecordApiComponent", "getAeRecordApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/record/AERecordApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C169236kZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C169236kZ.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0, c65351Pkp)};
    }

    private final void LLILZLL() {
        boolean LJJJLZIJ = LLIFFJFJJ().LJJJLZIJ();
        boolean p4 = LLFFF().p4();
        boolean LJJJLZIJ2 = LLIIIL().LJJJLZIJ();
        if (!LJJJLZIJ && !p4 && !LJJJLZIJ2) {
            LJLZ();
        } else {
            LLJ(C78688UuS.LJIJJ(this), new AqS0S0130000_2(p4, this, LJJJLZIJ, LJJJLZIJ2, 0));
        }
    }

    public final void LLIZ() {
        this.LJLZ = false;
        LJJZZI(C169276kd.LJLIL);
        LLFFF().cr0(new AqS152S0100000_2(this, 178));
    }

    private final void LJZI() {
        Number valueOf;
        C62A.LIZ.getClass();
        if (C62A.LIZJ()) {
            valueOf = Double.valueOf((((C81184Vtc.LIZIZ(C78688UuS.LJIJJ(this)) * 0.55d) - C81184Vtc.LJFF(C78688UuS.LJIJJ(this))) - C81184Vtc.LIZJ(C78688UuS.LJIJJ(this))) - SFS.LJI(44.0d));
        } else {
            valueOf = Integer.valueOf(((C81184Vtc.LIZIZ(C78688UuS.LJIJJ(this)) - ((int) KL2.LIZJ(C78688UuS.LJIJJ(this), 334.0f))) - C81184Vtc.LJFF(C78688UuS.LJIJJ(this))) - C81184Vtc.LIZJ(C78688UuS.LJIJJ(this)));
        }
        int LIZIZ = C04330Ez.LIZIZ(C78688UuS.LJIJJ(this), R.color.b5);
        int LJFF = C81184Vtc.LJFF(C78688UuS.LJIJJ(this)) + ((int) KL2.LIZJ(C78688UuS.LJIJJ(this), 44.0f));
        int LIZJ = (int) KL2.LIZJ(C78688UuS.LJIJJ(this), 290.0f);
        int intValue = valueOf.intValue();
        AnonymousClass668.LIZIZ().LIZ();
        C140335f3 LIZIZ2 = C140345f4.LIZIZ(LIZIZ, LJFF, LIZJ, intValue, false, false, 960);
        int LIZIZ3 = C04330Ez.LIZIZ(C78688UuS.LJIJJ(this), R.color.b5);
        int LJFF2 = C81184Vtc.LJFF(C78688UuS.LJIJJ(this)) + ((int) KL2.LIZJ(C78688UuS.LJIJJ(this), 44.0f));
        int LIZJ2 = (int) KL2.LIZJ(C78688UuS.LJIJJ(this), 290.0f);
        int intValue2 = valueOf.intValue();
        AnonymousClass668.LIZIZ().LIZ();
        LLIILZL().XY(new AqS106S0300000_2(this, LIZIZ2, C140345f4.LIZ(LIZIZ3, LJFF2, LIZJ2, intValue2), 3));
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C169316kh> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 179);
    }

    public final InterfaceC169246ka LLFFF() {
        return (InterfaceC169246ka) this.LJLLL.LIZ(this, LJZ[3]);
    }

    public final InterfaceC135485Tk LLIFFJFJJ() {
        return (InterfaceC135485Tk) this.LJLLILLLL.LIZ(this, LJZ[1]);
    }

    public final InterfaceC168156ip LLIIIL() {
        return (InterfaceC168156ip) this.LJLLJ.LIZ(this, LJZ[2]);
    }

    public final C5VE LLIILZL() {
        return (C5VE) this.LJLLI.LIZ(this, LJZ[0]);
    }

    public final InterfaceC150685vk LLIIZ() {
        return (InterfaceC150685vk) this.LJLLLLLL.LIZ(this, LJZ[5]);
    }

    public final InterfaceC143655kP LLILL() {
        return (InterfaceC143655kP) this.LJLLLL.LIZ(this, LJZ[4]);
    }

    public final void LJLZ() {
        LLFFF().Z3(new C5F9() { // from class: X.6kj
            @Override // X.C5F9
            public final void LIZIZ() {
            }

            @Override // X.C5F9
            public final void LIZ() {
                C1DH.LJJIJIIJI(new ARunnableS38S0100000_2(C169236kZ.this, 52));
            }
        });
    }

    public final boolean LLF() {
        if (LLFFF().isRecording() || LLFFF().Bl0()) {
            return true;
        }
        return false;
    }

    public final void mh0() {
        LLFFF().mh0();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        LJZI();
        super.show();
        mh0();
        LLILL().DM().observe(this, new AObserverS70S0100000_2(this, 46));
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C169356kl> LJJLIIIJJI() {
        return C169346kk.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.C5U4
    public boolean isPlaying() {
        return this.LJLZ;
    }

    @Override // X.C5U4
    public void p60() {
        LLILZLL();
    }

    public final void LLILZIL(boolean z) {
        if (LLIFFJFJJ().CZ()) {
            LLFFF().Mq0(new AqS45S0110000_2(this, z, 1));
        } else {
            LLIFFJFJJ().LLJILJIL(z);
            LLFFF().LLJILJIL(z);
        }
        this.LJLZ = z;
    }

    @Override // X.C5U4
    public void LLJILJIL(boolean z) {
        LLIFFJFJJ().LLJILJIL(z);
        LLFFF().LLJILJIL(z);
        LJJZZI(new AqS7S0010000_2(z, 16));
        this.LJLZ = z;
    }

    @Override // X.C5U4
    public void OZ(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 17));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C169236kZ(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), C5VE.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC135485Tk.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC168156ip.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC169246ka.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), InterfaceC150685vk.class, null);
    }

    private final void LLJ(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.za);
        UC0.LIZJ(c26227ARb, new AqS168S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 117));
        c26227ARb.LJI().LIZLLL();
    }
}

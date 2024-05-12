package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I9c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46144I9c {
    public IA6 LIZ;
    public C46151I9j LIZIZ;
    public final boolean LIZJ;
    public InterfaceC65784Pro<Boolean> LIZLLL;
    public IAA LJ;
    public InterfaceC88472Yns<? super CameraComponentModel, Integer> LJFF;
    public IA3 LJI;
    public boolean LJII;
    public IAE LJIIIIZZ;
    public IAD LJIIIZ;
    public InterfaceC88472Yns<? super CameraComponentModel, Boolean> LJIIJ;
    public final InterfaceC88472Yns<? super CameraComponentModel, Boolean> LJIIJJI;
    public final boolean LJIIL;
    public InterfaceC65784Pro<Boolean> LJIILIIL;
    public final InterfaceC65784Pro<Boolean> LJIILJJIL;
    public final boolean LJIILL;
    public boolean LJIILLIIL;
    public final InterfaceC65784Pro<Boolean> LJIIZILJ;

    public C46144I9c() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46144I9c)) {
            return false;
        }
        C46144I9c c46144I9c = (C46144I9c) obj;
        return o.LJ(this.LIZ, c46144I9c.LIZ) && o.LJ(this.LIZIZ, c46144I9c.LIZIZ) && this.LIZJ == c46144I9c.LIZJ && o.LJ(this.LIZLLL, c46144I9c.LIZLLL) && o.LJ(this.LJ, c46144I9c.LJ) && o.LJ(this.LJFF, c46144I9c.LJFF) && o.LJ(this.LJI, c46144I9c.LJI) && this.LJII == c46144I9c.LJII && o.LJ(this.LJIIIIZZ, c46144I9c.LJIIIIZZ) && o.LJ(this.LJIIIZ, c46144I9c.LJIIIZ) && o.LJ(this.LJIIJ, c46144I9c.LJIIJ) && o.LJ(this.LJIIJJI, c46144I9c.LJIIJJI) && this.LJIIL == c46144I9c.LJIIL && o.LJ(this.LJIILIIL, c46144I9c.LJIILIIL) && o.LJ(this.LJIILJJIL, c46144I9c.LJIILJJIL) && this.LJIILL == c46144I9c.LJIILL && this.LJIILLIIL == c46144I9c.LJIILLIIL && o.LJ(this.LJIIZILJ, c46144I9c.LJIIZILJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        IA6 ia6 = this.LIZ;
        int hashCode = (ia6 != null ? ia6.hashCode() : 0) * 31;
        C46151I9j c46151I9j = this.LIZIZ;
        int hashCode2 = (hashCode + (c46151I9j != null ? c46151I9j.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZLLL;
        int hashCode3 = (i2 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0)) * 31;
        IAA iaa = this.LJ;
        int hashCode4 = (hashCode3 + (iaa != null ? iaa.hashCode() : 0)) * 31;
        InterfaceC88472Yns<? super CameraComponentModel, Integer> interfaceC88472Yns = this.LJFF;
        int hashCode5 = (hashCode4 + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0)) * 31;
        IA3 ia3 = this.LJI;
        int hashCode6 = (hashCode5 + (ia3 != null ? ia3.hashCode() : 0)) * 31;
        boolean z2 = this.LJII;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode6 + i3) * 31;
        IAE iae = this.LJIIIIZZ;
        int hashCode7 = (i4 + (iae != null ? iae.hashCode() : 0)) * 31;
        IAD iad = this.LJIIIZ;
        int hashCode8 = (hashCode7 + (iad != null ? iad.hashCode() : 0)) * 31;
        InterfaceC88472Yns<? super CameraComponentModel, Boolean> interfaceC88472Yns2 = this.LJIIJ;
        int hashCode9 = (hashCode8 + (interfaceC88472Yns2 != null ? interfaceC88472Yns2.hashCode() : 0)) * 31;
        InterfaceC88472Yns<? super CameraComponentModel, Boolean> interfaceC88472Yns3 = this.LJIIJJI;
        int hashCode10 = (hashCode9 + (interfaceC88472Yns3 != null ? interfaceC88472Yns3.hashCode() : 0)) * 31;
        boolean z3 = this.LJIIL;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode10 + i5) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = this.LJIILIIL;
        int hashCode11 = (i6 + (interfaceC65784Pro2 != null ? interfaceC65784Pro2.hashCode() : 0)) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro3 = this.LJIILJJIL;
        int hashCode12 = (hashCode11 + (interfaceC65784Pro3 != null ? interfaceC65784Pro3.hashCode() : 0)) * 31;
        boolean z4 = this.LJIILL;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (((hashCode12 + i7) * 31) + (this.LJIILLIIL ? 1 : 0)) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro4 = this.LJIIZILJ;
        return i8 + (interfaceC65784Pro4 != null ? interfaceC65784Pro4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(maxDurationCalculator=");
        LIZ.append(this.LIZ);
        LIZ.append(", recordControlSetting=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enableAutoRetryRecord=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enableTitan=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shutterSoundProcessor=");
        LIZ.append(this.LJ);
        LIZ.append(", hardEncodeVerify=");
        LIZ.append(this.LJFF);
        LIZ.append(", asCameraViewDecorator=");
        LIZ.append(this.LJI);
        LIZ.append(", enableAudioCapture=");
        LIZ.append(this.LJII);
        LIZ.append(", startCommandAudioControlStrategy=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", stopCommandAudioControlStrategy=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", enableMicControl=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", isForceEnableAudio=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", enableMicWithMusicAB=");
        LIZ.append(this.LJIIL);
        LIZ.append(", updateProgressByVECallback=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", enableNoLastRecordFrame=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", enableRecordBtnBeforeCamInit=");
        LIZ.append(this.LJIILL);
        LIZ.append(", enableInitBeforeStartMicAndReleaseAfterStopMic=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", enableVeApiNormalization=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C46144I9c(Object obj) {
        C46147I9f c46147I9f = new C46147I9f(0);
        C46151I9j c46151I9j = new C46151I9j(2.25f, 18, 1, 1);
        C34358De6 enableTitan = C34358De6.LJLIL;
        C46166I9y hardEncodeVerify = C46166I9y.LJLIL;
        IA4 asCameraViewDecorator = IA3.LIZ;
        IA0 enableMicControl = IA0.LJLIL;
        IA1 isForceEnableAudio = IA1.LJLIL;
        C34359De7 updateProgressByVECallback = C34359De7.LJLIL;
        C34360De8 enableNoLastRecordFrame = C34360De8.LJLIL;
        C34361De9 enableVeApiNormalization = C34361De9.LJLIL;
        o.LJIIIZ(enableTitan, "enableTitan");
        o.LJIIIZ(hardEncodeVerify, "hardEncodeVerify");
        o.LJIIIZ(asCameraViewDecorator, "asCameraViewDecorator");
        o.LJIIIZ(enableMicControl, "enableMicControl");
        o.LJIIIZ(isForceEnableAudio, "isForceEnableAudio");
        o.LJIIIZ(updateProgressByVECallback, "updateProgressByVECallback");
        o.LJIIIZ(enableNoLastRecordFrame, "enableNoLastRecordFrame");
        o.LJIIIZ(enableVeApiNormalization, "enableVeApiNormalization");
        this.LIZ = c46147I9f;
        this.LIZIZ = c46151I9j;
        this.LIZJ = true;
        this.LIZLLL = enableTitan;
        this.LJ = null;
        this.LJFF = hardEncodeVerify;
        this.LJI = asCameraViewDecorator;
        this.LJII = false;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = enableMicControl;
        this.LJIIJJI = isForceEnableAudio;
        this.LJIIL = false;
        this.LJIILIIL = updateProgressByVECallback;
        this.LJIILJJIL = enableNoLastRecordFrame;
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJIIZILJ = enableVeApiNormalization;
    }
}

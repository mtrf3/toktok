package X;

import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.algorithm.VEAudioAlgorithmParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WxQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83968WxQ implements InterfaceC83670Wsc {
    public final VEAudioCapture LIZ;
    public C83969WxR LIZIZ;
    public InterfaceC83970WxS LIZJ;
    public InterfaceC83723WtT LIZLLL;
    public String LJ;
    public boolean LJFF;
    public boolean LJI;
    public final List<InterfaceC83972WxU> LJII;
    public final VERecorder LJIIIIZZ;
    public final InterfaceC83927Wwl LJIIIZ;

    @Override // X.InterfaceC83670Wsc
    public final void LJ() {
    }

    @Override // X.InterfaceC83670Wsc
    public final VEAudioCapture LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC83670Wsc
    public final boolean isInited() {
        return this.LJI;
    }

    @Override // X.InterfaceC83670Wsc
    public final void LIZIZ(boolean z) {
        this.LJFF = z;
    }

    @Override // X.InterfaceC83670Wsc
    public final void LIZJ(IBA iba) {
        if (!((ArrayList) this.LJII).contains(iba)) {
            ((ArrayList) this.LJII).add(iba);
        }
    }

    @Override // X.InterfaceC83670Wsc
    public final void LIZLLL(Cert cert) {
        int start;
        InterfaceC83970WxS interfaceC83970WxS;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("policyPlaceholder: ");
        LIZ.append(cert);
        C78922UyE.LIZ("ACTION_NAME_START_AUDIO_CAPTURE", X1D.LIZIZ(LIZ));
        InterfaceC83970WxS interfaceC83970WxS2 = this.LIZJ;
        if (interfaceC83970WxS2 != null) {
            interfaceC83970WxS2.LIZ();
        }
        InterfaceC83723WtT interfaceC83723WtT = this.LIZLLL;
        if (interfaceC83723WtT != null) {
            ((C83634Ws2) interfaceC83723WtT).LIZJ(EnumC83718WtO.OPEN_MIC, cert);
        }
        VEAudioCapture vEAudioCapture = this.LIZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100850, "com/ss/android/vesdk/VEAudioCapture", "start", vEAudioCapture, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "5693646072396621256"));
        if (LIZJ.LIZ) {
            start = ((Integer) LIZJ.LIZIZ).intValue();
        } else {
            start = vEAudioCapture.start(cert);
        }
        if (start != 0 && (interfaceC83970WxS = this.LIZJ) != null) {
            interfaceC83970WxS.LIZJ(start, "Mic open failed in earlier stage");
        }
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            ((InterfaceC83972WxU) it.next()).onStartRecord();
        }
    }

    @Override // X.InterfaceC83670Wsc
    public final int LJII(VEAudioAlgorithmParam vEAudioAlgorithmParam) {
        return this.LJIIIIZZ.LIZIZ().addTrackAlgorithm(1, 0, vEAudioAlgorithmParam, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[LOOP:0: B:17:0x005e->B:19:0x0064, LOOP_END] */
    @Override // X.InterfaceC83670Wsc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.WxR r1 = new X.WxR
            r1.<init>(r5)
            r5.LIZIZ = r1
            r5.LJ = r6
            com.ss.android.vesdk.VEAudioCapture r0 = r5.LIZ
            r0.addCaptureListener(r1)
            int r1 = r6.hashCode()
            r0 = -934908847(0xffffffffc8466c51, float:-203185.27)
            r3 = 1
            if (r1 == r0) goto L6e
            r0 = 106541(0x1a02d, float:1.49296E-40)
            if (r1 != r0) goto Lb1
            java.lang.String r0 = "ktv"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb1
            com.ss.android.vesdk.VEAudioCaptureSettings$Builder r4 = new com.ss.android.vesdk.VEAudioCaptureSettings$Builder
            com.ss.android.vesdk.VERecorder r0 = r5.LJIIIIZZ
            X.WyL r0 = r0.LIZIZ
            com.ss.android.vesdk.VEAudioCaptureSettings r0 = r0.getSuggestionSettingsForKaraoke()
            r4.<init>(r0)
            r4.setAudioCaptureLowLatency(r3)
        L3a:
            X.WxS r0 = r5.LIZJ
            if (r0 == 0) goto L41
            r0.LJIILLIIL()
        L41:
            com.ss.android.vesdk.VEAudioCapture r1 = r5.LIZ
            com.ss.android.vesdk.VEAudioCaptureSettings r0 = r4.build()
            int r0 = r1.init(r0)
            if (r0 == 0) goto L54
            X.WxS r0 = r5.LIZJ
            if (r0 == 0) goto L54
            r0.LJI()
        L54:
            r5.LJI = r3
            java.util.List<X.WxU> r0 = r5.LJII
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L5e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r1.next()
            X.WxU r0 = (X.InterfaceC83972WxU) r0
            r0.onInit()
            goto L5e
        L6e:
            java.lang.String r0 = "record"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb1
            com.ss.android.vesdk.VERecorder r1 = r5.LJIIIIZZ
            java.lang.String r0 = "$this$enableAudioArbiter"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            com.ss.android.vesdk.VERecorder r0 = r5.LJIIIIZZ
            X.WyL r0 = r0.LIZIZ
            X.P4F r1 = r0.getAudioConsumer()
            if (r1 == 0) goto L8c
            com.ss.android.vesdk.VEAudioCapture r0 = r5.LIZ
            r0.addCaptureListener(r1)
        L8c:
            com.ss.android.vesdk.VEAudioCaptureSettings$Builder r4 = new com.ss.android.vesdk.VEAudioCaptureSettings$Builder
            r4.<init>()
            X.Wwl r2 = r5.LJIIIZ
            boolean r1 = r5.LJFF
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.Pro r0 = r2.LLJL()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lac
            if (r1 == 0) goto L3a
        Lac:
            r4.setAudioDataStore(r3)
            goto L3a
        Lb0:
            return
        Lb1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "not a supported mode "
            java.lang.String r0 = defpackage.i0.LJFF(r0, r6)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83968WxQ.init(java.lang.String):void");
    }

    @Override // X.InterfaceC83670Wsc
    public final void release(Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("policyPlaceholder: ");
        LIZ.append(cert);
        C78922UyE.LIZ("ACTION_NAME_RELEASE_AUDIO_CAPTURE", X1D.LIZIZ(LIZ));
        this.LIZ.release(cert);
        this.LIZ.removeCaptureListener(this.LIZIZ);
        if (TextUtils.equals(this.LJ, "record")) {
            this.LJ = null;
            VERecorder disableAudioArbiter = this.LJIIIIZZ;
            o.LJIIIZ(disableAudioArbiter, "$this$disableAudioArbiter");
            this.LIZ.removeCaptureListener(this.LJIIIIZZ.LIZIZ.getAudioConsumer());
        }
        this.LJI = false;
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            ((InterfaceC83972WxU) it.next()).onRelease();
        }
    }

    @Override // X.InterfaceC83670Wsc
    public final int removeTrackAlgorithm(int i) {
        return this.LJIIIIZZ.LIZIZ().removeTrackAlgorithm(i);
    }

    @Override // X.InterfaceC83670Wsc
    public final void setAudioDevice(IC8 device) {
        o.LJIIIZ(device, "device");
        VEAudioCapture vEAudioCapture = this.LJIIIIZZ.LIZIZ.mVEAudioCapture;
        if (vEAudioCapture != null) {
            vEAudioCapture.setAudioDevice(device);
        }
    }

    @Override // X.InterfaceC83670Wsc
    public final void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS) {
        this.LIZJ = interfaceC83970WxS;
        if (interfaceC83970WxS != null) {
            interfaceC83970WxS.LJIIJ(new C83971WxT(this));
        }
    }

    @Override // X.InterfaceC83670Wsc
    public final void setSensitiveApiCallback(InterfaceC83723WtT interfaceC83723WtT) {
        this.LIZLLL = interfaceC83723WtT;
    }

    public C83968WxQ(VERecorder recorder, InterfaceC83927Wwl recorderContext) {
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(recorderContext, "recorderContext");
        this.LJIIIIZZ = recorder;
        this.LJIIIZ = recorderContext;
        this.LIZ = new VEAudioCapture();
        this.LJII = new ArrayList();
    }

    @Override // X.InterfaceC83670Wsc
    public final void LJI(Cert cert, boolean z) {
        InterfaceC83970WxS interfaceC83970WxS;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("policyPlaceholder: ");
        LIZ.append(cert);
        C78922UyE.LIZ("ACTION_NAME_STOP_AUDIO_CAPTURE", X1D.LIZIZ(LIZ));
        InterfaceC83970WxS interfaceC83970WxS2 = this.LIZJ;
        if (interfaceC83970WxS2 != null) {
            interfaceC83970WxS2.LIZIZ();
        }
        int stop = this.LIZ.stop(cert);
        if (stop != 0 && (interfaceC83970WxS = this.LIZJ) != null) {
            interfaceC83970WxS.LJIILL(stop);
        }
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            ((InterfaceC83972WxU) it.next()).LIZ(z);
        }
    }

    @Override // X.InterfaceC83670Wsc
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4) {
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZLLL = C00F.LIZLLL("useAudioGraphOutput useOutPut=", z, ", useGraph=", z2, ", useMicIn=");
        LIZLLL.append(z3);
        LIZLLL.append(", useBgm=");
        LIZLLL.append(z4);
        c83964WxM.LIZ(X1D.LIZIZ(LIZLLL));
        this.LJIIIIZZ.LIZIZ.useAudioGraphOutput(z, z2, z3, z4);
    }
}

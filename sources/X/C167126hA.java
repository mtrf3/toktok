package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;
import com.ss.android.vesdk.VEDetachAudioStreamListener;
import com.ss.android.vesdk.VEUtils;
import defpackage.e1;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.PrepareParamsAndUploadHandler$handleData$2$extractDeferred$1", f = "PrepareParamsAndUploadHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6hA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167126hA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166526gC>, Object> {
    public final /* synthetic */ C166116fX LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ IAudioExtractUpload LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167126hA(C166116fX c166116fX, String str, IAudioExtractUpload iAudioExtractUpload, InterfaceC67352kd<? super C167126hA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c166116fX;
        this.LJLILLLLZI = str;
        this.LJLJI = iAudioExtractUpload;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C167126hA(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        NLEError LIZ;
        String str;
        String str2;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        String str3;
        NLESegment LJI2;
        NLEResourceNode LIZIZ2;
        NLESegment LJI3;
        NLEResourceNode LIZIZ3;
        NLETrackSlot nLETrackSlot2;
        C141335gf.LIZJ(obj);
        C166116fX model = this.LJLIL;
        String str4 = null;
        if (e1.LIZ(31744, "vc_dub_compression", true, false)) {
            C166116fX c166116fX = this.LJLIL;
            if (c166116fX.LIZIZ == null && (nLETrackSlot2 = c166116fX.LIZ) != null) {
                model = new C166116fX(null, C122424rG.LJFF(nLETrackSlot2), this.LJLIL.LIZJ);
            }
        }
        String targetPath = this.LJLILLLLZI;
        final IAudioExtractUpload iAudioExtractUpload = this.LJLJI;
        VEDetachAudioStreamListener vEDetachAudioStreamListener = new VEDetachAudioStreamListener() { // from class: X.6hP
            @Override // com.ss.android.vesdk.VEDetachAudioStreamListener
            public final boolean onErrorCallback(int i) {
                return true;
            }

            @Override // com.ss.android.vesdk.VEDetachAudioStreamListener
            public final boolean onStreamCallback(byte[] bArr, long j, int i, boolean z) {
                IAudioExtractUpload.this.produce(bArr, j, i, z);
                return true;
            }
        };
        o.LJIIIZ(model, "model");
        o.LJIIIZ(targetPath, "targetPath");
        if (model.LIZIZ == null) {
            C166526gC c166526gC = new C166526gC();
            NLETrackSlot nLETrackSlot3 = model.LIZ;
            if (nLETrackSlot3 != null && (LJI3 = nLETrackSlot3.LJI()) != null && (LIZIZ3 = LJI3.LIZIZ()) != null) {
                str3 = LIZIZ3.LIZJ();
            } else {
                str3 = null;
            }
            c166526gC.LIZIZ = str3;
            NLETrackSlot nLETrackSlot4 = model.LIZ;
            if (nLETrackSlot4 != null && (LJI2 = nLETrackSlot4.LJI()) != null && (LIZIZ2 = LJI2.LIZIZ()) != null) {
                str4 = LIZIZ2.LIZJ();
            }
            c166526gC.LIZJ = str4;
            c166526gC.LIZ = C78685UuP.LJJJZ(str4);
            return c166526gC;
        }
        VCOptConfig vCOptConfig = new VCOptConfig(0, 0, 0, 7, null);
        if (C167376hZ.LIZ() && C167246hM.LIZIZ()) {
            vCOptConfig = C167246hM.LIZ();
        }
        NLEModel nleModel = model.LIZIZ;
        int i = vCOptConfig.channels;
        int i2 = vCOptConfig.bitRate;
        int i3 = vCOptConfig.sampleRate;
        o.LJIIIZ(nleModel, "nleModel");
        NLETrackSlot LIZIZ4 = C167156hD.LIZIZ(nleModel);
        if (LIZIZ4 == null) {
            LIZ = C167156hD.LIZ(-1);
        } else {
            int LIZJ = C167156hD.LIZJ(i3, i2, i);
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(LIZIZ4.LJI());
            if (LIZLLL == null) {
                LIZ = C167156hD.LIZ(-1);
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String LIZJ2 = LIZLLL.LIZIZ().LIZJ();
                o.LJIIIIZZ(LIZJ2, "segmentAudioVideo.resource.resourceFile");
                arrayList.add(LIZJ2);
                arrayList2.add(-1L);
                arrayList3.add(-1L);
                arrayList6.add(Float.valueOf(1.0f));
                arrayList4.add(-1L);
                arrayList5.add(-1L);
                int detachAudioFromVideosCallback = VEUtils.detachAudioFromVideosCallback(targetPath, vEDetachAudioStreamListener, (String[]) arrayList.toArray(new String[0]), ORZ.LLJIJIL(arrayList2), ORZ.LLJIJIL(arrayList3), ORZ.LLJIJIL(arrayList4), ORZ.LLJIJIL(arrayList5), -1L, -1L, ORZ.LLIZ(arrayList6), i, i2, LIZJ);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                LIZ = C167156hD.LIZ(detachAudioFromVideosCallback);
            }
        }
        VecNLETrackSPtr tracks = model.LIZIZ.getTracks();
        o.LJIIIIZZ(tracks, "model.nleModel.tracks");
        NLETrack nLETrack = (NLETrack) ORZ.LJLLLL(tracks);
        if (nLETrack != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILL())) != null && (LJI = nLETrackSlot.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
            str = LIZIZ.LIZJ();
        } else {
            str = null;
        }
        if (targetPath.length() > 0 && C44687HgJ.LIZIZ(targetPath) && LIZ == NLEError.SUCCESS) {
            if (C167326hU.LIZ()) {
                if (TEVideoUtils.nativeCheckAudioFile(targetPath) == 0) {
                    C166526gC c166526gC2 = new C166526gC();
                    c166526gC2.LIZ = true;
                    c166526gC2.LIZJ = targetPath;
                    c166526gC2.LIZLLL = LIZ;
                    return c166526gC2;
                }
                C166526gC c166526gC3 = new C166526gC();
                c166526gC3.LIZIZ = str;
                c166526gC3.LIZLLL = LIZ;
                if (str == null) {
                    str2 = "empty slot";
                } else {
                    str2 = str;
                }
                c166526gC3.LJ = str2;
                c166526gC3.LJFF = -10;
                long LJIIIIZZ = C44687HgJ.LJIIIIZZ(str);
                if (C167376hZ.LIZ() && C167246hM.LIZIZ()) {
                    C188727au LJ = C169696lJ.LJ(LJIIIIZZ, "fileSize");
                    LJ.LJIIIZ("error_type", "detachAudioStreamFile");
                    LJ.LJIIIZ("fileLocalPath", c166526gC3.LJ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("sampleRate=");
                    LIZ2.append(C167246hM.LIZ().sampleRate);
                    LIZ2.append(",bitRate=");
                    LIZ2.append(C167246hM.LIZ().bitRate);
                    LIZ2.append(",channels=");
                    LIZ2.append(C167246hM.LIZ().channels);
                    LJ.LJIIIZ("extra", X1D.LIZIZ(LIZ2));
                    FMX.LJIIL("voice_conversion_extra_error", LJ.LIZ);
                    return c166526gC3;
                }
                C188727au LJ2 = C169696lJ.LJ(LJIIIIZZ, "fileSize");
                LJ2.LJIIIZ("error_type", "detachAudioStreamFile");
                LJ2.LJIIIZ("fileLocalPath", c166526gC3.LJ);
                FMX.LJIIL("voice_conversion_extra_error", LJ2.LIZ);
                return c166526gC3;
            }
            C166526gC c166526gC4 = new C166526gC();
            c166526gC4.LIZIZ = str;
            c166526gC4.LIZ = true;
            c166526gC4.LIZJ = targetPath;
            c166526gC4.LIZLLL = LIZ;
            return c166526gC4;
        }
        C166526gC c166526gC5 = new C166526gC();
        c166526gC5.LIZIZ = str;
        c166526gC5.LIZLLL = LIZ;
        return c166526gC5;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166526gC> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

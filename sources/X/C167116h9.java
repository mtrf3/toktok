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
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;
import com.ss.android.vesdk.VEUtils;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.PrepareParamsHandler$handleData$2$results$2", f = "PrepareParamsHandler.kt", l = {68, 70}, m = "invokeSuspend")
/* renamed from: X.6h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167116h9 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, C166116fX, InterfaceC67352kd<? super C166526gC>, Object> {
    public int LJLIL;
    public /* synthetic */ C166116fX LJLILLLLZI;
    public final /* synthetic */ C166396fz LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167116h9(C166396fz c166396fz, InterfaceC67352kd<? super C167116h9> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = c166396fz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        NLEError LIZ;
        String str;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        String str2;
        String str3;
        NLESegment LJI2;
        NLEResourceNode LIZIZ2;
        NLESegment LJI3;
        NLEResourceNode LIZIZ3;
        NLEError LIZ2;
        String str4;
        NLETrackSlot nLETrackSlot2;
        NLESegment LJI4;
        NLEResourceNode LIZIZ4;
        String str5;
        String str6;
        NLESegment LJI5;
        NLEResourceNode LIZIZ5;
        NLESegment LJI6;
        NLEResourceNode LIZIZ6;
        NLETrackSlot nLETrackSlot3;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj2);
            }
        } else {
            C141335gf.LIZJ(obj2);
            C166116fX c166116fX = this.LJLILLLLZI;
            if (e1.LIZ(31744, "vc_dub_compression", true, false) && c166116fX.LIZIZ == null && (nLETrackSlot3 = c166116fX.LIZ) != null) {
                c166116fX = new C166116fX(null, C122424rG.LJFF(nLETrackSlot3), c166116fX.LIZJ);
            }
            String str7 = "empty slot";
            if (e1.LIZ(31744, "vc_extract_opt", true, false)) {
                String outputAudioFile = this.LJLJI.LIZ();
                this.LJLIL = 1;
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                if (c166116fX.LIZIZ == null) {
                    C166526gC c166526gC = new C166526gC();
                    NLETrackSlot nLETrackSlot4 = c166116fX.LIZ;
                    if (nLETrackSlot4 != null && (LJI6 = nLETrackSlot4.LJI()) != null && (LIZIZ6 = LJI6.LIZIZ()) != null) {
                        str5 = LIZIZ6.LIZJ();
                    } else {
                        str5 = null;
                    }
                    c166526gC.LIZIZ = str5;
                    NLETrackSlot nLETrackSlot5 = c166116fX.LIZ;
                    if (nLETrackSlot5 != null && (LJI5 = nLETrackSlot5.LJI()) != null && (LIZIZ5 = LJI5.LIZIZ()) != null) {
                        str6 = LIZIZ5.LIZJ();
                    } else {
                        str6 = null;
                    }
                    c166526gC.LIZJ = str6;
                    c166526gC.LIZ = C78685UuP.LJJJZ(str6);
                    C3C5.m7constructorimpl(c166526gC);
                    c84654XKg.resumeWith(c166526gC);
                } else {
                    VCOptConfig vCOptConfig = new VCOptConfig(0, 0, 0, 7, null);
                    if (C167376hZ.LIZ() && C167246hM.LIZIZ()) {
                        vCOptConfig = C167246hM.LIZ();
                    }
                    NLEModel nleModel = c166116fX.LIZIZ;
                    int i2 = vCOptConfig.channels;
                    int i3 = vCOptConfig.bitRate;
                    int i4 = vCOptConfig.sampleRate;
                    o.LJIIIZ(outputAudioFile, "outputAudioFile");
                    o.LJIIIZ(nleModel, "nleModel");
                    NLETrackSlot LIZIZ7 = C167156hD.LIZIZ(nleModel);
                    if (LIZIZ7 == null) {
                        LIZ2 = C167156hD.LIZ(-1);
                    } else {
                        int LIZJ = C167156hD.LIZJ(i4, i3, i2);
                        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(LIZIZ7.LJI());
                        if (LIZLLL == null) {
                            LIZ2 = C167156hD.LIZ(-1);
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
                            int detachAudioFromVideos = VEUtils.detachAudioFromVideos(outputAudioFile, (String[]) arrayList.toArray(new String[0]), ORZ.LLJIJIL(arrayList2), ORZ.LLJIJIL(arrayList3), ORZ.LLJIJIL(arrayList4), ORZ.LLJIJIL(arrayList5), -1L, -1L, ORZ.LLIZ(arrayList6), i2, i3, LIZJ, VEUtils.CompatibleMode.Fill_silence);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                            LIZ2 = C167156hD.LIZ(detachAudioFromVideos);
                        }
                    }
                    VecNLETrackSPtr tracks = c166116fX.LIZIZ.getTracks();
                    o.LJIIIIZZ(tracks, "model.nleModel.tracks");
                    NLETrack nLETrack = (NLETrack) ORZ.LJLLLL(tracks);
                    if (nLETrack != null && (nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILL())) != null && (LJI4 = nLETrackSlot2.LJI()) != null && (LIZIZ4 = LJI4.LIZIZ()) != null) {
                        str4 = LIZIZ4.LIZJ();
                    } else {
                        str4 = null;
                    }
                    if (outputAudioFile.length() > 0 && C44687HgJ.LIZIZ(outputAudioFile) && LIZ2 == NLEError.SUCCESS) {
                        if (C167326hU.LIZ()) {
                            if (TEVideoUtils.nativeCheckAudioFile(outputAudioFile) == 0) {
                                C166526gC c166526gC2 = new C166526gC();
                                c166526gC2.LIZIZ = str4;
                                c166526gC2.LIZ = true;
                                c166526gC2.LIZJ = outputAudioFile;
                                c166526gC2.LIZLLL = LIZ2;
                                C3C5.m7constructorimpl(c166526gC2);
                                c84654XKg.resumeWith(c166526gC2);
                            } else {
                                C166526gC c166526gC3 = new C166526gC();
                                c166526gC3.LIZIZ = str4;
                                c166526gC3.LIZLLL = LIZ2;
                                if (str4 != null) {
                                    str7 = str4;
                                }
                                c166526gC3.LJ = str7;
                                c166526gC3.LJFF = -10;
                                long LJIIIIZZ = C44687HgJ.LJIIIIZZ(str4);
                                if (C167376hZ.LIZ() && C167246hM.LIZIZ()) {
                                    C188727au LJ = C169696lJ.LJ(LJIIIIZZ, "fileSize");
                                    LJ.LJIIIZ("error_type", "detachAudioStreamFile");
                                    LJ.LJIIIZ("fileLocalPath", c166526gC3.LJ);
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("sampleRate=");
                                    LIZ3.append(C167246hM.LIZ().sampleRate);
                                    LIZ3.append(",bitRate=");
                                    LIZ3.append(C167246hM.LIZ().bitRate);
                                    LIZ3.append(",channels=");
                                    LIZ3.append(C167246hM.LIZ().channels);
                                    LJ.LJIIIZ("extra", X1D.LIZIZ(LIZ3));
                                    FMX.LJIIL("voice_conversion_extra_error", LJ.LIZ);
                                } else {
                                    C188727au LJ2 = C169696lJ.LJ(LJIIIIZZ, "fileSize");
                                    LJ2.LJIIIZ("error_type", "detachAudioStreamFile");
                                    LJ2.LJIIIZ("fileLocalPath", c166526gC3.LJ);
                                    FMX.LJIIL("voice_conversion_extra_error", LJ2.LIZ);
                                }
                                C3C5.m7constructorimpl(c166526gC3);
                                c84654XKg.resumeWith(c166526gC3);
                            }
                        } else {
                            C166526gC c166526gC4 = new C166526gC();
                            c166526gC4.LIZIZ = str4;
                            c166526gC4.LIZ = true;
                            c166526gC4.LIZJ = outputAudioFile;
                            c166526gC4.LIZLLL = LIZ2;
                            C3C5.m7constructorimpl(c166526gC4);
                            c84654XKg.resumeWith(c166526gC4);
                        }
                    } else {
                        C166526gC c166526gC5 = new C166526gC();
                        c166526gC5.LIZIZ = str4;
                        c166526gC5.LIZLLL = LIZ2;
                        C3C5.m7constructorimpl(c166526gC5);
                        c84654XKg.resumeWith(c166526gC5);
                    }
                }
                obj2 = c84654XKg.LIZ();
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                String LIZ4 = this.LJLJI.LIZ();
                this.LJLIL = 2;
                C84654XKg c84654XKg2 = new C84654XKg(C78555UsJ.LJJII(this));
                if (c166116fX.LIZIZ == null) {
                    C166526gC c166526gC6 = new C166526gC();
                    NLETrackSlot nLETrackSlot6 = c166116fX.LIZ;
                    if (nLETrackSlot6 != null && (LJI3 = nLETrackSlot6.LJI()) != null && (LIZIZ3 = LJI3.LIZIZ()) != null) {
                        str2 = LIZIZ3.LIZJ();
                    } else {
                        str2 = null;
                    }
                    c166526gC6.LIZIZ = str2;
                    NLETrackSlot nLETrackSlot7 = c166116fX.LIZ;
                    if (nLETrackSlot7 != null && (LJI2 = nLETrackSlot7.LJI()) != null && (LIZIZ2 = LJI2.LIZIZ()) != null) {
                        str3 = LIZIZ2.LIZJ();
                    } else {
                        str3 = null;
                    }
                    c166526gC6.LIZJ = str3;
                    c166526gC6.LIZ = C78685UuP.LJJJZ(str3);
                    C3C5.m7constructorimpl(c166526gC6);
                    c84654XKg2.resumeWith(c166526gC6);
                } else {
                    if (C167376hZ.LIZ() && C167246hM.LIZIZ()) {
                        z = true;
                        LIZ = C167136hB.LIZ(LIZ4, c166116fX.LIZIZ, C167246hM.LIZ().channels, C167246hM.LIZ().bitRate, C167246hM.LIZ().sampleRate, false, true);
                    } else {
                        VCOptConfig vCOptConfig2 = new VCOptConfig(0, 0, 0, 7, null);
                        z = true;
                        LIZ = C167136hB.LIZ(LIZ4, c166116fX.LIZIZ, vCOptConfig2.channels, vCOptConfig2.bitRate, vCOptConfig2.sampleRate, false, true);
                    }
                    VecNLETrackSPtr tracks2 = c166116fX.LIZIZ.getTracks();
                    o.LJIIIIZZ(tracks2, "model.nleModel.tracks");
                    NLETrack nLETrack2 = (NLETrack) ORZ.LJLLLL(tracks2);
                    if (nLETrack2 != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack2.LJIILL())) != null && (LJI = nLETrackSlot.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                        str = LIZIZ.LIZJ();
                    } else {
                        str = null;
                    }
                    if (LIZ4.length() > 0 && C44687HgJ.LIZIZ(LIZ4) && LIZ == NLEError.SUCCESS) {
                        if (C167326hU.LIZ()) {
                            if (TEVideoUtils.nativeCheckAudioFile(LIZ4) == 0) {
                                C166526gC c166526gC7 = new C166526gC();
                                c166526gC7.LIZIZ = str;
                                c166526gC7.LIZ = z;
                                c166526gC7.LIZJ = LIZ4;
                                c166526gC7.LIZLLL = LIZ;
                                C3C5.m7constructorimpl(c166526gC7);
                                c84654XKg2.resumeWith(c166526gC7);
                            } else {
                                C166526gC c166526gC8 = new C166526gC();
                                c166526gC8.LIZLLL = LIZ;
                                c166526gC8.LIZIZ = str;
                                if (str != null) {
                                    str7 = str;
                                }
                                c166526gC8.LJ = str7;
                                c166526gC8.LJFF = -10;
                                long LJIIIIZZ2 = C44687HgJ.LJIIIIZZ(str);
                                if (C167376hZ.LIZ() && C167246hM.LIZIZ()) {
                                    C188727au LJ3 = C169696lJ.LJ(LJIIIIZZ2, "fileSize");
                                    LJ3.LJIIIZ("error_type", "detachAudioStreamFile");
                                    LJ3.LJIIIZ("fileLocalPath", c166526gC8.LJ);
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("sampleRate=");
                                    LIZ5.append(C167246hM.LIZ().sampleRate);
                                    LIZ5.append(",bitRate=");
                                    LIZ5.append(C167246hM.LIZ().bitRate);
                                    LIZ5.append(",channels=");
                                    LIZ5.append(C167246hM.LIZ().channels);
                                    LJ3.LJIIIZ("extra", X1D.LIZIZ(LIZ5));
                                    FMX.LJIIL("voice_conversion_extra_error", LJ3.LIZ);
                                } else {
                                    C188727au LJ4 = C169696lJ.LJ(LJIIIIZZ2, "fileSize");
                                    LJ4.LJIIIZ("error_type", "detachAudioStreamFile");
                                    LJ4.LJIIIZ("fileLocalPath", c166526gC8.LJ);
                                    FMX.LJIIL("voice_conversion_extra_error", LJ4.LIZ);
                                }
                                C3C5.m7constructorimpl(c166526gC8);
                                c84654XKg2.resumeWith(c166526gC8);
                            }
                        } else {
                            C166526gC c166526gC9 = new C166526gC();
                            c166526gC9.LIZIZ = str;
                            c166526gC9.LIZ = z;
                            c166526gC9.LIZJ = LIZ4;
                            c166526gC9.LIZLLL = LIZ;
                            C3C5.m7constructorimpl(c166526gC9);
                            c84654XKg2.resumeWith(c166526gC9);
                        }
                    } else {
                        C166526gC c166526gC10 = new C166526gC();
                        c166526gC10.LIZIZ = str;
                        c166526gC10.LIZLLL = LIZ;
                        C3C5.m7constructorimpl(c166526gC10);
                        c84654XKg2.resumeWith(c166526gC10);
                    }
                }
                obj2 = c84654XKg2.LIZ();
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return obj2;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, C166116fX c166116fX, InterfaceC67352kd<? super C166526gC> interfaceC67352kd) {
        C167116h9 c167116h9 = new C167116h9(this.LJLJI, interfaceC67352kd);
        c167116h9.LJLILLLLZI = c166116fX;
        return c167116h9.invokeSuspend(C76800UCe.LIZ);
    }
}

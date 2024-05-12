package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.google.gson.internal.b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import defpackage.e1;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167106h8 {
    public static final C167106h8 LIZ = new C167106h8();

    public static Object LIZJ(InterfaceC67352kd interfaceC67352kd) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C76L<VideoCreation> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().LIZJ(null);
        InterfaceC65753PrJ<VideoCreation> interfaceC65753PrJ = new InterfaceC65753PrJ<VideoCreation>() { // from class: X.6h1
            @Override // X.InterfaceC65753PrJ
            public final void onFailure(Throwable t) {
                o.LJIIIZ(t, "t");
                InterfaceC67352kd<C166036fP> interfaceC67352kd2 = c84654XKg;
                C166036fP c166036fP = new C166036fP();
                C3C5.m7constructorimpl(c166036fP);
                interfaceC67352kd2.resumeWith(c166036fP);
            }

            @Override // X.InterfaceC65753PrJ
            public final void onSuccess(VideoCreation videoCreation) {
                UploadAuthKeyConfig uploadAuthKeyConfig;
                boolean z;
                VideoCreation videoCreation2 = videoCreation;
                InterfaceC67352kd<C166036fP> interfaceC67352kd2 = c84654XKg;
                C166036fP c166036fP = new C166036fP();
                if (videoCreation2 instanceof UploadAuthKeyConfig) {
                    uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation2;
                } else {
                    uploadAuthKeyConfig = null;
                }
                c166036fP.LIZIZ = uploadAuthKeyConfig;
                if (uploadAuthKeyConfig != null) {
                    z = true;
                } else {
                    z = false;
                }
                c166036fP.LIZ = z;
                C3C5.m7constructorimpl(c166036fP);
                interfaceC67352kd2.resumeWith(c166036fP);
            }
        };
        LIZJ.LJFF(new RunnableC65751PrH(LIZJ, interfaceC65753PrJ), EnumC169566l6.LJLIL);
        return c84654XKg.LIZ();
    }

    public static Object LIZLLL(String str, final UploadAuthKeyConfig config, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        final AbstractVideoUploader c43886HKg;
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !C44687HgJ.LIZIZ(str)) {
            C166546gE c166546gE = new C166546gE();
            C3C5.m7constructorimpl(c166546gE);
            c84654XKg.resumeWith(c166546gE);
        } else {
            if (e1.LIZ(31744, "vc_upload_opt", true, false)) {
                EnumC43889HKj business = EnumC43889HKj.VOICE_CONVERSION;
                o.LJIIIZ(config, "config");
                o.LJIIIZ(business, "business");
                c43886HKg = new C43892HKm(config, business);
            } else {
                EnumC43889HKj business2 = EnumC43889HKj.VOICE_CONVERSION;
                o.LJIIIZ(config, "config");
                o.LJIIIZ(business2, "business");
                c43886HKg = new C43886HKg(config, business2);
            }
            final C68322mC c68322mC = new C68322mC();
            try {
                c43886HKg.LIZLLL(new HLJ() { // from class: X.6hI
                    @Override // X.HLJ
                    public final void LIZ() {
                    }

                    @Override // X.HLJ
                    public final void LIZJ() {
                    }

                    @Override // X.HLJ
                    public final void LJ() {
                    }

                    @Override // X.HLJ
                    public final int LIZIZ() {
                        UploadVideoConfig uploadVideoConfig = config.videoConfig;
                        if (uploadVideoConfig != null) {
                            return b.LIZIZ(uploadVideoConfig, "SubtitleOriginalSoundUpload");
                        }
                        return -1;
                    }

                    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
                    @Override // X.HLJ
                    public final void LIZLLL(int i, long j, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                        AbstractVideoUploader.this.LIZIZ();
                        if (i == 0) {
                            c68322mC.element = videoUploadInfo.getMVideoId();
                            AbstractVideoUploader.this.LIZ();
                            InterfaceC67352kd<C166546gE> interfaceC67352kd2 = c84654XKg;
                            C166546gE c166546gE2 = new C166546gE();
                            C68322mC<String> c68322mC2 = c68322mC;
                            c166546gE2.LIZ = true;
                            c166546gE2.LIZIZ = c68322mC2.element;
                            c166546gE2.LIZJ = null;
                            C3C5.m7constructorimpl(c166546gE2);
                            interfaceC67352kd2.resumeWith(c166546gE2);
                            return;
                        }
                        AbstractVideoUploader.this.LIZJ();
                        if (i != 2) {
                            return;
                        }
                        AbstractVideoUploader.this.LIZ();
                        InterfaceC67352kd<C166546gE> interfaceC67352kd3 = c84654XKg;
                        C166546gE c166546gE3 = new C166546gE();
                        c166546gE3.LIZJ = videoUploadInfo;
                        C3C5.m7constructorimpl(c166546gE3);
                        interfaceC67352kd3.resumeWith(c166546gE3);
                    }
                });
                c43886HKg.LJ(str);
                c43886HKg.LJFF();
            } catch (Exception unused) {
                c43886HKg.LIZ();
                C166546gE c166546gE2 = new C166546gE();
                C3C5.m7constructorimpl(c166546gE2);
                c84654XKg.resumeWith(c166546gE2);
            }
        }
        return c84654XKg.LIZ();
    }

    public static Object LIZIZ(NLEModel nLEModel, String str, boolean z, InterfaceC67352kd interfaceC67352kd) {
        NLEError LIZ2;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (C167376hZ.LIZ() && C167246hM.LIZIZ()) {
            LIZ2 = C167136hB.LIZ(str, nLEModel, C167246hM.LIZ().channels, C167246hM.LIZ().bitRate, C167246hM.LIZ().sampleRate, z, false);
        } else {
            VCOptConfig vCOptConfig = new VCOptConfig(0, 0, 0, 7, null);
            LIZ2 = C167136hB.LIZ(str, nLEModel, vCOptConfig.channels, vCOptConfig.bitRate, vCOptConfig.sampleRate, z, false);
        }
        if (str.length() > 0 && C44687HgJ.LIZIZ(str) && TEVideoUtils.nativeCheckAudioFile(str) == 0 && LIZ2 == NLEError.SUCCESS) {
            C166526gC c166526gC = new C166526gC();
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            o.LJIIIIZZ(tracks, "model.tracks");
            NLETrack nLETrack = (NLETrack) ORZ.LJLLLL(tracks);
            String str2 = null;
            if (nLETrack != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILL())) != null && (LJI = nLETrackSlot.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                str2 = LIZIZ.LIZJ();
            }
            c166526gC.LIZIZ = str2;
            c166526gC.LIZ = true;
            c166526gC.LIZJ = str;
            c166526gC.LIZLLL = LIZ2;
            C3C5.m7constructorimpl(c166526gC);
            c84654XKg.resumeWith(c166526gC);
        } else {
            C166526gC c166526gC2 = new C166526gC();
            c166526gC2.LIZLLL = LIZ2;
            C3C5.m7constructorimpl(c166526gC2);
            c84654XKg.resumeWith(c166526gC2);
        }
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r8, com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResult r9, java.lang.String r10, X.InterfaceC67352kd<? super X.C166536gD> r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167106h8.LJ(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResult, java.lang.String, X.2kd):java.lang.Object");
    }

    public static Object LIZ(Context context, final String str, String str2, final String str3, InterfaceC67352kd interfaceC67352kd) {
        String str4 = "";
        if (e1.LIZ(31744, "vc_download_opt", true, false)) {
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
            File file = new File(str2);
            String parent = file.getParent();
            if (parent != null) {
                str4 = parent;
            }
            if (str4.length() == 0) {
                C166536gD c166536gD = new C166536gD();
                C3C5.m7constructorimpl(c166536gD);
                c84654XKg.resumeWith(c166536gD);
            } else {
                DownloadTask with = C84261X5d.with(context);
                with.url(str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str4);
                LIZ2.append(File.separator);
                with.savePath(X1D.LIZIZ(LIZ2));
                with.name(file.getName());
                with.addTTNetCommonParam(true);
                with.retryCount(3);
                with.ignoreDataVerify(true);
                with.expiredRedownload(true);
                with.subThreadListener(new AbstractC167316hT() { // from class: X.6hE
                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        String str5;
                        StringBuilder LIZ3 = X1D.LIZ();
                        String str6 = null;
                        if (downloadInfo != null) {
                            str5 = downloadInfo.getSavePath();
                        } else {
                            str5 = null;
                        }
                        LIZ3.append(str5);
                        if (downloadInfo != null) {
                            str6 = downloadInfo.getName();
                        }
                        LIZ3.append(str6);
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        InterfaceC67352kd<C166536gD> interfaceC67352kd2 = c84654XKg;
                        C166536gD c166536gD2 = new C166536gD();
                        String str7 = str;
                        String str8 = str3;
                        c166536gD2.LIZIZ = LIZIZ;
                        c166536gD2.LJ = str7;
                        c166536gD2.LJFF = str8;
                        c166536gD2.LIZ = C78685UuP.LJJJZ(LIZIZ);
                        C3C5.m7constructorimpl(c166536gD2);
                        interfaceC67352kd2.resumeWith(c166536gD2);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        int i;
                        String str5;
                        InterfaceC67352kd<C166536gD> interfaceC67352kd2 = c84654XKg;
                        C166536gD c166536gD2 = new C166536gD();
                        String str6 = str;
                        String str7 = str3;
                        c166536gD2.LIZIZ = null;
                        if (baseException != null) {
                            i = baseException.getErrorCode();
                        } else {
                            i = 40000;
                        }
                        c166536gD2.LIZJ = i;
                        if (baseException == null || (str5 = baseException.getErrorMessage()) == null) {
                            str5 = "download exception";
                        }
                        c166536gD2.LIZLLL = str5;
                        c166536gD2.LJ = str6;
                        c166536gD2.LJFF = str7;
                        c166536gD2.LIZ = C78685UuP.LJJJZ(c166536gD2.LIZIZ);
                        C3C5.m7constructorimpl(c166536gD2);
                        interfaceC67352kd2.resumeWith(c166536gD2);
                    }
                });
                with.download();
            }
            return c84654XKg.LIZ();
        }
        final C84654XKg c84654XKg2 = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        File file2 = new File(str2);
        String parent2 = file2.getParent();
        if (parent2 != null) {
            str4 = parent2;
        }
        if (str4.length() == 0) {
            C166536gD c166536gD2 = new C166536gD();
            C3C5.m7constructorimpl(c166536gD2);
            c84654XKg2.resumeWith(c166536gD2);
        } else {
            DownloadTask with2 = C84261X5d.with(context);
            with2.url(str);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str4);
            LIZ3.append(File.separator);
            with2.savePath(X1D.LIZIZ(LIZ3));
            with2.name(file2.getName());
            with2.subThreadListener(new AbstractC167316hT() { // from class: X.6hF
                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String str5;
                    StringBuilder LIZ4 = X1D.LIZ();
                    String str6 = null;
                    if (downloadInfo != null) {
                        str5 = downloadInfo.getSavePath();
                    } else {
                        str5 = null;
                    }
                    LIZ4.append(str5);
                    if (downloadInfo != null) {
                        str6 = downloadInfo.getName();
                    }
                    LIZ4.append(str6);
                    String LIZIZ = X1D.LIZIZ(LIZ4);
                    InterfaceC67352kd<C166536gD> interfaceC67352kd2 = c84654XKg2;
                    C166536gD c166536gD3 = new C166536gD();
                    String str7 = str;
                    String str8 = str3;
                    c166536gD3.LIZIZ = LIZIZ;
                    c166536gD3.LJ = str7;
                    c166536gD3.LJFF = str8;
                    c166536gD3.LIZ = C78685UuP.LJJJZ(LIZIZ);
                    C3C5.m7constructorimpl(c166536gD3);
                    interfaceC67352kd2.resumeWith(c166536gD3);
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    int i;
                    String str5;
                    InterfaceC67352kd<C166536gD> interfaceC67352kd2 = c84654XKg2;
                    C166536gD c166536gD3 = new C166536gD();
                    String str6 = str;
                    String str7 = str3;
                    c166536gD3.LIZIZ = null;
                    if (baseException != null) {
                        i = baseException.getErrorCode();
                    } else {
                        i = 40000;
                    }
                    c166536gD3.LIZJ = i;
                    if (baseException == null || (str5 = baseException.getErrorMessage()) == null) {
                        str5 = "download exception";
                    }
                    c166536gD3.LIZLLL = str5;
                    c166536gD3.LJ = str6;
                    c166536gD3.LJFF = str7;
                    c166536gD3.LIZ = C78685UuP.LJJJZ(c166536gD3.LIZIZ);
                    C3C5.m7constructorimpl(c166536gD3);
                    interfaceC67352kd2.resumeWith(c166536gD3);
                }
            });
            with2.download();
        }
        return c84654XKg2.LIZ();
    }
}

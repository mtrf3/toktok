package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.SGx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71827SGx implements BDVideoUploaderListener {
    public final CompletionBlock<SH1> LIZ;
    public final BDVideoUploader LIZIZ;
    public final String LIZJ;
    public final InterfaceC38263Ezz LIZLLL;

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final String getStringFromExtern(int i) {
        return "";
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onLog(int i, int i2, String str) {
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onUploadVideoStage(int i, long j) {
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final int videoUploadCheckNetState(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        Long l2;
        String str7;
        Long l3;
        String str8;
        String str9 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        CompletionBlock<SH1> completionBlock = this.LIZ;
                        XBaseModel LJIILJJIL = C17N.LJIILJJIL(C65352Pkq.LIZ(SH1.class));
                        SH1 sh1 = (SH1) LJIILJJIL;
                        sh1.setTraceId(this.LIZJ);
                        XBaseModel LJIILJJIL2 = C17N.LJIILJJIL(C65352Pkq.LIZ(SH2.class));
                        SH2 sh2 = (SH2) LJIILJJIL2;
                        if (bDVideoInfo != null) {
                            l3 = Long.valueOf(bDVideoInfo.mErrorCode);
                        } else {
                            l3 = null;
                        }
                        sh2.setErrorCode(l3);
                        if (bDVideoInfo == null) {
                            str8 = null;
                        } else {
                            str8 = bDVideoInfo.mErrorMsg;
                        }
                        sh2.setErrorMessage(str8);
                        sh1.setErrorInfo((SH2) LJIILJJIL2);
                        completionBlock.onFailure(-7, "upload cancel", (XBaseResultModel) LJIILJJIL);
                        BDVideoUploader bDVideoUploader = this.LIZIZ;
                        if (bDVideoUploader == null) {
                            return;
                        }
                        bDVideoUploader.close();
                        return;
                    }
                    CompletionBlock<SH1> completionBlock2 = this.LIZ;
                    XBaseModel LJIILJJIL3 = C17N.LJIILJJIL(C65352Pkq.LIZ(SH1.class));
                    SH1 sh12 = (SH1) LJIILJJIL3;
                    sh12.setTraceId(this.LIZJ);
                    XBaseModel LJIILJJIL4 = C17N.LJIILJJIL(C65352Pkq.LIZ(SH2.class));
                    SH2 sh22 = (SH2) LJIILJJIL4;
                    if (bDVideoInfo != null) {
                        l2 = Long.valueOf(bDVideoInfo.mErrorCode);
                    } else {
                        l2 = null;
                    }
                    sh22.setErrorCode(l2);
                    if (bDVideoInfo == null) {
                        str7 = null;
                    } else {
                        str7 = bDVideoInfo.mErrorMsg;
                    }
                    sh22.setErrorMessage(str7);
                    sh12.setErrorInfo((SH2) LJIILJJIL4);
                    completionBlock2.onFailure(0, "upload failed", (XBaseResultModel) LJIILJJIL3);
                    BDVideoUploader bDVideoUploader2 = this.LIZIZ;
                    if (bDVideoUploader2 == null) {
                        return;
                    }
                    bDVideoUploader2.close();
                    return;
                }
                InterfaceC38263Ezz interfaceC38263Ezz = this.LIZLLL;
                if (interfaceC38263Ezz == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("traceID", this.LIZJ);
                jSONObject.put("progress", Float.valueOf(((float) j) / 100));
                interfaceC38263Ezz.LIZ("uploadVideoToVODProgress", jSONObject);
                return;
            }
            CompletionBlock<SH1> completionBlock3 = this.LIZ;
            XBaseModel LJIILJJIL5 = C17N.LJIILJJIL(C65352Pkq.LIZ(SH1.class));
            SH1 sh13 = (SH1) LJIILJJIL5;
            sh13.setTraceId(this.LIZJ);
            XBaseModel LJIILJJIL6 = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71829SGz.class));
            InterfaceC71829SGz interfaceC71829SGz = (InterfaceC71829SGz) LJIILJJIL6;
            if (bDVideoInfo != null) {
                str4 = bDVideoInfo.mVideoId;
            } else {
                str4 = null;
            }
            interfaceC71829SGz.setVid(str4);
            if (bDVideoInfo == null) {
                str5 = null;
            } else {
                str5 = bDVideoInfo.mCoverUri;
            }
            interfaceC71829SGz.setCoverUri(str5);
            if (bDVideoInfo != null) {
                str6 = bDVideoInfo.mVideoMediaInfo;
            } else {
                str6 = null;
            }
            interfaceC71829SGz.setMetaInfo(C38383F4p.LIZIZ(new JSONObject(str6)));
            sh13.setVideoInfo((InterfaceC71829SGz) LJIILJJIL6);
            completionBlock3.onSuccess((XBaseResultModel) LJIILJJIL5, "");
            BDVideoUploader bDVideoUploader3 = this.LIZIZ;
            if (bDVideoUploader3 == null) {
                return;
            }
            bDVideoUploader3.close();
        } catch (Exception e) {
            CompletionBlock<SH1> completionBlock4 = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("some exception happened : ");
            LIZ.append(e.getMessage());
            LIZ.append("; metaInfo = ");
            if (bDVideoInfo != null) {
                str = bDVideoInfo.mVideoMediaInfo;
            } else {
                str = null;
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            XBaseModel LJIILJJIL7 = C17N.LJIILJJIL(C65352Pkq.LIZ(SH1.class));
            SH1 sh14 = (SH1) LJIILJJIL7;
            sh14.setTraceId(this.LIZJ);
            InterfaceC71829SGz interfaceC71829SGz2 = (InterfaceC71829SGz) C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71829SGz.class));
            if (bDVideoInfo != null) {
                str2 = bDVideoInfo.mVideoId;
            } else {
                str2 = null;
            }
            interfaceC71829SGz2.setVid(str2);
            if (bDVideoInfo != null) {
                str3 = bDVideoInfo.mCoverUri;
            } else {
                str3 = null;
            }
            interfaceC71829SGz2.setCoverUri(str3);
            sh14.setVideoInfo(interfaceC71829SGz2);
            SH2 sh23 = (SH2) C17N.LJIILJJIL(C65352Pkq.LIZ(SH2.class));
            if (bDVideoInfo != null) {
                l = Long.valueOf(bDVideoInfo.mErrorCode);
            } else {
                l = null;
            }
            sh23.setErrorCode(l);
            if (bDVideoInfo != null) {
                str9 = bDVideoInfo.mErrorMsg;
            }
            sh23.setErrorMessage(str9);
            sh14.setErrorInfo(sh23);
            completionBlock4.onFailure(0, LIZIZ, (XBaseResultModel) LJIILJJIL7);
        }
    }

    public C71827SGx(C37356ElM c37356ElM, BDVideoUploader bDVideoUploader, String curTraceId, InterfaceC38263Ezz interfaceC38263Ezz) {
        o.LJIIJ(curTraceId, "curTraceId");
        this.LIZ = c37356ElM;
        this.LIZIZ = bDVideoUploader;
        this.LIZJ = curTraceId;
        this.LIZLLL = interfaceC38263Ezz;
    }
}

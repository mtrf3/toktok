package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.SGq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71820SGq implements BDImageXUploaderListener {
    public final ArrayList<InterfaceC71821SGr> LIZ;
    public final CompletionBlock<InterfaceC71819SGp> LIZIZ;
    public final BDImageXUploader LIZJ;
    public final String LIZLLL;
    public final InterfaceC38263Ezz LJ;

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final int imageXUploadCheckNetState(int i, int i2) {
        return 0;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onLog(int i, int i2, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
        String str;
        Long l;
        Integer num;
        Long l2;
        String str2;
        Long l3;
        String str3;
        String str4;
        String str5;
        Integer num2;
        String str6;
        String str7;
        String str8 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return;
                                }
                            } else {
                                ArrayList<InterfaceC71821SGr> arrayList = this.LIZ;
                                XBaseModel LJIILJJIL = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71821SGr.class));
                                InterfaceC71821SGr interfaceC71821SGr = (InterfaceC71821SGr) LJIILJJIL;
                                if (bDImageXInfo != null) {
                                    str4 = bDImageXInfo.mImageTosKey;
                                } else {
                                    str4 = null;
                                }
                                interfaceC71821SGr.setUri(str4);
                                if (bDImageXInfo != null) {
                                    str5 = bDImageXInfo.mMetaInfo;
                                } else {
                                    str5 = null;
                                }
                                interfaceC71821SGr.setMetaInfo(C38383F4p.LIZIZ(new JSONObject(str5)));
                                arrayList.add(LJIILJJIL);
                                InterfaceC38263Ezz interfaceC38263Ezz = this.LJ;
                                if (interfaceC38263Ezz == null) {
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("traceID", this.LIZLLL);
                                if (bDImageXInfo == null) {
                                    num2 = null;
                                } else {
                                    num2 = Integer.valueOf(bDImageXInfo.mFileIndex);
                                }
                                jSONObject.put("fileIndex", num2);
                                if (bDImageXInfo != null) {
                                    str6 = bDImageXInfo.mImageTosKey;
                                } else {
                                    str6 = null;
                                }
                                jSONObject.put("uri", str6);
                                if (bDImageXInfo != null) {
                                    str7 = bDImageXInfo.mMetaInfo;
                                } else {
                                    str7 = null;
                                }
                                jSONObject.put("metaInfo", C38383F4p.LIZIZ(new JSONObject(str7)));
                                interfaceC38263Ezz.LIZ("uploadImagesToImageXSingleImageComplete", jSONObject);
                                return;
                            }
                        } else {
                            CompletionBlock<InterfaceC71819SGp> completionBlock = this.LIZIZ;
                            XBaseModel LJIILJJIL2 = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71819SGp.class));
                            InterfaceC71819SGp interfaceC71819SGp = (InterfaceC71819SGp) LJIILJJIL2;
                            interfaceC71819SGp.setTraceId(this.LIZLLL);
                            XBaseModel LJIILJJIL3 = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71822SGs.class));
                            InterfaceC71822SGs interfaceC71822SGs = (InterfaceC71822SGs) LJIILJJIL3;
                            if (bDImageXInfo != null) {
                                l3 = Long.valueOf(bDImageXInfo.mErrorCode);
                            } else {
                                l3 = null;
                            }
                            interfaceC71822SGs.setErrorCode(l3);
                            if (bDImageXInfo == null) {
                                str3 = null;
                            } else {
                                str3 = bDImageXInfo.mMetaInfo;
                            }
                            interfaceC71822SGs.setErrorMessage(str3);
                            interfaceC71819SGp.setErrorInfo((InterfaceC71822SGs) LJIILJJIL3);
                            completionBlock.onFailure(-7, "upload cancelled", (XBaseResultModel) LJIILJJIL2);
                            BDImageXUploader bDImageXUploader = this.LIZJ;
                            if (bDImageXUploader == null) {
                                return;
                            }
                            bDImageXUploader.close();
                            return;
                        }
                    }
                    CompletionBlock<InterfaceC71819SGp> completionBlock2 = this.LIZIZ;
                    XBaseModel LJIILJJIL4 = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71819SGp.class));
                    InterfaceC71819SGp interfaceC71819SGp2 = (InterfaceC71819SGp) LJIILJJIL4;
                    interfaceC71819SGp2.setTraceId(this.LIZLLL);
                    XBaseModel LJIILJJIL5 = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71822SGs.class));
                    InterfaceC71822SGs interfaceC71822SGs2 = (InterfaceC71822SGs) LJIILJJIL5;
                    if (bDImageXInfo != null) {
                        l2 = Long.valueOf(bDImageXInfo.mErrorCode);
                    } else {
                        l2 = null;
                    }
                    interfaceC71822SGs2.setErrorCode(l2);
                    if (bDImageXInfo == null) {
                        str2 = null;
                    } else {
                        str2 = bDImageXInfo.mMetaInfo;
                    }
                    interfaceC71822SGs2.setErrorMessage(str2);
                    interfaceC71819SGp2.setErrorInfo((InterfaceC71822SGs) LJIILJJIL5);
                    completionBlock2.onFailure(0, "upload failed", (XBaseResultModel) LJIILJJIL4);
                    BDImageXUploader bDImageXUploader2 = this.LIZJ;
                    if (bDImageXUploader2 == null) {
                        return;
                    }
                    bDImageXUploader2.close();
                    return;
                }
                InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJ;
                if (interfaceC38263Ezz2 == null) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("traceID", this.LIZLLL);
                if (bDImageXInfo == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(bDImageXInfo.mFileIndex);
                }
                jSONObject2.put("fileIndex", num);
                jSONObject2.put("progress", Float.valueOf(((float) j) / 100));
                interfaceC38263Ezz2.LIZ("uploadImagesToImageXProgress", jSONObject2);
                return;
            }
            CompletionBlock<InterfaceC71819SGp> completionBlock3 = this.LIZIZ;
            XBaseModel LJIILJJIL6 = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71819SGp.class));
            InterfaceC71819SGp interfaceC71819SGp3 = (InterfaceC71819SGp) LJIILJJIL6;
            interfaceC71819SGp3.setTraceId(this.LIZLLL);
            interfaceC71819SGp3.setImageInfos(this.LIZ);
            completionBlock3.onSuccess((XBaseResultModel) LJIILJJIL6, "");
            BDImageXUploader bDImageXUploader3 = this.LIZJ;
            if (bDImageXUploader3 == null) {
                return;
            }
            bDImageXUploader3.close();
        } catch (Exception e) {
            CompletionBlock<InterfaceC71819SGp> completionBlock4 = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("some exception happened: ");
            LIZ.append(e.getMessage());
            LIZ.append("; metaInfo : ");
            if (bDImageXInfo != null) {
                str = bDImageXInfo.mMetaInfo;
            } else {
                str = null;
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            XBaseModel LJIILJJIL7 = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71819SGp.class));
            InterfaceC71819SGp interfaceC71819SGp4 = (InterfaceC71819SGp) LJIILJJIL7;
            interfaceC71819SGp4.setTraceId(this.LIZLLL);
            InterfaceC71822SGs interfaceC71822SGs3 = (InterfaceC71822SGs) C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC71822SGs.class));
            if (bDImageXInfo != null) {
                l = Long.valueOf(bDImageXInfo.mErrorCode);
            } else {
                l = null;
            }
            interfaceC71822SGs3.setErrorCode(l);
            if (bDImageXInfo != null) {
                str8 = bDImageXInfo.mMetaInfo;
            }
            interfaceC71822SGs3.setErrorMessage(str8);
            interfaceC71819SGp4.setErrorInfo(interfaceC71822SGs3);
            completionBlock4.onFailure(0, LIZIZ, (XBaseResultModel) LJIILJJIL7);
            BDImageXUploader bDImageXUploader4 = this.LIZJ;
            if (bDImageXUploader4 == null) {
                return;
            }
            bDImageXUploader4.close();
        }
    }

    public C71820SGq(C37356ElM c37356ElM, BDImageXUploader bDImageXUploader, String curTraceId, InterfaceC38263Ezz interfaceC38263Ezz) {
        o.LJIIJ(curTraceId, "curTraceId");
        this.LIZIZ = c37356ElM;
        this.LIZJ = bDImageXUploader;
        this.LIZLLL = curTraceId;
        this.LJ = interfaceC38263Ezz;
        this.LIZ = new ArrayList<>();
    }
}

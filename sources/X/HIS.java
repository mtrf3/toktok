package X;

import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.gamora.editor.smartsynthesis.SmartSynthesisModelPath;
import com.ss.bduploader.BDUploadUtil;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* loaded from: classes8.dex */
public final class HIS {
    public boolean LIZ;

    public final void LIZ() {
        String str;
        String str2;
        HIQ.LIZIZ("init start");
        if (!e1.LIZ(31744, "studio_enable_smart_synthesis", true, false)) {
            HIQ.LIZIZ("SmartSynthesisModelFetcher -> smart compile setting is disable return");
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SmartSynthesisModelFetcher -> model path template: ");
            LIZ.append(HIW.LJIIJ.getModelPath());
            HIQ.LIZIZ(X1D.LIZIZ(LIZ));
            if (!HIQ.LIZ()) {
                HIQ.LIZIZ("SmartSynthesisModelFetcher -> init smart compile model is invalid return");
            } else {
                List<String> list = HIQ.LIZIZ;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<String> it = list.iterator();
                while (true) {
                    String str3 = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    String[] strArr = new String[2];
                    C5H3 c5h3 = HIQ.LIZ;
                    SmartSynthesisModelPath smartSynthesisModelPath = (SmartSynthesisModelPath) c5h3.getValue();
                    if (smartSynthesisModelPath == null || (str = smartSynthesisModelPath.smartcodec) == null) {
                        str = "";
                    }
                    strArr[0] = o.LJJJJZ(str, "${resolution}", next, false);
                    SmartSynthesisModelPath smartSynthesisModelPath2 = (SmartSynthesisModelPath) c5h3.getValue();
                    if (smartSynthesisModelPath2 != null && (str2 = smartSynthesisModelPath2.statics) != null) {
                        str3 = str2;
                    }
                    strArr[1] = o.LJJJJZ(str3, "${resolution}", next, false);
                    arrayList.add(C47261Igj.LJJIJIIJI(strArr));
                }
                Iterator it2 = ((ArrayList) C32I.LJJLI(arrayList)).iterator();
                while (it2.hasNext()) {
                    final String str4 = (String) it2.next();
                    java.util.Map<String, List<String>> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("", C47261Igj.LJJIJIL(str4)));
                    String[] strArr2 = {""};
                    if (DownloadableModelSupport.isInitialized()) {
                        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(strArr2, LJJLIIIIJ, new IFetchResourceListener() { // from class: X.5hv
                            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                            public final void onFailure(Exception exception) {
                                kotlin.jvm.internal.o.LJIIIZ(exception, "exception");
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("fetchSmartCompileSetting download failed: ");
                                LIZ2.append(exception.getMessage());
                                HIQ.LIZIZ(X1D.LIZIZ(LIZ2));
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
                            
                                if (new java.io.File(r2).exists() == false) goto L8;
                             */
                            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void onSuccess(long r5) {
                                /*
                                    r4 = this;
                                    java.lang.String r0 = "fetchSmartCompileSetting download success"
                                    X.HIQ.LIZIZ(r0)
                                    X.XBf r0 = X.XBE.LJIIIIZZ
                                    r0.getClass()
                                    X.XBE r0 = X.C84419XBf.LIZ()
                                    com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r3 = r0.LIZLLL()
                                    java.lang.String r2 = r1
                                    r1 = 0
                                    r0 = 0
                                    java.lang.String r0 = r3.realFindResourceUri(r1, r0, r2)
                                    java.net.URI r0 = java.net.URI.create(r0)     // Catch: java.lang.Exception -> L39
                                    java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> L39
                                    java.lang.String r0 = "filePath"
                                    kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L39
                                    int r0 = r2.length()     // Catch: java.lang.Exception -> L39
                                    if (r0 != 0) goto L2e
                                    goto L39
                                L2e:
                                    java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L39
                                    r0.<init>(r2)     // Catch: java.lang.Exception -> L39
                                    boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L39
                                    if (r0 != 0) goto L3b
                                L39:
                                    java.lang.String r2 = ""
                                L3b:
                                    int r0 = r2.length()
                                    if (r0 != 0) goto L42
                                L41:
                                    return
                                L42:
                                    java.util.Map<java.lang.String, java.lang.String> r1 = X.HIQ.LIZLLL
                                    java.lang.String r0 = r1
                                    r1.put(r0, r2)
                                    java.lang.StringBuilder r1 = X.X1D.LIZ()
                                    java.lang.String r0 = "modelName: ==> "
                                    r1.append(r0)
                                    java.lang.String r0 = r1
                                    r1.append(r0)
                                    java.lang.String r0 = " \n path: ==> "
                                    r1.append(r0)
                                    r1.append(r2)
                                    java.lang.String r0 = X.X1D.LIZIZ(r1)
                                    X.HIQ.LIZIZ(r0)
                                    goto L41
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C142115hv.onSuccess(long):void");
                            }
                        });
                    }
                }
            }
        }
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        BDUploadUtil.setVideoEventUpload(new C32151Nz());
        if (e1.LIZ(31744, "enable_upload_sdk_native_log", true, false)) {
            C60903NvH.LJIIJJI().LJJIIJ();
        }
        BDUploadUtil.setEnableNativeLog(false);
        FFL.LJIIIZ().getClass();
        BDUploadUtil.setEnableDispatch(Boolean.valueOf(FFL.LJ(31744, "enable_upload_sdk_host_dispatch", true, false)));
        BDUploadUtil.setDispatchImp(C64683Pa3.LIZ);
    }
}

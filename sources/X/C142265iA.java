package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.5iA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142265iA {
    public static final void LIZ(String requirement, final String modelName, final InterfaceC142275iB interfaceC142275iB) {
        o.LJIIIZ(requirement, "requirement");
        o.LJIIIZ(modelName, "modelName");
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{requirement}, C113554cx.LJJLIIIIJ(new OSZ(requirement, C47261Igj.LJJIJIL(modelName))), new IFetchResourceListener() { // from class: X.5i9
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exception) {
                o.LJIIIZ(exception, "exception");
                InterfaceC142275iB interfaceC142275iB2 = interfaceC142275iB;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fetchResourcesByRequirementsAndModelNames onFailure: ");
                LIZ.append(android.util.Log.getStackTraceString(exception));
                interfaceC142275iB2.LIZ(X1D.LIZIZ(LIZ));
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onSuccess(long j) {
                String findResourceUri;
                try {
                    if (UseKNPlatform.enableKNPlatform) {
                        XBE.LJIIIIZZ.getClass();
                        findResourceUri = C84419XBf.LIZ().LIZLLL().findResourceUri(modelName);
                    } else {
                        findResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, modelName);
                    }
                    String str = "";
                    try {
                        java.net.URI create = java.net.URI.create(findResourceUri);
                        o.LJIIIIZZ(create, "URI.create(urlPath)");
                        String filePath = create.getPath();
                        if (!TextUtils.isEmpty(filePath) && new File(filePath).exists()) {
                            o.LJIIIIZZ(filePath, "filePath");
                            str = filePath;
                        }
                    } catch (Exception unused) {
                    }
                    if (str.length() == 0) {
                        interfaceC142275iB.LIZ("fetchResourcesByRequirementsAndModelNames success, but tryGetFilePatch empty");
                    } else {
                        interfaceC142275iB.onSuccess(str);
                    }
                } catch (Exception e) {
                    InterfaceC142275iB interfaceC142275iB2 = interfaceC142275iB;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("fetchResourcesByRequirementsAndModelNames success, but getResourceFinder appear exception ");
                    LIZ.append(e);
                    interfaceC142275iB2.LIZ(X1D.LIZIZ(LIZ));
                }
            }
        });
    }
}

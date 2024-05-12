package X;

import com.ss.android.ugc.aweme.services.audio.IAudioModeAVEnvOpt;
import com.ss.android.ugc.aweme.services.audio.IAudioModelService;
import com.ss.android.ugc.aweme.services.audio.IAudioService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.jvm.internal.o;

/* renamed from: X.5fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140495fJ implements IAudioModelService, IAudioServiceFactory<IAudioModeAVEnvOpt> {
    public IAudioModeAVEnvOpt LIZ;

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
    public final IAudioService getAudioService(IAudioModeAVEnvOpt iAudioModeAVEnvOpt) {
        IAudioModeAVEnvOpt params = iAudioModeAVEnvOpt;
        o.LJIIIZ(params, "params");
        this.LIZ = params;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioModelService
    public final void fetchResourcesByRequirementsAndModelNames(String requirement, final String modelName, final IDownloadModelCallback callback) {
        o.LJIIIZ(requirement, "requirement");
        o.LJIIIZ(modelName, "modelName");
        o.LJIIIZ(callback, "callback");
        IAudioModeAVEnvOpt iAudioModeAVEnvOpt = this.LIZ;
        if (iAudioModeAVEnvOpt != null) {
            iAudioModeAVEnvOpt.initDownloadableModel();
        }
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{requirement}, C113554cx.LJJLIIIIJ(new OSZ(requirement, C47261Igj.LJJIJIL(modelName))), new IFetchResourceListener() { // from class: X.5hU
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exception) {
                o.LJIIIZ(exception, "exception");
                callback.onFailure();
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #0 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0010, B:7:0x001f, B:9:0x0025, B:12:0x003f, B:14:0x0038), top: B:1:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0010, B:7:0x001f, B:9:0x0025, B:12:0x003f, B:14:0x0038), top: B:1:0x0000 }] */
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(long r5) {
                /*
                    r4 = this;
                    boolean r0 = com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform.enableKNPlatform     // Catch: java.lang.Exception -> L45
                    r3 = 0
                    if (r0 == 0) goto L38
                    X.XBf r0 = X.XBE.LJIIIIZZ     // Catch: java.lang.Exception -> L45
                    r0.getClass()     // Catch: java.lang.Exception -> L45
                    boolean r0 = X.C84419XBf.LIZJ()     // Catch: java.lang.Exception -> L45
                    if (r0 == 0) goto L38
                    X.XBE r0 = X.C84419XBf.LIZ()     // Catch: java.lang.Exception -> L45
                    com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r2 = r0.LIZLLL()     // Catch: java.lang.Exception -> L45
                    java.lang.String r1 = r1     // Catch: java.lang.Exception -> L45
                    r0 = 0
                    java.lang.String r1 = r2.realFindResourceUri(r0, r3, r1)     // Catch: java.lang.Exception -> L45
                L1f:
                    boolean r0 = X.C78685UuP.LJJJZ(r1)     // Catch: java.lang.Exception -> L45
                    if (r0 == 0) goto L3f
                    com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback r2 = r2     // Catch: java.lang.Exception -> L45
                    java.net.URI r0 = java.net.URI.create(r1)     // Catch: java.lang.Exception -> L45
                    java.lang.String r1 = r0.getPath()     // Catch: java.lang.Exception -> L45
                    java.lang.String r0 = "create(path).path"
                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L45
                    r2.onSuccess(r1)     // Catch: java.lang.Exception -> L45
                    goto L54
                L38:
                    java.lang.String r0 = r1     // Catch: java.lang.Exception -> L45
                    java.lang.String r1 = com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder.findResourceUri(r3, r0)     // Catch: java.lang.Exception -> L45
                    goto L1f
                L3f:
                    com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback r0 = r2     // Catch: java.lang.Exception -> L45
                    r0.onFailure()     // Catch: java.lang.Exception -> L45
                    goto L54
                L45:
                    r0 = move-exception
                    java.lang.StackTraceElement[] r1 = r0.getStackTrace()
                    java.io.PrintStream r0 = java.lang.System.out
                    r0.print(r1)
                    com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback r0 = r2
                    r0.onFailure()
                L54:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C141845hU.onSuccess(long):void");
            }
        });
    }
}

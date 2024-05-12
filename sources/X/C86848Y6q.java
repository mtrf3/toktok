package X;

import Y.ACallableS92S0200000_15;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.gamora.recorder.vopclone.VopCameraClientService;
import com.ss.android.ugc.gamora.recorder.vopclone.VopPermissionService;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Y6q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86848Y6q extends AbstractC86852Y6u {
    public final String LJLJJL = "";
    public final String LJLJJLL = "sami";

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        View view2;
        InterfaceC86855Y6x interfaceC86855Y6x = (InterfaceC86855Y6x) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String str = null;
        if (o.LJ(AccountService.LJIJ().LJIILL(), "US")) {
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null) {
                str = interfaceC38263Ezz.LIZIZ();
            }
            InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
            interfaceC86851Y6t.setVopCode(-8);
            c37356ElM.onFailure(0, "this region does not support", interfaceC86851Y6t);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            view = interfaceC38263Ezz2.getView();
        } else {
            view = null;
        }
        if (view instanceof WebView) {
            InterfaceC38263Ezz interfaceC38263Ezz3 = this.LJLIL;
            if (interfaceC38263Ezz3 != null) {
                view2 = interfaceC38263Ezz3.getView();
            } else {
                view2 = null;
            }
            o.LJII(view2, "null cannot be cast to non-null type android.webkit.WebView");
            String url = ((WebView) view2).getUrl();
            if (url == null) {
                InterfaceC38263Ezz interfaceC38263Ezz4 = this.LJLIL;
                if (interfaceC38263Ezz4 != null) {
                    str = interfaceC38263Ezz4.LIZIZ();
                }
                InterfaceC86851Y6t interfaceC86851Y6t2 = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
                interfaceC86851Y6t2.setVopCode(-7);
                c37356ElM.onFailure(0, "invalid business channel, only sami business use this method", interfaceC86851Y6t2);
                return;
            }
            if (!s.LJJJLZIJ(url, this.LJLJJLL, false)) {
                InterfaceC38263Ezz interfaceC38263Ezz5 = this.LJLIL;
                if (interfaceC38263Ezz5 != null) {
                    str = interfaceC38263Ezz5.LIZIZ();
                }
                InterfaceC86851Y6t interfaceC86851Y6t3 = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
                interfaceC86851Y6t3.setVopCode(-7);
                c37356ElM.onFailure(0, "invalid business channel, only sami business use this method", interfaceC86851Y6t3);
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.INIT.getValue()))) {
                String requirement = this.LJLJJL;
                final String modelName = C86850Y6s.LIZIZ.LJIILJJIL();
                final C86849Y6r c86849Y6r = new C86849Y6r(this, c37356ElM);
                o.LJIIIZ(requirement, "requirement");
                o.LJIIIZ(modelName, "modelName");
                java.util.Map<String, List<String>> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ(requirement, C47261Igj.LJJIJIL(modelName)));
                VopCameraClientService.LIZ().initDownloadableModel();
                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{requirement}, LJJLIIIIJ, new IFetchResourceListener() { // from class: X.5hX
                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    public final void onFailure(Exception exception) {
                        o.LJIIIZ(exception, "exception");
                        InterfaceC141885hY interfaceC141885hY = c86849Y6r;
                        if (interfaceC141885hY != null) {
                            interfaceC141885hY.onFailure();
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0010, B:7:0x001f, B:9:0x0025, B:11:0x0031, B:15:0x0042, B:17:0x0046, B:20:0x003a), top: B:1:0x0000 }] */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0010, B:7:0x001f, B:9:0x0025, B:11:0x0031, B:15:0x0042, B:17:0x0046, B:20:0x003a), top: B:1:0x0000 }] */
                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onSuccess(long r5) {
                        /*
                            r4 = this;
                            boolean r0 = com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform.enableKNPlatform     // Catch: java.lang.Exception -> L4a
                            r3 = 0
                            if (r0 == 0) goto L3a
                            X.XBf r0 = X.XBE.LJIIIIZZ     // Catch: java.lang.Exception -> L4a
                            r0.getClass()     // Catch: java.lang.Exception -> L4a
                            boolean r0 = X.C84419XBf.LIZJ()     // Catch: java.lang.Exception -> L4a
                            if (r0 == 0) goto L3a
                            X.XBE r0 = X.C84419XBf.LIZ()     // Catch: java.lang.Exception -> L4a
                            com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r2 = r0.LIZLLL()     // Catch: java.lang.Exception -> L4a
                            java.lang.String r1 = r1     // Catch: java.lang.Exception -> L4a
                            r0 = 0
                            java.lang.String r1 = r2.realFindResourceUri(r0, r3, r1)     // Catch: java.lang.Exception -> L4a
                        L1f:
                            boolean r0 = X.C78685UuP.LJJJZ(r1)     // Catch: java.lang.Exception -> L4a
                            if (r0 == 0) goto L42
                            java.net.URI r0 = java.net.URI.create(r1)     // Catch: java.lang.Exception -> L4a
                            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> L4a
                            X.5hY r1 = r2     // Catch: java.lang.Exception -> L4a
                            if (r1 == 0) goto L41
                            java.lang.String r0 = "modelPath"
                            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L4a
                            r1.onSuccess(r2)     // Catch: java.lang.Exception -> L4a
                            goto L41
                        L3a:
                            java.lang.String r0 = r1     // Catch: java.lang.Exception -> L4a
                            java.lang.String r1 = com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder.findResourceUri(r3, r0)     // Catch: java.lang.Exception -> L4a
                            goto L1f
                        L41:
                            return
                        L42:
                            X.5hY r0 = r2     // Catch: java.lang.Exception -> L4a
                            if (r0 == 0) goto L5b
                            r0.onFailure()     // Catch: java.lang.Exception -> L4a
                            goto L5b
                        L4a:
                            r1 = move-exception
                            X.5hY r0 = r2
                            if (r0 == 0) goto L52
                            r0.onFailure()
                        L52:
                            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
                            java.io.PrintStream r0 = java.lang.System.out
                            r0.print(r1)
                        L5b:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C141875hX.onSuccess(long):void");
                    }
                });
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.GET_CURRENT_STATE.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 20));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.SIGN_AGREEMENT.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 21));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.INIT_RECORD_TASK.getValue()))) {
                if (VopPermissionService.LIZ().checkPermissionGranted("android.permission.RECORD_AUDIO")) {
                    C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 22));
                    return;
                }
                OHI ohi = OHI.LIZ;
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                o.LJIIIIZZ(validTopActivity, "getValidTopActivity()");
                ohi.getClass();
                boolean LJI = OHI.LJI(validTopActivity, "android.permission.RECORD_AUDIO");
                C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
                Activity validTopActivity2 = ActivityStack.getValidTopActivity();
                o.LJIIIIZZ(validTopActivity2, "getValidTopActivity()");
                c61098NyQ.LIZIZ(validTopActivity2, TokenCert.Companion.with("bpea-vop_record_voice_permission")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new C86847Y6p(LJI, this, c37356ElM));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.GET_TEXT_INFO.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 24));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.GET_RECORDING_STATUS.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 25));
                return;
            }
            Number methodType = interfaceC86855Y6x.getMethodType();
            EnumC86854Y6w enumC86854Y6w = EnumC86854Y6w.RECORD_COMMAND;
            if (o.LJ(methodType, Integer.valueOf(enumC86854Y6w.getValue())) && o.LJ(interfaceC86855Y6x.getStartOrStopRecord(), Boolean.TRUE)) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 26));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(enumC86854Y6w.getValue())) && !o.LJ(interfaceC86855Y6x.getStartOrStopRecord(), Boolean.TRUE)) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 27));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.CHECK_AUDIO_QUAILITY.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 9));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.UPLOAD_COMMAND.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 10));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.GET_SPEAKER_INFO.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 11));
                return;
            }
            Number methodType2 = interfaceC86855Y6x.getMethodType();
            EnumC86854Y6w enumC86854Y6w2 = EnumC86854Y6w.SET_PUBLIC_PRIVATE;
            if (o.LJ(methodType2, Integer.valueOf(enumC86854Y6w2.getValue())) && o.LJ(interfaceC86855Y6x.getManageVoiceType(), 4)) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 12));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(enumC86854Y6w2.getValue())) && o.LJ(interfaceC86855Y6x.getManageVoiceType(), 3)) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 13));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(enumC86854Y6w2.getValue())) && o.LJ(interfaceC86855Y6x.getManageVoiceType(), 5)) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 14));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.PREPARE_PLAYER.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 15));
                return;
            }
            Number methodType3 = interfaceC86855Y6x.getMethodType();
            EnumC86854Y6w enumC86854Y6w3 = EnumC86854Y6w.PLAY_COMMAND;
            if (o.LJ(methodType3, Integer.valueOf(enumC86854Y6w3.getValue())) && o.LJ(interfaceC86855Y6x.getPlayOrStopAudio(), Boolean.TRUE)) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 16));
                return;
            }
            if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(enumC86854Y6w3.getValue())) && !o.LJ(interfaceC86855Y6x.getPlayOrStopAudio(), Boolean.TRUE)) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 17));
                return;
            } else if (o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.GET_PLAYER_PROGRESS.getValue()))) {
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 18));
                return;
            } else {
                if (!o.LJ(interfaceC86855Y6x.getMethodType(), Integer.valueOf(EnumC86854Y6w.DESTROY_ENGINE.getValue()))) {
                    return;
                }
                C10K.LIZJ(new ACallableS92S0200000_15(c37356ElM, this, 19));
                return;
            }
        }
        InterfaceC38263Ezz interfaceC38263Ezz6 = this.LJLIL;
        if (interfaceC38263Ezz6 != null) {
            str = interfaceC38263Ezz6.LIZIZ();
        }
        InterfaceC86851Y6t interfaceC86851Y6t4 = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t4.setVopCode(-7);
        c37356ElM.onFailure(0, "invalid business channel, only sami business use this method", interfaceC86851Y6t4);
    }
}

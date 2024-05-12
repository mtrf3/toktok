package com.ss.android.ugc.aweme.effectcreator.services;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C145995oB;
import X.C16880lQ;
import X.C1AU;
import X.C47261Igj;
import X.C5L7;
import X.C60903NvH;
import X.C76800UCe;
import X.C780334l;
import X.C78613UtF;
import X.C78915Uy7;
import X.C93653aUL;
import X.C93812aWu;
import X.C94135ac7;
import X.C94341afR;
import X.C94435agx;
import X.C94794amk;
import X.C94795aml;
import X.C94798amo;
import X.C94799amp;
import X.C94800amq;
import X.C94801amr;
import X.C94802ams;
import X.ESB;
import X.EnumC58928NAu;
import X.H78;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.TAE;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokEffectCreatePipelineImpl implements IEffectCreatePipeline {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public boolean onInterceptExport(Intent intent) {
        o.LJIIIZ(intent, "intent");
        return false;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public C94341afR getConfig() {
        return new C94341afR();
    }

    private final OSZ<String, RecordConfig.Builder> buildStartCameraConfig(Activity activity) {
        Bundle LIZJ = C60903NvH.LJIIJJI().LJIL().LIZJ(activity);
        String string = LIZJ.getString("shoot_way");
        String string2 = LIZJ.getString("shoot_page_enter_from");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = LIZJ.getString("creation_id");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.enterFrom(string2);
        builder.shootWay(string);
        builder.recordParam("customizedSticker");
        builder.showStickerPanel(true);
        builder.creationId(string3);
        return new OSZ<>(string2, builder);
    }

    private final void goToBackToCameraOnPublishSuccess(Activity activity, String str) {
        Intent intent = new Intent();
        intent.putExtra("request_code_publish_effect_result", str);
        if (!activity.isFinishing()) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    private final void goToBackToCameraOnSaveDraft(Activity activity, String str) {
        Intent intent = new Intent();
        intent.putExtra("request_code_save_draft_result", str);
        if (!activity.isFinishing()) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    private final void startCameraOnDraftSaved(Activity activity, String str) {
        OSZ<String, RecordConfig.Builder> buildStartCameraConfig = buildStartCameraConfig(activity);
        String first = buildStartCameraConfig.getFirst();
        RecordConfig.Builder second = buildStartCameraConfig.getSecond();
        second.savedDraft(str);
        startCameraScene(first, activity, second);
    }

    private final void startCameraOnPublishSuccess(Activity activity, String str) {
        OSZ<String, RecordConfig.Builder> buildStartCameraConfig = buildStartCameraConfig(activity);
        String first = buildStartCameraConfig.getFirst();
        RecordConfig.Builder second = buildStartCameraConfig.getSecond();
        second.unpublishedEffect(str);
        startCameraScene(first, activity, second);
    }

    public final Object cropIconAndRename(String str, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94795aml(str, null), interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public void onExportEffectBefore(Intent intent, CKEDraftInfo cKEDraftInfo) {
        o.LJIIIZ(intent, "intent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Export before, draftInfo=");
        LIZ.append(cKEDraftInfo);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
    }

    private final void logSaveDraftEvent(Activity activity, EffectPackageData effectPackageData, CKEDraftInfo cKEDraftInfo) {
        String str;
        String str2;
        Bundle LIZJ = C60903NvH.LJIIJJI().LJIL().LIZJ(activity);
        String string = LIZJ.getString("shoot_way");
        String string2 = LIZJ.getString("creation_id");
        String string3 = LIZJ.getString("enter_from");
        if (string3 == null) {
            string3 = "";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", string2);
        c145995oB.LJI("template_id", effectPackageData.LJLJI);
        c145995oB.LJI("ame_enter_from", string3);
        c145995oB.LJI("shoot_way", string);
        c145995oB.LJI("project_id", effectPackageData.projectId);
        c145995oB.LJI("project_source", effectPackageData.projectSource);
        c145995oB.LJI("project_size", String.valueOf(effectPackageData.LJLJL));
        c145995oB.LJI("object_cnt", String.valueOf(effectPackageData.LJLJLJ));
        c145995oB.LJI("command_cnt", String.valueOf(effectPackageData.LJLJLLL));
        c145995oB.LJI("valid_command_cnt", String.valueOf(effectPackageData.LJLL));
        c145995oB.LJI("valid_action_cnt", String.valueOf(effectPackageData.LJLLI));
        c145995oB.LJI("interaction_duration", String.valueOf(effectPackageData.interactionDuration));
        c145995oB.LJI("layer_duration", String.valueOf(effectPackageData.layerDuration));
        c145995oB.LJI("ame_save_from", effectPackageData.LJLLL);
        c145995oB.LJI("effect_create_duration", String.valueOf(effectPackageData.duration));
        c145995oB.LIZ(1, "is_success");
        EffectHint effectHint = cKEDraftInfo.effectHint;
        if (effectHint == null || (str = effectHint.hint) == null) {
            str = "None";
        }
        c145995oB.LJI("hint_text", str);
        EffectHint effectHint2 = cKEDraftInfo.effectHint;
        if (effectHint2 == null || (str2 = effectHint2.hint) == null) {
            str2 = "null";
        }
        c145995oB.LJI("hint_id", str2);
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C94798amo(cKEDraftInfo, c145995oB, null), 3);
    }

    private final void startCameraScene(String str, Activity activity, RecordConfig.Builder builder) {
        AVExternalServiceImpl.LIZ().asyncService(str, new C94435agx(activity, builder));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public void onExportEffectFailed(Intent intent, String exportPath, String errorMsg) {
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(exportPath, "exportPath");
        o.LJIIIZ(errorMsg, "errorMsg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Export failed, errorMsg=");
        LIZ.append(errorMsg);
        LIZ.append(", exportPath=");
        LIZ.append(exportPath);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public boolean onExportWhenExit(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData packData) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(packData, "packData");
        if (cKEDraftInfo != null) {
            str = cKEDraftInfo.draftID;
        } else {
            str = null;
        }
        if (str == null || str.length() <= 0) {
            return false;
        }
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C94800amq(this, activity, cKEDraftInfo, null), 3);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.bo9);
        creativeToastBuilder.acrossActivities(true);
        C78915Uy7.LJJIIZI(activity, 3036, creativeToastBuilder);
        onDraftOrEffectSavedSuccess$default(this, activity, packData, null, str, 4, null);
        return true;
    }

    public final Object writeLabelToAMECapabilities(Integer num, String str, InterfaceC67352kd<Object> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94802ams(str, num, this, null), interfaceC67352kd);
    }

    private final void goToEffectSubmitPage(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData effectPackageData, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        CKEDraftInfoWrapper cKEDraftInfoWrapper;
        Bundle LIZJ = C60903NvH.LJIIJJI().LJIL().LIZJ(activity);
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//effect-mobile-template/edit");
        TAE tae = TAE.PUBLISH;
        String string = LIZJ.getString("creation_id");
        if (string == null) {
            string = "";
        }
        String string2 = LIZJ.getString("shoot_way");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = LIZJ.getString("shoot_page_enter_from");
        if (string3 == null) {
            string3 = "";
        }
        if (cKEDraftInfo != null) {
            cKEDraftInfoWrapper = C93812aWu.LIZJ(cKEDraftInfo);
        } else {
            cKEDraftInfoWrapper = null;
        }
        EffectPackageDataWrapper LIZ = C93653aUL.LIZ(effectPackageData);
        String string4 = LIZJ.getString("enter_from");
        if (string4 == null) {
            string4 = "";
        }
        buildRoute.withParam("effect_init_data", new MobileEffectData(tae, string, string2, string3, null, cKEDraftInfoWrapper, LIZ, string4, 16));
        buildRoute.open(0, new C94135ac7(this, activity, effectPackageData, interfaceC88472Yns));
    }

    private final void saveAsDraftAndGoToRecord(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData effectPackageData, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        String str;
        if (cKEDraftInfo == null || (str = cKEDraftInfo.draftID) == null) {
            return;
        }
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C1AU) activity), null, null, new C94801amr(cKEDraftInfo, this, activity, effectPackageData, str, null), 3);
    }

    public final Object cropAndSaveDraft(ActivityC45651qj activityC45651qj, CKEDraftInfo cKEDraftInfo, boolean z, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new C94794amk(cKEDraftInfo, this, activityC45651qj, z, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public final void onDraftOrEffectSavedSuccess(Activity activity, EffectPackageData effectPackageData, String str, String str2) {
        String string = C60903NvH.LJIIJJI().LJIL().LIZJ(activity).getString("enter_from");
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("shootpage_create", "shootpage_draft", "shootpage_template");
        if (str != null) {
            if (ORZ.LJLJJI(string, LJJIJIIJI)) {
                goToBackToCameraOnPublishSuccess(activity, str);
                return;
            } else {
                startCameraOnPublishSuccess(activity, str);
                return;
            }
        }
        if (str2 == null) {
            return;
        }
        CKEDraftInfoWrapper LJII = EffectCreatorServiceImpl.LJIIJ().LJII(C5L7.LIZ(), str2);
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C94799amp(this, LJII, null), 3);
        if (ORZ.LJLJJI(string, LJJIJIIJI)) {
            goToBackToCameraOnSaveDraft(activity, str2);
        } else {
            startCameraOnDraftSaved(activity, str2);
        }
        if (LJII == null) {
            return;
        }
        logSaveDraftEvent(activity, effectPackageData, C93812aWu.LIZ(LJII));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public void onExportEffectSuccess(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData effectPackageData, InterfaceC88472Yns<? super Integer, C76800UCe> onBackToMainFragment) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(effectPackageData, "effectPackageData");
        o.LJIIIZ(onBackToMainFragment, "onBackToMainFragment");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onExportSuccess, draftInfo=");
        LIZ.append(cKEDraftInfo);
        LIZ.append(", effectPackageData=");
        LIZ.append(effectPackageData);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        if (ESB.LIZ()) {
            saveAsDraftAndGoToRecord(activity, cKEDraftInfo, effectPackageData, onBackToMainFragment);
        } else {
            goToEffectSubmitPage(activity, cKEDraftInfo, effectPackageData, onBackToMainFragment);
        }
    }

    public final long writeFile(String path, String contents, boolean z, boolean z2) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(contents, "contents");
        try {
            File absoluteFile = new File(path).getAbsoluteFile();
            if (!absoluteFile.exists()) {
                if (!z) {
                    return 0L;
                }
                absoluteFile.createNewFile();
            }
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(absoluteFile, z2));
                try {
                    outputStreamWriter.write(contents);
                    outputStreamWriter.flush();
                    AnonymousClass636.LJFF(outputStreamWriter, null);
                    return contents.length();
                } finally {
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return 0L;
            }
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static /* synthetic */ void onDraftOrEffectSavedSuccess$default(TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, Activity activity, EffectPackageData effectPackageData, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        tiktokEffectCreatePipelineImpl.onDraftOrEffectSavedSuccess(activity, effectPackageData, str, str2);
    }

    public static /* synthetic */ long writeFile$default(TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return tiktokEffectCreatePipelineImpl.writeFile(str, str2, z, z2);
    }
}

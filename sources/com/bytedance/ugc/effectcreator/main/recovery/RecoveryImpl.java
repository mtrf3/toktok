package com.bytedance.ugc.effectcreator.main.recovery;

import X.AbstractC93937aYv;
import X.C36636EZk;
import X.C3BJ;
import X.C48841JEv;
import X.C79853Bl;
import X.C79883Bo;
import X.C93521aSD;
import X.C93797aWf;
import X.C93819aX1;
import X.C93907aYR;
import X.C93908aYS;
import X.C93939aYx;
import X.C93965aZN;
import X.C94273aeL;
import X.C94503ai3;
import X.C94504ai4;
import X.C94792ami;
import X.EnumC93936aYu;
import X.EnumC93946aZ4;
import X.InterfaceC70352pT;
import X.InterfaceC70422pa;
import X.ORY;
import X.T2R;
import X.XKX;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.IRecovery;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect;
import com.bytedance.ies.effectcreator.swig.ProjectCreateFrom;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class RecoveryImpl implements IRecovery {
    public static final C93521aSD Companion = new C93521aSD();
    public int restoredCreateFrom;
    public boolean restoring;
    public final InterfaceC70422pa scope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));
    public final C3BJ<EnumC93946aZ4> recoveryEvent = C79853Bl.LIZ(0, 0, null, 7);
    public EnumC93936aYu restoredEditMode = EnumC93936aYu.Canvas;
    public String restoredDraftPath = "";
    public C94273aeL restoredTemplateInfo = new C94273aeL("", "", "");
    public String restoredModelPictureId = "";

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public String getCachedDraftPath() {
        return (String) getCachedValue(this.restoredDraftPath);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public EnumC93936aYu getEditMode() {
        return (EnumC93936aYu) getCachedValue(this.restoredEditMode);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public String getModelPictureId() {
        return (String) getCachedValue(this.restoredModelPictureId);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public Integer getProjectCreateFromIndex() {
        return (Integer) getCachedValue(Integer.valueOf(this.restoredCreateFrom));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public InterfaceC70352pT<EnumC93946aZ4> getRecoveryEvent() {
        return new C79883Bo(this.recoveryEvent);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public C94273aeL getTemplateInfo() {
        return (C94273aeL) getCachedValue(this.restoredTemplateInfo);
    }

    private final <T> T getCachedValue(T t) {
        if (this.restoring) {
            return t;
        }
        return null;
    }

    private final void saveCreateFrom(Bundle bundle) {
        bundle.putInt("cke:recovery:project", ORY.LJJJJIZL(CKEffectEditorContext.LIZLLL, ProjectCreateFrom.values()));
    }

    private final void saveEditMode(Bundle bundle) {
        EnumC93936aYu enumC93936aYu;
        AbstractC93937aYv value = C93939aYx.LIZ().getRenderModeData().getValue();
        if (value instanceof C94503ai3) {
            enumC93936aYu = EnumC93936aYu.Preview;
        } else if (value instanceof C94504ai4) {
            enumC93936aYu = EnumC93936aYu.TemplatePreview;
        } else {
            enumC93936aYu = EnumC93936aYu.Canvas;
        }
        bundle.putInt("cke:recovery:edit_mode", ORY.LJJJJIZL(enumC93936aYu, EnumC93936aYu.values()));
    }

    private final void saveModelPictureId(Bundle bundle) {
        String selectedModel = C93797aWf.LIZ().getSelectedModel();
        if (selectedModel == null) {
            selectedModel = "";
        }
        bundle.putString("cke:recovery:model_picture", selectedModel);
    }

    private final void saveProject(Bundle bundle) {
        String LIZIZ = C93965aZN.LIZIZ(C93965aZN.LIZ(), String.valueOf(System.currentTimeMillis()));
        if (!new File(LIZIZ).exists()) {
            new File(LIZIZ).mkdirs();
        }
        CKEDraftInfo cKEDraftInfo = new CKEDraftInfo(null, LIZIZ, null, null, null, null, null, null, null, null, null, null, null, 0, 65533);
        ICKDraftManager LJ = CKEffectEditorContext.LJ();
        if (LJ != null) {
            LJ.saveOneDraft(cKEDraftInfo, true, false);
        }
        bundle.putString("cke:recovery:project", cKEDraftInfo.draftPath);
    }

    private final void saveTemplateInfo(Bundle bundle) {
        MutableLiveData<C94273aeL> previewTemplateEvent;
        C94273aeL value;
        IObjectSelect LIZIZ = C93819aX1.LIZIZ();
        if (LIZIZ != null && (previewTemplateEvent = LIZIZ.previewTemplateEvent()) != null && (value = previewTemplateEvent.getValue()) != null) {
            C93907aYR.LIZ();
            bundle.putString("cke:recovery:template_info", C93908aYS.LIZIZ(value));
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public void onRestore(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        XKX.LIZLLL(this.scope, null, null, new C94792ami(this, bundle, null), 3);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IRecovery
    public void onSaveState(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        saveEditMode(bundle);
        saveCreateFrom(bundle);
        saveModelPictureId(bundle);
        saveTemplateInfo(bundle);
        saveProject(bundle);
    }
}

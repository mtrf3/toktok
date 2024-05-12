package com.bytedance.ugc.effectcreator.main.launcher.impl;

import X.C16880lQ;
import X.C93925aYj;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.ILauncher;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class Launcher implements ILauncher {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ILauncher
    public ICKDraftManager initDraft(Context ctx, String authorId) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(authorId, "authorId");
        return C93925aYj.LIZ(ctx, authorId);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ILauncher
    public void restoreDraft(Context context, Intent intent, String draftPath) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(draftPath, "draftPath");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ILauncher
    public void openNewProject(Activity activity, Intent intent, int i, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        intent.setClass(activity, CKEffectEditorActivity.class);
        intent.putExtra("enableSaveDraft", z);
        C16880lQ.LJFF(activity, i, intent);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ILauncher
    public void openNewProject(Activity activity, Intent intent, CKEDraftInfo draftInfo, int i, boolean z, int i2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(draftInfo, "draftInfo");
        C93925aYj.LIZIZ(activity, intent, draftInfo, i, z, i2);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ILauncher
    public void openTemplate(Activity activity, Intent intent, String templatePath, int i, boolean z, String effectId) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(templatePath, "templatePath");
        o.LJIIIZ(effectId, "effectId");
        C93925aYj.LIZJ(activity, intent, templatePath, i, z, effectId);
    }
}

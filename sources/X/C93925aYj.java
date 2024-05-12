package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.o;

/* renamed from: X.aYj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93925aYj {
    public static final /* synthetic */ int LIZ = 0;

    public static ICKDraftManager LIZ(Context ctx, String authorId) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(authorId, "authorId");
        ICKDraftManager LJ = CKEffectEditorContext.LJ();
        if (LJ != null) {
            LJ.initDraft(ctx, authorId);
        }
        return CKEffectEditorContext.LJ();
    }

    public static void LIZIZ(Activity activity, Intent intent, CKEDraftInfo draftInfo, int i, boolean z, int i2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(draftInfo, "draftInfo");
        intent.setClass(activity, CKEffectEditorActivity.class);
        intent.putExtra("Intent_Draft", draftInfo);
        intent.putExtra("enableSaveDraft", z);
        intent.putExtra("draft_type", i2);
        C16880lQ.LJFF(activity, i, intent);
    }

    public static void LIZJ(Activity activity, Intent intent, String templatePath, int i, boolean z, String effectId) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(templatePath, "templatePath");
        o.LJIIIZ(effectId, "effectId");
        intent.setClass(activity, CKEffectEditorActivity.class);
        CKEDraftInfo cKEDraftInfo = new CKEDraftInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 65535);
        cKEDraftInfo.draftPath = templatePath;
        cKEDraftInfo.effectId = effectId;
        intent.putExtra("Intent_Draft", cKEDraftInfo);
        intent.putExtra("key_template_id", effectId);
        intent.putExtra("enableSaveDraft", z);
        intent.putExtra("draft_type", 17);
        C16880lQ.LJFF(activity, i, intent);
    }
}

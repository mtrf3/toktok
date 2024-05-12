package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCommentFlaggedPrompt;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.BnM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29836BnM implements InterfaceC29848BnY {
    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW capsuleModel) {
        FragmentManager supportFragmentManager;
        String str;
        CapsuleBizParamsCommentFlaggedPrompt capsuleBizParamsCommentFlaggedPrompt;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(capsuleModel.LJLIIL().LIZ);
        if (LIZIZ != null && (supportFragmentManager = LIZIZ.getSupportFragmentManager()) != null) {
            Bundle bundle = new Bundle();
            CapsuleBizParams capsuleBizParams = ((CapsuleMessage) capsuleModel.LJIJJLI).bizParams;
            if (capsuleBizParams == null || (capsuleBizParamsCommentFlaggedPrompt = capsuleBizParams.commentFlaggedPrompt) == null || (str = Long.valueOf(capsuleBizParamsCommentFlaggedPrompt.trigger).toString()) == null) {
                str = "";
            }
            bundle.putString("trigger", str);
            bundle.putString("entry", "autosuggest_comment_filter");
            C32044Chs.LJIIIZ(supportFragmentManager, LiveFilterCommentSettingFragmentSheet.class, "live_filter_comment_setting", null, bundle);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZLLL(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final void LJ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        String str;
        CapsuleBizParamsCommentFlaggedPrompt capsuleBizParamsCommentFlaggedPrompt;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) capsuleModel.LJIJJLI).bizParams;
        if (capsuleBizParams == null || (capsuleBizParamsCommentFlaggedPrompt = capsuleBizParams.commentFlaggedPrompt) == null || (str = Long.valueOf(capsuleBizParamsCommentFlaggedPrompt.trigger).toString()) == null) {
            str = "";
        }
        map.put("trigger", str);
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LJFF(CQQ cqq, CapsuleMessage capsuleMessage) {
        C29837BnN.LIZ(cqq, capsuleMessage);
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        String str;
        CapsuleBizParamsCommentFlaggedPrompt capsuleBizParamsCommentFlaggedPrompt;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) capsuleModel.LJIJJLI).bizParams;
        if (capsuleBizParams == null || (capsuleBizParamsCommentFlaggedPrompt = capsuleBizParams.commentFlaggedPrompt) == null || (str = Long.valueOf(capsuleBizParamsCommentFlaggedPrompt.trigger).toString()) == null) {
            str = "";
        }
        map.put("trigger", str);
    }
}

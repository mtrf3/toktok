package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.GoP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42641GoP extends AbstractC43039Gup {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC43032Gui interfaceC43032Gui = (InterfaceC43032Gui) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (TextUtils.isEmpty(interfaceC43032Gui.getItemID())) {
            return;
        }
        PromoteReplaceMusicRequest promoteReplaceMusicRequest = new PromoteReplaceMusicRequest();
        promoteReplaceMusicRequest.setItemID(interfaceC43032Gui.getItemID());
        promoteReplaceMusicRequest.setOriginalMusicID("");
        promoteReplaceMusicRequest.setRetryScene(EnumC42461GlV.CLEAR.getId());
        PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
        PromoteReplaceMusicRequest LIZLLL = C42622Go6.LIZLLL(interfaceC43032Gui.getItemID());
        if (LIZLLL != null) {
            LIZLLL.setRetryScene(EnumC42461GlV.RETRY.getId());
            promoteReplaceMusicRequest = LIZLLL;
        }
        if (LIZLLL == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "has no data for retry with this itemID", 4);
            LIZLLL = promoteReplaceMusicRequest;
        } else {
            LIZLLL.setRetryScene(EnumC42461GlV.RETRY.getId());
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC43041Gur.class, null);
            InterfaceC43041Gur interfaceC43041Gur = (InterfaceC43041Gur) LIZJ;
            interfaceC43041Gur.setCode(1);
            interfaceC43041Gur.setMsg("has no data for retry with this itemID");
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
        }
        ReplaceMusicServiceImpl.LIZ().retryInPromoteScene(LIZLLL);
    }
}

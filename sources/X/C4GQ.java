package X;

import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSubOnlyVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel.ShareVideoPanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4GQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GQ extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ SharePackage LJLIL;
    public final /* synthetic */ C4GR LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GQ(SharePackage sharePackage, C4GR c4gr) {
        super(1);
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = c4gr;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        ShareAwemeContent fromSharePackage;
        String str2 = str;
        if (C78685UuP.LJJJZ(str2)) {
            this.LJLIL.extras.putString("enter_method", str2);
        }
        if (this.LJLILLLLZI.LJLL.getValue() != null) {
            SharePackage sharePackage = this.LJLIL;
            C4GR c4gr = this.LJLILLLLZI;
            String conversationId = c4gr.LJLIL;
            int i = c4gr.LJLJI;
            o.LJIIIZ(sharePackage, "sharePackage");
            o.LJIIIZ(conversationId, "conversationId");
            C4MW c4mw = (C4MW) C88903eI.LIZ();
            c4mw.LIZ.LIZIZ = conversationId;
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("interaction_type", ShareVideoPanelViewModel.gv0(i));
            oszArr[1] = new OSZ("interaction_name", "quick_share");
            String string = sharePackage.extras.getString("video_sticker_status");
            if (string == null) {
                string = "";
            }
            oszArr[2] = new OSZ("video_sticker_status", string);
            c4mw.LIZ.LJII = C113554cx.LJJLIIIIJ(oszArr);
            SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
            if (sendMessageTemplateTask != null) {
                c4mw.LIZ(sendMessageTemplateTask.scene);
                c4mw.LJFF(sendMessageTemplateTask.template);
                c4mw.LIZ.LJ = sendMessageTemplateTask.attachments;
            } else {
                if (sharePackage.extras.getBoolean("is_sub_only_video")) {
                    fromSharePackage = ShareSubOnlyVideoContent.Companion.fromSharePackage(sharePackage);
                } else {
                    fromSharePackage = ShareAwemeContent.Companion.fromSharePackage(sharePackage);
                }
                c4mw.LIZLLL(fromSharePackage);
            }
            c4mw.LJI();
        }
        return C76800UCe.LIZ;
    }
}

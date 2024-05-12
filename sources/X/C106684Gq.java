package X;

import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4Gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106684Gq {
    public static final /* synthetic */ int LIZ = 0;

    public static SharePackage LIZ(SendMessageTemplateTask sendMessageTemplateTask) {
        String str;
        BaseTemplate baseTemplate = sendMessageTemplateTask.template;
        if (baseTemplate instanceof ImageCardTemplate) {
            str = "image_card";
        } else if (baseTemplate instanceof PictureCardTemplate) {
            str = "picture_card";
        } else if (baseTemplate instanceof StickerTemplate) {
            str = "video_sticker";
            if (!o.LJ(sendMessageTemplateTask.scene, "video_sticker")) {
                str = "set_sticker";
            }
        } else if (baseTemplate instanceof VideoCardTemplate) {
            str = "video_card";
        } else if (baseTemplate instanceof AwemeCardTemplate) {
            str = "aweme_card";
        } else if (baseTemplate instanceof PortraitCardTemplate) {
            str = "aigc_avatar";
        } else {
            str = "Invalid";
        }
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = str;
        c62374Odu.LJIIIIZZ = sendMessageTemplateTask;
        return new SharePackage(c62374Odu);
    }
}

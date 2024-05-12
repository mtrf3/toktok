package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MCg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56418MCg implements InterfaceC74183T9n {
    public final /* synthetic */ GeneralTemplateNotice LIZ;

    public C56418MCg(GeneralTemplateNotice generalTemplateNotice) {
        this.LIZ = generalTemplateNotice;
    }

    @Override // X.InterfaceC74183T9n
    public final void LIZ(Effect targetEffect, String creationId) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(targetEffect, "targetEffect");
        C188727au c188727au = new C188727au();
        GeneralTemplateNotice generalTemplateNotice = this.LIZ;
        c188727au.LJI("creation_id", creationId);
        c188727au.LJI("shoot_way", "friends_effect");
        c188727au.LJI("enter_from", "notification_page");
        c188727au.LJI("enter_method", "notification_button");
        String str = generalTemplateNotice.messageExtra;
        if (str != null) {
            c188727au.LJI("from_user_id", new JSONObject(str).optString("from_user_id"));
        }
        FMX.LJIIL("shoot", c188727au.LIZ);
    }
}

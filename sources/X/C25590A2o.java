package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.A2o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25590A2o {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Intent intent) {
        Serializable serializable;
        if (intent != null) {
            serializable = intent.getSerializableExtra("anchor_event_map");
        } else {
            serializable = null;
        }
        return serializable instanceof HashMap;
    }

    public static void LIZJ(Intent intent, long j, String str) {
        String str2;
        if (intent != null) {
            str2 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        } else {
            str2 = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", str2);
        c188727au.LIZLLL(1, "enable_experiment");
        c188727au.LJ(j, "loading_duration");
        c188727au.LJI("current_page_name", str);
        FMX.LJIIL("paid_content_page_loading_ttrc", c188727au.LIZ);
    }

    public static void LJ(CollectionDetailModel model, C254739zB c254739zB, String errorCode) {
        String str;
        String str2;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(errorCode, "errorCode");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        C188727au c188727au = new C188727au();
        c188727au.LJI("page_name", "series_detail_page");
        c188727au.LJ(model.getCollectionId(), "collection_id");
        User collectionCreator = model.getCollectionCreator();
        String str3 = null;
        if (collectionCreator != null) {
            str = collectionCreator.getUid();
        } else {
            str = null;
        }
        c188727au.LJI("author_id", str);
        c188727au.LJI("user_id", curUserId);
        c188727au.LJFF(model.getVoucherId(), "voucher_id");
        if (c254739zB != null) {
            str2 = c254739zB.LIZJ;
        } else {
            str2 = null;
        }
        c188727au.LJI("collection_price", str2);
        if (c254739zB != null) {
            str3 = c254739zB.LIZLLL;
        }
        c188727au.LJI("discount_price", str3);
        c188727au.LJI("error_code", errorCode);
        FMX.LJIIL("claim_voucher_button_click", c188727au.LIZ);
    }

    public static void LIZIZ(CollectionDetailModel collectionDetailModel, Intent intent, String str, boolean z, int i, Integer num, Integer num2) {
        String str2;
        if (intent != null) {
            str2 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        } else {
            str2 = null;
        }
        C25589A2n.LJIIJJI("click_video_in_collection", str2, null, null, str, Boolean.valueOf(LIZ(intent)), null, null, null, Boolean.valueOf(z), null, null, null, null, num, Integer.valueOf(i), num2, null, collectionDetailModel, null, null, null, null, null, null, 66354092);
    }

    public static void LIZLLL(CollectionDetailModel collectionDetailModel, boolean z, Intent intent, int i, String sourceWay, Long l, String str, String str2, String str3, String str4, String str5) {
        String str6;
        o.LJIIIZ(sourceWay, "sourceWay");
        if (intent != null) {
            str6 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        } else {
            str6 = null;
        }
        C25589A2n.LJIIJJI("collection_in_app_purchase_confirmation", str6, null, null, null, Boolean.valueOf(LIZ(intent)), Boolean.valueOf(z), null, Integer.valueOf(i), null, sourceWay, l, str, null, null, null, null, str2, collectionDetailModel, null, str3, str4, str5, null, null, 51627324);
    }
}

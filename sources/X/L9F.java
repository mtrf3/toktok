package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9F {
    public static final java.util.Map<String, Boolean> LIZ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = C113554cx.LJJLIIIIJ(new OSZ("awemenotice_fragment_navigation_container", bool), new OSZ("awemenotice_fragment_inbox_layout", bool), new OSZ("awemenotice_inbox_activity_notice", bool), new OSZ("awemenotice_mus_item_notification_template", bool), new OSZ("awemenotice_mus_item_notification_likes_new", bool), new OSZ("awemenotice_mus_item_notification_comments_new", bool), new OSZ("awemenotice_inbox_item_activity_entrance", bool), new OSZ("awemenotice_inbox_message_title", bool), new OSZ("awemenotice_inbox_follow_request_exposed", bool), new OSZ("awemenotice_inbox_follow_request", bool), new OSZ("im_item_session_inbox_widget", bool), new OSZ("relation_rec_user_card_rectangle", bool), new OSZ("relation_usercard_title_item", bool));
    }

    public static final boolean LIZIZ() {
        ActivityC45651qj activityC45651qj;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null) {
            return com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).vv0("NOTIFICATION");
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r3.equals("Skylight") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        r0 = ((java.lang.Boolean) X.L0A.LIZLLL.getValue()).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r3.equals("InboxDMAvatarLoadHelper") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.W5F r1, X.InterfaceC70769Rq1 r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1629886283: goto L29;
                case 18890236: goto L32;
                case 91686929: goto L48;
                case 848381647: goto L5f;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L1c
            if (r2 == 0) goto L18
            r1.LJFF(r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1b
        L18:
            r1.LJ()
        L1b:
            return
        L1c:
            if (r2 == 0) goto L25
            r1.LIZLLL(r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1b
        L25:
            X.C16880lQ.LLJJJ(r1)
            goto L1b
        L29:
            java.lang.String r0 = "Skylight"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3b
            goto Lc
        L32:
            java.lang.String r0 = "InboxDMAvatarLoadHelper"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3b
            goto Lc
        L3b:
            X.Ol8 r0 = X.L0A.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto Ld
        L48:
            java.lang.String r0 = "RelationImgDisplayMonImpl"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L51
            goto Lc
        L51:
            boolean r0 = X.L08.LIZJ()
            if (r0 == 0) goto Lc
            boolean r0 = LIZIZ()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        L5f:
            java.lang.String r0 = "EntranceNormalVH"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            boolean r0 = X.L08.LIZJ()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9F.LIZ(X.W5F, X.Rq1, java.lang.String):void");
    }

    public static final View LIZJ(Activity activity, int i, InterfaceC65784Pro<? extends View> interfaceC65784Pro) {
        String str;
        String str2;
        if (C16970lZ.LIZ(i, activity)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        long currentTimeMillis = System.currentTimeMillis();
        View invoke = interfaceC65784Pro.invoke();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            str2 = activity.getResources().getResourceEntryName(i);
            o.LJIIIIZZ(str2, "{\n        context.resour…EntryName(layoutId)\n    }");
        } catch (Exception unused) {
            str2 = "";
        }
        java.util.Map<String, Boolean> map = LIZ;
        if (o.LJ(((LinkedHashMap) map).get(str2), Boolean.FALSE)) {
            HashMap LIZ2 = C45243HpH.LIZ("layout_id", str2, "is_hit", str);
            LIZ2.put("time_cost", String.valueOf(currentTimeMillis2));
            FMX.LJIIL("inbox_jank_opt", LIZ2);
            map.put(str2, Boolean.TRUE);
        }
        return invoke;
    }
}

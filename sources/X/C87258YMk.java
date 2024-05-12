package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YMk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87258YMk extends AbstractC65781Prl implements InterfaceC88473Ynt<String, JSONObject, java.util.Map<String, String>, EnumC87257YMj> {
    public static final C87258YMk LJLIL = new C87258YMk();

    public C87258YMk() {
        super(3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC88473Ynt
    public final EnumC87257YMj invoke(String str, JSONObject jSONObject, java.util.Map<String, String> map) {
        String eventName = str;
        o.LJIIIZ(eventName, "eventName");
        C87255YMh.LIZ.getClass();
        switch (eventName.hashCode()) {
            case -1877516040:
                if (eventName.equals("play_time")) {
                    return EnumC87257YMj.PLAY_TIME;
                }
                return null;
            case -1787830840:
                if (eventName.equals("search_result_show")) {
                    return EnumC87257YMj.SHOW;
                }
                return null;
            case -1617968008:
                if (eventName.equals("video_play")) {
                    return EnumC87257YMj.VIDEO_PLAY;
                }
                return null;
            case -1330248535:
                if (eventName.equals("click_comment_button")) {
                    return EnumC87257YMj.COMMENT;
                }
                return null;
            case -1268958287:
                if (eventName.equals("follow")) {
                    return EnumC87257YMj.FOLLOW;
                }
                return null;
            case -405326491:
                if (eventName.equals("favourite_video")) {
                    return EnumC87257YMj.FAVORITE;
                }
                return null;
            case 3321751:
                if (eventName.equals("like")) {
                    return EnumC87257YMj.LIKE;
                }
                return null;
            case 109413407:
                if (eventName.equals("shoot")) {
                    return EnumC87257YMj.SHOOT;
                }
                return null;
            case 239764896:
                if (eventName.equals("cancel_favourite_video")) {
                    return EnumC87257YMj.FAVORITE_CANCEL;
                }
                return null;
            case 397155357:
                if (eventName.equals("search_result_click")) {
                    return EnumC87257YMj.CLICK;
                }
                return null;
            case 552900296:
                if (eventName.equals("follow_cancel")) {
                    return EnumC87257YMj.FOLLOW_CANCEL;
                }
                return null;
            case 568860919:
                if (eventName.equals("feed_enter")) {
                    return EnumC87257YMj.VIDEO_CLICK;
                }
                return null;
            case 1190532130:
                if (eventName.equals("like_cancel")) {
                    return EnumC87257YMj.LIKE_CANCEL;
                }
                return null;
            case 1578594464:
                if (eventName.equals("tiktokec_stay_product_detail")) {
                    return EnumC87257YMj.PRODUCT_SHOW;
                }
                return null;
            default:
                return null;
        }
    }
}

package com.ss.android.ugc.aweme.sticker;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.E8L;
import X.HWW;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AddYoursAvatarHelper {
    public static final AddYoursAvatarHelper LIZ = new AddYoursAvatarHelper();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(HWW.LJLIL);
    public static final Map<Long, List<AddYoursAvatar>> LIZJ = new LinkedHashMap();
    public static List<AddYoursAvatar> LIZLLL;

    /* loaded from: classes8.dex */
    public interface Api {
        @E8L("/tiktok/v1/addyours/topic/sticker")
        AbstractC73672Svk<Response> getTopics(@InterfaceC64986Pew("topic_id") long j);
    }

    /* loaded from: classes8.dex */
    public static final class Response {

        @InterfaceC65349Pkn("status_code")
        public final Integer statusCode;

        @InterfaceC65349Pkn("sticker")
        public final AddYoursStickerStruct sticker;

        public Response(AddYoursStickerStruct sticker, Integer num) {
            o.LJIIIZ(sticker, "sticker");
            this.sticker = sticker;
            this.statusCode = num;
        }

        public /* synthetic */ Response(AddYoursStickerStruct addYoursStickerStruct, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(addYoursStickerStruct, (i & 2) != 0 ? null : num);
        }
    }
}

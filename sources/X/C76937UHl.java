package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UHl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76937UHl extends C32804Cu8 {
    public final String LJJIII;
    public final String LJJIIJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76937UHl(Gift gift, Room room, C32822CuQ c32822CuQ, HashMap hashMap, String triggerKeyword) {
        super(new C73026SlK(EnumC32737Ct3.HOT_WORD_GIFT_GUIDE, EnumC76934UHi.ANCHOR), gift, room, c32822CuQ, "gift_guide_popup_comment_key_words", hashMap, false, 0, 0L, 0L, null, null, 0, null, null, 32640);
        o.LJIIIZ(gift, "gift");
        o.LJIIIZ(triggerKeyword, "triggerKeyword");
        this.LJJIII = triggerKeyword;
        this.LJJIIJ = "gift_guide_popup_comment_key_words";
    }
}

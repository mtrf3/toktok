package X;

import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import kotlin.jvm.internal.o;

/* renamed from: X.KzB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53501KzB implements InterfaceC53586L1i<C26309AUf, C53500KzA> {
    @Override // X.InterfaceC53586L1i
    public final C26309AUf LIZ(Object data) {
        o.LJIIIZ(data, "data");
        EnumC53521KzV enumC53521KzV = null;
        if (!(data instanceof StoryInteraction)) {
            return null;
        }
        StoryInteraction storyInteraction = (StoryInteraction) data;
        int type = storyInteraction.getType();
        if (type != 1) {
            if (type != 2) {
                if (type == 3) {
                    enumC53521KzV = EnumC53521KzV.TEXT;
                }
            } else {
                enumC53521KzV = EnumC53521KzV.LIKE;
            }
        } else {
            enumC53521KzV = EnumC53521KzV.REPLY;
        }
        return new C26309AUf(enumC53521KzV, storyInteraction.getEmojiContent());
    }
}

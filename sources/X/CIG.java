package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CIG extends AbstractC65781Prl implements InterfaceC88472Yns<EmoteWithIndex, CharSequence> {
    public static final CIG LJLIL = new CIG();

    public CIG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(EmoteWithIndex emoteWithIndex) {
        String str;
        EmoteWithIndex it = emoteWithIndex;
        o.LJIIIZ(it, "it");
        EmoteModel emoteModel = it.emoteModel;
        if (emoteModel == null || (str = emoteModel.emoteId) == null) {
            return "";
        }
        return str;
    }
}

package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CII extends AbstractC65781Prl implements InterfaceC88472Yns<EmoteModel, CharSequence> {
    public static final CII LJLIL = new CII();

    public CII() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(EmoteModel emoteModel) {
        EmoteModel it = emoteModel;
        o.LJIIIZ(it, "it");
        String str = it.emoteId;
        o.LJIIIIZZ(str, "it.emoteId");
        return str;
    }
}

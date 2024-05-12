package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7DY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7DY extends AbstractC65781Prl implements InterfaceC88471Ynr<EmojiAnimAssem, C43I<? extends C70012ov>, C76800UCe> {
    public static final C7DY LJLIL = new C7DY();

    public C7DY() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EmojiAnimAssem emojiAnimAssem, C43I<? extends C70012ov> c43i) {
        int i;
        EmojiAnimAssem selectSubscribe = emojiAnimAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c43i != null) {
            boolean LIZ = C178726zs.LIZ(((VideoItemParams) selectSubscribe.v3()).getAweme());
            View Y3 = selectSubscribe.Y3();
            if (LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            Y3.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y21 extends AbstractC65781Prl implements InterfaceC88471Ynr<TranslationStatusAssem, Boolean, C76800UCe> {
    public static final Y21 LJLIL = new Y21();

    public Y21() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, Boolean bool) {
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            View Y3 = selectSubscribe.Y3();
            Context context = selectSubscribe.getContext();
            if (context != null) {
                Y01 y01 = Y01.LIZIZ;
                String str = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
                o.LJIIIIZZ(str, "item.eventType");
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                y01.LJII(context, Y3, aweme, str);
            }
        }
        return C76800UCe.LIZ;
    }
}

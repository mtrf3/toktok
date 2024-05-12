package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TB2<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public TB2(Aweme aweme, String str) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        RealtimeCaptionsTranslationResult it = (RealtimeCaptionsTranslationResult) obj;
        o.LJIIIZ(it, "it");
        String aid = this.LJLIL.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String LIZIZ = C78700Uue.LIZIZ(aid, this.LJLILLLLZI);
        if (C78700Uue.LIZ(it, LIZIZ)) {
            return new OSZ(LIZIZ, it);
        }
        return new OSZ("", it);
    }
}

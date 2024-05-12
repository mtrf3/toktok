package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.qna.repo.MultiTranslationBody;
import com.ss.android.ugc.aweme.qna.repo.TranslationContent;
import java.util.List;

/* renamed from: X.T7b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74119T7b {
    public final Gson LIZ = new Gson();

    public final void LIZ(C74122T7e c74122T7e, InterfaceC74129T7l interfaceC74129T7l) {
        if (c74122T7e.LJLILLLLZI.translationInfos.isEmpty()) {
            return;
        }
        MultiTranslationBody multiTranslationBody = c74122T7e.LJLILLLLZI;
        String str = multiTranslationBody.trgLang;
        List<TranslationContent> list = multiTranslationBody.translationInfos;
        String str2 = c74122T7e.LJLIL;
        String str3 = ((TranslationContent) ListProtector.get(list, 0)).srcContent;
        C69605RTl c69605RTl = new C69605RTl(false, str2, str3, null);
        try {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C74120T7c(str, this, list, interfaceC74129T7l, c69605RTl, str2, str3, null), 3);
        } catch (Exception unused) {
            interfaceC74129T7l.LIZ(c69605RTl);
        }
    }
}

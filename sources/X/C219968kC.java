package X;

import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.List;

/* renamed from: X.8kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219968kC extends AbstractC65781Prl implements InterfaceC88472Yns<MultiTranslationResult, C219948kA> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219968kC(long j, String str, String str2) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C219948kA invoke(MultiTranslationResult multiTranslationResult) {
        List<TranslationResult> list;
        TranslationResult translationResult;
        String str;
        MultiTranslationResult multiTranslationResult2 = multiTranslationResult;
        if (multiTranslationResult2 == null || (list = multiTranslationResult2.results) == null || (translationResult = (TranslationResult) ORZ.LJLLLL(list)) == null || (str = translationResult.translatedContent) == null || str.length() == 0 || str == null) {
            throw new C2Q1("translate failed, null result");
        }
        return new C219948kA(this.LJLIL, this.LJLILLLLZI, this.LJLJI, str);
    }
}

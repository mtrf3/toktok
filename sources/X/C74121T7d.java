package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T7d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74121T7d implements InterfaceC65753PrJ<MultiTranslationResult> {
    public final /* synthetic */ InterfaceC74129T7l LIZ;
    public final /* synthetic */ C69605RTl LIZIZ;
    public final /* synthetic */ C74119T7b LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.LIZ(this.LIZIZ);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(MultiTranslationResult multiTranslationResult) {
        List<TranslationResult> list;
        MultiTranslationResult multiTranslationResult2 = multiTranslationResult;
        if (multiTranslationResult2 == null || (list = multiTranslationResult2.results) == null || list.isEmpty() || ((TranslationResult) ListProtector.get(list, 0)).translatedContent == null) {
            this.LIZ.LIZ(this.LIZIZ);
            return;
        }
        InterfaceC74129T7l interfaceC74129T7l = this.LIZ;
        C74119T7b c74119T7b = this.LIZJ;
        String str = this.LIZLLL;
        String str2 = this.LJ;
        String str3 = ((TranslationResult) ListProtector.get(list, 0)).translatedContent;
        o.LJIIIIZZ(str3, "results[0].translatedContent");
        c74119T7b.getClass();
        interfaceC74129T7l.LIZ(new C69605RTl(true, str, str2, str3));
    }

    public C74121T7d(InterfaceC74129T7l interfaceC74129T7l, C69605RTl c69605RTl, C74119T7b c74119T7b, String str, String str2) {
        this.LIZ = interfaceC74129T7l;
        this.LIZIZ = c69605RTl;
        this.LIZJ = c74119T7b;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}

package X;

import com.ss.android.ugc.aweme.translation.api.ObservableTranslationApi;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TBA {
    public static ObservableTranslationApi.ITranslationAPI LIZ() {
        return (ObservableTranslationApi.ITranslationAPI) ObservableTranslationApi.LIZ.getValue();
    }

    public static AbstractC73672Svk LIZIZ(String str, String str2, String str3, String str4, int i) {
        AbstractC73672Svk<TranslationResult> singleStringTranslation;
        try {
            ObservableTranslationApi.ITranslationAPI LIZ = LIZ();
            if (LIZ == null || (singleStringTranslation = LIZ.getSingleStringTranslation(str, str2, str3, str4, i)) == null) {
                C73536StY c73536StY = C73536StY.LJLIL;
                o.LJIIIIZZ(c73536StY, "empty()");
                return c73536StY;
            }
            return singleStringTranslation;
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
            C73536StY c73536StY2 = C73536StY.LJLIL;
            o.LJIIIIZZ(c73536StY2, "empty()");
            return c73536StY2;
        }
    }
}

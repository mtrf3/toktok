package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FeedbackSubmitSuccessMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.SearchKeywordChangeMethod;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jnd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50237Jnd {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(WeakReference contextRef, C38049EwX c38049EwX) {
        o.LJIIIZ(contextRef, "contextRef");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("searchKeywordChange", new SearchKeywordChangeMethod(c38049EwX));
        linkedHashMap.put("feedbackSubmitSuccess", new FeedbackSubmitSuccessMethod(c38049EwX));
        return linkedHashMap;
    }
}

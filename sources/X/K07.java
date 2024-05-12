package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K07 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Intent intent) {
        C50650JuI immutableData;
        C50373Jpp searchEventModel;
        o.LJIIIZ(intent, "intent");
        try {
            C50652JuK c50652JuK = (C50652JuK) intent.getSerializableExtra("search_context_source");
            if (c50652JuK != null && (immutableData = c50652JuK.getImmutableData()) != null && (searchEventModel = immutableData.getSearchEventModel()) != null) {
                return o.LJ(searchEventModel.isFromOutside(), Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
        return false;
    }
}

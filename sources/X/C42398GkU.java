package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import kotlin.jvm.internal.o;

/* renamed from: X.GkU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42398GkU {
    public static IRecordService LIZ(AsyncAVService asyncAVService, String str) {
        o.LJIIIZ(asyncAVService, str);
        return asyncAVService.uiService().recordService();
    }

    public static String LIZIZ(String str, char c) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(c);
        return X1D.LIZIZ(LIZ);
    }
}

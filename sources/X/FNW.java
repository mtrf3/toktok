package X;

import com.ss.android.ugc.aweme.storage.clean.RecordStorageOptLimitInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FNW {
    public static final FNW LIZ = new FNW();
    public static final RecordStorageOptLimitInfo LIZIZ = new RecordStorageOptLimitInfo(20, 100);

    public static final RecordStorageOptLimitInfo LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RecordStorageOptLimitInfo recordStorageOptLimitInfo = LIZIZ;
        LJIIIZ.getClass();
        RecordStorageOptLimitInfo recordStorageOptLimitInfo2 = (RecordStorageOptLimitInfo) FFL.LJIJ(true, "creative_tool_open_storage_opt_limit", 31744, RecordStorageOptLimitInfo.class, recordStorageOptLimitInfo);
        if (recordStorageOptLimitInfo2 != null) {
            recordStorageOptLimitInfo = recordStorageOptLimitInfo2;
        }
        o.LJIIIIZZ(recordStorageOptLimitInfo, "ABManager.getInstance()\n…\n        ?: DEFAULT_VALUE");
        return recordStorageOptLimitInfo;
    }
}

package webcast.api.room;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;

/* loaded from: classes6.dex */
public final class CppAgeVerifyResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("age_verification_info")
        public CppAgeVerificationInfo ageVerificationInfo;
    }

    /* loaded from: classes6.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}

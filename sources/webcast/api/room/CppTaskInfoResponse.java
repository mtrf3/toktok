package webcast.api.room;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.message.proto.CppTaskInfo;

/* loaded from: classes17.dex */
public final class CppTaskInfoResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("advanced_live_ban_status")
        public BanStatus advancedLiveBanStatus;

        @InterfaceC65349Pkn("ban_status")
        public BanStatus banStatus;

        @InterfaceC65349Pkn("cpp_age_verification_info")
        public CppAgeVerificationInfo cppAgeVerificationInfo;

        @InterfaceC65349Pkn("cpp_task_info")
        public CppTaskInfo cppTaskInfo;

        @InterfaceC65349Pkn("cpp_version")
        public int cppVersion;

        @InterfaceC65349Pkn("exam_status")
        public int examStatus;

        @InterfaceC65349Pkn("permission_level")
        public int permissionLevel;

        /* loaded from: classes17.dex */
        public static final class BanStatus {

            @InterfaceC65349Pkn("end_time")
            public long endTime;

            @InterfaceC65349Pkn("is_ban")
            public boolean isBan;
        }
    }

    /* loaded from: classes17.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}

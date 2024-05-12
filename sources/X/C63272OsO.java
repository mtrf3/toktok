package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.im.core.model.Range;
import com.bytedance.im.core.model.RangeList;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.OsO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63272OsO {
    public static volatile boolean LIZ = true;
    public static volatile boolean LIZIZ;

    static {
        new Handler(C16880lQ.LLJJJJ());
    }

    public static String LIZ(Throwable th) {
        String str;
        if (th == null) {
            str = "";
        } else {
            str = th.getMessage();
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    public static String LIZIZ(Throwable th) {
        String str;
        if (th == null) {
            str = "";
        } else {
            str = android.util.Log.getStackTraceString(th);
            if (str == null) {
                return "";
            }
            if (str.length() > 2000 && (str = str.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT)) == null) {
                return "";
            }
        }
        return str;
    }

    public static String LJIILIIL(RangeList rangeList) {
        if (rangeList != null) {
            return rangeList.toString();
        }
        return "[]";
    }

    public static String LJIILJJIL(Range range) {
        if (range != null) {
            return range.toString();
        }
        return "[]";
    }

    public static void LIZJ(int i, int i2) {
        String str;
        C63323OtD LIZJ = C63144OqK.LIZJ("im_invalid_msg_pull");
        LIZJ.LIZ(Integer.valueOf(i), "msg_source");
        LIZJ.LIZ(Integer.valueOf(C63305Osv.LIZIZ().LIZJ()), "link_mode");
        if (C63305Osv.LIZIZ().LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LIZ(str, "is_migrate");
        LIZJ.LIZ(Integer.valueOf(i2), "pull_reason");
        LIZJ.LIZLLL();
    }

    public static void LJIIIZ(int i, boolean z) {
        String str;
        C63323OtD LIZJ = C63144OqK.LIZJ("puller_check_conv_and");
        LIZJ.LIZ(Integer.valueOf(i), "leak_count");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LIZ(str, "is_pre_check");
        LIZJ.LIZ(Integer.valueOf(C63305Osv.LIZIZ().LIZJ()), "link_mode");
        LIZJ.LJ();
    }

    public static void LJIIJ(int i, String str) {
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("puller_check_conv_and_failed");
        c63323OtD.LIZ(str, "error_msg");
        c63323OtD.LIZ(Integer.valueOf(i), "error_code");
        c63323OtD.LIZ(CardStruct.IStatusCode.DEFAULT, "is_pre_check");
        c63323OtD.LJ();
    }

    public static void LJIIL(int i, Throwable th) {
        String str;
        try {
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            String stackTraceString = android.util.Log.getStackTraceString(th);
            if (stackTraceString.length() > 2000) {
                stackTraceString = stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            }
            C63323OtD c63323OtD = new C63323OtD();
            c63323OtD.LIZJ("im_save_msg_error");
            c63323OtD.LIZ(Integer.valueOf(i), "msg_source");
            c63323OtD.LIZ(str, "error_msg");
            c63323OtD.LIZ(stackTraceString, "error_stack");
            c63323OtD.LIZLLL();
        } catch (Exception unused) {
        }
    }

    public static void LJFF(int i, String str, Throwable th, boolean z) {
        if (z) {
            if (C63337OtR.LIZJ(0.002f, "im_sdk_db_op")) {
                C63323OtD c63323OtD = new C63323OtD();
                c63323OtD.LIZJ("im_sdk_db_op");
                c63323OtD.LIZ(str, "tag");
                c63323OtD.LIZ("1", "is_success");
                c63323OtD.LJFF();
                return;
            }
            return;
        }
        C63323OtD c63323OtD2 = new C63323OtD();
        c63323OtD2.LIZJ("im_sdk_db_op");
        c63323OtD2.LIZ(str, "tag");
        c63323OtD2.LIZ(CardStruct.IStatusCode.DEFAULT, "is_success");
        c63323OtD2.LIZ(String.valueOf(i), "fail_reason");
        if (th != null) {
            c63323OtD2.LIZ(LIZ(th), "error_msg");
            c63323OtD2.LIZ(LIZIZ(th), "error_stack");
        }
        c63323OtD2.LJFF();
    }

    public static void LJIIIIZZ(boolean z, Throwable th, long j, String str, Context context) {
        String str2;
        C63323OtD LIZJ = C63144OqK.LIZJ("im_sdk_login_logout_err");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LIZ(str2, "is_login");
        LIZJ.LIZ(Long.valueOf(j), "init_time");
        String str3 = "null";
        if (str == null) {
            str = "null";
        }
        LIZJ.LIZ(str, "raw_ctx");
        if (context != null) {
            str3 = context.getClass().getName();
        }
        LIZJ.LIZ(str3, "app_ctx");
        LIZJ.LIZ(LIZ(th), "error_msg");
        LIZJ.LIZ(LIZIZ(th), "error_stack");
        LIZJ.LJ();
    }

    public static void LJ(int i, long j, long j2, long j3, boolean z, boolean z2) {
        Object obj;
        C63323OtD LIZJ = C63144OqK.LIZJ("im_sdk_conv_async_local");
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LIZ(obj, "is_partition");
        LIZJ.LIZ(Integer.valueOf(i), "conv_count");
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LIZ(str, "is_first_init");
        LIZJ.LIZ(Long.valueOf(j), "total_cost");
        LIZJ.LIZ(Long.valueOf(j2), "db_cost");
        C63308Osy.LJI().LIZLLL().getClass();
        LIZJ.LIZ(0, "enable_conv_box");
        C63308Osy.LJI().LIZLLL().getClass();
        if (z) {
            LIZJ.LIZ(Long.valueOf(j3), "partition_cost");
        }
        LIZJ.LJ();
    }

    public static void LJI(String str, boolean z, boolean z2, int i, long j, boolean z3, C63623Oy3 c63623Oy3) {
        Object obj;
        Object obj2;
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("im_sdk_delete_conversation");
        c63323OtD.LIZ(str, "conversation_id");
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c63323OtD.LIZ(obj, "is_stranger");
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c63323OtD.LIZ(obj2, "is_retry");
        c63323OtD.LIZ(Integer.valueOf(i), "retry_cnt");
        c63323OtD.LIZ(Long.valueOf(j), "del_time");
        if (!z3) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c63323OtD.LIZ(str2, "is_success");
        c63323OtD.LIZ(Integer.valueOf(C63308Osy.LJI().LIZIZ().LJIL() ? 1 : 0), "is_net_available");
        if (!z3 && c63623Oy3 != null) {
            c63323OtD.LIZ(Integer.valueOf(c63623Oy3.LIZ), "error_code");
            c63323OtD.LIZ(c63623Oy3.LJFF, "log_id");
        }
        c63323OtD.LJ();
    }

    public static void LJIIJJI(String str, int i, String str2, int i2, int i3, boolean z, long j, boolean z2) {
        Object obj;
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("puller_check_msg_and");
        c63323OtD.LIZ(str, "conversation_id");
        c63323OtD.LIZ(Integer.valueOf(i), "conversation_type");
        c63323OtD.LIZ(str2, "leak_ids");
        c63323OtD.LIZ(Integer.valueOf(i2), "pre_check_leak_count");
        c63323OtD.LIZ(Integer.valueOf(i3), "leak_count");
        c63323OtD.LIZ(Long.valueOf(j), "duration");
        c63323OtD.LIZ(Integer.valueOf(C63305Osv.LIZIZ().LIZJ()), "link_mode");
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c63323OtD.LIZ(obj, "repaired_by_v2");
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c63323OtD.LIZ(str3, "is_dup_check");
        c63323OtD.LJ();
    }

    public static void LJII(boolean z, long j, int i, int i2, int i3, C63623Oy3 c63623Oy3, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        String str;
        C63323OtD LIZJ = C63144OqK.LIZJ("im_sdk_init_handler");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LIZ(str, "is_success");
        LIZJ.LIZ(Long.valueOf(j), "total_cost");
        LIZJ.LIZ(Integer.valueOf(i), "page_size");
        LIZJ.LIZ(Integer.valueOf(i2), "conv_count");
        LIZJ.LIZ(Integer.valueOf(i3), "total_msg_count");
        LIZJ.LIZ(Integer.valueOf(C63308Osy.LJI().LIZLLL().LJJIJIIJIL.initConvListPullAsyncEnable), "is_async_save");
        LIZJ.LIZ(Long.valueOf(j2), "response_time_cost");
        LIZJ.LIZ(Long.valueOf(j3), "build_request_time_cost");
        LIZJ.LIZ(Long.valueOf(j4), "save_msg_list_time_cost");
        LIZJ.LIZ(Long.valueOf(j5), "save_conversation_list_time_cost");
        LIZJ.LIZ(Long.valueOf(j6), "save_msg_callback_time_cost");
        LIZJ.LIZ(Long.valueOf(j7), "after_im_init_time_cost");
        LIZJ.LIZ(Long.valueOf(j8), "sp_and_check_wait_time_cost");
        if (!z) {
            LIZJ.LIZ(LIZ(c63623Oy3.LJII), "error_msg");
            LIZJ.LIZ(c63623Oy3.LJFF, "log_id");
        }
        LIZJ.LJ();
    }

    public static void LIZLLL(boolean z, boolean z2, long j, int i, int i2, int i3, int i4, C63623Oy3 c63623Oy3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i5, boolean z3) {
        String str;
        Object obj;
        C63323OtD LIZJ = C63144OqK.LIZJ("puller_wakeup_pull");
        if (z) {
            str = "new";
        } else {
            str = "old";
        }
        LIZJ.LIZ(str, "type");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LIZ(obj, "status");
        LIZJ.LIZ(Integer.valueOf(i2), "cmd_msg_count");
        LIZJ.LIZ(Integer.valueOf(i), "normal_msg_count");
        LIZJ.LIZ(Integer.valueOf(i3), "conv_count");
        LIZJ.LIZ(Integer.valueOf(i4), "unread_count");
        LIZJ.LIZ(Integer.valueOf(i + i2), "total_msg_count");
        LIZJ.LIZ(Integer.valueOf(C63308Osy.LJI().LIZIZ().LJIL() ? 1 : 0), "is_net_available");
        LIZJ.LIZ(Long.valueOf(j), "duration");
        LIZJ.LIZ(Long.valueOf(j2), "build_request_time_cost");
        LIZJ.LIZ(Long.valueOf(j3), "response_time_cost");
        LIZJ.LIZ(Long.valueOf(j4), "save_msg_list_time_cost");
        LIZJ.LIZ(Long.valueOf(j5), "save_conversation_list_time_cost");
        LIZJ.LIZ(Long.valueOf(j6), "save_msg_callback_time_cost");
        LIZJ.LIZ(Long.valueOf(j7), "local_push_time_cost");
        LIZJ.LIZ(Boolean.valueOf(LIZ), "is_first_init");
        if (z3) {
            str2 = "1";
        }
        LIZJ.LIZ(str2, "WITH_RECEIVE_BUFFER");
        LIZJ.LIZ(Long.valueOf(j8), "sp_and_check_wait_time_cost");
        LIZJ.LIZ(C63312Ot2.LJFF(i5), "pull_reason");
        if (!z2 && c63623Oy3 != null) {
            LIZJ.LIZ(Integer.valueOf(c63623Oy3.LIZ), "error_code");
            LIZJ.LIZ(c63623Oy3.LJFF, "log_id");
        }
        LIZJ.LIZLLL();
    }
}

package com.ss.android.ugc.aweme.profile.arg;

import X.C1FJ;
import X.C79062V1e;
import X.C84279X5v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class UserProfileArg implements IRouteArg {
    public static final Parcelable.Creator<UserProfileArg> CREATOR = new C84279X5v();
    public final String aid;
    public final Bundle bundle;
    public final String compatiblSecUserId;
    public final String enterFrom;
    public final String enterMethod;
    public final Integer enterpriseType;
    public final String eventType;
    public String extraSecUserId;
    public String extraUserId;
    public final String fromRequestId;
    public final String iD;
    public final boolean isFromLiveRecord;
    public final String label;
    public final String liveRequestId;
    public final String liveRoomId;
    public final String liveRoomOwnerId;
    public final String liveType;
    public final HashMap<String, String> logExtra;
    public final String noticeType;
    public final String position;
    public final String preEnterFrom;
    public final String previousPage;
    public final String profileFromScene;
    public final String relationFrom;
    public final String returnLive;
    public final String sceneId;
    public final String searchRequestId;
    public final String sourceAid;
    public final String stickyContent;
    public final String trackParams;
    public final String type;
    public final String uniqueId;

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -4, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3) {
        this(str, str2, str3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -8, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -16, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -32, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -64, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -128, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -256, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -512, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1024, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -2048, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -4096, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -8192, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -16384, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -32768, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -65536, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -131072, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -262144, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -524288, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1048576, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -2097152, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -4194304, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -8388608, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -16777216, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -33554432, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, str23, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -67108864, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23, String str24) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, str23, str24, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -134217728, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, str23, str24, str25, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -268435456, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, str23, str24, str25, str26, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -536870912, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Bundle bundle) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, str23, str24, str25, str26, bundle, null, 0 == true ? 1 : 0, -1073741824, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Bundle bundle, String noticeType) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, str23, str24, str25, str26, bundle, noticeType, null, LiveLayoutPreloadThreadPriority.DEFAULT, 0 == true ? 1 : 0);
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
        o.LJIIIZ(noticeType, "noticeType");
    }

    public static UserProfileArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer num;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Boolean bool;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        Bundle bundle2;
        String str27;
        HashMap hashMap;
        String str28 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("uid")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("id"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("sec_user_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_user_id"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("sec_uid")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_uid"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("from_scene")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("from_scene"), String.class);
        } else {
            i += 16;
            str5 = null;
        }
        if (bundle.containsKey("unique_id")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("unique_id"), String.class);
        } else {
            i += 32;
            str6 = null;
        }
        if (bundle.containsKey("profile_from")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("profile_from"), String.class);
        } else {
            i += 64;
            str7 = null;
        }
        if (bundle.containsKey("video_id")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("video_id"), String.class);
        } else {
            i += 128;
            str8 = null;
        }
        if (bundle.containsKey("type")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("type"), String.class);
        } else {
            i += 256;
            str9 = null;
        }
        if (bundle.containsKey("profile_enterprise_type")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("profile_enterprise_type"), Integer.class);
        } else {
            i += 512;
            num = null;
        }
        if (bundle.containsKey("enter_method")) {
            str28 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 1024;
        }
        if (bundle.containsKey("request_id")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("request_id"), String.class);
        } else {
            i += 2048;
            str10 = null;
        }
        if (bundle.containsKey("room_id")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("room_id"), String.class);
        } else {
            i += 4096;
            str11 = null;
        }
        if (bundle.containsKey("from_request_id")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("from_request_id"), String.class);
        } else {
            i += FileUtils.BUFFER_SIZE;
            str12 = null;
        }
        if (bundle.containsKey("return_live")) {
            str13 = (String) RouteParser.INSTANCE.parse(bundle.get("return_live"), String.class);
        } else {
            i += 16384;
            str13 = null;
        }
        if (bundle.containsKey("room_owner_id")) {
            str14 = (String) RouteParser.INSTANCE.parse(bundle.get("room_owner_id"), String.class);
        } else {
            i += 32768;
            str14 = null;
        }
        if (bundle.containsKey("user_type")) {
            str15 = (String) RouteParser.INSTANCE.parse(bundle.get("user_type"), String.class);
        } else {
            i += 65536;
            str15 = null;
        }
        if (bundle.containsKey("is_live_record")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_live_record"), Boolean.class);
            if (bool == null) {
                i += 131072;
            }
        } else {
            i += 131072;
            bool = null;
        }
        if (bundle.containsKey("scene_id")) {
            str16 = (String) RouteParser.INSTANCE.parse(bundle.get("scene_id"), String.class);
        } else {
            i += 262144;
            str16 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str17 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 524288;
            str17 = null;
        }
        if (bundle.containsKey("extra_from_event_enter_from")) {
            str18 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_event_enter_from"), String.class);
        } else {
            i += 1048576;
            str18 = null;
        }
        if (bundle.containsKey("extra_from_event_type")) {
            str19 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_event_type"), String.class);
        } else {
            i += 2097152;
            str19 = null;
        }
        if (bundle.containsKey("extra_from_pre_page")) {
            str20 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_pre_page"), String.class);
        } else {
            i += 4194304;
            str20 = null;
        }
        if (bundle.containsKey("extra_from_pre_relation_from")) {
            str21 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_from_pre_relation_from"), String.class);
        } else {
            i += 8388608;
            str21 = null;
        }
        if (bundle.containsKey("source_aid")) {
            str22 = (String) RouteParser.INSTANCE.parse(bundle.get("source_aid"), String.class);
        } else {
            i += 16777216;
            str22 = null;
        }
        if (bundle.containsKey("trackParams")) {
            str23 = (String) RouteParser.INSTANCE.parse(bundle.get("trackParams"), String.class);
        } else {
            i += 33554432;
            str23 = null;
        }
        if (bundle.containsKey("position")) {
            str24 = (String) RouteParser.INSTANCE.parse(bundle.get("position"), String.class);
        } else {
            i += 67108864;
            str24 = null;
        }
        if (bundle.containsKey("search_request_id")) {
            str25 = (String) RouteParser.INSTANCE.parse(bundle.get("search_request_id"), String.class);
        } else {
            i += 134217728;
            str25 = null;
        }
        if (bundle.containsKey("sticky_content")) {
            str26 = (String) RouteParser.INSTANCE.parse(bundle.get("sticky_content"), String.class);
        } else {
            i += 268435456;
            str26 = null;
        }
        if (bundle.containsKey("bundle")) {
            bundle2 = (Bundle) RouteParser.INSTANCE.parse(bundle.get("bundle"), Bundle.class);
        } else {
            i += 536870912;
            bundle2 = null;
        }
        if (bundle.containsKey("notice_type")) {
            str27 = (String) RouteParser.INSTANCE.parse(bundle.get("notice_type"), String.class);
        } else {
            i += 1073741824;
            str27 = null;
        }
        if (bundle.containsKey("inbox_log_extra")) {
            hashMap = (HashMap) RouteParser.INSTANCE.parse(bundle.get("inbox_log_extra"), HashMap.class);
        } else {
            i += LiveLayoutPreloadThreadPriority.DEFAULT;
            hashMap = null;
        }
        return new UserProfileArg(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str28, str10, str11, str12, str13, str14, str15, bool != null ? bool.booleanValue() : false, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, bundle2, str27, hashMap, i, null);
    }

    public static /* synthetic */ UserProfileArg copy$default(UserProfileArg userProfileArg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Bundle bundle, String str28, HashMap hashMap, int i, Object obj) {
        String str29 = str12;
        String str30 = str11;
        String str31 = str13;
        String str32 = str10;
        Integer num2 = num;
        String str33 = str9;
        String str34 = str8;
        String str35 = str7;
        String str36 = str2;
        String str37 = str;
        String str38 = str3;
        String str39 = str4;
        String str40 = str5;
        String str41 = str6;
        String str42 = str18;
        String str43 = str17;
        boolean z2 = z;
        String str44 = str16;
        String str45 = str14;
        HashMap hashMap2 = hashMap;
        String str46 = str15;
        String str47 = str19;
        String str48 = str20;
        String str49 = str21;
        String str50 = str22;
        String str51 = str28;
        String str52 = str23;
        String str53 = str24;
        String str54 = str25;
        String str55 = str26;
        String str56 = str27;
        Bundle bundle2 = bundle;
        if ((i & 1) != 0) {
            str37 = userProfileArg.extraUserId;
        }
        if ((i & 2) != 0) {
            str36 = userProfileArg.iD;
        }
        if ((i & 4) != 0) {
            str38 = userProfileArg.extraSecUserId;
        }
        if ((i & 8) != 0) {
            str39 = userProfileArg.compatiblSecUserId;
        }
        if ((i & 16) != 0) {
            str40 = userProfileArg.profileFromScene;
        }
        if ((i & 32) != 0) {
            str41 = userProfileArg.uniqueId;
        }
        if ((i & 64) != 0) {
            str35 = userProfileArg.label;
        }
        if ((i & 128) != 0) {
            str34 = userProfileArg.aid;
        }
        if ((i & 256) != 0) {
            str33 = userProfileArg.type;
        }
        if ((i & 512) != 0) {
            num2 = userProfileArg.enterpriseType;
        }
        if ((i & 1024) != 0) {
            str32 = userProfileArg.enterMethod;
        }
        if ((i & 2048) != 0) {
            str30 = userProfileArg.liveRequestId;
        }
        if ((i & 4096) != 0) {
            str29 = userProfileArg.liveRoomId;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str31 = userProfileArg.fromRequestId;
        }
        if ((i & 16384) != 0) {
            str45 = userProfileArg.returnLive;
        }
        if ((32768 & i) != 0) {
            str46 = userProfileArg.liveRoomOwnerId;
        }
        if ((65536 & i) != 0) {
            str44 = userProfileArg.liveType;
        }
        if ((131072 & i) != 0) {
            z2 = userProfileArg.isFromLiveRecord;
        }
        if ((262144 & i) != 0) {
            str43 = userProfileArg.sceneId;
        }
        if ((524288 & i) != 0) {
            str42 = userProfileArg.enterFrom;
        }
        if ((1048576 & i) != 0) {
            str47 = userProfileArg.preEnterFrom;
        }
        if ((2097152 & i) != 0) {
            str48 = userProfileArg.eventType;
        }
        if ((4194304 & i) != 0) {
            str49 = userProfileArg.previousPage;
        }
        if ((8388608 & i) != 0) {
            str50 = userProfileArg.relationFrom;
        }
        if ((16777216 & i) != 0) {
            str52 = userProfileArg.sourceAid;
        }
        if ((33554432 & i) != 0) {
            str53 = userProfileArg.trackParams;
        }
        if ((67108864 & i) != 0) {
            str54 = userProfileArg.position;
        }
        if ((134217728 & i) != 0) {
            str55 = userProfileArg.searchRequestId;
        }
        if ((268435456 & i) != 0) {
            str56 = userProfileArg.stickyContent;
        }
        if ((536870912 & i) != 0) {
            bundle2 = userProfileArg.bundle;
        }
        if ((1073741824 & i) != 0) {
            str51 = userProfileArg.noticeType;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            hashMap2 = userProfileArg.logExtra;
        }
        return userProfileArg.copy(str37, str36, str38, str39, str40, str41, str35, str34, str33, num2, str32, str30, str29, str31, str45, str46, str44, z2, str43, str42, str47, str48, str49, str50, str52, str53, str54, str55, str56, bundle2, str51, hashMap2);
    }

    public final UserProfileArg copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Bundle bundle, String noticeType, HashMap<String, String> hashMap) {
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
        o.LJIIIZ(noticeType, "noticeType");
        return new UserProfileArg(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, preEnterFrom, str19, str20, str21, str22, str23, str24, str25, str26, bundle, noticeType, hashMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileArg)) {
            return false;
        }
        UserProfileArg userProfileArg = (UserProfileArg) obj;
        return o.LJ(this.extraUserId, userProfileArg.extraUserId) && o.LJ(this.iD, userProfileArg.iD) && o.LJ(this.extraSecUserId, userProfileArg.extraSecUserId) && o.LJ(this.compatiblSecUserId, userProfileArg.compatiblSecUserId) && o.LJ(this.profileFromScene, userProfileArg.profileFromScene) && o.LJ(this.uniqueId, userProfileArg.uniqueId) && o.LJ(this.label, userProfileArg.label) && o.LJ(this.aid, userProfileArg.aid) && o.LJ(this.type, userProfileArg.type) && o.LJ(this.enterpriseType, userProfileArg.enterpriseType) && o.LJ(this.enterMethod, userProfileArg.enterMethod) && o.LJ(this.liveRequestId, userProfileArg.liveRequestId) && o.LJ(this.liveRoomId, userProfileArg.liveRoomId) && o.LJ(this.fromRequestId, userProfileArg.fromRequestId) && o.LJ(this.returnLive, userProfileArg.returnLive) && o.LJ(this.liveRoomOwnerId, userProfileArg.liveRoomOwnerId) && o.LJ(this.liveType, userProfileArg.liveType) && this.isFromLiveRecord == userProfileArg.isFromLiveRecord && o.LJ(this.sceneId, userProfileArg.sceneId) && o.LJ(this.enterFrom, userProfileArg.enterFrom) && o.LJ(this.preEnterFrom, userProfileArg.preEnterFrom) && o.LJ(this.eventType, userProfileArg.eventType) && o.LJ(this.previousPage, userProfileArg.previousPage) && o.LJ(this.relationFrom, userProfileArg.relationFrom) && o.LJ(this.sourceAid, userProfileArg.sourceAid) && o.LJ(this.trackParams, userProfileArg.trackParams) && o.LJ(this.position, userProfileArg.position) && o.LJ(this.searchRequestId, userProfileArg.searchRequestId) && o.LJ(this.stickyContent, userProfileArg.stickyContent) && o.LJ(this.bundle, userProfileArg.bundle) && o.LJ(this.noticeType, userProfileArg.noticeType) && o.LJ(this.logExtra, userProfileArg.logExtra);
    }

    public String toString() {
        return "UserProfileArg(extraUserId=" + this.extraUserId + ", iD=" + this.iD + ", extraSecUserId=" + this.extraSecUserId + ", compatiblSecUserId=" + this.compatiblSecUserId + ", profileFromScene=" + this.profileFromScene + ", uniqueId=" + this.uniqueId + ", label=" + this.label + ", aid=" + this.aid + ", type=" + this.type + ", enterpriseType=" + this.enterpriseType + ", enterMethod=" + this.enterMethod + ", liveRequestId=" + this.liveRequestId + ", liveRoomId=" + this.liveRoomId + ", fromRequestId=" + this.fromRequestId + ", returnLive=" + this.returnLive + ", liveRoomOwnerId=" + this.liveRoomOwnerId + ", liveType=" + this.liveType + ", isFromLiveRecord=" + this.isFromLiveRecord + ", sceneId=" + this.sceneId + ", enterFrom=" + this.enterFrom + ", preEnterFrom=" + this.preEnterFrom + ", eventType=" + this.eventType + ", previousPage=" + this.previousPage + ", relationFrom=" + this.relationFrom + ", sourceAid=" + this.sourceAid + ", trackParams=" + this.trackParams + ", position=" + this.position + ", searchRequestId=" + this.searchRequestId + ", stickyContent=" + this.stickyContent + ", bundle=" + this.bundle + ", noticeType=" + this.noticeType + ", logExtra=" + this.logExtra + ')';
    }

    public final String getSecUid() {
        String str = this.extraSecUserId;
        if (str == null || str.length() == 0) {
            return this.compatiblSecUserId;
        }
        return str;
    }

    public final String getUserId() {
        String str = this.extraUserId;
        if (str == null || str.length() == 0) {
            return this.iD;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        String str = this.extraUserId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.iD;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.extraSecUserId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.compatiblSecUserId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.profileFromScene;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.uniqueId;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.label;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.aid;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str9 = this.type;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Integer num = this.enterpriseType;
        if (num == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str10 = this.enterMethod;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str11 = this.liveRequestId;
        if (str11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str11.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        String str12 = this.liveRoomId;
        if (str12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str12.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        String str13 = this.fromRequestId;
        if (str13 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str13.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        String str14 = this.returnLive;
        if (str14 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str14.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        String str15 = this.liveRoomOwnerId;
        if (str15 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str15.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        String str16 = this.liveType;
        if (str16 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str16.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        boolean z = this.isFromLiveRecord;
        int i19 = z;
        if (z != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        String str17 = this.sceneId;
        if (str17 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str17.hashCode();
        }
        int i21 = (i20 + hashCode18) * 31;
        String str18 = this.enterFrom;
        if (str18 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str18.hashCode();
        }
        int LJ = C79062V1e.LJ(this.preEnterFrom, (i21 + hashCode19) * 31, 31);
        String str19 = this.eventType;
        if (str19 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str19.hashCode();
        }
        int i22 = (LJ + hashCode20) * 31;
        String str20 = this.previousPage;
        if (str20 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str20.hashCode();
        }
        int i23 = (i22 + hashCode21) * 31;
        String str21 = this.relationFrom;
        if (str21 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = str21.hashCode();
        }
        int i24 = (i23 + hashCode22) * 31;
        String str22 = this.sourceAid;
        if (str22 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str22.hashCode();
        }
        int i25 = (i24 + hashCode23) * 31;
        String str23 = this.trackParams;
        if (str23 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str23.hashCode();
        }
        int i26 = (i25 + hashCode24) * 31;
        String str24 = this.position;
        if (str24 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str24.hashCode();
        }
        int i27 = (i26 + hashCode25) * 31;
        String str25 = this.searchRequestId;
        if (str25 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str25.hashCode();
        }
        int i28 = (i27 + hashCode26) * 31;
        String str26 = this.stickyContent;
        if (str26 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str26.hashCode();
        }
        int i29 = (i28 + hashCode27) * 31;
        Bundle bundle = this.bundle;
        if (bundle == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = bundle.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.noticeType, (i29 + hashCode28) * 31, 31);
        HashMap<String, String> hashMap = this.logExtra;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return LJ2 + i;
    }

    public final String getAid() {
        return this.aid;
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final String getCompatiblSecUserId() {
        return this.compatiblSecUserId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Integer getEnterpriseType() {
        return this.enterpriseType;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getExtraSecUserId() {
        return this.extraSecUserId;
    }

    public final String getExtraUserId() {
        return this.extraUserId;
    }

    public final String getFromRequestId() {
        return this.fromRequestId;
    }

    public final String getID() {
        return this.iD;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLiveRequestId() {
        return this.liveRequestId;
    }

    public final String getLiveRoomId() {
        return this.liveRoomId;
    }

    public final String getLiveRoomOwnerId() {
        return this.liveRoomOwnerId;
    }

    public final String getLiveType() {
        return this.liveType;
    }

    public final HashMap<String, String> getLogExtra() {
        return this.logExtra;
    }

    public final String getNoticeType() {
        return this.noticeType;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getPreEnterFrom() {
        return this.preEnterFrom;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getProfileFromScene() {
        return this.profileFromScene;
    }

    public final String getRelationFrom() {
        return this.relationFrom;
    }

    public final String getReturnLive() {
        return this.returnLive;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final String getSearchRequestId() {
        return this.searchRequestId;
    }

    public final String getSourceAid() {
        return this.sourceAid;
    }

    public final String getStickyContent() {
        return this.stickyContent;
    }

    public final String getTrackParams() {
        return this.trackParams;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final boolean isFromLiveRecord() {
        return this.isFromLiveRecord;
    }

    public final void setExtraSecUserId(String str) {
        this.extraSecUserId = str;
    }

    public final void setExtraUserId(String str) {
        this.extraUserId = str;
    }

    public final void setSecUid(String str) {
        this.extraSecUserId = str;
    }

    public final void setUserId(String str) {
        this.extraUserId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.extraUserId);
        out.writeString(this.iD);
        out.writeString(this.extraSecUserId);
        out.writeString(this.compatiblSecUserId);
        out.writeString(this.profileFromScene);
        out.writeString(this.uniqueId);
        out.writeString(this.label);
        out.writeString(this.aid);
        out.writeString(this.type);
        Integer num = this.enterpriseType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.enterMethod);
        out.writeString(this.liveRequestId);
        out.writeString(this.liveRoomId);
        out.writeString(this.fromRequestId);
        out.writeString(this.returnLive);
        out.writeString(this.liveRoomOwnerId);
        out.writeString(this.liveType);
        out.writeInt(this.isFromLiveRecord ? 1 : 0);
        out.writeString(this.sceneId);
        out.writeString(this.enterFrom);
        out.writeString(this.preEnterFrom);
        out.writeString(this.eventType);
        out.writeString(this.previousPage);
        out.writeString(this.relationFrom);
        out.writeString(this.sourceAid);
        out.writeString(this.trackParams);
        out.writeString(this.position);
        out.writeString(this.searchRequestId);
        out.writeString(this.stickyContent);
        out.writeBundle(this.bundle);
        out.writeString(this.noticeType);
        HashMap<String, String> hashMap = this.logExtra;
        if (hashMap == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(hashMap.size());
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String preEnterFrom, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Bundle bundle, String noticeType, HashMap<String, String> hashMap) {
        o.LJIIIZ(preEnterFrom, "preEnterFrom");
        o.LJIIIZ(noticeType, "noticeType");
        this.extraUserId = str;
        this.iD = str2;
        this.extraSecUserId = str3;
        this.compatiblSecUserId = str4;
        this.profileFromScene = str5;
        this.uniqueId = str6;
        this.label = str7;
        this.aid = str8;
        this.type = str9;
        this.enterpriseType = num;
        this.enterMethod = str10;
        this.liveRequestId = str11;
        this.liveRoomId = str12;
        this.fromRequestId = str13;
        this.returnLive = str14;
        this.liveRoomOwnerId = str15;
        this.liveType = str16;
        this.isFromLiveRecord = z;
        this.sceneId = str17;
        this.enterFrom = str18;
        this.preEnterFrom = preEnterFrom;
        this.eventType = str19;
        this.previousPage = str20;
        this.relationFrom = str21;
        this.sourceAid = str22;
        this.trackParams = str23;
        this.position = str24;
        this.searchRequestId = str25;
        this.stickyContent = str26;
        this.bundle = bundle;
        this.noticeType = noticeType;
        this.logExtra = hashMap;
    }

    public /* synthetic */ UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Bundle bundle, String str28, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? 0 : num, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : str15, (65536 & i) != 0 ? null : str16, (131072 & i) != 0 ? false : z, (262144 & i) != 0 ? null : str17, (524288 & i) != 0 ? null : str18, (1048576 & i) != 0 ? "" : str19, (2097152 & i) != 0 ? null : str20, (4194304 & i) != 0 ? null : str21, (8388608 & i) != 0 ? null : str22, (16777216 & i) != 0 ? null : str23, (33554432 & i) != 0 ? null : str24, (67108864 & i) != 0 ? null : str25, (134217728 & i) != 0 ? null : str26, (268435456 & i) != 0 ? null : str27, (536870912 & i) != 0 ? null : bundle, (1073741824 & i) == 0 ? str28 : "", (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : hashMap);
    }
}

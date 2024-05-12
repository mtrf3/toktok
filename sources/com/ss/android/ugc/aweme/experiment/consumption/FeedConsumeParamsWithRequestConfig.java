package com.ss.android.ugc.aweme.experiment.consumption;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class FeedConsumeParamsWithRequestConfig extends F9E {

    @InterfaceC65349Pkn("enable_author_id")
    public final boolean enable_author_id;

    @InterfaceC65349Pkn("enable_bool_params")
    public final boolean enable_bool_params;

    @InterfaceC65349Pkn("enable_client_cache")
    public final boolean enable_client_cache;

    @InterfaceC65349Pkn("enable_day_r_num")
    public final boolean enable_day_r_num;

    @InterfaceC65349Pkn("enable_day_v_num")
    public final boolean enable_day_v_num;

    @InterfaceC65349Pkn("enable_day_view_time")
    public final boolean enable_day_view_time;

    @InterfaceC65349Pkn("enable_duration")
    public final boolean enable_duration;

    @InterfaceC65349Pkn("enable_is_ads")
    public final boolean enable_is_ads;

    @InterfaceC65349Pkn("enable_is_disliked")
    public final boolean enable_is_disliked;

    @InterfaceC65349Pkn("enable_is_ecom")
    public final boolean enable_is_ecom;

    @InterfaceC65349Pkn("enable_is_enter_profile")
    public final boolean enable_is_enter_profile;

    @InterfaceC65349Pkn("enable_is_favorited")
    public final boolean enable_is_favorited;

    @InterfaceC65349Pkn("enable_is_finished")
    public final boolean enable_is_finished;

    @InterfaceC65349Pkn("enable_is_followed")
    public final boolean enable_is_followed;

    @InterfaceC65349Pkn("enable_is_liked")
    public final boolean enable_is_liked;

    @InterfaceC65349Pkn("enable_is_reported")
    public final boolean enable_is_reported;

    @InterfaceC65349Pkn("enable_is_shared")
    public final boolean enable_is_shared;

    @InterfaceC65349Pkn("enable_model_type")
    public final boolean enable_model_type;

    @InterfaceC65349Pkn("enable_playtime")
    public final boolean enable_playtime;

    @InterfaceC65349Pkn("enable_playtime_currentlive")
    public final boolean enable_playtime_currentlive;

    @InterfaceC65349Pkn("enable_playtime_live")
    public final boolean enable_playtime_live;

    @InterfaceC65349Pkn("enable_session_r_num")
    public final boolean enable_session_r_num;

    @InterfaceC65349Pkn("enable_session_v_num")
    public final boolean enable_session_v_num;

    @InterfaceC65349Pkn("enable_vid")
    public final boolean enable_vid;

    @InterfaceC65349Pkn("enable_vv")
    public final boolean enable_vv;

    @InterfaceC65349Pkn("params_size")
    public final int params_size;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedConsumeParamsWithRequestConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 67108863, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.params_size), Boolean.valueOf(this.enable_vid), Boolean.valueOf(this.enable_model_type), Boolean.valueOf(this.enable_playtime), Boolean.valueOf(this.enable_playtime_live), Boolean.valueOf(this.enable_playtime_currentlive), Boolean.valueOf(this.enable_duration), Boolean.valueOf(this.enable_vv), Boolean.valueOf(this.enable_session_v_num), Boolean.valueOf(this.enable_session_r_num), Boolean.valueOf(this.enable_day_v_num), Boolean.valueOf(this.enable_day_r_num), Boolean.valueOf(this.enable_day_view_time), Boolean.valueOf(this.enable_author_id), Boolean.valueOf(this.enable_client_cache), Boolean.valueOf(this.enable_bool_params), Boolean.valueOf(this.enable_is_ecom), Boolean.valueOf(this.enable_is_ads), Boolean.valueOf(this.enable_is_finished), Boolean.valueOf(this.enable_is_followed), Boolean.valueOf(this.enable_is_enter_profile), Boolean.valueOf(this.enable_is_liked), Boolean.valueOf(this.enable_is_favorited), Boolean.valueOf(this.enable_is_shared), Boolean.valueOf(this.enable_is_disliked), Boolean.valueOf(this.enable_is_reported)};
    }

    public FeedConsumeParamsWithRequestConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25) {
        this.params_size = i;
        this.enable_vid = z;
        this.enable_model_type = z2;
        this.enable_playtime = z3;
        this.enable_playtime_live = z4;
        this.enable_playtime_currentlive = z5;
        this.enable_duration = z6;
        this.enable_vv = z7;
        this.enable_session_v_num = z8;
        this.enable_session_r_num = z9;
        this.enable_day_v_num = z10;
        this.enable_day_r_num = z11;
        this.enable_day_view_time = z12;
        this.enable_author_id = z13;
        this.enable_client_cache = z14;
        this.enable_bool_params = z15;
        this.enable_is_ecom = z16;
        this.enable_is_ads = z17;
        this.enable_is_finished = z18;
        this.enable_is_followed = z19;
        this.enable_is_enter_profile = z20;
        this.enable_is_liked = z21;
        this.enable_is_favorited = z22;
        this.enable_is_shared = z23;
        this.enable_is_disliked = z24;
        this.enable_is_reported = z25;
    }

    public /* synthetic */ FeedConsumeParamsWithRequestConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? true : z4, (i2 & 32) != 0 ? true : z5, (i2 & 64) != 0 ? true : z6, (i2 & 128) != 0 ? true : z7, (i2 & 256) != 0 ? true : z8, (i2 & 512) != 0 ? true : z9, (i2 & 1024) != 0 ? true : z10, (i2 & 2048) != 0 ? true : z11, (i2 & 4096) != 0 ? true : z12, (i2 & FileUtils.BUFFER_SIZE) != 0 ? false : z13, (i2 & 16384) != 0 ? true : z14, (32768 & i2) != 0 ? true : z15, (65536 & i2) != 0 ? true : z16, (131072 & i2) != 0 ? true : z17, (262144 & i2) != 0 ? true : z18, (524288 & i2) != 0 ? true : z19, (1048576 & i2) != 0 ? true : z20, (2097152 & i2) != 0 ? true : z21, (4194304 & i2) != 0 ? true : z22, (8388608 & i2) != 0 ? true : z23, (16777216 & i2) != 0 ? true : z24, (i2 & 33554432) != 0 ? true : z25);
    }
}

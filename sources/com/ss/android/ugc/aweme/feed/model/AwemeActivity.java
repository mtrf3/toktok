package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AwemeActivity implements Serializable {

    @InterfaceC65349Pkn("activity_id")
    public String activityId;

    @InterfaceC65349Pkn("content")
    public AwemeActivityContent content;

    @InterfaceC65349Pkn("primary_btn")
    public AwemeActivityButton primaryBtn;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("show_delay_time")
    public Long showDelayTime;

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeActivity() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AwemeActivity copy$default(AwemeActivity awemeActivity, String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeActivity.activityId;
        }
        if ((i & 2) != 0) {
            l = awemeActivity.showDelayTime;
        }
        if ((i & 4) != 0) {
            str2 = awemeActivity.schemaUrl;
        }
        if ((i & 8) != 0) {
            awemeActivityContent = awemeActivity.content;
        }
        if ((i & 16) != 0) {
            awemeActivityButton = awemeActivity.primaryBtn;
        }
        return awemeActivity.copy(str, l, str2, awemeActivityContent, awemeActivityButton);
    }

    public final AwemeActivity copy(String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton) {
        return new AwemeActivity(str, l, str2, awemeActivityContent, awemeActivityButton);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivity)) {
            return false;
        }
        AwemeActivity awemeActivity = (AwemeActivity) obj;
        return o.LJ(this.activityId, awemeActivity.activityId) && o.LJ(this.showDelayTime, awemeActivity.showDelayTime) && o.LJ(this.schemaUrl, awemeActivity.schemaUrl) && o.LJ(this.content, awemeActivity.content) && o.LJ(this.primaryBtn, awemeActivity.primaryBtn);
    }

    public int hashCode() {
        String str = this.activityId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.showDelayTime;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.schemaUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AwemeActivityContent awemeActivityContent = this.content;
        int hashCode4 = (hashCode3 + (awemeActivityContent == null ? 0 : awemeActivityContent.hashCode())) * 31;
        AwemeActivityButton awemeActivityButton = this.primaryBtn;
        return hashCode4 + (awemeActivityButton != null ? awemeActivityButton.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeActivity(activityId=");
        LIZ.append(this.activityId);
        LIZ.append(", showDelayTime=");
        LIZ.append(this.showDelayTime);
        LIZ.append(", schemaUrl=");
        LIZ.append(this.schemaUrl);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", primaryBtn=");
        LIZ.append(this.primaryBtn);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final AwemeActivityContent getContent() {
        return this.content;
    }

    public final AwemeActivityButton getPrimaryBtn() {
        return this.primaryBtn;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final Long getShowDelayTime() {
        return this.showDelayTime;
    }

    public AwemeActivity(String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton) {
        this.activityId = str;
        this.showDelayTime = l;
        this.schemaUrl = str2;
        this.content = awemeActivityContent;
        this.primaryBtn = awemeActivityButton;
    }

    public /* synthetic */ AwemeActivity(String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : awemeActivityContent, (i & 16) == 0 ? awemeActivityButton : null);
    }
}

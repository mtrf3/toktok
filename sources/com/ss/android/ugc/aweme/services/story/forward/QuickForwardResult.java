package com.ss.android.ugc.aweme.services.story.forward;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class QuickForwardResult extends ForwardResult {
    public Bitmap coverBitmap;
    public String coverPath;
    public final String creationId;
    public final String scheduleId;
    public final String shootWay;
    public final String storyType;

    public final Bitmap getCoverBitmap() {
        return this.coverBitmap;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStoryType() {
        return this.storyType;
    }

    public final void setCoverBitmap(Bitmap bitmap) {
        this.coverBitmap = bitmap;
    }

    public final void setCoverPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.coverPath = str;
    }

    public QuickForwardResult(String creationId, String scheduleId, String shootWay, String storyType, String coverPath, Bitmap bitmap) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(storyType, "storyType");
        o.LJIIIZ(coverPath, "coverPath");
        this.creationId = creationId;
        this.scheduleId = scheduleId;
        this.shootWay = shootWay;
        this.storyType = storyType;
        this.coverPath = coverPath;
        this.coverBitmap = bitmap;
    }

    public /* synthetic */ QuickForwardResult(String str, String str2, String str3, String str4, String str5, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : bitmap);
    }
}

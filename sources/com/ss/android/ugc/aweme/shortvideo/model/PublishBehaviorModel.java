package com.ss.android.ugc.aweme.shortvideo.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PublishBehaviorModel {
    public final String code;
    public int idIndex;
    public final String info;
    public final String publishId;
    public final String stage;
    public final long timeStamp;
    public final BehaviorType type;

    public final String getSimpleTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC+0"));
        String format = simpleDateFormat.format(new Date(this.timeStamp));
        o.LJIIIIZZ(format, "SimpleDateFormat(\"dd-HHm…}.format(Date(timeStamp))");
        return format;
    }

    public PublishBehaviorModel(long j, String publishId, BehaviorType type, String stage, String code, String info) {
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(code, "code");
        o.LJIIIZ(info, "info");
        this.timeStamp = j;
        this.publishId = publishId;
        this.type = type;
        this.stage = stage;
        this.code = code;
        this.info = info;
        this.idIndex = -1;
    }
}

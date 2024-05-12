package com.ss.android.ugc.effectmanager.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();

    public final String currentTime() {
        String format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS").format(new Date());
        o.LJFF(format, "simpleDateFormat.format(Date())");
        return format;
    }
}

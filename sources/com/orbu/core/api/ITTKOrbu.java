package com.orbu.core.api;

import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.mob.ITTKEventReport;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public interface ITTKOrbu {

    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static String getOrbuSDKVersion(ITTKOrbu iTTKOrbu) {
            return CardStruct.IStatusCode.DEFAULT;
        }

        public static void setDelegate(ITTKOrbu iTTKOrbu, ITTKOrbu instance) {
            o.LJIIIZ(instance, "instance");
        }
    }

    void activeOrbu(TTKOrbuContext tTKOrbuContext, TTKOrbuState tTKOrbuState);

    boolean enableInterceptor();

    ITTKEventReport eventReport();

    TTKOrbuState getCurOrbuState();

    String getOrbuSDKVersion();

    void setDelegate(ITTKOrbu iTTKOrbu);

    void setEventReportImpl(ITTKEventReport iTTKEventReport);

    <T extends ITTKOrbuRequestPayload> TTKResponse shouldInterceptTTKRequest(ITTKOrbuRequest<? extends T> iTTKOrbuRequest);
}

package com.orbu.core;

import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.api.ITTKOrbu;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuRequestPayload;
import com.orbu.core.api.TTKOrbuState;
import com.orbu.core.impl.TTKOrbuDelegate;
import com.orbu.core.mob.ITTKEventReport;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TTKOrbu implements ITTKOrbu {
    public static final TTKOrbu INSTANCE = new TTKOrbu();
    public static ITTKOrbu delegate = new TTKOrbuDelegate();

    @Override // com.orbu.core.api.ITTKOrbu
    public boolean enableInterceptor() {
        return delegate.enableInterceptor();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public ITTKEventReport eventReport() {
        return delegate.eventReport();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public TTKOrbuState getCurOrbuState() {
        return delegate.getCurOrbuState();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getOrbuSDKVersion() {
        return ITTKOrbu.DefaultImpls.getOrbuSDKVersion(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDelegate(ITTKOrbu instance) {
        o.LJIIIZ(instance, "instance");
        delegate = instance;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setEventReportImpl(ITTKEventReport iTTKEventReport) {
        delegate.setEventReportImpl(iTTKEventReport);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public <T extends ITTKOrbuRequestPayload> TTKResponse shouldInterceptTTKRequest(ITTKOrbuRequest<? extends T> request) {
        o.LJIIIZ(request, "request");
        return delegate.shouldInterceptTTKRequest(request);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void activeOrbu(TTKOrbuContext context, TTKOrbuState ttkOrbuState) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(ttkOrbuState, "ttkOrbuState");
        delegate.activeOrbu(context, ttkOrbuState);
    }
}

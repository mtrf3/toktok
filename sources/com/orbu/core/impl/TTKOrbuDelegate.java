package com.orbu.core.impl;

import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.api.ITTKOrbu;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuRequestPayload;
import com.orbu.core.api.TTKOrbuState;
import com.orbu.core.init.TTKNativeNetworkManager;
import com.orbu.core.mob.ITTKEventReport;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TTKOrbuDelegate implements ITTKOrbu {
    @Override // com.orbu.core.api.ITTKOrbu
    public boolean enableInterceptor() {
        return false;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public ITTKEventReport eventReport() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setEventReportImpl(ITTKEventReport iTTKEventReport) {
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public <T extends ITTKOrbuRequestPayload> TTKResponse shouldInterceptTTKRequest(ITTKOrbuRequest<? extends T> request) {
        o.LJIIIZ(request, "request");
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getOrbuSDKVersion() {
        return ITTKOrbu.DefaultImpls.getOrbuSDKVersion(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public TTKOrbuState getCurOrbuState() {
        return TTKOrbuState.DISABLE;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDelegate(ITTKOrbu iTTKOrbu) {
        ITTKOrbu.DefaultImpls.setDelegate(this, iTTKOrbu);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void activeOrbu(TTKOrbuContext context, TTKOrbuState ttkOrbuState) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(ttkOrbuState, "ttkOrbuState");
        TTKNativeNetworkManager.active(enableInterceptor());
    }
}

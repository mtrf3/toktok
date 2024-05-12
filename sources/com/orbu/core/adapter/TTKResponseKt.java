package com.orbu.core.adapter;

/* loaded from: classes7.dex */
public final class TTKResponseKt {
    public static final boolean isBlock(TTKResponse tTKResponse) {
        if (tTKResponse != null && tTKResponse.getStatusCode() != 0) {
            return true;
        }
        return false;
    }
}

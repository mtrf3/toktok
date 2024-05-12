package com.orbu.core.adapter;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TTKResponse {
    public final String description;
    public final int statusCode;

    /* loaded from: classes16.dex */
    public static final class Builder {
        public int statusCode = -1;
        public String description = "";

        public final TTKResponse build() {
            return new TTKResponse(this);
        }

        public final String getDescription$ttk_orbuculum_service_adapter_release() {
            return this.description;
        }

        public final int getStatusCode$ttk_orbuculum_service_adapter_release() {
            return this.statusCode;
        }

        public final Builder description(String description) {
            o.LJIIIZ(description, "description");
            this.description = description;
            return this;
        }

        public final void setDescription$ttk_orbuculum_service_adapter_release(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.description = str;
        }

        public final void setStatusCode$ttk_orbuculum_service_adapter_release(int i) {
            this.statusCode = i;
        }

        public final Builder statusCode(int i) {
            this.statusCode = i;
            return this;
        }
    }

    public /* synthetic */ TTKResponse(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public TTKResponse(Builder builder) {
        this.statusCode = builder.getStatusCode$ttk_orbuculum_service_adapter_release();
        this.description = builder.getDescription$ttk_orbuculum_service_adapter_release();
    }
}

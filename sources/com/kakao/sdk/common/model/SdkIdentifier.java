package com.kakao.sdk.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SdkIdentifier {
    public static final Companion Companion = new Companion();
    public final String identifiers;

    /* JADX WARN: Multi-variable type inference failed */
    public SdkIdentifier() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getIdentifiers() {
        return this.identifiers;
    }

    public SdkIdentifier(String str) {
        this.identifiers = str;
    }

    public /* synthetic */ SdkIdentifier(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

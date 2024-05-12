package com.ss.android.ugc.now.interaction.api;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class Interaction {
    public final String awemeId;

    /* JADX WARN: Multi-variable type inference failed */
    public Interaction() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public Interaction(String str) {
        this.awemeId = str;
    }

    public /* synthetic */ Interaction(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

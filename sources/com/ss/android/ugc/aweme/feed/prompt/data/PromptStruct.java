package com.ss.android.ugc.aweme.feed.prompt.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromptStruct implements Serializable {

    @InterfaceC65349Pkn("prompt")
    public final String prompt;

    @InterfaceC65349Pkn("prompt_type")
    public final int promptType;

    /* JADX WARN: Multi-variable type inference failed */
    public PromptStruct() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PromptStruct copy$default(PromptStruct promptStruct, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = promptStruct.prompt;
        }
        if ((i2 & 2) != 0) {
            i = promptStruct.promptType;
        }
        return promptStruct.copy(str, i);
    }

    public final PromptStruct copy(String str, int i) {
        return new PromptStruct(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptStruct)) {
            return false;
        }
        PromptStruct promptStruct = (PromptStruct) obj;
        return o.LJ(this.prompt, promptStruct.prompt) && this.promptType == promptStruct.promptType;
    }

    public int hashCode() {
        String str = this.prompt;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.promptType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromptStruct(prompt=");
        LIZ.append(this.prompt);
        LIZ.append(", promptType=");
        return b0.LIZJ(LIZ, this.promptType, ')', LIZ);
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final int getPromptType() {
        return this.promptType;
    }

    public PromptStruct(String str, int i) {
        this.prompt = str;
        this.promptType = i;
    }

    public /* synthetic */ PromptStruct(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? -1 : i);
    }
}

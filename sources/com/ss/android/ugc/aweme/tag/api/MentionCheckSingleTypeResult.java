package com.ss.android.ugc.aweme.tag.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class MentionCheckSingleTypeResult extends F9E implements Serializable {

    @InterfaceC65349Pkn("block_type")
    public int blockType;

    @InterfaceC65349Pkn("mention_type")
    public int mentionType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MentionCheckSingleTypeResult() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tag.api.MentionCheckSingleTypeResult.<init>():void");
    }

    public static /* synthetic */ MentionCheckSingleTypeResult copy$default(MentionCheckSingleTypeResult mentionCheckSingleTypeResult, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mentionCheckSingleTypeResult.mentionType;
        }
        if ((i3 & 2) != 0) {
            i2 = mentionCheckSingleTypeResult.blockType;
        }
        return mentionCheckSingleTypeResult.copy(i, i2);
    }

    public final MentionCheckSingleTypeResult copy(int i, int i2) {
        return new MentionCheckSingleTypeResult(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.mentionType), Integer.valueOf(this.blockType)};
    }

    public final int getBlockType() {
        return this.blockType;
    }

    public final int getMentionType() {
        return this.mentionType;
    }

    public final void setBlockType(int i) {
        this.blockType = i;
    }

    public final void setMentionType(int i) {
        this.mentionType = i;
    }

    public MentionCheckSingleTypeResult(int i, int i2) {
        this.mentionType = i;
        this.blockType = i2;
    }

    public /* synthetic */ MentionCheckSingleTypeResult(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}

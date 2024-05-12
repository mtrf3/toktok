package com.bytedance.android.livesdk.mvp;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CheckCodeExtra extends Extra {

    @InterfaceC65349Pkn("block_duration")
    public final long blockDuration;

    public CheckCodeExtra() {
        this(0L, 1, null);
    }

    public static /* synthetic */ CheckCodeExtra copy$default(CheckCodeExtra checkCodeExtra, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = checkCodeExtra.blockDuration;
        }
        return checkCodeExtra.copy(j);
    }

    private Object[] getObjects() {
        return new Object[]{Long.valueOf(this.blockDuration)};
    }

    public final CheckCodeExtra copy(long j) {
        return new CheckCodeExtra(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckCodeExtra) {
            return C78966Uyw.LJIIIZ(((CheckCodeExtra) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("CheckCodeExtra:%s", getObjects());
    }

    public final long getBlockDuration() {
        return this.blockDuration;
    }

    public CheckCodeExtra(long j) {
        this.blockDuration = j;
    }

    public /* synthetic */ CheckCodeExtra(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}

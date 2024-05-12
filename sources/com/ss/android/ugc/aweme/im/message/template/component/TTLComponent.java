package com.ss.android.ugc.aweme.im.message.template.component;

import X.C69647RVb;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTLComponent extends F9E implements BaseComponent {
    public static final Parcelable.Creator<TTLComponent> CREATOR = new C69647RVb();
    public final long expiredAt;

    public TTLComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.expiredAt)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.expiredAt);
    }

    public /* synthetic */ TTLComponent(int i) {
        this(0L);
    }

    public TTLComponent(long j) {
        this.expiredAt = j;
    }
}

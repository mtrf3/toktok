package com.ss.android.ugc.aweme.flow;

import X.X7H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.PageSession;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class Stage<T extends PageSession> implements Parcelable {
    public static final Parcelable.Creator<Stage<T>> CREATOR = new X7H();
    public final T session;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.session, i);
    }

    public Stage(T session) {
        o.LJIIIZ(session, "session");
        this.session = session;
    }
}

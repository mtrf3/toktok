package com.ss.android.ugc.aweme.discover.adapter;

import X.C80891Vot;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class AbstractLoadingLayout$SavedState extends View.BaseSavedState {
    public int state;
    public static final C80891Vot Companion = new C80891Vot();
    public static final Parcelable.Creator<AbstractLoadingLayout$SavedState> CREATOR = new IDCreatorS56S0000000_14(7);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractLoadingLayout$SavedState(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.state = source.readInt();
    }

    public AbstractLoadingLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeInt(this.state);
    }
}

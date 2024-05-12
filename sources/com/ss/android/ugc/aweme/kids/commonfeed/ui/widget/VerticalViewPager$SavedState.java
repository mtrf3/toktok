package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import X.C10690bR;
import X.C80832Vnw;
import X.C80836Vo0;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VerticalViewPager$SavedState extends View.BaseSavedState {
    public Parcelable adapterState;
    public ClassLoader loader;
    public int position;
    public static final C80836Vo0 Companion = new C80836Vo0();
    public static final Parcelable.Creator<VerticalViewPager$SavedState> CREATOR = new C10690bR(new C80832Vnw());

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FragmentPager.SavedState{");
        LIZ.append(Integer.toHexString(System.identityHashCode(this)));
        LIZ.append(" position=");
        return b0.LIZJ(LIZ, this.position, '}', LIZ);
    }

    public VerticalViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewPager$SavedState(Parcel in, ClassLoader classLoader) {
        super(in);
        o.LJIIIZ(in, "in");
        classLoader = classLoader == null ? VerticalViewPager$SavedState.class.getClassLoader() : classLoader;
        this.position = in.readInt();
        this.adapterState = in.readParcelable(classLoader);
        this.loader = classLoader;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeInt(this.position);
        out.writeParcelable(this.adapterState, i);
    }
}

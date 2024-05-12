package com.ss.android.ugc.aweme.dsp.widget.vvpager;

import X.C10690bR;
import X.C91140Zpo;
import X.C91360ZtM;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MDVerticalViewPager$SavedState extends View.BaseSavedState {
    public Parcelable adapterState;
    public ClassLoader loader;
    public int position;
    public static final C91140Zpo Companion = new C91140Zpo();
    public static final Parcelable.Creator<MDVerticalViewPager$SavedState> CREATOR = new C10690bR(new C91360ZtM());

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FragmentPager.SavedState{");
        LIZ.append(Integer.toHexString(System.identityHashCode(this)));
        LIZ.append(" position=");
        LIZ.append(this.position);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public MDVerticalViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MDVerticalViewPager$SavedState(Parcel in, ClassLoader classLoader) {
        super(in);
        o.LJIIIZ(in, "in");
        classLoader = classLoader == null ? MDVerticalViewPager$SavedState.class.getClassLoader() : classLoader;
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

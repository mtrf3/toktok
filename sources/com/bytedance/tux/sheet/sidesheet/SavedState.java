package com.bytedance.tux.sheet.sidesheet;

import X.C80737VmP;
import X.C80738VmQ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class SavedState extends AbsSavedState {
    public final int state;
    public static final C80738VmQ Companion = new C80738VmQ();
    public static final Parcelable.Creator<SavedState> CREATOR = new C80737VmP();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedState(Parcel source, ClassLoader classLoader) {
        super(source, classLoader);
        o.LJIIIZ(source, "source");
        this.state = source.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeInt(this.state);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedState(Parcelable parcelable, SideSheetBehavior<?> behavior) {
        super(parcelable);
        o.LJIIIZ(behavior, "behavior");
        this.state = behavior.LIZJ;
    }
}

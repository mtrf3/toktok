package X;

import X.C80597Vk9;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.slider.RangeSlider$RangeSliderState;

/* renamed from: X.Vk9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80597Vk9 implements Parcelable.Creator<RangeSlider$RangeSliderState> {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.slider.RangeSlider$RangeSliderState] */
    @Override // android.os.Parcelable.Creator
    public final RangeSlider$RangeSliderState createFromParcel(final Parcel parcel) {
        return new AbsSavedState(parcel) { // from class: com.google.android.material.slider.RangeSlider$RangeSliderState
            public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new C80597Vk9();
            public float minSeparation;
            public int separationUnit;

            {
                super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
                this.minSeparation = parcel.readFloat();
                this.separationUnit = parcel.readInt();
            }

            @Override // android.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel2, int i) {
                super.writeToParcel(parcel2, i);
                parcel2.writeFloat(this.minSeparation);
                parcel2.writeInt(this.separationUnit);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public final RangeSlider$RangeSliderState[] newArray(int i) {
        return new RangeSlider$RangeSliderState[i];
    }
}

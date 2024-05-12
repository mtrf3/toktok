package X;

import X.C44500HdI;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.slider.BaseSlider$SliderState;
import java.util.ArrayList;

/* renamed from: X.HdI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44500HdI implements Parcelable.Creator<BaseSlider$SliderState> {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.slider.BaseSlider$SliderState] */
    @Override // android.os.Parcelable.Creator
    public final BaseSlider$SliderState createFromParcel(final Parcel parcel) {
        return new View.BaseSavedState(parcel) { // from class: com.google.android.material.slider.BaseSlider$SliderState
            public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new C44500HdI();
            public final float LJLIL;
            public final float LJLILLLLZI;
            public final ArrayList<Float> LJLJI;
            public final float LJLJJI;
            public final boolean LJLJJL;

            {
                super(parcel);
                this.LJLIL = parcel.readFloat();
                this.LJLILLLLZI = parcel.readFloat();
                ArrayList<Float> arrayList = new ArrayList<>();
                this.LJLJI = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                this.LJLJJI = parcel.readFloat();
                this.LJLJJL = parcel.createBooleanArray()[0];
            }

            @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel2, int i) {
                super.writeToParcel(parcel2, i);
                parcel2.writeFloat(this.LJLIL);
                parcel2.writeFloat(this.LJLILLLLZI);
                parcel2.writeList(this.LJLJI);
                parcel2.writeFloat(this.LJLJJI);
                parcel2.writeBooleanArray(new boolean[]{this.LJLJJL});
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public final BaseSlider$SliderState[] newArray(int i) {
        return new BaseSlider$SliderState[i];
    }
}

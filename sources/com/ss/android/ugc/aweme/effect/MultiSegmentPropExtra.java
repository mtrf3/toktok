package com.ss.android.ugc.aweme.effect;

import X.C48259Iwp;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MultiSegmentPropExtra extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<MultiSegmentPropExtra> CREATOR = new C48259Iwp();

    @InterfaceC65349Pkn("clips")
    public final List<ClipsModel> clips;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSegmentPropExtra copy$default(MultiSegmentPropExtra multiSegmentPropExtra, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = multiSegmentPropExtra.clips;
        }
        return multiSegmentPropExtra.copy(list);
    }

    public final MultiSegmentPropExtra copy(List<ClipsModel> clips) {
        o.LJIIIZ(clips, "clips");
        return new MultiSegmentPropExtra(clips);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.clips};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        List<ClipsModel> list = this.clips;
        parcel.writeInt(list.size());
        Iterator<ClipsModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, 0);
        }
    }

    public final boolean checkValid() {
        boolean z;
        if (this.clips.size() <= 6) {
            z = true;
        } else {
            z = false;
        }
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        for (ClipsModel clipsModel : this.clips) {
            d += clipsModel.getDuration();
            if (z && clipsModel.getDuration() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z && d <= 60.0d) {
            return true;
        }
        return false;
    }

    public final List<ClipsModel> getClips() {
        return this.clips;
    }

    public MultiSegmentPropExtra(List<ClipsModel> clips) {
        o.LJIIIZ(clips, "clips");
        this.clips = clips;
    }
}

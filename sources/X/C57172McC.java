package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.StoryActivityArg;
import kotlin.jvm.internal.o;

/* renamed from: X.McC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57172McC implements Parcelable.Creator<StoryActivityArg> {
    @Override // android.os.Parcelable.Creator
    public final StoryActivityArg createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new StoryActivityArg((EnterStoryParam) parcel.readParcelable(StoryActivityArg.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final StoryActivityArg[] newArray(int i) {
        return new StoryActivityArg[i];
    }
}

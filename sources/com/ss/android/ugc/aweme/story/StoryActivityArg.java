package com.ss.android.ugc.aweme.story;

import X.C57172McC;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryActivityArg extends F9E implements IRouteArg {
    public static final Parcelable.Creator<StoryActivityArg> CREATOR = new C57172McC();
    public final EnterStoryParam enterStoryParam;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryActivityArg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StoryActivityArg copy$default(StoryActivityArg storyActivityArg, EnterStoryParam enterStoryParam, int i, Object obj) {
        if ((i & 1) != 0) {
            enterStoryParam = storyActivityArg.enterStoryParam;
        }
        return storyActivityArg.copy(enterStoryParam);
    }

    public final StoryActivityArg copy(EnterStoryParam enterStoryParam) {
        o.LJIIIZ(enterStoryParam, "enterStoryParam");
        return new StoryActivityArg(enterStoryParam);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.enterStoryParam};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.enterStoryParam, i);
    }

    public final EnterStoryParam getEnterStoryParam() {
        return this.enterStoryParam;
    }

    public StoryActivityArg(EnterStoryParam enterStoryParam) {
        o.LJIIIZ(enterStoryParam, "enterStoryParam");
        this.enterStoryParam = enterStoryParam;
    }

    public /* synthetic */ StoryActivityArg(EnterStoryParam enterStoryParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new EnterStoryParam(null, null, null, false, false, false, false, null, null, null, false, null, 4095, null) : enterStoryParam);
    }
}

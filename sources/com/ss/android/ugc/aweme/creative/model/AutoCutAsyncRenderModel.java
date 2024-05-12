package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.HJX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutAsyncRenderModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutAsyncRenderModel> CREATOR = new HJX();

    @GPV
    public int asyncRenderNecessaryDownloadCount;

    @GPV
    public int asyncRenderNecessaryTotalCount;

    @GPV
    public Set<String> asyncRenderUnnecessaryDownloadSet;

    @GPV
    public int asyncRenderUnnecessaryTotalCount;

    @GPV
    public long costDuration;

    public AutoCutAsyncRenderModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.costDuration);
        out.writeInt(this.asyncRenderNecessaryDownloadCount);
        out.writeInt(this.asyncRenderNecessaryTotalCount);
        Set<String> set = this.asyncRenderUnnecessaryDownloadSet;
        if (set == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                out.writeString(it.next());
            }
        }
        out.writeInt(this.asyncRenderUnnecessaryTotalCount);
    }

    public /* synthetic */ AutoCutAsyncRenderModel(int i) {
        this(0L, 0, 0, null, 0);
    }

    public AutoCutAsyncRenderModel(long j, int i, int i2, Set<String> set, int i3) {
        this.costDuration = j;
        this.asyncRenderNecessaryDownloadCount = i;
        this.asyncRenderNecessaryTotalCount = i2;
        this.asyncRenderUnnecessaryDownloadSet = set;
        this.asyncRenderUnnecessaryTotalCount = i3;
    }
}

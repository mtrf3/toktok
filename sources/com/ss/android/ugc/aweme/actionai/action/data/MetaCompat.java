package com.ss.android.ugc.aweme.actionai.action.data;

import X.C61878OQg;
import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MetaCompat extends F9E {
    public long duration;
    public long frameTimeStamp;
    public boolean hasAudio;
    public long height;
    public List<String> includes;
    public boolean isVideo;
    public String name;
    public String path;
    public long rotation;
    public long width;

    public MetaCompat() {
        this(0L, 0L, false, 0L, 0L, null, false, null, null, 0L, 1023, null);
    }

    public static /* synthetic */ MetaCompat copy$default(MetaCompat metaCompat, long j, long j2, boolean z, long j3, long j4, List list, boolean z2, String str, String str2, long j5, int i, Object obj) {
        long j6 = j;
        long j7 = j2;
        boolean z3 = z;
        long j8 = j3;
        long j9 = j4;
        boolean z4 = z2;
        List list2 = list;
        String str3 = str2;
        String str4 = str;
        long j10 = j5;
        if ((i & 1) != 0) {
            j6 = metaCompat.duration;
        }
        if ((i & 2) != 0) {
            j7 = metaCompat.frameTimeStamp;
        }
        if ((i & 4) != 0) {
            z3 = metaCompat.hasAudio;
        }
        if ((i & 8) != 0) {
            j8 = metaCompat.height;
        }
        if ((i & 16) != 0) {
            j9 = metaCompat.width;
        }
        if ((i & 32) != 0) {
            list2 = metaCompat.includes;
        }
        if ((i & 64) != 0) {
            z4 = metaCompat.isVideo;
        }
        if ((i & 128) != 0) {
            str4 = metaCompat.name;
        }
        if ((i & 256) != 0) {
            str3 = metaCompat.path;
        }
        if ((i & 512) != 0) {
            j10 = metaCompat.rotation;
        }
        List list3 = list2;
        return metaCompat.copy(j6, j7, z3, j8, j9, list3, z4, str4, str3, j10);
    }

    public final MetaCompat copy(long j, long j2, boolean z, long j3, long j4, List<String> includes, boolean z2, String name, String path, long j5) {
        o.LJIIIZ(includes, "includes");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(path, "path");
        return new MetaCompat(j, j2, z, j3, j4, includes, z2, name, path, j5);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.duration), Long.valueOf(this.frameTimeStamp), Boolean.valueOf(this.hasAudio), Long.valueOf(this.height), Long.valueOf(this.width), this.includes, Boolean.valueOf(this.isVideo), this.name, this.path, Long.valueOf(this.rotation)};
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getFrameTimeStamp() {
        return this.frameTimeStamp;
    }

    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    public final long getHeight() {
        return this.height;
    }

    public final List<String> getIncludes() {
        return this.includes;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getRotation() {
        return this.rotation;
    }

    public final long getWidth() {
        return this.width;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFrameTimeStamp(long j) {
        this.frameTimeStamp = j;
    }

    public final void setHasAudio(boolean z) {
        this.hasAudio = z;
    }

    public final void setHeight(long j) {
        this.height = j;
    }

    public final void setIncludes(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.includes = list;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.name = str;
    }

    public final void setPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.path = str;
    }

    public final void setRotation(long j) {
        this.rotation = j;
    }

    public final void setVideo(boolean z) {
        this.isVideo = z;
    }

    public final void setWidth(long j) {
        this.width = j;
    }

    public MetaCompat(long j, long j2, boolean z, long j3, long j4, List<String> includes, boolean z2, String name, String path, long j5) {
        o.LJIIIZ(includes, "includes");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(path, "path");
        this.duration = j;
        this.frameTimeStamp = j2;
        this.hasAudio = z;
        this.height = j3;
        this.width = j4;
        this.includes = includes;
        this.isVideo = z2;
        this.name = name;
        this.path = path;
        this.rotation = j5;
    }

    public MetaCompat(long j, long j2, boolean z, long j3, long j4, List list, boolean z2, String str, String str2, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? 0L : j4, (i & 32) != 0 ? C61878OQg.INSTANCE : list, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? "" : str, (i & 256) == 0 ? str2 : "", (i & 512) != 0 ? 0L : j5);
    }
}

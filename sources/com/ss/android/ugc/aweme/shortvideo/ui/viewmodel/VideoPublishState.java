package com.ss.android.ugc.aweme.shortvideo.ui.viewmodel;

import X.C41035G8p;
import X.C41040G8u;
import X.C45927I0t;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoPublishState implements InterfaceC61312at {
    public final C45927I0t<C41040G8u> backEvent;
    public final C45927I0t<C41035G8p> cancelEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoPublishState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoPublishState copy$default(VideoPublishState videoPublishState, C45927I0t c45927I0t, C45927I0t c45927I0t2, int i, Object obj) {
        if ((i & 1) != 0) {
            c45927I0t = videoPublishState.backEvent;
        }
        if ((i & 2) != 0) {
            c45927I0t2 = videoPublishState.cancelEvent;
        }
        return videoPublishState.copy(c45927I0t, c45927I0t2);
    }

    public final VideoPublishState copy(C45927I0t<C41040G8u> c45927I0t, C45927I0t<C41035G8p> c45927I0t2) {
        return new VideoPublishState(c45927I0t, c45927I0t2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPublishState)) {
            return false;
        }
        VideoPublishState videoPublishState = (VideoPublishState) obj;
        return o.LJ(this.backEvent, videoPublishState.backEvent) && o.LJ(this.cancelEvent, videoPublishState.cancelEvent);
    }

    public int hashCode() {
        C45927I0t<C41040G8u> c45927I0t = this.backEvent;
        int hashCode = (c45927I0t == null ? 0 : c45927I0t.hashCode()) * 31;
        C45927I0t<C41035G8p> c45927I0t2 = this.cancelEvent;
        return hashCode + (c45927I0t2 != null ? c45927I0t2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoPublishState(backEvent=");
        LIZ.append(this.backEvent);
        LIZ.append(", cancelEvent=");
        LIZ.append(this.cancelEvent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C45927I0t<C41040G8u> getBackEvent() {
        return this.backEvent;
    }

    public final C45927I0t<C41035G8p> getCancelEvent() {
        return this.cancelEvent;
    }

    public VideoPublishState(C45927I0t<C41040G8u> c45927I0t, C45927I0t<C41035G8p> c45927I0t2) {
        this.backEvent = c45927I0t;
        this.cancelEvent = c45927I0t2;
    }

    public /* synthetic */ VideoPublishState(C45927I0t c45927I0t, C45927I0t c45927I0t2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c45927I0t, (i & 2) != 0 ? null : c45927I0t2);
    }
}

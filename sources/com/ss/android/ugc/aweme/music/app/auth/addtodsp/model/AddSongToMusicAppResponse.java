package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes34.dex */
public final class AddSongToMusicAppResponse extends BaseResponse {

    @InterfaceC65349Pkn("added")
    public boolean added;

    @InterfaceC65349Pkn("success")
    public boolean success;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddSongToMusicAppResponse() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AddSongToMusicAppResponse.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddSongToMusicAppResponse) {
            return C78966Uyw.LJIIIZ(((AddSongToMusicAppResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.added), Boolean.valueOf(this.success)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("AddSongToMusicAppResponse:%s,%s", getObjects());
    }

    public AddSongToMusicAppResponse(boolean z, boolean z2) {
        this.added = z;
        this.success = z2;
    }

    public /* synthetic */ AddSongToMusicAppResponse(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}

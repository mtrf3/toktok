package com.ss.ugc.android.editor.base.data;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MusicListRequest extends F9E {
    public final String id;
    public final int pageIndex;
    public final int pageSize;

    public static /* synthetic */ MusicListRequest copy$default(MusicListRequest musicListRequest, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = musicListRequest.id;
        }
        if ((i3 & 2) != 0) {
            i = musicListRequest.pageIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = musicListRequest.pageSize;
        }
        return musicListRequest.copy(str, i, i2);
    }

    public final MusicListRequest copy(String id, int i, int i2) {
        o.LJIIIZ(id, "id");
        return new MusicListRequest(id, i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, Integer.valueOf(this.pageIndex), Integer.valueOf(this.pageSize)};
    }

    public final String getId() {
        return this.id;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public MusicListRequest(String id, int i, int i2) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.pageIndex = i;
        this.pageSize = i2;
    }
}

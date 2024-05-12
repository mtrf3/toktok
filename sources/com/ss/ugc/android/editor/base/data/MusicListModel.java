package com.ss.ugc.android.editor.base.data;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MusicListModel extends F9E implements Serializable {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;
    public final List<MusicItem> list;
    public final int page;
    public final int size;
    public final int total;

    public MusicListModel() {
        this(false, 0, 0, 0, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicListModel copy$default(MusicListModel musicListModel, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = musicListModel.hasMore;
        }
        if ((i4 & 2) != 0) {
            i = musicListModel.total;
        }
        if ((i4 & 4) != 0) {
            i2 = musicListModel.page;
        }
        if ((i4 & 8) != 0) {
            i3 = musicListModel.size;
        }
        if ((i4 & 16) != 0) {
            list = musicListModel.list;
        }
        return musicListModel.copy(z, i, i2, i3, list);
    }

    public final MusicListModel copy(boolean z, int i, int i2, int i3, List<MusicItem> list) {
        o.LJIIIZ(list, "list");
        return new MusicListModel(z, i, i2, i3, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hasMore), Integer.valueOf(this.total), Integer.valueOf(this.page), Integer.valueOf(this.size), this.list};
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<MusicItem> getList() {
        return this.list;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getTotal() {
        return this.total;
    }

    public MusicListModel(boolean z, int i, int i2, int i3, List<MusicItem> list) {
        o.LJIIIZ(list, "list");
        this.hasMore = z;
        this.total = i;
        this.page = i2;
        this.size = i3;
        this.list = list;
    }

    public MusicListModel(boolean z, int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? C61878OQg.INSTANCE : list);
    }
}

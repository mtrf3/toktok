package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.F9E;
import X.InterfaceC61312at;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AlbumToEditPageState extends F9E implements InterfaceC61312at {
    public final boolean toEditPage;

    public AlbumToEditPageState() {
        this(false, 1, null);
    }

    public static /* synthetic */ AlbumToEditPageState copy$default(AlbumToEditPageState albumToEditPageState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = albumToEditPageState.toEditPage;
        }
        return albumToEditPageState.copy(z);
    }

    public final AlbumToEditPageState copy(boolean z) {
        return new AlbumToEditPageState(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.toEditPage)};
    }

    public final boolean getToEditPage() {
        return this.toEditPage;
    }

    public AlbumToEditPageState(boolean z) {
        this.toEditPage = z;
    }

    public /* synthetic */ AlbumToEditPageState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}

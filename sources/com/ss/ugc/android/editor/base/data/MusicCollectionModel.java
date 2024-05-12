package com.ss.ugc.android.editor.base.data;

import X.C61878OQg;
import X.F9E;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MusicCollectionModel extends F9E implements Serializable {
    public final List<MusicCollection> collections;

    public MusicCollectionModel() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicCollectionModel copy$default(MusicCollectionModel musicCollectionModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = musicCollectionModel.collections;
        }
        return musicCollectionModel.copy(list);
    }

    public final MusicCollectionModel copy(List<MusicCollection> collections) {
        o.LJIIIZ(collections, "collections");
        return new MusicCollectionModel(collections);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.collections};
    }

    public final List<MusicCollection> getCollections() {
        return this.collections;
    }

    public MusicCollectionModel(List<MusicCollection> collections) {
        o.LJIIIZ(collections, "collections");
        this.collections = collections;
    }

    public MusicCollectionModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}

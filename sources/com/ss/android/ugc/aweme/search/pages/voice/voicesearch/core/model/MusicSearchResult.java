package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicSearchResult extends F9E {

    @InterfaceC65349Pkn("result_type")
    public final String resultType;

    @InterfaceC65349Pkn("SongResult")
    public final String songResult;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicSearchResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.songResult, this.resultType};
    }

    public MusicSearchResult(String songResult, String resultType) {
        o.LJIIIZ(songResult, "songResult");
        o.LJIIIZ(resultType, "resultType");
        this.songResult = songResult;
        this.resultType = resultType;
    }

    public /* synthetic */ MusicSearchResult(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

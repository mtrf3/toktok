package com.ss.android.ugc.aweme.services.external.ability;

/* loaded from: classes8.dex */
public interface IAVLoaderService {

    /* loaded from: classes8.dex */
    public interface ILoaderCallback<T> {
        void finish(T t);
    }

    void setLoader(ILoaderCallback<Boolean> iLoaderCallback);

    void setLoaderOnly();
}

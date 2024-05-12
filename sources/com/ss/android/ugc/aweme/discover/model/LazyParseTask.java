package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65243Pj5;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public interface LazyParseTask<T extends InterfaceC65243Pj5> {
    Callable<T> getLazyParseCallable();

    void setLazyParseCallable(Callable<T> callable);
}

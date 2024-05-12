package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.N26;
import X.N28;

/* loaded from: classes7.dex */
public interface IDynamicResourceConfig<T> {
    boolean enable();

    T fallback();

    String key();

    N28 priority();

    N26 type();
}

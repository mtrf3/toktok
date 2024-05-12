package com.ss.android.ugc.effectmanager.common.cachemanager;

import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes16.dex */
public interface ICache {
    void clear();

    boolean has(String str);

    InputStream queryToStream(String str);

    String queryToValue(String str);

    boolean remove(String str);

    void removePattern(String str);

    void removePattern(Pattern pattern);

    long save(String str, InputStream inputStream);

    long save(String str, String str2);
}

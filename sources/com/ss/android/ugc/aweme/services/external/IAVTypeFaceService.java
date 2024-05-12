package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes3.dex */
public interface IAVTypeFaceService {
    Typeface getTypefaceByFontName(String str);

    void prefetch(Context context);
}

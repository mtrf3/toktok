package com.ss.android.ugc.aweme.lynx.core.viewmodel;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class BulletUtils {
    public static final BulletUtils LIZ = new BulletUtils();

    static {
        new LinkedHashMap();
    }

    public final boolean isSearchIntermediate(String schema) {
        String queryParameter;
        o.LJIIIZ(schema, "schema");
        Uri parse = UriProtector.parse(schema);
        if (parse == null || (queryParameter = UriProtector.getQueryParameter(parse, "channel")) == null) {
            return false;
        }
        return s.LJJJLZIJ(queryParameter, "fe_tiktok_lynx_search_transfer", false);
    }
}

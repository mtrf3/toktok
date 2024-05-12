package com.ss.android.ugc.aweme.utils;

import X.C57422MgE;
import X.C57423MgF;
import X.C58096Mr6;
import X.EF7;
import X.NOP;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SchemaPageHelperImpl implements SchemaPageHelper {
    public static SchemaPageHelper LJ() {
        Object LIZ = C58096Mr6.LIZ(SchemaPageHelper.class, false);
        if (LIZ != null) {
            return (SchemaPageHelper) LIZ;
        }
        if (C58096Mr6.X7 == null) {
            synchronized (SchemaPageHelper.class) {
                if (C58096Mr6.X7 == null) {
                    C58096Mr6.X7 = new SchemaPageHelperImpl();
                }
            }
        }
        return C58096Mr6.X7;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final String getChannel() {
        String str = EF7.LJIILIIL;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final void LIZ(Context context, String str) {
        C57422MgE.LIZIZ(context, str, "", false);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final Intent LIZIZ(Context context, Uri uri) {
        return C57423MgF.LIZ(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final Intent LIZJ(Context context, Uri uri) {
        return C57422MgE.LIZ(context, uri, false, false);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final boolean LIZLLL(Context context, String str, String str2, Map map) {
        o.LJIIIZ(context, "context");
        return NOP.LIZJ(context, str, str2, true, map, true, null, 0);
    }
}

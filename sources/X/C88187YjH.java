package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.YjH, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88187YjH extends P9I {
    public static final List<String> LIZJ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZJ = arrayList;
        C38891fp.LJJ(new String[]{"ro.mediatek.platform"});
        Collections.addAll(arrayList, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    public C88187YjH(Context context) {
        super(context);
    }
}

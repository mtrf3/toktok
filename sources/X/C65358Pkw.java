package X;

import com.bytedance.gift.render.utils.BooleanTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.e;

/* renamed from: X.Pkw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65358Pkw {
    public static final Gson LIZ;
    public static final Gson LIZIZ;

    static {
        e eVar = new e();
        eVar.LIZJ = c.LOWER_CASE_WITH_UNDERSCORES;
        eVar.LIZIZ(new BooleanTypeAdapter(), Boolean.class);
        eVar.LIZIZ(new BooleanTypeAdapter(), Boolean.TYPE);
        LIZ = eVar.LIZ();
        LIZIZ = new Gson();
    }
}

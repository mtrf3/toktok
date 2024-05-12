package X;

import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.Lyr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56029Lyr {
    public static final /* synthetic */ int LIZ = 0;

    public static Throwable LIZIZ(EnumC56028Lyq error) {
        o.LJIIIZ(error, "error");
        m mVar = new m();
        mVar.LJJIIJ("error_code", Integer.valueOf(error.getCode()));
        mVar.LJJIIZ("error_message", error.getMsg());
        return new Throwable(mVar.toString());
    }

    public static Throwable LIZ(int i, String str) {
        m mVar = new m();
        mVar.LJJIIJ("error_code", Integer.valueOf(i));
        mVar.LJJIIZ("error_message", str);
        return new Throwable(mVar.toString());
    }
}

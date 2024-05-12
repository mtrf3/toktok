package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Dmq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34900Dmq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String regex, String str) {
        o.LJIIIZ(regex, "regex");
        try {
            return PatternProtector.compile(regex).matcher(str).find();
        } catch (Exception unused) {
            return false;
        }
    }
}

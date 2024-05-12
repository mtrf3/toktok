package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29821Fa implements X27 {
    public final Object LJLIL;

    public /* synthetic */ C29821Fa() {
        this.LJLIL = new HashMap();
    }

    public C29821Fa(String str) {
        long[] jArr = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split(",");
                if (split.length != 0) {
                    long[] jArr2 = new long[split.length];
                    for (int i = 0; i < split.length; i++) {
                        jArr2[i] = CastLongProtector.parseLong(split[i]);
                    }
                    jArr = jArr2;
                }
            } catch (Throwable unused) {
            }
        }
        this.LJLIL = jArr;
    }

    public static void LIZ(Class cls, LinkedHashSet linkedHashSet) {
        Class<?>[] interfaces = cls.getInterfaces();
        o.LJIIIIZZ(interfaces, "apiComponentClass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if ((!o.LJ(cls2, C0I6.class)) && C0I6.class.isAssignableFrom(cls2)) {
                if (cls2 != null) {
                    linkedHashSet.add(cls2);
                    LIZ(cls2, linkedHashSet);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out com.bytedance.als.ApiComponent>");
                }
            }
        }
    }

    public final void LIZIZ(Class cls, InterfaceC31330CRi interfaceC31330CRi) {
        ((java.util.Map) this.LJLIL).put(cls, interfaceC31330CRi);
    }

    @Override // X.X27
    public final long LJJII(int i, int i2) {
        long[] jArr = (long[]) this.LJLIL;
        if (jArr != null && jArr.length > 0) {
            int i3 = i - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > jArr.length - 1) {
                i3 = jArr.length - 1;
            }
            return jArr[i3];
        }
        return 0L;
    }
}

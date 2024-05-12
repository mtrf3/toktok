package com.kakao.sdk.common.json;

import X.C65403Plf;
import X.EnumC65386PlO;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KakaoEnumTypeAdapter<T> extends TypeAdapter<T> {
    public final Class<T> enumClass;

    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC65386PlO.values().length];
            iArr[EnumC65386PlO.NUMBER.ordinal()] = 1;
            iArr[EnumC65386PlO.STRING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KakaoEnumTypeAdapter(Class<T> enumClass) {
        o.LJIIIZ(enumClass, "enumClass");
        this.enumClass = enumClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [T] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T read(X.C65385PlN r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.common.json.KakaoEnumTypeAdapter.read(X.PlN):java.lang.Object");
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C65403Plf c65403Plf, T t) {
        if (t == null) {
            if (c65403Plf == null) {
                return;
            }
            c65403Plf.LJIIJJI();
            return;
        }
        boolean isAnnotationPresent = this.enumClass.isAnnotationPresent(IntEnum.class);
        Object[] enumConstants = this.enumClass.getEnumConstants();
        if (enumConstants != null) {
            for (Object obj : enumConstants) {
                if (obj != null) {
                    try {
                        InterfaceC65349Pkn interfaceC65349Pkn = (InterfaceC65349Pkn) this.enumClass.getField(((Enum) obj).name()).getAnnotation(InterfaceC65349Pkn.class);
                        if (interfaceC65349Pkn != null && o.LJ(obj, t)) {
                            if (isAnnotationPresent) {
                                if (c65403Plf == null) {
                                    return;
                                }
                                c65403Plf.LJIJJ(Integer.valueOf(CastIntegerProtector.parseInt(interfaceC65349Pkn.value())));
                                return;
                            } else {
                                if (c65403Plf == null) {
                                    return;
                                }
                                c65403Plf.LJJ(interfaceC65349Pkn.value());
                                return;
                            }
                        }
                    } catch (NoSuchFieldException e) {
                        throw new IOException(e);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Enum<*>");
                }
            }
        }
        if (c65403Plf == null) {
            return;
        }
        c65403Plf.LJJ(t.toString());
    }
}

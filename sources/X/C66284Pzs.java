package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pzs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66284Pzs implements InterfaceC66285Pzt {
    public static final C66284Pzs LIZ = new C66284Pzs();

    @Override // X.InterfaceC66285Pzt
    public final boolean LIZ(Object[] objArr) {
        if (objArr.length == 0 || objArr.length < 2 || !o.LJ(objArr[1], "android_id")) {
            return false;
        }
        return true;
    }
}

package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.Eii, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37192Eii implements InterfaceC37169EiL {
    @Override // X.InterfaceC37169EiL
    public final Object LIZ(Class cls, String baseUrl) {
        o.LJIIIZ(baseUrl, "baseUrl");
        return RetrofitFactory.LIZLLL().create(baseUrl).create(cls);
    }
}

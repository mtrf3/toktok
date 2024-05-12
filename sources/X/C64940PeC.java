package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.PeC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64940PeC extends AbstractC64937Pe9<PVP> {
    public static final C64940PeC LIZ = new C64940PeC();

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, PVP pvp) {
        PVP pvp2 = pvp;
        if (pvp2 != null) {
            requestBuilder.LJIJJ = pvp2;
            requestBuilder.LJIJJLI = true;
            return;
        }
        throw new IllegalArgumentException("Body parameter value must not be null.");
    }
}

package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.7eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191207eu extends F9E implements Serializable {
    public final float LJLIL;
    public final C191427fG LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;

    public static /* synthetic */ C191207eu copy$default(C191207eu c191207eu, float f, C191427fG c191427fG, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = c191207eu.LJLIL;
        }
        if ((i & 2) != 0) {
            c191427fG = c191207eu.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            f2 = c191207eu.LJLJI;
        }
        if ((i & 8) != 0) {
            f3 = c191207eu.LJLJJI;
        }
        return c191207eu.copy(f, c191427fG, f2, f3);
    }

    public final C191207eu copy(float f, C191427fG latLon, float f2, float f3) {
        o.LJIIIZ(latLon, "latLon");
        return new C191207eu(f, latLon, f2, f3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), this.LJLILLLLZI, Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI)};
    }

    public final float getBearing() {
        return this.LJLJJI;
    }

    public final C191427fG getLatLon() {
        return this.LJLILLLLZI;
    }

    public final float getTilt() {
        return this.LJLJI;
    }

    public final float getZoom() {
        return this.LJLIL;
    }

    public C191207eu(float f, C191427fG latLon, float f2, float f3) {
        o.LJIIIZ(latLon, "latLon");
        this.LJLIL = f;
        this.LJLILLLLZI = latLon;
        this.LJLJI = f2;
        this.LJLJJI = f3;
    }
}

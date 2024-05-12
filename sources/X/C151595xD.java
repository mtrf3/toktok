package X;

import com.ss.android.ttve.nativePort.TEImageCacheManagerInterface;

/* renamed from: X.5xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151595xD {
    public final TEImageCacheManagerInterface LIZ;

    public final synchronized long LIZIZ() {
        return this.LIZ.getNativeHandle();
    }

    public final synchronized void LIZ(String str) {
        this.LIZ.asynDecodeImage(str);
    }

    public C151595xD(String str, boolean z, boolean z2, int i, int i2, EnumC151395wt enumC151395wt, EnumC151395wt enumC151395wt2) {
        this.LIZ = TEImageCacheManagerInterface.createImageCacheManager(str, z, z2, i, i2, enumC151395wt.ordinal(), enumC151395wt2.ordinal());
    }
}

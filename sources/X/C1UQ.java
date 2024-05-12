package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.1UQ, reason: invalid class name */
/* loaded from: classes.dex */
public class C1UQ implements W4Z<InterfaceC81599W0t> {
    public final ImageModel LIZ;
    public final InterfaceC75158Tec LIZIZ;

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LIZJ(String str) {
    }

    public C1UQ(ImageModel imageModel, InterfaceC75158Tec interfaceC75158Tec) {
        this.LIZ = imageModel;
        this.LIZIZ = interfaceC75158Tec;
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
        String str2;
        ImageModel imageModel = this.LIZ;
        if (imageModel != null && imageModel.getUrls().size() != 0) {
            str2 = (String) ListProtector.get(this.LIZ.getUrls(), 0);
        } else {
            str2 = null;
        }
        InterfaceC75158Tec interfaceC75158Tec = this.LIZIZ;
        if (interfaceC75158Tec != null) {
            interfaceC75158Tec.LJIILL(new RuntimeException(th), str2);
        }
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
        InterfaceC75158Tec interfaceC75158Tec = this.LIZIZ;
        if (interfaceC75158Tec != null) {
            interfaceC75158Tec.LJ();
        }
    }

    @Override // X.W4Z
    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // X.W4Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r5, X.InterfaceC81599W0t r6, android.graphics.drawable.Animatable r7) {
        /*
            r4 = this;
            X.W0t r6 = (X.InterfaceC81599W0t) r6
            r3 = -1
            if (r6 == 0) goto L38
            int r2 = r6.getWidth()
            int r3 = r6.getHeight()
        Ld:
            com.bytedance.android.live.base.model.ImageModel r1 = r4.LIZ
            if (r1 == 0) goto L36
            r0 = 1
            r1.setLoaded(r0)
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LIZ
            java.util.List r0 = r0.getUrls()
            int r0 = r0.size()
            if (r0 == 0) goto L36
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LIZ
            java.util.List r1 = r0.getUrls()
            r0 = 0
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
        L2e:
            X.Tec r0 = r4.LIZIZ
            if (r0 == 0) goto L35
            r0.LJIILJJIL(r2, r3, r1)
        L35:
            return
        L36:
            r1 = 0
            goto L2e
        L38:
            r2 = -1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UQ.LJFF(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
    }
}

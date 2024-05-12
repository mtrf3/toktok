package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.W9q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81830W9q implements InterfaceC81861WAv {
    public final /* synthetic */ C81814W9a LIZ;

    public C81830W9q(C81814W9a c81814W9a) {
        this.LIZ = c81814W9a;
    }

    @Override // X.InterfaceC81861WAv
    public final WAR LIZ(WAA waa, Object obj) {
        W66 w66 = null;
        if (!(obj instanceof HashMap) || this.LIZ.LIZLLL() == null || this.LIZ.LIZLLL().isEmpty()) {
            return null;
        }
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("frame_scheduler_id");
        if (!(obj2 instanceof Integer)) {
            return null;
        }
        Object obj3 = hashMap.get("frame_scheduler_listener");
        for (C208518Gh c208518Gh : this.LIZ.LIZLLL()) {
            if (((Integer) obj2).intValue() == c208518Gh.LIZ) {
                WA0 wa0 = (WA0) ((WA4) waa).LIZ;
                if (wa0 == null) {
                    return null;
                }
                int[] iArr = c208518Gh.LIZIZ;
                if (obj3 instanceof W66) {
                    w66 = (W66) obj3;
                }
                int frameCount = waa.getFrameCount();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                int i = -1;
                for (int i2 : iArr) {
                    if (i2 < frameCount && i2 > -1 && i2 != i) {
                        arrayList.add(Integer.valueOf(i2));
                        i = i2;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    for (int i3 : iArr) {
                        if (i3 == frameCount - 1) {
                            break;
                        }
                    }
                }
                if (w66 != null) {
                    w66.onError(frameCount);
                }
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) ListProtector.get(arrayList, i4)).intValue();
                }
                WAE wae = new WAE(waa, iArr2);
                wa0.LJ = new WA6(iArr2, wae);
                return wae;
            }
        }
        return null;
    }
}

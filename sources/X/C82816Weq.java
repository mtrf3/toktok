package X;

import android.content.res.Resources;

/* renamed from: X.Weq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C82816Weq extends TBS implements InterfaceC88472Yns<Integer, Integer> {
    public C82816Weq(Object obj) {
        super(1, obj, Resources.class, "getDimensionPixelSize", "getDimensionPixelSize(I)I", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(Integer num) {
        return Integer.valueOf(((Resources) this.receiver).getDimensionPixelSize(num.intValue()));
    }
}

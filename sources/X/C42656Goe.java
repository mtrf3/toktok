package X;

/* renamed from: X.Goe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42656Goe implements WN2 {
    public final /* synthetic */ AbstractC42651GoZ LIZ;
    public final /* synthetic */ Integer LIZIZ;

    public C42656Goe(AbstractC42651GoZ abstractC42651GoZ, Integer num) {
        this.LIZ = abstractC42651GoZ;
        this.LIZIZ = num;
    }

    @Override // X.WN2
    public final void onResult(Object obj) {
        C42655God c42655God;
        if ((obj instanceof C42655God) && (c42655God = (C42655God) obj) != null) {
            AbstractC42651GoZ abstractC42651GoZ = this.LIZ;
            Integer num = this.LIZIZ;
            if (abstractC42651GoZ == null || abstractC42651GoZ.LLJJL(num.intValue(), c42655God.LIZ, c42655God.LIZIZ)) {
                return;
            }
            abstractC42651GoZ.onActivityResult(num.intValue(), c42655God.LIZ, c42655God.LIZIZ);
        }
    }
}

package X;

import java.util.Comparator;

/* renamed from: X.Zcf, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90325Zcf implements Comparator<AbstractC90364ZdI> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC90364ZdI abstractC90364ZdI, AbstractC90364ZdI abstractC90364ZdI2) {
        int i;
        AbstractC90364ZdI abstractC90364ZdI3 = abstractC90364ZdI;
        AbstractC90364ZdI abstractC90364ZdI4 = abstractC90364ZdI2;
        C90711Zit c90711Zit = new C90711Zit(abstractC90364ZdI3);
        C90711Zit c90711Zit2 = new C90711Zit(abstractC90364ZdI4);
        while (true) {
            i = 1;
            if (!c90711Zit.hasNext() || !c90711Zit2.hasNext()) {
                break;
            }
            int LIZ = c90711Zit.LIZ() & 255;
            int LIZ2 = c90711Zit2.LIZ() & 255;
            if (LIZ != LIZ2) {
                if (LIZ < LIZ2) {
                    return -1;
                }
                if (1 != 0) {
                    return 1;
                }
            }
        }
        int zzd = abstractC90364ZdI3.zzd();
        int zzd2 = abstractC90364ZdI4.zzd();
        if (zzd == zzd2) {
            i = 0;
        } else if (zzd < zzd2) {
            return -1;
        }
        return i;
    }
}

package X;

/* renamed from: X.Exn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38127Exn<P, R> extends AbstractC38082Ex4<P, R> {
    public abstract R invoke(P p, C38131Exr c38131Exr);

    public static void terminate() {
        throw new C38138Exy(0);
    }

    @Override // X.AbstractC38082Ex4
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public static void terminate(String str) {
        throw new C38138Exy(0, str);
    }
}

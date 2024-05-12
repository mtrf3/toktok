package X;

/* renamed from: X.Gnz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42615Gnz extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C42615Gnz LJLIL = new C42615Gnz();

    public C42615Gnz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        if (!((Boolean) C42620Go4.LIZ.getValue()).booleanValue()) {
            i = C00F.LIZ(31744, 0, "creative_tools_preload_album_bitmap_count", true);
        } else if (IJJ.LIZ()) {
            i = C00F.LIZ(31744, 0, "creative_tools_preload_album_bitmap_count", true);
        }
        return Integer.valueOf(i);
    }
}

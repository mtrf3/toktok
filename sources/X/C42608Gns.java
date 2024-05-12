package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.Gns, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42608Gns extends AbstractC65781Prl implements InterfaceC65784Pro<BitmapFactory.Options> {
    public static final C42608Gns LJLIL = new C42608Gns();

    public C42608Gns() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final BitmapFactory.Options invoke() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }
}

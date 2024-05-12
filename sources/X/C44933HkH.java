package X;

import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;

/* renamed from: X.HkH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44933HkH implements InterfaceC139745e6<IWaterMarkService> {
    public IWaterMarkService LJLIL;

    @Override // X.InterfaceC139745e6
    public final IWaterMarkService get() {
        if (this.LJLIL == null) {
            this.LJLIL = WaterMarkServiceImpl.LIZ();
        }
        return this.LJLIL;
    }
}

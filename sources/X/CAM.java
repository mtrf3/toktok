package X;

import com.bytedance.android.livesdk.model.BannerInRoom;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CAM extends AbstractC65781Prl implements InterfaceC88472Yns<BannerInRoom, Boolean> {
    public static final CAM LJLIL = new CAM();

    public CAM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(BannerInRoom bannerInRoom) {
        BannerInRoom banner = bannerInRoom;
        o.LJIIIZ(banner, "banner");
        return Boolean.valueOf(C77413UZt.LJIJJ(banner));
    }
}

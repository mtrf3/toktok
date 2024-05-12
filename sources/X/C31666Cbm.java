package X;

import Y.AfS57S0100000_5;
import Y.IDuS82S0200000_13;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* renamed from: X.Cbm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31666Cbm {
    public static final /* synthetic */ int LIZ = 0;

    public static C73411SrX LIZ(ImageModel imageModel, InterfaceC31664Cbk interfaceC31664Cbk) {
        List<String> urls;
        if (imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty()) {
            new IllegalArgumentException();
            interfaceC31664Cbk.onFail();
            return null;
        }
        return (C73411SrX) AbstractC73672Svk.LJIIJ(new IDuS82S0200000_13(imageModel, FT1.LIZ(), 1)).LJJJLIIL(new AfS57S0100000_5(interfaceC31664Cbk, 254), new AfS57S0100000_5(interfaceC31664Cbk, 255));
    }
}

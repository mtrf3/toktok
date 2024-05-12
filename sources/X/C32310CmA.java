package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CmA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32310CmA implements InterfaceC32013ChN {
    public final /* synthetic */ int LIZ;

    @Override // X.InterfaceC32013ChN
    public final void onFailed() {
    }

    public C32310CmA(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC32013ChN
    public final void onSuccess(List<AssetsModel> assets) {
        o.LJIIIZ(assets, "assets");
        int i = this.LIZ;
        Iterator<AssetsModel> it = assets.iterator();
        while (it.hasNext()) {
            C32368Cn6.LIZ(it.next(), i);
        }
    }
}

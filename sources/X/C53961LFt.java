package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.bottom.NearbyBottomTabProtocol;
import com.ss.android.ugc.aweme.ui.NearbyTabProtocol;

/* renamed from: X.LFt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53961LFt extends AbstractC53764L8e {
    @Override // X.AbstractC53764L8e
    public final BottomTabProtocol LIZ() {
        return new NearbyBottomTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final TopTabProtocol LIZJ() {
        return new NearbyTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final EnumC53808L9w LIZIZ() {
        return EnumC53808L9w.NEARBY;
    }
}

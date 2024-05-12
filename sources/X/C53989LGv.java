package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.explore.entrance.ExploreBottomTabProtocol;
import com.ss.android.ugc.aweme.explore.entrance.ExploreXTabProtocol;

/* renamed from: X.LGv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53989LGv extends AbstractC53764L8e {
    @Override // X.AbstractC53764L8e
    public final BottomTabProtocol LIZ() {
        return new ExploreBottomTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final TopTabProtocol LIZJ() {
        return new ExploreXTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final EnumC53808L9w LIZIZ() {
        return EnumC53808L9w.EXPLORE;
    }
}

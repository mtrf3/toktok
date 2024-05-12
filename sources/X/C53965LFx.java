package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.feed.ui.FollowTabProtocol;
import com.ss.android.ugc.aweme.merge.FollowingBottomTabProtocol;
import com.ss.android.ugc.aweme.stemfeed.ui.tab.StemTabProtocol;

/* renamed from: X.LFx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53965LFx extends AbstractC53764L8e {
    public final /* synthetic */ int LIZJ;

    @Override // X.AbstractC53764L8e
    public final BottomTabProtocol LIZ() {
        switch (this.LIZJ) {
            case 0:
                return new FollowingBottomTabProtocol();
            default:
                return null;
        }
    }

    @Override // X.AbstractC53764L8e
    public final EnumC53808L9w LIZIZ() {
        switch (this.LIZJ) {
            case 0:
                return EnumC53808L9w.FOLLOWING;
            default:
                return EnumC53808L9w.STEM;
        }
    }

    @Override // X.AbstractC53764L8e
    public final TopTabProtocol LIZJ() {
        switch (this.LIZJ) {
            case 0:
                return new FollowTabProtocol();
            default:
                return new StemTabProtocol();
        }
    }

    public /* synthetic */ C53965LFx(int i) {
        this.LIZJ = i;
    }
}

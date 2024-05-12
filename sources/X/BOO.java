package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BOO extends C1BD {
    public final List<DrawerTabsItem> LJLJLJ;
    public BL7 LJLJLLL;
    public Bundle LJLL;
    public Fragment LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLJ).size();
    }

    public BOO(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJLJ = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (C15380j0.LJIIZILJ()) {
            i = (getCount() - i) - 1;
        }
        return ((DrawerTabsItem) ListProtector.get(this.LJLJLJ, i)).tabName;
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        DrawerFeedLiveFragmentV2 iu0 = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).iu0(this.LJLJLLL, ((DrawerTabsItem) ListProtector.get(this.LJLJLJ, i)).tabType);
        Bundle bundle = new Bundle();
        bundle.putAll(this.LJLL);
        iu0.setArguments(bundle);
        return iu0;
    }

    @Override // X.C1BD, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        Fragment fragment;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        if (!o.LJ(this.LJLLI, object)) {
            if (object instanceof Fragment) {
                fragment = (Fragment) object;
            } else {
                fragment = null;
            }
            this.LJLLI = fragment;
        }
        super.LJIL(i, container, object);
    }
}

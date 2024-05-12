package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.0vU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23120vU extends FrameLayout {
    public View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public NaviAvatarListPresenter LJLJJI;

    private final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) this.LJLJI.getValue();
    }

    public final C35341a6 getNaviAdapter() {
        return (C35341a6) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23120vU(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        View view = null;
        this.LJLILLLLZI = C221108m2.LIZIZ(AnonymousClass261.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AnonymousClass260(context));
        FrameLayout.inflate(context, R.layout.dfx, this);
        View findViewById = findViewById(R.id.hta);
        if (findViewById != null) {
            C29306Beo.LJJJLL(findViewById, 500L, new IDqS416S0100000(this, BuildConfig.VERSION_CODE));
            view = findViewById;
        }
        this.LJLIL = view;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.isf);
        if (recyclerView != null) {
            recyclerView.LJII(new AbstractC030309z() { // from class: X.1a7
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                    boolean z;
                    T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                    if (C16310kV.LIZLLL(recyclerView2) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int LJJJJIZL = RecyclerView.LJJJJIZL(view2);
                    if (LJJJJIZL == 0) {
                        if (z) {
                            rect.right = C15380j0.LJFF(R.dimen.abd);
                        } else {
                            rect.left = C15380j0.LJFF(R.dimen.abd);
                        }
                    } else if (z) {
                        rect.right = C15380j0.LJFF(R.dimen.abc);
                    } else {
                        rect.left = C15380j0.LJFF(R.dimen.abc);
                    }
                    C0A2 layoutManager = recyclerView2.getLayoutManager();
                    if (layoutManager != null && LJJJJIZL == layoutManager.LJJJJZ() - 1) {
                        if (z) {
                            rect.left = C15380j0.LJFF(R.dimen.abd);
                        } else {
                            rect.right = C15380j0.LJFF(R.dimen.abd);
                        }
                    }
                }
            }, -1);
            recyclerView.setLayoutManager(getLinearLayoutManager());
            C35341a6 naviAdapter = getNaviAdapter();
            naviAdapter.LJLILLLLZI = new IDqS416S0100000(this, 291);
            recyclerView.setAdapter(naviAdapter);
            recyclerView.setHasFixedSize(true);
        }
    }

    public void setSelectedIndex(int i) {
        C35341a6 naviAdapter = getNaviAdapter();
        if (i >= ((ArrayList) naviAdapter.LJLIL).size()) {
            return;
        }
        naviAdapter.LJLLLLLL(naviAdapter.LJLJI, 2);
        if (i == -1) {
            return;
        }
        naviAdapter.LJLJI = i;
        naviAdapter.LJLLLLLL(i, 1);
    }
}

package com.zhihu.matisse.internal.ui;

import X.AbstractViewOnClickListenerC81050VrS;
import X.C16880lQ;
import X.C65803Ps7;
import X.C81055VrX;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.entity.Item;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class SelectedPreviewActivity extends AbstractViewOnClickListenerC81050VrS {
    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractViewOnClickListenerC81050VrS, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        if (!C81055VrX.LIZ.LJIIJ) {
            setResult(0);
            finish();
            return;
        }
        ArrayList parcelableArrayList = C16880lQ.LJJLIIIIJ(getIntent(), "extra_default_bundle").getParcelableArrayList("state_selection");
        this.LJLJJI.LJLJJLL.addAll(parcelableArrayList);
        this.LJLJJI.notifyDataSetChanged();
        if (this.LJLILLLLZI.LJFF) {
            this.LJLJJL.setCheckedNum(1);
        } else {
            this.LJLJJL.setChecked(true);
        }
        this.LJLJLLL = 0;
        LLII((Item) ListProtector.get(parcelableArrayList, 0));
    }
}

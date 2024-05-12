package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.C32136CjM;
import X.C32137CjN;
import Y.AObserverS73S0100000_5;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveNewGiftPageIndicatorWidget extends LiveWidget {
    public LinearLayout LJLIL;
    public ImageView LJLILLLLZI;
    public C32136CjM LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final ArrayList<ImageView> LJLJJLL = new ArrayList<>();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View findViewById = findViewById(R.id.hfm);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.page_point_container)");
        this.LJLIL = (LinearLayout) findViewById;
        C32136CjM c32136CjM = this.LJLJI;
        if (c32136CjM != null) {
            c32136CjM.LJFF.observe(this, new AObserverS73S0100000_5(this, 55));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        MutableLiveData<C32137CjN> mutableLiveData;
        super.onDestroy();
        C32136CjM c32136CjM = this.LJLJI;
        if (c32136CjM != null && (mutableLiveData = c32136CjM.LJFF) != null) {
            mutableLiveData.removeObservers(this);
        }
    }
}

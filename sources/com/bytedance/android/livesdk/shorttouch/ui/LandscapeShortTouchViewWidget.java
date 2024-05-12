package com.bytedance.android.livesdk.shorttouch.ui;

import X.UOX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShortTouchPriority;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class LandscapeShortTouchViewWidget extends ShortTouchViewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d_m;
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget
    public final int LJLZ(UOX uox) {
        Object obj;
        List<UOX> list = this.LJLILLLLZI;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    ShortTouchPriority shortTouchPriority = ShortTouchPriority.INSTANCE;
                    if (shortTouchPriority.getPriority(((UOX) obj).LIZ.LJFF()) < shortTouchPriority.getPriority(uox.LIZ.LJFF())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return arrayList.indexOf(obj);
        }
        return -1;
    }
}

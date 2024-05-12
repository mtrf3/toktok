package com.ss.android.ugc.aweme.specact.touchpoints.popup;

import X.ActivityC45651qj;
import X.C2MW;
import X.C31974Cgk;
import X.C37090Eh4;
import X.C40342FsQ;
import X.C40343FsR;
import X.C54082LKk;
import X.InterfaceC250809sq;
import X.InterfaceC55642Lsc;
import X.InterfaceC56322M8o;
import X.M71;
import X.M78;
import X.OKG;
import X.X1D;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.touchpoint.core.model.DynamicDialog;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.api.ISpecApi;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ql1.IDbS494S0100000_4;

@InterfaceC55642Lsc("lynx_dynamic_popup")
/* loaded from: classes5.dex */
public final class DynamicPopupTask extends M71 {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final List<TouchPoint> LJLJI;
    public TouchPoint LJLJJI;
    public DynamicDialog LJLJJL;
    public final int LJLJJLL;

    public final void LJIIIIZZ() {
        String str;
        int i;
        InterfaceC250809sq resFakerService;
        Keva LIZ;
        ISpecApi.LIZ.getClass();
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null && (resFakerService = localTestApi.getResFakerService()) != null && (LIZ = resFakerService.LIZ()) != null) {
            str = LIZ.getString("spce_api_force_use_host", Api.LIZ);
        } else {
            str = null;
        }
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJI(str);
        ISpecApi iSpecApi = (ISpecApi) LIZLLL.create(str).create(ISpecApi.class);
        DynamicDialog dynamicDialog = this.LJLJJL;
        int i2 = 0;
        if (dynamicDialog != null) {
            i = dynamicDialog.LIZ;
            Integer num = dynamicDialog.LIZJ;
            if (num != null) {
                i2 = num.intValue();
            }
        } else {
            i = 0;
        }
        iSpecApi.requestTouchPointShow(i, i2);
        TouchPoint touchPoint = this.LJLJJI;
        if (touchPoint == null) {
            return;
        }
        touchPoint.LJLIL = true;
    }

    @Override // X.M74
    public final boolean canShow() {
        TouchPoint touchPoint = this.LJLJJI;
        if (touchPoint != null && touchPoint.LJLIL) {
            return false;
        }
        List<TouchPoint> list = this.LJLJI;
        TouchPoint touchPoint2 = null;
        if (list != null) {
            Iterator<TouchPoint> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TouchPoint next = it.next();
                if (o.LJ(next.scene, this.LJLIL)) {
                    touchPoint2 = next;
                    break;
                }
            }
            touchPoint2 = touchPoint2;
        }
        this.LJLJJI = touchPoint2;
        if (touchPoint2 != null) {
            DynamicDialog dynamicDialog = (DynamicDialog) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), touchPoint2.data, DynamicDialog.class);
            this.LJLJJL = dynamicDialog;
            if (dynamicDialog != null) {
                dynamicDialog.LJFF = touchPoint2.data;
                dynamicDialog.LIZ = touchPoint2.touchPointId;
                dynamicDialog.LIZ(touchPoint2.touchPointName);
                int i = touchPoint2.launchPlanId;
                if (i == null) {
                    i = -1;
                }
                dynamicDialog.LIZJ = i;
                String str = touchPoint2.abVersions;
                if (str == null) {
                    str = "";
                }
                dynamicDialog.LIZLLL = str;
            }
        }
        TouchPoint touchPoint3 = this.LJLJJI;
        if (touchPoint3 != null && this.LJLJJL != null && !touchPoint3.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJLL;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        String str;
        Lifecycle lifecycle;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        if (this.LJLJJL == null) {
            wrapper.LIZ();
            return;
        }
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null && (lifecycle = LIZJ.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask$showPopup$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    PopupManager.LIZJ(DynamicPopupTask.class);
                }
            });
        }
        StringBuilder LIZ = X1D.LIZ();
        DynamicDialog dynamicDialog = this.LJLJJL;
        String str2 = null;
        if (dynamicDialog != null) {
            str = dynamicDialog.jsSource;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("&data=");
        DynamicDialog dynamicDialog2 = this.LJLJJL;
        if (dynamicDialog2 != null) {
            str2 = dynamicDialog2.LJFF;
        }
        LIZ.append(URLEncoder.encode(str2));
        String LIZIZ = X1D.LIZIZ(LIZ);
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context context2 = context.LIZ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(LIZIZ);
        sparkContext.LJJIIJ("container_bg_color", "00000000");
        sparkContext.LJJIIJ("show_mask", "1");
        sparkContext.LJJIIJ("mask_bg_color", "00000080");
        sparkContext.LJJIIJ("loading_bg_color", "00000000");
        sparkContext.LJJIFFI(1, "silent_load_type");
        sparkContext.LJJI(new IDbS494S0100000_4(this, 0));
        sparkContext.LJJIJIIJIL(new C31974Cgk(this, context, wrapper));
        OKG.LIZLLL(c40342FsQ, context2, sparkContext);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPopupTask(InterfaceC56322M8o interfaceC56322M8o, String sceneName, int i, boolean z) {
        super(interfaceC56322M8o);
        o.LJIIIZ(sceneName, "sceneName");
        this.LJLIL = sceneName;
        this.LJLILLLLZI = z;
        this.LJLJI = C2MW.LIZ().LIZLLL;
        this.LJLJJLL = i;
    }
}

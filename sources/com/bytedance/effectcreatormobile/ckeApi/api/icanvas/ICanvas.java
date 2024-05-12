package com.bytedance.effectcreatormobile.ckeapi.api.icanvas;

import X.C93484aRc;
import X.C93485aRd;
import X.EnumC93483aRb;
import X.InterfaceC65462ha;
import android.graphics.PointF;
import androidx.fragment.app.FragmentManager;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface ICanvas extends IService {
    InterfaceC65462ha<C93484aRc> getCanvasFeatureOperateData();

    InterfaceC65462ha<C93485aRd> getCanvasGestureOperateData();

    PointF getOperateCenter();

    /* synthetic */ String getTag();

    /* synthetic */ void init();

    void onAttach();

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);

    void operateFeature(long j, EnumC93483aRb enumC93483aRb);
}

package com.ugc.effectcreator.canvas;

import X.C1B3;
import X.C36636EZk;
import X.C3BJ;
import X.C48841JEv;
import X.C79853Bl;
import X.C93484aRc;
import X.C93485aRd;
import X.C94815an5;
import X.C94816an6;
import X.EnumC93483aRb;
import X.InterfaceC65462ha;
import X.InterfaceC70422pa;
import X.T2R;
import X.XKX;
import android.graphics.PointF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class CanvasImpl implements ICanvas {
    public final InterfaceC70422pa coroutineScope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));
    public final C3BJ<C93484aRc> featureOperateData = C79853Bl.LIZ(0, 0, null, 7);
    public final C3BJ<C93485aRd> gestureOperateData = C79853Bl.LIZ(0, 0, null, 7);
    public PointF operateCenter = new PointF(-1.0f, -1.0f);

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public String getTag() {
        return "cke_canvas";
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public void init() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public void onAttach() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public void onRecycle() {
    }

    public Fragment getFragment() {
        return new CanvasFragment();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public InterfaceC65462ha<C93484aRc> getCanvasFeatureOperateData() {
        return this.featureOperateData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public InterfaceC65462ha<C93485aRd> getCanvasGestureOperateData() {
        return this.gestureOperateData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public PointF getOperateCenter() {
        return this.operateCenter;
    }

    public final void updateGestureEvent(C93485aRd ges) {
        o.LJIIIZ(ges, "ges");
        XKX.LIZLLL(this.coroutineScope, null, null, new C94816an6(this, ges, null), 3);
    }

    public final void updateOperatorCenter(PointF center) {
        o.LJIIIZ(center, "center");
        this.operateCenter = center;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public void open(FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIIIZZ(i, 1, getFragment(), getTag());
        c1b3.LJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas
    public void operateFeature(long j, EnumC93483aRb type) {
        o.LJIIIZ(type, "type");
        XKX.LIZLLL(this.coroutineScope, null, null, new C94815an5(this, j, type, null), 3);
    }
}

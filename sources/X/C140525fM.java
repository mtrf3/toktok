package X;

import Y.IDCListenerS147S0200000_2;
import Y.IDCListenerS252S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5fM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140525fM implements InterfaceC159596Od {
    public final Context LIZ;
    public final C1NS<BaseStickerModel> LIZIZ;
    public final View LIZJ;
    public final FrameLayout LIZLLL;
    public final LifecycleOwner LJ;

    @Override // X.InterfaceC159596Od
    public final void LIZ() {
        View view = this.LIZJ;
        if (C16330kX.LIZJ(view) && !view.isLayoutRequested()) {
            LIZLLL();
        } else {
            view.addOnLayoutChangeListener(new IDCListenerS252S0100000_2(this, 3));
        }
    }

    @Override // X.InterfaceC159596Od
    public final Bitmap LIZJ() {
        Bitmap createBitmap = Bitmap.createBitmap(this.LIZJ.getWidth(), this.LIZJ.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(this.LIZ.getResources().getDisplayMetrics().densityDpi);
        Canvas canvas = new Canvas(createBitmap);
        C39214FaE c39214FaE = C37203Eit.LIZJ;
        View view = this.LIZJ;
        c39214FaE.getClass();
        C39214FaE.LIZ(view, canvas);
        return createBitmap;
    }

    public final void LIZLLL() {
        int left = this.LIZJ.getLeft();
        int top = this.LIZJ.getTop();
        int width = this.LIZJ.getWidth();
        int height = this.LIZJ.getHeight();
        float rotation = this.LIZJ.getRotation();
        this.LIZIZ.LJ(new C140535fN(left, width, top, height, this.LIZLLL.getLeft(), this.LIZLLL.getTop(), this.LIZLLL.getWidth(), this.LIZLLL.getHeight(), rotation));
    }

    @Override // X.InterfaceC159596Od
    public final void destroy() {
        C16880lQ.LJLLLL(this.LIZJ, this.LIZLLL);
    }

    @Override // X.InterfaceC159596Od
    public final void LIZIZ(AqS149S0200000_2 aqS149S0200000_2) {
        View view = this.LIZJ;
        if (C16330kX.LIZJ(view) && !view.isLayoutRequested()) {
            LIZLLL();
            aqS149S0200000_2.invoke();
        } else {
            view.addOnLayoutChangeListener(new IDCListenerS147S0200000_2(this, aqS149S0200000_2, 2));
        }
    }

    public C140525fM(Context context, C1NS<BaseStickerModel> baseStateContainer, View stickerView, FrameLayout container, LifecycleOwner lifecycleOwner) {
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(baseStateContainer, "baseStateContainer");
        o.LJIIIZ(stickerView, "stickerView");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = baseStateContainer;
        this.LIZJ = stickerView;
        this.LIZLLL = container;
        this.LJ = lifecycleOwner;
        if (stickerView.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams2 = stickerView.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = 17;
            }
            container.addView(stickerView);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            container.addView(stickerView, layoutParams3);
        }
        baseStateContainer.LIZ(new TBT() { // from class: X.5Ok
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateX());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 573));
        baseStateContainer.LIZ(new TBT() { // from class: X.5Ol
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateY());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 576));
        baseStateContainer.LIZ(new TBT() { // from class: X.5Ou
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 578));
        baseStateContainer.LIZ(new TBT() { // from class: X.5Ov
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getRotation());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 541));
        baseStateContainer.LIZ(new TBT() { // from class: X.5fL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((BaseStickerModel) obj).getVisible());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 562));
        baseStateContainer.LIZ(new TBT() { // from class: X.5Or
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getAlpha());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 566));
        baseStateContainer.LIZ(new TBT() { // from class: X.5Oj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getZIndex());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 570));
        LIZ();
    }
}

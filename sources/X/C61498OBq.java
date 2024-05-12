package X;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.ss.android.elearning.lingo.lynx.component.select.LynxSelectView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OBq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61498OBq implements InterfaceC79913VXx {
    public final /* synthetic */ LynxSelectView LIZ;

    @Override // X.InterfaceC79913VXx
    public final void LIZ() {
        this.LIZ.LJIJJLI("selectEvents", new OSZ<>("eventType", "SelectStart"));
    }

    @Override // X.InterfaceC79913VXx
    public final void LIZIZ() {
        this.LIZ.LJIJJLI("selectEvents", new OSZ<>("eventType", "SelectShow"));
    }

    @Override // X.InterfaceC79913VXx
    public final void LIZLLL() {
        this.LIZ.LJIJJLI("selectEvents", new OSZ<>("eventType", "SelectDismiss"));
    }

    @Override // X.InterfaceC79913VXx
    public final void LJFF() {
        this.LIZ.LJIJJLI("selectEvents", new OSZ<>("eventType", "SelectFinish"));
    }

    @Override // X.InterfaceC79913VXx
    public final void LJI() {
        OSZ<Rect, Rect> osz;
        Rect rect;
        Integer num;
        String str;
        int LJJJLZIJ;
        int LJJJLZIJ2;
        int LJJJLZIJ3;
        int LJJJLZIJ4;
        int LJJJLZIJ5;
        TBP tbp = (TBP) this.LIZ.mView;
        if (tbp == null || (osz = tbp.getCursorPosition()) == null) {
            osz = new OSZ<>(new Rect(), new Rect());
        }
        Rect first = osz.getFirst();
        Rect second = osz.getSecond();
        int i = first.top;
        int i2 = second.top;
        if (i > i2) {
            rect = second;
        } else {
            rect = first;
        }
        if (i <= i2) {
            first = second;
        }
        TBP tbp2 = (TBP) this.LIZ.mView;
        Integer num2 = null;
        if (tbp2 != null) {
            num = Integer.valueOf(tbp2.getSelectAreaCenterX());
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        LynxSelectView lynxSelectView = this.LIZ;
        OSZ<String, ? extends Object>[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ<>("eventType", "SelectStop");
        HashMap hashMap = new HashMap();
        LynxSelectView lynxSelectView2 = this.LIZ;
        TBP tbp3 = (TBP) lynxSelectView2.mView;
        if (tbp3 == null || (str = tbp3.getSelectText()) == null) {
            str = "";
        }
        hashMap.put("content", str);
        HashMap hashMap2 = new HashMap();
        if (C61499OBr.LIZIZ()) {
            LJJJLZIJ = C78688UuS.LJJJLZIJ(C60543NpT.LIZ() - rect.left);
        } else {
            LJJJLZIJ = C78688UuS.LJJJLZIJ(rect.left);
        }
        hashMap2.put("left", Integer.valueOf(LJJJLZIJ));
        hashMap2.put("top", Integer.valueOf(C78688UuS.LJJJLZIJ(rect.top)));
        if (C61499OBr.LIZIZ()) {
            LJJJLZIJ2 = C78688UuS.LJJJLZIJ(C60543NpT.LIZ() - rect.right);
        } else {
            LJJJLZIJ2 = C78688UuS.LJJJLZIJ(rect.right);
        }
        hashMap2.put("right", Integer.valueOf(LJJJLZIJ2));
        hashMap2.put("bottom", Integer.valueOf(C78688UuS.LJJJLZIJ(rect.bottom)));
        hashMap.put("startCursor", hashMap2);
        HashMap hashMap3 = new HashMap();
        if (C61499OBr.LIZIZ()) {
            LJJJLZIJ3 = C78688UuS.LJJJLZIJ(C60543NpT.LIZ() - first.left);
        } else {
            LJJJLZIJ3 = C78688UuS.LJJJLZIJ(first.left);
        }
        hashMap3.put("left", Integer.valueOf(LJJJLZIJ3));
        hashMap3.put("top", Integer.valueOf(C78688UuS.LJJJLZIJ(first.top)));
        if (C61499OBr.LIZIZ()) {
            LJJJLZIJ4 = C78688UuS.LJJJLZIJ(C60543NpT.LIZ() - first.right);
        } else {
            LJJJLZIJ4 = C78688UuS.LJJJLZIJ(first.right);
        }
        hashMap3.put("right", Integer.valueOf(LJJJLZIJ4));
        hashMap3.put("bottom", Integer.valueOf(C78688UuS.LJJJLZIJ(first.bottom)));
        hashMap.put("endCursor", hashMap3);
        if (C61499OBr.LIZIZ()) {
            LJJJLZIJ5 = C78688UuS.LJJJLZIJ(C60543NpT.LIZ() - intValue);
        } else {
            LJJJLZIJ5 = C78688UuS.LJJJLZIJ(intValue);
        }
        hashMap.put("centerX", Integer.valueOf(LJJJLZIJ5));
        TBP tbp4 = (TBP) lynxSelectView2.mView;
        if (tbp4 != null) {
            num2 = Integer.valueOf(tbp4.getStartIndex());
        }
        if (num2 == null) {
            num2 = 0;
        }
        hashMap.put("startIndex", num2);
        oszArr[1] = new OSZ<>("stopEventInfo", hashMap);
        lynxSelectView.LJIJJLI("selectEvents", oszArr);
    }

    public C61498OBq(LynxSelectView lynxSelectView) {
        this.LIZ = lynxSelectView;
    }

    @Override // X.InterfaceC79913VXx
    public final void LIZJ(Rect rect) {
        String str;
        WindowManager windowManager;
        Display defaultDisplay;
        LynxSelectView lynxBaseUI = this.LIZ;
        o.LJIIIZ(lynxBaseUI, "lynxBaseUI");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object LLILL = C16880lQ.LLILL(C58127Mrb.LIZIZ.getApplicationContext(), "window");
        if ((LLILL instanceof WindowManager) && (windowManager = (WindowManager) LLILL) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        Rect rect2 = new Rect(0, 0, 0, displayMetrics.heightPixels);
        lynxBaseUI.mContext.LJLJLLL.mView.getGlobalVisibleRect(rect2);
        int i = rect2.top;
        int[] iArr = new int[2];
        T t = this.LIZ.mView;
        if (t != 0) {
            t.getLocationOnScreen(iArr);
        }
        LynxSelectView lynxSelectView = this.LIZ;
        OSZ<String, ? extends Object>[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ<>("eventType", "SelectMove");
        HashMap hashMap = new HashMap();
        TBP tbp = (TBP) this.LIZ.mView;
        if (tbp == null || (str = tbp.getSelectText()) == null) {
            str = "";
        }
        hashMap.put("content", str);
        hashMap.put("cursorTop", Integer.valueOf(C78688UuS.LJJJLZIJ(rect.top - i)));
        hashMap.put("cursorBottom", Integer.valueOf(C78688UuS.LJJJLZIJ(rect.bottom - i)));
        oszArr[1] = new OSZ<>("moveEventInfo", hashMap);
        lynxSelectView.LJIJJLI("selectEvents", oszArr);
    }

    @Override // X.InterfaceC79913VXx
    public final void LJ(CharSequence charSequence, boolean z) {
        this.LIZ.LJIJJLI("selectEvents", new OSZ<>("eventType", "SelectTextChange"));
    }
}

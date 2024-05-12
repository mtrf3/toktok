package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8P {
    public final U8H LIZ;
    public final C76703U8l LIZIZ;
    public final U92 LIZJ;
    public final U9E LIZLLL;
    public final C76712U8u LJ;

    public final Layout LIZ() {
        Layout layout;
        Layout LIZJ = this.LIZIZ.LIZJ(false);
        if (this.LIZLLL.LIZ()) {
            U9E u9e = this.LIZLLL;
            if (u9e.LIZLLL != null && (layout = u9e.LJ) != null) {
                return layout;
            }
            return LIZJ;
        }
        return LIZJ;
    }

    public final boolean LJII() {
        Layout LIZJ = this.LIZIZ.LIZJ(false);
        if ((LIZJ == null || !LIZJ.isFixedType()) && !this.LIZLLL.LIZ()) {
            return false;
        }
        return true;
    }

    public final java.util.Map<String, OnLineMicInfo> LJI() {
        if (LJII()) {
            return this.LIZJ.LIZ();
        }
        return this.LIZJ.LJIILJJIL();
    }

    public final boolean LJIIIIZZ() {
        Layout LIZ = LIZ();
        if (LIZ == null || LIZ.isFixedType()) {
            return false;
        }
        return true;
    }

    public static String LJIIIZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_MicHelper_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_MicHelper_", i, LIZ2);
    }

    public final int LIZJ(Layout layout) {
        java.util.Map<String, LayoutArray> indexLayoutArrayMap;
        if (this.LIZLLL.LIZ()) {
            return layout.getMicCount();
        }
        LayoutArrayList layoutMaskConfigListByOnlineMicCount = layout.getLayoutMaskConfigListByOnlineMicCount(LJI().size());
        if (layoutMaskConfigListByOnlineMicCount != null && (indexLayoutArrayMap = layoutMaskConfigListByOnlineMicCount.getIndexLayoutArrayMap()) != null) {
            return indexLayoutArrayMap.size();
        }
        return 0;
    }

    public final Integer LIZLLL(String linkMicId) {
        MicPositionInfo micPositionData;
        o.LJIIIZ(linkMicId, "linkMicId");
        OnLineMicInfo LJ = LJ(linkMicId);
        if (LJ != null && (micPositionData = LJ.getMicPositionData()) != null) {
            return Integer.valueOf(micPositionData.getPosition());
        }
        return null;
    }

    public final OnLineMicInfo LJ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        if (LJII()) {
            return this.LIZJ.LJII(linkMicId);
        }
        return this.LIZJ.LIZIZ(linkMicId);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.RectF LIZIZ(float r12, com.bytedance.android.livesdk.comp.api.linkcore.model.Insets r13) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8P.LIZIZ(float, com.bytedance.android.livesdk.comp.api.linkcore.model.Insets):android.graphics.RectF");
    }

    public final Rect LJFF(int i, Rect showContainerAllArea, Layout layout) {
        o.LJIIIZ(showContainerAllArea, "showContainerAllArea");
        if (layout.isNormalType()) {
            return new Rect();
        }
        LayoutArray layoutByPosAndSize = layout.getLayoutByPosAndSize(i, this.LIZJ.LJIIIIZZ());
        int i2 = 1;
        if (layoutByPosAndSize == null) {
            String LJIIIZ = LJIIIZ(67);
            StringBuilder LJ = C7MY.LJ("getPosRect return as can't find layoutArray pos = ", i, " micCount = ");
            Layout LIZJ = this.LIZIZ.LIZJ(false);
            if (LIZJ != null) {
                i2 = LIZJ.getMicCount();
            }
            LJ.append(i2);
            LJ.append('!');
            C32014ChO.LIZJ(LJIIIZ, X1D.LIZIZ(LJ), null);
            return new Rect();
        }
        RectF locationRectF = layoutByPosAndSize.getLocationRectF();
        if (i != 0 || !layout.isFloatType() || this.LIZJ.LJIIIIZZ() != 1) {
            i2 = 0;
        }
        if (locationRectF == null) {
            C32014ChO.LIZJ(LJIIIZ(95), "createLayoutParamsByData return as  layoutArray is null", null);
            return new Rect();
        }
        if (i2 != 0) {
            return showContainerAllArea;
        }
        Rect rect = new Rect();
        rect.left = O6R.LJJIIZ(locationRectF.left * showContainerAllArea.width());
        rect.top = O6R.LJJIIZ(locationRectF.top * showContainerAllArea.height());
        rect.right = O6R.LJJIIZ((locationRectF.width() * showContainerAllArea.width()) + rect.left);
        rect.bottom = O6R.LJJIIZ((locationRectF.height() * showContainerAllArea.height()) + rect.top);
        String LJIIIZ2 = LJIIIZ(114);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createLayoutParamsByData newRect = ");
        LIZ.append(rect);
        C32014ChO.LJFF(LJIIIZ2, X1D.LIZIZ(LIZ));
        return rect;
    }

    public U8P(U8H layoutManager, C76703U8l micDataCenter, U92 micPositionManager, U9E mappingHelper) {
        o.LJIIIZ(layoutManager, "layoutManager");
        o.LJIIIZ(micDataCenter, "micDataCenter");
        o.LJIIIZ(micPositionManager, "micPositionManager");
        o.LJIIIZ(mappingHelper, "mappingHelper");
        this.LIZ = layoutManager;
        this.LIZIZ = micDataCenter;
        this.LIZJ = micPositionManager;
        this.LIZLLL = mappingHelper;
        this.LJ = new C76712U8u();
    }
}

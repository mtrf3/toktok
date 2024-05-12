package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Insets;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceFeedLayoutConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8J {
    public final U8P LIZ;
    public final EnumC76124TuC LIZIZ;
    public int LIZJ;
    public volatile EnumC74829TYj LIZLLL;

    public static String LJFF(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_LayoutMeasureHelper_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_LayoutMeasureHelper_", i, LIZ2);
    }

    public static Rect LJI(ViewGroup.LayoutParams layoutParams) {
        Rect rect = new Rect();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.leftMargin;
        rect.left = i;
        int i2 = marginLayoutParams.topMargin;
        rect.top = i2;
        rect.right = i + layoutParams.width;
        rect.bottom = i2 + layoutParams.height;
        return rect;
    }

    public U8J(U8P micHelper, EnumC76124TuC pageType) {
        o.LJIIIZ(micHelper, "micHelper");
        o.LJIIIZ(pageType, "pageType");
        this.LIZ = micHelper;
        this.LIZIZ = pageType;
    }

    public final Rect LIZ(Insets insets, U8X u8x) {
        int LJIIJJI;
        int LJIIJJI2;
        Rect rect;
        OSZ<Integer, Integer> osz;
        Integer invoke;
        C61162ae c61162ae = new C61162ae(u8x.LIZLLL.getBusinessType(), u8x.LIZLLL.getVersion());
        if (((Number) ListProtector.get(insets.getInsets(), 0)).intValue() == 0) {
            LJIIJJI = 0;
        } else {
            LJIIJJI = C87277YNd.LJIIJJI(((Number) ListProtector.get(insets.getInsets(), 0)).intValue());
        }
        if (((Number) ListProtector.get(insets.getInsets(), 1)).intValue() == 0) {
            LJIIJJI2 = 0;
        } else {
            LJIIJJI2 = C87277YNd.LJIIJJI(((Number) ListProtector.get(insets.getInsets(), 1)).intValue());
        }
        int i = LJIIJJI2 + u8x.LJIIIZ;
        int LJIIJJI3 = C87277YNd.LJIIJJI(((Number) ListProtector.get(insets.getInsets(), 2)).intValue());
        int LJIIJJI4 = C87277YNd.LJIIJJI(((Number) ListProtector.get(insets.getInsets(), 3)).intValue());
        InterfaceC88472Yns<? super C61162ae, Integer> interfaceC88472Yns = this.LIZ.LIZ.LJJIJIIJI;
        if (interfaceC88472Yns != null && (invoke = interfaceC88472Yns.invoke(c61162ae)) != null && invoke.intValue() == 16 && this.LIZIZ != EnumC76124TuC.SEARCH) {
            LiveAudienceFeedLayoutConfigSetting liveAudienceFeedLayoutConfigSetting = LiveAudienceFeedLayoutConfigSetting.INSTANCE;
            if (liveAudienceFeedLayoutConfigSetting.isFeedLayoutV1()) {
                rect = new Rect(LJIIJJI, i, LJIIJJI3, LJIIJJI4);
            } else if (liveAudienceFeedLayoutConfigSetting.isFeedLayoutV2()) {
                int LJIILIIL = C15380j0.LJIILIIL();
                int i2 = ((i + LJIIJJI4) + LJIILIIL) / 2;
                rect = new Rect(LJIIJJI, i2 - LJIILIIL, LJIIJJI3, i2);
            } else {
                int i3 = (i + LJIIJJI4) / 2;
                rect = new Rect(LJIIJJI, i3, LJIIJJI3, i3);
            }
        } else {
            rect = new Rect(LJIIJJI, i, LJIIJJI3, LJIIJJI4);
        }
        List<Float> viewPercent = insets.getViewPercent();
        if (viewPercent != null && viewPercent.size() >= 4 && (osz = u8x.LJ) != null) {
            float floatValue = osz.getFirst().floatValue() * ((Number) ListProtector.get(viewPercent, 0)).floatValue();
            float floatValue2 = osz.getSecond().floatValue() * ((Number) ListProtector.get(viewPercent, 1)).floatValue();
            float floatValue3 = osz.getFirst().floatValue() * ((Number) ListProtector.get(viewPercent, 2)).floatValue();
            float floatValue4 = osz.getSecond().floatValue() * ((Number) ListProtector.get(viewPercent, 3)).floatValue();
            rect.left += (int) floatValue;
            rect.right += (int) floatValue3;
            rect.top += (int) floatValue2;
            rect.bottom += (int) floatValue4;
        }
        return rect;
    }

    public final Rect LIZIZ(Insets insets, U8X u8x) {
        Rect rect = new Rect();
        OSZ<Integer, Integer> osz = u8x.LJ;
        if (osz == null) {
            C32014ChO.LIZJ(LJFF(232), "getCommonLayoutLocation return as originalSize is null", null);
            return rect;
        }
        Rect LIZ = LIZ(insets, u8x);
        if (this.LIZIZ == EnumC76124TuC.LIVE_ROOM && ((Number) ListProtector.get(insets.getInsets(), 1)).intValue() == 0 && ((Number) ListProtector.get(insets.getInsets(), 3)).intValue() == 0 && o.LJ(insets.getScaleType(), "fill_height") && osz.getFirst().intValue() / osz.getSecond().floatValue() > insets.getRatio()) {
            LIZ.top = -u8x.LJII.top;
        }
        int intValue = osz.getFirst().intValue();
        int i = LIZ.left;
        int i2 = intValue - (LIZ.right + i);
        rect.left = i;
        rect.right = i + i2;
        int intValue2 = osz.getSecond().intValue();
        int i3 = LIZ.top;
        int i4 = intValue2 - (LIZ.bottom + i3);
        rect.top = i3;
        rect.bottom = i3 + i4;
        return rect;
    }

    public final ViewGroup.MarginLayoutParams LIZJ(ViewGroup viewGroup, Rect rect) {
        if (viewGroup instanceof ConstraintLayout) {
            C018905p c018905p = new C018905p(rect.width(), rect.height());
            ((ViewGroup.MarginLayoutParams) c018905p).leftMargin = rect.left;
            ((ViewGroup.MarginLayoutParams) c018905p).topMargin = rect.top + this.LIZJ;
            c018905p.topToTop = 0;
            c018905p.leftToLeft = 0;
            return c018905p;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.gravity = 51;
            layoutParams.leftMargin = rect.left;
            layoutParams.topMargin = rect.top;
            return layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(rect.width(), rect.height());
        marginLayoutParams.leftMargin = rect.left;
        marginLayoutParams.topMargin = rect.top;
        return marginLayoutParams;
    }

    public static Rect LJ(Rect rect, Rect rect2, Rect rect3) {
        Rect rect4 = new Rect();
        if (!rect.contains(rect2)) {
            rect4.left = Math.max(rect2.left, rect.left) - rect3.left;
            rect4.top = Math.max(rect2.top, rect.top) - rect3.top;
            rect4.right = Math.min(rect2.right, rect.right) - rect3.left;
            rect4.bottom = Math.min(rect2.bottom, rect.bottom) - rect3.top;
        } else {
            int i = rect2.left - rect3.left;
            rect4.left = i;
            rect4.top = rect2.top - rect3.top;
            rect4.right = rect2.width() + i;
            rect4.bottom = rect2.height() + rect4.top;
        }
        return rect4;
    }

    public static Rect LIZLLL(OSZ osz, Rect rect, int i, Insets insets) {
        Rect rect2 = new Rect();
        Insets.Companion companion = Insets.Companion;
        if (companion.isContains(insets, i, 2)) {
            int i2 = rect.left;
            rect2.left = i2;
            rect2.right = ((Number) osz.getFirst()).intValue() + i2;
        } else if (companion.isContains(insets, i, 4)) {
            int width = ((rect.width() - ((Number) osz.getFirst()).intValue()) / 2) + rect.left;
            rect2.left = width;
            rect2.right = ((Number) osz.getFirst()).intValue() + width;
        } else if (companion.isContains(insets, i, 8)) {
            int i3 = rect.right;
            rect2.right = i3;
            rect2.left = i3 - ((Number) osz.getFirst()).intValue();
        } else {
            int i4 = rect.left;
            rect2.left = i4;
            rect2.right = ((Number) osz.getFirst()).intValue() + i4;
        }
        if (companion.isContains(insets, i, 32)) {
            int i5 = rect.top;
            rect2.top = i5;
            rect2.bottom = ((Number) osz.getSecond()).intValue() + i5;
        } else if (companion.isContains(insets, i, 64)) {
            int height = ((rect.height() - ((Number) osz.getSecond()).intValue()) / 2) + rect.top;
            rect2.top = height;
            rect2.bottom = ((Number) osz.getSecond()).intValue() + height;
        } else if (companion.isContains(insets, i, 128)) {
            int i6 = rect.bottom;
            rect2.bottom = i6;
            rect2.top = i6 - ((Number) osz.getSecond()).intValue();
        } else {
            int i7 = rect.top;
            rect2.top = i7;
            rect2.bottom = ((Number) osz.getSecond()).intValue() + i7;
        }
        return rect2;
    }
}

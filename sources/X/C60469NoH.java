package X;

import X.C45621qg;
import X.C60469NoH;
import X.InterfaceC60473NoL;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.NoH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60469NoH extends C45621qg {
    public boolean LLFII;
    public BottomSheetBehavior<FrameLayout> LLFZ;
    public InterfaceC60473NoL LLI;

    public final BottomSheetBehavior<FrameLayout> getBehavior() {
        return this.LLFZ;
    }

    public final InterfaceC60473NoL getCallback() {
        return this.LLI;
    }

    public final boolean getHideable() {
        return this.LLFII;
    }

    public final void setBehavior(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
        o.LJIIIZ(bottomSheetBehavior, "<set-?>");
        this.LLFZ = bottomSheetBehavior;
    }

    public final void setCallback(InterfaceC60473NoL interfaceC60473NoL) {
        this.LLI = interfaceC60473NoL;
    }

    public final void setHideable(boolean z) {
        this.LLFII = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$behavior$1, com.google.android.material.bottomsheet.BottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout>] */
    public C60469NoH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLFII = true;
        ?? r1 = new BottomSheetBehavior<FrameLayout>() { // from class: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$behavior$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C06C
            public final boolean onLayoutChild(C45621qg parent, View child, int i) {
                InterfaceC60473NoL callback;
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(child, "child");
                if (getState() == 3 && (callback = C60469NoH.this.getCallback()) != null) {
                    callback.LIZIZ();
                }
                return super.onLayoutChild(parent, child, i);
            }
        };
        r1.setBottomSheetCallback(new C60471NoJ(this, r1));
        this.LLFII = true;
        r1.setPeekHeight(0);
        this.LLFZ = r1;
    }
}

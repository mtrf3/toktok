package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MMY extends FrameLayout {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    private final View getSkeletonView() {
        return (View) this.LJLILLLLZI.getValue();
    }

    public final void LIZ() {
        View skeletonView = getSkeletonView();
        if (skeletonView != null) {
            skeletonView.setVisibility(8);
        }
        this.LJLIL.setVisibility(0);
    }

    public final void LIZIZ() {
        View skeletonView = getSkeletonView();
        if (skeletonView != null) {
            skeletonView.setVisibility(0);
        }
        this.LJLIL.setVisibility(8);
    }

    public final View getContentView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMY(View contentView) {
        super(contentView.getContext(), null, 0);
        o.LJIIIZ(contentView, "contentView");
        new LinkedHashMap();
        this.LJLIL = contentView;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 28));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        addView(contentView);
        View skeletonView = getSkeletonView();
        if (skeletonView != null) {
            addView(skeletonView);
        }
    }
}

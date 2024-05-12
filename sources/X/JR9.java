package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.ILynxSearchList;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JR9 extends View {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    private final Rect getCurrentActiveArea() {
        return (Rect) this.LJLILLLLZI.getValue();
    }

    private final Paint getPaint() {
        return (Paint) this.LJLIL.getValue();
    }

    public final void LIZ(ILynxSearchList.ActiveArea activeArea) {
        getCurrentActiveArea().set(C63081OpJ.LJIJJLI(getContext(), activeArea.getX()), C63081OpJ.LJIJJLI(getContext(), activeArea.getY()), C63081OpJ.LJIJJLI(getContext(), activeArea.getWidth() + activeArea.getX()), C63081OpJ.LJIJJLI(getContext(), activeArea.getHeight() + activeArea.getY()));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = C63081OpJ.LJIJJLI(getContext(), activeArea.getHeight() + activeArea.getY());
    }

    public final void LIZIZ(ILynxSearchHorizontal.ActiveArea area) {
        o.LJIIIZ(area, "area");
        getCurrentActiveArea().set(C63081OpJ.LJIJJLI(getContext(), area.getX()), C63081OpJ.LJIJJLI(getContext(), area.getY()), C63081OpJ.LJIJJLI(getContext(), area.getWidth() + area.getX()), C63081OpJ.LJIJJLI(getContext(), area.getHeight() + area.getY()));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = C63081OpJ.LJIJJLI(getContext(), area.getHeight() + area.getY());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        getPaint().setColor(-65536);
        getPaint().setAlpha(127);
        canvas.save();
        if (C90193gN.LIZIZ(getContext())) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        canvas.drawRect(getCurrentActiveArea(), getPaint());
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JR9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(C33678DJq.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(JRA.LJLIL);
    }
}

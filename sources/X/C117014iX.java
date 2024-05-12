package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleMultiImageView$ImageCell;
import defpackage.a1;
import java.util.List;

/* renamed from: X.4iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117014iX extends SYL implements InterfaceC117044ia {
    public static int LLLFFI;
    public static final int LLLFZ;
    public List<? extends UrlModel> LLLFF;

    static {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(76));
        int LJIIJJI = (KL2.LJIIJJI(EF7.LIZIZ()) - LJJIIZ) - C7MY.LIZIZ(28);
        int i = LLLFFI;
        if (i > 0) {
            LJIIJJI = i;
        }
        LLLFZ = (LJIIJJI - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(8.0f))) * 4)) / 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117014iX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLF.LJZL(NoticeTemplateMiddleMultiImageView$ImageCell.class);
        LJII(new AbstractC030309z() { // from class: X.4iW
            public final int LJLIL = C278817o.LIZ(8.0f);
            public final int LJLILLLLZI = C278817o.LIZ(0.0f);

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                super.LJ(rect, view, recyclerView, c0ac);
                int LJJJJIZL = RecyclerView.LJJJJIZL(view);
                AbstractC029409q adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    int itemCount = adapter.getItemCount();
                    if (LJJJJIZL == 0) {
                        rect.left = this.LJLILLLLZI;
                        rect.right = this.LJLIL / 2;
                    } else if (LJJJJIZL == itemCount - 1) {
                        rect.left = this.LJLIL / 2;
                        rect.right = 0;
                    } else {
                        int i = this.LJLIL / 2;
                        rect.left = i;
                        rect.right = i;
                    }
                }
            }
        }, -1);
        setLayoutManager(new LinearLayoutManager(0, false));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (LLLFFI > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(LLLFZ, 1073741824);
        }
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > 0) {
            LLLFFI = getMeasuredWidth();
        }
    }
}

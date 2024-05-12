package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.76Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C76Y extends VW3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76Y(Context context) {
        super(context);
        a1.LJFF(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 1) {
            View childAt = getChildAt(0);
            if (childAt.getTag() instanceof String) {
                Object tag = childAt.getTag();
                o.LJII(tag, "null cannot be cast to non-null type kotlin.String");
                if (TextUtils.equals((String) tag, "comment_list_page")) {
                    int childCount = getChildCount();
                    for (int i5 = 1; i5 < childCount; i5++) {
                        View childAt2 = getChildAt(i5);
                        View childAt3 = getChildAt(i5 - 1);
                        if (childAt2.getLeft() < childAt3.getRight()) {
                            int left = childAt2.getLeft();
                            int right = childAt2.getRight();
                            int right2 = childAt3.getRight();
                            childAt2.layout(right2, childAt2.getTop(), childAt2.getMeasuredWidth() + right2, childAt2.getBottom());
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Comment ViewPager => child(");
                            C15890jp.LIZIZ(LIZ, i5, ") before fix: {", left, ", ");
                            LIZ.append(right);
                            LIZ.append("}, after fix: {");
                            LIZ.append(childAt2.getLeft());
                            LIZ.append(", ");
                            LIZ.append(childAt2.getRight());
                            LIZ.append('}');
                            C36922EeM.LIZLLL(6, "CommentLog", X1D.LIZIZ(LIZ));
                        }
                    }
                    return;
                }
            }
            C176186vm.LIZ("Comment ViewPager => child(0) is not CommentList");
        }
    }
}

package X;

import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS70S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85213Wb extends LinearLayout {
    public View LJLIL;
    public RecyclerView LJLILLLLZI;
    public FrameLayout LJLJI;

    public final RecyclerView getDraftSubmissionItemList() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("draftSubmissionItemList");
        throw null;
    }

    public final FrameLayout getExpandingListContainer() {
        FrameLayout frameLayout = this.LJLJI;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("expandingListContainer");
        throw null;
    }

    public final View getItemView() {
        View view = this.LJLIL;
        if (view != null) {
            return view;
        }
        o.LJIJI("itemView");
        throw null;
    }

    public final void LIZ(boolean z) {
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(400L);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new AUListenerS90S0100000_1(this, 17));
            valueAnimator.addListener(new IDAListenerS70S0100000_1(this, 7));
            valueAnimator.start();
            return;
        }
        getDraftSubmissionItemList().setVisibility(8);
        getExpandingListContainer().setVisibility(8);
    }

    public final void setDraftSubmissionItemList(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "<set-?>");
        this.LJLILLLLZI = recyclerView;
    }

    public final void setExpandingListContainer(FrameLayout frameLayout) {
        o.LJIIIZ(frameLayout, "<set-?>");
        this.LJLJI = frameLayout;
    }

    public final void setItemView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLIL = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85213Wb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        setVisibility(8);
        setOrientation(1);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()).cloneInContext(getContext()), R.layout.bdk, this, true);
        o.LJIIIIZZ(LLLLIILL, "from(context).cloneInCon…s_submission, this, true)");
        setItemView(LLLLIILL);
        View findViewById = findViewById(R.id.crz);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.effect…aft_submission_item_list)");
        setDraftSubmissionItemList((RecyclerView) findViewById);
        View findViewById2 = findViewById(R.id.cgm);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.draft_submission_list_container)");
        setExpandingListContainer((FrameLayout) findViewById2);
        RecyclerView draftSubmissionItemList = getDraftSubmissionItemList();
        getItemView().getContext();
        draftSubmissionItemList.setLayoutManager(new LinearLayoutManager(0, false));
        getDraftSubmissionItemList().setVisibility(8);
    }
}

package X;

import Y.IDTListenerS116S0100000_7;
import Y.IDrS46S0100000_7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42176Ggu extends FrameLayout {
    public static final double LJLJJLL;
    public static final double LJLJL;
    public final C42175Ggt LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJJI;
    public final RecyclerView LJLJJL;

    static {
        C62822Ol8 c62822Ol8 = C42186Gh4.LIZ;
        LJLJJLL = ((Number) c62822Ol8.getValue()).doubleValue();
        LJLJL = ((Number) c62822Ol8.getValue()).doubleValue();
    }

    private final C42175Ggt getAdapter() {
        AbstractC029409q adapter = this.LJLJJL.getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.image.ImageThumbnailContainer.ImageThumbnailAdapter");
        return (C42175Ggt) adapter;
    }

    public final int getCurrentCoverIndex() {
        return getAdapter().LJLILLLLZI;
    }

    public final void setCoverIndicator(int i) {
        C42175Ggt adapter = getAdapter();
        int i2 = adapter.LJLILLLLZI;
        if (i2 == i) {
            return;
        }
        adapter.LJLILLLLZI = i;
        adapter.notifyItemChanged(i);
        adapter.notifyItemChanged(i2);
    }

    public final void setOnChooseCoverBtnClickListener(View.OnClickListener coverChooseListener) {
        o.LJIIIZ(coverChooseListener, "coverChooseListener");
        C42175Ggt adapter = getAdapter();
        adapter.getClass();
        adapter.LJLJJL = coverChooseListener;
    }

    public final void setOnCoverUpdateListener(InterfaceC42182Gh0 coverUpdateListener) {
        o.LJIIIZ(coverUpdateListener, "coverUpdateListener");
        getAdapter().getClass();
    }

    public final void setOnItemClickListener(GSG clickListener) {
        o.LJIIIZ(clickListener, "clickListener");
        C42175Ggt adapter = getAdapter();
        adapter.getClass();
        adapter.LJLJI = clickListener;
    }

    public final void setOnItemSwapListener(InterfaceC42180Ggy swapListener) {
        o.LJIIIZ(swapListener, "swapListener");
        C42175Ggt adapter = getAdapter();
        adapter.getClass();
        adapter.LJLJJI = swapListener;
    }

    public final void setOnScrollEndListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLJJI = interfaceC88472Yns;
    }

    public final void setThumbnailData(List<GZU> data) {
        o.LJIIIZ(data, "data");
        C42175Ggt adapter = getAdapter();
        adapter.getClass();
        adapter.LJLIL = new ArrayList(data);
        adapter.notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42176Ggu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C42175Ggt c42175Ggt = new C42175Ggt();
        this.LJLIL = c42175Ggt;
        this.LJLJI = -1;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setId(R.id.ein);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.LJII(new C42183Gh1(context, this), -1);
        recyclerView.LJIIJJI(new IDrS46S0100000_7(this, 3));
        recyclerView.setOnTouchListener(new IDTListenerS116S0100000_7(this, 7));
        recyclerView.setAdapter(c42175Ggt);
        this.LJLJJL = recyclerView;
        C1C8 c1c8 = new C1C8(new C42177Ggv(context, this));
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -1, 16));
        if (e1.LIZ(31744, "photo_mode_change_order", true, false)) {
            c1c8.LJII(recyclerView);
        }
    }

    public final void LIZ(int i, GZU gzu) {
        C42175Ggt adapter = getAdapter();
        adapter.getClass();
        if (i < 0 || i > ((ArrayList) adapter.LJLIL).size()) {
            return;
        }
        ListProtector.set(adapter.LJLIL, i, gzu);
        adapter.notifyItemChanged(i);
    }
}

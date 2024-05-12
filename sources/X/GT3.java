package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GT3 extends FrameLayout {
    public final TuxTextView LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    private final C41878Gc6 getSkinToneAdapter() {
        return (C41878Gc6) this.LJLILLLLZI.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getSkinToneAdapter().LJLJJI = -1;
        getSkinToneAdapter().notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GT3(Context context) {
        super(context, null, 0);
        RecyclerView recyclerView;
        a1.LJFF(context, "context");
        this.LJLILLLLZI = C221108m2.LIZIZ(GT4.LJLIL);
        FrameLayout.inflate(context, R.layout.c6v, this);
        View findViewById = findViewById(R.id.i8w);
        if ((findViewById instanceof RecyclerView) && (recyclerView = (RecyclerView) findViewById) != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(6));
            recyclerView.setAdapter(getSkinToneAdapter());
            recyclerView.setHasFixedSize(true);
        }
        this.LJLIL = (TuxTextView) findViewById(R.id.i8z);
    }

    public final void LIZ(boolean z) {
        getSkinToneAdapter().LJLJJLL = z;
    }

    public final void setCategoryName(int i) {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        }
    }

    public final void LIZIZ(InterfaceC88472Yns clickMethod, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(clickMethod, "clickMethod");
        C41878Gc6 skinToneAdapter = getSkinToneAdapter();
        skinToneAdapter.getClass();
        ((ArrayList) skinToneAdapter.LJLJI).clear();
        ((ArrayList) skinToneAdapter.LJLJI).addAll(list);
        skinToneAdapter.notifyDataSetChanged();
        skinToneAdapter.LJLJJL = clickMethod;
    }
}

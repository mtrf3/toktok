package X;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.IDlS19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C71310Ryk extends FrameLayout {
    public final View LJLIL;
    public final C71307Ryh LJLILLLLZI;
    public boolean LJLJI;

    private final int getLayoutRes() {
        if (C46227ICh.LIZ()) {
            return R.layout.bw0;
        }
        return R.layout.bvz;
    }

    public final void setAvatarList(List<RTP> list) {
        if (list != null) {
            C71307Ryh c71307Ryh = this.LJLILLLLZI;
            c71307Ryh.getClass();
            c71307Ryh.LJLILLLLZI = list;
            c71307Ryh.notifyDataSetChanged();
        }
    }

    public final void setLoadingIndex(Integer num) {
        C71307Ryh c71307Ryh = this.LJLILLLLZI;
        Integer num2 = c71307Ryh.LJLJJL;
        if (num2 != null) {
            c71307Ryh.notifyItemChanged(num2.intValue());
        }
        c71307Ryh.LJLJJL = num;
        if (num != null) {
            c71307Ryh.notifyItemChanged(num.intValue());
        }
    }

    public final void setOnAvatarClickListener(InterfaceC88471Ynr<? super Integer, ? super RTP, C76800UCe> onAvatarClicked) {
        o.LJIIIZ(onAvatarClicked, "onAvatarClicked");
        this.LJLILLLLZI.LJLJI = onAvatarClicked;
    }

    public final void setPlusClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        C16880lQ.LJIIJ(new IDlS19S0200000_12(this, onClickListener, 3), this.LJLIL);
    }

    public final void setPlusEnabled(boolean z) {
        float f;
        this.LJLJI = z;
        View view = this.LJLIL;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        view.setAlpha(f);
    }

    public final void setSelectedIndex(Integer num) {
        C71307Ryh c71307Ryh = this.LJLILLLLZI;
        Integer num2 = c71307Ryh.LJLJJI;
        if (num2 != null) {
            c71307Ryh.notifyItemChanged(num2.intValue());
        }
        c71307Ryh.LJLJJI = num;
        if (num != null) {
            c71307Ryh.notifyItemChanged(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71310Ryk(ActivityC45651qj context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        C71307Ryh c71307Ryh = new C71307Ryh(C46227ICh.LIZ());
        this.LJLILLLLZI = c71307Ryh;
        FrameLayout.inflate(context, getLayoutRes(), this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(R.id.f_t);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_select)");
        this.LJLIL = findViewById;
        View findViewById2 = findViewById(R.id.fl9);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.layout_rv_face_matting)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        C29021By c29021By = new C29021By(getContext(), 0);
        Drawable LIZIZ = C04270Et.LIZIZ(getContext(), R.drawable.bsv);
        o.LJI(LIZIZ);
        c29021By.LJLIL = LIZIZ;
        recyclerView.LJII(c29021By, -1);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(c71307Ryh);
        setPlusEnabled(this.LJLJI);
    }
}

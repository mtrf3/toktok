package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class UDR extends RecyclerView.ViewHolder {
    public final ViewGroup LJLIL;
    public final W5G LJLILLLLZI;
    public final View LJLJI;
    public final FrameLayout LJLJJI;
    public final View LJLJJL;
    public final /* synthetic */ UDQ LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDR(UDQ udq, ViewGroup parent) {
        super(C28289B8j.LIZ(parent, R.layout.d7q, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = udq;
        this.LJLIL = parent;
        this.LJLILLLLZI = (W5G) this.itemView.findViewById(R.id.n4v);
        View findViewById = this.itemView.findViewById(R.id.c6g);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.delete_layout)");
        this.LJLJI = findViewById;
        this.LJLJJI = (FrameLayout) this.itemView.findViewById(R.id.j83);
        View findViewById2 = this.itemView.findViewById(R.id.c6e);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.delete_img)");
        View findViewById3 = this.itemView.findViewById(R.id.i21);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.preview_border_view)");
        this.LJLJJL = findViewById3;
        float LIZ = B9K.LIZ(parent.getContext(), 2.0f);
        int LIZIZ = C04330Ez.LIZIZ(parent.getContext(), R.color.cu);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(LIZIZ);
        gradientDrawable.setStroke(0, 0);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, LIZ, LIZ, 0.0f, 0.0f, LIZ, LIZ});
        if (C15380j0.LJIIZILJ()) {
            int LIZIZ2 = C04330Ez.LIZIZ(parent.getContext(), R.color.cu);
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(LIZIZ2);
            gradientDrawable.setStroke(0, 0);
            gradientDrawable.setCornerRadii(new float[]{LIZ, LIZ, 0.0f, 0.0f, LIZ, LIZ, 0.0f, 0.0f});
        }
        findViewById2.setBackground(gradientDrawable);
    }

    public final void L(LiveSubMediaModel liveSubMediaModel, UDR holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (liveSubMediaModel == null) {
            return;
        }
        int i2 = 8;
        if (this.LJLJJLL.LJLIL.size() <= 1) {
            this.LJLJI.setVisibility(8);
        }
        View view = this.LJLJJL;
        if (this.LJLJJLL.LJLJI == i) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }
}

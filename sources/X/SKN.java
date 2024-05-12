package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.VideoCount;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKN extends SKX {
    public final InterfaceC65784Pro<Boolean> LIZ;
    public final VideoCount LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    @Override // X.SKZ
    public final Class<SKN> LJFF() {
        return SKN.class;
    }

    @Override // X.SKX
    public final int LJII() {
        return R.layout.ahh;
    }

    @Override // X.SKZ
    public final boolean LJI() {
        return this.LIZ.invoke().booleanValue();
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        o.LJIIIZ(holder, "holder");
        if (!LJI()) {
            holder.itemView.setVisibility(8);
            return;
        }
        View view = holder.itemView;
        view.setVisibility(0);
        if (this.LIZIZ == null) {
            view.findViewById(R.id.ha9).setVisibility(8);
            view.findViewById(R.id.h9l).setVisibility(8);
            ((TextView) view.findViewById(R.id.title)).setText(view.getContext().getString(this.LIZJ));
            return;
        }
        view.findViewById(R.id.ha9).setVisibility(0);
        view.findViewById(R.id.h9l).setVisibility(0);
        TextView textView = (TextView) view.findViewById(R.id.ha_);
        Resources resources = view.getContext().getResources();
        int i = this.LIZLLL;
        int i2 = this.LIZIZ.onCount;
        textView.setText(resources.getQuantityString(i, i2, String.valueOf(i2)));
        TextView textView2 = (TextView) view.findViewById(R.id.h9m);
        Resources resources2 = view.getContext().getResources();
        int i3 = this.LJ;
        int i4 = this.LIZIZ.offCount;
        textView2.setText(resources2.getQuantityString(i3, i4, String.valueOf(i4)));
        C1DG.LJI(view, R.string.tkz, (TuxTextView) view.findViewById(R.id.title));
    }

    public SKN(InterfaceC65784Pro<Boolean> interfaceC65784Pro, VideoCount videoCount, int i, int i2, int i3) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = videoCount;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}

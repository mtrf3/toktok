package X;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MFm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56502MFm extends RecyclerView.ViewHolder implements InterfaceC176266vu {
    public final C62846OlW LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final AppCompatImageView LJLJJLL;
    public NewFaceStickerBean LJLJL;

    @Override // X.InterfaceC176266vu
    public final void onShowItem() {
        NewFaceStickerBean newFaceStickerBean = this.LJLJL;
        if (newFaceStickerBean != null) {
            String str = newFaceStickerBean.id;
            String LIZIZ = C178456zR.LIZIZ(1);
            C188727au LIZ = C178456zR.LIZ("prop", "collection_prop");
            LIZ.LJIIIZ("prop_id", str);
            FMX.LJIIL(LIZIZ, LIZ.LIZ);
        }
    }

    public C56502MFm(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.jd5);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.sd_cover)");
        this.LJLIL = (C62846OlW) findViewById;
        View findViewById2 = view.findViewById(R.id.mlb);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_sticker_name)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.m4v);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_designer)");
        this.LJLJI = (TextView) findViewById3;
        this.LJLJJI = (TextView) view.findViewById(R.id.m4y);
        View findViewById4 = view.findViewById(R.id.mpy);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_user_count)");
        this.LJLJJL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f9m);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_record)");
        this.LJLJJLL = (AppCompatImageView) findViewById5;
    }
}

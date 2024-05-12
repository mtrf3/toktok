package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T49 extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final C72790ShW LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final ImageView LJLJJL;
    public final FrameLayout LJLJJLL;
    public final View LJLJL;

    public T49(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f2v);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_face_matting_choose)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f2u);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_face_matting)");
        C72790ShW c72790ShW = (C72790ShW) findViewById2;
        this.LJLILLLLZI = c72790ShW;
        View findViewById3 = view.findViewById(R.id.m5v);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_duration)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.m8v);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_image_indicator)");
        this.LJLJJI = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.af4);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.backdrop)");
        this.LJLJJL = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.f2t);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_face_container)");
        this.LJLJJLL = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.f2s);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.iv_face_border)");
        this.LJLJL = findViewById7;
        c72790ShW.LJLLILLLL = true;
        c72790ShW.setRectFRadius(C74275TDb.LIZ(6.0f));
        c72790ShW.setClipStyle(1);
    }
}

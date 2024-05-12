package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WFa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81970WFa extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final TextView LJLILLLLZI;
    public final C164106cI LJLJI;
    public final TuxIconView LJLJJI;
    public final C29701Eo LJLJJL;
    public final SmartImageView LJLJJLL;

    public C81970WFa(WFU wfu, View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f51);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_icon)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.m8o);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_icon_desc)");
        TextView textView = (TextView) findViewById2;
        this.LJLILLLLZI = textView;
        View findViewById3 = view.findViewById(R.id.fbk);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_tool_cross)");
        C164106cI c164106cI = (C164106cI) findViewById3;
        this.LJLJI = c164106cI;
        View findViewById4 = view.findViewById(R.id.eu6);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.item_icon_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.f_u);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_selected)");
        this.LJLJJI = (TuxIconView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ga_);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.lottie_view)");
        this.LJLJJL = (C29701Eo) findViewById6;
        View findViewById7 = view.findViewById(R.id.f57);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.iv_icon_shadow)");
        this.LJLJJLL = (SmartImageView) findViewById7;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableFrontFlash()) {
            viewGroup.setClipToPadding(false);
            viewGroup.setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.d6, context);
            if (LJI != null) {
                textView.setShadowLayer(C74275TDb.LIZ(6.0f), 0.0f, 0.0f, LJI.intValue());
            }
        }
        c164106cI.setOnClickListener(new ViewOnClickListenerC13880ga(new C81971WFb(this, wfu)));
        C16880lQ.LJIIJ(new WFZ(this, wfu, view), view);
    }
}

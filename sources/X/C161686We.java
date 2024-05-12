package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6We, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161686We extends RecyclerView.ViewHolder {
    public RecommendEffectItem LJLIL;
    public final C72790ShW LJLILLLLZI;
    public final C164106cI LJLJI;
    public final ImageView LJLJJI;
    public final /* synthetic */ ViewOnClickListenerC161696Wf LJLJJL;

    public final void L() {
        this.LJLJI.setVisibility(0);
        C164106cI c164106cI = this.LJLJI;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d7);
        c110614Vt.LIZJ = C61328O5c.LIZJ(10);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        c164106cI.setBackground(c110614Vt.LIZ(context));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161686We(ViewOnClickListenerC161696Wf viewOnClickListenerC161696Wf, View view) {
        super(view);
        this.LJLJJL = viewOnClickListenerC161696Wf;
        C72790ShW c72790ShW = (C72790ShW) view.findViewById(R.id.ki1);
        c72790ShW.LJLLILLLL = true;
        c72790ShW.setRectFRadius(C32151Nz.LJIIZILJ(10));
        c72790ShW.setClipStyle(1);
        c72790ShW.getLayoutParams().width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(60));
        c72790ShW.getLayoutParams().height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(60));
        this.LJLILLLLZI = c72790ShW;
        this.LJLJI = (C164106cI) view.findViewById(R.id.kgl);
        this.LJLJJI = (ImageView) view.findViewById(R.id.crp);
    }
}

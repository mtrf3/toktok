package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MEq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56480MEq extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final SY4 LJLJJI;
    public final Context LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56480MEq(ActivityC45651qj context, View view) {
        super(view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(context, "context");
        this.LJLJJL = context;
        View findViewById = view.findViewById(R.id.jvj);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.share_your_first_video)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.jvk);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.share_your_first_video_doc)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bz6);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.create_video)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mv0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.upload_work)");
        this.LJLJJI = (SY4) findViewById4;
        C255199zv.LIZLLL = true;
    }
}

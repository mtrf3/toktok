package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XhZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85533XhZ extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final SmartAvatarImageView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final View LJLJJL;
    public final Context LJLJJLL;
    public final /* synthetic */ C85531XhX LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85533XhZ(C85531XhX c85531XhX, View view) {
        super(view);
        this.LJLJL = c85531XhX;
        this.LJLIL = view;
        this.LJLILLLLZI = (SmartAvatarImageView) view.findViewById(R.id.abh);
        this.LJLJI = (TextView) view.findViewById(R.id.h1d);
        this.LJLJJI = (TextView) view.findViewById(R.id.l8b);
        this.LJLJJL = view.findViewById(R.id.c65);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LJLJJLL = context;
    }
}

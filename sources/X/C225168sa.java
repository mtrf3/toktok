package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225168sa extends RecyclerView.ViewHolder {
    public static final int LJLJLLL = (int) KL2.LIZJ(C16880lQ.LLLLL(EF7.LIZIZ()), 32.0f);
    public final DonationFragment LJLIL;
    public final SmartAvatarImageView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final ImageView LJLJJLL;
    public final TextView LJLJL;
    public final TextView LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C225168sa(View view, DonationFragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = (SmartAvatarImageView) view.findViewById(R.id.abh);
        this.LJLJI = (TextView) view.findViewById(R.id.gvs);
        this.LJLJJI = (TextView) view.findViewById(R.id.desc);
        this.LJLJJL = (TextView) view.findViewById(R.id.l7k);
        this.LJLJJLL = (ImageView) view.findViewById(R.id.kbs);
        this.LJLJL = (TextView) view.findViewById(R.id.ldw);
        this.LJLJLJ = (TextView) view.findViewById(R.id.ldx);
    }
}

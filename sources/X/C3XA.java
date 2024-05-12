package X;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3XA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XA extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final C3B2 LJLILLLLZI;
    public final InterfaceC88471Ynr<IMUser, Integer, C76800UCe> LJLJI;
    public final SmartAvatarImageView LJLJJI;
    public final View LJLJJL;
    public final C119354mJ LJLJJLL;
    public final TuxTextView LJLJL;
    public LiveData<ActivityStatus> LJLJLJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C3XA(View view, C3B2 c3b2, InterfaceC88471Ynr<? super IMUser, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(view);
        this.LJLIL = view;
        this.LJLILLLLZI = c3b2;
        this.LJLJI = interfaceC88471Ynr;
        View findViewById = view.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        this.LJLJJI = (SmartAvatarImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.e2j);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.has_selected_fl)");
        this.LJLJJL = findViewById2;
        C119354mJ c119354mJ = (C119354mJ) view.findViewById(R.id.pq);
        c119354mJ.setStrokeColor(i);
        this.LJLJJLL = c119354mJ;
        View findViewById3 = view.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.name_tv)");
        this.LJLJL = (TuxTextView) findViewById3;
    }
}

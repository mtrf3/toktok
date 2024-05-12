package X;

import Y.ACListenerS32S0100000_12;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TKj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74465TKj extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final TDG LJLILLLLZI;
    public ObjectAnimator LJLJI;
    public FilterBean LJLJJI;
    public EnumC82260WQe LJLJJL;
    public final C74466TKk LJLJJLL;
    public final InterfaceC88471Ynr<FilterBean, EnumC82260WQe, C76800UCe> LJLJL;

    public final void L() {
        int i;
        ObjectAnimator objectAnimator = this.LJLJI;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ImageView ivDownload = this.LJLIL;
        o.LJIIIIZZ(ivDownload, "ivDownload");
        ivDownload.setRotation(0.0f);
        Integer valueOf = Integer.valueOf(this.LJLJJLL.LJFF);
        if (valueOf.intValue() != 0) {
            i = valueOf.intValue();
        } else {
            i = R.drawable.tf;
        }
        this.LJLIL.setImageResource(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74465TKj(View view, C74466TKk listViewConfigure, AqS194S0100000_12 aqS194S0100000_12) {
        super(view);
        o.LJIIIZ(listViewConfigure, "listViewConfigure");
        this.LJLJJLL = listViewConfigure;
        this.LJLJL = aqS194S0100000_12;
        this.LJLIL = (ImageView) view.findViewById(R.id.f2f);
        this.LJLILLLLZI = (TDG) view.findViewById(R.id.eu8);
        this.LJLJJL = EnumC82260WQe.FILTER_STATE_UNKNOWN;
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 180), view);
    }
}

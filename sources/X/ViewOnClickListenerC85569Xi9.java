package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xi9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC85569Xi9 implements View.OnClickListener {
    public final /* synthetic */ BaseAccountFlowFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public ViewOnClickListenerC85569Xi9(BaseAccountFlowFragment baseAccountFlowFragment, String str, boolean z) {
        this.LJLIL = baseAccountFlowFragment;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseAccountFlowFragment baseAccountFlowFragment = this.LJLIL;
        String str = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        C41424GNo c41424GNo = new C41424GNo(baseAccountFlowFragment.getContext());
        String string = baseAccountFlowFragment.getString(R.string.ido);
        o.LJIIIIZZ(string, "fragment.getString(R.string.mus_phone_num)");
        String string2 = baseAccountFlowFragment.getString(R.string.iba);
        o.LJIIIIZZ(string2, "fragment.getString(R.string.mus_email)");
        c41424GNo.LIZ(new String[]{string, string2}, new DialogInterfaceOnClickListenerC69091R9r(baseAccountFlowFragment, str, z));
        V1B.LJLJJL(c41424GNo.LIZ.LIZ());
    }
}

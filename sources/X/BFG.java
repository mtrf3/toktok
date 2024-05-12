package X;

import Y.ACListenerS24S0101000_5;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import tikcast.api.anchor.HostInfo;

/* loaded from: classes6.dex */
public final class BFG extends BFB {
    public C31597Caf LJLIL;
    public TextView LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public final Context LJLJL;
    public HostInfo LJLJLJ;
    public final InterfaceC28441BEf LJLJLLL;
    public final java.util.Set<Long> LJLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BFB
    public final <T> void LJJZZIII(T t) {
        User user;
        if (t instanceof HostInfo) {
            HostInfo hostInfo = (HostInfo) t;
            this.LJLJLJ = hostInfo;
            User user2 = hostInfo.userInfo;
            if (user2 == null) {
                return;
            }
            if (user2.getAvatarThumb() != null) {
                C15640jQ.LJIIIIZZ(this.LJLIL, this.LJLJLJ.userInfo.getAvatarThumb());
            } else {
                this.LJLIL.setImageResource(R.drawable.cuk);
            }
            TextView textView = this.LJLILLLLZI;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.LJLJI;
            if (view != null) {
                view.setVisibility(0);
            }
            TextView textView2 = this.LJLILLLLZI;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.LJLILLLLZI.setText(R.string.nsa);
                this.LJLILLLLZI.setBackground(C15380j0.LJI(R.drawable.cc5));
                this.LJLILLLLZI.setTextColor(C15380j0.LIZIZ(R.color.z3));
                C16880lQ.LJIJI(this.LJLILLLLZI, new ACListenerS24S0101000_5(1, this, 17));
            }
            TextView textView3 = this.LJLJJLL;
            if (textView3 != null) {
                textView3.setText(C05170If.LIZ(this.LJLJLJ.userInfo));
            }
            TextView textView4 = this.LJLJJL;
            if (textView4 != null) {
                textView4.setText(this.LJLJL.getString(R.string.ns9, new SimpleDateFormat("M/d/yyyy", Locale.getDefault()).format(Long.valueOf(this.LJLJLJ.addtimesecond * 1000))));
            }
            HostInfo hostInfo2 = this.LJLJLJ;
            if (hostInfo2 == null || (user = hostInfo2.userInfo) == null || this.LJLL.contains(Long.valueOf(user.getId()))) {
                return;
            }
            this.LJLL.add(Long.valueOf(hostInfo2.userInfo.getId()));
            BZI LIZ = C28787BRn.LIZ("livesdk_host_moderate_list_show");
            LIZ.LJIIZILJ();
            C30869C9p.LIZ(hostInfo2.addtimesecond, LIZ, "added_date");
        }
    }

    public BFG(View view, InterfaceC28441BEf interfaceC28441BEf, java.util.Set set) {
        super(view);
        this.LJLJL = view.getContext();
        this.LJLJLLL = interfaceC28441BEf;
        this.LJLL = set;
        this.LJLIL = (C31597Caf) view.findViewById(R.id.e44);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.b3r);
        this.LJLJI = view.findViewById(R.id.b3y);
        this.LJLJJI = view.findViewById(R.id.b40);
        this.LJLJJL = (TextView) view.findViewById(R.id.n0w);
        this.LJLJJLL = (TextView) view.findViewById(R.id.mzt);
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSayhiAnalyticsImpl;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4cY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113304cY extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLL = 0;
    public final SmartAvatarImageView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final C57446Mgc LJLJJI;
    public final TuxTextView LJLJJL;
    public Fragment LJLJJLL;
    public InterfaceC113344cc LJLJL;
    public C71897SJp LJLJLJ;
    public RecUser LJLJLLL;

    public static OSZ L() {
        if (!C3TE.LIZIZ()) {
            return null;
        }
        return new OSZ(41, new OSZ(51, Integer.valueOf(R.attr.dt)));
    }

    public C113304cY(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatar)");
        this.LJLIL = (SmartAvatarImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.mzt);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.user_name)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.m2v);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_content)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.gvx);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.name_append_follow_text)");
        this.LJLJJI = (C57446Mgc) findViewById4;
        View findViewById5 = view.findViewById(R.id.iuh);
        ((TextView) findViewById5).setText("👋");
        o.LJIIIIZZ(findViewById5, "findViewById<TuxTextView…AY_HI_EMOJI\n            }");
        this.LJLJJL = (TuxTextView) findViewById5;
    }

    public final void M(String str, String str2) {
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "guide_dm"));
        if (o.LJ(str2, "show")) {
            IMSayhiAnalyticsImpl iMSayhiAnalyticsImpl = IMSayhiAnalyticsImpl.LIZ;
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            iMSayhiAnalyticsImpl.LIZ(str, LJJLIIIIJ, C57434MgQ.LIZIZ(context), false);
            return;
        }
        if (!o.LJ(str2, "click")) {
            return;
        }
        IMSayhiAnalyticsImpl.LIZ.LIZIZ(str, LJJLIIIIJ);
    }
}

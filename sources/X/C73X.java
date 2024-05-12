package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.73X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73X extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final InterfaceC1797373p LJLIL;
    public final SmartAvatarImageView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final C187747Yk LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final C7BF LJLJL;
    public final C1795973b LJLJLJ;
    public final C198757r5 LJLJLLL;
    public final int LJLL;
    public User LJLLI;
    public DataCenter LJLLILLLL;
    public C1796773j LJLLJ;
    public boolean LJLLL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        InterfaceC1797373p interfaceC1797373p;
        String str;
        String str2 = null;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if ((valueOf.intValue() != R.id.abh && valueOf.intValue() != R.id.title) || C6ZT.LIZ(view)) {
            return;
        }
        User user = this.LJLLI;
        if (user != null) {
            str2 = user.getUid();
        }
        if (TextUtils.isEmpty(str2) || (interfaceC1797373p = this.LJLIL) == null) {
            return;
        }
        User user2 = this.LJLLI;
        if (view.getId() == R.id.abh) {
            str = "click_head";
        } else {
            str = "click_name";
        }
        interfaceC1797373p.LLZZLLIL(this.LJLLJ, user2, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73X(View view, InterfaceC1797373p interfaceC1797373p) {
        super(view);
        Integer LJI;
        o.LJIIIZ(view, "view");
        this.LJLIL = interfaceC1797373p;
        Context mContext = view.getContext();
        View findViewById = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.avatar)");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById;
        this.LJLILLLLZI = smartAvatarImageView;
        View findViewById2 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.title)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.LJLJI = tuxTextView;
        View findViewById3 = view.findViewById(R.id.bk3);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.comment_desc)");
        this.LJLJJI = (C187747Yk) findViewById3;
        View findViewById4 = view.findViewById(R.id.l8c);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.timestamp_behind_title)");
        this.LJLJJL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.blr);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.comment_split)");
        this.LJLJJLL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bm6);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.comment_style)");
        TuxTextView tuxTextView2 = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.l0r);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.tagged_people_view)");
        this.LJLJL = (C7BF) findViewById7;
        View findViewById8 = view.findViewById(R.id.gp4);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.multi_anchor_view)");
        this.LJLJLJ = (C1795973b) findViewById8;
        this.LJLJLLL = (C198757r5) view.findViewById(R.id.qs);
        this.LJLL = (int) KL2.LIZJ(mContext, 32.0f);
        V8L v8l = smartAvatarImageView.getHierarchy().LIZJ;
        if (v8l != null) {
            v8l.LIZLLL(C17N.LJIILL(0.5d));
            o.LJIIIIZZ(mContext, "mContext");
            v8l.LJFF = C78886Uxe.LJJIFFI(R.attr.dx, R.color.bw, mContext);
        }
        C16880lQ.LJJJJL(smartAvatarImageView, this);
        C16880lQ.LJJJJI(tuxTextView, this);
        if ((((Number) C182497Ef.LIZ.getValue()).intValue() & 16) == 16) {
            Context context = tuxTextView2.getContext();
            if (context != null && (LJI = C79045V0n.LJI(R.attr.eh, context)) != null) {
                tuxTextView2.setTextColor(LJI.intValue());
            }
            if (C1803676a.LIZ()) {
                C74J.LIZ(tuxTextView2);
            } else {
                tuxTextView2.setTuxFont(62);
            }
        }
        C88463da c88463da = C88463da.LIZ;
        C88463da.LIZJ(c88463da, smartAvatarImageView, EnumC1796673i.AVATAR, 0.0f, 12);
        C88463da.LIZJ(c88463da, tuxTextView, EnumC1796673i.USERNAME, 0.0f, 12);
    }
}

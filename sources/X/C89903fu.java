package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS25S0400000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89903fu extends C89843fo<IMUser> {
    public final View LJLIL;
    public final C89673fX LJLILLLLZI;
    public final TextView LJLJI;
    public final AP9 LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final TuxIconView LJLJL;
    public final /* synthetic */ C89673fX LJLJLJ;

    @Override // X.C89843fo
    public final void M() {
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [T, X.3fy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, X.3fy] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, X.3fy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [T, X.3fy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, X.3fy] */
    @Override // X.C89843fo
    public final void bind(IMUser iMUser, int i) {
        IMUser user = iMUser;
        o.LJIIIZ(user, "user");
        View view = this.itemView;
        view.setBackground(C89953fz.LIZ(view.getContext()));
        boolean z = false;
        this.LJLJI.setVisibility(0);
        C90173gL.LJII(user, this.LJLJJL, this.LJLJJLL);
        C68322mC c68322mC = new C68322mC();
        ?? r7 = EnumC89943fy.Recent;
        c68322mC.element = r7;
        C89863fq c89863fq = this.LJLILLLLZI.LJLJI;
        if (c89863fq != null) {
            int size = c89863fq.LIZJ.size() + c89863fq.LIZIZ.size() + c89863fq.LIZ.size();
            int size2 = c89863fq.LIZ.size();
            int size3 = c89863fq.LIZIZ.size() + c89863fq.LIZ.size();
            if (i >= size2 && (!c89863fq.LIZIZ.isEmpty()) && i < size3) {
                c68322mC.element = r7;
            } else if (i >= size3 && (!c89863fq.LIZJ.isEmpty()) && i < size) {
                c68322mC.element = EnumC89943fy.Friends;
            } else if (i >= size && (!c89863fq.LIZLLL.isEmpty())) {
                c68322mC.element = EnumC89943fy.Following;
            }
            if (i == 0 && (!c89863fq.LIZ.isEmpty())) {
                this.LJLJI.setVisibility(8);
            } else if (i == size2 && (!c89863fq.LIZIZ.isEmpty())) {
                this.LJLJI.setText(R.string.h8e);
            } else if (i == size3 && (!c89863fq.LIZJ.isEmpty())) {
                this.LJLJI.setText(R.string.gnr);
                c68322mC.element = EnumC89943fy.Friends;
            } else if (i == size && (!c89863fq.LIZLLL.isEmpty())) {
                this.LJLJI.setText(this.itemView.getContext().getString(R.string.pow));
                c68322mC.element = EnumC89943fy.Following;
            } else {
                this.LJLJI.setVisibility(8);
            }
        }
        if (!o.LJ(user.isUserEnabledQAInvite(), Boolean.FALSE)) {
            this.LJLIL.findViewById(R.id.myr).setAlpha(1.0f);
            C16880lQ.LJIILJJIL((FrameLayout) this.LJLIL.findViewById(R.id.myr), new ACListenerS25S0400000_1(this, this.LJLJLJ, user, c68322mC, i, 0));
        } else {
            this.LJLIL.findViewById(R.id.myr).setAlpha(0.34f);
            C16880lQ.LJIILJJIL((FrameLayout) this.LJLIL.findViewById(R.id.myr), new ACListenerS21S0100000_1(this, 182));
        }
        User LIZ = C90173gL.LIZ(user);
        this.LJLJJI.setUserData(new UserVerify(LIZ.getAvatarThumb(), LIZ.getCustomVerify(), LIZ.getEnterpriseVerifyReason(), Integer.valueOf(LIZ.getVerificationType())));
        AP9 avatar = this.LJLJJI;
        Context context = this.itemView.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TextView textView = this.LJLJJL;
        o.LJIIIZ(avatar, "avatar");
        avatar.LIZ();
        AJ9.LJ(context, customVerify, enterpriseVerifyReason, textView);
        this.LJLJL.setImageResource(R.drawable.c05);
        TuxIconView tuxIconView = this.LJLJL;
        if (this.LJLJLJ.LJLIL.LJ(user) != null) {
            z = true;
        }
        tuxIconView.setSelected(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89903fu(C89673fX c89673fX, View view, C89673fX adapter) {
        super(view);
        o.LJIIIZ(adapter, "adapter");
        this.LJLJLJ = c89673fX;
        this.LJLIL = view;
        this.LJLILLLLZI = adapter;
        View findViewById = view.findViewById(R.id.jjs);
        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.sectionLabel)");
        this.LJLJI = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById2, "container.findViewById(R.id.avatar)");
        this.LJLJJI = (AP9) findViewById2;
        View findViewById3 = view.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById3, "container.findViewById(R.id.name)");
        this.LJLJJL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById4, "container.findViewById(R.id.desc)");
        this.LJLJJLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.b_b);
        o.LJIIIIZZ(findViewById5, "container.findViewById(R.id.checkImage)");
        this.LJLJL = (TuxIconView) findViewById5;
    }
}

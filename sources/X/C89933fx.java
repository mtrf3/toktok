package X;

import Y.ACListenerS16S0301000_1;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89933fx extends C89843fo<IMUser> {
    public final View LJLIL;
    public final C90083gC LJLILLLLZI;
    public final TextView LJLJI;
    public final AP9 LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final TuxIconView LJLJL;
    public final /* synthetic */ C90083gC LJLJLJ;

    @Override // X.C89843fo
    public final void M() {
    }

    public final void N(int i, IMUser iMUser) {
        String LJ;
        String LJI = C90173gL.LJI(iMUser);
        if (C85990Xow.LJIIIZ()) {
            LJ = C90173gL.LIZLLL(iMUser);
        } else {
            LJ = C90173gL.LJ(iMUser);
        }
        this.LJLJJL.setText(LJI);
        TextView textView = this.LJLJJLL;
        boolean z = false;
        textView.setVisibility(0);
        textView.setText(LJ);
        if (TextUtils.isEmpty(textView.getText())) {
            textView.setVisibility(8);
        }
        View view = this.itemView;
        view.setBackground(C89953fz.LIZ(view.getContext()));
        User LIZ = C90173gL.LIZ(iMUser);
        this.LJLJJI.setUserData(new UserVerify(LIZ.getAvatarThumb(), LIZ.getCustomVerify(), LIZ.getEnterpriseVerifyReason(), Integer.valueOf(LIZ.getVerificationType())));
        AP9 avatar = this.LJLJJI;
        Context context = this.itemView.getContext();
        String customVerify = LIZ.getCustomVerify();
        String enterpriseVerifyReason = LIZ.getEnterpriseVerifyReason();
        TextView textView2 = this.LJLJJL;
        o.LJIIIZ(avatar, "avatar");
        avatar.LIZ();
        AJ9.LJ(context, customVerify, enterpriseVerifyReason, textView2);
        this.LJLJL.setImageResource(R.drawable.c05);
        TuxIconView tuxIconView = this.LJLJL;
        if (this.LJLJLJ.LJLIL.LJ(iMUser) != null) {
            z = true;
        }
        tuxIconView.setSelected(z);
        if (!o.LJ(iMUser.isUserEnabledQAInvite(), Boolean.FALSE)) {
            this.LJLIL.findViewById(R.id.myr).setAlpha(1.0f);
            C16880lQ.LJIILJJIL((FrameLayout) this.LJLIL.findViewById(R.id.myr), new ACListenerS16S0301000_1(i, this, iMUser, this.LJLJLJ, 1));
        } else {
            this.LJLIL.findViewById(R.id.myr).setAlpha(0.34f);
            C16880lQ.LJIILJJIL((FrameLayout) this.LJLIL.findViewById(R.id.myr), new ACListenerS21S0100000_1(this, 183));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89933fx(C90083gC c90083gC, View view, C90083gC adapter) {
        super(view);
        o.LJIIIZ(adapter, "adapter");
        this.LJLJLJ = c90083gC;
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

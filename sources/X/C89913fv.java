package X;

import Y.ACListenerS19S0201000_1;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89913fv extends C89843fo<IMUser> {
    public final View LJLIL;
    public final C85513Xf LJLILLLLZI;
    public final List<IMUser> LJLJI;
    public final AP9 LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final C56969MXl LJLJL;

    @Override // X.C89843fo
    public final void M() {
    }

    @Override // X.C89843fo
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void bind(int i, IMUser user) {
        o.LJIIIZ(user, "user");
        View view = this.itemView;
        view.setBackground(C89953fz.LIZ(view.getContext()));
        int i2 = 0;
        this.itemView.findViewById(R.id.aw_).setVisibility(0);
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
        C90173gL.LJII(user, this.LJLJJL, this.LJLJJLL);
        String uid = user.getUid();
        HG3.LJIIL();
        if (TextUtils.equals(uid, HG3.LJLJL.LJFF().getCurUserId())) {
            this.LJLJL.setVisibility(8);
        } else {
            this.LJLJL.setVisibility(0);
            C56969MXl c56969MXl = this.LJLJL;
            int followStatus = user.getFollowStatus();
            if (user.getFollowerStatus() == 1) {
                i2 = 1;
            }
            c56969MXl.LJJI(followStatus, i2);
        }
        this.LJLJL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS19S0201000_1(this, user, i, 7)));
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(user, this, 52), this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89913fv(View view, C85513Xf adapter, List userList) {
        super(view);
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(userList, "userList");
        this.LJLIL = view;
        this.LJLILLLLZI = adapter;
        this.LJLJI = userList;
        View findViewById = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.avatar)");
        this.LJLJJI = (AP9) findViewById;
        View findViewById2 = view.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById2, "container.findViewById(R.id.name)");
        this.LJLJJL = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById3, "container.findViewById(R.id.desc)");
        this.LJLJJLL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.aw_);
        o.LJIIIIZZ(findViewById4, "container.findViewById(R.id.btn_follow)");
        this.LJLJL = (C56969MXl) findViewById4;
    }
}

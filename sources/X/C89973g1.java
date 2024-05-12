package X;

import Y.ACListenerS36S0200000_1;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89973g1 {
    public final Context LIZ;
    public final View LIZIZ;
    public User LIZLLL;
    public C99033ud LJ;
    public RelationButton LJII;
    public TuxTextView LJIIIIZZ;
    public boolean LJIIIZ;
    public final C64962gm LIZJ = C48841JEv.LIZ(C36636EZk.LIZ);
    public final AObserverS69S0100000_1 LJFF = new AObserverS69S0100000_1(this, 121);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C89993g3.LJLIL);

    public final void LIZ(User user) {
        if (user != null && user.getFollowStatus() != -1) {
            RelationButton relationButton = this.LJII;
            if (relationButton != null) {
                C226668v0 c226668v0 = new C226668v0();
                c226668v0.LIZ = user;
                relationButton.LJJJJJL(c226668v0.LIZ());
                RelationButton relationButton2 = this.LJII;
                if (relationButton2 != null) {
                    C17N.LJJLIIIJJI(relationButton2);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                } else {
                    o.LJIJI("relationBtn");
                    throw null;
                }
            } else {
                o.LJIJI("relationBtn");
                throw null;
            }
        }
        RelationButton relationButton3 = this.LJII;
        if (relationButton3 != null) {
            C17N.LJJIIJZLJL(relationButton3);
        } else {
            o.LJIJI("relationBtn");
            throw null;
        }
    }

    public final void LIZIZ(User user) {
        if (user.getBlockStatus() == 1 || user.getBlockStatus() == 4) {
            TuxTextView tuxTextView = this.LJIIIIZZ;
            if (tuxTextView != null) {
                tuxTextView.setText(R.string.qel);
                return;
            } else {
                o.LJIJI("tvFollowerCount");
                throw null;
            }
        }
        int followerCount = user.getFollowerCount();
        String LJJIIJ = C77123UOp.LJJIIJ(followerCount);
        TuxTextView tuxTextView2 = this.LJIIIIZZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.LIZ.getResources().getQuantityString(R.plurals.sl, followerCount, LJJIIJ));
        } else {
            o.LJIJI("tvFollowerCount");
            throw null;
        }
    }

    public final void LIZJ(User user) {
        List<String> urlList;
        this.LIZLLL = user;
        View view = this.LIZIZ;
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(user, this, 57), view);
        C71799SFv ivAvatar = (C71799SFv) view.findViewById(R.id.evs);
        TextView textView = (TextView) view.findViewById(R.id.lww);
        TextView textView2 = (TextView) view.findViewById(R.id.lyh);
        View findViewById = view.findViewById(R.id.iu_);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.relationBtn)");
        this.LJII = (RelationButton) findViewById;
        View findViewById2 = view.findViewById(R.id.lwi);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tvFollowerCount)");
        this.LJIIIIZZ = (TuxTextView) findViewById2;
        textView.setText(user.getNickname());
        AJ9.LJ(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), textView);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        LIZ.append(user.getUniqueId());
        textView2.setText(X1D.LIZIZ(LIZ));
        UrlModel avatarThumb = user.getAvatarThumb();
        if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null) {
            o.LJIIIIZZ(ivAvatar, "ivAvatar");
            C71799SFv.LJIIJ(ivAvatar, new C62562cu(urlList), null, false, null, 110);
        }
        LIZIZ(user);
        XKX.LIZLLL(this.LIZJ, C36636EZk.LIZ, null, new AnonymousClass345(this, null), 2);
    }

    public C89973g1(Context context, View view) {
        this.LIZ = context;
        this.LIZIZ = view;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = C79045V0n.LJ(R.attr.cr, context);
        c110614Vt.LIZJ = C61328O5c.LIZJ(6);
        view.setBackground(c110614Vt.LIZ(context));
    }
}

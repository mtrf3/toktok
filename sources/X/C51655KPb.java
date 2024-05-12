package X;

import Y.ACListenerS39S0200000_4;
import Y.ARunnableS27S0200000_8;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KPb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51655KPb implements InterfaceC242099en {
    public View LJLIL;
    public Context LJLILLLLZI;
    public View LJLJI;
    public C71799SFv LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public RelationButton LJLJL;
    public Aweme LJLJLJ;
    public float LJLJLLL;

    public final void LIZIZ() {
        View view = this.LJLIL;
        if (view != null) {
            view.setAlpha(this.LJLJLLL);
            View view2 = this.LJLIL;
            if (view2 != null) {
                int i = 0;
                if (this.LJLJLLL == 0.0f) {
                    i = 8;
                }
                view2.setVisibility(i);
                return;
            }
            o.LJIJI("itemView");
            throw null;
        }
        o.LJIJI("itemView");
        throw null;
    }

    @Override // X.InterfaceC242099en
    public final void LLLZL(float f) {
        this.LJLJLLL = C78939UyV.LJIL(f);
        LIZIZ();
    }

    @Override // X.InterfaceC242099en
    public final void M0(Aweme aweme) {
        String nickname;
        this.LJLJLJ = aweme;
        LIZIZ();
        User author = aweme.getAuthor();
        if (author != null) {
            C71799SFv c71799SFv = this.LJLJJI;
            if (c71799SFv != null) {
                C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(author.getAvatarThumb()), null, false, null, 126);
                TuxTextView tuxTextView = this.LJLJJL;
                if (tuxTextView != null) {
                    if (AV1.LJIJJLI(author)) {
                        nickname = author.getUniqueId();
                    } else {
                        nickname = author.getNickname();
                    }
                    tuxTextView.setText(nickname);
                    String LJJIIJ = C77123UOp.LJJIIJ(author.getFollowerCount());
                    TuxTextView tuxTextView2 = this.LJLJJLL;
                    if (tuxTextView2 != null) {
                        Context context = this.LJLILLLLZI;
                        if (context != null) {
                            tuxTextView2.setText(context.getResources().getQuantityString(R.plurals.sl, author.getFollowerCount(), LJJIIJ));
                        } else {
                            o.LJIJI("context");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tvFollowCount");
                        throw null;
                    }
                } else {
                    o.LJIJI("tvUsername");
                    throw null;
                }
            } else {
                o.LJIJI("ivAvatar");
                throw null;
            }
        }
        User author2 = aweme.getAuthor();
        if (author2 == null) {
            return;
        }
        RelationButton relationButton = this.LJLJL;
        if (relationButton != null) {
            C226668v0 c226668v0 = new C226668v0();
            c226668v0.LIZJ(EnumC57853MnB.TUX_SEMI_TRANSPARENT);
            c226668v0.LIZ = author2;
            c226668v0.LIZIZ = true;
            relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
            return;
        }
        o.LJIJI("btnRelation");
        throw null;
    }

    public final void LIZ(View view, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(view, "view");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LJLILLLLZI = context;
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.bdq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.c…arch_ds_navigate_profile)");
        this.LJLJI = findViewById;
        View findViewById2 = view.findViewById(R.id.f_i);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.i…ds_filter_content_avatar)");
        this.LJLJJI = (C71799SFv) findViewById2;
        View findViewById3 = view.findViewById(R.id.miv);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.t…_filter_content_username)");
        this.LJLJJL = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.miu);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.t…r_content_followers_info)");
        this.LJLJJLL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ayw);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.b…_filter_content_relation)");
        this.LJLJL = (RelationButton) findViewById5;
        View view2 = this.LJLJI;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, interfaceC88472Yns, 3), view2);
            if (this.LJLJL != null) {
                View findViewById6 = view.findViewById(R.id.ddd);
                if (findViewById6 != null) {
                    findViewById6.post(new ARunnableS27S0200000_8(this, findViewById6, 8));
                    return;
                }
                return;
            }
            o.LJIJI("btnRelation");
            throw null;
        }
        o.LJIJI("navigateProfile");
        throw null;
    }
}

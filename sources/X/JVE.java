package X;

import Y.AObserverS76S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JVE extends RecyclerView.ViewHolder implements View.OnClickListener {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public final Context LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public C57127MbT LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public JON LJLJJLL;
    public TuxTextView LJLJL;
    public TopVideoHolderVM LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public Comment LJLL;
    public int LJLLI;
    public JQA LJLLILLLL;
    public AwemeRawAd LJLLJ;
    public final C62822Ol8 LJLLL;
    public final AObserverS76S0100000_8 LJLLLL;

    public JVE(View view) {
        super(view);
        this.LJLIL = view.getContext();
        Activity LIZIZ = C27740Aue.LIZIZ(view);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLILLLLZI = (ActivityC45651qj) LIZIZ;
        this.LJLLI = -1;
        this.LJLLL = C221108m2.LIZIZ(JVG.LJLIL);
        this.LJLLLL = new AObserverS76S0100000_8(this, 111);
    }

    public final void L(JVF jvf) {
        EnumC48916JHs enumC48916JHs;
        Comment comment = jvf.LIZ;
        if (comment == null) {
            return;
        }
        if (comment.isUserDigged()) {
            enumC48916JHs = EnumC48916JHs.ON;
        } else {
            enumC48916JHs = EnumC48916JHs.OFF;
        }
        JON jon = this.LJLJJLL;
        if (jon != null) {
            jon.LIZ(enumC48916JHs, jvf.LIZIZ);
            TuxTextView tuxTextView = this.LJLJL;
            if (tuxTextView != null) {
                tuxTextView.setText(C77123UOp.LJJIIJ(comment.getDiggCount()));
                return;
            } else {
                o.LJIJI("likeCountText");
                throw null;
            }
        }
        o.LJIJI("likeIcon");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Comment comment;
        String str8;
        User user;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != R.id.lek && num.intValue() != R.id.lel)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.LJLJLJ != null) {
                Context context = this.LJLIL;
                o.LJIIIIZZ(context, "context");
                Comment comment2 = this.LJLL;
                if (comment2 != null) {
                    user = comment2.getUser();
                } else {
                    user = null;
                }
                TopVideoHolderVM.hv0(context, user, null);
                return;
            }
            o.LJIJI("vm");
            throw null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() != R.id.lei && num.intValue() != R.id.leh) {
            return;
        }
        Comment comment3 = this.LJLL;
        if (comment3 != null && comment3.isUserDigged()) {
            str = "cancel_like_comment";
        } else {
            str = "like_comment";
        }
        Comment comment4 = this.LJLL;
        if (comment4 != null && comment4.isUserDigged()) {
            str2 = "like_cancel";
        } else {
            str2 = "like";
        }
        C188727au c188727au = new C188727au();
        JQA jqa = this.LJLLILLLL;
        if (jqa != null) {
            str3 = jqa.LJII;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("search_id", str3);
        JQA jqa2 = this.LJLLILLLL;
        if (jqa2 != null) {
            str4 = jqa2.LJFF;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_from", str4);
        c188727au.LJIIIZ("enter_method", "click_comment_icon");
        Comment comment5 = this.LJLL;
        if (comment5 != null) {
            str5 = comment5.getAwemeId();
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("group_id", str5);
        JQA jqa3 = this.LJLLILLLL;
        if (jqa3 != null) {
            str6 = jqa3.LJ;
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("search_keyword", str6);
        JQA jqa4 = this.LJLLILLLL;
        if (jqa4 != null) {
            str7 = jqa4.LIZJ;
        } else {
            str7 = null;
        }
        c188727au.LJIIIZ("search_type", str7);
        c188727au.LIZLLL(this.LJLLI, "rank");
        c188727au.LJIIIZ("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL(str, c188727au.LIZ);
        ((NIW) this.LJLLL.getValue()).LJIIJ(this.LJLLJ, str2);
        TopVideoHolderVM topVideoHolderVM = this.LJLJLJ;
        if (topVideoHolderVM != null) {
            JVF value = topVideoHolderVM.LJLJL.getValue();
            if (value == null || (comment = value.LIZ) == null) {
                return;
            }
            CommentService iv0 = topVideoHolderVM.iv0();
            Aweme aweme = topVideoHolderVM.LJLZ;
            if (aweme != null) {
                str8 = aweme.getAuthorUid();
            } else {
                str8 = null;
            }
            iv0.LJIIL(comment, str8);
            topVideoHolderVM.LJLJL.postValue(new JVF(comment, true));
            XKX.LIZLLL(ViewModelKt.getViewModelScope(topVideoHolderVM), C78613UtF.LIZJ, null, new C67772lJ(topVideoHolderVM, comment, null), 2);
            return;
        }
        o.LJIJI("vm");
        throw null;
    }
}

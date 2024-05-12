package X;

import Y.IDLListenerS64S0200000_14;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VyL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81477VyL extends LinearLayout {
    public Context LJLIL;
    public View LJLILLLLZI;
    public CommentVideoModel LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    private final int getMReplyTextId() {
        return R.string.q28;
    }

    private final OPX getAvatarView() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-avatarView>(...)");
        return (OPX) value;
    }

    private final TuxTextView getCommentTextView() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-commentTextView>(...)");
        return (TuxTextView) value;
    }

    private final TuxTextView getRepliedTextView() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-repliedTextView>(...)");
        return (TuxTextView) value;
    }

    public final View getRoot() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            return view;
        }
        o.LJIJI("root");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81477VyL(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 492));
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 493));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 494));
        this.LJLIL = context;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.wl, this, true);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…ew_for_panel, this, true)");
        this.LJLILLLLZI = LLLLIILL;
    }

    private final void setAuthorName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getRepliedTextView().setText(getContext().getResources().getString(getMReplyTextId(), str));
    }

    private final void setAvatarImage(UrlModel urlModel) {
        if (urlModel == null) {
            return;
        }
        C78764Uvg.LJFF(getAvatarView(), urlModel);
    }

    private final void setCommentMsg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.LJLIL;
        if (context != null) {
            if (C173636rf.LIZIZ(context)) {
                getCommentTextView().setGravity(5);
            }
            getCommentTextView().setText(str);
            return;
        }
        o.LJIJI("mContext");
        throw null;
    }

    public final void setCommentStickerData(CommentVideoModel commentVideoModel) {
        UrlModel urlModel;
        String str;
        this.LJLJI = commentVideoModel;
        String str2 = null;
        if (commentVideoModel != null) {
            urlModel = commentVideoModel.getUserAvatar();
        } else {
            urlModel = null;
        }
        setAvatarImage(urlModel);
        CommentVideoModel commentVideoModel2 = this.LJLJI;
        if (commentVideoModel2 != null) {
            str = commentVideoModel2.getCommentMsg();
        } else {
            str = null;
        }
        setCommentMsg(str);
        CommentVideoModel commentVideoModel3 = this.LJLJI;
        if (commentVideoModel3 != null) {
            str2 = commentVideoModel3.getUserName();
        }
        setAuthorName(str2);
    }

    public final void setUpdateTopMarginListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS64S0200000_14(this, listener, 3));
    }
}

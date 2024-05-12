package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6CI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CI extends AbstractC156406Bw<User> {
    public C6C5 LJLLLL;
    public TextView LJLLLLLL;

    @Override // X.AbstractC156406Bw
    public int getLayoutResId() {
        return R.layout.bkt;
    }

    @Override // X.AbstractC156406Bw
    public final void LJIIIIZZ() {
        C6C5 c6c5 = this.LJLLLL;
        if (c6c5 != null) {
            c6c5.setHint(getContext().getResources().getString(R.string.e3k));
        } else {
            o.LJIJI("editText");
            throw null;
        }
    }

    @Override // X.AbstractC156406Bw
    public final C6C5 LJ() {
        View findViewById = findViewById(R.id.d06);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ev_lay…ntion_sticker_input_view)");
        C6C5 c6c5 = (C6C5) findViewById;
        this.LJLLLL = c6c5;
        return c6c5;
    }

    @Override // X.AbstractC156406Bw
    public final TextView LJFF() {
        View findViewById = findViewById(R.id.m_k);
        o.LJIIIIZZ(findViewById, "findViewById<TextView>(R…out_mention_sticker_icon)");
        TextView textView = (TextView) findViewById;
        this.LJLLLLLL = textView;
        textView.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "mention_and_hashtag.ttf"));
        TextView textView2 = this.LJLLLLLL;
        if (textView2 != null) {
            textView2.setText("@");
            TextView textView3 = this.LJLLLLLL;
            if (textView3 != null) {
                return textView3;
            }
            o.LJIJI("iconView");
            throw null;
        }
        o.LJIJI("iconView");
        throw null;
    }

    @Override // X.AbstractC156406Bw
    public final LinearLayout LJI() {
        View findViewById = findViewById(R.id.ggv);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }

    @Override // X.AbstractC156406Bw
    public final void LJIIJ() {
        String str;
        int i;
        String content = getContent();
        Editable text = getMEditTextView().getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (o.LJ(str, content)) {
            return;
        }
        getMEditTextView().setText(content);
        getMEditTextView().setHint("");
        C6C5 mEditTextView = getMEditTextView();
        if (content != null) {
            i = content.length();
        } else {
            i = 0;
        }
        mEditTextView.setSelection(Math.min(50, i));
    }

    @Override // X.AbstractC156406Bw
    public String getContent() {
        if (FriendsServiceImpl.LJJJJ().LJIJJ()) {
            return C78915Uy7.LJIILLIIL(getCurModel());
        }
        return C78915Uy7.LJIJ(getCurModel());
    }

    public final MentionStruct getMentionStruct() {
        User curModel = getCurModel();
        if (curModel != null) {
            String uid = curModel.getUid();
            String str = "";
            if (uid == null) {
                uid = "";
            }
            String secUid = curModel.getSecUid();
            if (secUid != null) {
                str = secUid;
            }
            String LJIJ = C78915Uy7.LJIJ(curModel);
            String LJIILLIIL = C78915Uy7.LJIILLIIL(curModel);
            UrlModel avatarThumb = curModel.getAvatarThumb();
            if (avatarThumb == null) {
                avatarThumb = null;
            }
            return new MentionStruct(uid, str, LJIJ, LJIILLIIL, avatarThumb);
        }
        return new MentionStruct();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6CI(Context context) {
        super(context);
        new LinkedHashMap();
    }

    public static String LJIIJJI(MentionStruct mentionStruct) {
        String nickname;
        if (!FriendsServiceImpl.LJJJJ().LJIJJ() || (nickname = mentionStruct.getNickname()) == null || nickname.length() == 0) {
            String username = mentionStruct.getUsername();
            o.LJIIIIZZ(username, "{\n            mentionStruct.username\n        }");
            return username;
        }
        String nickname2 = mentionStruct.getNickname();
        o.LJIIIIZZ(nickname2, "{\n            mentionStruct.nickname\n        }");
        return nickname2;
    }
}

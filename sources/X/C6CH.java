package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6CH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CH extends AbstractC156406Bw<C42802Gr0> {
    public C6C5 LJLLLL;

    @Override // X.AbstractC156406Bw
    public int getLayoutResId() {
        return R.layout.bk7;
    }

    @Override // X.AbstractC156406Bw
    public final void LJIIIIZZ() {
        C6C5 c6c5 = this.LJLLLL;
        if (c6c5 != null) {
            c6c5.setHint(getContext().getResources().getString(R.string.e3h));
        } else {
            o.LJIJI("editText");
            throw null;
        }
    }

    @Override // X.AbstractC156406Bw
    public final C6C5 LJ() {
        View findViewById = findViewById(R.id.d04);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ev_lay…shtag_sticker_input_view)");
        C6C5 c6c5 = (C6C5) findViewById;
        this.LJLLLL = c6c5;
        return c6c5;
    }

    @Override // X.AbstractC156406Bw
    public final TextView LJFF() {
        TextView textView = (TextView) findViewById(R.id.m_h);
        textView.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "mention_and_hashtag.ttf"));
        textView.setText("#");
        return textView;
    }

    @Override // X.AbstractC156406Bw
    public final LinearLayout LJI() {
        View findViewById = findViewById(R.id.e2v);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }

    @Override // X.AbstractC156406Bw
    public final void LJIIJ() {
        String str;
        String content = getContent();
        if (content == null) {
            return;
        }
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
        if (content.length() > 50) {
            int i = 49;
            while (Character.isHighSurrogate(content.charAt(i))) {
                i--;
            }
            getMEditTextView().setSelection(i);
        } else {
            getMEditTextView().setSelection(content.length());
        }
        getMEditTextView().requestLayout();
    }

    @Override // X.AbstractC156406Bw
    public String getContent() {
        AVChallenge aVChallenge;
        C42802Gr0 curModel = getCurModel();
        if (curModel != null && (aVChallenge = curModel.LIZ) != null) {
            return aVChallenge.challengeName;
        }
        return null;
    }

    public final HashtagStruct getHashTagStruct() {
        String str;
        AVChallenge aVChallenge;
        if (getCurModel() != null) {
            HashtagStruct hashtagStruct = new HashtagStruct();
            C42802Gr0 curModel = getCurModel();
            if (curModel == null || (aVChallenge = curModel.LIZ) == null || (str = aVChallenge.getChallengeName()) == null) {
                str = "";
            }
            hashtagStruct.setHashtagName(str);
            return hashtagStruct;
        }
        return new HashtagStruct();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6CH(Context context) {
        super(context);
        new LinkedHashMap();
    }
}

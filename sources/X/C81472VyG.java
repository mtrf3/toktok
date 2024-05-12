package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VyG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81472VyG extends ConstraintLayout {
    public ConstraintLayout LJLIL;
    public OPX LJLILLLLZI;
    public T5T LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public UrlModel LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;

    public final ConstraintLayout getContentView() {
        ConstraintLayout constraintLayout = this.LJLIL;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public final QaStruct getQaStruct() {
        String str;
        UrlModel urlModel = this.LJLLI;
        T5T t5t = this.LJLJI;
        if (t5t != null) {
            Editable text = t5t.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            return new QaStruct(this.LJLJL, this.LJLJLJ, this.LJLJJLL, urlModel, this.LJLL, str, this.LJLJLLL, null, null, null, null, null, null, null, this.LJLLILLLL, null, null, 114560, null);
        }
        o.LJIJI("questionEditText");
        throw null;
    }

    public final boolean getTouchAble() {
        return this.LJLLJ;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLLJ) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        setAlpha(f);
    }

    public final void setContentView(ConstraintLayout constraintLayout) {
        o.LJIIIZ(constraintLayout, "<set-?>");
        this.LJLIL = constraintLayout;
    }

    public final void setTouchAble(boolean z) {
        this.LJLLJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81472VyG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        UrlModel urlModel;
        new LinkedHashMap();
        this.LJLJLLL = "";
        this.LJLL = "";
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            urlModel = LJ.getAvatarThumb();
        } else {
            urlModel = null;
        }
        this.LJLLI = urlModel;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ht, this, true);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        setContentView((ConstraintLayout) LLLLIILL);
        View findViewById = getContentView().findViewById(R.id.ih6);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.qa_sticker_avatar)");
        this.LJLILLLLZI = (OPX) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.ih7);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…ticker_content_edit_text)");
        this.LJLJI = (T5T) findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.kkp);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById….sticker_views_text_view)");
        this.LJLJJI = (TuxTextView) findViewById3;
        View findViewById4 = getContentView().findViewById(R.id.ki3);
        o.LJIIIIZZ(findViewById4, "contentView.findViewById…icker_invited_users_view)");
        this.LJLJJL = (TuxTextView) findViewById4;
        OPX opx = this.LJLILLLLZI;
        if (opx != null) {
            C78764Uvg.LJI(opx, this.LJLLI, -1, -1);
            T5T t5t = this.LJLJI;
            if (t5t != null) {
                t5t.addTextChangedListener(new C81474VyI());
                return;
            } else {
                o.LJIJI("questionEditText");
                throw null;
            }
        }
        o.LJIJI("avatarImage");
        throw null;
    }
}

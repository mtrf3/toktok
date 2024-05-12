package X;

import Y.IDCSpanS2S1100000_7;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPageImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GTE extends FrameLayout {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJI;
        Integer valueOf = Integer.valueOf(R.id.asq);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.asq);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final boolean getMusicUsageOrigin() {
        return this.LJLILLLLZI;
    }

    public final void setBrandedContent(boolean z) {
        String str;
        String string;
        SpannableString spannableString;
        String string2;
        if (LIZ() == null) {
            return;
        }
        LIZ().setVisibility(0);
        String string3 = getContext().getResources().getString(R.string.p5y);
        o.LJIIIIZZ(string3, "context.resources.getStr…tring.post_KR_KCC_notice)");
        String string4 = getContext().getResources().getString(R.string.c4j);
        o.LJIIIIZZ(string4, "context.resources.getStr…R.string.bc_policy_title)");
        C78934UyQ.LJLIL.getCommerceService().getClass();
        BrandedContentToolSchema LIZ = GTF.LIZ();
        if (LIZ == null || (str = LIZ.brandedContentPolicy) == null) {
            str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
        }
        if (this.LJLIL) {
            if (z) {
                string2 = getContext().getResources().getString(R.string.c44, string4);
                o.LJIIIIZZ(string2, "{\n                contex…olicyTitle)\n            }");
            } else {
                string2 = getContext().getResources().getString(R.string.bjy, string4);
                o.LJIIIIZZ(string2, "{\n                contex…olicyTitle)\n            }");
            }
            if (!PublishPageImpl.LIZJ().LIZ()) {
                spannableString = new SpannableString(string2);
            } else {
                spannableString = new SpannableString(C00F.LIZIZ(string2, ' ', string3));
            }
            int LJJLIIIJL = s.LJJLIIIJL(string2, string4, 0, false, 6);
            int length = string4.length() + LJJLIIIJL;
            spannableString.setSpan(new StyleSpan(1), LJJLIIIJL, length, 33);
            spannableString.setSpan(new IDCSpanS2S1100000_7(this, str, 0), LJJLIIIJL, length, 33);
        } else {
            String string5 = getContext().getResources().getString(R.string.c4g);
            o.LJIIIIZZ(string5, "context.resources.getString(R.string.bc_muc_title)");
            if (z) {
                string = getContext().getResources().getString(R.string.c45, string4, string5);
                o.LJIIIIZZ(string, "{\n                contex…          )\n            }");
            } else {
                string = getContext().getResources().getString(R.string.bjz, string4, string5);
                o.LJIIIIZZ(string, "{\n                contex…musicTitle)\n            }");
            }
            if (!PublishPageImpl.LIZJ().LIZ()) {
                spannableString = new SpannableString(string);
            } else {
                spannableString = new SpannableString(C00F.LIZIZ(string, ' ', string3));
            }
            int LJJLIIIJL2 = s.LJJLIIIJL(string, string4, 0, false, 6);
            int length2 = string4.length() + LJJLIIIJL2;
            int LJJLIIIJL3 = s.LJJLIIIJL(string, string5, 0, false, 6);
            int length3 = string5.length() + LJJLIIIJL3;
            spannableString.setSpan(new StyleSpan(1), LJJLIIIJL2, length2, 33);
            spannableString.setSpan(new StyleSpan(1), LJJLIIIJL3, length3, 33);
            spannableString.setSpan(new IDCSpanS2S1100000_7(this, str, 1), LJJLIIIJL2, length2, 33);
            spannableString.setSpan(new IDCSpanS2S1100000_7(this, str, 2), LJJLIIIJL3, length3, 33);
        }
        if (PublishPageImpl.LIZJ().LIZ()) {
            ((TuxTextView) LIZ()).setTuxFont(81);
            ((TextView) LIZ()).setLineSpacing(0.0f, 1.0f);
        }
        ((TextView) LIZ()).setMovementMethod(new LinkMovementMethod());
        ((TextView) LIZ()).setText(spannableString);
    }

    public final void setCommerceMusic(boolean z) {
        this.LJLIL = z;
    }

    public final void setMusicUsageOrigin(boolean z) {
        this.LJLILLLLZI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ub, this, true);
    }
}

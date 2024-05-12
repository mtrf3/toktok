package X;

import Y.ARunnableS11S0210000_12;
import Y.ARunnableS18S0110000_12;
import android.animation.Animator;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S09 extends S0H {
    public String LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public Animator LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final SY4 getBuyButton$ecommerce_video_release() {
        return (SY4) LIZ(R.id.a1y);
    }

    @Override // X.S0H
    public TuxIconView getIconView() {
        return (TuxIconView) LIZ(R.id.a2b);
    }

    public final OSZ<Boolean, Integer> getTitleShowStateInfo$ecommerce_video_release() {
        int ellipsisCount;
        int lineCount = ((TextView) LIZ(R.id.a4n)).getLineCount();
        if (lineCount <= 0) {
            return new OSZ<>(Boolean.FALSE, 0);
        }
        Layout layout = ((TextView) LIZ(R.id.a4n)).getLayout();
        if (layout != null && (ellipsisCount = layout.getEllipsisCount(lineCount - 1)) > 0) {
            return new OSZ<>(Boolean.TRUE, Integer.valueOf(((AppCompatTextView) LIZ(R.id.a4n)).getText().length() - ellipsisCount));
        }
        return new OSZ<>(Boolean.FALSE, Integer.valueOf(((AppCompatTextView) LIZ(R.id.a4n)).getText().length()));
    }

    public final String getPromotionStyleInfo() {
        return this.LJLILLLLZI;
    }

    public S09(Context context) {
        super(context, null);
        this.LJLJI = C45804HyK.LJJI(2) + C45804HyK.LJJI(8) + C45804HyK.LJJI(64);
        this.LJLJJI = C45804HyK.LJJI(200);
        FrameLayout.inflate(context, R.layout.xn, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        C7GV.LIZ(4, findViewById(R.id.a21));
    }

    public final void LIZIZ(boolean z) {
        ((ConstraintLayout) LIZ(R.id.a3s)).setMaxWidth(this.LJLJJI);
        TuxTextView privilegeTextView$ecommerce_video_release = ((S0D) LIZ(R.id.a3n)).getPrivilegeTextView$ecommerce_video_release();
        if (privilegeTextView$ecommerce_video_release != null) {
            privilegeTextView$ecommerce_video_release.setMaxWidth(this.LJLJJI);
        }
        post(new ARunnableS18S0110000_12(this, z, 2));
    }

    @Override // X.S0H
    public void setPreTitle(CharSequence charSequence) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a3f)).setText(charSequence);
            View anchor_pre_title = LIZ(R.id.a3f);
            o.LJIIIIZZ(anchor_pre_title, "anchor_pre_title");
            OUP.LJJLIIIJ(anchor_pre_title);
            View anchor_title_div = LIZ(R.id.a4o);
            o.LJIIIIZZ(anchor_title_div, "anchor_title_div");
            OUP.LJJLIIIJ(anchor_title_div);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        View anchor_pre_title2 = LIZ(R.id.a3f);
        o.LJIIIIZZ(anchor_pre_title2, "anchor_pre_title");
        OUP.LJIJJLI(anchor_pre_title2);
        View anchor_title_div2 = LIZ(R.id.a4o);
        o.LJIIIIZZ(anchor_title_div2, "anchor_title_div");
        OUP.LJIJJLI(anchor_title_div2);
    }

    public final void setPromotionStyleInfo(String str) {
        this.LJLILLLLZI = str;
    }

    public final void LIZLLL(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a4n)).setText(charSequence);
        }
        setPreTitle(charSequence2);
        S17 s17 = S17.LJLIL;
        ((TextView) LIZ(R.id.a4n)).setMaxWidth(this.LJLJJI);
        post(new ARunnableS11S0210000_12((Object) this, (C71791SFn) false, (boolean) s17, (List<ActionLinkComponent>) 3));
    }

    public final void LIZJ(AnchorPrivilegeItem anchorPrivilegeItem, AnchorPrivilegeItem anchorPrivilegeItem2, String str) {
        if (anchorPrivilegeItem != null) {
            ((S0D) LIZ(R.id.a3m)).setPrivilege$ecommerce_video_release(anchorPrivilegeItem);
        }
        if (anchorPrivilegeItem2 != null) {
            ((S0D) LIZ(R.id.a3n)).setPrivilege$ecommerce_video_release(anchorPrivilegeItem2);
            if (anchorPrivilegeItem != null) {
                View anchor_privilege_div = LIZ(R.id.a3l);
                o.LJIIIIZZ(anchor_privilege_div, "anchor_privilege_div");
                OUP.LJJLIIIJ(anchor_privilege_div);
            }
        }
        if (str != null && !ujb.o.LJJJJJL(str)) {
            this.LJLILLLLZI = str;
        }
        LIZIZ(false);
    }
}

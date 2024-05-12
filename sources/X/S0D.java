package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S0D extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    public final String getPrivilegeText$ecommerce_video_release() {
        CharSequence text = ((AppCompatTextView) LIZ(R.id.a3p)).getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TuxTextView getPrivilegeTextView$ecommerce_video_release() {
        return (TuxTextView) LIZ(R.id.a3p);
    }

    private final void setPrivilegeStar(boolean z) {
        if (z) {
            View anchor_privilege_star = LIZ(R.id.a3o);
            o.LJIIIIZZ(anchor_privilege_star, "anchor_privilege_star");
            OUP.LJJLIIIJ(anchor_privilege_star);
        } else {
            View anchor_privilege_star2 = LIZ(R.id.a3o);
            o.LJIIIIZZ(anchor_privilege_star2, "anchor_privilege_star");
            OUP.LJIJJLI(anchor_privilege_star2);
        }
    }

    private final void setPrivilegeText(String str) {
        if (!C78857UxB.LJJJIL(str)) {
            str = null;
        }
        if (str != null) {
            ((TextView) LIZ(R.id.a3p)).setText(str);
            View anchor_privilege_text = LIZ(R.id.a3p);
            o.LJIIIIZZ(anchor_privilege_text, "anchor_privilege_text");
            OUP.LJJLIIIJ(anchor_privilege_text);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        View anchor_privilege_text2 = LIZ(R.id.a3p);
        o.LJIIIIZZ(anchor_privilege_text2, "anchor_privilege_text");
        OUP.LJIJJLI(anchor_privilege_text2);
        View anchor_privilege_star = LIZ(R.id.a3o);
        o.LJIIIIZZ(anchor_privilege_star, "anchor_privilege_star");
        OUP.LJIJJLI(anchor_privilege_star);
        OUP.LJIJJLI(this);
    }

    public final void setPrivilege$ecommerce_video_release(AnchorPrivilegeItem privilegeItem) {
        o.LJIIIZ(privilegeItem, "privilegeItem");
        setPrivilegeText(privilegeItem.getOptShowText());
        Integer itemType = privilegeItem.getItemType();
        if (itemType == null || itemType.intValue() != 2) {
            return;
        }
        Integer sellingItemType = privilegeItem.getSellingItemType();
        if (sellingItemType == null || sellingItemType.intValue() != 7) {
            setPrivilegeStar(false);
        } else {
            setPrivilegeStar(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.xo, this, true);
    }
}

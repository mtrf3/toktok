package X;

import Y.ARunnableS31S0200000_12;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S08 extends S0H {
    public String LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public final void LIZIZ() {
        String privilegeText$ecommerce_video_release;
        String privilegeText$ecommerce_video_release2 = ((S0D) LIZ(R.id.a3m)).getPrivilegeText$ecommerce_video_release();
        if ((privilegeText$ecommerce_video_release2 == null || privilegeText$ecommerce_video_release2.length() == 0) && ((privilegeText$ecommerce_video_release = ((S0D) LIZ(R.id.a3n)).getPrivilegeText$ecommerce_video_release()) == null || privilegeText$ecommerce_video_release.length() == 0)) {
            return;
        }
        setPivotX(0.0f);
        setPivotY(getHeight());
        C119774mz anchor_promotion_flow = (C119774mz) LIZ(R.id.a3s);
        o.LJIIIIZZ(anchor_promotion_flow, "anchor_promotion_flow");
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(anchor_promotion_flow, new ARunnableS31S0200000_12(this, anchor_promotion_flow, 25));
    }

    @Override // X.S0H
    public SmartImageView getBubbleIconView() {
        return (SmartImageView) LIZ(R.id.a1w);
    }

    @Override // X.S0H
    public TuxIconView getIconView() {
        return (TuxIconView) LIZ(R.id.a29);
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

    public S08(Context context) {
        super(context, null);
        FrameLayout.inflate(context, R.layout.xk, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        C7GV.LIZ(4, findViewById(R.id.a21));
    }

    @Override // X.S0H
    public void setPreTitle(CharSequence charSequence) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a3f)).setText(charSequence);
            post(new ARunnableS48S0100000_12(this, 80));
            C45804HyK.LJJLL(LIZ(R.id.a3f));
            C45804HyK.LJJLL(LIZ(R.id.a4o));
        }
    }

    public final void setPromotionStyleInfo(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.S0H
    public void setSuffix(int i) {
        if (i > 1) {
            TextView textView = (TextView) LIZ(R.id.a45);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" (");
            LIZ.append(i);
            LIZ.append(')');
            textView.setText(X1D.LIZIZ(LIZ));
            C45804HyK.LJJLL(LIZ(R.id.a45));
            C45804HyK.LJJLL(LIZ(R.id.a28));
        }
    }

    public final void LIZLLL(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            ((TextView) LIZ(R.id.a4n)).setText(charSequence);
        }
        setPreTitle(charSequence2);
    }

    public final void LIZJ(AnchorPrivilegeItem anchorPrivilegeItem, AnchorPrivilegeItem anchorPrivilegeItem2, String str) {
        if (anchorPrivilegeItem != null) {
            ((S0D) LIZ(R.id.a3m)).setPrivilege$ecommerce_video_release(anchorPrivilegeItem);
        }
        if (anchorPrivilegeItem2 != null) {
            ((S0D) LIZ(R.id.a3n)).setPrivilege$ecommerce_video_release(anchorPrivilegeItem2);
            if (anchorPrivilegeItem != null) {
                C45804HyK.LJJLL(LIZ(R.id.a3l));
            }
        }
        if (str != null && !ujb.o.LJJJJJL(str)) {
            this.LJLILLLLZI = str;
        }
    }
}

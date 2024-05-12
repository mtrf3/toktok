package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public abstract class S0H extends FrameLayout {
    public static final /* synthetic */ int LJLIL = 0;

    public SmartImageView getBubbleIconView() {
        return null;
    }

    public abstract TuxIconView getIconView();

    public String getPromotionInfo() {
        return null;
    }

    public void setPreTitle(CharSequence charSequence) {
    }

    public void setSuffix(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }
}

package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HTK extends C72209SVp {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C62822Ol8 LJLJL;

    @Override // X.C72209SVp
    public final int LIZ() {
        return R.layout.bej;
    }

    private final SmartImageView getActionButton() {
        return (SmartImageView) this.LJLJL.getValue();
    }

    public final void setButtonIcon(UrlModel urlModel) {
        if (urlModel == null) {
            return;
        }
        if (!getAttached()) {
            getPendingSetting().offer(new AqS154S0200000_7(this, urlModel, 22));
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJIJI = Bitmap.Config.ARGB_8888;
        LJII.LJJIIJ = getActionButton();
        C16880lQ.LLJJJ(LJII);
    }

    public final void setButtonOnClickListener(InterfaceC65784Pro<C76800UCe> onClick) {
        o.LJIIIZ(onClick, "onClick");
        if (!getAttached()) {
            getPendingSetting().offer(new AqS154S0200000_7(this, (HTK) onClick, (InterfaceC65784Pro<C76800UCe>) 23));
        } else {
            C16880lQ.LJJIJLIJ(getActionButton(), new ACListenerS27S0100000_7(onClick, 25));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 502));
    }
}

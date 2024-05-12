package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4gJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115634gJ extends FrameLayout {
    public final C62354Oda LJLIL;
    public final C62354Oda LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115634gJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.tl, C16880lQ.LLZIL(context), this);
        View findViewById = LLLZIIL.findViewById(R.id.h5s);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.notification_sticker_cover)");
        this.LJLIL = (C62354Oda) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.h5t);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.notification_sticker_icon)");
        this.LJLILLLLZI = (C62354Oda) findViewById2;
    }

    public final void LIZ(C62354Oda c62354Oda, UrlModel urlModel) {
        List<String> urlList;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJIILIIL(J7H.LIZ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
            LJII.LIZIZ("Notice");
            LJII.LJJIIJ = c62354Oda;
            C16880lQ.LLJJJ(LJII);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        c62354Oda.setImageDrawable(C79045V0n.LJIIIIZZ(R.attr.cf, context));
    }
}

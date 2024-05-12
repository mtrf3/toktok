package X;

import Y.ACListenerS24S0100000_4;
import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusFeature;
import com.ss.android.ugc.aweme.creatortools.creatorplus.ModalInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A8o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC25746A8o extends Dialog {
    public static final /* synthetic */ int LJLJJI = 0;
    public final ActivityC45651qj LJLIL;
    public final CreatorPlusFeature LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LJLJI.invoke();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        List<String> urlList;
        String str;
        super.onCreate(bundle);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ai3, getLayoutInflater(), null);
        if (LLLZIIL != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 291), LLLZIIL.findViewById(R.id.h_w));
            ModalInfo modalInfo = this.LJLILLLLZI.modalInfo;
            if (modalInfo != null) {
                UrlModel urlModel = modalInfo.image;
                if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LJJIIJ = (SmartImageView) LLLZIIL.findViewById(R.id.icl);
                    LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                }
                try {
                    ((TuxTextView) LLLZIIL.findViewById(R.id.icv)).setText(modalInfo.titleKey);
                    ((TuxTextView) LLLZIIL.findViewById(R.id.ica)).setText(modalInfo.messageKey);
                    ((TuxTextView) LLLZIIL.findViewById(R.id.icb)).setText(this.LJLIL.getString(R.string.ec2));
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
        this.LJLIL.getWindowManager().getDefaultDisplay().getSize(new Point());
        int LIZJ = (int) KL2.LIZJ(this.LJLIL, 310.0f);
        int i = (int) (r3.x * 0.8f);
        if (LIZJ > i) {
            LIZJ = i;
        }
        setContentView(LLLZIIL, new LinearLayout.LayoutParams(LIZJ, -2));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "creator_tools");
        c188727au.LJIIIZ("enter_method", "click_grey_area");
        String str2 = this.LJLILLLLZI.name;
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("feature", str2);
        FMX.LJIIL("show_creator_plus_popup", c188727au.LIZ);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getAction() == 4) {
            dismiss();
            return true;
        }
        return false;
    }

    public DialogC25746A8o(ActivityC45651qj activityC45651qj, CreatorPlusFeature creatorPlusFeature, C25748A8q c25748A8q) {
        super(activityC45651qj);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = creatorPlusFeature;
        this.LJLJI = c25748A8q;
    }
}

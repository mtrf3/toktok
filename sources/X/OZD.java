package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZD extends FrameLayout {
    public final ImageView LJLIL;
    public final C62180Oam LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public OZH LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OZD(Context context) {
        super(context, null, 0);
        User user;
        List<String> urlList;
        a1.LJFF(context, "context");
        this.LJLJI = 1;
        this.LJLJJI = 1;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cmg, this, true);
        View findViewById = findViewById(R.id.jty);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.share_out_qr_code_user_avatar)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.jtz);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.share_out_qr_code_user_nickname)");
        TextView textView = (TextView) findViewById2;
        o.LJIIIIZZ(findViewById(R.id.jtv), "findViewById(R.id.share_out_qr_code_desc_tv)");
        View findViewById3 = findViewById(R.id.jtw);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.share_out_qr_code_image_view)");
        C62180Oam c62180Oam = (C62180Oam) findViewById3;
        this.LJLILLLLZI = c62180Oam;
        View findViewById4 = findViewById(R.id.ij5);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.qr_code_top_left)");
        View findViewById5 = findViewById(R.id.ij6);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.qr_code_top_right)");
        View findViewById6 = findViewById(R.id.iii);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.qr_code_bottom_left)");
        View findViewById7 = findViewById(R.id.iij);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.qr_code_bottom_right)");
        UgCommonServiceImpl.LJIJ().LIZIZ();
        C82802Wec.LJIIJJI((ImageView) findViewById4, "share_user_qr_code_left_top", null);
        C82802Wec.LJIIJJI((ImageView) findViewById5, "share_user_qr_code_top_right", null);
        C82802Wec.LJIIJJI((ImageView) findViewById6, "share_user_qr_code_bottom_left", null);
        C82802Wec.LJIIJJI((ImageView) findViewById7, "share_user_qr_code_right_bottom", null);
        C82802Wec.LJIIJ(c62180Oam, "qr_code_default_view");
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            user = ((RBX) LJIILL).getCurUser();
        } else {
            user = null;
        }
        UrlModel LJJI = C78688UuS.LJJI(user);
        if (LJJI != null && (urlList = LJJI.getUrlList()) != null && (true ^ urlList.isEmpty())) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ((String) ListProtector.get(urlList, 0));
            LJIIIIZZ.LIZJ = context;
            LJIIIIZZ.LJIIIZ(new OZF(this));
        }
        textView.setText(user != null ? user.getNickname() : null);
    }

    public final void setCallback(OZH callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJL = callback;
    }
}

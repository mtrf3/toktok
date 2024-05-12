package X;

import Y.ACListenerS30S0100000_10;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZS extends Dialog {
    public final User LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public C113914dX LJLJJL;
    public C62180Oam LJLJJLL;
    public View LJLJL;
    public LinearLayout LJLJLJ;
    public FrameLayout LJLJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        C57127MbT c57127MbT;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        String str;
        TextView textView;
        String str2;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        super.onCreate(bundle);
        setContentView(R.layout.cls);
        setCanceledOnTouchOutside(true);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
            window2.setGravity(80);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.gravity = 80;
            window2.setAttributes(attributes);
            window2.setBackgroundDrawableResource(R.color.cz);
        }
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 205), findViewById(R.id.juv));
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
            C61713OJx LIZLLL = C61712OJw.LIZLLL((ActivityC45651qj) LJIIIIZZ, this);
            LIZLLL.LIZIZ.LJIIL();
            LIZLLL.LIZJ();
        }
        View findViewById = findViewById(R.id.iil);
        this.LJLJL = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(ViewOnClickListenerC62107OZb.LJLIL, findViewById);
        }
        View findViewById2 = findViewById(R.id.ij_);
        ViewGroup.LayoutParams layoutParams3 = null;
        Object[] objArr = 0;
        if ((findViewById2 instanceof TextView) && (textView = (TextView) findViewById2) != null) {
            User user = this.LJLIL;
            if (user != null) {
                str2 = user.getNickname();
            } else {
                str2 = null;
            }
            textView.setText(str2);
        }
        View findViewById3 = findViewById(R.id.ij8);
        if (findViewById3 instanceof C57127MbT) {
            c57127MbT = (C57127MbT) findViewById3;
        } else {
            c57127MbT = null;
        }
        if (c57127MbT != null) {
            c57127MbT.setBorderColor(R.color.ar);
            c57127MbT.setBorderWidth(4);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserQRCodeShareDialog_");
            User user2 = this.LJLIL;
            if (user2 == null || (str = user2.getUid()) == null) {
                str = "no_uid";
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            int dimension = (int) getContext().getResources().getDimension(R.dimen.a7r);
            c57127MbT.LJIIIIZZ(C78688UuS.LJJI(this.LJLIL), J7H.LIZ(101), dimension, dimension, LIZIZ, true, null);
        }
        this.LJLJLLL = (FrameLayout) findViewById(R.id.iis);
        UgCommonServiceImpl.LJIJ().LIZIZ();
        View findViewById4 = findViewById(R.id.ij5);
        if ((findViewById4 instanceof ImageView) && (imageView6 = (ImageView) findViewById4) != null) {
            C82802Wec.LJFF("share_user_qr_code_left_top", new OZV(this, imageView6));
        }
        View findViewById5 = findViewById(R.id.ij6);
        if ((findViewById5 instanceof ImageView) && (imageView5 = (ImageView) findViewById5) != null) {
            C82802Wec.LJFF("share_user_qr_code_top_right", new OZV(this, imageView5));
        }
        View findViewById6 = findViewById(R.id.iii);
        if ((findViewById6 instanceof ImageView) && (imageView4 = (ImageView) findViewById6) != null) {
            C82802Wec.LJFF("share_user_qr_code_bottom_left", new OZV(this, imageView4));
        }
        View findViewById7 = findViewById(R.id.iij);
        if ((findViewById7 instanceof ImageView) && (imageView3 = (ImageView) findViewById7) != null) {
            C82802Wec.LJFF("share_user_qr_code_right_bottom", new OZV(this, imageView3));
        }
        View findViewById8 = findViewById(R.id.g_c);
        if ((findViewById8 instanceof ImageView) && (imageView2 = (ImageView) findViewById8) != null) {
            C82802Wec.LJIIJJI(imageView2, "img_scan_logo_new", null);
        }
        C62180Oam c62180Oam = (C62180Oam) findViewById(R.id.iit);
        this.LJLJJLL = c62180Oam;
        if (c62180Oam != null) {
            C82802Wec.LJIIJJI(c62180Oam, "qr_code_default_view", null);
            String LJIIIIZZ2 = AV1.LJIIIIZZ(this.LJLIL);
            String str3 = this.LJLJI;
            if (str3 == null) {
                str3 = "";
            }
            c62180Oam.LJ(4, LJIIIIZZ2, str3);
        }
        View findViewById9 = findViewById(R.id.f0h);
        if ((findViewById9 instanceof ImageView) && (imageView = (ImageView) findViewById9) != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS30S0100000_10(this, 206));
        }
        this.LJLJLJ = (LinearLayout) findViewById(R.id.juw);
        this.LJLJJL = (C113914dX) findViewById(R.id.iiw);
        List LJ = C62275OcJ.LJ(C84763XOl.LJIIIIZZ());
        ArrayList arrayList = (ArrayList) LJ;
        arrayList.add(new C62108OZc());
        AbstractC65550Po2 LIZ2 = AbstractC65550Po2.LIZ(new C62355Odb((String) (objArr == true ? 1 : 0), false, 14));
        ORS.LJJLIL(new AqS176S0100000_10(this, 259), LJ);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) next;
            if (C62275OcJ.LIZIZ().isEmpty() || o.LJ(interfaceC62225ObV.key(), "general_qr_code") || C62275OcJ.LIZIZ().contains(interfaceC62225ObV.key())) {
                arrayList2.add(next);
            }
        }
        List<? extends InterfaceC62225ObV> LIZIZ2 = LIZ2.LIZIZ(arrayList2);
        C113914dX c113914dX = this.LJLJJL;
        if (c113914dX != null) {
            c113914dX.LJIIJ(LIZIZ2, false);
        }
        C113914dX c113914dX2 = this.LJLJJL;
        if (c113914dX2 != null) {
            c113914dX2.LJLJJL = new OZU(this);
        }
        LinearLayout linearLayout = this.LJLJLJ;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, ViewOnClickListenerC62106OZa.LJLIL);
        }
        if (KL2.LJIILL(getContext(), KL2.LJIIIZ(getContext())) < 654) {
            View view = this.LJLJL;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) KL2.LIZJ(getContext(), 18.0f);
            View view2 = this.LJLJL;
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams);
            }
            int LIZJ = (int) KL2.LIZJ(getContext(), 130.0f);
            FrameLayout frameLayout = this.LJLJLLL;
            if (frameLayout != null) {
                layoutParams2 = frameLayout.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = LIZJ;
            layoutParams2.height = LIZJ;
            FrameLayout frameLayout2 = this.LJLJLLL;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams2);
            }
            int LIZJ2 = (int) KL2.LIZJ(getContext(), 115.0f);
            C62180Oam c62180Oam2 = this.LJLJJLL;
            if (c62180Oam2 != null) {
                layoutParams3 = c62180Oam2.getLayoutParams();
            }
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams3.width = LIZJ2;
            layoutParams3.height = LIZJ2;
            C62180Oam c62180Oam3 = this.LJLJJLL;
            if (c62180Oam3 != null) {
                c62180Oam3.setLayoutParams(layoutParams3);
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        c188727au.LJIIIZ("enter_method", this.LJLJJI);
        FMX.LJIIL("enter_qr_code_page", c188727au.LIZ);
    }

    public OZS(Context context, User user, String str) {
        super(context, R.style.a_p);
        this.LJLIL = user;
        this.LJLILLLLZI = "now";
        this.LJLJI = str;
        this.LJLJJI = "now_post";
    }
}

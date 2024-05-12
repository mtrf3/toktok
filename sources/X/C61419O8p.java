package X;

import Y.ACListenerS30S0100000_10;
import Y.IDCListenerS285S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.O8p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61419O8p extends FrameLayout {
    public final AbstractC60787NtP LJLIL;
    public final Boolean LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final C252709vu LJLJLJ;
    public final C9KF LJLJLLL;

    @Override // android.view.View
    public final String getTag() {
        return this.LJLJJI;
    }

    public final void LIZ(EnumC61423O8t enumC61423O8t) {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        if (this.LJLJL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C26224AQy c26224AQy = new C26224AQy();
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.be8;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        c26224AQy.LIZ = c33381Ss.LIZ(context);
        c26224AQy.LIZLLL = 2;
        c26224AQy.LJ = "This website's connection\nis secure";
        c26224AQy.LIZIZ("Any information you share with this website,\nsuch as passwords or credit card numbers,\nwill be sent securely.");
        c26224AQy.LJIILIIL = true;
        ASL LIZ = c26224AQy.LIZ();
        IDCListenerS285S0100000_10 iDCListenerS285S0100000_10 = new IDCListenerS285S0100000_10(this, 1);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLIL = iDCListenerS285S0100000_10;
        tuxSheet.LJLILLLLZI = new DialogInterfaceOnDismissListenerC61420O8q(this, currentTimeMillis);
        tuxSheet.LJLLJ = false;
        Activity topActivity = ActivityStack.getTopActivity();
        if ((topActivity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) topActivity) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, (String) null);
            this.LJLJL = true;
            AbstractC60787NtP abstractC60787NtP = this.LJLIL;
            if (abstractC60787NtP != null) {
                abstractC60787NtP.LIZ(enumC61423O8t);
            }
        }
    }

    public final void LIZIZ(String str) {
        Object LIZ;
        boolean z;
        View findViewById;
        View findViewById2;
        if (!o.LJ(this.LJLILLLLZI, Boolean.TRUE)) {
            return;
        }
        try {
            LIZ = UriProtector.parse(str);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        android.net.Uri uri = android.net.Uri.EMPTY;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = uri;
        }
        o.LJIIIIZZ(LIZ, "runCatching { Uri.parse(…}.getOrDefault(Uri.EMPTY)");
        android.net.Uri uri2 = (android.net.Uri) LIZ;
        if (this.LJLJJL && ujb.o.LJJJJIZL(uri2.getScheme(), "https", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJLL = z;
        String host = uri2.getHost();
        if (host == null) {
            host = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        ForegroundColorSpan foregroundColorSpan = null;
        if (this.LJLJJLL) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            SY9 sy9 = new SY9(context, R.raw.icon_lock_fill);
            sy9.setBounds(0, 0, C7MY.LIZIZ(12), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI = C79045V0n.LJI(R.attr.go, context2);
            if (LJI != null) {
                sy9.LJ(LJI.intValue());
            }
            spannableStringBuilder.setSpan(new C8FR(sy9, 2), 0, 1, 33);
            SpannableString spannableString = new SpannableString(host);
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.go, context3);
            if (LJI2 != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI2.intValue());
            }
            spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) (" " + ((Object) spannableString)));
            C252709vu c252709vu = this.LJLJLJ;
            if (c252709vu != null && (findViewById2 = c252709vu.findViewById(R.id.gx4)) != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 135), findViewById2);
            }
            C252709vu c252709vu2 = this.LJLJLJ;
            if (c252709vu2 != null && (findViewById = c252709vu2.findViewById(R.id.gwk)) != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 136), findViewById);
            }
        } else {
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            SY9 sy92 = new SY9(context4, R.raw.icon_info_circle);
            sy92.setBounds(0, 0, C7MY.LIZIZ(12), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            Context context5 = getContext();
            o.LJIIIIZZ(context5, "context");
            Integer LJI3 = C79045V0n.LJI(R.attr.gp, context5);
            if (LJI3 != null) {
                sy92.LJ(LJI3.intValue());
            }
            spannableStringBuilder.setSpan(new C8FR(sy92, 2), 0, 1, 33);
            SpannableString spannableString2 = new SpannableString(host);
            Context context6 = getContext();
            o.LJIIIIZZ(context6, "context");
            Integer LJI4 = C79045V0n.LJI(R.attr.gp, context6);
            if (LJI4 != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI4.intValue());
            }
            spannableString2.setSpan(foregroundColorSpan, 0, spannableString2.length(), 33);
            spannableStringBuilder.append((CharSequence) (" " + ((Object) spannableString2)));
        }
        C9KF c9kf = this.LJLJLLL;
        c9kf.getClass();
        c9kf.LIZLLL = spannableStringBuilder;
        C252709vu c252709vu3 = this.LJLJLJ;
        if (c252709vu3 != null) {
            c252709vu3.LJIILLIIL(c9kf);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61419O8p(SparkContext sparkContext, AbstractC38911fr abstractC38911fr, AbstractC60787NtP abstractC60787NtP, Boolean bool, String str, int i, Context context) {
        super(context, null, 0);
        View LIZJ;
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLIL = abstractC60787NtP;
        this.LJLILLLLZI = bool;
        this.LJLJI = i;
        this.LJLJJI = "SparkWebNavBar";
        this.LJLJJL = true;
        C9KF c9kf = new C9KF();
        this.LJLJLLL = c9kf;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cn8, this, true).setLayoutParams(new ViewGroup.LayoutParams(-1, C7MY.LIZIZ(52)));
        C252709vu c252709vu = (C252709vu) findViewById(R.id.gwg);
        this.LJLJLJ = c252709vu;
        C235119Kp c235119Kp = new C235119Kp();
        AbstractC234519Ih LJIJJ = abstractC38911fr.LJIJJ();
        if (LJIJJ != null) {
            c235119Kp.LIZLLL(LJIJJ);
        }
        AbstractC234519Ih LJIILL = abstractC38911fr.LJIILL();
        if (LJIILL != null) {
            c235119Kp.LIZIZ(LJIILL);
        }
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        if (c252709vu != null) {
            c252709vu.setNavActions(c235119Kp);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(sparkContext.url), "url");
        if (queryParameter != null) {
            LIZIZ(queryParameter);
            abstractC60787NtP.LIZJ(EnumC60885Nuz.URL, queryParameter, System.currentTimeMillis() - currentTimeMillis);
        }
        sparkContext.LJII(InterfaceC60718NsI.class, new C60884Nuy(this, currentTimeMillis));
        sparkContext.LJJ(new C61426O8w(this));
        InterfaceC60761Nsz LJI = sparkContext.LJI();
        if (LJI != null && (LIZJ = LJI.LIZJ()) != null) {
            LIZJ.getContext();
        }
    }
}

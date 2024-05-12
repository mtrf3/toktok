package X;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.AgP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26857AgP extends ClickableSpan {
    public final /* synthetic */ LinkText LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<LinkText, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Integer LJLJJLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        String str2 = this.LJLIL.link;
        boolean z = false;
        if (str2 == null || str2.length() == 0) {
            InterfaceC88472Yns<LinkText, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(this.LJLIL);
                return;
            }
            return;
        }
        if (this.LJLJI) {
            String str3 = this.LJLIL.link;
            if ((str3 != null && ujb.o.LJJJLIIL(str3, "https://", false)) || ((str = this.LJLIL.link) != null && ujb.o.LJJJLIIL(str, "http://", false))) {
                str3 = i0.LJFF("aweme://echybrid?url=", str3);
            }
            SmartRouter.buildRoute(this.LJLJJI, UriProtector.parse(str3).toString()).open();
        } else {
            IBulletService LIZ = BulletService.LIZ();
            Context context = this.LJLJJI;
            LinkText linkText = this.LJLIL;
            String str4 = linkText.link;
            if (str4 == null) {
                str4 = "";
            }
            Boolean bool = linkText.isThirdPartyLink;
            if (bool != null) {
                z = bool.booleanValue();
            }
            String uri = C26867AgZ.LIZJ(str4, C26859AgR.LIZ(z)).build().toString();
            o.LJIIIIZZ(uri, "RouterUtils.createUrl(\n …     ).build().toString()");
            LIZ.LJIIIIZZ(context, uri);
        }
        InterfaceC88472Yns<LinkText, C76800UCe> interfaceC88472Yns2 = this.LJLILLLLZI;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(this.LJLIL);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        int LJIIIIZZ;
        o.LJIIIZ(ds, "ds");
        try {
            Integer LJI = C79045V0n.LJI(this.LJLJJL, this.LJLJJI);
            if (LJI != null) {
                LJIIIIZZ = LJI.intValue();
            } else {
                LinkText linkText = this.LJLIL;
                Integer num = linkText.textColor;
                if (num != null) {
                    LJIIIIZZ = C78915Uy7.LJIL(this.LJLJJI, num);
                } else {
                    String str = linkText.color;
                    if (str != null) {
                        LJIIIIZZ = Color.parseColor(str);
                    } else {
                        LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, this.LJLJJI);
                    }
                }
            }
        } catch (Throwable unused) {
            LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, this.LJLJJI);
        }
        ds.setColor(LJIIIIZZ);
        Integer num2 = this.LJLJJLL;
        if (num2 != null) {
            int intValue = num2.intValue();
            T5S t5s = new T5S();
            t5s.LIZ(intValue);
            ds.setTypeface(t5s.getTypeface());
        }
        ds.setUnderlineText(o.LJ(this.LJLIL.hasUnderscore, Boolean.TRUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C26857AgP(LinkText linkText, InterfaceC88472Yns<? super LinkText, C76800UCe> interfaceC88472Yns, boolean z, Context context, int i, Integer num) {
        this.LJLIL = linkText;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = z;
        this.LJLJJI = context;
        this.LJLJJL = i;
        this.LJLJJLL = num;
    }
}

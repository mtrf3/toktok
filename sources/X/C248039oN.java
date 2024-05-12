package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.touchpoint.core.model.RedPacketPendant;
import com.bytedance.touchpoint.core.model.Title;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248039oN extends FrameLayout {
    public final String LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final SmartImageView getPendantImageView() {
        return (SmartImageView) this.LJLILLLLZI.getValue();
    }

    public final TuxTextView getBottomTextView() {
        return (TuxTextView) this.LJLJI.getValue();
    }

    public C248039oN(Context context) {
        super(context, null, 0);
        this.LJLIL = "RedPacketView";
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1008));
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1007));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ctf, this, true);
    }

    public final void setBottomText(String content) {
        o.LJIIIZ(content, "content");
        getBottomTextView().setText(content);
    }

    public final void LIZ(RedPacketPendant redPacketPendant, final AqS170S0100000_4 aqS170S0100000_4) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RedPacketView setData, ");
        String str2 = null;
        if (redPacketPendant != null) {
            str = redPacketPendant.pendantPic;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (redPacketPendant == null) {
            return;
        }
        TuxTextView bottomTextView = getBottomTextView();
        C247489nU c247489nU = C247489nU.LIZ;
        Title title = redPacketPendant.bottomText;
        if (title != null) {
            str2 = title.color;
        }
        bottomTextView.setTextColor(C247489nU.LIZIZ(c247489nU, str2));
        C110614Vt c110614Vt = new C110614Vt();
        String str3 = redPacketPendant.bottomTextBgColor;
        if (str3 == null) {
            str3 = "#E75300";
        }
        c110614Vt.LIZ = Integer.valueOf(C247489nU.LIZIZ(c247489nU, str3));
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        Context context = bottomTextView.getContext();
        o.LJIIIIZZ(context, "context");
        bottomTextView.setBackground(c110614Vt.LIZ(context));
        W5F LJIIIIZZ = W5U.LJIIIIZZ(redPacketPendant.pendantPic);
        LJIIIIZZ.LJJIIJZLJL = getPendantImageView();
        LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LJIIIIZZ.LIZLLL(new AbstractC72439Sbr() { // from class: X.9oO
            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                String str4;
                InterfaceC88472Yns interfaceC88472Yns = aqS170S0100000_4;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.FALSE);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("image load fail ");
                if (th != null) {
                    str4 = th.getMessage();
                } else {
                    str4 = null;
                }
                LIZ2.append(str4);
                X1D.LIZIZ(LIZ2);
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                C248039oN.this.getBottomTextView().setVisibility(0);
                InterfaceC88472Yns interfaceC88472Yns = aqS170S0100000_4;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.TRUE);
                }
            }
        });
    }
}

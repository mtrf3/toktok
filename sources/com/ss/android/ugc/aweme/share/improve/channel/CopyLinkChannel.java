package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC62625Ohx;
import X.C110614Vt;
import X.C2068389v;
import X.C26338AVi;
import X.C46181IAn;
import X.C61328O5c;
import X.C78857UxB;
import X.C7MY;
import X.C86V;
import X.InterfaceC62573Oh7;
import X.OYP;
import X.SY9;
import X.X1D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class CopyLinkChannel extends PureLogicChannel {
    public final boolean LJLIL;

    public CopyLinkChannel() {
        this(false);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final boolean LJIIZILJ() {
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "copy";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String LJFF = C86V.LJFF(R.string.r43);
        o.LJIIIIZZ(LJFF, "getString(R.string.share_copy_link)");
        return LJFF;
    }

    public CopyLinkChannel(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC62225ObV
    public Drawable LIZJ(Context context) {
        if (context != null) {
            if (this.LJLIL) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_link;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                c2068389v.LIZIZ = C7MY.LIZIZ(32);
                c2068389v.LIZJ = C7MY.LIZIZ(32);
                SY9 LIZ = c2068389v.LIZ(context);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cc);
                c110614Vt.LJII = C7MY.LIZIZ(48);
                c110614Vt.LJI = C7MY.LIZIZ(48);
                c110614Vt.LIZJ = C61328O5c.LIZJ(24);
                return C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
            }
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_color_link_circle;
            return c2068389v2.LIZ(context);
        }
        return null;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        if (content instanceof OYP) {
            return LJIJ((OYP) content, context, null);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public boolean LJIJ(OYP content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        String str;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        String str2 = content.LIZJ;
        if (str2 == null || str2.length() == 0) {
            str = content.LIZLLL;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(content.LIZJ);
            LIZ.append(' ');
            LIZ.append(content.LIZLLL);
            str = X1D.LIZIZ(LIZ);
        }
        new C46181IAn((String) null, 7).LIZJ(context, C78857UxB.LJJIIJ(1476399114, "bpea-106"), str);
        return true;
    }
}

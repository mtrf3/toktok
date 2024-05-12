package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JGn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48885JGn implements JGU {
    public final InterfaceC48907JHj LJLIL;
    public JGU LJLILLLLZI;

    @Override // X.JGU
    public final void LJJJLZIJ() {
        JGU jgu = this.LJLILLLLZI;
        if (jgu != null) {
            jgu.LJJJLZIJ();
        }
    }

    public C48885JGn(InterfaceC48907JHj interfaceC48907JHj) {
        this.LJLIL = interfaceC48907JHj;
    }

    @Override // X.JGU
    public final void LJLLL(Aweme aweme) {
        InterfaceC46330IGg interfaceC46330IGg;
        String str;
        Integer num;
        Integer num2;
        JGI jgi;
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        String str2 = null;
        if ((interfaceC48907JHj instanceof JGI) && (jgi = (JGI) interfaceC48907JHj) != null) {
            interfaceC46330IGg = jgi.getMPlayer();
        } else {
            interfaceC46330IGg = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayVideo: ");
        InterfaceC48907JHj interfaceC48907JHj2 = this.LJLIL;
        if (interfaceC48907JHj2 != null) {
            str = C16880lQ.LJLLJ(interfaceC48907JHj2.getClass());
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('@');
        InterfaceC48907JHj interfaceC48907JHj3 = this.LJLIL;
        if (interfaceC48907JHj3 != null) {
            num = Integer.valueOf(interfaceC48907JHj3.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", player@");
        if (interfaceC46330IGg != null) {
            num2 = Integer.valueOf(interfaceC46330IGg.hashCode());
        } else {
            num2 = null;
        }
        LIZ.append(num2);
        LIZ.append(", aid: ");
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        InterfaceC48907JHj interfaceC48907JHj4 = this.LJLIL;
        if (interfaceC48907JHj4 != null) {
            JLU.LIZJ(interfaceC48907JHj4);
            if (!C49967JjH.LIZIZ()) {
                JLU.LJI(this.LJLIL);
            }
        }
        JGU jgu = this.LJLILLLLZI;
        if (jgu != null) {
            jgu.LJLLL(aweme);
        }
    }
}

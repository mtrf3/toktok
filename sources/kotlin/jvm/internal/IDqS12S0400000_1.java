package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C109544Rq;
import X.C112824bm;
import X.C112874br;
import X.C112924bw;
import X.C112934bx;
import X.C112984c2;
import X.C34B;
import X.C4XA;
import X.C4XB;
import X.C76800UCe;
import X.C84973Vd;
import X.C85003Vg;
import X.EnumC112954bz;
import X.InterfaceC112854bp;
import X.InterfaceC88473Ynt;
import X.MS5;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;

/* loaded from: classes2.dex */
public class IDqS12S0400000_1 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS12S0400000_1 iDqS12S0400000_1, Object obj, Object obj2, Object obj3) {
        int i;
        Throwable th = (Throwable) obj3;
        ((C85003Vg) iDqS12S0400000_1.l0).getClass();
        C84973Vd.LJI(CardStruct.IStatusCode.DEFAULT, (C109544Rq) iDqS12S0400000_1.l1, (ShareAwemeContent) iDqS12S0400000_1.l2);
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDqS12S0400000_1.l3;
        if (interfaceC88473Ynt != null) {
            if (th != null) {
                i = MS5.LIZJ(th);
            } else {
                i = 0;
            }
            interfaceC88473Ynt.invoke("AwemeCoverManager:MsgCover", 1, Integer.valueOf(i));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS12S0400000_1 iDqS12S0400000_1, Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj3;
        EnumC112954bz enumC112954bz = (EnumC112954bz) iDqS12S0400000_1.l0;
        C112874br c112874br = (C112874br) iDqS12S0400000_1.l1;
        C109544Rq c109544Rq = (C109544Rq) iDqS12S0400000_1.l2;
        UrlModel urlModel = (UrlModel) iDqS12S0400000_1.l3;
        if (th == null) {
            th = new Throwable();
        }
        C34B.LIZLLL("MediaThumbnailController", "Cannot load the thumbnail", th);
        if (enumC112954bz == EnumC112954bz.NUDE_MASK) {
            if (!(c112874br.LJIIIIZZ instanceof C112984c2)) {
                c112874br.LJIIIZ(new C112924bw(enumC112954bz));
                c112874br.LJIIJJI();
            }
        } else {
            InterfaceC112854bp interfaceC112854bp = c112874br.LIZ;
            if (o.LJ(interfaceC112854bp, C4XA.LIZ)) {
                c112874br.LJIIIZ(C112824bm.LIZ(c112874br.LIZ, c109544Rq, c112874br.LJ().LIZ(), "thumbnail-load-failure", new AqS61S0400000_1(c109544Rq, urlModel, enumC112954bz, c112874br, 1)));
            } else if (o.LJ(interfaceC112854bp, C4XB.LIZ)) {
                c112874br.LJIIIZ(new C112934bx(enumC112954bz));
            }
        }
        c112874br.LJIIJJI();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0400000_1(C85003Vg c85003Vg, C109544Rq c109544Rq, ShareAwemeContent shareAwemeContent, InterfaceC88473Ynt interfaceC88473Ynt, int i) {
        super(3);
        this.$t = i;
        this.l0 = c85003Vg;
        this.l1 = c109544Rq;
        this.l2 = shareAwemeContent;
        this.l3 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0400000_1(C109544Rq c109544Rq, UrlModel urlModel, EnumC112954bz enumC112954bz, C112874br c112874br, int i) {
        super(3);
        this.$t = i;
        this.l0 = enumC112954bz;
        this.l1 = c112874br;
        this.l2 = c109544Rq;
        this.l3 = urlModel;
    }
}

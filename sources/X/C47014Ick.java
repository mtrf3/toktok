package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Ick, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47014Ick implements InterfaceC47035Id5 {
    public final InterfaceC47034Id4 LIZ;
    public C47007Icd LIZIZ;
    public final AqS174S0100000_8 LIZJ = new AqS174S0100000_8(this, 208);

    @Override // X.InterfaceC47021Icr
    public final void release() {
        C47007Icd c47007Icd = this.LIZIZ;
        if (c47007Icd != null) {
            c47007Icd.LJFF();
        }
        this.LIZIZ = null;
        this.LIZ.release();
    }

    public C47014Ick(InterfaceC47034Id4 interfaceC47034Id4) {
        this.LIZ = interfaceC47034Id4;
        String msg = o.LJIILLIIL(C16880lQ.LJLLJ(interfaceC47034Id4.getClass()), "recycler : ");
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47035Id5
    public final C47020Icq LIZLLL(IX4 prepareData) {
        o.LJIIIZ(prepareData, "prepareData");
        if (C17N.LJJIJIIJI(this.LIZIZ, prepareData)) {
            return C73340SqO.LJIILLIIL();
        }
        return C73340SqO.LJJIJL(this.LIZ.LIZIZ(prepareData), new AqS174S0100000_8(this, 209));
    }

    @Override // X.InterfaceC47021Icr
    public final C47020Icq LIZJ(C47007Icd c47007Icd, IX4 prepareData, OnUIPlayListener onUIPlayListener, AqS158S0100000_8 clean) {
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(prepareData, "prepareData");
        o.LJIIIZ(clean, "clean");
        C47007Icd c47007Icd2 = this.LIZIZ;
        if (c47007Icd2 != null && !c47007Icd2.LJIIIZ && !c47007Icd2.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new C47020Icq(false, null, new AqS174S0100000_8(this, 210));
        }
        String str3 = prepareData.LJIIIZ;
        if (c47007Icd2 == null) {
            str = null;
        } else {
            str = c47007Icd2.LIZ;
        }
        if (TextUtils.equals(str3, str)) {
            String msg = o.LJIILLIIL(this.LIZIZ, "prerender session #hit#!!! : ");
            o.LJIIIZ(msg, "msg");
            this.LIZ.LIZ(c47007Icd);
            C47007Icd c47007Icd3 = this.LIZIZ;
            o.LJI(c47007Icd3);
            return C73340SqO.LJJIJL(c47007Icd3, this.LIZJ);
        }
        String msg2 = o.LJIILLIIL(this.LIZIZ, "prerender session #miss#!!! : ");
        o.LJIIIZ(msg2, "msg");
        if (onUIPlayListener != null) {
            C47007Icd c47007Icd4 = this.LIZIZ;
            if (c47007Icd4 == null) {
                str2 = null;
            } else {
                str2 = c47007Icd4.LIZ;
            }
            onUIPlayListener.onPreRenderSessionMissed(str2);
        }
        this.LIZ.LIZ(this.LIZIZ);
        return new C47020Icq(false, null, this.LIZJ);
    }
}

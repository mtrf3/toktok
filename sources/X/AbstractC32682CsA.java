package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.CsA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32682CsA extends AbstractC029409q<AbstractC32677Cs5> implements InterfaceC32671Crz {
    public AbstractC32698CsQ LJLIL;
    public AbstractC32677Cs5 LJLILLLLZI;
    public final Context LJLJJI;
    public InterfaceC136265Wk LJLJJL;
    public long LJLJJLL;
    public long LJLJLJ;
    public DataChannel LJLJLLL;
    public C32789Ctt LJLL;
    public final LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJLJL = new LinkedList<>();
    public final C32672Cs0 LJLLI = new C32672Cs0();
    public long LJLJI = C32833Cub.LIZ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJL.size();
    }

    public final int LJLLLLLL(long j) {
        Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = this.LJLJL.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC32698CsQ<? extends C30896CAq> next = it.next();
            if (next.LIZJ() == j && next.LIZ != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void LJZ(List<AbstractC32698CsQ<? extends C30896CAq>> list) {
        int LIZ;
        int size = (((list.size() - 1) / 8) + 1) * 8;
        AbstractC32698CsQ[] abstractC32698CsQArr = new AbstractC32698CsQ[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            abstractC32698CsQArr[i2] = new C32773Ctd();
        }
        for (AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ : list) {
            int i3 = i / 8;
            int i4 = i % 8;
            if (i4 < 4) {
                LIZ = i4 * 2;
            } else {
                LIZ = C0EH.LIZ(i4, -4, 2, 1);
            }
            int i5 = (i3 * 8) + LIZ;
            i++;
            if (i5 < size) {
                abstractC32698CsQArr[i5] = abstractC32698CsQ;
            }
        }
        List asList = Arrays.asList(abstractC32698CsQArr);
        C03200Aq.LIZ(new C32602Cqs(this.LJLJL, asList), true).LIZJ(this);
        this.LJLJL.clear();
        this.LJLJL.addAll(asList);
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return this.LJLJL.get(i).LIZJ();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return this.LJLJL.get(i).LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(AbstractC32677Cs5 abstractC32677Cs5) {
        AbstractC32677Cs5 abstractC32677Cs52 = abstractC32677Cs5;
        super.onViewDetachedFromWindow(abstractC32677Cs52);
        abstractC32677Cs52.onDestroy();
    }

    public AbstractC32677Cs5 LJLZ(int i, ViewGroup viewGroup) {
        AbstractC32677Cs5 c32686CsE;
        if (i != 1) {
            if (i != 9) {
                if (i != 10) {
                    c32686CsE = new C32751CtH(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI), R.layout.d8w, viewGroup, false));
                } else {
                    c32686CsE = new C32670Cry(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI), R.layout.d8x, viewGroup, false), this.LJLLI);
                }
            } else {
                c32686CsE = new C32690CsI(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI), R.layout.d8o, viewGroup, false));
            }
        } else {
            c32686CsE = new C32686CsE(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI), R.layout.d8s, viewGroup, false));
        }
        c32686CsE.c0(this);
        c32686CsE.LJLJJLL = this.LJLJLLL;
        return c32686CsE;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC32677Cs5 abstractC32677Cs5, int i) {
        AbstractC32677Cs5 abstractC32677Cs52 = abstractC32677Cs5;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJLJL.get(i);
        if (abstractC32698CsQ == null) {
            return;
        }
        if (abstractC32698CsQ.LIZ == 0) {
            abstractC32677Cs52.itemView.setVisibility(4);
            return;
        }
        if (this.LJLJLJ == abstractC32698CsQ.LIZJ()) {
            this.LJLILLLLZI = abstractC32677Cs52;
            abstractC32698CsQ.LIZJ = true;
            this.LJLIL = abstractC32698CsQ;
            abstractC32677Cs52.U();
            this.LJLILLLLZI.a0(this.LJLJI);
            if (abstractC32698CsQ instanceof C32739Ct5) {
                this.LJLL.LIZ(Boolean.TRUE, Long.valueOf(abstractC32698CsQ.LIZJ()), ((AbstractC32756CtM) abstractC32698CsQ).LJIILIIL(), GiftManager.inst().findGiftById(abstractC32698CsQ.LIZJ()).recommendInfo);
            }
        } else {
            abstractC32698CsQ.LIZJ = false;
        }
        abstractC32677Cs52.L(abstractC32698CsQ, this.LJLJLLL, i / 8);
    }

    public AbstractC32682CsA(Context context, InterfaceC136265Wk interfaceC136265Wk, boolean z) {
        this.LJLJJI = context;
        this.LJLJJL = interfaceC136265Wk;
    }
}

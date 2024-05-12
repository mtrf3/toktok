package X;

import Y.ACListenerS24S0101000_5;
import Y.IDTListenerS115S0100000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cs8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32680Cs8 extends AbstractC32678Cs6 {
    public final View LLFII;
    public final List<AbstractC32698CsQ<? extends C30896CAq>> LLFZ;
    public final String LLI;
    public final C47121t6 LLIFFJFJJ;
    public final C47121t6 LLII;
    public final View LLIIII;

    @Override // X.AbstractC32678Cs6
    public final void M() {
        this.LLFII.setOnTouchListener(new IDTListenerS115S0100000_5(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    @Override // X.AbstractC32678Cs6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0() {
        /*
            r9 = this;
            X.CsQ<? extends X.CAq> r3 = r9.LJZ
            r0 = 0
            if (r3 == 0) goto La
            com.bytedance.android.live.base.model.ImageModel r1 = r3.LJ
            if (r1 == 0) goto Lc
            return
        La:
            r2 = r0
            goto L10
        Lc:
            if (r3 == 0) goto La
            T extends X.CAq r2 = r3.LIZIZ
        L10:
            boolean r1 = r2 instanceof X.C32697CsP
            if (r1 == 0) goto L50
            X.CsP r2 = (X.C32697CsP) r2
            if (r2 == 0) goto L51
            com.bytedance.android.live.base.model.ImageModel r6 = r2.LJI
        L1a:
            if (r3 == 0) goto L3a
            boolean r1 = r3.LJI()
            r8 = 1
            if (r1 != r8) goto L3a
            if (r6 == 0) goto L39
            int r2 = X.C30760C5k.LIZJ()
            X.1t0 r5 = r9.LJLJLJ
            r4 = 2131235448(0x7f081278, float:1.808709E38)
            X.Csi r7 = new X.Csi
            r0 = 0
            r7.<init>(r0, r9)
            r3 = r2
            X.C30760C5k.LIZLLL(r2, r3, r4, r5, r6, r7, r8)
        L39:
            return
        L3a:
            if (r2 == 0) goto L3e
            com.bytedance.android.live.base.model.ImageModel r0 = r2.LJII
        L3e:
            X.CsQ<? extends X.CAq> r2 = r9.LJZ
            if (r2 == 0) goto L4a
            com.bytedance.android.live.base.model.ImageModel r1 = r2.LJFF
            if (r1 == 0) goto L4a
            if (r2 == 0) goto L39
            com.bytedance.android.live.base.model.ImageModel r0 = r2.LJFF
        L4a:
            if (r0 == 0) goto L39
            r9.a0(r0)
            goto L39
        L50:
            r2 = r0
        L51:
            r6 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32680Cs8.i0():void");
    }

    @Override // X.AbstractC32678Cs6
    public final String Q() {
        return this.LLI;
    }

    @Override // X.AbstractC32678Cs6
    public final void L(int i) {
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(i, this, 3), this.LLFII);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32680Cs8(View view, List<? extends AbstractC32698CsQ<? extends C30896CAq>> matchItems) {
        super(view);
        o.LJIIIZ(matchItems, "matchItems");
        this.LLFII = view;
        this.LLFZ = matchItems;
        this.LLI = "LiveBagItemViewHolder";
        this.LLIFFJFJJ = (C47121t6) view.findViewById(R.id.etq);
        this.LLII = (C47121t6) view.findViewById(R.id.et6);
        this.LLIIII = view.findViewById(R.id.k_k);
    }

    @Override // X.AbstractC32678Cs6
    public final void N(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, DataChannel dataChannel, int i) {
        C018905p c018905p;
        C47121t6 c47121t6;
        String str;
        Object obj;
        long j;
        long j2;
        String str2;
        C32697CsP c32697CsP;
        C32697CsP c32697CsP2;
        C32697CsP c32697CsP3;
        C32697CsP c32697CsP4;
        Integer LJI;
        C018905p c018905p2;
        super.N(abstractC32698CsQ, dataChannel, i);
        T t = abstractC32698CsQ.LIZIZ;
        Object obj2 = null;
        if (abstractC32698CsQ.LIZJ) {
            C47121t6 c47121t62 = this.LLIFFJFJJ;
            if (c47121t62 != null) {
                ViewGroup.LayoutParams layoutParams = c47121t62.getLayoutParams();
                if ((layoutParams instanceof C018905p) && (c018905p2 = (C018905p) layoutParams) != null) {
                    c018905p2.topToBottom = R.id.dsp;
                } else {
                    c018905p2 = null;
                }
                c47121t62.setLayoutParams(c018905p2);
            }
        } else {
            C47121t6 c47121t63 = this.LLIFFJFJJ;
            if (c47121t63 != null) {
                ViewGroup.LayoutParams layoutParams2 = c47121t63.getLayoutParams();
                if ((layoutParams2 instanceof C018905p) && (c018905p = (C018905p) layoutParams2) != null) {
                    c018905p.topToBottom = R.id.gzi;
                } else {
                    c018905p = null;
                }
                c47121t63.setLayoutParams(c018905p);
            }
        }
        if (t instanceof C32697CsP) {
            C47121t6 c47121t64 = this.LLII;
            if (c47121t64 != null) {
                long j3 = ((C32697CsP) t).LIZ;
                if (j3 < 100) {
                    str = String.valueOf(j3);
                } else {
                    str = "99+";
                }
                c47121t64.setText(str);
            }
            C47121t6 c47121t65 = this.LLIFFJFJJ;
            if (c47121t65 != null) {
                c47121t65.setText(((C32697CsP) t).LJ);
            }
            C32697CsP c32697CsP5 = (C32697CsP) t;
            if (!c32697CsP5.LJIIJJI) {
                C47121t6 c47121t66 = this.LJLLLL;
                if (c47121t66 != null) {
                    c47121t66.setBackgroundResource(R.drawable.d3a);
                }
                Context context = this.itemView.getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.dn, context)) != null) {
                    int intValue = LJI.intValue();
                    C47121t6 c47121t67 = this.LJLLLL;
                    if (c47121t67 != null) {
                        c47121t67.setTextColor(intValue);
                    }
                }
                this.LJZL = true;
                if ((!this.LLFZ.isEmpty()) && i == this.LLFZ.size() - 1) {
                    List<AbstractC32698CsQ<? extends C30896CAq>> matchItems = this.LLFZ;
                    o.LJIIIZ(matchItems, "matchItems");
                    if (C32661Crp.LIZ != 0) {
                        ArrayList arrayList = new ArrayList(C32I.LJJL(matchItems, 10));
                        for (AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 : matchItems) {
                            if (!(abstractC32698CsQ2 instanceof C32726Css)) {
                                abstractC32698CsQ2 = null;
                            }
                            arrayList.add(abstractC32698CsQ2);
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                AbstractC32698CsQ abstractC32698CsQ3 = (AbstractC32698CsQ) obj;
                                if (abstractC32698CsQ3 != null && (c32697CsP4 = (C32697CsP) abstractC32698CsQ3.LIZIZ) != null && c32697CsP4.LJIIJJI && c32697CsP4.LJIIIZ == 1) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        AbstractC32698CsQ abstractC32698CsQ4 = (AbstractC32698CsQ) obj;
                        if (abstractC32698CsQ4 != null && (c32697CsP3 = (C32697CsP) abstractC32698CsQ4.LIZIZ) != null) {
                            j = c32697CsP3.LIZ;
                        } else {
                            j = 0;
                        }
                        ArrayList arrayList2 = new ArrayList(C32I.LJJL(matchItems, 10));
                        for (AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ5 : matchItems) {
                            if (!(abstractC32698CsQ5 instanceof C32726Css)) {
                                abstractC32698CsQ5 = null;
                            }
                            arrayList2.add(abstractC32698CsQ5);
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            AbstractC32698CsQ abstractC32698CsQ6 = (AbstractC32698CsQ) next;
                            if (abstractC32698CsQ6 != null && (c32697CsP2 = (C32697CsP) abstractC32698CsQ6.LIZIZ) != null && c32697CsP2.LJIIJJI && c32697CsP2.LJIIIZ == 2) {
                                obj2 = next;
                                break;
                            }
                        }
                        AbstractC32698CsQ abstractC32698CsQ7 = (AbstractC32698CsQ) obj2;
                        if (abstractC32698CsQ7 != null && (c32697CsP = (C32697CsP) abstractC32698CsQ7.LIZIZ) != null) {
                            j2 = c32697CsP.LIZ;
                        } else {
                            j2 = 0;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", System.currentTimeMillis() - C32661Crp.LIZ);
                        C32661Crp.LIZ = 0L;
                        jSONObject.put("available_boosting_gloves_count", j);
                        jSONObject.put("available_magic_smokes_count", j2);
                        if (j + j2 > 0) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("is_available", str2);
                        C32661Crp.LJI("match_item_backpack_show", jSONObject);
                    }
                }
            } else if (c32697CsP5.LJIILIIL) {
                View view = this.LLIIII;
                if (view != null) {
                    view.setVisibility(0);
                }
                C47121t6 c47121t68 = this.LJLLLL;
                if (c47121t68 != null) {
                    c47121t68.setText("");
                }
                this.LJZL = true;
            } else {
                View view2 = this.LLIIII;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                C47121t6 c47121t69 = this.LJLLLL;
                if (c47121t69 != null) {
                    c47121t69.setText(C15380j0.LJIILJJIL(R.string.o1j));
                }
                this.LJZL = false;
            }
        }
        if (!C29306Beo.LJJII(dataChannel) || (c47121t6 = this.LJLLLL) == null) {
            return;
        }
        c47121t6.setVisibility(0);
    }
}

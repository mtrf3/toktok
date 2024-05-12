package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WnL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83343WnL extends AbstractC029409q<AbstractC83335WnD> {
    public final VideoPublishEditModel LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public final InterfaceC88472Yns<AbstractC83369Wnl, C76800UCe> LJLJI;
    public final List<AbstractC83369Wnl> LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public final C83346WnO LJLJL;
    public boolean LJLJLJ;

    public final AbstractC83369Wnl LJLZ() {
        return (AbstractC83369Wnl) ORZ.LLFII(this.LJLJJI);
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    public final void LJZ() {
        notifyDataSetChanged();
        this.LJLILLLLZI.invoke(Integer.valueOf(((ArrayList) this.LJLJJI).size() - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0119, code lost:
    
        if (r2 != null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLLLLL(X.AbstractC83369Wnl r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83343WnL.LJLLLLLL(X.Wnl):void");
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        AbstractC83369Wnl abstractC83369Wnl = (AbstractC83369Wnl) ListProtector.get(this.LJLJJI, i);
        int ordinal = abstractC83369Wnl.LIZ().ordinal() << 5;
        if (abstractC83369Wnl instanceof C83355WnX) {
            return ordinal | ((C83355WnX) abstractC83369Wnl).LIZJ.ordinal();
        }
        return ordinal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r6 == (((java.util.ArrayList) r4.LJLJJI).size() - 1)) goto L12;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.AbstractC83335WnD r5, int r6) {
        /*
            r4 = this;
            X.WnD r5 = (X.AbstractC83335WnD) r5
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Class r1 = r5.getClass()
            java.lang.Class<X.WnA> r0 = X.C83332WnA.class
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L44
            boolean r0 = r5 instanceof X.C83332WnA
            if (r0 == 0) goto L41
            X.WnA r5 = (X.C83332WnA) r5
            if (r5 == 0) goto L41
            java.util.List<X.Wnl> r0 = r4.LJLJJI
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.Wnl r3 = (X.AbstractC83369Wnl) r3
            boolean r0 = r4.LJLJJL
            if (r0 == 0) goto L42
            java.util.List<X.Wnl> r0 = r4.LJLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r2 = 1
            int r0 = r0 - r2
            if (r6 != r0) goto L42
        L33:
            int r1 = r4.LJLJJLL
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r5.LJLLILLLL = r2
            r5.LJLLJ = r1
            r5.L(r3)
        L41:
            return
        L42:
            r2 = 0
            goto L33
        L44:
            java.util.List<X.Wnl> r0 = r4.LJLJJI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.Wnl r0 = (X.AbstractC83369Wnl) r0
            r5.L(r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83343WnL.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC83335WnD com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC83335WnD c83336WnE;
        o.LJIIIZ(parent, "parent");
        int i2 = C83344WnM.LIZIZ[EnumC83358Wna.values()[i >> 5].ordinal()];
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    int i3 = C83344WnM.LIZ[EnumC83354WnW.values()[i & 31].ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 3) {
                            View itemView = C28289B8j.LIZ(parent, R.layout.cbb, parent, false);
                            o.LJIIIIZZ(itemView, "itemView");
                            c83336WnE = new C83342WnK(itemView, this.LJLJL);
                        } else {
                            Context context = parent.getContext();
                            o.LJIIIIZZ(context, "parent.context");
                            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                            tuxTextView.setTuxFont(51);
                            tuxTextView.setTextColorRes(R.attr.dm);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.gravity = 17;
                            layoutParams.topMargin = C7MY.LIZIZ(16);
                            layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
                            layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
                            tuxTextView.setLayoutParams(layoutParams);
                            tuxTextView.setTextAlignment(4);
                            tuxTextView.setText(tuxTextView.getContext().getText(R.string.e0m));
                            c83336WnE = new C83341WnJ(tuxTextView);
                        }
                    } else {
                        View itemView2 = C28289B8j.LIZ(parent, R.layout.cb9, parent, false);
                        o.LJIIIIZZ(itemView2, "itemView");
                        c83336WnE = new C83337WnF(itemView2, new C83350WnS(this, i));
                    }
                } else {
                    throw new IllegalStateException("Unknown view type in ChatItemAdapter!!");
                }
            } else {
                View itemView3 = C28289B8j.LIZ(parent, R.layout.cbb, parent, false);
                VideoPublishEditModel videoPublishEditModel = this.LJLIL;
                o.LJIIIIZZ(itemView3, "itemView");
                c83336WnE = new C83332WnA(videoPublishEditModel, itemView3, this.LJLJL);
            }
        } else {
            View itemView4 = C28289B8j.LIZ(parent, R.layout.cbc, parent, false);
            o.LJIIIIZZ(itemView4, "itemView");
            c83336WnE = new C83336WnE(itemView4);
        }
        C0AX.LIZ(parent, c83336WnE.itemView, R.id.lj7);
        View view = c83336WnE.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c83336WnE.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c83336WnE.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c83336WnE.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c83336WnE.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c83336WnE.getClass().getName();
        return c83336WnE;
    }

    public C83343WnL(VideoPublishEditModel videoPublishEditModel, Context context, AqS180S0100000_14 aqS180S0100000_14, AqS180S0100000_14 aqS180S0100000_142) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = aqS180S0100000_14;
        this.LJLJI = aqS180S0100000_142;
        this.LJLJJI = new ArrayList();
        this.LJLJJLL = -1;
        this.LJLJL = new C83346WnO(this);
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92643kK extends AbstractC029409q<C101983zO> {
    public final MessagingPrivacyViewModel LJLIL;
    public final List<PrivacySettingsRestrictionOption> LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C92643kK(MessagingPrivacyViewModel viewModel, List<PrivacySettingsRestrictionOption> list) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = list;
        this.LJLJI = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r0 != null) goto L19;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C101983zO r8, int r9) {
        /*
            r7 = this;
            X.3zO r8 = (X.C101983zO) r8
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.util.List<com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption> r0 = r7.LJLILLLLZI
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r9)
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption r2 = (com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption) r2
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            int r0 = r2.getValue()
            r6 = 4
            r5 = 2
            r1 = 1
            if (r0 == r1) goto Le7
            if (r0 == r5) goto Lcb
            if (r0 == r6) goto Lc6
            r3 = 2131842557(0x7f1155fd, float:1.9318454E38)
        L24:
            int r4 = r2.getValue()
            if (r4 == r5) goto La1
            r0 = 3
            if (r4 == r0) goto L99
            if (r4 == r6) goto L87
        L2f:
            r5 = 0
        L30:
            int r0 = r7.LJLJI
            if (r9 != r0) goto L85
        L34:
            Y.IDCListenerS141S0200000_1 r4 = new Y.IDCListenerS141S0200000_1
            r0 = 0
            r4.<init>(r7, r2, r0)
            X.AI8 r2 = r8.LJLIL
            android.view.View r0 = r8.itemView
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r3)
            r2.setTitle(r0)
            X.AI8 r3 = r8.LJLIL
            if (r5 == 0) goto L82
            r5.intValue()
            android.view.View r0 = r8.itemView
            android.content.res.Resources r2 = r0.getResources()
            int r0 = r5.intValue()
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L82
        L60:
            r3.setSubtitle(r0)
            X.AI8 r0 = r8.LJLIL
            X.AI9 r0 = r0.getAccessory()
            java.lang.String r2 = "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio"
            kotlin.jvm.internal.o.LJII(r0, r2)
            X.AEY r0 = (X.AEY) r0
            r0.LJIILL(r4)
            X.AI8 r0 = r8.LJLIL
            X.AI9 r0 = r0.getAccessory()
            kotlin.jvm.internal.o.LJII(r0, r2)
            X.AEY r0 = (X.AEY) r0
            r0.LJIILIIL(r1)
            return
        L82:
            java.lang.String r0 = ""
            goto L60
        L85:
            r1 = 0
            goto L34
        L87:
            boolean r0 = X.C53332KwS.LIZ()
            if (r0 == 0) goto L95
            r0 = 2131827842(0x7f111c82, float:1.9288608E38)
        L90:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L30
        L95:
            r0 = 2131827964(0x7f111cfc, float:1.9288855E38)
            goto L90
        L99:
            r0 = 2131827962(0x7f111cfa, float:1.9288851E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L30
        La1:
            boolean r0 = X.C53332KwS.LIZ()
            if (r0 == 0) goto Laf
            r0 = 2131830671(0x7f11278f, float:1.9294346E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L30
        Laf:
            X.LHM r0 = X.LHM.LIZIZ
            com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService r0 = r0.LIZ()
            boolean r0 = r0.shouldShowFriendsTab()
            if (r0 == 0) goto Lbd
            goto L2f
        Lbd:
            r0 = 2131827919(0x7f111ccf, float:1.9288764E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L30
        Lc6:
            r3 = 2131827963(0x7f111cfb, float:1.9288853E38)
            goto L24
        Lcb:
            boolean r0 = X.C53332KwS.LIZ()
            if (r0 == 0) goto Ld6
        Ld1:
            r3 = 2131834333(0x7f1135dd, float:1.9301773E38)
            goto L24
        Ld6:
            X.LHM r0 = X.LHM.LIZIZ
            com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService r0 = r0.LIZ()
            boolean r0 = r0.shouldShowFriendsTab()
            if (r0 == 0) goto Ld1
            r3 = 2131830672(0x7f112790, float:1.9294348E38)
            goto L24
        Le7:
            r3 = 2131823665(0x7f110c31, float:1.9280136E38)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92643kK.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C101983zO com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C101983zO c101983zO = new C101983zO(new AI8(context, null, 6));
        C0AX.LIZ(parent, c101983zO.itemView, R.id.lj7);
        View view = c101983zO.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c101983zO.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C101983zO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c101983zO.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c101983zO.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C101983zO.class.getName();
        return c101983zO;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C101983zO c101983zO, int i, List payloads) {
        C101983zO holder = c101983zO;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = ListProtector.get(payloads, 0);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AI9 accessory = holder.LJLIL.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        ((AEY) accessory).LJIILIIL(booleanValue);
    }
}

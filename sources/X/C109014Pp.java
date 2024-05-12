package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109014Pp extends C4P0 implements C4PA {
    public SharePanelViewModel LJLIL;
    public final C107124Ii LJLILLLLZI;
    public final C4OT LJLJI;
    public final List<IMContact> LJLJJI;
    public final List<Integer> LJLJJL;
    public final List<Integer> LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public C109354Qx LJLJLLL;
    public LifecycleOwner LJLL;

    @Override // X.C4PA
    public final void LJJLJLI() {
        C109354Qx c109354Qx = this.LJLJLLL;
        if (c109354Qx != null) {
            c109354Qx.LJLJI = false;
        }
    }

    public final List<IMContact> getData() {
        return (List) this.LJLJL.getValue();
    }

    @Override // X.C4P0
    public final void LJLZ() {
        notifyItemRangeChanged(0, getData().size());
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.C4P0
    public final void LJLLLLLL(SharePanelViewModel sharePanelViewModel) {
        this.LJLIL = sharePanelViewModel;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(getData(), i);
        if (obj instanceof C4QM) {
            return 6;
        }
        if (obj instanceof C108724Om) {
            return 2;
        }
        if (obj instanceof C4NN) {
            return 3;
        }
        if (obj instanceof MAFIMUser) {
            if (C3UE.LIZ()) {
                return 1;
            }
            return 4;
        }
        if (obj instanceof C4QO) {
            return 5;
        }
        if (obj instanceof C4QN) {
            return 8;
        }
        if (obj instanceof C4QC) {
            return 7;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        C4QS c4qs;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof C4QS) && (c4qs = (C4QS) holder) != null) {
            c4qs.onAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        C4QS c4qs;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof C4QS) && (c4qs = (C4QS) holder) != null) {
            c4qs.onDetachedFromWindow();
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C64962gm c64962gm;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (viewHolder instanceof C109054Pt) {
            ((C109054Pt) viewHolder).L((IMContact) ListProtector.get(getData(), i), this.LJLIL);
            return;
        }
        if (viewHolder instanceof C109114Pz) {
            Object obj = ListProtector.get(getData(), i);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMBatchGroup");
            ((C109114Pz) viewHolder).L((C4NN) obj, this.LJLIL);
            return;
        }
        if (viewHolder instanceof C108904Pe) {
            C108904Pe c108904Pe = (C108904Pe) viewHolder;
            IMContact iMContact = (IMContact) ListProtector.get(getData(), i);
            boolean contains = ((ArrayList) this.LJLJJL).contains(Integer.valueOf(i));
            boolean contains2 = ((ArrayList) this.LJLJJLL).contains(Integer.valueOf(i));
            SharePanelViewModel sharePanelViewModel = this.LJLIL;
            C33R c33r = null;
            if (C81313Hb.LIZ()) {
                c64962gm = this.LJLIL.LLFII;
            } else {
                c64962gm = null;
            }
            if (C81313Hb.LIZ()) {
                SharePanelViewModel sharePanelViewModel2 = this.LJLIL;
                IMContact contact = (IMContact) ListProtector.get(getData(), i);
                sharePanelViewModel2.getClass();
                o.LJIIIZ(contact, "contact");
                c33r = C107574Kb.LIZ(contact, sharePanelViewModel2.LJLLLL);
            }
            c108904Pe.L(iMContact, i, contains, contains2, sharePanelViewModel, c64962gm, c33r, this.LJLL);
            return;
        }
        if (viewHolder instanceof C57367MfL) {
            Object obj2 = ListProtector.get(getData(), i);
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.social.model.MAFIMUser");
            ((C57367MfL) viewHolder).L((MAFIMUser) obj2, i, this.LJLIL);
            return;
        }
        if (viewHolder instanceof C109354Qx) {
            ((C109354Qx) viewHolder).L((IMContact) ListProtector.get(getData(), i), this.LJLIL);
            return;
        }
        if (viewHolder instanceof C4R2) {
            ((C4R2) viewHolder).L((IMContact) ListProtector.get(getData(), i), this.LJLIL);
            return;
        }
        if (!(viewHolder instanceof C4QK)) {
            return;
        }
        C4QK c4qk = (C4QK) viewHolder;
        C107124Ii c107124Ii = this.LJLILLLLZI;
        if (c107124Ii == null) {
            return;
        }
        C107114Ih c107114Ih = (C107114Ih) c4qk.LJLIL.findViewById(R.id.jun);
        c107114Ih.LIZLLL(false);
        c107114Ih.LIZJ(c107124Ii);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        final RecyclerView.ViewHolder viewHolder;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        switch (i) {
            case 2:
                viewHolder = C109084Pw.LIZ(parent, this.LJLIL, true);
                break;
            case 3:
                viewHolder = C109104Py.LIZ(parent, this.LJLIL, true);
                break;
            case 4:
                viewHolder = C109094Px.LIZ(parent, this.LJLIL, this.LJLJI, true);
                break;
            case 5:
                C109354Qx LIZ = C109064Pu.LIZ(parent, this.LJLIL, true, true, false, 0, 0, 240);
                this.LJLJLLL = LIZ;
                viewHolder = LIZ;
                break;
            case 6:
                View itemView = C28289B8j.LIZ(parent, R.layout.b_4, parent, false);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("create(): itemView = ");
                LIZ2.append(itemView);
                C34B.LIZIZ("VerticalSharePanelTipViewHolder", X1D.LIZIZ(LIZ2));
                o.LJIIIIZZ(itemView, "itemView");
                viewHolder = new C4QK(itemView);
                break;
            case 7:
                viewHolder = C4Q1.LIZ(parent);
                break;
            case 8:
                viewHolder = C4Q2.LIZ(parent, this.LJLIL, false, 0, 1, 0, true);
                break;
            default:
                viewHolder = C108934Ph.LIZ(parent, this.LJLIL, this.LJLJI, false, true);
                break;
        }
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        C13930gf.LIZ(view, new AbstractC13940gg(viewHolder, this) { // from class: X.4QZ
            public InterfaceC65784Pro<String> LJ;
            public final C4QY LJFF;

            @Override // X.AbstractC13940gg
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.AbstractC13940gg
            public final boolean LJI() {
                return false;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.4QY] */
            {
                this.LJ = new AqS151S0100000_1(viewHolder, 1012);
                this.LJFF = new InterfaceC19530ph() { // from class: X.4QY
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view2, String itemID) {
                        String str;
                        Bundle bundle;
                        Bundle bundle2;
                        o.LJIIIZ(itemID, "itemID");
                        if (o.LJ(itemID, "5")) {
                            SharePackage sharePackage = C109014Pp.this.LJLIL.LJLIL;
                            String str2 = null;
                            if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
                                str = bundle2.getString("aid");
                            } else {
                                str = null;
                            }
                            SharePackage sharePackage2 = C109014Pp.this.LJLIL.LJLIL;
                            if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                                str2 = bundle.getString("event_type");
                            }
                            if (str != null) {
                                InterfaceC109364Qy LIZLLL = C7HV.LIZIZ.LIZLLL();
                                if (str2 == null) {
                                    str2 = "";
                                }
                                LIZLLL.LIZJ(str, str2);
                            }
                        }
                    }
                };
            }
        });
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view2 = viewHolder.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    public C109014Pp(SharePanelViewModel viewModel, C107124Ii c107124Ii, C4OT c4ot) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = c107124Ii;
        this.LJLJI = c4ot;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.LJLJL = C221108m2.LIZIZ(C4PU.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C4QB.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (X.C4VT.LIZJ() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        getData().add(r15.LJLJLJ.getValue());
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r3 >= 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x019b, code lost:
    
        notifyDataSetChanged();
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C4P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ(android.content.Context r16, androidx.lifecycle.LifecycleOwner r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109014Pp.LJZ(android.content.Context, androidx.lifecycle.LifecycleOwner, java.util.List):void");
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        Boolean bool;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object LJLLLL = ORZ.LJLLLL(payloads);
        Object obj = null;
        if (LJLLLL instanceof Boolean) {
            bool = (Boolean) LJLLLL;
        } else {
            bool = null;
        }
        boolean z = holder instanceof C108904Pe;
        if (z && bool != null) {
            ((C108904Pe) holder).Q(bool.booleanValue());
        }
        Object LJLLLL2 = ORZ.LJLLLL(payloads);
        if (LJLLLL2 instanceof C4QR) {
            obj = LJLLLL2;
        }
        if (!z || !o.LJ(obj, C4QR.LIZ)) {
            return;
        }
        ((C108904Pe) holder).LJLJLLL = i;
    }
}

package X;

import Y.ACListenerS42S0200000_7;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes8.dex */
public final class GAW extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<? extends G63> LJLIL;
    public final boolean LJLILLLLZI;
    public AI8 LJLJI;
    public String LJLJJI;

    public final void LJLLLLLL() {
        AI9 ai9;
        AI8 ai8 = this.LJLJI;
        AIF aif = null;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        } else {
            ai9 = null;
        }
        if (ai9 instanceof AIF) {
            aif = (AIF) ai9;
        }
        if (aif != null) {
            aif.LJIILIIL("");
        }
        this.LJLJJI = "";
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public GAW(List data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
        this.LJLJJI = "";
        this.LJLILLLLZI = false;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((G63) ListProtector.get(this.LJLIL, i)).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        o.LJIIIZ(holder, "holder");
        G63 publishSettingModel = (G63) ListProtector.get(this.LJLIL, i);
        boolean z3 = holder instanceof C41072GAa;
        Integer valueOf = Integer.valueOf(R.attr.go);
        if (z3) {
            C41072GAa c41072GAa = (C41072GAa) holder;
            if (this.LJLILLLLZI && i != this.LJLIL.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            o.LJIIIZ(publishSettingModel, "publishSettingModel");
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = publishSettingModel.LIZLLL;
            AI8 ai8 = c41072GAa.LJLIL;
            if (C40981G6n.LIZ()) {
                if (publishSettingModel.LJIIL) {
                    c2068389v.LJ = valueOf;
                }
                T5R t5r = new T5R(publishSettingModel.LIZIZ);
                t5r.LIZ(42);
                str2 = t5r;
            } else {
                str2 = publishSettingModel.LIZIZ;
            }
            ai8.setTitle(str2);
            c41072GAa.LJLIL.setIcon(c2068389v);
            SpannableString spannableString = publishSettingModel.LJII;
            if (spannableString == null || spannableString.length() == 0) {
                if (publishSettingModel.LIZJ.length() > 0) {
                    c41072GAa.LJLIL.setSubtitle(publishSettingModel.LIZJ);
                }
            } else {
                h0.LIZLLL(c41072GAa.LJLIL);
                c41072GAa.LJLIL.setSubtitle(publishSettingModel.LJII);
            }
            if (!z2) {
                c41072GAa.LJLILLLLZI.setVisibility(8);
            }
            AI9 accessory = c41072GAa.LJLIL.getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            ((AEY) accessory).LJIILIIL(publishSettingModel.LJ);
            AI9 accessory2 = c41072GAa.LJLIL.getAccessory();
            o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            ((AEY) accessory2).LJIILJJIL(new AqS154S0200000_7(publishSettingModel, c41072GAa, LiveTryModeCountDownThresholdSetting.DEFAULT));
            c41072GAa.LJLIL.setCellEnabled(publishSettingModel.LJIIL);
            AI9 accessory3 = c41072GAa.LJLIL.getAccessory();
            o.LJII(accessory3, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            accessory3.LJFF(publishSettingModel.LJIILIIL);
            InterfaceC88471Ynr<? super View, ? super AI8, C76800UCe> interfaceC88471Ynr = publishSettingModel.LJIIJJI;
            if (interfaceC88471Ynr != null) {
                View itemView = c41072GAa.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                interfaceC88471Ynr.invoke(itemView, c41072GAa.LJLIL);
                return;
            }
            return;
        }
        if (holder instanceof C41073GAb) {
            if (publishSettingModel.LIZ == 104) {
                String str3 = this.LJLJJI;
                o.LJIIIZ(str3, "<set-?>");
                publishSettingModel.LJI = str3;
            }
            C41073GAb c41073GAb = (C41073GAb) holder;
            if (this.LJLILLLLZI && i != this.LJLIL.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = publishSettingModel.LIZLLL;
            AI8 ai82 = c41073GAb.LJLIL;
            if (C40981G6n.LIZ()) {
                c2068389v2.LJ = valueOf;
                T5R t5r2 = new T5R(publishSettingModel.LIZIZ);
                t5r2.LIZ(42);
                str = t5r2;
            } else {
                str = publishSettingModel.LIZIZ;
            }
            ai82.setTitle(str);
            c41073GAb.LJLIL.setIcon(c2068389v2);
            AI9 accessory4 = c41073GAb.LJLIL.getAccessory();
            o.LJII(accessory4, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
            ((AIF) accessory4).LJIILIIL(publishSettingModel.LJI);
            SpannableString spannableString2 = publishSettingModel.LJII;
            if (spannableString2 == null || spannableString2.length() == 0) {
                if (publishSettingModel.LIZJ.length() > 0) {
                    c41073GAb.LJLIL.setSubtitle(publishSettingModel.LIZJ);
                }
            } else {
                h0.LIZLLL(c41073GAb.LJLIL);
                c41073GAb.LJLIL.setSubtitle(publishSettingModel.LJII);
            }
            if (!z) {
                c41073GAb.LJLILLLLZI.setVisibility(8);
            }
            AI9 accessory5 = c41073GAb.LJLIL.getAccessory();
            o.LJII(accessory5, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
            ((AIF) accessory5).LJIILJJIL(new ACListenerS42S0200000_7(publishSettingModel, c41073GAb, 39));
            InterfaceC88471Ynr<? super View, ? super AI8, C76800UCe> interfaceC88471Ynr2 = publishSettingModel.LJIIJJI;
            if (interfaceC88471Ynr2 == null) {
                return;
            }
            View itemView2 = c41073GAb.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            interfaceC88471Ynr2.invoke(itemView2, c41073GAb.LJLIL);
            return;
        }
        if (!(holder instanceof C41075GAd)) {
            return;
        }
        if (this.LJLILLLLZI) {
            this.LJLIL.size();
        }
        o.LJIIIZ(publishSettingModel, "publishSettingModel");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder viewHolder;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i < 80) {
            View view = C28289B8j.LIZ(parent, R.layout.blo, parent, false);
            o.LJIIIIZZ(view, "view");
            viewHolder = new C41072GAa(view);
        } else {
            if (100 <= i) {
                if (i < 1001) {
                    View view2 = C28289B8j.LIZ(parent, R.layout.blr, parent, false);
                    o.LJIIIIZZ(view2, "view");
                    C41073GAb c41073GAb = new C41073GAb(view2);
                    viewHolder = c41073GAb;
                    if (i == 104) {
                        this.LJLJI = c41073GAb.LJLIL;
                        viewHolder = c41073GAb;
                    }
                } else if (i == 1001) {
                    View view3 = C28289B8j.LIZ(parent, R.layout.bnp, parent, false);
                    o.LJIIIIZZ(view3, "view");
                    viewHolder = new C41075GAd(view3);
                }
            }
            View view4 = C28289B8j.LIZ(parent, R.layout.bno, parent, false);
            o.LJIIIIZZ(view4, "view");
            viewHolder = new C41075GAd(view4);
        }
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view5 = viewHolder.itemView;
        if (view5 != null) {
            view5.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
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
}

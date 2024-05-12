package X;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171256np extends AbstractC171276nr<C171286ns> {
    public C171506oE LJLJJI;
    public int LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<EffectModel> list = this.LJLILLLLZI;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    public C171256np(C84507XEp c84507XEp) {
        super(c84507XEp);
        this.LJLJJL = -1;
    }

    public final void LJZ(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            int i = this.LJLJJL;
            if (i != -1) {
                this.LJLJJL = -1;
                notifyItemChanged(i);
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= ((ArrayList) this.LJLILLLLZI).size()) {
                break;
            }
            if (((EffectModel) ListProtector.get(this.LJLILLLLZI, i2)).key.equals(effectPointModel.getKey())) {
                this.LJLJJL = i2;
                break;
            }
            i2++;
        }
        notifyItemChanged(this.LJLJJL);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C171286ns c171286ns = (C171286ns) viewHolder;
        int intValue = ((Number) ListProtector.get(this.LJLJI, i)).intValue();
        EffectModel effectModel = (EffectModel) ListProtector.get(c171286ns.LJLJJLL.LJLILLLLZI, i);
        if (effectModel == null) {
            return;
        }
        c171286ns.LJLIL.LIZLLL(effectModel.iconUrl);
        c171286ns.LJLIL.setText(effectModel.name);
        C81232VuO c81232VuO = c171286ns.LJLIL;
        if (i == c171286ns.LJLJJLL.LJLJJL) {
            z = true;
        } else {
            z = false;
        }
        c81232VuO.LJ(z);
        if (c171286ns.LJLJJL != intValue) {
            c171286ns.LJLJJL = intValue;
            if (intValue != 2) {
                if (intValue != 4) {
                    if (intValue != 8) {
                        if (intValue != 16) {
                            if (intValue == 32) {
                                c171286ns.LJLILLLLZI.setVisibility(0);
                                c171286ns.L();
                            }
                        } else {
                            c171286ns.L();
                            c171286ns.LJLILLLLZI.setVisibility(8);
                        }
                    } else {
                        c171286ns.LJLILLLLZI.setVisibility(0);
                        c171286ns.LJLILLLLZI.setImageResource(R.drawable.th);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c171286ns.LJLILLLLZI, "rotation", 0.0f, 360.0f);
                        c171286ns.LJLJI = ofFloat;
                        ofFloat.setDuration(800L);
                        c171286ns.LJLJI.setRepeatMode(1);
                        c171286ns.LJLJI.setRepeatCount(-1);
                        C149985uc.LIZ(c171286ns.LJLJI);
                        c171286ns.LJLJI.start();
                    }
                } else {
                    c171286ns.LJLILLLLZI.setVisibility(8);
                }
            } else {
                c171286ns.L();
                c171286ns.LJLILLLLZI.setVisibility(0);
            }
        }
        if (effectModel.isGoToCapCutEffect) {
            c171286ns.LJLJJI.setVisibility(0);
        } else {
            c171286ns.LJLJJI.setVisibility(8);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C171286ns c171286ns = new C171286ns(this, C16880lQ.LLLLIILL((LayoutInflater) C16880lQ.LLILL(viewGroup.getContext(), "layout_inflater"), R.layout.be9, viewGroup, false));
        C0AX.LIZ(viewGroup, c171286ns.itemView, R.id.lj7);
        View view = c171286ns.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c171286ns.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C171286ns.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c171286ns.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c171286ns.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C171286ns.class.getName();
        return c171286ns;
    }
}

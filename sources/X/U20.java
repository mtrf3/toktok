package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U20 extends AbstractC029409q<U21> {
    public final boolean LJLIL;
    public final InterfaceC88472Yns<GiftMode, C76800UCe> LJLILLLLZI;
    public GiftMode LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List LIZJ = C76265TwT.LIZJ();
        if (LIZJ != null) {
            return LIZJ.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        GiftMode giftMode;
        List LIZJ = C76265TwT.LIZJ();
        if (LIZJ != null && (giftMode = (GiftMode) ListProtector.get(LIZJ, i)) != null && giftMode.giftId == 0) {
            return 1;
        }
        return 0;
    }

    public U20(boolean z, AqS179S0100000_13 aqS179S0100000_13) {
        this.LJLIL = z;
        this.LJLILLLLZI = aqS179S0100000_13;
    }

    public static void LJLLLLLL(U21 holder, int i) {
        long j;
        o.LJIIIZ(holder, "holder");
        List LIZJ = C76265TwT.LIZJ();
        GiftMode giftMode = null;
        if (LIZJ != null) {
            giftMode = (GiftMode) ListProtector.get(LIZJ, i);
        }
        holder.LJLLI = giftMode;
        if (giftMode != null) {
            U20 u20 = holder.LJLLJ;
            C15640jQ.LIZLLL(holder.LJLIL, giftMode.giftIconImage);
            C47121t6 c47121t6 = holder.LJLJI;
            if (c47121t6 != null) {
                c47121t6.setText(String.valueOf(giftMode.giftPrice));
            }
            boolean z = true;
            if (giftMode.giftId == 0) {
                C47121t6 c47121t62 = holder.LJLJJI;
                if (c47121t62 != null) {
                    c47121t62.setText(C15380j0.LJIILJJIL(R.string.mxu));
                }
                C47121t6 c47121t63 = holder.LJLJJL;
                if (c47121t63 != null) {
                    c47121t63.setText(C15380j0.LJIILJJIL(R.string.mxv));
                }
                holder.LJLILLLLZI.setVisibility(8);
            } else {
                if (giftMode.eventIconImage != null && EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue()) {
                    holder.LJLJLLL.setVisibility(0);
                    holder.LJLL.setVisibility(0);
                    C15650jR.LIZ().LJIIIZ(giftMode.eventIconImage).LJIIJJI(holder.LJLL);
                } else {
                    holder.LJLJLLL.setVisibility(8);
                    holder.LJLL.setVisibility(8);
                }
                C47121t6 c47121t64 = holder.LJLJJI;
                if (c47121t64 != null) {
                    c47121t64.setText(C15380j0.LJIILL(R.string.mxp, giftMode.giftName));
                }
                C47121t6 c47121t65 = holder.LJLJJL;
                if (c47121t65 != null) {
                    c47121t65.setText(C15380j0.LJIILL(R.string.mxw, giftMode.giftName));
                }
                holder.LJLILLLLZI.setVisibility(0);
            }
            C41061jK c41061jK = holder.LJLJJLL;
            if (c41061jK != null) {
                long j2 = giftMode.giftId;
                GiftMode giftMode2 = u20.LJLJI;
                if (giftMode2 != null) {
                    j = giftMode2.giftId;
                } else {
                    j = holder.LJLLILLLL.LJIILL;
                }
                if (j2 != j) {
                    z = false;
                }
                c41061jK.setChecked(z);
            }
            View itemView = holder.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C29306Beo.LJJJLL(itemView, 500L, new AqS144S0200000_13(u20, giftMode, 102));
            ImageModel imageModel = giftMode.giftBackgroundImage;
            if (imageModel != null) {
                C15640jQ.LIZLLL(holder.LJLJL, imageModel);
                C47061t0 c47061t0 = holder.LJLJL;
                if (c47061t0 == null) {
                    return;
                }
                c47061t0.setVisibility(0);
                return;
            }
            C47061t0 c47061t02 = holder.LJLJL;
            if (c47061t02 == null) {
                return;
            }
            c47061t02.setVisibility(8);
        }
    }

    @Override // X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(U21 u21, int i) {
        LJLLLLLL(u21, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final U21 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        U21 u21;
        o.LJIIIZ(parent, "parent");
        LayoutInflater LLZIL = C16880lQ.LLZIL(parent.getContext());
        boolean z = true;
        if (i == 1) {
            View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.d8i, parent, false);
            o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…_all_view, parent, false)");
            u21 = new U21(this, LLLLIILL);
        } else {
            View LLLLIILL2 = C16880lQ.LLLLIILL(LLZIL, R.layout.d8j, parent, false);
            o.LJIIIIZZ(LLLLIILL2, "inflater.inflate(R.layou…gift_view, parent, false)");
            u21 = new U21(this, LLLLIILL2);
        }
        C0AX.LIZ(parent, u21.itemView, R.id.lj7);
        View view = u21.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (u21.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(U21.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) u21.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(u21.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = U21.class.getName();
        return u21;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(U21 u21, int i, List payloads) {
        GiftMode giftMode;
        U21 holder = u21;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.size() <= 0) {
            LJLLLLLL(holder, i);
            return;
        }
        List LIZJ = C76265TwT.LIZJ();
        Long l = null;
        if (LIZJ != null) {
            giftMode = (GiftMode) ListProtector.get(LIZJ, i);
        } else {
            giftMode = null;
        }
        boolean z = false;
        if (ListProtector.get(payloads, 0) instanceof Long) {
            Object obj = ListProtector.get(payloads, 0);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Long");
            Long l2 = (Long) obj;
            if (l2 != null) {
                l2.longValue();
                C41061jK c41061jK = holder.LJLJJLL;
                if (c41061jK != null) {
                    if (giftMode != null) {
                        l = Long.valueOf(giftMode.giftId);
                    }
                    c41061jK.setChecked(o.LJ(l, l2));
                }
                l2.longValue();
                return;
            }
        }
        C41061jK c41061jK2 = holder.LJLJJLL;
        if (c41061jK2 == null) {
            return;
        }
        if (giftMode != null && giftMode.giftId == holder.LJLLILLLL.LJIILL) {
            z = true;
        }
        c41061jK2.setChecked(z);
    }
}

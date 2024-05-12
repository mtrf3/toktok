package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveFirstRechargeGivingCountSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.z0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77596Ucq extends AbstractC029409q<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LJLJJL = 0;
    public final List<Diamond> LJLIL;
    public final InterfaceC77671Ue3 LJLILLLLZI;
    public final RechargeViewModel LJLJI;
    public final Drawable LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((Diamond) ListProtector.get(this.LJLIL, i)).LJLIL;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String str;
        TextView textView;
        Context context;
        o.LJIIIZ(holder, "holder");
        int i2 = 8;
        if (holder instanceof C77621UdF) {
            Diamond itemData = (Diamond) ListProtector.get(this.LJLIL, i);
            C77621UdF c77621UdF = (C77621UdF) holder;
            o.LJIIIZ(itemData, "itemData");
            TextView textView2 = c77621UdF.LJLIL;
            if (textView2 != null) {
                textView2.setText(String.valueOf(itemData.count));
            }
            Drawable drawable = this.LJLJJI;
            String str2 = null;
            if (drawable != null) {
                ViewGroup viewGroup = c77621UdF.LJLJI;
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                } else {
                    context = null;
                }
                if (CCJ.LIZ(context)) {
                    TextView textView3 = c77621UdF.LJLIL;
                    if (textView3 != null) {
                        textView3.setCompoundDrawables(null, null, drawable, null);
                    }
                } else {
                    TextView textView4 = c77621UdF.LJLIL;
                    if (textView4 != null) {
                        textView4.setCompoundDrawables(drawable, null, null, null);
                    }
                }
            }
            boolean rechargePanelIncludeGivingCount = LiveFirstRechargeGivingCountSetting.INSTANCE.rechargePanelIncludeGivingCount();
            if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge() && itemData.givingCount > 0 && rechargePanelIncludeGivingCount) {
                StringBuffer stringBuffer = new StringBuffer("+");
                stringBuffer.append(itemData.givingCount);
                if (CCJ.LIZ(c77621UdF.itemView.getContext()) && (textView = c77621UdF.LJLJJI) != null) {
                    textView.setBackground(C15380j0.LJI(R.drawable.cf0));
                }
                TextView textView5 = c77621UdF.LJLJJI;
                if (textView5 != null) {
                    textView5.setText(stringBuffer.toString());
                }
                TextView textView6 = c77621UdF.LJLJJI;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
            }
            String str3 = itemData.iapId;
            Diamond diamond = this.LJLJI.LLIILII;
            if (diamond != null) {
                str = diamond.iapId;
            } else {
                str = null;
            }
            if (o.LJ(str3, str)) {
                ViewGroup viewGroup2 = c77621UdF.LJLJI;
                if (viewGroup2 != null) {
                    viewGroup2.setBackground(C15380j0.LJI(R.drawable.cp8));
                }
            } else {
                ViewGroup viewGroup3 = c77621UdF.LJLJI;
                if (viewGroup3 != null) {
                    viewGroup3.setBackground(C15380j0.LJI(R.drawable.cp9));
                }
            }
            String str4 = itemData.iapId;
            Diamond diamond2 = this.LJLJI.LLIIL;
            if (diamond2 != null) {
                str2 = diamond2.iapId;
            }
            if (o.LJ(str4, str2) && C77649Udh.LIZ().LIZLLL()) {
                ImageView imageView = c77621UdF.LJLJJL;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            } else {
                ImageView imageView2 = c77621UdF.LJLJJL;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
            TextView textView7 = c77621UdF.LJLILLLLZI;
            if (textView7 != null) {
                textView7.setText(itemData.price);
            }
            c77621UdF.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: X.2QP
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.setScaleX(0.96f);
                        view.setScaleY(0.96f);
                        view.setAlpha(0.64f);
                        return false;
                    }
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return false;
                    }
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setAlpha(1.0f);
                    return false;
                }
            });
            C16880lQ.LJIIJ(new ACListenerS47S0200000_13(this, itemData, 3), c77621UdF.itemView);
            return;
        }
        if (holder instanceof C77673Ue5) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 0), ((C77673Ue5) holder).LJLIL);
            return;
        }
        if (holder instanceof C77584Uce) {
            C77584Uce c77584Uce = (C77584Uce) holder;
            C77596Ucq c77596Ucq = c77584Uce.LJLJL;
            c77596Ucq.LJLJI.LLIIIZ = true;
            int itemViewType = c77596Ucq.getItemViewType(i);
            if (itemViewType != -2) {
                if (itemViewType != -1) {
                    C29306Beo.LJI(c77584Uce.itemView);
                    return;
                }
                BalanceStruct balanceStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL;
                if (balanceStruct.getExchangeInfo() == null) {
                    return;
                }
                C77596Ucq c77596Ucq2 = c77584Uce.LJLJL;
                if (balanceStruct.getUserBalance() == null) {
                    return;
                }
                c77584Uce.L(-1);
                C16880lQ.LJIIJ(new ACListenerS47S0200000_13(c77596Ucq2, c77584Uce, 1), c77584Uce.itemView);
                return;
            }
            if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.LIZ == null) {
                return;
            }
            C77596Ucq c77596Ucq3 = c77584Uce.LJLJL;
            c77584Uce.L(-2);
            C16880lQ.LJIIJ(new ACListenerS47S0200000_13(c77596Ucq3, c77584Uce, 2), c77584Uce.itemView);
            return;
        }
        if (holder instanceof C77625UdJ) {
            Diamond itemData2 = (Diamond) ListProtector.get(this.LJLIL, i);
            C77625UdJ c77625UdJ = (C77625UdJ) holder;
            o.LJIIIZ(itemData2, "itemData");
            TextView textView8 = c77625UdJ.LJLIL;
            if (textView8 != null) {
                textView8.setText(c77625UdJ.itemView.getContext().getString(R.string.kpq));
            }
            TextView textView9 = c77625UdJ.LJLILLLLZI;
            if (textView9 != null) {
                InterfaceC77692UeO interfaceC77692UeO = (InterfaceC77692UeO) C31660Cbg.LIZ.getValue();
                Context context2 = c77625UdJ.itemView.getContext();
                o.LJIIIIZZ(context2, "this.itemView.context");
                textView9.setText(interfaceC77692UeO.LIZIZ(context2));
            }
            ImageView imageView3 = c77625UdJ.LJLJJI;
            if (imageView3 != null) {
                if (((InterfaceC77692UeO) C31660Cbg.LIZ.getValue()).LIZ()) {
                    i2 = 0;
                }
                imageView3.setVisibility(i2);
            }
            if (o.LJ(itemData2, this.LJLJI.LLIILII)) {
                ViewGroup viewGroup4 = c77625UdJ.LJLJI;
                if (viewGroup4 != null) {
                    viewGroup4.setBackground(C15380j0.LJI(R.drawable.cp8));
                }
            } else {
                ViewGroup viewGroup5 = c77625UdJ.LJLJI;
                if (viewGroup5 != null) {
                    viewGroup5.setBackground(C15380j0.LJI(R.drawable.cp9));
                }
            }
            c77625UdJ.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: X.2QP
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.setScaleX(0.96f);
                        view.setScaleY(0.96f);
                        view.setAlpha(0.64f);
                        return false;
                    }
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return false;
                    }
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setAlpha(1.0f);
                    return false;
                }
            });
            C16880lQ.LJIIJ(new ACListenerS47S0200000_13(this, itemData2, 0), c77625UdJ.itemView);
            return;
        }
        if (!(holder instanceof AbstractC77652Udk)) {
            return;
        }
        ((AbstractC77652Udk) holder).L(this, (Diamond) ListProtector.get(this.LJLIL, i));
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c77673Ue5;
        o.LJIIIZ(parent, "parent");
        if (i != -3) {
            if (i != -2 && i != -1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            c77673Ue5 = new C77621UdF(C1FL.LIZIZ(parent, R.layout.d6x, parent, false, "from(parent.context)\n   …e_diamond, parent, false)"));
                        } else {
                            c77673Ue5 = new z0(parent);
                        }
                    } else {
                        c77673Ue5 = new C77597Ucr(parent);
                    }
                } else {
                    c77673Ue5 = new C77625UdJ(C1FL.LIZIZ(parent, R.layout.d6w, parent, false, "from(parent.context)\n   …ge_custom, parent, false)"));
                }
            } else {
                c77673Ue5 = new C77584Uce(this, C1FL.LIZIZ(parent, R.layout.d7b, parent, false, "from(parent.context)\n   …e_enterv2, parent, false)"));
            }
        } else {
            c77673Ue5 = new C77673Ue5(C1FL.LIZIZ(parent, R.layout.d9w, parent, false, "from(parent.context)\n   …_recharge, parent, false)"));
        }
        C0AX.LIZ(parent, c77673Ue5.itemView, R.id.lj7);
        View view = c77673Ue5.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c77673Ue5.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c77673Ue5.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c77673Ue5.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c77673Ue5.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c77673Ue5.getClass().getName();
        return c77673Ue5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C77596Ucq(List<? extends Diamond> chargeItem, InterfaceC77671Ue3 mOnClickDeal, RechargeViewModel viewModel) {
        o.LJIIIZ(chargeItem, "chargeItem");
        o.LJIIIZ(mOnClickDeal, "mOnClickDeal");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = chargeItem;
        this.LJLILLLLZI = mOnClickDeal;
        this.LJLJI = viewModel;
        Drawable LJI = C15380j0.LJI(R.drawable.cub);
        this.LJLJJI = LJI;
        int LIZ = C15380j0.LIZ(16.0f);
        int i = 0;
        if (LJI != null) {
            LJI.setBounds(0, 0, LIZ, LIZ);
        }
        Diamond diamond = viewModel.LLIIL;
        if (diamond != null) {
            viewModel.Jv0(diamond);
        }
        for (Object obj : chargeItem) {
            int i2 = i + 1;
            if (i >= 0) {
                if (((Diamond) obj).LJLIL == 0) {
                    return;
                } else {
                    i = i2;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}

package X;

import Y.ACListenerS31S0300000_5;
import Y.AObserverS73S0100000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelManualSortSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelSwipeSetting;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CqJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32567CqJ extends AbstractC029409q<C32566CqI> {
    public final GiftPanelLeafViewModel LJLIL;
    public List<C32570CqM> LJLILLLLZI = new ArrayList();
    public C32553Cq5 LJLJI;
    public View LJLJJI;
    public int LJLJJL;
    public DataChannel LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<C32570CqM> list = this.LJLILLLLZI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LJLZ(int i) {
        List arrayList;
        C32676Cs4 c32676Cs4;
        C32676Cs4 c32676Cs42;
        ArrayList<GiftPage> arrayList2;
        C32676Cs4 c32676Cs43;
        Fragment fragment;
        BagListViewModel bagListViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        boolean z;
        C32676Cs4 c32676Cs44;
        C32676Cs4 c32676Cs45;
        C32553Cq5 c32553Cq5 = this.LJLJI;
        if (c32553Cq5 != null) {
            if (c32553Cq5.LJJIIJ() == i) {
                AbstractC32579CqV abstractC32579CqV = c32553Cq5.LJLJLJ;
                if ((abstractC32579CqV instanceof C32676Cs4) && (c32676Cs45 = (C32676Cs4) abstractC32579CqV) != null) {
                    C32444CoK.LIZ("giftpanelsort", "sortGiftPanel()");
                    c32676Cs45.LLIIJLIL = true;
                    c32676Cs45.LLIIZ = true;
                    c32676Cs45.LJJLIIIJJIZ(c32676Cs45.LLILLJJLI);
                    if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
                        c32676Cs45.LJJJJZ(i);
                    }
                }
            } else {
                C32785Ctp.LJIILIIL.LJIIIIZZ.clear();
                AbstractC32579CqV abstractC32579CqV2 = c32553Cq5.LJLJLJ;
                if ((abstractC32579CqV2 instanceof C32676Cs4) && (c32676Cs44 = (C32676Cs4) abstractC32579CqV2) != null) {
                    c32676Cs44.LJJLI(i);
                }
                C32580CqW c32580CqW = c32553Cq5.LJLJJL;
                if (c32580CqW != null && (fragment = c32580CqW.getFragment()) != null && fragment.isAdded() && (bagListViewModel = (BagListViewModel) ViewModelProviders.of(fragment).get(BagListViewModel.class)) != null && (mutableLiveData = bagListViewModel.LJLJL) != null) {
                    if (c32553Cq5.LJJIIJ() == 16) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mutableLiveData.setValue(Boolean.valueOf(z));
                }
                if (!LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
                    AbstractC32579CqV abstractC32579CqV3 = c32553Cq5.LJLJLJ;
                    if ((abstractC32579CqV3 instanceof C32676Cs4) && (c32676Cs42 = (C32676Cs4) abstractC32579CqV3) != null) {
                        if (!(abstractC32579CqV3 instanceof C32676Cs4) || (c32676Cs43 = (C32676Cs4) abstractC32579CqV3) == null || (arrayList2 = c32676Cs43.LLILLJJLI) == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        c32676Cs42.LJJLIIIJJIZ(arrayList2);
                    }
                }
                if (c32553Cq5.LJJIIJ() == 1) {
                    AbstractC32579CqV abstractC32579CqV4 = c32553Cq5.LJLJLJ;
                    if (!(abstractC32579CqV4 instanceof C32676Cs4) || (c32676Cs4 = (C32676Cs4) abstractC32579CqV4) == null || (arrayList = c32676Cs4.LLI) == null) {
                        arrayList = new ArrayList();
                    }
                    C32792Ctw.LIZLLL(arrayList);
                }
                C31563Ca7 LJJIIJZLJL = c32553Cq5.LJJIIJZLJL();
                if (LJJIIJZLJL != null) {
                    LJJIIJZLJL.LJJLL();
                }
            }
        }
        this.LJLJJL = i;
        if (i == 5) {
            C32553Cq5 c32553Cq52 = this.LJLJI;
            if (c32553Cq52 != null) {
                c32553Cq52.LJJIJIIJI(false);
            }
        } else {
            C32553Cq5 c32553Cq53 = this.LJLJI;
            if (c32553Cq53 != null) {
                c32553Cq53.LJJIJIIJI(true);
            }
        }
        List<C32570CqM> list = this.LJLILLLLZI;
        if (list != null) {
            int i2 = 0;
            for (C32570CqM c32570CqM : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C32570CqM c32570CqM2 = c32570CqM;
                    int i4 = c32570CqM2.LIZJ;
                    if (i4 == i) {
                        c32570CqM2.LJ = false;
                        if (i4 != 16) {
                            C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                            String str = c32570CqM2.LIZ;
                            if (str == null) {
                                str = "";
                            }
                            Integer valueOf = Integer.valueOf(i);
                            c32785Ctp.getClass();
                            C32785Ctp.LJJ(valueOf, str);
                        } else {
                            C32661Crp.LIZ = System.currentTimeMillis();
                            BZI LIZ = C28787BRn.LIZ("livesdk_backpack_entrance_click");
                            C32661Crp.LIZJ(LIZ);
                            LIZ.LJIIZILJ();
                            LIZ.LJJIIJZLJL();
                        }
                        notifyItemChanged(i2);
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        C32570CqM c32570CqM;
        List<C32570CqM> list = this.LJLILLLLZI;
        if (list != null && (c32570CqM = (C32570CqM) ListProtector.get(list, i)) != null) {
            return c32570CqM.LIZJ;
        }
        return 0;
    }

    public C32567CqJ(C32676Cs4 c32676Cs4, GiftPanelLeafViewModel giftPanelLeafViewModel) {
        MutableLiveData<Integer> mutableLiveData;
        this.LJLIL = giftPanelLeafViewModel;
        if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled() && c32676Cs4 != null && giftPanelLeafViewModel != null && (mutableLiveData = giftPanelLeafViewModel.LJLJJI) != null) {
            mutableLiveData.observe(c32676Cs4, new AObserverS73S0100000_5(this, 1));
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C32566CqI c32566CqI, int i) {
        C32570CqM c32570CqM;
        Integer LJI;
        GiftPanelLeafViewModel LJJII;
        MutableLiveData<GiftPanelBanner> mutableLiveData;
        C32566CqI viewHolder = c32566CqI;
        o.LJIIIZ(viewHolder, "viewHolder");
        List<C32570CqM> list = this.LJLILLLLZI;
        if (list == null || (c32570CqM = (C32570CqM) ListProtector.get(list, i)) == null) {
            return;
        }
        viewHolder.L(c32570CqM);
        C47121t6 c47121t6 = viewHolder.LJLILLLLZI;
        Object tag = c47121t6.getTag();
        o.LJII(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        C16880lQ.LJIJI(c47121t6, new ACListenerS31S0300000_5(this, viewHolder, c32570CqM, 0));
        C16880lQ.LJIILLIIL(viewHolder.LJLJI, new ACListenerS31S0300000_5(this, viewHolder, c32570CqM, 1));
        if (intValue == this.LJLJJL) {
            GiftPanelBanner giftPanelBanner = c32570CqM.LIZLLL;
            C32553Cq5 c32553Cq5 = this.LJLJI;
            if (c32553Cq5 != null && (LJJII = c32553Cq5.LJJII()) != null && (mutableLiveData = LJJII.LJLIL) != null) {
                mutableLiveData.setValue(giftPanelBanner);
            }
            C47121t6 c47121t62 = viewHolder.LJLILLLLZI;
            this.LJLJJI = c47121t62;
            if (intValue == 16) {
                this.LJLJJI = viewHolder.LJLJI;
            }
            c47121t62.setTextColor(ColorProtector.parseColor("#E6FFFFFF"));
            viewHolder.LJLJI.setAlpha(0.9f);
            if (intValue != 1) {
                return;
            }
            View view = this.LJLJJI;
            if (!LiveGiftPanelManualSortSetting.INSTANCE.isEnable() || C32569CqL.LIZJ.getBoolean(C32569CqL.LIZIZ(), false) || !C32569CqL.LIZ) {
                return;
            }
            View LJI2 = C20910rv.LJI(R.layout.dj9, null, false, 12);
            TextView textView = (TextView) LJI2.findViewById(R.id.bud);
            textView.setText(C15380j0.LJIILJJIL(R.string.lli));
            C1YK c1yk = new C1YK(view);
            c1yk.LIZJ = LJI2;
            c1yk.LJIILLIIL = textView.getText();
            c1yk.LJIIL = C78565UsT.LJLIL;
            c1yk.LJI = 5000L;
            c1yk.LJII = true;
            C30770C5u.LIZLLL(new C1YL(c1yk), C09.GIFT_PANEL_SORT);
            return;
        }
        Context context = viewHolder.LJLILLLLZI.getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.dm, context)) != null) {
            viewHolder.LJLILLLLZI.setTextColor(LJI.intValue());
        }
        viewHolder.LJLJI.setAlpha(0.5f);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C32566CqI com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C32566CqI c32566CqI = new C32566CqI(C1FL.LIZIZ(viewGroup, R.layout.d7n, viewGroup, false, "from(viewGroup.context).…el_tab, viewGroup, false)"));
        c32566CqI.LJLILLLLZI.setTag(Integer.valueOf(i));
        c32566CqI.LJLJI.setTag(Integer.valueOf(i));
        C0AX.LIZ(viewGroup, c32566CqI.itemView, R.id.lj7);
        View view = c32566CqI.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c32566CqI.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C32566CqI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c32566CqI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c32566CqI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C32566CqI.class.getName();
        return c32566CqI;
    }

    public final void LJLLLLLL(View view, boolean z, C32570CqM c32570CqM) {
        MutableLiveData<Integer> mutableLiveData;
        GiftPanelLeafViewModel LJJII;
        MutableLiveData<GiftPanelBanner> mutableLiveData2;
        Integer LJI;
        long j;
        MutableLiveData<EnumC32766CtW> mutableLiveData3;
        Object tag = view.getTag();
        o.LJII(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        int i = 0;
        GiftPanelBanner giftPanelBanner = null;
        if (intValue == this.LJLJJL) {
            LiveGiftPanelManualSortSetting liveGiftPanelManualSortSetting = LiveGiftPanelManualSortSetting.INSTANCE;
            if (!liveGiftPanelManualSortSetting.isEnable()) {
                return;
            }
            C32785Ctp.LJIILIIL.LJIIL(c32570CqM.LJI);
            Room LJIILL = C1DH.LJIILL(this.LJLJJLL);
            if (LJIILL != null) {
                j = LJIILL.getId();
            } else {
                j = 0;
            }
            EnumC32766CtW state = c32570CqM.LJI;
            o.LJIIIZ(state, "state");
            EnumC32766CtW nextState = state.nextState();
            if (liveGiftPanelManualSortSetting.getValue() == 2) {
                C32569CqL.LIZIZ.put(Long.valueOf(j), nextState);
            }
            c32570CqM.LJI = nextState;
            if (this.LJLIL != null) {
                i = GiftPanelLeafViewModel.gv0(intValue, nextState);
            }
            c32570CqM.LJFF = i;
            GiftPanelLeafViewModel giftPanelLeafViewModel = this.LJLIL;
            if (giftPanelLeafViewModel != null && (mutableLiveData3 = giftPanelLeafViewModel.LJLLLL) != null) {
                mutableLiveData3.setValue(c32570CqM.LJI);
            }
            LJLZ(intValue);
            return;
        }
        if (c32570CqM != null) {
            giftPanelBanner = c32570CqM.LIZLLL;
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            if (view2 instanceof TextView) {
                Context context = view.getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.dm, context)) != null) {
                    int intValue2 = LJI.intValue();
                    View view3 = this.LJLJJI;
                    o.LJII(view3, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) view3).setTextColor(intValue2);
                }
            } else {
                view2.setAlpha(0.5f);
            }
        }
        this.LJLJJI = view;
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(ColorProtector.parseColor("#E6FFFFFF"));
        } else if (view instanceof ImageView) {
            view.setAlpha(0.9f);
        }
        C32553Cq5 c32553Cq5 = this.LJLJI;
        if (c32553Cq5 != null && (LJJII = c32553Cq5.LJJII()) != null && (mutableLiveData2 = LJJII.LJLIL) != null) {
            mutableLiveData2.setValue(giftPanelBanner);
        }
        GiftPanelLeafViewModel giftPanelLeafViewModel2 = this.LJLIL;
        if (giftPanelLeafViewModel2 != null && (mutableLiveData = giftPanelLeafViewModel2.LJLJJL) != null) {
            mutableLiveData.setValue(Integer.valueOf(intValue));
        }
        C32129CjF.LIZ.LJFF = intValue;
        C32785Ctp.LJIILIIL.LJIIJJI = true;
        LJLZ(intValue);
        if (intValue == 15) {
            InterfaceC30442Bx8.l0.LIZ(Boolean.FALSE);
            ((IFansClubService) CN1.LIZ(IFansClubService.class)).ld0();
        }
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()))) {
            C29813Bmz c29813Bmz = C29813Bmz.LIZ;
            if (c32570CqM != null) {
                i = c32570CqM.LIZJ;
            }
            EnumC29816Bn2 enumC29816Bn2 = EnumC29816Bn2.CLICK;
            c29813Bmz.getClass();
            C29813Bmz.LIZ(i, z, enumC29816Bn2);
        }
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.C111434Yx;
import X.C12460eI;
import X.C214298b3;
import X.C221108m2;
import X.C27474AqM;
import X.C2NU;
import X.C40517FvF;
import X.C40658FxW;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71132Rvs;
import X.C71840SHk;
import X.C71842SHm;
import X.C71846SHq;
import X.C71849SHt;
import X.C71850SHu;
import X.C71851SHv;
import X.C71852SHw;
import X.C71854SHy;
import X.C71855SHz;
import X.C76542zS;
import X.C78613UtF;
import X.C78685UuP;
import X.C78842Uww;
import X.C78926UyI;
import X.C9BE;
import X.EnumC71837SHh;
import X.EnumC71839SHj;
import X.InterfaceC03360Bg;
import X.InterfaceC27761Auz;
import X.ORZ;
import X.SF4;
import X.SFZ;
import X.SIT;
import X.XKX;
import Y.IDrS44S0100000_4;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MessageCenterAssem extends UIContentAssem implements InterfaceC03360Bg, InterfaceC27761Auz {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C55749LuL LJLJJI;
    public final C57939MoZ LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public SIT LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public final C62822Ol8 LJLLL;
    public final IDrS44S0100000_4 LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public MessageCenterAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SellerMessageListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 165), C71849SHt.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MessageCenterViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 166), C71846SHq.INSTANCE, null);
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C27474AqM.class, null), checkSupervisorPrepared());
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C71850SHu.class, null), checkSupervisorPrepared());
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 2;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        this.LJLJJL = c57939MoZ;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 208));
        this.LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 206));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 207));
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 205));
        this.LJLLI = true;
        this.LJLLILLLL = -1L;
        this.LJLLJ = -1L;
        this.LJLLL = C221108m2.LIZIZ(C71854SHy.LJLIL);
        this.LJLLLL = new IDrS44S0100000_4(this, 1);
    }

    public final SF4 C3() {
        return (SF4) this.LJLJL.getValue();
    }

    public final C27474AqM E3() {
        return (C27474AqM) this.LJLJI.getValue();
    }

    public final AtomicInteger F3() {
        return (AtomicInteger) this.LJLLL.getValue();
    }

    public final C71852SHw H3() {
        return (C71852SHw) this.LJLJLLL.getValue();
    }

    public final C71850SHu v3() {
        return (C71850SHu) this.LJLJJI.getValue();
    }

    public final MessageCenterViewModel x3() {
        return (MessageCenterViewModel) this.LJLILLLLZI.getValue();
    }

    public final SFZ A3() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = C71840SHk.LIZ[x3().getState().LJLIL.LIZ.ordinal()];
        int i7 = 0;
        Integer num = 0;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3 && i6 != 4) {
                    return new SFZ(0, 0, 0);
                }
                MessageCenterViewModel x3 = x3();
                SIT sit = this.LJLJLJ;
                if (sit != null) {
                    sit.LIZJ();
                }
                x3.getClass();
                Integer value = C3().LIZ().getValue();
                if (value != null) {
                    num = value;
                }
                int intValue = num.intValue();
                PowerStub LJFF = H3().LJFF();
                PowerAdapter powerAdapter = LJFF.LJLIL;
                powerAdapter.getClass();
                int i8 = -1;
                if (powerAdapter.LJLIL.getLayoutManager() != null) {
                    Integer valueOf = Integer.valueOf(powerAdapter.LLFII());
                    if (valueOf.intValue() >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = valueOf.intValue();
                    } else {
                        i = -1;
                    }
                    Integer valueOf2 = Integer.valueOf(powerAdapter.LLFZ());
                    if (valueOf2.intValue() >= 0) {
                        i2 = valueOf2.intValue();
                    } else {
                        i2 = -1;
                    }
                    Map<C71855SHz, PowerStub> map = powerAdapter.LLF;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        if (o.LJ(entry.getValue(), LJFF)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    C71855SHz c71855SHz = (C71855SHz) ORZ.LJLLL(linkedHashMap.keySet());
                    if (c71855SHz != null) {
                        Integer num2 = (Integer) ORZ.LJLLL(C40658FxW.LJLI(ORZ.LJZI(new C40517FvF(i, i2), C78842Uww.LJJ(c71855SHz.LIZ, c71855SHz.LIZIZ))));
                        if (num2 != null) {
                            i4 = num2.intValue();
                        } else {
                            i4 = LiveLayoutPreloadThreadPriority.DEFAULT;
                        }
                        i3 = i4 - c71855SHz.LIZ;
                    } else {
                        i3 = -1;
                    }
                    Integer valueOf3 = Integer.valueOf(i3);
                    if (valueOf3.intValue() >= 0) {
                        i8 = valueOf3.intValue();
                    }
                }
                int LIZJ = H3().LIZJ();
                if (i8 >= 0 && i8 < ((ArrayList) H3().LIZLLL()).size() && LIZJ >= 0 && LIZJ < ((ArrayList) H3().LIZLLL()).size() && i8 <= LIZJ) {
                    i5 = 0;
                    while (true) {
                        if (ListProtector.get(H3().LIZLLL(), i8) instanceof C111434Yx) {
                            Object obj = ListProtector.get(H3().LIZLLL(), i8);
                            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerConversationItem");
                            if (((C111434Yx) obj).LJLJLLL) {
                                i5++;
                            } else {
                                i7++;
                            }
                        }
                        if (i8 == LIZJ) {
                            break;
                        }
                        i8++;
                    }
                } else {
                    i5 = 0;
                }
                return new SFZ(intValue, i7, i5);
            }
            MessageCenterViewModel x32 = x3();
            SIT sit2 = this.LJLJLJ;
            if (sit2 != null) {
                sit2.LIZJ();
            }
            x32.getClass();
            Integer value2 = C3().LIZ().getValue();
            if (value2 != null) {
                num = value2;
            }
            return new SFZ(num.intValue(), 0, 0);
        }
        return new SFZ(0, 0, 0);
    }

    public final void I3() {
        int i;
        this.LJLLJ = SystemClock.elapsedRealtime();
        x3().hv0(EnumC71839SHj.REFRESHING);
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            ViewGroup message_list = (ViewGroup) _$_findCachedViewById(R.id.ghq);
            o.LJIIIIZZ(message_list, "message_list");
            C12460eI.LIZ(message_list);
            MessageCenterViewModel x3 = x3();
            if (!v3().LJLIL) {
                i = 2;
            } else {
                i = 3;
            }
            if (!v3().LJLJJI) {
                i--;
            }
            x3.LJLIL = i;
            if (v3().LJLJI) {
                MessageCenterViewModel x32 = x3();
                x32.getClass();
                TradeEntranceInfo tradeEntranceInfo = C71132Rvs.LIZIZ;
                if (C78685UuP.LJJJZ(tradeEntranceInfo.getSchema())) {
                    x32.setState(new AqS178S0100000_12(tradeEntranceInfo, 18));
                } else {
                    C71132Rvs.LIZJ(new AqS178S0100000_12(x32, 20));
                }
            }
            C71851SHv c71851SHv = (C71851SHv) this.LJLJJLL.getValue();
            if (c71851SHv != null) {
                XKX.LIZLLL(c71851SHv.LJLJJLL.getAssemVMScope(), C78613UtF.LIZJ, null, new C71842SHm(c71851SHv, null), 2);
            }
            ((AssemSingleListViewModel) this.LJLIL.getValue()).manualListRefresh();
            if (v3().LJLJJI) {
                ((LiveData) C3().LJLJI.getValue()).setValue(EnumC71837SHh.REFRESH);
                return;
            }
            return;
        }
        x3().hv0(EnumC71839SHj.NETWORK_UNAVAILABLE);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        I3();
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        this.LJLLILLLL = SystemClock.elapsedRealtime();
        MessageCenterViewModel x3 = x3();
        x3.getClass();
        x3.LJLJL = "close";
    }

    @Override // X.C8W0
    public final void onStop() {
        int i;
        int intValue;
        super.onStop();
        if (this.LJLLILLLL != -1) {
            SFZ A3 = A3();
            EnumC71839SHj enumC71839SHj = x3().getState().LJLIL.LIZ;
            if (enumC71839SHj == EnumC71839SHj.BOTH || enumC71839SHj == EnumC71839SHj.NOTICE_ONLY || enumC71839SHj == EnumC71839SHj.EMPTY || enumC71839SHj == EnumC71839SHj.MESSAGE_ONLY) {
                i = 1;
            } else {
                i = 0;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = A3.LJLIL;
            int i3 = A3.LJLILLLLZI;
            int i4 = A3.LJLJI;
            String quitType = x3().LJLJL;
            int i5 = (int) (elapsedRealtime - this.LJLLILLLL);
            Map<String, String> LIZ = E3().LIZ();
            o.LJIIIZ(quitType, "quitType");
            HashMap hashMap = new HashMap();
            hashMap.put("ec_message_cnt", Integer.valueOf(i2));
            hashMap.put("seller_message_cnt", Integer.valueOf(i3));
            hashMap.put("is_load_data", Integer.valueOf(i));
            hashMap.put("quit_type", quitType);
            hashMap.put("stay_time", Integer.valueOf(i5));
            hashMap.put("collaborator_message_cnt", Integer.valueOf(i4));
            hashMap.putAll(LIZ);
            C76542zS.LIZ("tiktokec_stay_page", hashMap);
            int i6 = C71840SHk.LIZ[x3().getState().LJLIL.LIZ.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3 && i6 != 4) {
                        return;
                    }
                    Integer value = C3().LIZ().getValue();
                    if (value == null) {
                        value = 0;
                    }
                    int intValue2 = value.intValue();
                    int size = ((ArrayList) H3().LIZLLL()).size();
                    int size2 = ((ArrayList) H3().LIZLLL()).size();
                    for (int i7 = 0; i7 < size2 && !(ListProtector.get(H3().LIZLLL(), i7) instanceof C111434Yx); i7++) {
                        size--;
                    }
                    x3().LJLJLJ = intValue2;
                    x3().LJLJLLL = size;
                    return;
                }
                MessageCenterViewModel x3 = x3();
                Integer value2 = C3().LIZ().getValue();
                if (value2 == null) {
                    intValue = 0;
                } else {
                    intValue = value2.intValue();
                }
                x3.LJLJLJ = intValue;
                x3().LJLJLLL = 0;
                return;
            }
            x3().LJLJLJ = 0;
            x3().LJLJLLL = 0;
        }
    }

    @Override // X.InterfaceC03360Bg
    public final void LJ() {
        I3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.InterfaceC27761Auz
    public final void LJJJJJL(boolean z) {
        if (!z) {
            I3();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem.onViewCreated(android.view.View):void");
    }
}

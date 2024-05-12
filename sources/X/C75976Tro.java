package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Tro, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75976Tro implements InterfaceC76008TsK {
    public final /* synthetic */ AbstractC75977Trp LIZ;

    @Override // X.InterfaceC76008TsK
    public final CJ2 LIZIZ() {
        return this.LIZ.LJLLILLLL;
    }

    @Override // X.InterfaceC76008TsK
    public final CJ2 LIZJ() {
        AbstractC75977Trp abstractC75977Trp = this.LIZ;
        if (!abstractC75977Trp.LJLZ) {
            return abstractC75977Trp.LJLLILLLL;
        }
        CJ2 cj2 = new CJ2();
        Iterator<Object> it = this.LIZ.LJLLILLLL.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C75981Trt) && ((C75981Trt) next).LJLL) {
                cj2.add(next);
            }
        }
        return cj2;
    }

    @Override // X.InterfaceC76008TsK
    public final boolean LIZLLL() {
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LIZ.LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null) {
            return multiCoHostInviteListContract$AbsView.wl();
        }
        return false;
    }

    @Override // X.InterfaceC76008TsK
    public final CJ2 LJ() {
        AbstractC75977Trp abstractC75977Trp = this.LIZ;
        if (!abstractC75977Trp.LJLZ) {
            return abstractC75977Trp.LJLLJ;
        }
        CJ2 cj2 = new CJ2();
        Iterator<Object> it = this.LIZ.LJLLJ.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C75981Trt) && ((C75981Trt) next).LJLL) {
                cj2.add(next);
            }
        }
        return cj2;
    }

    public C75976Tro(AbstractC75977Trp abstractC75977Trp) {
        this.LIZ = abstractC75977Trp;
    }

    @Override // X.InterfaceC76008TsK
    public final void LIZ(CJ2 cj2, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        C75981Trt c75981Trt;
        EnumC75614Tly enumC75614Tly;
        AbstractC75977Trp abstractC75977Trp = this.LIZ;
        abstractC75977Trp.getClass();
        abstractC75977Trp.LJLLILLLL = cj2;
        if (z) {
            AbstractC75977Trp abstractC75977Trp2 = this.LIZ;
            MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) abstractC75977Trp2.LJLILLLLZI;
            if (multiCoHostInviteListContract$AbsView != null) {
                multiCoHostInviteListContract$AbsView.Dl(abstractC75977Trp2.LJIJJ(), true, null, 0, 0, false);
            }
        }
        if (z2) {
            CJ2 cj22 = this.LIZ.LJLLILLLL;
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(C44432HcC.LJI()));
            int i4 = 0;
            if (cj22 != null) {
                int size = cj22.size();
                int i5 = 0;
                i = 0;
                i2 = 0;
                i3 = 0;
                while (i4 < size) {
                    Object obj = cj22.get(i4);
                    if ((obj instanceof C75981Trt) && (enumC75614Tly = (c75981Trt = (C75981Trt) obj).LJLJI) != null) {
                        int i6 = C75613Tlx.LIZ[enumC75614Tly.ordinal()];
                        Integer num = null;
                        if (i6 != 1) {
                            if (i6 == 2) {
                                RivalExtraInfo rivalExtraInfo = c75981Trt.LJLJJI;
                                if (rivalExtraInfo != null) {
                                    num = Integer.valueOf(rivalExtraInfo.showPlayType);
                                }
                                int i7 = EnumC75767ToR.PLAYTYPE_APPLY.value;
                                if (num == null || num.intValue() != i7) {
                                    if (c75981Trt.LJLJLLL) {
                                        i2++;
                                    }
                                } else if (c75981Trt.LJLJLLL) {
                                    i3++;
                                }
                            }
                        } else {
                            RivalExtraInfo rivalExtraInfo2 = c75981Trt.LJLJJI;
                            if (rivalExtraInfo2 != null) {
                                num = Integer.valueOf(rivalExtraInfo2.showPlayType);
                            }
                            int i8 = EnumC75767ToR.PLAYTYPE_APPLY.value;
                            if (num == null || num.intValue() != i8) {
                                if (c75981Trt.LJLJLLL) {
                                    i5++;
                                }
                            } else if (c75981Trt.LJLJLLL) {
                                i++;
                            }
                        }
                    }
                    i4++;
                }
                i4 = i5;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            hashMap.put("status_change_anchor_cnts", String.valueOf(i4));
            hashMap.put("anchor_cnts", String.valueOf(i4));
            hashMap.put("recommend_could_inivte_cnts", String.valueOf(i2));
            hashMap.put("recommend_could_apply_cnts", String.valueOf(i3));
            hashMap.put("mutual_could_apply_cnts", String.valueOf(i));
            hashMap.put("mutual_could_invite_cnts", String.valueOf(i4));
            C29822Bn8.LIZIZ("livesdk_connection_anchor_status_refresh", hashMap);
        }
    }
}

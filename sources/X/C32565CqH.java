package X;

import Y.ARunnableS9S0101000_5;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelManualSortSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CqH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32565CqH implements InterfaceC32521CpZ<AbstractC32350Cmo> {
    public final /* synthetic */ C32553Cq5 LIZ;

    public C32565CqH(C32553Cq5 c32553Cq5) {
        this.LIZ = c32553Cq5;
    }

    @Override // X.InterfaceC32521CpZ
    public final void LIZ(AbstractC32350Cmo data) {
        ArrayList<GiftPage> arrayList;
        List<C32570CqM> list;
        RecyclerView recyclerView;
        C32567CqJ c32567CqJ;
        int i;
        boolean z;
        long j;
        int i2;
        EnumC32766CtW enumC32766CtW;
        MutableLiveData<EnumC32766CtW> mutableLiveData;
        MutableLiveData<EnumC32766CtW> mutableLiveData2;
        C32676Cs4 c32676Cs4;
        o.LJIIIZ(data, "data");
        if (data instanceof C32351Cmp) {
            C32553Cq5 c32553Cq5 = this.LIZ;
            if (c32553Cq5.LJJIIJ() == 5) {
                View view = c32553Cq5.LJLLJ;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = c32553Cq5.LJLLILLLL;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                c32553Cq5.LJJIJIIJIL();
            }
            ArrayList arrayList2 = new ArrayList(8);
            AbstractC32579CqV abstractC32579CqV = c32553Cq5.LJLJLJ;
            AbstractC029409q abstractC029409q = null;
            if (!(abstractC32579CqV instanceof C32676Cs4) || (c32676Cs4 = (C32676Cs4) abstractC32579CqV) == null || (arrayList = c32676Cs4.LLILLJJLI) == null) {
                arrayList = new ArrayList<>();
            }
            Iterator<GiftPage> it = arrayList.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                GiftPage next = it.next();
                if (next.display && next.pageType != 5) {
                    C32570CqM c32570CqM = new C32570CqM();
                    c32570CqM.LIZ = next.pageName;
                    c32570CqM.LIZJ = next.pageType;
                    if (c32553Cq5.LJJII() != null) {
                        int i3 = next.pageType;
                        if (LiveGiftPanelManualSortSetting.INSTANCE.isEnable() && i3 == 1) {
                            Room room = c32553Cq5.LL;
                            if (room != null) {
                                j = room.getId();
                            } else {
                                j = 0;
                            }
                            c32570CqM.LJI = C32569CqL.LIZ(j);
                            if (c32553Cq5.LJJII() != null) {
                                i2 = GiftPanelLeafViewModel.gv0(next.pageType, c32570CqM.LJI);
                            } else {
                                i2 = 0;
                            }
                            c32570CqM.LJFF = i2;
                            GiftPanelLeafViewModel LJJII = c32553Cq5.LJJII();
                            if (LJJII != null && (mutableLiveData2 = LJJII.LJLLLL) != null) {
                                mutableLiveData2.setValue(c32570CqM.LJI);
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("tryShowPanelBottom, state: ");
                            GiftPanelLeafViewModel LJJII2 = c32553Cq5.LJJII();
                            if (LJJII2 != null && (mutableLiveData = LJJII2.LJLLLL) != null) {
                                enumC32766CtW = mutableLiveData.getValue();
                            } else {
                                enumC32766CtW = null;
                            }
                            LIZ.append(enumC32766CtW);
                            C0NB.LIZIZ("giftpanelsort", X1D.LIZIZ(LIZ));
                        }
                    }
                    if (c32553Cq5.LJJII() != null) {
                        z2 = GiftPanelLeafViewModel.iv0(next.pageType);
                    }
                    c32570CqM.LJ = z2;
                    arrayList2.add(c32570CqM);
                }
            }
            if (C32658Crm.LIZJ()) {
                C32570CqM c32570CqM2 = new C32570CqM();
                c32570CqM2.LIZ = "";
                c32570CqM2.LIZJ = 16;
                c32570CqM2.LIZLLL = null;
                if (c32553Cq5.LJJII() != null) {
                    z = GiftPanelLeafViewModel.iv0(16);
                } else {
                    z = false;
                }
                c32570CqM2.LJ = z;
                c32570CqM2.LIZIZ = R.drawable.d38;
                arrayList2.add(c32570CqM2);
                BZI LIZ2 = C28787BRn.LIZ("livesdk_backpack_entrance_show");
                LIZ2.LJIIZILJ();
                C32661Crp.LIZJ(LIZ2);
                LIZ2.LJJIIJZLJL();
            }
            RecyclerView recyclerView2 = c32553Cq5.LJLJLLL;
            if (recyclerView2 != null) {
                abstractC029409q = recyclerView2.getAdapter();
            }
            if ((abstractC029409q instanceof C32567CqJ) && (c32567CqJ = (C32567CqJ) abstractC029409q) != null) {
                c32567CqJ.LJLILLLLZI = arrayList2;
                C32553Cq5 c32553Cq52 = c32567CqJ.LJLJI;
                if (c32553Cq52 != null) {
                    i = c32553Cq52.LJJIIJ();
                } else {
                    i = 0;
                }
                c32567CqJ.LJLJJL = i;
                c32567CqJ.notifyDataSetChanged();
            }
            if (arrayList2.size() <= 1) {
                RecyclerView recyclerView3 = c32553Cq5.LJLJLLL;
                if (recyclerView3 == null) {
                    return;
                }
                recyclerView3.setVisibility(8);
                return;
            }
            RecyclerView recyclerView4 = c32553Cq5.LJLJLLL;
            if (recyclerView4 != null) {
                recyclerView4.setVisibility(0);
            }
            C32567CqJ c32567CqJ2 = c32553Cq5.LJLL;
            if (c32567CqJ2 == null || (list = c32567CqJ2.LJLILLLLZI) == null || !(!list.isEmpty())) {
                return;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C32570CqM c32570CqM3 = (C32570CqM) ORZ.LJLLLLLL(i4, list);
                if (c32570CqM3 != null && c32570CqM3.LIZJ == c32567CqJ2.LJLJJL) {
                    if (i4 <= 0 || (recyclerView = c32553Cq5.LJLJLLL) == null) {
                        return;
                    }
                    recyclerView.postDelayed(new ARunnableS9S0101000_5(i4, c32553Cq5, 0), 20L);
                    return;
                }
            }
        }
    }
}

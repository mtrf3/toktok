package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import fjb.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$postScroll$1$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CsC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32684CsC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ GiftPanelLeafViewModel LJLIL;
    public final /* synthetic */ RunnableC31065CHd LJLILLLLZI;
    public final /* synthetic */ GridLayoutManager LJLJI;
    public final /* synthetic */ C32676Cs4 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32684CsC(GiftPanelLeafViewModel giftPanelLeafViewModel, RunnableC31065CHd runnableC31065CHd, GridLayoutManager gridLayoutManager, C32676Cs4 c32676Cs4, InterfaceC67352kd<? super C32684CsC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = giftPanelLeafViewModel;
        this.LJLILLLLZI = runnableC31065CHd;
        this.LJLJI = gridLayoutManager;
        this.LJLJJI = c32676Cs4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32684CsC(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        Long valueOf;
        int i5;
        int i6;
        int i7;
        int i8;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        C141335gf.LIZJ(obj);
        GiftPanelLeafViewModel giftPanelLeafViewModel = this.LJLIL;
        RunnableC31065CHd recyclerView = this.LJLILLLLZI;
        GridLayoutManager layoutManager = this.LJLJI;
        GiftPanelLeafViewModel LJJIJIL = this.LJLJJI.LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null) {
            linkedList = mutableLiveData.getValue();
        } else {
            linkedList = null;
        }
        GiftPanelLeafViewModel LJJIJIL2 = this.LJLJJI.LJJIJIL();
        if (LJJIJIL2 != null && LJJIJIL2.LJLLJ) {
            z = true;
        } else {
            z = false;
        }
        C32676Cs4 c32676Cs4 = this.LJLJJI;
        List<Long> list = c32676Cs4.LLI;
        java.util.Map<Long, C32830CuY> forceInsertGifts = c32676Cs4.LLIFFJFJJ;
        giftPanelLeafViewModel.getClass();
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(layoutManager, "layoutManager");
        o.LJIIIZ(forceInsertGifts, "forceInsertGifts");
        C32781Ctl.LIZ.LIZLLL();
        int LLILL = layoutManager.LLILL();
        int LLILLJJLI = layoutManager.LLILLJJLI();
        if (LLILL <= LLILLJJLI) {
            int i9 = LLILL;
            i2 = -1;
            i = -1;
            while (true) {
                View LJJIJIL3 = layoutManager.LJJIJIL(i9);
                if (LJJIJIL3 != null) {
                    i5 = LJJIJIL3.getBottom();
                    i6 = LJJIJIL3.getTop();
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int i10 = i5 - i6;
                if (LJJIJIL3 != null) {
                    i7 = LJJIJIL3.getTop();
                } else {
                    i7 = 0;
                }
                double d = i10;
                if (i7 >= (-0.5d) * d) {
                    if (LJJIJIL3 != null) {
                        i8 = LJJIJIL3.getBottom();
                    } else {
                        i8 = Integer.MAX_VALUE;
                    }
                    if (i8 < (d * 0.5d) + recyclerView.getHeight()) {
                        if (i2 == -1) {
                            i2 = i9;
                        }
                        i = i9;
                    }
                }
                if (i9 == LLILLJJLI) {
                    break;
                }
                i9++;
            }
        } else {
            i = -1;
            i2 = -1;
        }
        int i11 = (LLILLJJLI - LLILL) + 1;
        if (LLILL <= LLILLJJLI) {
            i3 = 0;
            i4 = 0;
            while (true) {
                if (linkedList != null) {
                    AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) ORZ.LJLLLLLL(LLILL, linkedList);
                    if (abstractC32698CsQ != null && (valueOf = Long.valueOf(abstractC32698CsQ.LIZJ())) != null) {
                        HashMap<Long, Boolean> hashMap = C32694CsM.LJJIIJZLJL;
                        if (hashMap.containsKey(valueOf)) {
                            Boolean bool = hashMap.get(valueOf);
                            if (bool == null) {
                                bool = Boolean.FALSE;
                            }
                            if (bool.booleanValue()) {
                                i4++;
                            }
                            i3++;
                        }
                    }
                }
                if (LLILL == LLILLJJLI) {
                    break;
                }
                LLILL++;
            }
        } else {
            i3 = 0;
            i4 = 0;
        }
        C32782Ctm.LIZ.LIZ((i2 / 4) + 1, (i / 4) + 1, z, list, i3, i4, i11);
        C88137YiT.LIZ.LIZ = false;
        giftPanelLeafViewModel.hv0(recyclerView, layoutManager, linkedList, list, forceInsertGifts);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

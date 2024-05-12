package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RwU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71170RwU<T extends View> implements IFrameSlot, InterfaceC27538ArO, InterfaceC71247Rxj {
    public PopupCardVO LJLIL;
    public int LJLILLLLZI = 1;
    public T LJLJI;
    public AbstractC71187Rwl LJLJJI;
    public C71248Rxk LJLJJL;
    public C48502J1u LJLJJLL;
    public AbstractC65781Prl LJLJL;
    public AbstractC65781Prl LJLJLJ;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZJ() {
        if (ECommerceService.createIECommerceServicebyMonsterPlugin(false).isLowLevelDevice() && LJIIIZ()) {
            return null;
        }
        return LJIIJ();
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZLLL() {
        if (ECommerceService.createIECommerceServicebyMonsterPlugin(false).isLowLevelDevice() && LJIIIZ()) {
            return null;
        }
        return LJIIJJI();
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final void LJII(String str) {
    }

    public abstract void LJIIIIZZ();

    public abstract boolean LJIIIZ();

    public abstract Animation LJIIJ();

    public abstract Animation LJIIJJI();

    public abstract java.util.Map<String, String> LJIIL();

    public abstract java.util.Map LJIILIIL();

    public abstract void LJIILJJIL(int i, AtmosphereTag atmosphereTag);

    public abstract AbstractC71212RxA LJIILL(Context context);

    public abstract void LJIILLIIL();

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void getLocation() {
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        return "pop_card";
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // X.InterfaceC37828Esy
    public final java.util.Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJFF(Context context) {
        o.LJIIIZ(context, "context");
        AbstractC71212RxA LJIILL = LJIILL(context);
        C70853RrN.LIZJ(this, LJIILL);
        this.LJLJI = LJIILL;
        C71248Rxk c71248Rxk = this.LJLJJL;
        return LJIILL;
    }

    public final void LJIIZILJ(PopupCardVO popupCardVO) {
        String imageUrlKey;
        ArrayList arrayList = new ArrayList();
        if (popupCardVO != null && (imageUrlKey = popupCardVO.getImageUrlKey()) != null) {
            arrayList.add(imageUrlKey);
        }
        PageNodeMonitorService.LJIIIZ().LIZIZ("pop_card", arrayList);
        this.LJLIL = popupCardVO;
        LJIILLIIL();
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }
}

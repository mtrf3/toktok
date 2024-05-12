package com.ss.android.ugc.aweme.api.component.anole.full;

import X.C221108m2;
import X.C222588oQ;
import X.C242549fW;
import X.C51029K0z;
import X.C58189Msb;
import X.C62822Ol8;
import X.C78688UuS;
import X.EnumC2321899i;
import X.InterfaceC58942NBi;
import X.InterfaceC58980NCu;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.anole.full.AnoleFullAboveInteractionContentComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AnoleFullAboveInteractionContentComponent extends BaseCellSlotComponent<AnoleFullAboveInteractionContentComponent> {
    public final C62822Ol8 LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.abb;
    }

    public AnoleFullAboveInteractionContentComponent() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(C58189Msb.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        IAnoleManager LJIIIIZZ;
        C242549fW.LIZ("unBind");
        InterfaceC58942NBi q4 = q4();
        if (q4 != null && (LJIIIIZZ = q4.LJIIIIZZ()) != null) {
            LJIIIIZZ.LJIIJ(EnumC2321899i.ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
        getContainerView().setVisibility(8);
        C242549fW.LIZ("onHolderUnselected");
    }

    public final InterfaceC58942NBi q4() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFeedItemModule panel name = ");
        C222588oQ c222588oQ = a1().LIZLLL;
        String str2 = null;
        if (c222588oQ != null) {
            str = c222588oQ.LJIIIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",item.aweme = ");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        IFeedService iFeedService = (IFeedService) this.LLFII.getValue();
        Context context = getContext();
        C222588oQ c222588oQ2 = a1().LIZLLL;
        if (c222588oQ2 != null) {
            str2 = c222588oQ2.LJIIIZ;
        }
        return iFeedService.LIZJ(context, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), str2, true);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        InterfaceC58942NBi q4;
        IAnoleManager LJIIIIZZ;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C242549fW.LIZ("onBind");
        List LJIJJLI = C78688UuS.LJIJJLI(item.getAweme());
        EnumC2321899i enumC2321899i = EnumC2321899i.ANOLE_ABOVE_INTERACTIVE_SLOT;
        if (((ArrayList) LJIJJLI).contains(enumC2321899i.getSlotName()) && (getContainerView() instanceof ViewGroup) && (q4 = q4()) != null && (LJIIIIZZ = q4.LJIIIIZZ()) != null) {
            LJIIIIZZ.mount((ViewGroup) getContainerView(), enumC2321899i.getSlotName(), new InterfaceC58980NCu() { // from class: X.9fZ
                @Override // X.InterfaceC58980NCu
                public final void LIZ(String slotID, Integer num, Integer num2, Integer num3, Integer num4) {
                    o.LJIIIZ(slotID, "slotID");
                }

                @Override // X.InterfaceC58980NCu
                public final void LIZIZ(boolean z) {
                    if (z) {
                        if (AnoleFullAboveInteractionContentComponent.this.getContainerView().getVisibility() == 0) {
                            AnoleFullAboveInteractionContentComponent.this.getContainerView().setTag(R.id.a60, 0);
                        }
                        AnoleFullAboveInteractionContentComponent.this.getContainerView().setVisibility(8);
                    } else {
                        Object tag = AnoleFullAboveInteractionContentComponent.this.getContainerView().getTag(R.id.a60);
                        if (tag != null) {
                            AnoleFullAboveInteractionContentComponent.this.getContainerView().setVisibility(((Integer) tag).intValue());
                        }
                        AnoleFullAboveInteractionContentComponent.this.getContainerView().setTag(R.id.a60, null);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C242549fW.LIZ("onViewCreated");
        getContainerView().setTag(EnumC2321899i.ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName());
    }
}

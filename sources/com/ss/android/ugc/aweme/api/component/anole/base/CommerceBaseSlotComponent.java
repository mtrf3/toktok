package com.ss.android.ugc.aweme.api.component.anole.base;

import X.C221108m2;
import X.C222588oQ;
import X.C242549fW;
import X.C51029K0z;
import X.C58188Msa;
import X.C62822Ol8;
import X.InterfaceC58942NBi;
import X.InterfaceC58980NCu;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class CommerceBaseSlotComponent extends BaseCellSlotComponent<CommerceBaseSlotComponent> {
    public final C62822Ol8 LLFII;
    public View LLFZ;
    public boolean LLI;

    public abstract String u4();

    public abstract void z4();

    public CommerceBaseSlotComponent() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(C58188Msa.LJLIL);
    }

    public final void q4() {
        IAnoleManager LJIIIIZZ;
        if ((this.LLFZ instanceof ViewGroup) && !this.LLI) {
            this.LLI = true;
            InterfaceC58942NBi r4 = r4();
            if (r4 != null && (LJIIIIZZ = r4.LJIIIIZZ()) != null) {
                View view = this.LLFZ;
                o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                LJIIIIZZ.mount((ViewGroup) view, u4(), new InterfaceC58980NCu() { // from class: X.9fY
                    @Override // X.InterfaceC58980NCu
                    public final void LIZIZ(boolean z) {
                    }

                    @Override // X.InterfaceC58980NCu
                    public final void LIZ(String slotID, Integer num, Integer num2, Integer num3, Integer num4) {
                        o.LJIIIZ(slotID, "slotID");
                        if (!o.LJ(slotID, CommerceBaseSlotComponent.this.u4())) {
                            return;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("changeContainerLayout slotID = ");
                        LIZ.append(slotID);
                        C242549fW.LIZ(X1D.LIZIZ(LIZ));
                        View containerView = CommerceBaseSlotComponent.this.getContainerView();
                        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (num != null) {
                                marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(num.intValue()))));
                            }
                            if (num2 != null) {
                                marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(num2.intValue()))));
                            }
                            if (num3 != null) {
                                marginLayoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(num3.intValue())));
                            }
                            if (num4 != null) {
                                marginLayoutParams.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(num4.intValue())));
                            }
                            containerView.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                });
            }
            C242549fW.LIZ("mount");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        IAnoleManager LJIIIIZZ;
        C242549fW.LIZ("unBind ");
        this.LLI = false;
        InterfaceC58942NBi r4 = r4();
        if (r4 != null && (LJIIIIZZ = r4.LJIIIIZZ()) != null) {
            LJIIIIZZ.LJIIJ(u4());
        }
        C242549fW.LIZ("unmount ");
    }

    public final InterfaceC58942NBi r4() {
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
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        C242549fW.LIZ("onBind ");
        q4();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
        View containerView = getContainerView();
        z4();
        View findViewById = containerView.findViewById(R.id.lm4);
        this.LLFZ = findViewById;
        if (findViewById != null) {
            findViewById.setTag(u4());
        }
        q4();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewAttached slotView = ");
        LIZ.append(this.LLFZ);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C242549fW.LIZ("onViewCreated");
    }
}

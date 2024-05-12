package com.ss.android.ugc.feed.platform.cell.pinch;

import X.AbstractC48820JEa;
import X.C221108m2;
import X.C2K0;
import X.C2MA;
import X.C52253Kf3;
import X.C52480Kii;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C57272Mp;
import X.C59542Vi;
import X.C62822Ol8;
import X.IDR;
import X.InterfaceC222708oc;
import X.InterfaceC222998p5;
import X.InterfaceC55102Lju;
import X.MEK;
import X.MEL;
import X.MEP;
import X.OUP;
import X.X1D;
import Y.IDTListenerS118S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PinchComponent extends BaseCellContentComponent implements PinchAbility, InterfaceC55102Lju {
    public MEP LL;
    public IDTListenerS118S0100000_9 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public ViewGroup LLFZ;
    public InterfaceC222998p5 LLI;
    public final MEL LLIFFJFJJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1479031592) {
            return null;
        }
        return this;
    }

    public PinchComponent() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1311));
        this.LLFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 720));
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1310));
        this.LLFII = C221108m2.LIZIZ(MEK.LJLIL);
        this.LLIFFJFJJ = new MEL(this);
    }

    public final IVideoCellAbility b4() {
        return (IVideoCellAbility) this.LLF.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final void unBind() {
        MEP mep = this.LL;
        if (mep != null) {
            MEL listener = this.LLIFFJFJJ;
            o.LJIIIZ(listener, "listener");
            if (o.LJ(mep.LJIIIIZZ, listener)) {
                mep.LJIIIIZZ = null;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.pinch.PinchAbility
    public final View.OnTouchListener z() {
        return this.LLD;
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (!((Boolean) C52253Kf3.LIZ.getValue()).booleanValue()) {
            TF(item);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.pinch.PinchAbility
    public final void TF(VideoItemParams videoItemParams) {
        Aweme aweme;
        boolean z;
        boolean z2;
        C2MA c2ma;
        C2MA c2ma2;
        InterfaceC222708oc LLLJ;
        IDR iBaseListFragmentPanel;
        C2MA curViewHolder;
        InterfaceC222708oc LLLJ2;
        ViewGroup Dp;
        InterfaceC222708oc LLLJ3;
        InterfaceC222708oc LLLJ4;
        if (!C57272Mp.LIZ()) {
            return;
        }
        ViewGroup viewGroup = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        IVideoCellAbility b4 = b4();
        if (b4 != null && (LLLJ4 = b4.LLLJ()) != null && LLLJ4.UU() == 2) {
            z = true;
        } else {
            z = false;
        }
        IVideoCellAbility b42 = b4();
        if (b42 != null && (LLLJ3 = b42.LLLJ()) != null) {
            z2 = LLLJ3.Jk0();
        } else {
            z2 = false;
        }
        if (aweme != null && !aweme.isAd() && !z && !OUP.LJJIII(aweme) && z2) {
            if (C54838Lfe.LJJI(aweme)) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLFFF.getValue();
                if (iFeedPanelPlatformAbility == null || (iBaseListFragmentPanel = iFeedPanelPlatformAbility.getIBaseListFragmentPanel()) == null || (curViewHolder = iBaseListFragmentPanel.getCurViewHolder()) == null || (LLLJ2 = curViewHolder.LLLJ()) == null || (Dp = LLLJ2.Dp()) == null) {
                    return;
                }
                MEP mep = this.LL;
                if (mep != null) {
                    mep.LJIIIZ = Dp;
                }
                if (C59542Vi.LIZ() || (curViewHolder = curViewHolder.Y6()) != null) {
                    curViewHolder.C7(new IDTListenerS118S0100000_9(this, 6));
                }
                MEP mep2 = this.LL;
                if (mep2 == null) {
                    return;
                }
                MEL listener = this.LLIFFJFJJ;
                o.LJIIIZ(listener, "listener");
                mep2.LJIIIIZZ = listener;
                return;
            }
            IVideoCellAbility b43 = b4();
            if (b43 != null && (LLLJ = b43.LLLJ()) != null) {
                viewGroup = LLLJ.Dp();
            }
            this.LLFZ = viewGroup;
            if (viewGroup == null) {
                return;
            }
            MEP mep3 = this.LL;
            if (mep3 != null) {
                mep3.LJIIIZ = viewGroup;
            }
            IVideoCellAbility b44 = b4();
            if ((b44 instanceof C2MA) && (c2ma2 = (C2MA) b44) != null) {
                c2ma2.C7(this.LLD);
            }
            MEP mep4 = this.LL;
            if (mep4 == null) {
                return;
            }
            MEL listener2 = this.LLIFFJFJJ;
            o.LJIIIZ(listener2, "listener");
            mep4.LJIIIIZZ = listener2;
            return;
        }
        IVideoCellAbility b45 = b4();
        if (!(b45 instanceof C2MA) || (c2ma = (C2MA) b45) == null) {
            return;
        }
        c2ma.C7(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC222998p5 interfaceC222998p5;
        IDR iBaseListFragmentPanel;
        MEP mep;
        o.LJIIIZ(view, "view");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LL = new MEP(context);
        this.LLD = new IDTListenerS118S0100000_9(this, 5);
        if (C52480Kii.LIZ() && (mep = this.LL) != null) {
            mep.LIZIZ = PinchToClearModeSettings.LIZ().minScale;
            mep.LIZJ = PinchToClearModeSettings.LIZ().maxScale;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLFFF.getValue();
        if (iFeedPanelPlatformAbility != null && (iBaseListFragmentPanel = iFeedPanelPlatformAbility.getIBaseListFragmentPanel()) != null) {
            interfaceC222998p5 = iBaseListFragmentPanel.getPinchListener();
        } else {
            interfaceC222998p5 = null;
        }
        this.LLI = interfaceC222998p5;
    }

    public static void c4(PinchComponent pinchComponent, boolean z) {
        IDR iBaseListFragmentPanel;
        C2MA curViewHolder;
        IFeedCleanAbility iFeedCleanAbility = (IFeedCleanAbility) pinchComponent.LLFF.getValue();
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.Wu0(z, null, true);
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) pinchComponent.LLFFF.getValue();
        if (iFeedPanelPlatformAbility != null && (iBaseListFragmentPanel = iFeedPanelPlatformAbility.getIBaseListFragmentPanel()) != null && (curViewHolder = iBaseListFragmentPanel.getCurViewHolder()) != null) {
            curViewHolder.v7(z);
        }
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) pinchComponent.LLFII.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[toggleClean] ");
        LIZ.append(z);
        LIZ.append(" immediately: ");
        LIZ.append(true);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }
}

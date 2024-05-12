package X;

import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Btt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30241Btt implements InterfaceC30263BuF, InterfaceC30265BuH {
    QUESTION(C88241Yk9.LIZJ(C88289Ykv.LJLIL)),
    CUSTOM_POLL(C88241Yk9.LIZJ(C88386YmU.LJLIL)),
    INTERACTION_PK(C88241Yk9.LIZJ(C88294Yl0.LJLIL)),
    COHOST(C88241Yk9.LIZJ(C88295Yl1.LJLIL)),
    TRY_MODE_COHOST(C88241Yk9.LIZJ(C88352Ylw.LJLIL)),
    MULTIGUEST(C88241Yk9.LIZJ(C88280Ykm.LJLIL)),
    TRY_MODE_MULTIGUEST(C88241Yk9.LIZJ(C88373YmH.LJLIL)),
    MULTI_GUEST_MIC(C88241Yk9.LIZJ(C88378YmM.LJLIL)),
    MULTI_GUEST_VIDEO(C88241Yk9.LIZJ(C88342Ylm.LJLIL)),
    MULTI_GUEST_MANAGE(C88241Yk9.LIZJ(C88347Ylr.LJLIL)),
    MULTI_GUEST_LIVE_SHOW(C88241Yk9.LIZJ(C88283Ykp.LJLIL)),
    SLOT(C88241Yk9.LIZJ(C88369YmD.LJLIL)),
    AUDIENCE_SLOT(C88241Yk9.LIZJ(C88383YmR.LJLIL)),
    ICON_SLOT(C88241Yk9.LIZJ(C88384YmS.LJLIL)),
    INTERACTION_FEATURES(C88241Yk9.LIZJ(C88284Ykq.LJLIL)),
    AUDIENCE_INTERACTION_FEATURES(C88241Yk9.LIZJ(C88285Ykr.LJLIL)),
    SHARE(C88241Yk9.LIZJ(C88286Yks.LJLIL)),
    EFFECT(C88241Yk9.LIZJ(C88287Ykt.LJLIL)),
    MORE(C88241Yk9.LIZJ(C88288Yku.LJLIL)),
    LANDSCAPE_MESSAGE(C88241Yk9.LIZJ(C88290Ykw.LJLIL)),
    GIFT(C88241Yk9.LIZJ(C88281Ykn.LJLIL)),
    FAST_GIFT(C88241Yk9.LIZJ(C88357Ym1.LJLIL)),
    DUMMY_GIFT(C88241Yk9.LIZJ(C88282Yko.LJLIL)),
    DUMMY_FAST_GIFT(C88241Yk9.LIZJ(C88385YmT.LJLIL)),
    ANCHOR_PARTNERSHIP(C88241Yk9.LIZJ(C88291Ykx.LJLIL)),
    ANCHOR_PARTNERSHIP_DROPS(C88241Yk9.LIZJ(C88292Yky.LJLIL)),
    AUDIENCE_PARTNERSHIP(C88241Yk9.LIZJ(C88364Ym8.LJLIL)),
    AUDIENCE_LANDSCAPE_PARTNERSHIP(C88241Yk9.LIZJ(C88331Ylb.LJLIL)),
    ANCHOR_SUBSCRIPTION(C88241Yk9.LIZJ(C88293Ykz.LJLIL)),
    AUDIENCE_SUBSCRIPTION(C88241Yk9.LIZJ(C88335Ylf.LJLIL));

    public static final C30256Bu8 Companion = new C30256Bu8();
    public final java.util.Map<EnumC30259BuB, C30278BuU> LJLIL;
    public final EnumC30086BrO LJLILLLLZI;
    public final java.util.Set<EnumC30250Bu2> LJLJI;
    public final java.util.Set<EnumC30206BtK> LJLJJI;
    public InterfaceC30263BuF LJLJJL;
    public InterfaceC30265BuH LJLJJLL;

    EnumC30241Btt() {
        throw null;
    }

    public static EnumC30241Btt valueOf(String str) {
        return (EnumC30241Btt) V0N.LJJJ(EnumC30241Btt.class, str);
    }

    public final java.util.Set<EnumC30206BtK> getLocations() {
        return this.LJLJJI;
    }

    public final EnumC30086BrO getPriority() {
        return this.LJLILLLLZI;
    }

    public final java.util.Set<EnumC30250Bu2> getRoles() {
        return this.LJLJI;
    }

    public final TBViewModel getViewModel(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C30242Btu T00 = ((IToolbarService) CN1.LIZ(IToolbarService.class)).T00(dataChannel);
        if (T00 != null) {
            return T00.LIZLLL(this);
        }
        return null;
    }

    @Override // X.InterfaceC30263BuF
    public Integer icon(EnumC30259BuB theme) {
        InterfaceC30263BuF interfaceC30263BuF;
        Integer icon;
        o.LJIIIZ(theme, "theme");
        InterfaceC30263BuF interfaceC30263BuF2 = this.LJLJJL;
        if (interfaceC30263BuF2 == null || (icon = interfaceC30263BuF2.icon(theme)) == null) {
            C30278BuU c30278BuU = this.LJLIL.get(theme);
            if (c30278BuU != null && (interfaceC30263BuF = c30278BuU.LIZ) != null) {
                return interfaceC30263BuF.icon(theme);
            }
            return null;
        }
        return icon;
    }

    @Override // X.InterfaceC30263BuF
    public C30233Btl iconConfig(EnumC30259BuB theme) {
        InterfaceC30263BuF interfaceC30263BuF;
        C30233Btl iconConfig;
        o.LJIIIZ(theme, "theme");
        InterfaceC30263BuF interfaceC30263BuF2 = this.LJLJJL;
        if (interfaceC30263BuF2 == null || (iconConfig = interfaceC30263BuF2.iconConfig(theme)) == null) {
            C30278BuU c30278BuU = this.LJLIL.get(theme);
            if (c30278BuU != null && (interfaceC30263BuF = c30278BuU.LIZ) != null) {
                return interfaceC30263BuF.iconConfig(theme);
            }
            return null;
        }
        return iconConfig;
    }

    @Override // X.InterfaceC30265BuH
    public boolean isLiveDesignLayout(EnumC30259BuB theme) {
        C30278BuU c30278BuU;
        InterfaceC30265BuH interfaceC30265BuH;
        o.LJIIIZ(theme, "theme");
        if (this.LJLJJLL != null || (c30278BuU = this.LJLIL.get(theme)) == null || (interfaceC30265BuH = c30278BuU.LIZIZ) == null || !interfaceC30265BuH.isLiveDesignLayout(theme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30265BuH
    public Integer layoutID(EnumC30259BuB theme) {
        InterfaceC30265BuH interfaceC30265BuH;
        Integer layoutID;
        o.LJIIIZ(theme, "theme");
        InterfaceC30265BuH interfaceC30265BuH2 = this.LJLJJLL;
        if (interfaceC30265BuH2 == null || (layoutID = interfaceC30265BuH2.layoutID(theme)) == null) {
            C30278BuU c30278BuU = this.LJLIL.get(theme);
            if (c30278BuU != null && (interfaceC30265BuH = c30278BuU.LIZIZ) != null) {
                return interfaceC30265BuH.layoutID(theme);
            }
            return null;
        }
        return layoutID;
    }

    @Override // X.InterfaceC30263BuF
    public Integer text(EnumC30259BuB theme) {
        InterfaceC30263BuF interfaceC30263BuF;
        Integer text;
        o.LJIIIZ(theme, "theme");
        InterfaceC30263BuF interfaceC30263BuF2 = this.LJLJJL;
        if (interfaceC30263BuF2 == null || (text = interfaceC30263BuF2.text(theme)) == null) {
            C30278BuU c30278BuU = this.LJLIL.get(theme);
            if (c30278BuU != null && (interfaceC30263BuF = c30278BuU.LIZ) != null) {
                return interfaceC30263BuF.text(theme);
            }
            return null;
        }
        return text;
    }

    @Override // X.InterfaceC30263BuF
    public Integer title(EnumC30259BuB theme) {
        InterfaceC30263BuF interfaceC30263BuF;
        Integer title;
        o.LJIIIZ(theme, "theme");
        InterfaceC30263BuF interfaceC30263BuF2 = this.LJLJJL;
        if (interfaceC30263BuF2 == null || (title = interfaceC30263BuF2.title(theme)) == null) {
            C30278BuU c30278BuU = this.LJLIL.get(theme);
            if (c30278BuU != null && (interfaceC30263BuF = c30278BuU.LIZ) != null) {
                return interfaceC30263BuF.title(theme);
            }
            return null;
        }
        return title;
    }

    public final C76800UCe unload(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C30242Btu T00 = ((IToolbarService) CN1.LIZ(IToolbarService.class)).T00(dataChannel);
        if (T00 != null) {
            T00.LJFF(this);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final void withDataConfig(InterfaceC30263BuF config) {
        o.LJIIIZ(config, "config");
        this.LJLJJL = config;
    }

    public final void withLayoutConfig(InterfaceC30265BuH config) {
        o.LJIIIZ(config, "config");
        this.LJLJJLL = config;
    }

    EnumC30241Btt(java.util.Map map) {
        EnumC30086BrO enumC30086BrO = EnumC30086BrO.P1;
        this.LJLIL = map;
        this.LJLILLLLZI = enumC30086BrO;
        this.LJLJI = null;
        this.LJLJJI = null;
    }

    public final C76800UCe load(DataChannel dataChannel, InterfaceC30264BuG behavior, InterfaceC88472Yns<? super TBViewModel, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(behavior, "behavior");
        C30242Btu T00 = ((IToolbarService) CN1.LIZ(IToolbarService.class)).T00(dataChannel);
        if (T00 != null) {
            T00.LJ(this, behavior, interfaceC88472Yns);
            return C76800UCe.LIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C76800UCe load$default(EnumC30241Btt enumC30241Btt, DataChannel dataChannel, InterfaceC30264BuG interfaceC30264BuG, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                interfaceC88472Yns = null;
            }
            return enumC30241Btt.load(dataChannel, interfaceC30264BuG, interfaceC88472Yns);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
    }
}

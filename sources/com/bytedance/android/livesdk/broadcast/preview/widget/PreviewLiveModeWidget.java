package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.AbstractC029409q;
import X.B83;
import X.BHT;
import X.BUR;
import X.BYV;
import X.BZI;
import X.C06510Nj;
import X.C0H;
import X.C0J;
import X.C0K;
import X.C0M;
import X.C0N;
import X.C0N7;
import X.C0NA;
import X.C0U;
import X.C15380j0;
import X.C1Q4;
import X.C259910h;
import X.C28509BGv;
import X.C28787BRn;
import X.C29180Bcm;
import X.C29374Bfu;
import X.C30444BxA;
import X.C30576BzI;
import X.C30577BzJ;
import X.C30579BzL;
import X.C30586BzS;
import X.C30620C0a;
import X.C30621C0b;
import X.C30624C0e;
import X.C38995FSd;
import X.C40141hq;
import X.C65352Pkq;
import X.C70657RoD;
import X.C7N;
import X.EnumC30410Bwc;
import X.InterfaceC05190Ih;
import X.InterfaceC30622C0c;
import X.InterfaceC30713C3p;
import X.InterfaceC31781Cdd;
import X.OSZ;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.PreviewHideLiveModeChannel;
import com.bytedance.android.livesdk.broadcast.SmoothScrollToVideoEvent;
import com.bytedance.android.livesdk.dataChannel.DeepLinkAutoLinkToLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.DeepLinkLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.GameGuideChangeLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveStudioTipsClickEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkPreviewLiveModeFixCombineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewLiveModeWidget extends PreviewWidget {
    public final ArrayList<C0M> LJLJI = new ArrayList<>(0);
    public int LJLJJI = -1;
    public final C29180Bcm LJLJJL;
    public boolean LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public boolean LJLLILLLL;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean LJLZ() {
        return false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq0;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        boolean z;
        super.LJZL();
        InterfaceC30713C3p SN = C7N.LJIJ().SN();
        if (SN != null) {
            SN.LIZ();
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 244));
        } else {
            C0N7.LJIJ(this.LJLJLJ);
        }
        if (this.LJLJLLL && LiveAnchorScreenshotEnableSetting.INSTANCE.enable()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLLI) {
            C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.av1, this.context);
            if (LIZLLL != null) {
                LIZLLL.setTint(C15380j0.LIZIZ(R.color.bc));
            } else {
                LIZLLL = null;
            }
            C1Q4 LIZLLL2 = C259910h.LIZLLL(R.attr.av1, this.context);
            if (LIZLLL2 != null) {
                LIZLLL2.setTint(C15380j0.LIZIZ(R.color.bg));
            } else {
                LIZLLL2 = null;
            }
            C0M c0m = new C0M(R.string.n95, -1, -1, LiveMode.LIVE_VOICE, false, LIZLLL, LIZLLL2);
            this.LJLJI.add(c0m);
            EnumC30410Bwc enumC30410Bwc = EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_VOICE_CHAT;
            o.LJIIIZ(enumC30410Bwc, "<this>");
            C30444BxA.LIZLLL(enumC30410Bwc, "fixed");
            C30444BxA.LIZJ(enumC30410Bwc, this, null, new AqS136S0200000_5(c0m, this, 30), 2);
        }
        if (this.LJLJL) {
            this.LJLJI.add(new C0M(R.string.kg6, R.drawable.coz, R.drawable.cp0, LiveMode.VIDEO));
        }
        if (z) {
            this.LJLJI.add(new C0M(R.string.mki, R.drawable.cow, R.drawable.cox, LiveMode.SCREEN_RECORD));
        }
        if (this.LJLL) {
            this.LJLJI.add(new C0M(R.string.mmc, R.drawable.col, R.drawable.com, LiveMode.LIVE_STUDIO));
        }
        if (this.LJLJLJ) {
            this.LJLJI.add(new C0M(R.string.mka, R.drawable.coh, R.drawable.coi, LiveMode.THIRD_PARTY));
        }
        if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment() && this.LJLJL && this.LJLJI.size() == 1) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(PreviewHideLiveModeChannel.class, Boolean.TRUE);
            }
            hide();
        } else {
            Iterator<C0M> it = this.LJLJI.iterator();
            while (it.hasNext()) {
                C0M next = it.next();
                BZI LIZ = C28787BRn.LIZ("livesdk_live_take_type_entrance_show");
                C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
                LIZ.LJIJJ(C28509BGv.LIZ(next.LJ), "show_live_type");
                LIZ.LJJIIJZLJL();
            }
            C30620C0a LLFII = LLFII();
            if (LLFII != null) {
                LLFII.setAdapter(new C0N(this, this.LJLJI));
            }
        }
        C30620C0a LLFII2 = LLFII();
        if (LLFII2 != null) {
            LLFII2.LJLIL.LJIIJ(new C0K(LLFII2.getContext(), LLFII2.LJLIL, new C0J(this)));
        }
        C30620C0a LLFII3 = LLFII();
        if (LLFII3 != null) {
            C0U c0u = new C0U(this);
            C40141hq c40141hq = LLFII3.LJLJI;
            if (c40141hq instanceof C30621C0b) {
                C30621C0b c30621C0b = (C30621C0b) c40141hq;
                if (c30621C0b.LJFF == null) {
                    c30621C0b.LJFF = new ArrayList();
                }
                ((ArrayList) c30621C0b.LJFF).add(c0u);
            }
            RecyclerView recyclerView = LLFII3.LJLIL;
            if (recyclerView instanceof C30624C0e) {
                C30624C0e c30624C0e = (C30624C0e) recyclerView;
                if (c30624C0e.LLLFF == null) {
                    c30624C0e.LLLFF = new ArrayList();
                }
                List<InterfaceC30622C0c> list = c30624C0e.LLLFF;
                if (list != null) {
                    ((ArrayList) list).add(c0u);
                }
            }
        }
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS41S0100000_5(this, 243));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, PreviewLiveStudioTipsClickEvent.class, new AqS171S0100000_5(this, 180));
            dataChannel2.lv0(this, DeepLinkAutoLinkToLiveModeChannel.class, new AqS171S0100000_5(this, 181));
            dataChannel2.lv0(this, GameGuideChangeLiveModeChannel.class, new AqS171S0100000_5(this, 182));
        }
        DataChannelGlobal.LJLJJI.nv0(this, this, SmoothScrollToVideoEvent.class, new AqS171S0100000_5(this, 183));
        View view2 = getView();
        if (view2 != null) {
            view2.post(new ARunnableS41S0100000_5(this, 61));
        }
        if (this.LJLL) {
            C0NA.LIZJ(C65352Pkq.LIZ(LiveStudioTagShowChannel.class));
        }
    }

    public final String LLFFF() {
        OSZ osz;
        String str;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (osz = (OSZ) dataChannel.kv0(BYV.class)) == null || (str = (String) osz.getFirst()) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (X.C29306Beo.LJJIFFI(r0) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreviewLiveModeWidget() {
        /*
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 0
            r0.<init>(r2)
            r5.LJLJI = r0
            r0 = -1
            r5.LJLJJI = r0
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baj> r0 = X.C29053Baj.class
            java.lang.Object r1 = r3.mv0(r0)
            X.Bcm r1 = (X.C29180Bcm) r1
            r5.LJLJJL = r1
            java.lang.Class<X.Bai> r0 = X.C29052Bai.class
            java.lang.Object r3 = r3.mv0(r0)
            X.BUT r3 = (X.BUT) r3
            r4 = 0
            if (r1 == 0) goto Ld5
            boolean r0 = r1.LJLIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2b:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 != 0) goto L3f
            if (r3 == 0) goto Ld2
            boolean r0 = r3.LJLIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L39:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto Lcf
        L3f:
            r0 = 1
        L40:
            r5.LJLJL = r0
            if (r1 == 0) goto Lcc
            boolean r0 = r1.LJLJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L4a:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 != 0) goto L5e
            if (r3 == 0) goto Lca
            boolean r0 = r3.LJLJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L58:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto Lc8
        L5e:
            r0 = 1
        L5f:
            r5.LJLJLJ = r0
            if (r1 == 0) goto Lc6
            boolean r0 = r1.LJLILLLLZI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L69:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 != 0) goto L7d
            if (r3 == 0) goto Lc4
            boolean r0 = r3.LJLILLLLZI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L77:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto Lc2
        L7d:
            r0 = 1
        L7e:
            r5.LJLJLLL = r0
            if (r1 == 0) goto Lc0
            boolean r0 = r1.LJLJJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L88:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 != 0) goto Laa
            if (r1 == 0) goto Lbe
            boolean r0 = r1.LJLJJL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L96:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto Lab
            if (r1 == 0) goto Lbc
            boolean r0 = r1.LJLIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        La4:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto Lab
        Laa:
            r2 = 1
        Lab:
            r5.LJLL = r2
            if (r1 == 0) goto Lb5
            boolean r0 = r1.LJLJJLL
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        Lb5:
            boolean r0 = X.C29306Beo.LJJIFFI(r4)
            r5.LJLLI = r0
            return
        Lbc:
            r0 = r4
            goto La4
        Lbe:
            r0 = r4
            goto L96
        Lc0:
            r0 = r4
            goto L88
        Lc2:
            r0 = 0
            goto L7e
        Lc4:
            r0 = r4
            goto L77
        Lc6:
            r0 = r4
            goto L69
        Lc8:
            r0 = 0
            goto L5f
        Lca:
            r0 = r4
            goto L58
        Lcc:
            r0 = r4
            goto L4a
        Lcf:
            r0 = 0
            goto L40
        Ld2:
            r0 = r4
            goto L39
        Ld5:
            r0 = r4
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget.<init>():void");
    }

    public final C30620C0a LLFII() {
        View view = getView();
        if (view instanceof C30620C0a) {
            return (C30620C0a) view;
        }
        return null;
    }

    public final boolean LLFF(int i) {
        if (i >= 0 && i <= this.LJLJI.size() - 1) {
            return true;
        }
        return false;
    }

    public final void LLIIII(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        C30576BzI.LIZ = liveMode;
        C30579BzL S00 = C30577BzJ.LIZJ().S00();
        if (S00 != null) {
            S00.LJII(C30576BzI.LIZ);
        }
        BHT.LIZ().iV(liveMode);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LiveModeChannel.class, liveMode);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(PreviewPageSelectLiveMode.class, liveMode);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void setWidgetCallback(InterfaceC31781Cdd widgetCallback) {
        LiveMode liveMode;
        LiveMode liveMode2;
        o.LJIIIZ(widgetCallback, "widgetCallback");
        super.setWidgetCallback(widgetCallback);
        if (LivesdkPreviewLiveModeFixCombineSetting.INSTANCE.getValue() && LLFFF().length() > 0) {
            String LLFFF = LLFFF();
            switch (LLFFF.hashCode()) {
                case -416447130:
                    if (LLFFF.equals("screenshot")) {
                        liveMode = LiveMode.SCREEN_RECORD;
                        break;
                    }
                    liveMode = LiveMode.VIDEO;
                    break;
                case 109824:
                    if (LLFFF.equals("obs")) {
                        liveMode = LiveMode.THIRD_PARTY;
                        break;
                    }
                    liveMode = LiveMode.VIDEO;
                    break;
                case 1030087622:
                    if (LLFFF.equals("livevoice")) {
                        liveMode = LiveMode.LIVE_VOICE;
                        break;
                    }
                    liveMode = LiveMode.VIDEO;
                    break;
                case 1787034050:
                    if (LLFFF.equals("livestudio")) {
                        liveMode = LiveMode.LIVE_STUDIO;
                        break;
                    }
                    liveMode = LiveMode.VIDEO;
                    break;
                default:
                    liveMode = LiveMode.VIDEO;
                    break;
            }
        } else {
            try {
                Context context = widgetCallback.getFragment().getContext();
                InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
                o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
                liveMode = LiveMode.valueOf(BUR.LIZ(context, ((User) interfaceC05190Ih).getIdStr()));
            } catch (Exception unused) {
                liveMode = LiveMode.VIDEO;
            }
        }
        if (this.LJLJL) {
            liveMode2 = LiveMode.VIDEO;
        } else if (this.LJLJLLL) {
            liveMode2 = LiveMode.SCREEN_RECORD;
        } else if (this.LJLJLJ) {
            liveMode2 = LiveMode.THIRD_PARTY;
        } else if (this.LJLL) {
            liveMode2 = LiveMode.LIVE_STUDIO;
        } else if (this.LJLLI) {
            liveMode2 = LiveMode.LIVE_VOICE;
        } else {
            liveMode2 = LiveMode.VIDEO;
        }
        int i = C30586BzS.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && this.LJLLI) {
                        liveMode2 = LiveMode.LIVE_VOICE;
                    }
                } else if (this.LJLL) {
                    liveMode2 = LiveMode.LIVE_STUDIO;
                }
            } else if (this.LJLJLJ) {
                liveMode2 = LiveMode.THIRD_PARTY;
            }
        } else if (this.LJLJLLL) {
            liveMode2 = LiveMode.SCREEN_RECORD;
        }
        LLIIII(liveMode2);
    }

    public final void LLFZ(int i, String str) {
        AbstractC029409q adapter;
        int i2 = this.LJLJJI;
        if (i2 != i) {
            if (LLFF(i2)) {
                Object obj = ListProtector.get(this.LJLJI, this.LJLJJI);
                o.LJIIIIZZ(obj, "mAllData[mLastPosition]");
                ((C0M) obj).LIZ = false;
            }
            if (LLFF(i)) {
                Object obj2 = ListProtector.get(this.LJLJI, i);
                o.LJIIIIZZ(obj2, "mAllData[position]");
                ((C0M) obj2).LIZ = true;
            }
        }
        if (this.LJLJJI != i) {
            C30620C0a LLFII = LLFII();
            if (LLFII != null) {
                int i3 = this.LJLJJI;
                AbstractC029409q adapter2 = LLFII.LJLIL.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(i3 + 1);
                }
            }
            C30620C0a LLFII2 = LLFII();
            if (LLFII2 != null && (adapter = LLFII2.LJLIL.getAdapter()) != null) {
                adapter.notifyItemChanged(i + 1);
            }
        }
        if (this.LJLJJI != i) {
            this.LJLJJI = i;
        }
        if (LLFF(i)) {
            C70657RoD.LJJI(0.01d, new C0H(this, str, C28509BGv.LIZ(((C0M) ListProtector.get(this.LJLJI, i)).LJ)));
            this.LJLJJLL = false;
        }
    }

    public final void LLII(int i, boolean z) {
        if (LLFF(i)) {
            Object obj = ListProtector.get(this.LJLJI, i);
            o.LJIIIIZZ(obj, "mAllData[position]");
            C0M c0m = (C0M) obj;
            if (z) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.rv0(DeepLinkLiveModeChannel.class, c0m.LJ);
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(LiveModeChannel.class, c0m.LJ);
                }
            } else {
                LLIIII(c0m.LJ);
            }
            if (c0m.LJ == LiveMode.LIVE_VOICE) {
                C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_VOICE_CHAT);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r0 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting.INSTANCE.enable() != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LL(com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5, boolean r6, java.lang.String r7) {
        /*
            r4 = this;
            int[] r1 = X.C30586BzS.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r3 = 0
            r0 = 1
            if (r1 == r0) goto L51
            r0 = 2
            if (r1 == r0) goto L4e
            r0 = 3
            if (r1 == r0) goto L4b
            r0 = 4
            if (r1 == r0) goto L5e
            r0 = 5
            if (r1 == r0) goto L48
        L18:
            java.util.ArrayList<X.C0M> r0 = r4.LJLJI
            int r1 = r0.size()
            r2 = 0
        L1f:
            if (r2 >= r1) goto L44
            java.util.ArrayList<X.C0M> r0 = r4.LJLJI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.C0M r0 = (X.C0M) r0
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r0.LJ
            if (r0 != r5) goto L45
            X.C0a r1 = r4.LLFII()
            if (r1 == 0) goto L3e
            X.C0d r0 = r1.LJLILLLLZI
            r0.LLIIIJ = r3
            androidx.recyclerview.widget.RecyclerView r1 = r1.LJLIL
            int r0 = r2 + 1
            r1.LJLIL(r0)
        L3e:
            r4.LLFZ(r2, r7)
            r4.LLII(r2, r6)
        L44:
            return
        L45:
            int r2 = r2 + 1
            goto L1f
        L48:
            boolean r0 = r4.LJLJL
            goto L60
        L4b:
            boolean r0 = r4.LJLL
            goto L60
        L4e:
            boolean r0 = r4.LJLJLJ
            goto L60
        L51:
            boolean r0 = r4.LJLJLLL
            if (r0 == 0) goto L62
            com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L62
            goto L18
        L5e:
            boolean r0 = r4.LJLLI
        L60:
            if (r0 != 0) goto L18
        L62:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            if (r5 != r0) goto L6c
            r0 = 2131841127(0x7f115067, float:1.9315553E38)
            X.C30868C9o.LIZJ(r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget.LL(com.bytedance.android.livesdkapi.depend.model.live.LiveMode, boolean, java.lang.String):void");
    }

    public static /* synthetic */ void LLF(PreviewLiveModeWidget previewLiveModeWidget, LiveMode liveMode, boolean z, String str, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        previewLiveModeWidget.LL(liveMode, z, str);
    }
}

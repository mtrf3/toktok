package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import X.AbstractC74727TUl;
import X.AbstractC75306Th0;
import X.ActivityC45651qj;
import X.B9K;
import X.BCX;
import X.BPP;
import X.BZI;
import X.C011602u;
import X.C012403c;
import X.C03880Dg;
import X.C04270Et;
import X.C04330Ez;
import X.C06490Nh;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C162476Zf;
import X.C16880lQ;
import X.C221108m2;
import X.C279017q;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29556Biq;
import X.C29S;
import X.C2A7;
import X.C30868C9o;
import X.C31657Cbd;
import X.C3C5;
import X.C45631qh;
import X.C47061t0;
import X.C47071t1;
import X.C48459J0d;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C73098SmU;
import X.C74614TQc;
import X.C74697TTh;
import X.C74776TWi;
import X.C74824TYe;
import X.C74838TYs;
import X.C74945TbB;
import X.C74979Tbj;
import X.C74983Tbn;
import X.C74987Tbr;
import X.C75183Tf1;
import X.C75191Tf9;
import X.C75236Tfs;
import X.C75282Tgc;
import X.C75283Tgd;
import X.C75285Tgf;
import X.C75288Tgi;
import X.C75299Tgt;
import X.C75301Tgv;
import X.C75305Tgz;
import X.C75307Th1;
import X.C75308Th2;
import X.C75309Th3;
import X.C75311Th5;
import X.C75314Th8;
import X.C75315Th9;
import X.C75415Til;
import X.C75559Tl5;
import X.C76029Tsf;
import X.C76800UCe;
import X.C77437UaH;
import X.C79045V0n;
import X.C86793Y4n;
import X.C87277YNd;
import X.C88207Yjb;
import X.C8E;
import X.C90903hW;
import X.CL8;
import X.CN1;
import X.DialogC77438UaI;
import X.DialogInterfaceOnClickListenerC75296Tgq;
import X.DialogInterfaceOnClickListenerC75304Tgy;
import X.EnumC74778TWk;
import X.EnumC74827TYh;
import X.EnumC74991Tbv;
import X.EnumC75310Th4;
import X.InterfaceC30442Bx8;
import X.InterfaceC31805Ce1;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterfaceC74940Tb6;
import X.InterfaceC75441TjB;
import X.InterfaceC75558Tl4;
import X.OSZ;
import X.Q8U;
import X.TBT;
import X.TBV;
import X.TRK;
import X.TUT;
import X.TUZ;
import X.TV3;
import X.U8H;
import X.UC0;
import X.UHL;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDcS172S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.MultiGuestUserChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveOpenModeratorListEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorThresholdConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiLiveAnchorSettingDialog extends MultiLiveAnchorSettingDialogContract$AbsView implements View.OnClickListener {
    public static final C75315Th9 LLLILZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLILZJ;
    public DataChannel LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public C011602u LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public TextView LJZI;
    public ImageView LJZL;
    public View LL;
    public C011602u LLD;
    public View LLF;
    public C011602u LLFF;
    public View LLFFF;
    public ViewGroup LLFII;
    public ViewGroup LLFZ;
    public ViewGroup LLI;
    public C011602u LLIFFJFJJ;
    public ViewGroup LLII;
    public C2A7 LLIIII;
    public C2A7 LLIIIILZ;
    public C2A7 LLIIIJ;
    public C2A7 LLIIIL;
    public C2A7 LLIIIZ;
    public C2A7 LLIIJI;
    public ImageView LLIIJLIL;
    public ImageView LLIIL;
    public ImageView LLIILII;
    public ImageView LLIILZL;
    public ImageView LLIIZ;
    public ImageView LLIL;
    public UHL LLILL;
    public int LLILLIZIL;
    public RelativeLayout LLJ;
    public View LLJI;
    public View LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public TextView LLJJIJIL;
    public TextView LLJJJ;
    public TextView LLJJJIL;
    public TextView LLJJJJ;
    public TextView LLJJJJJIL;
    public C45631qh LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public TextView LLJLIL;
    public TextView LLJLILLLLZIIL;
    public LiveIconView LLJLL;
    public View LLJLLIL;
    public MultiLiveAnchorPanelSettings LLJLLL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public ViewGroup LLLFFI;
    public C47061t0 LLLFZ;
    public C47061t0 LLLI;
    public ImageView LLLII;
    public ImageView LLLIIII;
    public View LLLIIIIL;
    public boolean LLLIIIL;
    public final C31657Cbd LLLIIL;
    public ISharedBgAbility LLLIILIL;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mMultiGuestDataHolder;
    public final Map<Integer, View> LLLIL = new LinkedHashMap();
    public final C62822Ol8 LLILII = C221108m2.LIZIZ(C75314Th8.LJLIL);
    public int LLILIL = -1;
    public int LLILLJJLI = 1;
    public int LLILLL = 5;
    public int LLILZ = 10;
    public int LLILZIL = 30;
    public int LLILZLL = 50;
    public final int LLIZ = 1;
    public int LLIZLLLIL = 39999;
    public final WeakHashMap<View, Boolean> LLJJIJIIJIL = new WeakHashMap<>();
    public final C62822Ol8 LLJZ = C221108m2.LIZIZ(C75183Tf1.LJLIL);
    public final C62822Ol8 LLJZIJLIL = C221108m2.LIZIZ(C75191Tf9.LJLIL);

    static {
        TBT tbt = new TBT(MultiLiveAnchorSettingDialog.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LLLILZJ = new InterfaceC74236TBo[]{tbt};
        LLLILZ = new C75315Th9();
    }

    public static void Il(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-4110081820002523214")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLLIL).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MultiLiveAnchorSettingDialog() {
        C221108m2.LIZIZ(new AqS163S0100000_13(this, 71));
        this.LLLIIL = new C31657Cbd("ZOOM_SERVICE");
        C75559Tl5.LIZIZ.LIZLLL(this);
    }

    public static boolean Vl() {
        Boolean LIZJ = InterfaceC30442Bx8.LLZLI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_MULTI_LIVE_GUEST_MO…RED_DOT_SHOULD_SHOW.value");
        if (LIZJ.booleanValue() && C74697TTh.LIZ()) {
            return true;
        }
        return false;
    }

    public final boolean Gl() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        int i;
        AbstractC74727TUl LIZ;
        List LJJI;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && (multiLiveAnchorPanelSettings = this.LLJLLL) != null && multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
                i = LJJI.size();
            } else {
                i = 0;
            }
            int i2 = i - 1;
            C74983Tbn LIZ2 = C29556Biq.LIZ();
            String Ql = Ql();
            if (Ql == null) {
                Ql = "";
            }
            LIZ2.getClass();
            int LJIIJ = C74983Tbn.LJIIJ(Ql) - 1;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("checkIncreaseGridGuestCount, curGuestCount:");
            LIZ3.append(i2);
            LIZ3.append(", gridSelectedGuestCount:");
            LIZ3.append(LJIIJ);
            C0NB.LIZIZ("MultiLiveAnchorSettingDialog", X1D.LIZIZ(LIZ3));
            if (i2 > 0 && LJIIJ > 0) {
                if (i2 > 5) {
                    if (LJIIJ < 8) {
                        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nat);
                        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_mu…switchToGrid_modal_title)");
                        String LJIILL = C15380j0.LJIILL(R.string.nas, Integer.valueOf(LJIIJ), Integer.valueOf(i2));
                        o.LJIIIIZZ(LJIILL, "getString(R.string.pm_mu…uestCount, curGuestCount)");
                        Zl(i2, LJIILJJIL, LJIILL, C74776TWi.LIZJ);
                        return true;
                    }
                } else if (i2 > 3 && LJIIJ < 5) {
                    String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.nat);
                    o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_mu…switchToGrid_modal_title)");
                    String LJIILL2 = C15380j0.LJIILL(R.string.nas, Integer.valueOf(LJIIJ), Integer.valueOf(i2));
                    o.LJIIIIZZ(LJIILL2, "getString(R.string.pm_mu…uestCount, curGuestCount)");
                    Zl(i2, LJIILJJIL2, LJIILL2, C74776TWi.LIZIZ);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Hl() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        int i;
        MultiGuestSharedBgAnchorViewModel Mb0;
        C75236Tfs state;
        AbstractC74727TUl LIZ;
        List LJJI;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && (multiLiveAnchorPanelSettings = this.LLJLLL) != null && multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
                i = LJJI.size();
            } else {
                i = 0;
            }
            int i2 = i - 1;
            C74983Tbn LIZ2 = C29556Biq.LIZ();
            String Ql = Ql();
            if (Ql == null) {
                Ql = "";
            }
            LIZ2.getClass();
            int LJIIJ = C74983Tbn.LJIIJ(Ql) - 1;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("checkIncreasePanelGuestCount, curGuestCount:");
            LIZ3.append(i2);
            LIZ3.append(", panelSelectedGuestCount:");
            LIZ3.append(LJIIJ);
            C0NB.LIZIZ("MultiLiveAnchorSettingDialog", X1D.LIZIZ(LIZ3));
            if (i2 > 0 && LJIIJ > 0 && LJIIJ + 1 <= i2 && i2 < 7) {
                ISharedBgAbility iSharedBgAbility = this.LLLIILIL;
                if (iSharedBgAbility != null && (Mb0 = iSharedBgAbility.Mb0()) != null && (state = Mb0.getState()) != null && state.LJLJI) {
                    em(new C75308Th2(this, LJIIJ, i2));
                    return true;
                }
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nav);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_mu…witchToPanel_modal_title)");
                String LJIILL = C15380j0.LJIILL(R.string.nau, Integer.valueOf(LJIIJ), Integer.valueOf(i2));
                o.LJIIIIZZ(LJIILL, "getString(R.string.pm_mu…uestCount, curGuestCount)");
                Zl(i2, LJIILJJIL, LJIILL, C74776TWi.LJ);
                return true;
            }
        }
        return false;
    }

    public final void Jl() {
        ImageView imageView = this.LLLII;
        if (imageView != null) {
            imageView.setBackgroundResource(0);
        }
        ImageView imageView2 = this.LLLIIII;
        if (imageView2 != null) {
            imageView2.setBackgroundResource(R.drawable.d96);
        }
    }

    public final HashMap<Integer, OSZ<C2A7, ImageView>> Kl() {
        return (HashMap) this.LLILII.getValue();
    }

    public final Room Ml() {
        return (Room) this.LLJZ.getValue();
    }

    public final int Ol() {
        return ((Number) this.LLJZIJLIL.getValue()).intValue();
    }

    public final MultiGuestDataHolder Pl() {
        MultiGuestDataHolder multiGuestDataHolder = this.mMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mMultiGuestDataHolder");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.length() == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Ql() {
        /*
            r5 = this;
            com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE
            boolean r0 = r0.enable()
            java.lang.String r3 = "MultiLiveAnchorSettingDialog"
            r2 = 1
            r4 = 0
            if (r0 == 0) goto Lb7
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r1 = r5.LLJLLL
            if (r1 == 0) goto Lb2
            int r0 = r1.fixMicNumAction
            if (r0 != 0) goto L92
            int r0 = r1.layoutType
            if (r0 != 0) goto L7d
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r5.Pl()
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r0.LJIIJJI
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r2 = r1.get(r0)
        L29:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "lastLayoutId:"
            r1.append(r0)
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            X.C31811Ce7.LJ(r1, r0, r1, r3)
        L38:
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L43
            int r0 = r0.length()
            if (r0 != 0) goto L6e
        L43:
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r5.LLJLLL
            if (r0 == 0) goto L6e
            X.Tbv r0 = X.C86793Y4n.LJJ(r0)
            if (r0 == 0) goto L6e
            java.lang.String r1 = r0.getBusinessType()
            if (r1 == 0) goto L6e
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C8E.LJ()
            X.TjB r0 = r0.R6()
            if (r0 == 0) goto L6d
            X.U8H r0 = r0.LJJZZI()
            if (r0 == 0) goto L6d
            com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r0 = r0.v1(r1)
            if (r0 == 0) goto L6d
            java.lang.String r4 = r0.getLayoutId()
        L6d:
            r2 = r4
        L6e:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getSelectLayoutId:"
            r1.append(r0)
            java.lang.String r2 = (java.lang.String) r2
            X.C31811Ce7.LJ(r1, r2, r1, r3)
            return r2
        L7d:
            int r0 = r1.layoutType
            if (r0 != r2) goto Lb2
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r5.Pl()
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r0.LJIIJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r2 = r1.get(r0)
            goto L29
        L92:
            int r0 = r1.fixMicNumAction
            if (r0 != r2) goto Lb2
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C8E.LJ()
            X.TjB r2 = r0.R6()
            if (r2 == 0) goto Lb2
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C8E.LJ()
            X.TXl r1 = r0.C4()
            if (r1 == 0) goto Lb5
            r0 = 4
            int r0 = r1.LIZ(r0)
        Laf:
            r2.LJL(r0)
        Lb2:
            r2 = r4
            goto L29
        Lb5:
            r0 = -1
            goto Laf
        Lb7:
            r2 = r4
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog.Ql():java.lang.String");
    }

    public final String Sl() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLJLLL;
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.layoutType == 1) {
            return "floating";
        }
        return "grid";
    }

    public final void Tl() {
        int i;
        View view = this.LJLJJLL;
        if (view != null) {
            int height = view.getHeight();
            if (height != 0 && mo49getActivity() != null) {
                i = B9K.LIZLLL(mo49getActivity(), height);
            } else {
                i = 465;
            }
            this.LLL = i;
            this.LLLF = i;
            this.LLLFF = i + 16;
            return;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public final void fm() {
        Boolean LIZJ = InterfaceC30442Bx8.LLZLL.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_MULTI_LIVE_GUEST_GI…RED_DOT_SHOULD_SHOW.value");
        if (LIZJ.booleanValue()) {
            View view = this.LLLIIIIL;
            if (view != null) {
                C87277YNd.LJJIJ(view);
                return;
            }
            return;
        }
        View view2 = this.LLLIIIIL;
        if (view2 == null) {
            return;
        }
        C87277YNd.LJJIIZ(view2);
    }

    public final void hm() {
        int i;
        int i2;
        int i3;
        ImageView imageView;
        int i4;
        AbstractC74727TUl LIZ;
        List LJJI;
        if (!LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            return;
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        boolean z = false;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
            i = LJJI.size();
        } else {
            i = 0;
        }
        int i5 = i - 1;
        C012403c.LJ("updateFloatingWindowClickable curGuestCount:", i5, "MultiLiveAnchorSettingDialog");
        if (i5 <= 0) {
            return;
        }
        if (i5 <= 6) {
            z = true;
        }
        Context context = getContext();
        if (context != null) {
            View view = this.LJZ;
            if (view != null) {
                if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
                    if (z) {
                        i4 = R.drawable.d90;
                    } else {
                        i4 = R.drawable.d93;
                    }
                    imageView.setImageDrawable(C04270Et.LIZIZ(context, i4));
                }
                TextView textView = this.LJZI;
                if (textView != null) {
                    if (z) {
                        i3 = R.color.a8n;
                    } else {
                        i3 = R.color.cn;
                    }
                    textView.setTextColor(C04330Ez.LIZIZ(context, i3));
                } else {
                    o.LJIJI("tvPanel");
                    throw null;
                }
            } else {
                o.LJIJI("mFloatingWindowBackground");
                throw null;
            }
        }
        ImageView imageView2 = this.LJZL;
        if (imageView2 != null) {
            if (z) {
                i2 = 255;
            } else {
                i2 = 128;
            }
            imageView2.setImageAlpha(i2);
            WeakHashMap<View, Boolean> weakHashMap = this.LLJJIJIIJIL;
            View view2 = this.LJZ;
            if (view2 != null) {
                weakHashMap.put(view2, Boolean.valueOf(z));
                return;
            } else {
                o.LJIJI("mFloatingWindowBackground");
                throw null;
            }
        }
        o.LJIJI("ivPanel");
        throw null;
    }

    public final void km() {
        C011602u c011602u = this.LLIFFJFJJ;
        if (c011602u != null && c011602u.isChecked()) {
            ViewGroup viewGroup = this.LLII;
            if (viewGroup != null) {
                C87277YNd.LJJIJ(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLII;
        if (viewGroup2 == null) {
            return;
        }
        C87277YNd.LJJIIZ(viewGroup2);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        if (this.LLL == 0) {
            Tl();
        }
        C76029Tsf c76029Tsf = new C76029Tsf();
        c76029Tsf.LIZIZ = this.LLLF;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o1w);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_settings2)");
        c76029Tsf.LIZ = LJIILJJIL;
        LiveIconView liveIconView = new LiveIconView(getContext(), null);
        liveIconView.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(24.0f), C15380j0.LIZ(24.0f)));
        liveIconView.setIconAttr(R.attr.asm);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(C15380j0.LIZ(24.0f) * 2, -2));
        linearLayout.addView(liveIconView);
        C16880lQ.LJIIZILJ(linearLayout, new ACListenerS33S0100000_13(this, 161));
        c76029Tsf.LIZLLL = linearLayout;
        c76029Tsf.LJI = new AqS163S0100000_13(this, 70);
        return c76029Tsf;
    }

    public final String Rl() {
        EnumC74991Tbv LJJ;
        String businessType;
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        Layout v1;
        String layoutId;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = Pl().LJIIJ;
        if (multiLiveAnchorPanelSettings == null || (LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings)) == null || (businessType = LJJ.getBusinessType()) == null || (R6 = C8E.LJ().R6()) == null || (LJJZZI = R6.LJJZZI()) == null || (v1 = LJJZZI.v1(businessType)) == null || (layoutId = v1.getLayoutId()) == null) {
            return "";
        }
        return layoutId;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C88207Yjb.LJIJI("multi_guest_anchor_setting_page");
    }

    public static String Ll(int i) {
        String LJII = C15380j0.LJII(R.plurals.nm, i);
        o.LJIIIIZZ(LJII, "getQuantityString(R.plur…s_coinPlaceholder, coins)");
        return Q8U.LIZIZ(new Object[]{Integer.valueOf(i)}, 1, LJII, "format(format, *args)");
    }

    public static void Xl(String str) {
        int i;
        String str2;
        int i2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        List LJIJJLI;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        Boolean LIZJ = InterfaceC30442Bx8.LLZLL.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_MULTI_LIVE_GUEST_GI…RED_DOT_SHOULD_SHOW.value");
        boolean booleanValue = LIZJ.booleanValue();
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        AbstractC74727TUl abstractC74727TUl = null;
        if ((obj instanceof InterfaceC31805Ce1) && (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj) != null) {
            abstractC74727TUl = interfaceC31805Ce1.LIZ();
        }
        HashMap LIZLLL = C73098SmU.LIZLLL();
        if (abstractC74727TUl != null && (LJIJJLI = abstractC74727TUl.LJIJJLI()) != null) {
            i = LJIJJLI.size();
        } else {
            i = 0;
        }
        LIZLLL.put("request_list_ucnt", String.valueOf(i));
        LIZLLL.put("to_display_type", str);
        if (booleanValue) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL.put("is_first_time_click", str2);
        MultiGuestDataHolder LIZ = TRK.LIZ();
        int i3 = -1;
        if (LIZ != null && (multiLiveAnchorPanelSettings2 = LIZ.LJIIJ) != null) {
            i2 = multiLiveAnchorPanelSettings2.layoutType;
        } else {
            i2 = -1;
        }
        MultiGuestDataHolder LIZ2 = TRK.LIZ();
        if (LIZ2 != null && (multiLiveAnchorPanelSettings = LIZ2.LJIIJ) != null) {
            i3 = multiLiveAnchorPanelSettings.fixMicNumAction;
        }
        EnumC74778TWk LIZJ2 = CL8.LIZJ(i2, i3);
        LIZLLL.put("layout_setting", C74824TYe.LJI(LIZJ2).getFirst());
        LIZLLL.put("window_setting", C74824TYe.LJI(LIZJ2).getSecond());
        C74824TYe.LJLL("livesdk_anchor_guest_request_display_setting_click", LIZLLL);
    }

    public final void Al(int i) {
        ImageView second;
        C2A7 first;
        Integer LJI;
        ImageView second2;
        C2A7 first2;
        int i2;
        Integer LJI2;
        if (i == this.LLILIL) {
            return;
        }
        OSZ<C2A7, ImageView> osz = Kl().get(Integer.valueOf(i));
        int i3 = 0;
        if (osz != null && (first2 = osz.getFirst()) != null) {
            Context context = getContext();
            if (context != null && (LJI2 = C79045V0n.LJI(R.attr.go, context)) != null) {
                i2 = LJI2.intValue();
            } else {
                i2 = 0;
            }
            first2.setTextColor(i2);
        }
        OSZ<C2A7, ImageView> osz2 = Kl().get(Integer.valueOf(i));
        if (osz2 != null && (second2 = osz2.getSecond()) != null) {
            C87277YNd.LJJIJ(second2);
        }
        OSZ<C2A7, ImageView> osz3 = Kl().get(Integer.valueOf(this.LLILIL));
        if (osz3 != null && (first = osz3.getFirst()) != null) {
            Context context2 = getContext();
            if (context2 != null && (LJI = C79045V0n.LJI(R.attr.gu, context2)) != null) {
                i3 = LJI.intValue();
            }
            first.setTextColor(i3);
        }
        OSZ<C2A7, ImageView> osz4 = Kl().get(Integer.valueOf(this.LLILIL));
        if (osz4 != null && (second = osz4.getSecond()) != null) {
            C87277YNd.LJJIIZI(second);
        }
        this.LLILIL = i;
    }

    public final void Dl(long j) {
        int i = (int) j;
        if (i == this.LLILLJJLI || i == this.LLILLL || i == this.LLILZ || i == this.LLILZIL || i == this.LLILZLL) {
            Al(i);
            return;
        }
        Al(0);
        C2A7 c2a7 = this.LLIIJI;
        if (c2a7 != null) {
            c2a7.setText(Ll(i));
        }
        this.LLILLIZIL = i;
    }

    public final int Nl(Integer num) {
        if (num == null) {
            return 0;
        }
        if (num.intValue() == 0) {
            return this.LLJILJILJ;
        }
        if (num.intValue() != 1) {
            return 0;
        }
        return this.LLJILJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView
    public final void U2(Throwable th) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = Pl().LJIIJ;
        if (multiLiveAnchorPanelSettings2 != null) {
            multiLiveAnchorPanelSettings = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings2);
        } else {
            multiLiveAnchorPanelSettings = null;
        }
        this.LLJLLL = multiLiveAnchorPanelSettings;
        BPP.LIZLLL(getContext(), th, R.string.sp2);
    }

    public final void cm(String str) {
        Integer num;
        if (!LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            return;
        }
        C29556Biq.LIZ().getClass();
        int LJIIJ = C74983Tbn.LJIIJ(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showChangeGuestCountDialog targetLayoutId:");
        LIZ.append(str);
        C0NB.LIZIZ("MultiLiveAnchorSettingDialog", X1D.LIZIZ(LIZ));
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILLIIL(R.string.nao);
        int i = LJIIJ - 1;
        c47071t1.LJII(C15380j0.LJIILL(R.string.nan, Integer.valueOf(i)));
        c47071t1.LJIIIZ(R.string.nam, new C75305Tgz(this, LJIIJ));
        c47071t1.LJIIL(R.string.nal, new C75299Tgt(LJIIJ, this, str));
        Il(c47071t1.LIZ());
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLJLLL;
        if (multiLiveAnchorPanelSettings != null) {
            num = Integer.valueOf(multiLiveAnchorPanelSettings.layoutType);
        } else {
            num = null;
        }
        C74824TYe.LJJJJJ(Nl(num), i, "normal", "show", "");
    }

    public final void em(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C75285Tgf.LJ("change_to_floating", "show");
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILLIIL(R.string.n88);
        c47071t1.LJFF(R.string.n86);
        c47071t1.LJIIIZ(R.string.n85, C75309Th3.LJLIL);
        c47071t1.LJIIL(R.string.n87, new IDcS172S0100000_13(interfaceC65784Pro, 0));
        c47071t1.LJIILJJIL = false;
        Il(c47071t1.LIZ());
    }

    public final void lm(Integer num) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        AbstractC74727TUl LIZ;
        List LJJI;
        if (num == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateGuestMaxCountClickable layoutType:");
        LIZ2.append(num);
        C0NB.LIZIZ("MultiLiveAnchorSettingDialog", X1D.LIZIZ(LIZ2));
        InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        boolean z4 = false;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
            i = LJJI.size();
        } else {
            i = 0;
        }
        int i5 = i - 1;
        int intValue = num.intValue();
        int i6 = R.color.ck;
        if (intValue == 0) {
            Context context = getContext();
            if (context != null) {
                TextView textView = this.LLJJJIL;
                if (textView != null) {
                    if (i5 <= 3) {
                        i3 = R.color.ck;
                    } else {
                        i3 = R.color.cn;
                    }
                    textView.setTextColor(C04330Ez.LIZIZ(context, i3));
                    TextView textView2 = this.LLJJJJ;
                    if (textView2 != null) {
                        if (i5 <= 5) {
                            i4 = R.color.ck;
                        } else {
                            i4 = R.color.cn;
                        }
                        textView2.setTextColor(C04330Ez.LIZIZ(context, i4));
                        TextView textView3 = this.LLJJJJJIL;
                        if (textView3 != null) {
                            if (i5 > 8) {
                                i6 = R.color.cn;
                            }
                            textView3.setTextColor(C04330Ez.LIZIZ(context, i6));
                        } else {
                            o.LJIJI("tvGridGuestMax8");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tvGridGuestMax5");
                        throw null;
                    }
                } else {
                    o.LJIJI("tvGridGuestMax3");
                    throw null;
                }
            }
            WeakHashMap<View, Boolean> weakHashMap = this.LLJJIJIIJIL;
            View view = this.LLJJI;
            if (view != null) {
                if (i5 <= 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                weakHashMap.put(view, Boolean.valueOf(z2));
                WeakHashMap<View, Boolean> weakHashMap2 = this.LLJJIJIIJIL;
                View view2 = this.LLJJIII;
                if (view2 != null) {
                    if (i5 <= 5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    weakHashMap2.put(view2, Boolean.valueOf(z3));
                    WeakHashMap<View, Boolean> weakHashMap3 = this.LLJJIJIIJIL;
                    View view3 = this.LLJJIJI;
                    if (view3 != null) {
                        if (i5 <= 8) {
                            z4 = true;
                        }
                        weakHashMap3.put(view3, Boolean.valueOf(z4));
                        return;
                    }
                    o.LJIJI("ivGridGuestMax8");
                    throw null;
                }
                o.LJIJI("ivGridGuestMax5");
                throw null;
            }
            o.LJIJI("ivGridGuestMax3");
            throw null;
        }
        if (num.intValue() != 1) {
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            TextView textView4 = this.LLJJIJIL;
            if (textView4 != null) {
                if (i5 <= 4) {
                    i2 = R.color.ck;
                } else {
                    i2 = R.color.cn;
                }
                textView4.setTextColor(C04330Ez.LIZIZ(context2, i2));
                TextView textView5 = this.LLJJJ;
                if (textView5 != null) {
                    if (i5 > 6) {
                        i6 = R.color.cn;
                    }
                    textView5.setTextColor(C04330Ez.LIZIZ(context2, i6));
                } else {
                    o.LJIJI("tvPanelGuestMax6");
                    throw null;
                }
            } else {
                o.LJIJI("tvPanelGuestMax4");
                throw null;
            }
        }
        WeakHashMap<View, Boolean> weakHashMap4 = this.LLJJIJIIJIL;
        View view4 = this.LLJILLL;
        if (view4 != null) {
            if (i5 <= 4) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap4.put(view4, Boolean.valueOf(z));
            WeakHashMap<View, Boolean> weakHashMap5 = this.LLJJIJIIJIL;
            View view5 = this.LLJJ;
            if (view5 != null) {
                if (i5 <= 6) {
                    z4 = true;
                }
                weakHashMap5.put(view5, Boolean.valueOf(z4));
                return;
            }
            o.LJIJI("ivPanelGuestMax6");
            throw null;
        }
        o.LJIJI("ivPanelGuestMax4");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        boolean LJ;
        boolean LJ2;
        boolean LJ3;
        boolean LJ4;
        boolean LJ5;
        boolean LJ6;
        boolean LJ7;
        Boolean bool;
        MultiGuestSharedBgAnchorViewModel Mb0;
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Long l;
        Long valueOf;
        Long l2;
        String str;
        MultiGuestSharedBgAnchorViewModel Mb02;
        C75236Tfs state;
        int i;
        Long l3;
        String str2;
        MultiGuestSharedBgAnchorViewModel Mb03;
        C75236Tfs state2;
        EnumC75310Th4 enumC75310Th4;
        EnumC75310Th4 enumC75310Th42;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        boolean Hl;
        Integer valueOf2;
        int i2;
        MultiGuestSharedBgAnchorViewModel Mb04;
        C75236Tfs state3;
        Integer valueOf3;
        Boolean bool2;
        EnumC75310Th4 enumC75310Th43;
        Integer valueOf4;
        o.LJIIIZ(v, "v");
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = Pl().LJIIJ;
        View view = this.LJZ;
        if (view != null) {
            if (o.LJ(v, view)) {
                LJ = true;
            } else {
                View view2 = this.LL;
                if (view2 != null) {
                    LJ = o.LJ(v, view2);
                } else {
                    o.LJIJI("mEqualLayoutBackground");
                    throw null;
                }
            }
            if (LJ) {
                LJ2 = true;
            } else {
                View view3 = this.LJLLLL;
                if (view3 != null) {
                    LJ2 = o.LJ(v, view3);
                } else {
                    o.LJIJI("mSwitchLayout");
                    throw null;
                }
            }
            if (LJ2) {
                LJ3 = true;
            } else {
                View view4 = this.LLJILLL;
                if (view4 != null) {
                    LJ3 = o.LJ(v, view4);
                } else {
                    o.LJIJI("ivPanelGuestMax4");
                    throw null;
                }
            }
            if (LJ3) {
                LJ4 = true;
            } else {
                View view5 = this.LLJJ;
                if (view5 != null) {
                    LJ4 = o.LJ(v, view5);
                } else {
                    o.LJIJI("ivPanelGuestMax6");
                    throw null;
                }
            }
            if (LJ4) {
                LJ5 = true;
            } else {
                View view6 = this.LLJJI;
                if (view6 != null) {
                    LJ5 = o.LJ(v, view6);
                } else {
                    o.LJIJI("ivGridGuestMax3");
                    throw null;
                }
            }
            if (LJ5) {
                LJ6 = true;
            } else {
                View view7 = this.LLJJIII;
                if (view7 != null) {
                    LJ6 = o.LJ(v, view7);
                } else {
                    o.LJIJI("ivGridGuestMax5");
                    throw null;
                }
            }
            if (LJ6) {
                LJ7 = true;
            } else {
                View view8 = this.LLJJIJI;
                if (view8 != null) {
                    LJ7 = o.LJ(v, view8);
                } else {
                    o.LJIJI("ivGridGuestMax8");
                    throw null;
                }
            }
            int i3 = 0;
            r2 = false;
            boolean z2 = false;
            r2 = false;
            boolean z3 = false;
            boolean z4 = false;
            String str3 = "off";
            if (LJ7) {
                ZoomService zoomService = (ZoomService) this.LLLIIL.LIZ(this, LLLILZJ[0]);
                if (zoomService != null) {
                    bool2 = Boolean.valueOf(zoomService.LIZJ());
                } else {
                    bool2 = null;
                }
                if (C29306Beo.LJJIFFI(bool2)) {
                    if (multiLiveAnchorPanelSettings2 == null || (valueOf4 = Integer.valueOf(multiLiveAnchorPanelSettings2.layoutType)) == null || valueOf4.intValue() != 1) {
                        C30868C9o.LIZJ(R.string.nf0);
                    } else {
                        C30868C9o.LIZJ(R.string.nf1);
                    }
                    int id = v.getId();
                    View view9 = this.LJLLLL;
                    if (view9 != null) {
                        if (id == view9.getId()) {
                            C011602u c011602u = this.LJLLI;
                            if (c011602u != null) {
                                if (!c011602u.isChecked()) {
                                    str3 = "on";
                                }
                                C011602u c011602u2 = this.LJLLI;
                                if (c011602u2 != null) {
                                    if (c011602u2.isChecked()) {
                                        enumC75310Th43 = EnumC75310Th4.TURN_OFF;
                                    } else {
                                        enumC75310Th43 = EnumC75310Th4.TURN_ON;
                                    }
                                    C74824TYe.LJJIJIIJI(str3, enumC75310Th43);
                                    return;
                                }
                                o.LJIJI("mSwitch");
                                throw null;
                            }
                            o.LJIJI("mSwitch");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("mSwitchLayout");
                    throw null;
                }
            }
            View view10 = this.LJZ;
            if (view10 != null) {
                if (o.LJ(v, view10)) {
                    WeakHashMap<View, Boolean> weakHashMap = this.LLJJIJIIJIL;
                    View view11 = this.LJZ;
                    if (view11 != null) {
                        if (o.LJ(weakHashMap.get(view11), Boolean.FALSE)) {
                            C30868C9o.LJI(C15380j0.LJIILL(R.string.naw, 6));
                            return;
                        }
                        if (multiLiveAnchorPanelSettings2 == null || (valueOf3 = Integer.valueOf(multiLiveAnchorPanelSettings2.layoutType)) == null) {
                            i2 = 1;
                        } else {
                            i2 = 1;
                            if (valueOf3.intValue() == 1) {
                                C30868C9o.LIZJ(R.string.m80);
                                return;
                            }
                        }
                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = this.LLJLLL;
                        if (multiLiveAnchorPanelSettings3 != null) {
                            multiLiveAnchorPanelSettings3.layoutType = i2;
                        }
                        if (Hl()) {
                            return;
                        }
                        C74824TYe.LJJJZ(Sl());
                        ISharedBgAbility iSharedBgAbility = this.LLLIILIL;
                        if (iSharedBgAbility != null && (Mb04 = iSharedBgAbility.Mb0()) != null && (state3 = Mb04.getState()) != null && state3.LJLJI == i2) {
                            em(new AqS163S0100000_13(this, 72));
                            return;
                        } else {
                            dm(false, EnumC75310Th4.CHANGE_TO_PANEL);
                            return;
                        }
                    }
                    o.LJIJI("mFloatingWindowBackground");
                    throw null;
                }
                View view12 = this.LL;
                if (view12 != null) {
                    if (o.LJ(v, view12)) {
                        if (((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nU(this.LJLJJL)) {
                            C30868C9o.LIZJ(R.string.kso);
                            BZI LIZ = C28787BRn.LIZ("livesdk_draw_function_conflict_toast_show");
                            LIZ.LJIILLIIL(this.LJLJJL);
                            C06490Nh.LIZLLL(LIZ, "guest_connection_icon", "click_position", "guest_connection_gird", "function_type");
                            return;
                        }
                        if (multiLiveAnchorPanelSettings2 == null || (valueOf2 = Integer.valueOf(multiLiveAnchorPanelSettings2.layoutType)) == null || valueOf2.intValue() != 0) {
                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = this.LLJLLL;
                            if (multiLiveAnchorPanelSettings4 != null) {
                                multiLiveAnchorPanelSettings4.layoutType = 0;
                            }
                            if (Gl()) {
                                return;
                            }
                            dm(false, EnumC75310Th4.CHANGE_TO_GRID);
                            C74824TYe.LJJJZ(Sl());
                            return;
                        }
                        C30868C9o.LIZJ(R.string.m80);
                        return;
                    }
                    View view13 = this.LJLLLL;
                    if (view13 != null) {
                        if (o.LJ(v, view13)) {
                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings5 = this.LLJLLL;
                            if (multiLiveAnchorPanelSettings5 != null) {
                                C011602u c011602u3 = this.LJLLI;
                                if (c011602u3 != null) {
                                    multiLiveAnchorPanelSettings5.fixMicNumAction = c011602u3.isChecked() ? 1 : 0;
                                } else {
                                    o.LJIJI("mSwitch");
                                    throw null;
                                }
                            }
                            C011602u c011602u4 = this.LJLLI;
                            if (c011602u4 != null) {
                                if (!c011602u4.isChecked()) {
                                    str3 = "on";
                                }
                                C011602u c011602u5 = this.LJLLI;
                                if (c011602u5 != null) {
                                    if (c011602u5.isChecked()) {
                                        enumC75310Th4 = EnumC75310Th4.TURN_OFF;
                                    } else {
                                        enumC75310Th4 = EnumC75310Th4.TURN_ON;
                                    }
                                    C74824TYe.LJJIJIIJI(str3, enumC75310Th4);
                                    if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && (multiLiveAnchorPanelSettings = this.LLJLLL) != null) {
                                        if (multiLiveAnchorPanelSettings.layoutType == 0) {
                                            Hl = Gl();
                                        } else if (multiLiveAnchorPanelSettings.layoutType == 1) {
                                            Hl = Hl();
                                        }
                                        if (Hl) {
                                            return;
                                        }
                                    }
                                    C011602u c011602u6 = this.LJLLI;
                                    if (c011602u6 != null) {
                                        if (c011602u6.isChecked()) {
                                            enumC75310Th42 = EnumC75310Th4.TURN_OFF;
                                        } else {
                                            enumC75310Th42 = EnumC75310Th4.TURN_ON;
                                        }
                                        dm(true, enumC75310Th42);
                                        return;
                                    }
                                    o.LJIJI("mSwitch");
                                    throw null;
                                }
                                o.LJIJI("mSwitch");
                                throw null;
                            }
                            o.LJIJI("mSwitch");
                            throw null;
                        }
                        View view14 = this.LLF;
                        if (view14 != null) {
                            if (o.LJ(v, view14)) {
                                C011602u c011602u7 = this.LLD;
                                if (c011602u7 != null) {
                                    boolean isChecked = c011602u7.isChecked();
                                    if (!CL8.LIZ()) {
                                        C30868C9o.LIZJ(R.string.nji);
                                        return;
                                    }
                                    if (isChecked) {
                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings6 = this.LLJLLL;
                                        if (multiLiveAnchorPanelSettings6 != null) {
                                            if (multiLiveAnchorPanelSettings6.onlyAllowFollowerReq == 3) {
                                                C74824TYe.LJJIJIIJIL(EnumC74827TYh.CLOSE_PERMISSION_FROM_VIEWERS);
                                            }
                                            multiLiveAnchorPanelSettings6.allowViewerReq = 4;
                                        }
                                        ViewGroup viewGroup = this.LLFII;
                                        if (viewGroup != null) {
                                            C87277YNd.LJJIIZ(viewGroup);
                                        }
                                        ViewGroup viewGroup2 = this.LLFZ;
                                        if (viewGroup2 != null) {
                                            C87277YNd.LJJIIZ(viewGroup2);
                                        }
                                    } else {
                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings7 = this.LLJLLL;
                                        if (multiLiveAnchorPanelSettings7 != null) {
                                            multiLiveAnchorPanelSettings7.allowViewerReq = 3;
                                        }
                                        ViewGroup viewGroup3 = this.LLFII;
                                        if (viewGroup3 != null) {
                                            C87277YNd.LJJIJ(viewGroup3);
                                        }
                                        if (TUZ.LIZ()) {
                                            ViewGroup viewGroup4 = this.LLFZ;
                                            if (viewGroup4 != null) {
                                                C87277YNd.LJJIJ(viewGroup4);
                                            }
                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings8 = Pl().LJIIJ;
                                            if (multiLiveAnchorPanelSettings8 != null && (i = (int) multiLiveAnchorPanelSettings8.applierSortGiftScoreThreshold) > 0) {
                                                C74824TYe.LJLJJL(i, "viewer_request_allow");
                                            }
                                        }
                                    }
                                    AbstractC75306Th0 abstractC75306Th0 = (AbstractC75306Th0) this.LJLILLLLZI;
                                    if (abstractC75306Th0 != null) {
                                        Room Ml = Ml();
                                        if (Ml != null) {
                                            l3 = Long.valueOf(Ml.getId());
                                        } else {
                                            l3 = null;
                                        }
                                        Long valueOf5 = Long.valueOf(Ol());
                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings9 = this.LLJLLL;
                                        ISharedBgAbility iSharedBgAbility2 = this.LLLIILIL;
                                        if (iSharedBgAbility2 != null && (Mb03 = iSharedBgAbility2.Mb0()) != null && (state2 = Mb03.getState()) != null) {
                                            str2 = state2.LJLJJI;
                                        } else {
                                            str2 = null;
                                        }
                                        abstractC75306Th0.LJ(l3, valueOf5, multiLiveAnchorPanelSettings9, 2, null, null, C75283Tgd.LIZ(str2));
                                    }
                                    EnumC74827TYh enumC74827TYh = EnumC74827TYh.MANUAL_SETTING;
                                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings10 = this.LLJLLL;
                                    if (multiLiveAnchorPanelSettings10 != null && multiLiveAnchorPanelSettings10.allowViewerReq == 3) {
                                        z2 = true;
                                    }
                                    C74824TYe.LJLIIL(enumC74827TYh, z2, true);
                                    return;
                                }
                                o.LJIJI("mViewerSwitch");
                                throw null;
                            }
                            View view15 = this.LLFFF;
                            if (view15 != null) {
                                if (o.LJ(v, view15)) {
                                    C011602u c011602u8 = this.LLFF;
                                    if (c011602u8 != null) {
                                        boolean isChecked2 = c011602u8.isChecked();
                                        if (!CL8.LIZ()) {
                                            C30868C9o.LIZJ(R.string.nji);
                                            return;
                                        }
                                        C74824TYe.LJJIJIIJIL(EnumC74827TYh.MANUAL_SETTING);
                                        if (!isChecked2) {
                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings11 = this.LLJLLL;
                                            if (multiLiveAnchorPanelSettings11 != null) {
                                                multiLiveAnchorPanelSettings11.allowViewerReq = 3;
                                                multiLiveAnchorPanelSettings11.onlyAllowFollowerReq = 3;
                                            }
                                        } else {
                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings12 = this.LLJLLL;
                                            if (multiLiveAnchorPanelSettings12 != null) {
                                                multiLiveAnchorPanelSettings12.onlyAllowFollowerReq = 4;
                                            }
                                        }
                                        AbstractC75306Th0 abstractC75306Th02 = (AbstractC75306Th0) this.LJLILLLLZI;
                                        if (abstractC75306Th02 != null) {
                                            Room Ml2 = Ml();
                                            if (Ml2 != null) {
                                                l2 = Long.valueOf(Ml2.getId());
                                            } else {
                                                l2 = null;
                                            }
                                            Long valueOf6 = Long.valueOf(Ol());
                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings13 = this.LLJLLL;
                                            ISharedBgAbility iSharedBgAbility3 = this.LLLIILIL;
                                            if (iSharedBgAbility3 != null && (Mb02 = iSharedBgAbility3.Mb0()) != null && (state = Mb02.getState()) != null) {
                                                str = state.LJLJJI;
                                            } else {
                                                str = null;
                                            }
                                            abstractC75306Th02.LJ(l2, valueOf6, multiLiveAnchorPanelSettings13, 3, null, null, C75283Tgd.LIZ(str));
                                        }
                                        if (C74945TbB.LIZIZ(Boolean.TRUE)) {
                                            EnumC74827TYh enumC74827TYh2 = EnumC74827TYh.OPEN_MODE;
                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings14 = this.LLJLLL;
                                            if (multiLiveAnchorPanelSettings14 != null && multiLiveAnchorPanelSettings14.allowViewerReq == 3) {
                                                z3 = true;
                                            }
                                            C74824TYe.LJLIIL(enumC74827TYh2, z3, true);
                                            return;
                                        }
                                        return;
                                    }
                                    o.LJIJI("mFollowerSwitch");
                                    throw null;
                                }
                                if (o.LJ(v, this.LLI)) {
                                    C011602u c011602u9 = this.LLIFFJFJJ;
                                    if (c011602u9 != null) {
                                        z4 = c011602u9.isChecked();
                                    }
                                    if (!z4) {
                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings15 = Pl().LJIIJ;
                                        if (multiLiveAnchorPanelSettings15 == null || (valueOf = Long.valueOf(multiLiveAnchorPanelSettings15.applierSortGiftScoreThreshold)) == null || valueOf.longValue() == 0) {
                                            valueOf = Long.valueOf(this.LLILLJJLI);
                                        } else if (valueOf.longValue() < 0) {
                                            valueOf = Long.valueOf(-valueOf.longValue());
                                        }
                                        long longValue = valueOf.longValue();
                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings16 = this.LLJLLL;
                                        if (multiLiveAnchorPanelSettings16 != null) {
                                            multiLiveAnchorPanelSettings16.applierSortGiftScoreThreshold = longValue;
                                        }
                                        xl(5);
                                        Dl(valueOf.longValue());
                                        HashMap hashMap = new HashMap();
                                        C74824TYe.LIZ(hashMap);
                                        hashMap.put("to_status", "open");
                                        C74824TYe.LJLL("livesdk_anchor_guest_request_filter_setting_click", hashMap);
                                        C74824TYe.LJLJJL((int) valueOf.longValue(), "manual_set");
                                    } else {
                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings17 = Pl().LJIIJ;
                                        if (multiLiveAnchorPanelSettings17 == null || (l = Long.valueOf(multiLiveAnchorPanelSettings17.applierSortGiftScoreThreshold)) == null) {
                                            l = 0L;
                                        } else if (l.longValue() > 0) {
                                            l = Long.valueOf(-l.longValue());
                                        }
                                        long longValue2 = l.longValue();
                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings18 = this.LLJLLL;
                                        if (multiLiveAnchorPanelSettings18 != null) {
                                            multiLiveAnchorPanelSettings18.applierSortGiftScoreThreshold = longValue2;
                                        }
                                        xl(5);
                                        HashMap hashMap2 = new HashMap();
                                        C74824TYe.LIZ(hashMap2);
                                        hashMap2.put("to_status", "close");
                                        C74824TYe.LJLL("livesdk_anchor_guest_request_filter_setting_click", hashMap2);
                                    }
                                    C011602u c011602u10 = this.LLIFFJFJJ;
                                    if (c011602u10 != null) {
                                        c011602u10.setChecked(!z4);
                                    }
                                    km();
                                    return;
                                }
                                View view16 = this.LJLLJ;
                                if (view16 != null) {
                                    if (o.LJ(v, view16)) {
                                        DataChannel dataChannel = this.LJLJJL;
                                        if (dataChannel != null) {
                                            dataChannel.pv0(MultiLiveOpenModeratorListEvent.class);
                                        }
                                        InterfaceC30442Bx8.LLZLI.LIZ(Boolean.FALSE);
                                        View view17 = this.LJLLL;
                                        if (view17 != null) {
                                            if (!Vl()) {
                                                i3 = 8;
                                            }
                                            view17.setVisibility(i3);
                                            this.LJLIL.dismiss();
                                            return;
                                        }
                                        o.LJIJI("moderatorRedDotView");
                                        throw null;
                                    }
                                    View view18 = this.LLJILLL;
                                    if (view18 != null) {
                                        if (o.LJ(v, view18)) {
                                            if (this.LLJILJIL == 4) {
                                                return;
                                            }
                                            WeakHashMap<View, Boolean> weakHashMap2 = this.LLJJIJIIJIL;
                                            View view19 = this.LLJILLL;
                                            if (view19 != null) {
                                                if (o.LJ(weakHashMap2.get(view19), Boolean.TRUE)) {
                                                    cm(C74776TWi.LIZLLL);
                                                    return;
                                                }
                                                C30868C9o.LJI(C15380j0.LJIILL(R.string.nap, 4));
                                                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings19 = this.LLJLLL;
                                                if (multiLiveAnchorPanelSettings19 != null) {
                                                    num5 = Integer.valueOf(multiLiveAnchorPanelSettings19.layoutType);
                                                } else {
                                                    num5 = null;
                                                }
                                                C74824TYe.LJJJJJ(Nl(num5), 4, "abnormal", "show", "");
                                                return;
                                            }
                                            o.LJIJI("ivPanelGuestMax4");
                                            throw null;
                                        }
                                        View view20 = this.LLJJ;
                                        if (view20 != null) {
                                            if (o.LJ(v, view20)) {
                                                if (this.LLJILJIL == 6) {
                                                    return;
                                                }
                                                WeakHashMap<View, Boolean> weakHashMap3 = this.LLJJIJIIJIL;
                                                View view21 = this.LLJJ;
                                                if (view21 != null) {
                                                    if (o.LJ(weakHashMap3.get(view21), Boolean.TRUE)) {
                                                        cm(C74776TWi.LJ);
                                                        return;
                                                    }
                                                    C30868C9o.LJI(C15380j0.LJIILL(R.string.nap, 6));
                                                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings20 = this.LLJLLL;
                                                    if (multiLiveAnchorPanelSettings20 != null) {
                                                        num4 = Integer.valueOf(multiLiveAnchorPanelSettings20.layoutType);
                                                    } else {
                                                        num4 = null;
                                                    }
                                                    C74824TYe.LJJJJJ(Nl(num4), 6, "abnormal", "show", "");
                                                    return;
                                                }
                                                o.LJIJI("ivPanelGuestMax6");
                                                throw null;
                                            }
                                            View view22 = this.LLJJI;
                                            if (view22 != null) {
                                                if (o.LJ(v, view22)) {
                                                    if (this.LLJILJILJ == 3) {
                                                        return;
                                                    }
                                                    WeakHashMap<View, Boolean> weakHashMap4 = this.LLJJIJIIJIL;
                                                    View view23 = this.LLJJI;
                                                    if (view23 != null) {
                                                        if (o.LJ(weakHashMap4.get(view23), Boolean.TRUE)) {
                                                            cm(C74776TWi.LIZ);
                                                            return;
                                                        }
                                                        C30868C9o.LJI(C15380j0.LJIILL(R.string.nap, 3));
                                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings21 = this.LLJLLL;
                                                        if (multiLiveAnchorPanelSettings21 != null) {
                                                            num3 = Integer.valueOf(multiLiveAnchorPanelSettings21.layoutType);
                                                        } else {
                                                            num3 = null;
                                                        }
                                                        C74824TYe.LJJJJJ(Nl(num3), 3, "abnormal", "show", "");
                                                        return;
                                                    }
                                                    o.LJIJI("ivGridGuestMax3");
                                                    throw null;
                                                }
                                                View view24 = this.LLJJIII;
                                                if (view24 != null) {
                                                    if (o.LJ(v, view24)) {
                                                        if (this.LLJILJILJ == 5) {
                                                            return;
                                                        }
                                                        WeakHashMap<View, Boolean> weakHashMap5 = this.LLJJIJIIJIL;
                                                        View view25 = this.LLJJIII;
                                                        if (view25 != null) {
                                                            if (o.LJ(weakHashMap5.get(view25), Boolean.TRUE)) {
                                                                cm(C74776TWi.LIZIZ);
                                                                return;
                                                            }
                                                            C30868C9o.LJI(C15380j0.LJIILL(R.string.nap, 5));
                                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings22 = this.LLJLLL;
                                                            if (multiLiveAnchorPanelSettings22 != null) {
                                                                num2 = Integer.valueOf(multiLiveAnchorPanelSettings22.layoutType);
                                                            } else {
                                                                num2 = null;
                                                            }
                                                            C74824TYe.LJJJJJ(Nl(num2), 5, "abnormal", "show", "");
                                                            return;
                                                        }
                                                        o.LJIJI("ivGridGuestMax5");
                                                        throw null;
                                                    }
                                                    View view26 = this.LLJJIJI;
                                                    if (view26 != null) {
                                                        if (o.LJ(v, view26)) {
                                                            if (this.LLJILJILJ == 8) {
                                                                return;
                                                            }
                                                            WeakHashMap<View, Boolean> weakHashMap6 = this.LLJJIJIIJIL;
                                                            View view27 = this.LLJJIJI;
                                                            if (view27 != null) {
                                                                if (o.LJ(weakHashMap6.get(view27), Boolean.TRUE)) {
                                                                    cm(C74776TWi.LIZJ);
                                                                    return;
                                                                }
                                                                C30868C9o.LJI(C15380j0.LJIILL(R.string.nap, 8));
                                                                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings23 = this.LLJLLL;
                                                                if (multiLiveAnchorPanelSettings23 != null) {
                                                                    num = Integer.valueOf(multiLiveAnchorPanelSettings23.layoutType);
                                                                } else {
                                                                    num = null;
                                                                }
                                                                C74824TYe.LJJJJJ(Nl(num), 8, "abnormal", "show", "");
                                                                return;
                                                            }
                                                            o.LJIJI("ivGridGuestMax8");
                                                            throw null;
                                                        }
                                                        if (o.LJ(v, this.LLJL)) {
                                                            ISharedBgAbility iSharedBgAbility4 = this.LLLIILIL;
                                                            if (iSharedBgAbility4 != null && (Mb0 = iSharedBgAbility4.Mb0()) != null) {
                                                                Context context = getContext();
                                                                C74987Tbr.LIZJ("anchor_shared_bg", "handleClickSharedBgSettingItem");
                                                                HashMap hashMap3 = new HashMap();
                                                                C75285Tgf.LIZJ(hashMap3);
                                                                C75285Tgf.LIZIZ(hashMap3, null);
                                                                C75285Tgf.LJFF("livesdk_anchor_guest_setting_page_share_background_click", hashMap3);
                                                                C75236Tfs state4 = Mb0.getState();
                                                                if (state4 != null && state4.LJLILLLLZI) {
                                                                    InterfaceC30442Bx8.r3.LIZ(Boolean.FALSE);
                                                                    Mb0.setState(C75288Tgi.LJLIL);
                                                                }
                                                                C75236Tfs state5 = Mb0.getState();
                                                                if (state5 != null && !state5.LJLIL) {
                                                                    Mb0.lv0(R.string.n8e, "pm_mt_multiWallpaper_panelScreen_wallpaperEntry_toast");
                                                                    z = false;
                                                                } else {
                                                                    LiveEffect currentBgEffect = ((IEffectService) CN1.LIZ(IEffectService.class)).getCurrentBgEffect();
                                                                    if (currentBgEffect != null) {
                                                                        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider().LIZJ(currentBgEffect.getResourceId(), new C75282Tgc(Mb0, context));
                                                                    } else {
                                                                        Mb0.kv0(context, Mb0.LJLIL);
                                                                    }
                                                                    z = true;
                                                                }
                                                                bool = Boolean.valueOf(z);
                                                            } else {
                                                                bool = null;
                                                            }
                                                            if (o.LJ(bool, Boolean.TRUE)) {
                                                                this.LJLIL.dismiss();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    o.LJIJI("ivGridGuestMax8");
                                                    throw null;
                                                }
                                                o.LJIJI("ivGridGuestMax5");
                                                throw null;
                                            }
                                            o.LJIJI("ivGridGuestMax3");
                                            throw null;
                                        }
                                        o.LJIJI("ivPanelGuestMax6");
                                        throw null;
                                    }
                                    o.LJIJI("ivPanelGuestMax4");
                                    throw null;
                                }
                                o.LJIJI("moderatorEntranceLayout");
                                throw null;
                            }
                            o.LJIJI("mFollowerSwitchLayout");
                            throw null;
                        }
                        o.LJIJI("mViewerSwitchLayout");
                        throw null;
                    }
                    o.LJIJI("mSwitchLayout");
                    throw null;
                }
                o.LJIJI("mEqualLayoutBackground");
                throw null;
            }
            o.LJIJI("mFloatingWindowBackground");
            throw null;
        }
        o.LJIJI("mFloatingWindowBackground");
        throw null;
    }

    public final void xl(int i) {
        Long l;
        MultiGuestSharedBgAnchorViewModel Mb0;
        C75236Tfs state;
        AbstractC75306Th0 abstractC75306Th0 = (AbstractC75306Th0) this.LJLILLLLZI;
        if (abstractC75306Th0 != null) {
            Room Ml = Ml();
            String str = null;
            if (Ml != null) {
                l = Long.valueOf(Ml.getId());
            } else {
                l = null;
            }
            Long valueOf = Long.valueOf(Ol());
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLJLLL;
            ISharedBgAbility iSharedBgAbility = this.LLLIILIL;
            if (iSharedBgAbility != null && (Mb0 = iSharedBgAbility.Mb0()) != null && (state = Mb0.getState()) != null) {
                str = state.LJLJJI;
            }
            abstractC75306Th0.LJ(l, valueOf, multiLiveAnchorPanelSettings, i, null, null, C75283Tgd.LIZ(str));
        }
    }

    public static void Wl(Boolean bool, String str) {
        InterfaceC31805Ce1 interfaceC31805Ce1;
        if (bool == null) {
            bool = InterfaceC30442Bx8.LLZLL.LIZJ();
        }
        o.LJIIIIZZ(bool, "isFirstShown ?: LivePlug…RED_DOT_SHOULD_SHOW.value");
        boolean booleanValue = bool.booleanValue();
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        AbstractC74727TUl abstractC74727TUl = null;
        if ((obj instanceof InterfaceC31805Ce1) && (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj) != null) {
            abstractC74727TUl = interfaceC31805Ce1.LIZ();
        }
        C74824TYe.LJLJJI(str, booleanValue, abstractC74727TUl);
    }

    public final void Yl(String str, EnumC75310Th4 enumC75310Th4) {
        Long l;
        MultiGuestSharedBgAnchorViewModel Mb0;
        C75236Tfs state;
        Long l2;
        MultiGuestSharedBgAnchorViewModel Mb02;
        C75236Tfs state2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        C279017q.LJ("requestUpdateSetting layoutId:", str, "MultiLiveAnchorSettingDialog");
        String str2 = null;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            if (str != null && (multiLiveAnchorPanelSettings = this.LLJLLL) != null && multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
                if (multiLiveAnchorPanelSettings.layoutType == 1) {
                    ((ConcurrentHashMap) Pl().LJIIJJI).put(1, str);
                } else if (multiLiveAnchorPanelSettings.layoutType == 0) {
                    ((ConcurrentHashMap) Pl().LJIIJJI).put(2, str);
                }
            }
            AbstractC75306Th0 abstractC75306Th0 = (AbstractC75306Th0) this.LJLILLLLZI;
            if (abstractC75306Th0 != null) {
                Room Ml = Ml();
                if (Ml != null) {
                    l2 = Long.valueOf(Ml.getId());
                } else {
                    l2 = null;
                }
                Long valueOf = Long.valueOf(Ol());
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLJLLL;
                ISharedBgAbility iSharedBgAbility = this.LLLIILIL;
                if (iSharedBgAbility != null && (Mb02 = iSharedBgAbility.Mb0()) != null && (state2 = Mb02.getState()) != null) {
                    str2 = state2.LJLJJI;
                }
                abstractC75306Th0.LJ(l2, valueOf, multiLiveAnchorPanelSettings2, 1, str, enumC75310Th4, C75283Tgd.LIZ(str2));
                return;
            }
            return;
        }
        AbstractC75306Th0 abstractC75306Th02 = (AbstractC75306Th0) this.LJLILLLLZI;
        if (abstractC75306Th02 == null) {
            return;
        }
        Room Ml2 = Ml();
        if (Ml2 != null) {
            l = Long.valueOf(Ml2.getId());
        } else {
            l = null;
        }
        Long valueOf2 = Long.valueOf(Ol());
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = this.LLJLLL;
        ISharedBgAbility iSharedBgAbility2 = this.LLLIILIL;
        if (iSharedBgAbility2 != null && (Mb0 = iSharedBgAbility2.Mb0()) != null && (state = Mb0.getState()) != null) {
            str2 = state.LJLJJI;
        }
        abstractC75306Th02.LJ(l, valueOf2, multiLiveAnchorPanelSettings3, 1, null, enumC75310Th4, C75283Tgd.LIZ(str2));
    }

    public final void dm(boolean z, EnumC75310Th4 enumC75310Th4) {
        int i;
        int i2;
        int[] iArr = C75311Th5.LIZ;
        int i3 = iArr[enumC75310Th4.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        i = R.string.ne7;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    i = R.string.ne9;
                }
            } else {
                i = R.string.ne1;
            }
        } else {
            i = R.string.ne0;
        }
        String LJIILJJIL = C15380j0.LJIILJJIL(i);
        o.LJIIIIZZ(LJIILJJIL, "getString(\n            w…e\n            }\n        )");
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.naj);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_mu…_layoutChange_modal_desc)");
        int i4 = iArr[enumC75310Th4.ordinal()];
        if (i4 != 3) {
            if (i4 != 4) {
                i2 = R.string.ndz;
            } else {
                i2 = R.string.ne6;
            }
        } else {
            i2 = R.string.ne8;
        }
        String LJIILJJIL3 = C15380j0.LJIILJJIL(i2);
        o.LJIIIIZZ(LJIILJJIL3, "getString(\n            w…\n            },\n        )");
        String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.nax);
        o.LJIIIIZZ(LJIILJJIL4, "getString(R.string.pm_multi_layout_modal_btn)");
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LJI = LJIILJJIL;
        if (C29306Beo.LJIJJLI(LJIILJJIL2)) {
            c77437UaH.LIZLLL = LJIILJJIL2;
        }
        c77437UaH.LJFF(new DialogInterfaceOnClickListenerC75296Tgq(this, z, enumC75310Th4), LJIILJJIL3, false);
        c77437UaH.LIZLLL(new DialogInterfaceOnClickListenerC75304Tgy(this, z), LJIILJJIL4, false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-4110081820002523214")).LIZ) {
            return;
        }
        LIZ.show();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView
    public final void wl(int i, EnumC75310Th4 enumC75310Th4) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        EnumC74991Tbv LJJ;
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        U8H LJJZZI2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3;
        Integer valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateAnchorPanelSettingsSuccess updateAnchorSettingSource:");
        LIZ.append(i);
        C0NB.LIZIZ("MultiLiveAnchorSettingDialog", X1D.LIZIZ(LIZ));
        MultiGuestDataHolder Pl = Pl();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = this.LLJLLL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings5 = null;
        if (multiLiveAnchorPanelSettings4 != null) {
            multiLiveAnchorPanelSettings = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings4);
        } else {
            multiLiveAnchorPanelSettings = null;
        }
        Pl.LJIIJ = multiLiveAnchorPanelSettings;
        C74838TYs LJ = C74838TYs.LJ();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings6 = this.LLJLLL;
        if (multiLiveAnchorPanelSettings6 != null) {
            multiLiveAnchorPanelSettings2 = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings6);
        } else {
            multiLiveAnchorPanelSettings2 = null;
        }
        LJ.LJJI = multiLiveAnchorPanelSettings2;
        C48459J0d<MultiLiveAnchorPanelSettings> c48459J0d = InterfaceC30442Bx8.d0;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings7 = this.LLJLLL;
        if (multiLiveAnchorPanelSettings7 != null) {
            multiLiveAnchorPanelSettings5 = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings7);
        }
        c48459J0d.LIZ(multiLiveAnchorPanelSettings5);
        mm(this, false, 2);
        if (i != 1) {
            if (i != 2) {
                if (i != 4 || (multiLiveAnchorPanelSettings3 = this.LLJLLL) == null || (valueOf = Integer.valueOf(multiLiveAnchorPanelSettings3.applierSortSetting)) == null) {
                    return;
                }
                if (valueOf.intValue() == 0) {
                    C30868C9o.LIZJ(R.string.n7m);
                    return;
                } else {
                    if (valueOf.intValue() != 1) {
                        return;
                    }
                    C30868C9o.LIZJ(R.string.n7n);
                    return;
                }
            }
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 == null || (LJJZZI2 = R62.LJJZZI()) == null) {
                return;
            }
            LJJZZI2.LJJIJIIJIL("MultiLiveAnchorSettingDialog updateSeiSetting");
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings8 = Pl().LJIIJ;
        if (multiLiveAnchorPanelSettings8 != null && (LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings8)) != null) {
            String businessType = LJJ.getBusinessType();
            if (businessType != null && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null) {
                LJJZZI.LJJLIIIJJI(businessType, false);
            }
            if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                C74979Tbj c74979Tbj = C74979Tbj.LIZ;
                C74979Tbj.LJIIL = "manual";
                C74979Tbj.LJIILIIL = "manual";
                c74979Tbj.LJFF(LJJ, false);
            }
        }
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.r0;
            if (o.LJ(c48459J0d2.LIZJ(), Boolean.FALSE) && enumC75310Th4 == EnumC75310Th4.TURN_ON) {
                c48459J0d2.LIZ(Boolean.TRUE);
                return;
            }
        }
        this.LJLIL.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void mm(com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog r14, boolean r15, int r16) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog.mm(com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog, boolean, int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ISharedBgAbility iSharedBgAbility;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        boolean z;
        Integer num;
        String str;
        String str2;
        LiveMode liveMode;
        MultiGuestSharedBgAnchorViewModel Mb0;
        MultiGuestSharedBgAnchorViewModel Mb02;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        o.LJIIIZ(inflater, "inflater");
        C74614TQc.LIZ().LJ();
        if (TUZ.LIZ()) {
            try {
                MultiGuestAnchorThresholdConfigSetting multiGuestAnchorThresholdConfigSetting = MultiGuestAnchorThresholdConfigSetting.INSTANCE;
                this.LLILLJJLI = ((Number) ListProtector.get(multiGuestAnchorThresholdConfigSetting.getOptions(), 0)).intValue();
                this.LLILLL = ((Number) ListProtector.get(multiGuestAnchorThresholdConfigSetting.getOptions(), 1)).intValue();
                this.LLILZ = ((Number) ListProtector.get(multiGuestAnchorThresholdConfigSetting.getOptions(), 2)).intValue();
                this.LLILZIL = ((Number) ListProtector.get(multiGuestAnchorThresholdConfigSetting.getOptions(), 3)).intValue();
                this.LLILZLL = ((Number) ListProtector.get(multiGuestAnchorThresholdConfigSetting.getOptions(), 4)).intValue();
                this.LLIZLLLIL = multiGuestAnchorThresholdConfigSetting.getMaxCoins();
            } catch (Exception unused) {
            }
        }
        C88207Yjb.LJIILIIL("multi_guest_anchor_setting_page");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.czg, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…ttings, container, false)");
        this.LJLJJLL = LLLLIILL;
        C74614TQc.LIZ().LIZLLL();
        View view = this.LJLJJLL;
        C29S c29s = null;
        if (view != null) {
            View findViewById = view.findViewById(R.id.js4);
            o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.settings_scrollView)");
            this.LLJJJJLIIL = (C45631qh) findViewById;
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                View findViewById2 = view2.findViewById(R.id.ddd);
                o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.fl_content)");
                this.LJLJLJ = findViewById2;
                View view3 = this.LJLJJLL;
                if (view3 != null) {
                    View findViewById3 = view3.findViewById(R.id.m_n);
                    o.LJIIIIZZ(findViewById3, "mRootView.findViewById(R.id.tv_layout_setting)");
                    this.LJLJL = findViewById3;
                    View view4 = this.LJLJJLL;
                    if (view4 != null) {
                        View findViewById4 = view4.findViewById(R.id.bd7);
                        o.LJIIIIZZ(findViewById4, "mRootView.findViewById(R.id.cl_layout_switch)");
                        this.LJLJLLL = findViewById4;
                        View view5 = this.LJLJJLL;
                        if (view5 != null) {
                            View findViewById5 = view5.findViewById(R.id.de0);
                            o.LJIIIIZZ(findViewById5, "mRootView.findViewById(R.id.fl_fix_window)");
                            this.LJLL = findViewById5;
                            View view6 = this.LJLJJLL;
                            if (view6 != null) {
                                View findViewById6 = view6.findViewById(R.id.kxg);
                                o.LJIIIIZZ(findViewById6, "mRootView.findViewById(R…switch_fix_window_toggle)");
                                this.LJLLI = (C011602u) findViewById6;
                                View view7 = this.LJLJJLL;
                                if (view7 != null) {
                                    View findViewById7 = view7.findViewById(R.id.glm);
                                    o.LJIIIIZZ(findViewById7, "mRootView.findViewById(R.id.moderators_space)");
                                    this.LJLLILLLL = findViewById7;
                                    View view8 = this.LJLJJLL;
                                    if (view8 != null) {
                                        View findViewById8 = view8.findViewById(R.id.glk);
                                        o.LJIIIIZZ(findViewById8, "mRootView.findViewById(R.id.moderators_layout)");
                                        this.LJLLJ = findViewById8;
                                        View view9 = this.LJLJJLL;
                                        if (view9 != null) {
                                            View findViewById9 = view9.findViewById(R.id.glj);
                                            o.LJIIIIZZ(findViewById9, "mRootView.findViewById(R.id.moderators_dot)");
                                            this.LJLLL = findViewById9;
                                            View view10 = this.LJLJJLL;
                                            if (view10 != null) {
                                                View findViewById10 = view10.findViewById(R.id.dh5);
                                                o.LJIIIIZZ(findViewById10, "mRootView.findViewById(R.id.fl_switch_layout)");
                                                this.LJLLLL = findViewById10;
                                                View view11 = this.LJLJJLL;
                                                if (view11 != null) {
                                                    View findViewById11 = view11.findViewById(R.id.g3f);
                                                    o.LJIIIIZZ(findViewById11, "mRootView.findViewById(R…l_floating_window_layout)");
                                                    this.LJLLLLLL = findViewById11;
                                                    View view12 = this.LJLJJLL;
                                                    if (view12 != null) {
                                                        View findViewById12 = view12.findViewById(R.id.f39);
                                                        o.LJIIIIZZ(findViewById12, "mRootView.findViewById(R…v_floating_window_layout)");
                                                        this.LJZ = findViewById12;
                                                        View view13 = this.LJLJJLL;
                                                        if (view13 != null) {
                                                            View findViewById13 = view13.findViewById(R.id.md4);
                                                            o.LJIIIIZZ(findViewById13, "mRootView.findViewById(R.id.tv_panel)");
                                                            this.LJZI = (TextView) findViewById13;
                                                            View view14 = this.LJLJJLL;
                                                            if (view14 != null) {
                                                                View findViewById14 = view14.findViewById(R.id.f8a);
                                                                o.LJIIIIZZ(findViewById14, "mRootView.findViewById(R.id.iv_panel)");
                                                                this.LJZL = (ImageView) findViewById14;
                                                                View view15 = this.LJLJJLL;
                                                                if (view15 != null) {
                                                                    View findViewById15 = view15.findViewById(R.id.g39);
                                                                    o.LJIIIIZZ(findViewById15, "mRootView.findViewById(R.id.ll_equal_layout)");
                                                                    this.LJLZ = findViewById15;
                                                                    View view16 = this.LJLJJLL;
                                                                    if (view16 != null) {
                                                                        View findViewById16 = view16.findViewById(R.id.f2n);
                                                                        o.LJIIIIZZ(findViewById16, "mRootView.findViewById(R…iv_equal_talkroom_layout)");
                                                                        this.LL = findViewById16;
                                                                        View view17 = this.LJLJJLL;
                                                                        if (view17 != null) {
                                                                            o.LJIIIIZZ(view17.findViewById(R.id.m7s), "mRootView.findViewById(R.id.tv_grid)");
                                                                            View view18 = this.LJLJJLL;
                                                                            if (view18 != null) {
                                                                                o.LJIIIIZZ(view18.findViewById(R.id.f3x), "mRootView.findViewById(R.id.iv_grid)");
                                                                                View view19 = this.LJLJJLL;
                                                                                if (view19 != null) {
                                                                                    View findViewById17 = view19.findViewById(R.id.kxx);
                                                                                    o.LJIIIIZZ(findViewById17, "mRootView.findViewById(R…switch_viewer_req_toggle)");
                                                                                    this.LLD = (C011602u) findViewById17;
                                                                                    View view20 = this.LJLJJLL;
                                                                                    if (view20 != null) {
                                                                                        View findViewById18 = view20.findViewById(R.id.ncv);
                                                                                        o.LJIIIIZZ(findViewById18, "mRootView.findViewById(R…permission_switch_layout)");
                                                                                        this.LLF = findViewById18;
                                                                                        View view21 = this.LJLJJLL;
                                                                                        if (view21 != null) {
                                                                                            View findViewById19 = view21.findViewById(R.id.kxh);
                                                                                            o.LJIIIIZZ(findViewById19, "mRootView.findViewById(R…follower_req_only_toggle)");
                                                                                            this.LLFF = (C011602u) findViewById19;
                                                                                            View view22 = this.LJLJJLL;
                                                                                            if (view22 != null) {
                                                                                                View findViewById20 = view22.findViewById(R.id.dl8);
                                                                                                o.LJIIIIZZ(findViewById20, "mRootView.findViewById(R…permission_switch_layout)");
                                                                                                this.LLFFF = findViewById20;
                                                                                                View view23 = this.LJLJJLL;
                                                                                                if (view23 != null) {
                                                                                                    this.LLFII = (ViewGroup) view23.findViewById(R.id.dl7);
                                                                                                    View view24 = this.LJLJJLL;
                                                                                                    if (view24 != null) {
                                                                                                        this.LLFZ = (ViewGroup) view24.findViewById(R.id.dw8);
                                                                                                        View view25 = this.LJLJJLL;
                                                                                                        if (view25 != null) {
                                                                                                            this.LLI = (ViewGroup) view25.findViewById(R.id.dwb);
                                                                                                            View view26 = this.LJLJJLL;
                                                                                                            if (view26 != null) {
                                                                                                                this.LLIFFJFJJ = (C011602u) view26.findViewById(R.id.dwa);
                                                                                                                View view27 = this.LJLJJLL;
                                                                                                                if (view27 != null) {
                                                                                                                    this.LLII = (ViewGroup) view27.findViewById(R.id.dvx);
                                                                                                                    View view28 = this.LJLJJLL;
                                                                                                                    if (view28 != null) {
                                                                                                                        this.LLIIII = (C2A7) view28.findViewById(R.id.jr_);
                                                                                                                        View view29 = this.LJLJJLL;
                                                                                                                        if (view29 != null) {
                                                                                                                            this.LLIIIILZ = (C2A7) view29.findViewById(R.id.jrf);
                                                                                                                            View view30 = this.LJLJJLL;
                                                                                                                            if (view30 != null) {
                                                                                                                                this.LLIIIJ = (C2A7) view30.findViewById(R.id.jra);
                                                                                                                                View view31 = this.LJLJJLL;
                                                                                                                                if (view31 != null) {
                                                                                                                                    this.LLIIIL = (C2A7) view31.findViewById(R.id.jrd);
                                                                                                                                    View view32 = this.LJLJJLL;
                                                                                                                                    if (view32 != null) {
                                                                                                                                        this.LLIIIZ = (C2A7) view32.findViewById(R.id.jrg);
                                                                                                                                        View view33 = this.LJLJJLL;
                                                                                                                                        if (view33 != null) {
                                                                                                                                            this.LLIIJI = (C2A7) view33.findViewById(R.id.jrj);
                                                                                                                                            View view34 = this.LJLJJLL;
                                                                                                                                            if (view34 != null) {
                                                                                                                                                this.LLIIJLIL = (ImageView) view34.findViewById(R.id.jrc);
                                                                                                                                                View view35 = this.LJLJJLL;
                                                                                                                                                if (view35 != null) {
                                                                                                                                                    this.LLIIL = (ImageView) view35.findViewById(R.id.jri);
                                                                                                                                                    View view36 = this.LJLJJLL;
                                                                                                                                                    if (view36 != null) {
                                                                                                                                                        this.LLIILII = (ImageView) view36.findViewById(R.id.jrb);
                                                                                                                                                        View view37 = this.LJLJJLL;
                                                                                                                                                        if (view37 != null) {
                                                                                                                                                            this.LLIILZL = (ImageView) view37.findViewById(R.id.jre);
                                                                                                                                                            View view38 = this.LJLJJLL;
                                                                                                                                                            if (view38 != null) {
                                                                                                                                                                this.LLIIZ = (ImageView) view38.findViewById(R.id.jrh);
                                                                                                                                                                View view39 = this.LJLJJLL;
                                                                                                                                                                if (view39 != null) {
                                                                                                                                                                    this.LLIL = (ImageView) view39.findViewById(R.id.jrk);
                                                                                                                                                                    View view40 = this.LJLJJLL;
                                                                                                                                                                    if (view40 != null) {
                                                                                                                                                                        View findViewById21 = view40.findViewById(R.id.dzm);
                                                                                                                                                                        o.LJIIIIZZ(findViewById21, "mRootView.findViewById(R.id.guest_max_count)");
                                                                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) findViewById21;
                                                                                                                                                                        this.LLJ = relativeLayout;
                                                                                                                                                                        View findViewById22 = relativeLayout.findViewById(R.id.bdf);
                                                                                                                                                                        o.LJIIIIZZ(findViewById22, "guestMaxCountView.findVi….id.cl_panel_guest_count)");
                                                                                                                                                                        this.LLJI = findViewById22;
                                                                                                                                                                        RelativeLayout relativeLayout2 = this.LLJ;
                                                                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                                                                            View findViewById23 = relativeLayout2.findViewById(R.id.bd1);
                                                                                                                                                                            o.LJIIIIZZ(findViewById23, "guestMaxCountView.findVi…R.id.cl_grid_guest_count)");
                                                                                                                                                                            this.LLJIJIL = findViewById23;
                                                                                                                                                                            RelativeLayout relativeLayout3 = this.LLJ;
                                                                                                                                                                            if (relativeLayout3 != null) {
                                                                                                                                                                                View findViewById24 = relativeLayout3.findViewById(R.id.f8c);
                                                                                                                                                                                o.LJIIIIZZ(findViewById24, "guestMaxCountView.findVi…ById(R.id.iv_panel_max_4)");
                                                                                                                                                                                this.LLJILLL = findViewById24;
                                                                                                                                                                                RelativeLayout relativeLayout4 = this.LLJ;
                                                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                                                    View findViewById25 = relativeLayout4.findViewById(R.id.md7);
                                                                                                                                                                                    o.LJIIIIZZ(findViewById25, "guestMaxCountView.findVi….id.tv_panel_guest_max_4)");
                                                                                                                                                                                    this.LLJJIJIL = (TextView) findViewById25;
                                                                                                                                                                                    RelativeLayout relativeLayout5 = this.LLJ;
                                                                                                                                                                                    if (relativeLayout5 != null) {
                                                                                                                                                                                        View findViewById26 = relativeLayout5.findViewById(R.id.md8);
                                                                                                                                                                                        o.LJIIIIZZ(findViewById26, "guestMaxCountView.findVi….id.tv_panel_guest_max_6)");
                                                                                                                                                                                        this.LLJJJ = (TextView) findViewById26;
                                                                                                                                                                                        RelativeLayout relativeLayout6 = this.LLJ;
                                                                                                                                                                                        if (relativeLayout6 != null) {
                                                                                                                                                                                            View findViewById27 = relativeLayout6.findViewById(R.id.m7t);
                                                                                                                                                                                            o.LJIIIIZZ(findViewById27, "guestMaxCountView.findVi…R.id.tv_grid_guest_max_3)");
                                                                                                                                                                                            this.LLJJJIL = (TextView) findViewById27;
                                                                                                                                                                                            RelativeLayout relativeLayout7 = this.LLJ;
                                                                                                                                                                                            if (relativeLayout7 != null) {
                                                                                                                                                                                                View findViewById28 = relativeLayout7.findViewById(R.id.m7u);
                                                                                                                                                                                                o.LJIIIIZZ(findViewById28, "guestMaxCountView.findVi…R.id.tv_grid_guest_max_5)");
                                                                                                                                                                                                this.LLJJJJ = (TextView) findViewById28;
                                                                                                                                                                                                RelativeLayout relativeLayout8 = this.LLJ;
                                                                                                                                                                                                if (relativeLayout8 != null) {
                                                                                                                                                                                                    View findViewById29 = relativeLayout8.findViewById(R.id.m7v);
                                                                                                                                                                                                    o.LJIIIIZZ(findViewById29, "guestMaxCountView.findVi…R.id.tv_grid_guest_max_8)");
                                                                                                                                                                                                    this.LLJJJJJIL = (TextView) findViewById29;
                                                                                                                                                                                                    RelativeLayout relativeLayout9 = this.LLJ;
                                                                                                                                                                                                    if (relativeLayout9 != null) {
                                                                                                                                                                                                        View findViewById30 = relativeLayout9.findViewById(R.id.f8d);
                                                                                                                                                                                                        o.LJIIIIZZ(findViewById30, "guestMaxCountView.findVi…ById(R.id.iv_panel_max_6)");
                                                                                                                                                                                                        this.LLJJ = findViewById30;
                                                                                                                                                                                                        RelativeLayout relativeLayout10 = this.LLJ;
                                                                                                                                                                                                        if (relativeLayout10 != null) {
                                                                                                                                                                                                            View findViewById31 = relativeLayout10.findViewById(R.id.f3y);
                                                                                                                                                                                                            o.LJIIIIZZ(findViewById31, "guestMaxCountView.findViewById(R.id.iv_grid_max_3)");
                                                                                                                                                                                                            this.LLJJI = findViewById31;
                                                                                                                                                                                                            RelativeLayout relativeLayout11 = this.LLJ;
                                                                                                                                                                                                            if (relativeLayout11 != null) {
                                                                                                                                                                                                                View findViewById32 = relativeLayout11.findViewById(R.id.f3z);
                                                                                                                                                                                                                o.LJIIIIZZ(findViewById32, "guestMaxCountView.findViewById(R.id.iv_grid_max_5)");
                                                                                                                                                                                                                this.LLJJIII = findViewById32;
                                                                                                                                                                                                                RelativeLayout relativeLayout12 = this.LLJ;
                                                                                                                                                                                                                if (relativeLayout12 != null) {
                                                                                                                                                                                                                    View findViewById33 = relativeLayout12.findViewById(R.id.f40);
                                                                                                                                                                                                                    o.LJIIIIZZ(findViewById33, "guestMaxCountView.findViewById(R.id.iv_grid_max_8)");
                                                                                                                                                                                                                    this.LLJJIJI = findViewById33;
                                                                                                                                                                                                                    View view41 = this.LLJILLL;
                                                                                                                                                                                                                    if (view41 != null) {
                                                                                                                                                                                                                        C16880lQ.LJIIJ(this, view41);
                                                                                                                                                                                                                        View view42 = this.LLJJ;
                                                                                                                                                                                                                        if (view42 != null) {
                                                                                                                                                                                                                            C16880lQ.LJIIJ(this, view42);
                                                                                                                                                                                                                            View view43 = this.LLJJI;
                                                                                                                                                                                                                            if (view43 != null) {
                                                                                                                                                                                                                                C16880lQ.LJIIJ(this, view43);
                                                                                                                                                                                                                                View view44 = this.LLJJIII;
                                                                                                                                                                                                                                if (view44 != null) {
                                                                                                                                                                                                                                    C16880lQ.LJIIJ(this, view44);
                                                                                                                                                                                                                                    View view45 = this.LLJJIJI;
                                                                                                                                                                                                                                    if (view45 != null) {
                                                                                                                                                                                                                                        C16880lQ.LJIIJ(this, view45);
                                                                                                                                                                                                                                        View view46 = this.LJLJJLL;
                                                                                                                                                                                                                                        if (view46 != null) {
                                                                                                                                                                                                                                            View findViewById34 = view46.findViewById(R.id.dyb);
                                                                                                                                                                                                                                            o.LJIIIIZZ(findViewById34, "mRootView.findViewById(R.id.gray_divider)");
                                                                                                                                                                                                                                            this.LLJJL = findViewById34;
                                                                                                                                                                                                                                            View view47 = this.LJLJJLL;
                                                                                                                                                                                                                                            if (view47 != null) {
                                                                                                                                                                                                                                                View findViewById35 = view47.findViewById(R.id.m_l);
                                                                                                                                                                                                                                                o.LJIIIIZZ(findViewById35, "mRootView.findViewById(R.id.tv_layout_permission)");
                                                                                                                                                                                                                                                this.LLJJLIIIJLLLLLLLZ = findViewById35;
                                                                                                                                                                                                                                                View view48 = this.LLF;
                                                                                                                                                                                                                                                if (view48 != null) {
                                                                                                                                                                                                                                                    C16880lQ.LJIIJ(this, view48);
                                                                                                                                                                                                                                                    View view49 = this.LLFFF;
                                                                                                                                                                                                                                                    if (view49 != null) {
                                                                                                                                                                                                                                                        C16880lQ.LJIIJ(this, view49);
                                                                                                                                                                                                                                                        View view50 = this.LJZ;
                                                                                                                                                                                                                                                        if (view50 != null) {
                                                                                                                                                                                                                                                            C16880lQ.LJIIJ(this, view50);
                                                                                                                                                                                                                                                            View view51 = this.LL;
                                                                                                                                                                                                                                                            if (view51 != null) {
                                                                                                                                                                                                                                                                C16880lQ.LJIIJ(this, view51);
                                                                                                                                                                                                                                                                View view52 = this.LJLLLL;
                                                                                                                                                                                                                                                                if (view52 != null) {
                                                                                                                                                                                                                                                                    C16880lQ.LJIIJ(this, view52);
                                                                                                                                                                                                                                                                    View view53 = this.LJLLJ;
                                                                                                                                                                                                                                                                    if (view53 != null) {
                                                                                                                                                                                                                                                                        C16880lQ.LJIIJ(this, view53);
                                                                                                                                                                                                                                                                        DataChannel dataChannel = this.LJLJJL;
                                                                                                                                                                                                                                                                        if (dataChannel != null && (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel.kv0(C75415Til.class)) != null) {
                                                                                                                                                                                                                                                                            iSharedBgAbility = (ISharedBgAbility) UC0.LJIIL(interfaceC55235Lm3, ISharedBgAbility.class, null);
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                            iSharedBgAbility = null;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        this.LLLIILIL = iSharedBgAbility;
                                                                                                                                                                                                                                                                        View view54 = this.LJLJJLL;
                                                                                                                                                                                                                                                                        if (view54 != null) {
                                                                                                                                                                                                                                                                            this.LLJL = (ViewGroup) view54.findViewById(R.id.hi2);
                                                                                                                                                                                                                                                                            View view55 = this.LJLJJLL;
                                                                                                                                                                                                                                                                            if (view55 != null) {
                                                                                                                                                                                                                                                                                this.LLJLIL = (TextView) view55.findViewById(R.id.mjw);
                                                                                                                                                                                                                                                                                View view56 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                if (view56 != null) {
                                                                                                                                                                                                                                                                                    this.LLJLILLLLZIIL = (TextView) view56.findViewById(R.id.mjv);
                                                                                                                                                                                                                                                                                    View view57 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                    if (view57 != null) {
                                                                                                                                                                                                                                                                                        this.LLJLL = (LiveIconView) view57.findViewById(R.id.ecj);
                                                                                                                                                                                                                                                                                        View view58 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                        if (view58 != null) {
                                                                                                                                                                                                                                                                                            this.LLJLLIL = view58.findViewById(R.id.jvm);
                                                                                                                                                                                                                                                                                            ViewGroup viewGroup2 = this.LLJL;
                                                                                                                                                                                                                                                                                            int i2 = 8;
                                                                                                                                                                                                                                                                                            if (viewGroup2 != null) {
                                                                                                                                                                                                                                                                                                if (C75283Tgd.LIZJ(true)) {
                                                                                                                                                                                                                                                                                                    i = 0;
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                    i = 8;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                viewGroup2.setVisibility(i);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            ViewGroup viewGroup3 = this.LLJL;
                                                                                                                                                                                                                                                                                            if (viewGroup3 != null) {
                                                                                                                                                                                                                                                                                                C16880lQ.LJIIL(viewGroup3, this);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            LiveIconView liveIconView = this.LLJLL;
                                                                                                                                                                                                                                                                                            if (liveIconView != null) {
                                                                                                                                                                                                                                                                                                liveIconView.setIconAttr(R.attr.asp);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            ISharedBgAbility iSharedBgAbility2 = this.LLLIILIL;
                                                                                                                                                                                                                                                                                            if (iSharedBgAbility2 != null && (Mb02 = iSharedBgAbility2.Mb0()) != null) {
                                                                                                                                                                                                                                                                                                Mb02.jv0(new TBV() { // from class: X.Th6
                                                                                                                                                                                                                                                                                                    @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                                                                                                                                                                                                                                                                                                    public final Object get(Object obj) {
                                                                                                                                                                                                                                                                                                        return Boolean.valueOf(((C75236Tfs) obj).LJLIL);
                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                    @Override // X.TBV, X.AbstractC74224TBc
                                                                                                                                                                                                                                                                                                    public final void set(Object obj, Object obj2) {
                                                                                                                                                                                                                                                                                                        ((C75236Tfs) obj).LJLIL = ((Boolean) obj2).booleanValue();
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }, null, this.LJLIL.getLifecycleOwner(), new AqS179S0100000_13(this, 87));
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            ISharedBgAbility iSharedBgAbility3 = this.LLLIILIL;
                                                                                                                                                                                                                                                                                            if (iSharedBgAbility3 != null && (Mb0 = iSharedBgAbility3.Mb0()) != null) {
                                                                                                                                                                                                                                                                                                Mb0.jv0(new TBV() { // from class: X.Th7
                                                                                                                                                                                                                                                                                                    @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                                                                                                                                                                                                                                                                                                    public final Object get(Object obj) {
                                                                                                                                                                                                                                                                                                        return Boolean.valueOf(((C75236Tfs) obj).LJLILLLLZI);
                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                    @Override // X.TBV, X.AbstractC74224TBc
                                                                                                                                                                                                                                                                                                    public final void set(Object obj, Object obj2) {
                                                                                                                                                                                                                                                                                                        ((C75236Tfs) obj).LJLILLLLZI = ((Boolean) obj2).booleanValue();
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }, null, this.LJLIL.getLifecycleOwner(), new AqS179S0100000_13(this, 88));
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = Pl().LJIIJ;
                                                                                                                                                                                                                                                                                            if (multiLiveAnchorPanelSettings2 != null) {
                                                                                                                                                                                                                                                                                                multiLiveAnchorPanelSettings = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings2);
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                multiLiveAnchorPanelSettings = null;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            this.LLJLLL = multiLiveAnchorPanelSettings;
                                                                                                                                                                                                                                                                                            View view59 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                            if (view59 != null) {
                                                                                                                                                                                                                                                                                                this.LLLFFI = (ViewGroup) view59.findViewById(R.id.dzr);
                                                                                                                                                                                                                                                                                                View view60 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                                if (view60 != null) {
                                                                                                                                                                                                                                                                                                    this.LLLFZ = (C47061t0) view60.findViewById(R.id.dzt);
                                                                                                                                                                                                                                                                                                    View view61 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                                    if (view61 != null) {
                                                                                                                                                                                                                                                                                                        this.LLLI = (C47061t0) view61.findViewById(R.id.dzp);
                                                                                                                                                                                                                                                                                                        View view62 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                                        if (view62 != null) {
                                                                                                                                                                                                                                                                                                            this.LLLII = (ImageView) view62.findViewById(R.id.dzu);
                                                                                                                                                                                                                                                                                                            View view63 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                                            if (view63 != null) {
                                                                                                                                                                                                                                                                                                                this.LLLIIII = (ImageView) view63.findViewById(R.id.dzq);
                                                                                                                                                                                                                                                                                                                View view64 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                                                if (view64 != null) {
                                                                                                                                                                                                                                                                                                                    this.LLLIIIIL = view64.findViewById(R.id.ixp);
                                                                                                                                                                                                                                                                                                                    if (TUZ.LIZ()) {
                                                                                                                                                                                                                                                                                                                        HashMap<Integer, OSZ<C2A7, ImageView>> Kl = Kl();
                                                                                                                                                                                                                                                                                                                        Kl.put(Integer.valueOf(this.LLILLJJLI), new OSZ<>(this.LLIIII, this.LLIIJLIL));
                                                                                                                                                                                                                                                                                                                        Kl.put(Integer.valueOf(this.LLILLL), new OSZ<>(this.LLIIIILZ, this.LLIIL));
                                                                                                                                                                                                                                                                                                                        Kl.put(Integer.valueOf(this.LLILZ), new OSZ<>(this.LLIIIJ, this.LLIILII));
                                                                                                                                                                                                                                                                                                                        Kl.put(Integer.valueOf(this.LLILZIL), new OSZ<>(this.LLIIIL, this.LLIILZL));
                                                                                                                                                                                                                                                                                                                        Kl.put(Integer.valueOf(this.LLILZLL), new OSZ<>(this.LLIIIZ, this.LLIIZ));
                                                                                                                                                                                                                                                                                                                        Kl.put(0, new OSZ<>(this.LLIIJI, this.LLIL));
                                                                                                                                                                                                                                                                                                                        C2A7 c2a7 = this.LLIIII;
                                                                                                                                                                                                                                                                                                                        if (c2a7 != null) {
                                                                                                                                                                                                                                                                                                                            c2a7.setText(Ll(this.LLILLJJLI));
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        C2A7 c2a72 = this.LLIIIILZ;
                                                                                                                                                                                                                                                                                                                        if (c2a72 != null) {
                                                                                                                                                                                                                                                                                                                            c2a72.setText(Ll(this.LLILLL));
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        C2A7 c2a73 = this.LLIIIJ;
                                                                                                                                                                                                                                                                                                                        if (c2a73 != null) {
                                                                                                                                                                                                                                                                                                                            c2a73.setText(Ll(this.LLILZ));
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        C2A7 c2a74 = this.LLIIIL;
                                                                                                                                                                                                                                                                                                                        if (c2a74 != null) {
                                                                                                                                                                                                                                                                                                                            c2a74.setText(Ll(this.LLILZIL));
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        C2A7 c2a75 = this.LLIIIZ;
                                                                                                                                                                                                                                                                                                                        if (c2a75 != null) {
                                                                                                                                                                                                                                                                                                                            c2a75.setText(Ll(this.LLILZLL));
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        ViewGroup viewGroup4 = this.LLFZ;
                                                                                                                                                                                                                                                                                                                        if (viewGroup4 != null) {
                                                                                                                                                                                                                                                                                                                            C87277YNd.LJJIJ(viewGroup4);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        ViewGroup viewGroup5 = this.LLI;
                                                                                                                                                                                                                                                                                                                        if (viewGroup5 != null) {
                                                                                                                                                                                                                                                                                                                            C16880lQ.LJIIL(viewGroup5, this);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = Pl().LJIIJ;
                                                                                                                                                                                                                                                                                                                        if (multiLiveAnchorPanelSettings3 != null) {
                                                                                                                                                                                                                                                                                                                            if (multiLiveAnchorPanelSettings3.applierSortGiftScoreThreshold <= 0) {
                                                                                                                                                                                                                                                                                                                                C011602u c011602u = this.LLIFFJFJJ;
                                                                                                                                                                                                                                                                                                                                if (c011602u != null) {
                                                                                                                                                                                                                                                                                                                                    c011602u.setChecked(false);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                C011602u c011602u2 = this.LLIFFJFJJ;
                                                                                                                                                                                                                                                                                                                                if (c011602u2 != null) {
                                                                                                                                                                                                                                                                                                                                    c011602u2.setChecked(true);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                Dl(multiLiveAnchorPanelSettings3.applierSortGiftScoreThreshold);
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        km();
                                                                                                                                                                                                                                                                                                                        for (Map.Entry<Integer, OSZ<C2A7, ImageView>> entry : Kl().entrySet()) {
                                                                                                                                                                                                                                                                                                                            C2A7 first = entry.getValue().getFirst();
                                                                                                                                                                                                                                                                                                                            if (first != null) {
                                                                                                                                                                                                                                                                                                                                C16880lQ.LJJIII(first, new ACListenerS47S0200000_13(entry, this, 32));
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    View view65 = this.LJLLL;
                                                                                                                                                                                                                                                                                                                    if (view65 != null) {
                                                                                                                                                                                                                                                                                                                        if (Vl()) {
                                                                                                                                                                                                                                                                                                                            i2 = 0;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        view65.setVisibility(i2);
                                                                                                                                                                                                                                                                                                                        if (C74697TTh.LIZ()) {
                                                                                                                                                                                                                                                                                                                            View view66 = this.LJLLILLLL;
                                                                                                                                                                                                                                                                                                                            if (view66 != null) {
                                                                                                                                                                                                                                                                                                                                C29306Beo.LJJLJLI(view66);
                                                                                                                                                                                                                                                                                                                                View view67 = this.LJLLJ;
                                                                                                                                                                                                                                                                                                                                if (view67 != null) {
                                                                                                                                                                                                                                                                                                                                    C29306Beo.LJJLJLI(view67);
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                    o.LJIJI("moderatorEntranceLayout");
                                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                o.LJIJI("moderatorSpaceView");
                                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                            View view68 = this.LJLLILLLL;
                                                                                                                                                                                                                                                                                                                            if (view68 != null) {
                                                                                                                                                                                                                                                                                                                                C29306Beo.LJI(view68);
                                                                                                                                                                                                                                                                                                                                View view69 = this.LJLLJ;
                                                                                                                                                                                                                                                                                                                                if (view69 != null) {
                                                                                                                                                                                                                                                                                                                                    C29306Beo.LJI(view69);
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                    o.LJIJI("moderatorEntranceLayout");
                                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                o.LJIJI("moderatorSpaceView");
                                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        Tl();
                                                                                                                                                                                                                                                                                                                        mm(this, true, 1);
                                                                                                                                                                                                                                                                                                                        DataChannel dataChannel2 = this.LJLJJL;
                                                                                                                                                                                                                                                                                                                        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.kv0(BCX.class)) != null && C28509BGv.LIZLLL(liveMode)) {
                                                                                                                                                                                                                                                                                                                            z = true;
                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                            z = false;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (z) {
                                                                                                                                                                                                                                                                                                                            C0NB.LIZIZ("voice_chat", "MultiLiveAnchorSettingDialog_initView isLiveVoice:true");
                                                                                                                                                                                                                                                                                                                            View view70 = this.LJLJL;
                                                                                                                                                                                                                                                                                                                            if (view70 != null) {
                                                                                                                                                                                                                                                                                                                                C87277YNd.LJJIIZ(view70);
                                                                                                                                                                                                                                                                                                                                View view71 = this.LJLJLLL;
                                                                                                                                                                                                                                                                                                                                if (view71 != null) {
                                                                                                                                                                                                                                                                                                                                    C87277YNd.LJJIIZ(view71);
                                                                                                                                                                                                                                                                                                                                    View view72 = this.LJLL;
                                                                                                                                                                                                                                                                                                                                    if (view72 != null) {
                                                                                                                                                                                                                                                                                                                                        C87277YNd.LJJIIZ(view72);
                                                                                                                                                                                                                                                                                                                                        View view73 = this.LLJJL;
                                                                                                                                                                                                                                                                                                                                        if (view73 != null) {
                                                                                                                                                                                                                                                                                                                                            C87277YNd.LJJIIZ(view73);
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            o.LJIJI("viewDivider");
                                                                                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                        o.LJIJI("flFixWindow");
                                                                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                    o.LJIJI("clLayoutSwitch");
                                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                o.LJIJI("tvLayoutSetting");
                                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                            C0NB.LIZIZ("voice_chat", "MultiLiveAnchorSettingDialog_initView isLiveVoice:false");
                                                                                                                                                                                                                                                                                                                            View view74 = this.LJLJL;
                                                                                                                                                                                                                                                                                                                            if (view74 != null) {
                                                                                                                                                                                                                                                                                                                                C87277YNd.LJJIJ(view74);
                                                                                                                                                                                                                                                                                                                                View view75 = this.LJLJLLL;
                                                                                                                                                                                                                                                                                                                                if (view75 != null) {
                                                                                                                                                                                                                                                                                                                                    C87277YNd.LJJIJ(view75);
                                                                                                                                                                                                                                                                                                                                    View view76 = this.LJLL;
                                                                                                                                                                                                                                                                                                                                    if (view76 != null) {
                                                                                                                                                                                                                                                                                                                                        C87277YNd.LJJIJ(view76);
                                                                                                                                                                                                                                                                                                                                        View view77 = this.LLJJL;
                                                                                                                                                                                                                                                                                                                                        if (view77 != null) {
                                                                                                                                                                                                                                                                                                                                            C87277YNd.LJJIJ(view77);
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            o.LJIJI("viewDivider");
                                                                                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                        o.LJIJI("flFixWindow");
                                                                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                    o.LJIJI("clLayoutSwitch");
                                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                o.LJIJI("tvLayoutSetting");
                                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (Vl()) {
                                                                                                                                                                                                                                                                                                                            C45631qh c45631qh = this.LLJJJJLIIL;
                                                                                                                                                                                                                                                                                                                            if (c45631qh != null) {
                                                                                                                                                                                                                                                                                                                                c45631qh.post(new ARunnableS49S0100000_13(this, 176));
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                o.LJIJI("nestScrollView");
                                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (TUT.LIZ() && !TV3.LJIIJ()) {
                                                                                                                                                                                                                                                                                                                            fm();
                                                                                                                                                                                                                                                                                                                            ViewGroup viewGroup6 = this.LLLFFI;
                                                                                                                                                                                                                                                                                                                            if (viewGroup6 != null) {
                                                                                                                                                                                                                                                                                                                                C87277YNd.LJJIJ(viewGroup6);
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = Pl().LJIIJ;
                                                                                                                                                                                                                                                                                                                            if (multiLiveAnchorPanelSettings4 != null) {
                                                                                                                                                                                                                                                                                                                                num = Integer.valueOf(multiLiveAnchorPanelSettings4.applierSortSetting);
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                num = null;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            if (num == null || num.intValue() != 0) {
                                                                                                                                                                                                                                                                                                                                if (num != null && num.intValue() == 1) {
                                                                                                                                                                                                                                                                                                                                    Jl();
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                ImageView imageView = this.LLLII;
                                                                                                                                                                                                                                                                                                                                if (imageView != null) {
                                                                                                                                                                                                                                                                                                                                    imageView.setBackgroundResource(R.drawable.d96);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                ImageView imageView2 = this.LLLIIII;
                                                                                                                                                                                                                                                                                                                                if (imageView2 != null) {
                                                                                                                                                                                                                                                                                                                                    imageView2.setBackgroundResource(0);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            ImageView imageView3 = this.LLLIIII;
                                                                                                                                                                                                                                                                                                                            if (imageView3 != null) {
                                                                                                                                                                                                                                                                                                                                C29306Beo.LJJJLL(imageView3, 500L, new AqS179S0100000_13(this, 492));
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            ImageView imageView4 = this.LLLII;
                                                                                                                                                                                                                                                                                                                            if (imageView4 != null) {
                                                                                                                                                                                                                                                                                                                                C29306Beo.LJJJLL(imageView4, 500L, new AqS179S0100000_13(this, 493));
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            if (C15380j0.LJIIZILJ()) {
                                                                                                                                                                                                                                                                                                                                str = "ttlive_multi_guest_apply_display_normal_rtl.png";
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                str = "ttlive_multi_guest_apply_display_normal_ltr.png";
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            if (C15380j0.LJIIZILJ()) {
                                                                                                                                                                                                                                                                                                                                str2 = "ttlive_multi_guest_apply_display_coins_rtl.png";
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                str2 = "ttlive_multi_guest_apply_display_coins_ltr.png";
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            C15490jB.LJ(this.LLLFZ, "tiktok_live_interaction_normal_1", str);
                                                                                                                                                                                                                                                                                                                            C15490jB.LJ(this.LLLI, "tiktok_live_interaction_normal_1", str2);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        InterfaceC30442Bx8.LLZ.LIZ(Boolean.TRUE);
                                                                                                                                                                                                                                                                                                                        DataChannel dataChannel3 = this.LJLJJL;
                                                                                                                                                                                                                                                                                                                        if (dataChannel3 != null) {
                                                                                                                                                                                                                                                                                                                            dataChannel3.lv0(this, MultiGuestUserChangedEvent.class, new AqS179S0100000_13(this, 89));
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        InterfaceC74940Tb6 LIZ = C74614TQc.LIZ();
                                                                                                                                                                                                                                                                                                                        View view78 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                                                        if (view78 != null) {
                                                                                                                                                                                                                                                                                                                            LIZ.LIZJ(view78);
                                                                                                                                                                                                                                                                                                                            View view79 = this.LJLJJLL;
                                                                                                                                                                                                                                                                                                                            if (view79 != null) {
                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                    ViewTreeLifecycleOwner.set(view79, getViewLifecycleOwner());
                                                                                                                                                                                                                                                                                                                                    ViewTreeViewModelStoreOwner.set(view79, this);
                                                                                                                                                                                                                                                                                                                                    C10A.LIZIZ(view79, this);
                                                                                                                                                                                                                                                                                                                                    ActivityC45651qj mo49getActivity = mo49getActivity();
                                                                                                                                                                                                                                                                                                                                    if (mo49getActivity instanceof C29S) {
                                                                                                                                                                                                                                                                                                                                        c29s = (C29S) mo49getActivity;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    C90903hW.LIZ(c29s);
                                                                                                                                                                                                                                                                                                                                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                                                                                                                                                                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                                                                                                                                                                                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                return view79;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    o.LJIJI("moderatorRedDotView");
                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        o.LJIJI("mRootView");
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    o.LJIJI("moderatorEntranceLayout");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                o.LJIJI("mSwitchLayout");
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            o.LJIJI("mEqualLayoutBackground");
                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        o.LJIJI("mFloatingWindowBackground");
                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    o.LJIJI("mFollowerSwitchLayout");
                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                o.LJIJI("mViewerSwitchLayout");
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            o.LJIJI("mRootView");
                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        o.LJIJI("mRootView");
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    o.LJIJI("ivGridGuestMax8");
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                o.LJIJI("ivGridGuestMax5");
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            o.LJIJI("ivGridGuestMax3");
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        o.LJIJI("ivPanelGuestMax6");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    o.LJIJI("ivPanelGuestMax4");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                o.LJIJI("guestMaxCountView");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            o.LJIJI("guestMaxCountView");
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        o.LJIJI("guestMaxCountView");
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    o.LJIJI("guestMaxCountView");
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                o.LJIJI("guestMaxCountView");
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            }
                                                                                                                                                                                            o.LJIJI("guestMaxCountView");
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                        o.LJIJI("guestMaxCountView");
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    o.LJIJI("guestMaxCountView");
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                                o.LJIJI("guestMaxCountView");
                                                                                                                                                                                throw null;
                                                                                                                                                                            }
                                                                                                                                                                            o.LJIJI("guestMaxCountView");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        o.LJIJI("guestMaxCountView");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    o.LJIJI("mRootView");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                o.LJIJI("mRootView");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            o.LJIJI("mRootView");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        o.LJIJI("mRootView");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    o.LJIJI("mRootView");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                o.LJIJI("mRootView");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            o.LJIJI("mRootView");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        o.LJIJI("mRootView");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    o.LJIJI("mRootView");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                o.LJIJI("mRootView");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            o.LJIJI("mRootView");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        o.LJIJI("mRootView");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    o.LJIJI("mRootView");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("mRootView");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("mRootView");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("mRootView");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("mRootView");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("mRootView");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("mRootView");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("mRootView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("mRootView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mRootView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mRootView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mRootView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mRootView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mRootView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mRootView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mRootView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mRootView");
                                                    throw null;
                                                }
                                                o.LJIJI("mRootView");
                                                throw null;
                                            }
                                            o.LJIJI("mRootView");
                                            throw null;
                                        }
                                        o.LJIJI("mRootView");
                                        throw null;
                                    }
                                    o.LJIJI("mRootView");
                                    throw null;
                                }
                                o.LJIJI("mRootView");
                                throw null;
                            }
                            o.LJIJI("mRootView");
                            throw null;
                        }
                        o.LJIJI("mRootView");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public final void Zl(int i, String str, String str2, String str3) {
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LIZJ = str;
        c47071t1.LJII(str2);
        c47071t1.LJIIIZ(R.string.nar, new C75307Th1(i, str3));
        c47071t1.LJIIL(R.string.naq, new C75301Tgv(i, this, str3));
        Il(c47071t1.LIZ());
        C29556Biq.LIZ().getClass();
        C74824TYe.LJJJJJ(i, C74983Tbn.LJIIJ(str3) - 1, "guidance", "show", "");
    }
}

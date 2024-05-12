package com.ss.android.ugc.aweme.ui;

import X.C150165uu;
import X.C16880lQ;
import X.C17N;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C2K0;
import X.C47261Igj;
import X.C52951KqJ;
import X.C53256KvE;
import X.C53277KvZ;
import X.C55096Ljo;
import X.C5H3;
import X.C60222Xy;
import X.C61845OOz;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78605Ut7;
import X.C7FA;
import X.C85210XcM;
import X.C86199XsJ;
import X.C86725Y1x;
import X.C86759Y3f;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC150175uv;
import X.InterfaceC54035LIp;
import X.InterfaceC55102Lju;
import X.InterfaceC60152Xr;
import X.InterfaceC74236TBo;
import X.TBT;
import X.Y01;
import X.Y2N;
import X.Y2O;
import X.Y2P;
import X.Y2Q;
import X.Y2R;
import X.Y2T;
import X.Y32;
import X.Y33;
import X.Y34;
import X.Y3C;
import X.Y3Y;
import Y.ACListenerS35S0100000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IDubbingAbility;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DubbingStatusAssem extends BaseCellSlotComponent implements InterfaceC150175uv, IDubbingAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIL;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public ObjectAnimator LLIIII;
    public TuxTextView LLIIIILZ;
    public TuxTextView LLIIIJ;
    public TuxTextView LLIIIL;
    public ImageView LLIIIZ;
    public FrameLayout LLIIJI;
    public FrameLayout LLIIJLIL;
    public boolean LLIIL;
    public Y3Y LLIILII;
    public boolean LLIILZL;
    public final DubbingStatusAssem$dubbingParamsProvider$1 LLIIZ;

    static {
        TBT tbt = new TBT(DubbingStatusAssem.class, "translationViewModel", "getTranslationViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(DubbingStatusAssem.class, "dubbingStatusViewModel", "getDubbingStatusViewModel()Lcom/ss/android/ugc/aweme/ui/DubbingStatusViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        this.LLIIL = true;
        this.LLIILII = null;
        if (!C53256KvE.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, LLIL[0]), Y3C.LJLIL, null, Y2O.LJLIL, 6);
        }
        C8YN.LJII(this, q4(), new TBT() { // from class: X.Y2p
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((Y2S) obj).LJLJI);
            }
        }, null, C86199XsJ.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.Y2q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((Y2S) obj).LJLJJI);
            }
        }, null, C85210XcM.LJLIL, 6);
        C8YN.LJIIJ(this, q4(), new TBT() { // from class: X.Y2v
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((Y2S) obj).LJLIL;
            }
        }, new TBT() { // from class: X.Y2m
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((Y2S) obj).LJLILLLLZI);
            }
        }, null, C86725Y1x.LJLIL, 12);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ank;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1053154726) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ui.DubbingStatusAssem$dubbingParamsProvider$1] */
    public DubbingStatusAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 666));
        this.LLFZ = Y01.LIZIZ.LIZJ(this);
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DubbingStatusViewModel.class);
        this.LLI = C214348b8.LIZ(this, LIZ, c240999d1, new AqS165S0100000_15(LIZ, 667), null, Y32.INSTANCE, null, null);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), Y33.INSTANCE);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), Y34.INSTANCE);
        this.LLIIL = true;
        this.LLIIZ = new ETParamsProvider<C60222Xy>() { // from class: com.ss.android.ugc.aweme.ui.DubbingStatusAssem$dubbingParamsProvider$1
            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final C60222Xy t() {
                int i;
                Aweme aweme;
                VideoItemParams gv0 = DubbingStatusAssem.this.q4().gv0();
                if (gv0 != null && (aweme = gv0.getAweme()) != null && C78605Ut7.LJIJ(aweme, Y01.LIZIZ.LJJIIZI())) {
                    i = 1;
                } else {
                    i = 0;
                }
                return new C60222Xy(i, C53277KvZ.LIZ.getBoolean("dubbing_default_state_on", true) ? 1 : 0);
            }

            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC54035LIp getParam() {
                if (d2(C60222Xy.class)) {
                    return t();
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
                o.LJIIIZ(clazz, "clazz");
                if (!o.LJ(clazz, C60222Xy.class)) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ability.IDubbingAbility
    public final boolean Pe() {
        if (this.LLIILZL && o.LJ(this.LLIILII, C86759Y3f.LIZIZ)) {
            return true;
        }
        return false;
    }

    public final DubbingStatusViewModel q4() {
        return (DubbingStatusViewModel) this.LLI.LIZ(this, LLIL[1]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LLIIZ));
    }

    @Override // X.InterfaceC150175uv
    public final ObjectAnimator a() {
        return this.LLIIII;
    }

    @Override // X.InterfaceC150175uv
    public final void B1(ObjectAnimator objectAnimator) {
        this.LLIIII = objectAnimator;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
        if (C52951KqJ.LIZ()) {
            TuxTextView tuxTextView = this.LLIIIILZ;
            if (tuxTextView != null) {
                tuxTextView.setPaddingRelative(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d), C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d));
            }
            TuxTextView tuxTextView2 = this.LLIIIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setPaddingRelative(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d), C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d));
            }
            FrameLayout frameLayout = this.LLIIJI;
            if (frameLayout != null) {
                frameLayout.setPaddingRelative(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d), C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d));
            }
            FrameLayout frameLayout2 = this.LLIIJLIL;
            if (frameLayout2 != null) {
                frameLayout2.setPaddingRelative(C17N.LJIILL(4.0d), C17N.LJIILL(4.0d), C17N.LJIILL(4.0d), C17N.LJIILL(4.0d));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLIIJLIL = (FrameLayout) Y3().findViewById(R.id.buz);
        this.LLIIIJ = (TuxTextView) Y3().findViewById(R.id.cdu);
        this.LLIIJI = (FrameLayout) Y3().findViewById(R.id.g8a);
        ImageView imageView = (ImageView) Y3().findViewById(R.id.g8m);
        this.LLIIIZ = imageView;
        if (imageView != null) {
            C150165uu.LIZIZ(this, imageView);
        }
        ImageView imageView2 = this.LLIIIZ;
        if (imageView2 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            imageView2.setLayoutParams(layoutParams);
        }
        this.LLIIIL = (TuxTextView) Y3().findViewById(R.id.ci8);
        TuxTextView tuxTextView = (TuxTextView) Y3().findViewById(R.id.ci9);
        this.LLIIIILZ = tuxTextView;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.db8);
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LLIIIL;
        if (tuxTextView2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.db9);
            } else {
                str2 = null;
            }
            tuxTextView2.setText(str2);
        }
        TuxTextView tuxTextView3 = this.LLIIIILZ;
        if (tuxTextView3 != null) {
            C16880lQ.LJJJJI(tuxTextView3, new ACListenerS35S0100000_15(this, 150));
        }
        TuxTextView tuxTextView4 = this.LLIIIL;
        if (tuxTextView4 != null) {
            C16880lQ.LJJJJI(tuxTextView4, new ACListenerS35S0100000_15(this, 151));
        }
        TuxTextView tuxTextView5 = this.LLIIIILZ;
        if (tuxTextView5 != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 16;
            tuxTextView5.setLayoutParams(layoutParams2);
        }
        TuxTextView tuxTextView6 = this.LLIIIL;
        if (tuxTextView6 != null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.gravity = 16;
            tuxTextView6.setLayoutParams(layoutParams3);
        }
        C7FA.LIZIZ(this.LLIIIILZ);
        C7FA.LIZIZ(this.LLIIIL);
        TuxTextView tuxTextView7 = this.LLIIIJ;
        if (tuxTextView7 != null) {
            tuxTextView7.setTuxFont(62);
        }
        TuxTextView tuxTextView8 = this.LLIIIJ;
        if (tuxTextView8 != null) {
            tuxTextView8.setText("·");
        }
        this.LLIIL = true;
        this.LLIILII = null;
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.XyI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, Y2P.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.XyH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, Y2N.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.8gF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, Y2Q.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.8fp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLJ;
            }
        }, null, Y2R.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.8er
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLILLLL;
            }
        }, null, Y2T.LJLIL, 6);
        if (C53256KvE.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, LLIL[0]), Y3C.LJLIL, null, Y2O.LJLIL, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IDubbingAbility
    public final void d20(String awemeId, Audio.InfoIdType infoType, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(infoType, "infoType");
        q4().d20(awemeId, infoType, z);
    }
}

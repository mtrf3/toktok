package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.AnonymousClass900;
import X.C113554cx;
import X.C116724i4;
import X.C2068389v;
import X.C214348b8;
import X.C221108m2;
import X.C229758zz;
import X.C47261Igj;
import X.C51029K0z;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8MZ;
import X.C8P5;
import X.C8YN;
import X.DJG;
import X.FMX;
import X.M8H;
import X.M8I;
import X.M8J;
import X.OMA;
import X.OSZ;
import X.SY4;
import X.TBT;
import X.X1D;
import Y.ACListenerS25S1200000_3;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InteractPlayListBottomBarAssem extends InteractBottomBannerAssem<InteractPlayListBottomBarAssem> {
    public final String LLII;
    public final C62822Ol8 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public SY4 LLIIIL;
    public View LLIIIZ;
    public TuxIconView LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public final double LLIILZL;
    public final C62822Ol8 LLIIZ;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
        this.LLIIL = false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        this.LLIIL = false;
    }

    public InteractPlayListBottomBarAssem() {
        new LinkedHashMap();
        this.LLII = "bottom_banner_playlist";
        this.LLIIII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 713));
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), M8I.INSTANCE);
        this.LLIIIJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), M8J.INSTANCE);
        this.LLIILZL = DJG.LIZ * 1000;
        this.LLIIZ = C221108m2.LIZIZ(M8H.LJLIL);
    }

    public final AbsMixBottomBarVM I4() {
        return (AbsMixBottomBarVM) this.LLIIII.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String r4() {
        return this.LLII;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    /* renamed from: C4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        this.LLIIL = false;
        this.LLIILII = false;
        this.LLIIJLIL = C8P5.LIZ(item);
        SY4 sy4 = this.LLIIIL;
        if (sy4 != null) {
            sy4.setLoading(false);
        }
        super.F0(item);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void F4(VideoItemParams item) {
        PlayListInfo playListInfo;
        String str;
        o.LJIIIZ(item, "item");
        super.F4(item);
        View containerView = getContainerView();
        Aweme aweme = item.getAweme();
        String str2 = item.mEventType;
        o.LJIIIIZZ(str2, "item.eventType");
        TuxIconView tuxIconView = this.LLIIJI;
        AbsMixBottomBarVM vm = I4();
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 76);
        AqS176S0100000_10 aqS176S0100000_102 = new AqS176S0100000_10(this, 77);
        o.LJIIIZ(vm, "vm");
        Context context = containerView.getContext();
        if (aweme != null && aweme.playlist_info != null) {
            Context context2 = containerView.getContext();
            o.LJIIIIZZ(context2, "containerView.context");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(context2.getString(R.string.jsw));
            LIZ.append(" • ");
            PlayListInfo playListInfo2 = aweme.playlist_info;
            if (playListInfo2 == null || (str = playListInfo2.getMixName()) == null) {
                str = "";
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZIZ(LIZIZ);
            aqS176S0100000_10.invoke(C47261Igj.LJJIJ(new FeedBottomBannerUIProps.Title(c116724i4.LIZ)));
            o.LJIIIIZZ(context, "context");
            C8MZ.LIZ(context, aweme, tuxIconView);
            aqS176S0100000_102.invoke(new ACListenerS25S1200000_3(aweme, vm, str2, 4));
        }
        if (o.LJ(item.mEventType, "homepage_hot") && (playListInfo = item.getAweme().playlist_info) != null && playListInfo.getAlreadyShownPlayNext()) {
            J4(false);
            return;
        }
        SY4 sy4 = this.LLIIIL;
        if (sy4 != null) {
            sy4.setVisibility(8);
        }
        View view = this.LLIIIZ;
        if (view != null) {
            view.setVisibility(8);
        }
        TuxIconView tuxIconView2 = this.LLIIJI;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setVisibility(0);
    }

    public final void J4(boolean z) {
        String str;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        SY4 sy4 = this.LLIIIL;
        if (sy4 != null) {
            sy4.setVisibility(0);
        }
        View view = this.LLIIIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        if (z) {
            SY4 sy42 = this.LLIIIL;
            if (sy42 != null) {
                sy42.setAlpha(0.0f);
            }
            View view2 = this.LLIIIZ;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            TuxIconView tuxIconView = this.LLIIJI;
            if (tuxIconView != null && (animate = tuxIconView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(200L)) != null && (withEndAction = duration.withEndAction(new ARunnableS46S0100000_10(this, 61))) != null) {
                withEndAction.start();
            }
        } else {
            TuxIconView tuxIconView2 = this.LLIIJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
        }
        PlayListInfo playListInfo = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().playlist_info;
        if (playListInfo != null && !playListInfo.getAlreadyShownPlayNext()) {
            PlayListInfo playListInfo2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().playlist_info;
            if (playListInfo2 != null) {
                playListInfo2.setAlreadyShownPlayNext(true);
            }
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("enter_from", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType);
            oszArr[1] = new OSZ("group_id", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
            oszArr[2] = new OSZ("author_id", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAuthorUid());
            PlayListInfo playListInfo3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().playlist_info;
            if (playListInfo3 != null) {
                str = playListInfo3.getMixId();
            } else {
                str = null;
            }
            oszArr[3] = new OSZ("playlist_id", str);
            FMX.LJIIL("show_play_next_toast", C113554cx.LJJL(oszArr));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean P2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C8P5.LIZ(item);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.8Uj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLL;
            }
        }, null, C229758zz.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.8Uy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, AnonymousClass900.LJLIL, 6);
        if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "homepage_hot")) {
            AssemViewModel.asyncSubscribe$default(I4(), new TBT() { // from class: X.8zt
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C229678zr) obj).LJLIL;
                }
            }, null, null, null, new AqS169S0100000_3(this, 571), 14, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig B4(Context context, FeedBottomBannerConfig.Builder bottomBannerBuilder) {
        o.LJIIIZ(bottomBannerBuilder, "bottomBannerBuilder");
        bottomBannerBuilder.setIconWithLocalRes(R.raw.icon_playlist_fill);
        bottomBannerBuilder.setUpdateTitleSync(true);
        bottomBannerBuilder.setTitleEndIcon((C2068389v) this.LLIIZ.getValue(), new AqS176S0100000_10(this, 75));
        bottomBannerBuilder.setInteractionWithCustomViewAsync(R.layout.adw, new OMA(this));
        return bottomBannerBuilder.build();
    }
}

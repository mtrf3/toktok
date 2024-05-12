package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponentV2;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7qG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198247qG extends ConstraintLayout implements KPL {
    public final VideoItemParams LJLIL;
    public final PhotoSharedViewModel LJLILLLLZI;
    public final C200847uS LJLJI;
    public PostModePhotosComponentV2 LJLJJI;
    public Object LJLJJL;
    public C201237v5 LJLJJLL;
    public S1N LJLJL;
    public C7FH LJLJLJ;
    public C184477Lv LJLJLLL;
    public C201177uz LJLL;
    public C7FG LJLLI;
    public C200107tG LJLLILLLL;
    public C7FI LJLLJ;
    public C198257qH LJLLL;
    public final C30539Byh LJLLLL;

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    private final InterfaceC46330IGg getPlayerManager() {
        PostModeDetailFragment postModeDetailFragment;
        Fragment fragment = this.LJLJI.LIZ;
        if ((fragment instanceof PostModeDetailFragment) && (postModeDetailFragment = (PostModeDetailFragment) fragment) != null) {
            return postModeDetailFragment.getPlayerManager();
        }
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        o.LJIIIIZZ(LJJLIIIIJ, "inst()");
        return LJJLIIIIJ;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLJI.LIZIZ.getLifecycle();
        o.LJIIIIZZ(lifecycle, "postModeModel.activityContext.lifecycle");
        return lifecycle;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
        C16880lQ.LJJLIIIJILLIZJL(this.LJLLLL, getContext(), intentFilter);
        if (JYH.LIZIZ.LJIIJ()) {
            try {
                if (!C42625Go9.LIZ(this)) {
                    C42625Go9.LIZIZ(this);
                }
            } catch (Exception e) {
                C36922EeM.LIZIZ(e, "OpenOnMute EventBus");
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16880lQ.LJJLIIIJL(getContext(), this.LJLLLL);
        if (JYH.LIZIZ.LJIIJ()) {
            try {
                if (C42625Go9.LIZ(this)) {
                    C42625Go9.LIZJ(this);
                }
            } catch (Exception e) {
                C36922EeM.LIZIZ(e, "OpenOnMute EventBus");
            }
        }
    }

    public final S1N getAnchorsComponent() {
        return this.LJLJL;
    }

    public final C201237v5 getAnimationComponent() {
        return this.LJLJJLL;
    }

    public final C201177uz getDescriptionComponent() {
        return this.LJLL;
    }

    public final C200107tG getDiggComponent() {
        return this.LJLLILLLL;
    }

    public final C184477Lv getFollowComponent() {
        return this.LJLJLLL;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final PhotoSharedViewModel getPhotoSharedViewModel() {
        return this.LJLILLLLZI;
    }

    public final PostModePhotosComponentV2 getPhotosComponentV2() {
        return this.LJLJJI;
    }

    public final Object getPhotosIndicatorComponent() {
        return this.LJLJJL;
    }

    public final C7FI getPostModeCommentStatusComponent() {
        return this.LJLLJ;
    }

    public final C200847uS getPostModeModel() {
        return this.LJLJI;
    }

    public final C7FG getPostTimeComponent() {
        return this.LJLLI;
    }

    public final C198257qH getStickerComponent() {
        return this.LJLLL;
    }

    public final C7FH getTitleComponent() {
        return this.LJLJLJ;
    }

    public final VideoItemParams getVideoItemParams() {
        return this.LJLIL;
    }

    private final void setPostModePhotosOverlayVector(View view) {
        if (Build.VERSION.SDK_INT < 24 || view == null) {
            return;
        }
        view.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.bw0));
    }

    public final void LJJLJLI(View view) {
        if (C220858ld.LJII(this.LJLJI.LIZJ)) {
            AnonymousClass030.LJ(view, R.string.jk_);
            return;
        }
        PostModeFullPageViewModel postModeFullPageViewModel = this.LJLJI.LJIIIIZZ;
        if (postModeFullPageViewModel != null) {
            C212418Vh.LJIIL(postModeFullPageViewModel, new AqS134S0200000_3(this, view, 297));
        }
    }

    @QD3
    public final void globalSetMuteIconState(C198297qL event) {
        ViewGroup viewGroup;
        View findViewById;
        o.LJIIIZ(event, "event");
        C200847uS c200847uS = this.LJLJI;
        if (c200847uS.LJII.LLIZ && (viewGroup = c200847uS.LJ) != null && (findViewById = viewGroup.findViewById(R.id.hzr)) != null) {
            LJJLJLI(findViewById);
        }
    }

    public final void setAnchorsComponent(S1N s1n) {
        this.LJLJL = s1n;
    }

    public final void setAnimationComponent(C201237v5 c201237v5) {
        this.LJLJJLL = c201237v5;
    }

    public final void setDescriptionComponent(C201177uz c201177uz) {
        this.LJLL = c201177uz;
    }

    public final void setDiggComponent(C200107tG c200107tG) {
        this.LJLLILLLL = c200107tG;
    }

    public final void setFollowComponent(C184477Lv c184477Lv) {
        this.LJLJLLL = c184477Lv;
    }

    public final void setPhotosComponentV2(PostModePhotosComponentV2 postModePhotosComponentV2) {
        this.LJLJJI = postModePhotosComponentV2;
    }

    public final void setPhotosIndicatorComponent(Object obj) {
        this.LJLJJL = obj;
    }

    public final void setPostModeCommentStatusComponent(C7FI c7fi) {
        this.LJLLJ = c7fi;
    }

    public final void setPostTimeComponent(C7FG c7fg) {
        this.LJLLI = c7fg;
    }

    public final void setStickerComponent(C198257qH c198257qH) {
        this.LJLLL = c198257qH;
    }

    public final void setTitleComponent(C7FH c7fh) {
        this.LJLJLJ = c7fh;
    }

    public final void LJJLL(View view, Integer num) {
        this.LJLJI.LJII.LLIZ = false;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            jyh.LIZLLL(jyh.LIZIZ(null), J1M.CLICK_UNMUTE_BUTTON, J1O.STYLE_NO_BUTTON);
        }
        if (!this.LJLJI.LJII.LLIZLLLIL) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
            ((TuxIconView) view).setTuxIcon(c2068389v);
            getPlayerManager().LJIJJ();
            this.LJLJI.LJII.iv0(true);
            C200847uS c200847uS = this.LJLJI;
            C201467vS.LJIILLIIL(c200847uS.LIZJ, c200847uS.LJI, true, num);
            return;
        }
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_speaker_2_fill_ltr;
        c2068389v2.LJ = Integer.valueOf(R.attr.dj);
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
        ((TuxIconView) view).setTuxIcon(c2068389v2);
        getPlayerManager().LJJIL();
        this.LJLJI.LJII.iv0(false);
        C200847uS c200847uS2 = this.LJLJI;
        C201467vS.LJIILLIIL(c200847uS2.LIZJ, c200847uS2.LJI, false, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.7FH] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.7FG] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.7FI] */
    public C198247qG(Context context, VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, final C200847uS c200847uS) {
        super(context);
        int i;
        View findViewById;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        View findViewById2;
        View findViewById3;
        ImageView imageView;
        View findViewById4;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        String str;
        ViewGroup viewGroup;
        LifecycleOwner LJJIIJZLJL;
        o.LJIIIZ(photoSharedViewModel, "photoSharedViewModel");
        new LinkedHashMap();
        this.LJLIL = videoItemParams;
        this.LJLILLLLZI = photoSharedViewModel;
        this.LJLJI = c200847uS;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c22, this, true);
        Z9N z9n = Z9N.LIZIZ;
        if (!z9n.LLJLIL()) {
            setPostModePhotosOverlayVector(findViewById(R.id.hzq));
        }
        c200847uS.LJ = this;
        if (c200847uS.LIZ != null && c200847uS.LIZJ != null && c200847uS.LIZLLL != null && c200847uS.LJFF != null && c200847uS.LJI != null && c200847uS.LJIIJ != null) {
            ViewGroup.LayoutParams layoutParams = null;
            if (videoItemParams != null) {
                this.LJLJJI = new PostModePhotosComponentV2(c200847uS, videoItemParams, photoSharedViewModel);
            } else {
                C36922EeM.LJFF(new Throwable("PostModePhotosComponent PostModeNavigationPageHelper.videoItemParams is null", null));
            }
            this.LJLJJLL = new C201237v5(c200847uS);
            this.LJLJLLL = new C184477Lv(c200847uS);
            this.LJLJLJ = new Object(c200847uS) { // from class: X.7FH
                {
                    PhotoModeImageInfo photoModeImageInfo2;
                    ViewGroup viewGroup2;
                    View view = C16880lQ.LLLZIIL(R.layout.c26, C16880lQ.LLZIL(c200847uS.LIZIZ), null);
                    ViewGroup viewGroup3 = c200847uS.LJ;
                    if (viewGroup3 != null && (viewGroup2 = (ViewGroup) viewGroup3.findViewById(R.id.e3v)) != null) {
                        viewGroup2.addView(view);
                    }
                    o.LJIIIIZZ(view, "view");
                    TextView textView = (TextView) view.findViewById(R.id.hzp);
                    if (textView == null) {
                        return;
                    }
                    Aweme aweme = c200847uS.LIZJ;
                    String str2 = (aweme == null || (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) == null || (str2 = photoModeImageInfo2.getTitle()) == null) ? "" : str2;
                    if (!TextUtils.isEmpty(str2)) {
                        textView.setText(str2);
                        textView.setVisibility(0);
                        C118824lS.LIZJ(textView, null);
                        return;
                    }
                    textView.setVisibility(8);
                }
            };
            this.LJLL = new C201177uz(c200847uS);
            if (z9n.LJJLI()) {
                Aweme aweme = c200847uS.LIZJ;
                PostModeDetailParams postModeDetailParams = c200847uS.LJI;
                if (postModeDetailParams != null) {
                    str = postModeDetailParams.eventType;
                } else {
                    str = null;
                }
                if (z9n.LLIIJLIL(aweme, str)) {
                    ViewGroup viewGroup2 = c200847uS.LJ;
                    if (viewGroup2 != null) {
                        viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.e3v);
                    } else {
                        viewGroup = null;
                    }
                    C184357Lj.LIZ(viewGroup, c200847uS.LIZIZ, new FullPageParam(c200847uS.LIZJ, c200847uS.LJI, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0));
                }
            }
            this.LJLJL = new S1N(c200847uS);
            this.LJLLI = new Object(c200847uS) { // from class: X.7FG
                {
                    long j;
                    ViewGroup viewGroup3;
                    View view = C16880lQ.LLLZIIL(R.layout.c24, C16880lQ.LLZIL(c200847uS.LIZIZ), null);
                    ViewGroup viewGroup4 = c200847uS.LJ;
                    if (viewGroup4 != null && (viewGroup3 = (ViewGroup) viewGroup4.findViewById(R.id.e3v)) != null) {
                        viewGroup3.addView(view);
                    }
                    o.LJIIIIZZ(view, "view");
                    TextView textView = (TextView) view.findViewById(R.id.hzo);
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(0);
                    Aweme aweme2 = c200847uS.LIZJ;
                    Long valueOf = aweme2 != null ? Long.valueOf(aweme2.getCreateTime()) : null;
                    ActivityC45651qj activityC45651qj = c200847uS.LIZIZ;
                    if (valueOf != null) {
                        j = valueOf.longValue() * 1000;
                    } else {
                        j = 0;
                    }
                    textView.setText(C57105Mb7.LIZJ(j, activityC45651qj));
                    textView.setGravity(8388611);
                }
            };
            this.LJLLILLLL = new C200107tG(c200847uS);
            this.LJLLJ = new Object(c200847uS) { // from class: X.7FI
                {
                    ViewGroup viewGroup3;
                    View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c1j, C16880lQ.LLZIL(c200847uS.LIZIZ), null);
                    TextView textView = (TextView) LLLZIIL.findViewById(R.id.bk2);
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    textView.setGravity(8388611);
                    textView.setPaddingRelative(LJJIIZ, 0, 0, 0);
                    ViewGroup viewGroup4 = c200847uS.LJ;
                    if (viewGroup4 != null && (viewGroup3 = (ViewGroup) viewGroup4.findViewById(R.id.e3v)) != null) {
                        viewGroup3.addView(LLLZIIL);
                    }
                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7FJ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    }, LLLZIIL);
                    if (C184387Lm.LJI(c200847uS.LIZJ)) {
                        Context context2 = LLLZIIL.getContext();
                        Aweme aweme2 = c200847uS.LIZJ;
                        ViewGroup viewGroup5 = (ViewGroup) LLLZIIL.findViewById(R.id.hzn);
                        if (viewGroup5 == null || aweme2 == null) {
                            return;
                        }
                        o.LJIIIIZZ(context2, "context");
                        TuxTextView LJFF = C184387Lm.LJFF(context2);
                        LJFF.setId(R.id.hz_);
                        LJFF.setText(C184387Lm.LIZLLL(context2, aweme2));
                        C184387Lm.LJII(LJFF, viewGroup5);
                    }
                }
            };
            this.LJLLL = new C198257qH(c200847uS);
            Aweme aweme2 = c200847uS.LIZJ;
            if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                i = imageList.size();
            } else {
                i = 0;
            }
            if (i > 1) {
                ViewGroup viewGroup3 = c200847uS.LJ;
                if (viewGroup3 != null && (findViewById4 = viewGroup3.findViewById(R.id.hzj)) != null) {
                    findViewById4.setVisibility(0);
                }
                this.LJLJJL = new C7FE(c200847uS);
            } else {
                ViewGroup viewGroup4 = c200847uS.LJ;
                if (viewGroup4 != null && (findViewById = viewGroup4.findViewById(R.id.hzj)) != null) {
                    findViewById.setVisibility(8);
                }
            }
            Aweme aweme3 = c200847uS.LIZJ;
            if (aweme3 != null && C62819Ol5.LJIJJLI(aweme3)) {
                ViewGroup viewGroup5 = c200847uS.LJ;
                if (viewGroup5 != null && (imageView = (ImageView) viewGroup5.findViewById(R.id.hzr)) != null) {
                    imageView.setVisibility(8);
                }
            } else {
                ViewGroup viewGroup6 = c200847uS.LJ;
                if (viewGroup6 != null && (findViewById3 = viewGroup6.findViewById(R.id.hzr)) != null) {
                    layoutParams = findViewById3.getLayoutParams();
                }
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = C7MY.LIZIZ(12);
                ViewGroup viewGroup7 = c200847uS.LJ;
                if (viewGroup7 != null && (findViewById2 = viewGroup7.findViewById(R.id.hzr)) != null) {
                    findViewById2.setLayoutParams(marginLayoutParams);
                }
                ViewGroup viewGroup8 = c200847uS.LJ;
                if (viewGroup8 != null && (tuxIconView2 = (TuxIconView) viewGroup8.findViewById(R.id.hzr)) != null) {
                    C16880lQ.LJJJ(tuxIconView2, new ACListenerS23S0100000_3(this, 326));
                }
                if (c200847uS.LJII.LLIZLLLIL || C220858ld.LJII(c200847uS.LIZJ)) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    ViewGroup viewGroup9 = c200847uS.LJ;
                    if (viewGroup9 != null && (tuxIconView = (TuxIconView) viewGroup9.findViewById(R.id.hzr)) != null) {
                        tuxIconView.setTuxIcon(c2068389v);
                    }
                }
            }
        }
        c200847uS.LJII.LLIIIZ.setValue(Boolean.TRUE);
        if (EarphonePlayerControl.LJII().LIZIZ() && (LJJIIJZLJL = C78565UsT.LJJIIJZLJL(this)) != null) {
            EarphonePlayerControl.LJII().LJI(LJJIIJZLJL, new InterfaceC87433YTd() { // from class: X.7qI
                @Override // X.InterfaceC87433YTd
                public final String LIZIZ() {
                    return "post_mode_detail";
                }

                @Override // X.InterfaceC87433YTd
                public final void LIZ() {
                    PostModeFullPageViewModel postModeFullPageViewModel = C198247qG.this.getPostModeModel().LJIIIIZZ;
                    if (postModeFullPageViewModel != null) {
                        postModeFullPageViewModel.withState(new AqS169S0100000_3(postModeFullPageViewModel, 1005));
                    }
                }
            });
        }
        this.LJLLLL = new C30539Byh(new AqS153S0100000_3(this, 1771));
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

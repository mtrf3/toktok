package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputViewDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.GiphyGifApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4BW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4BW extends PagerAdapter {
    public final InterfaceC105124Aq LJLILLLLZI;
    public final VWD LJLJI;
    public final C4BU LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final int LJLJJLL;
    public final InterfaceC70422pa LJLJL;
    public final InputViewDelegate LJLJLJ;
    public final List<View> LJLJLLL;
    public View LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJI.LJLJLJ.LIZJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        Long l;
        C3UO c3uo;
        C72422so c72422so;
        StickerSetInfo stickerSetInfo;
        o.LJIIIZ(container, "container");
        C4BX c4bx = this.LJLJJI.LJLJLJ;
        InterfaceC105334Bl interfaceC105334Bl = (InterfaceC105334Bl) ORZ.LJLLLLLL(i, c4bx.LJI);
        Integer num = null;
        if ((interfaceC105334Bl instanceof C72422so) && (c72422so = (C72422so) interfaceC105334Bl) != null && (stickerSetInfo = c72422so.LIZIZ) != null) {
            l = stickerSetInfo.getSetId();
        } else {
            l = null;
        }
        C84683Ua c84683Ua = C84683Ua.LJFF;
        if (interfaceC105334Bl != null) {
            num = Integer.valueOf(interfaceC105334Bl.LJ());
        }
        c84683Ua.LIZIZ(new C3UP(num, l), true);
        boolean z = false;
        if (interfaceC105334Bl != null) {
            if (interfaceC105334Bl.LJ() == 6) {
                return LJJIII(container, new C4DW(c4bx.LJFF, this.LJLJJL));
            }
            if (interfaceC105334Bl.LJ() == 8) {
                final LifecycleOwner lifecycleOwner = this.LJLJJL;
                final InputViewDelegate inputViewDelegate = this.LJLJLJ;
                return LJJIII(container, new QXX(lifecycleOwner, inputViewDelegate) { // from class: X.4Fm
                    public final LifecycleOwner LJLIL;
                    public final InputViewDelegate LJLILLLLZI;

                    /* JADX WARN: Type inference failed for: r0v11, types: [X.4BA] */
                    @Override // X.QXX
                    public final View LLIIZ(ViewGroup viewGroup) {
                        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "container", R.layout.b7_, viewGroup, false);
                        o.LJIIIIZZ(LIZIZ, "this");
                        LifecycleOwner lifecycleOwner2 = this.LJLIL;
                        final InputViewDelegate inputViewDelegate2 = this.LJLILLLLZI;
                        o.LJIIIZ(lifecycleOwner2, "lifecycleOwner");
                        o.LJIIIZ(inputViewDelegate2, "inputViewDelegate");
                        C106414Fp c106414Fp = new C106414Fp((GiphyGifApi) RetrofitFactory.LIZLLL().LIZ(C30Y.LIZ).LJFF().LIZ.LIZ(GiphyGifApi.class));
                        GiphyAnalytics LIZ = C106404Fo.LIZ();
                        C106394Fn c106394Fn = new C106394Fn();
                        AbstractC73946T0k LIZ2 = T16.LIZ();
                        o.LJIIIIZZ(LIZ2, "io()");
                        new C4GT(LIZIZ, new GiphyViewModel(c106414Fp, LIZ, c106394Fn, LIZ2), lifecycleOwner2, new C3UR() { // from class: X.4BA
                            @Override // X.C3UR
                            public final void LIZIZ() {
                            }

                            @Override // X.C3UR
                            public final void LIZJ(C32V c32v, boolean z2) {
                            }

                            @Override // X.C3UR
                            public final void LIZLLL(String emojiText) {
                                o.LJIIIZ(emojiText, "emojiText");
                            }

                            @Override // X.C3UR
                            public final void LJ(Context context) {
                            }

                            @Override // X.C3UR
                            public final void j2(CommentPersonalizedEmoji emoji) {
                                o.LJIIIZ(emoji, "emoji");
                            }

                            @Override // X.C3UR
                            public final void LIZ(View view, C105454Bx emoji) {
                                o.LJIIIZ(view, "view");
                                o.LJIIIZ(emoji, "emoji");
                                InputViewDelegate.this.LLLZLZ(emoji);
                            }
                        });
                        return LIZIZ;
                    }

                    {
                        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
                        o.LJIIIZ(inputViewDelegate, "inputView");
                        this.LJLIL = lifecycleOwner;
                        this.LJLILLLLZI = inputViewDelegate;
                    }
                });
            }
            if ((interfaceC105334Bl.LIZLLL() && !c4bx.LIZIZ(i).LJIIJJI().isEmpty()) || interfaceC105334Bl.LJ() == 7 || interfaceC105334Bl.LJ() == 9) {
                C3UR c3ur = new C3UR() { // from class: X.4B7
                    @Override // X.C3UR
                    public final void LIZIZ() {
                        C4BW.this.LJLILLLLZI.LLLLLZIL();
                    }

                    @Override // X.C3UR
                    public final void LIZLLL(String emojiText) {
                        o.LJIIIZ(emojiText, "emojiText");
                        C4BW.this.LJLILLLLZI.i30(emojiText);
                    }

                    @Override // X.C3UR
                    public final void LJ(Context context) {
                        if (context != null) {
                            SmartRouter.buildRoute(context, "//video/sticker").open();
                        }
                    }

                    @Override // X.C3UR
                    public final void j2(CommentPersonalizedEmoji emoji) {
                        o.LJIIIZ(emoji, "emoji");
                    }

                    @Override // X.C3UR
                    public final void LIZ(View view, C105454Bx emoji) {
                        o.LJIIIZ(view, "view");
                        o.LJIIIZ(emoji, "emoji");
                        C4BW.this.LJLJLJ.LLLZLZ(emoji);
                    }

                    @Override // X.C3UR
                    public final void LIZJ(C32V c32v, boolean z2) {
                        C4B8 c4b8;
                        if (z2) {
                            c4b8 = C4B8.FAV_STICKER_TAB;
                        } else {
                            c4b8 = C4B8.DM_STICKER_PANEL;
                        }
                        C4BW.this.LJLILLLLZI.T0(c32v, c4b8);
                    }
                };
                View view = this.LJLL;
                if (interfaceC105334Bl.LJ() != 5 || view == null) {
                    if (interfaceC105334Bl.LJ() != 5 && (!((ArrayList) this.LJLJLLL).isEmpty())) {
                        view = (View) ListProtector.remove(this.LJLJLLL, 0);
                        Object tag = view.getTag(R.id.fdt);
                        if ((tag instanceof C3UO) && (c3uo = (C3UO) tag) != null) {
                            c3uo.LIZ(interfaceC105334Bl);
                        }
                    } else {
                        Context context = container.getContext();
                        o.LJIIIIZZ(context, "container.context");
                        ComponentCallbacks2 LJIJJ = C45804HyK.LJIJJ(context);
                        o.LJII(LJIJJ, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) LJIJJ;
                        VWD vwd = this.LJLJI;
                        InterfaceC105124Aq interfaceC105124Aq = this.LJLILLLLZI;
                        if (interfaceC105124Aq instanceof InputView) {
                            z = ((InputView) interfaceC105124Aq).LJLZ.isBookMode();
                        }
                        C3UO c3uo2 = new C3UO(lifecycleOwner2, container, vwd, interfaceC105334Bl, new C105534Cf(0, 0, 15, null, false, z), this.LJLJJLL, c3ur, this.LJLJL);
                        c3uo2.LJIJ = true;
                        view = c3uo2.LJI(true);
                        c3uo2.LJIIIIZZ(interfaceC105334Bl.LJIIJJI());
                        view.setTag(R.id.fdt, c3uo2);
                    }
                }
                if (container.indexOfChild(view) >= 0) {
                    return view;
                }
                container.addView(view);
                return view;
            }
        }
        return LJJIII(container, new C105324Bk());
    }

    public final <T extends QXX> View LJJIII(ViewGroup viewGroup, T t) {
        View LLIIZ = t.LLIIZ(viewGroup);
        o.LJIIIIZZ(LLIIZ, "extEmojiView.getExtEmojiView(container)");
        if (viewGroup.indexOfChild(LLIIZ) < 0) {
            viewGroup.addView(LLIIZ);
        }
        return LLIIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object any) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(any, "any");
        View view = (View) any;
        C16880lQ.LJLLL(view, container);
        Object tag = view.getTag(R.id.fdt);
        if (tag instanceof C3UO) {
            C3UO c3uo = (C3UO) tag;
            c3uo.LJIJ = true;
            if (c3uo.LIZLLL.LJ() == 5) {
                this.LJLL = view;
            } else {
                ((ArrayList) this.LJLJLLL).add(any);
            }
        }
    }

    public C4BW(InterfaceC105124Aq mInputView, VWD vwd, C4BU mEmojiTypeView, LifecycleOwner lifecycleOwner, int i, C64962gm c64962gm) {
        o.LJIIIZ(mInputView, "mInputView");
        o.LJIIIZ(mEmojiTypeView, "mEmojiTypeView");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLILLLLZI = mInputView;
        this.LJLJI = vwd;
        this.LJLJJI = mEmojiTypeView;
        this.LJLJJL = lifecycleOwner;
        this.LJLJJLL = i;
        this.LJLJL = c64962gm;
        vwd.getContext();
        this.LJLJLJ = new InputViewDelegate(mInputView);
        this.LJLJLLL = new ArrayList();
    }
}

package X;

import Y.ACListenerS46S0200000_12;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS31S0200000_12;
import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.anchor.videoanchor.PoiAnchorElementWidthData;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.S1d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71417S1d extends C8IM implements S1U, InterfaceC192527h2 {
    public final /* synthetic */ C191557fT LJLJJL;
    public InterfaceC44105HSr LJLJJLL;
    public ViewGroup LJLJL;
    public SmartImageView LJLJLJ;
    public TuxTextView LJLJLLL;
    public View LJLL;
    public TuxTextView LJLLI;
    public ViewGroup LJLLILLLL;
    public ViewGroup LJLLJ;
    public TuxTextView LJLLL;
    public TuxTextView LJLLLL;
    public TuxTextView LJLLLLLL;
    public TuxIconView LJLZ;
    public ViewGroup LJZ;
    public PoiDataStruct LJZI;
    public PoiAnchorData LJZL;
    public PoiAnchorElementWidthData LL;
    public int LLD;
    public boolean LLF;
    public AnimatorSet LLFF;
    public final C64962gm LLFFF;
    public XKQ LLFII;
    public XKQ LLFZ;
    public final C211858Td LLI;
    public String LLIFFJFJJ;
    public long LLII;
    public long LLIIII;

    @Override // X.C8IG
    public final void LIZIZ() {
    }

    @Override // X.S1U
    public final String LIZJ() {
        return this.LJLJJL.LIZJ();
    }

    @Override // X.C8IG
    public final void LJ(C188727au c188727au, InterfaceC88472Yns<? super Boolean, C76800UCe> useCustomAction) {
        o.LJIIIZ(useCustomAction, "useCustomAction");
    }

    @Override // X.C8IM
    public final void LJI(float f) {
    }

    @Override // X.C8IM
    public final void LJIIIZ() {
    }

    @Override // X.S1U
    public final void LJIJI(Aweme aweme, String enterMethod, String enterFrom, boolean z, boolean z2, String trackInfo, C188727au c188727au) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLJJL.LJIJI(aweme, enterMethod, enterFrom, z, z2, trackInfo, c188727au);
    }

    @Override // X.S1U
    public final void LJJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLJJL.LJJI(aweme);
    }

    @Override // X.S1U
    public final void LJJIJ(Aweme aweme, String enterMethod, String enterFrom, boolean z, String trackInfo, C188727au c188727au) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLJJL.LJJIJ(aweme, enterMethod, enterFrom, z, trackInfo, c188727au);
    }

    @Override // X.S1U
    public final void LJJJJZI(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LJLJJL.LJJJJZI(i, i2, i3, i4, i5, i6);
    }

    @Override // X.S1U
    public final void LJJL(Context context, Aweme aweme, String enterMethod, String enterFrom, C188727au c188727au, boolean z, String trackInfo) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLJJL.LJJL(context, aweme, enterMethod, enterFrom, c188727au, z, trackInfo);
    }

    @Override // X.S1U
    public final boolean enable() {
        this.LJLJJL.getClass();
        return true;
    }

    public final void LJIIJ() {
        this.LL = PoiAnchorElementWidthData.copy$default(this.LL, LJIILIIL(this.LJLJLLL, true), LJIILIIL(this.LJLLI, true), LJIILIIL(this.LJLLL, true), LJIILIIL(this.LJLLLLLL, true), 0, LJIIL(this.LJLL), 0, 0, 0, LJIIL(this.LJLLLL), 0, 0, 3536, null);
    }

    public final boolean LJIILJJIL() {
        List<PoiSubTag> list;
        Aweme LJJLL;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo commentAnchor;
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            InterfaceC44105HSr interfaceC44105HSr = this.LJLJJLL;
            if (interfaceC44105HSr != null && (LJJLL = interfaceC44105HSr.LJJLL()) != null && (poiDataStruct = LJJLL.getPoiDataStruct()) != null && (commentAnchor = poiDataStruct.getCommentAnchor()) != null) {
                list = commentAnchor.getSubTags();
            } else {
                list = null;
            }
            if (LC5.LIZ(list)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIILLIIL() {
        TuxTextView tuxTextView;
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            return;
        }
        TuxTextView tuxTextView2 = this.LJLLL;
        if ((tuxTextView2 != null && tuxTextView2.getVisibility() == 0) || ((tuxTextView = this.LJLLLLLL) != null && tuxTextView.getVisibility() == 0)) {
            AnimatorSet animatorSet = this.LLFF;
            if (animatorSet != null && animatorSet.isRunning()) {
                return;
            }
            AnimatorSet animatorSet2 = this.LLFF;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(C7MY.LIZIZ(17), C7MY.LIZIZ(31));
            ofInt.setDuration(300L);
            ofInt.setInterpolator(new SJI());
            ofInt.addListener(new ALAdapterS9S0100000_12(this, 15));
            ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 54));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLJ, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new LinearInterpolator());
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(ofInt);
            animatorSet3.play(ofFloat).after(100L);
            animatorSet3.addListener(new ALAdapterS9S0100000_12(this, 14));
            animatorSet3.start();
            this.LLFF = animatorSet3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42625Go9.LIZIZ(this);
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF(this.LLI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42625Go9.LIZJ(this);
        AnimatorSet animatorSet = this.LLFF;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C48841JEv.LIZJ(this.LLFFF, null);
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LLI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ(this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71417S1d(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJJL = new C191557fT();
        this.LL = new PoiAnchorElementWidthData(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
        this.LLFFF = C48841JEv.LIZIZ();
        this.LLI = new C211858Td(this);
        this.LLIIII = -1L;
        C16880lQ.LLLZIIL(R.layout.c0r, C16880lQ.LLZIL(context), this);
        C7GV.LIZ(4, findViewById(R.id.a49));
        this.LJLJLJ = (SmartImageView) findViewById(R.id.hu8);
        this.LJLJLLL = (TuxTextView) findViewById(R.id.hv_);
        this.LJLJL = (ViewGroup) findViewById(R.id.a49);
        this.LJZ = (ViewGroup) findViewById(R.id.btt);
        this.LJLLILLLL = (ViewGroup) findViewById(R.id.hv7);
        this.LJLL = findViewById(R.id.hv8);
        this.LJLLI = (TuxTextView) findViewById(R.id.hv9);
        this.LJLLJ = (ViewGroup) findViewById(R.id.hv4);
        this.LJLLL = (TuxTextView) findViewById(R.id.hv2);
        this.LJLLLL = (TuxTextView) findViewById(R.id.hup);
        this.LJLLLLLL = (TuxTextView) findViewById(R.id.hv3);
        this.LJLZ = (TuxIconView) findViewById(R.id.hu9);
        if (C52217KeT.LIZ()) {
            if (C012403c.LIZ(context) == 1) {
                setPadding(C17N.LJIILL(4.0d), 0, 0, C17N.LJIILL(4.0d));
                return;
            } else {
                setPadding(0, 0, C17N.LJIILL(4.0d), C17N.LJIILL(4.0d));
                return;
            }
        }
        setPadding(0, 0, 0, 0);
    }

    public static int LJIIL(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2 = 0;
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams2.leftMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams.rightMargin;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(536870912, LiveLayoutPreloadThreadPriority.DEFAULT);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        return view.getMeasuredWidth() + i + i2;
    }

    @Override // X.C8IM
    public final boolean LJII(C188727au c188727au) {
        InterfaceC44105HSr interfaceC44105HSr = this.LJLJJLL;
        if (interfaceC44105HSr == null) {
            return true;
        }
        this.LLII = System.currentTimeMillis();
        XKX.LIZLLL(this.LLFFF, null, null, new S1Z(this, interfaceC44105HSr, c188727au, null), 3);
        XKQ xkq = this.LLFZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LLFZ = XKX.LIZLLL(this.LLFFF, null, null, new C71414S1a(this, interfaceC44105HSr, null), 3);
        return true;
    }

    public final Object LJIIJJI(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        post(new ARunnableS31S0200000_12(xks, this, 29));
        Object LJIIJJI = xks.LJIIJJI();
        if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    @QD3
    public final void onVideoEvent(C50420Jqa c50420Jqa) {
        boolean z;
        Aweme aweme;
        if (c50420Jqa != null) {
            if (c50420Jqa.LJLIL == 13) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Bundle bundle = c50420Jqa.LJLJI;
                if (bundle != null && bundle.getInt("user_digged") == 1) {
                    this.LLIFFJFJJ = "like_video";
                    if (this.LLIIII == -1) {
                        this.LLIIII = System.currentTimeMillis() - this.LLII;
                    }
                    LJIILLIIL();
                    return;
                }
            } else if (c50420Jqa == null) {
                return;
            }
            if (c50420Jqa.LJLIL != 54) {
                return;
            }
            Object obj = c50420Jqa.LJLILLLLZI;
            if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || aweme.getCollectStatus() != 1) {
                return;
            }
            this.LLIFFJFJJ = "fav_video";
            if (this.LLIIII == -1) {
                this.LLIIII = System.currentTimeMillis() - this.LLII;
            }
            LJIILLIIL();
        }
    }

    public static int LJIILIIL(View view, boolean z) {
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        if (!z) {
            return view.getWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(536870912, LiveLayoutPreloadThreadPriority.DEFAULT);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        return view.getMeasuredWidth();
    }

    public static void LJIILL(TuxTextView tuxTextView, String str) {
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(8);
        } else {
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass885
    public final void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, bool.booleanValue(), enumC2063587z);
    }

    @Override // X.InterfaceC192527h2
    public final void u8(String id, boolean z, EnumC2063587z source) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (z && source == EnumC2063587z.MUTATION) {
            this.LLIFFJFJJ = "fav_video";
            if (this.LLIIII == -1) {
                this.LLIIII = System.currentTimeMillis() - this.LLII;
            }
            LJIILLIIL();
        }
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        int i2;
        UrlModel urlModel;
        String str;
        String str2;
        PoiAnchorInfo videoAnchor;
        PoiAnchorInfo videoAnchor2;
        List<PoiSubTag> subTags;
        Object next;
        String str3;
        String str4;
        CharSequence text;
        CharSequence text2;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        PoiAnchorInfo videoAnchor3;
        o.LJIIIZ(commonClickAction, "commonClickAction");
        PoiDataStruct poiDataStruct = interfaceC44105HSr.LJJLL().getPoiDataStruct();
        if (poiDataStruct == null) {
            setVisibility(8);
            ViewGroup viewGroup = this.LJLJL;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        this.LJZI = poiDataStruct;
        Aweme LJJLL = interfaceC44105HSr.LJJLL();
        PoiAnchorData.Companion.getClass();
        this.LJZL = C190827eI.LIZLLL(LJJLL);
        this.LJLJJLL = interfaceC44105HSr;
        Video video = LJJLL.getVideo();
        if (video != null) {
            i2 = video.getDuration();
        } else {
            i2 = 0;
        }
        this.LLD = i2;
        LJJI(LJJLL);
        PoiAnchorData poiAnchorData = this.LJZL;
        if (poiAnchorData != null) {
            urlModel = poiAnchorData.getIcon();
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJ = this.LJLJLJ;
        C16880lQ.LLJJJ(LJII);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(interfaceC44105HSr, this, 53)));
        TuxTextView tuxTextView3 = this.LJLJLLL;
        if (tuxTextView3 != null) {
            PoiDataStruct poiDataStruct2 = this.LJZI;
            if (poiDataStruct2 == null || (str = poiDataStruct2.getPoiName()) == null) {
                str = "";
            }
            tuxTextView3.setText(str);
        }
        PoiDataStruct poiDataStruct3 = this.LJZI;
        if (poiDataStruct3 == null || (videoAnchor3 = poiDataStruct3.getVideoAnchor()) == null || (str2 = videoAnchor3.getSuffix()) == null) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            View view = this.LJLL;
            if (view != null) {
                view.setVisibility(8);
            }
            TuxTextView tuxTextView4 = this.LJLLI;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(8);
            }
        } else {
            TuxTextView tuxTextView5 = this.LJLLI;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(str2);
            }
            View view2 = this.LJLL;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            TuxTextView tuxTextView6 = this.LJLLI;
            if (tuxTextView6 != null) {
                tuxTextView6.setVisibility(0);
            }
        }
        ViewGroup viewGroup2 = this.LJLLJ;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        PoiDataStruct poiDataStruct4 = this.LJZI;
        if (poiDataStruct4 != null && (videoAnchor2 = poiDataStruct4.getVideoAnchor()) != null && (subTags = videoAnchor2.getSubTags()) != null && (!subTags.isEmpty())) {
            int min = Math.min(1, subTags.size() - 1);
            if (min >= 0) {
                int i3 = 0;
                loop0: while (true) {
                    TuxTextView tuxTextView7 = this.LJLLL;
                    String name = ((PoiSubTag) ListProtector.get(subTags, i3)).getName();
                    if (name == null) {
                        name = "";
                    }
                    LJIILL(tuxTextView7, name);
                    while (i3 != min) {
                        i3++;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                TuxTextView tuxTextView8 = this.LJLLLLLL;
                                String name2 = ((PoiSubTag) ListProtector.get(subTags, i3)).getName();
                                if (name2 == null) {
                                    name2 = "";
                                }
                                LJIILL(tuxTextView8, name2);
                            }
                        }
                    }
                }
            }
            TuxTextView tuxTextView9 = this.LJLLLLLL;
            if (tuxTextView9 != null && tuxTextView9.getVisibility() == 0 && (tuxTextView = this.LJLLLLLL) != null && tuxTextView.getVisibility() == 0 && (tuxTextView2 = this.LJLLLL) != null) {
                tuxTextView2.setVisibility(0);
            }
            Iterator it = new ArrayList(subTags).iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int priority = ((PoiSubTag) next).getPriority();
                    do {
                        Object next2 = it.next();
                        int priority2 = ((PoiSubTag) next2).getPriority();
                        if (priority < priority2) {
                            next = next2;
                            priority = priority2;
                        }
                    } while (it.hasNext());
                }
            }
            PoiSubTag poiSubTag = (PoiSubTag) next;
            if (poiSubTag != null) {
                String name3 = poiSubTag.getName();
                TuxTextView tuxTextView10 = this.LJLLL;
                if (tuxTextView10 != null && (text2 = tuxTextView10.getText()) != null) {
                    str3 = text2.toString();
                } else {
                    str3 = null;
                }
                if (o.LJ(name3, str3)) {
                    this.LLF = true;
                } else {
                    String name4 = poiSubTag.getName();
                    TuxTextView tuxTextView11 = this.LJLLLLLL;
                    if (tuxTextView11 != null && (text = tuxTextView11.getText()) != null) {
                        str4 = text.toString();
                    } else {
                        str4 = null;
                    }
                    if (o.LJ(name4, str4)) {
                        this.LLF = false;
                    }
                }
            }
        }
        PoiDataStruct poiDataStruct5 = this.LJZI;
        if (poiDataStruct5 != null && (videoAnchor = poiDataStruct5.getVideoAnchor()) != null && videoAnchor.getHasSubArrow()) {
            TuxIconView tuxIconView = this.LJLZ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
        } else {
            TuxIconView tuxIconView2 = this.LJLZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
        }
        XKQ xkq = this.LLFII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LLFII = XKX.LIZLLL(this.LLFFF, C36636EZk.LIZ, null, new C71416S1c(this, null), 2);
    }
}

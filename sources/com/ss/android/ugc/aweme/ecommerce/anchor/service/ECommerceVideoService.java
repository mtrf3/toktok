package com.ss.android.ugc.aweme.ecommerce.anchor.service;

import X.AnonymousClass636;
import X.C00F;
import X.C238639Yd;
import X.C26045AKb;
import X.C27739Aud;
import X.C28043AzX;
import X.C39468FeK;
import X.C42586GnW;
import X.C42893GsT;
import X.C54373LVp;
import X.C55790Lv0;
import X.C58096Mr6;
import X.C65805Ps9;
import X.C71353RzR;
import X.C71361RzZ;
import X.C71370Rzi;
import X.C73411SrX;
import X.C76800UCe;
import X.C78565UsT;
import X.FFL;
import X.InterfaceC55791Lv1;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88476Ynw;
import X.MBB;
import X.Q7K;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.video.settings.ECVideoListOperatorWhiteList;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS31S1300000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ECommerceVideoService implements IECommerceVideoService {
    public C238639Yd LIZ;
    public View LIZIZ;
    public ViewGroup LIZJ;
    public String LIZLLL;
    public C73411SrX LJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final List<String> LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig = ECVideoListOperatorWhiteList.LIZ;
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig2 = (ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig) LIZLLL.LJIIIIZZ("ec_video_list_operator_white_list", ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig.class, eCVideoListOperatorWhiteListConfig);
        if (eCVideoListOperatorWhiteListConfig2 != null) {
            eCVideoListOperatorWhiteListConfig = eCVideoListOperatorWhiteListConfig2;
        }
        return eCVideoListOperatorWhiteListConfig.getFromWhiteList();
    }

    public static IECommerceVideoService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(IECommerceVideoService.class, false);
        if (LIZ != null) {
            return (IECommerceVideoService) LIZ;
        }
        return new ECommerceVideoService();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LJFF() {
        if (C00F.LIZ(31744, 0, "ec_comment_multi_anchor_style", true) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LJII() {
        if (Q7K.LIZIZ("creator_bc_toggle_video", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final boolean LJIIIIZZ() {
        if (Q7K.LIZIZ("creator_bo_toggle_video", 0) != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(75:5|(1:204)|9|(1:203)|13|(1:202)|17|(1:19)(1:201)|20|(1:22)(1:200)|23|(3:25|(2:28|26)|29)|30|(1:32)|33|(1:35)|36|(1:38)|39|(1:41)(1:199)|42|(1:198)|46|(1:197)|50|(1:196)|54|(1:56)(1:195)|57|(1:59)(1:194)|60|(2:62|(1:64))|65|(1:67)|68|(1:193)|70|(2:71|72)|(34:76|77|(1:79)|80|(1:189)|84|(1:188)|86|(1:187)(3:90|(1:92)|93)|94|(1:96)(1:186)|97|(4:100|(3:105|106|107)|108|98)|111|112|113|114|(2:116|(16:118|119|(1:121)(1:181)|122|(9:126|127|128|(1:130)|131|132|(2:137|(1:139))|140|(1:142))|145|(4:147|(2:150|148)|151|152)|153|(1:155)(3:167|(2:169|3cc)|180)|156|157|158|159|(1:161)(1:164)|162|163))|183|119|(0)(0)|122|(10:124|126|127|128|(0)|131|132|(3:135|137|(0))|140|(0))|145|(0)|153|(0)(0)|156|157|158|159|(0)(0)|162|163)|191|77|(0)|80|(1:82)|189|84|(0)|86|(1:88)|187|94|(0)(0)|97|(1:98)|111|112|113|114|(0)|183|119|(0)(0)|122|(0)|145|(0)|153|(0)(0)|156|157|158|159|(0)(0)|162|163) */
    /* JADX WARN: Can't wrap try/catch for region: R(76:5|(1:204)|9|(1:203)|13|(1:202)|17|(1:19)(1:201)|20|(1:22)(1:200)|23|(3:25|(2:28|26)|29)|30|(1:32)|33|(1:35)|36|(1:38)|39|(1:41)(1:199)|42|(1:198)|46|(1:197)|50|(1:196)|54|(1:56)(1:195)|57|(1:59)(1:194)|60|(2:62|(1:64))|65|(1:67)|68|(1:193)|70|71|72|(34:76|77|(1:79)|80|(1:189)|84|(1:188)|86|(1:187)(3:90|(1:92)|93)|94|(1:96)(1:186)|97|(4:100|(3:105|106|107)|108|98)|111|112|113|114|(2:116|(16:118|119|(1:121)(1:181)|122|(9:126|127|128|(1:130)|131|132|(2:137|(1:139))|140|(1:142))|145|(4:147|(2:150|148)|151|152)|153|(1:155)(3:167|(2:169|3cc)|180)|156|157|158|159|(1:161)(1:164)|162|163))|183|119|(0)(0)|122|(10:124|126|127|128|(0)|131|132|(3:135|137|(0))|140|(0))|145|(0)|153|(0)(0)|156|157|158|159|(0)(0)|162|163)|191|77|(0)|80|(1:82)|189|84|(0)|86|(1:88)|187|94|(0)(0)|97|(1:98)|111|112|113|114|(0)|183|119|(0)(0)|122|(0)|145|(0)|153|(0)(0)|156|157|158|159|(0)(0)|162|163) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03e1, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02bc, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b4 A[Catch: Exception -> 0x02bb, TryCatch #1 {Exception -> 0x02bb, blocks: (B:114:0x02aa, B:116:0x02b4), top: B:113:0x02aa }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0252  */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r1v40 */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(android.content.Context r31, com.bytedance.router.RouteIntent r32) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService.LIZLLL(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static void LJIIJJI(InterfaceC55791Lv1 interfaceC55791Lv1, Context context, String str) {
        View LIZ;
        if (C00F.LIZ(31744, 0, "ec_add_to_cart_new_anim", true) != 0 && (LIZ = interfaceC55791Lv1.LIZ()) != null) {
            C54373LVp.LIZ(LIZ);
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        View LIZ2 = interfaceC55791Lv1.LIZ();
        c71361RzZ.getClass();
        C71361RzZ.LJJJJZI(context, LIZ2, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LIZIZ(View view, ViewGroup viewGroup, String str) {
        o.LJIIIZ(view, "view");
        this.LIZIZ = view;
        this.LIZJ = viewGroup;
        this.LIZLLL = str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final C71353RzR LIZJ(Context context, Aweme aweme, String str) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getType() == 35 && anchorCommonStruct2.getExtra().length() > 0) {
                if (anchorCommonStruct == null) {
                    return null;
                }
                return new C71353RzR(context, aweme, str);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LJIIIZ(Fragment fragment, LifecycleOwner lifecycleOwner, List list, C42893GsT c42893GsT) {
        long j;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        if (currentUserID != null) {
            j = CastLongProtector.parseLong(currentUserID);
        } else {
            j = 0;
        }
        C78565UsT.LJJIIZI(lifecycleOwner, MBB.INSTANCE, new C42586GnW(j, list, this, c42893GsT, fragment, null));
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [X.9Yd] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LJ(View view, Activity activity, InterfaceC55791Lv1 interfaceC55791Lv1, String str, InterfaceC65784Pro<C76800UCe> result) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(result, "result");
        if (!C71370Rzi.LIZ) {
            return;
        }
        if (interfaceC55791Lv1 == null || interfaceC55791Lv1.LIZ() == null || interfaceC55791Lv1.getContainerView() == null) {
            if (activity != null) {
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                c26045AKb.LJI(AnonymousClass636.LJIIIIZZ(R.attr.e8, context));
                c26045AKb.LJIIJ();
                return;
            }
            return;
        }
        if (this.LIZIZ == null) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new Object() { // from class: X.9Yd
                public static void LIZ(Context context2, View view2, View view3, final ViewGroup viewGroup, final C73411SrX c73411SrX, final C55790Lv0 c55790Lv0) {
                    float f;
                    C238659Yf.LIZ.getClass();
                    if (C238659Yf.LIZ()) {
                        EComLiveDegradeExperiment.LIZ.getClass();
                        if (EComLiveDegradeExperiment.LIZ().getEntranceAnimDegrade()) {
                            c55790Lv0.LIZ();
                            return;
                        }
                    }
                    if (context2 == null || view2 == null || view3 == null || viewGroup == null) {
                        return;
                    }
                    if (!view2.isShown() || !view3.isShown()) {
                        c55790Lv0.LIZ();
                        return;
                    }
                    final ImageView imageView = new ImageView(context2);
                    imageView.setImageResource(R.drawable.ag8);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    viewGroup.addView(imageView, new ViewGroup.LayoutParams((int) C45804HyK.LJJ(64.0f), (int) C45804HyK.LJJ(64.0f)));
                    viewGroup.getLocationInWindow(new int[2]);
                    view2.getLocationInWindow(new int[2]);
                    int[] iArr = new int[2];
                    view3.getLocationInWindow(iArr);
                    if (iArr[1] < 0) {
                        iArr[1] = 0;
                    }
                    float width = ((view2.getWidth() / 2.0f) + (r1[0] - r2[0])) - ((int) C45804HyK.LJJ(31.0f));
                    float height = ((view2.getHeight() / 2.0f) + (r1[1] - r2[1])) - ((int) C45804HyK.LJJ(31.0f));
                    float height2 = ((view3.getHeight() / 2.0f) + (iArr[1] - r2[1])) - ((int) C45804HyK.LJJ(31.0f));
                    Path path = new Path();
                    path.moveTo(width, height);
                    path.quadTo(width, height2, ((view3.getWidth() / 2.0f) + (iArr[0] - r2[0])) - ((int) C45804HyK.LJJ(31.0f)), height2);
                    final PathMeasure pathMeasure = new PathMeasure(path, false);
                    final float length = pathMeasure.getLength();
                    float abs = Math.abs(height2 - height);
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        f = displayMetrics.density;
                    } else {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
                    ofFloat.setDuration((abs / f) * 1.65f);
                    ofFloat.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
                    final C56K c56k = new C56K();
                    c56k.element = 1.0f;
                    final C34K c34k = new C34K();
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9WV
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            float[] fArr = new float[2];
                            pathMeasure.getPosTan(floatValue, fArr, null);
                            imageView.setTranslationX(fArr[0]);
                            imageView.setTranslationY(fArr[1]);
                            C56K c56k2 = c56k;
                            float f2 = length;
                            float f3 = (f2 - ((2 * floatValue) / 3)) / (f2 * 1.0f);
                            c56k2.element = f3;
                            imageView.setScaleX(f3);
                            imageView.setScaleY(c56k.element);
                            if (floatValue / length > 0.7d) {
                                C34K c34k2 = c34k;
                                if (!c34k2.element) {
                                    c34k2.element = true;
                                    C9WW c9ww = c55790Lv0;
                                    if (c9ww != null) {
                                        c9ww.LIZ();
                                    }
                                }
                            }
                        }
                    });
                    ofFloat.start();
                    ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.3Y3
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animation) {
                            ImageView imageView2;
                            o.LJIIIZ(animation, "animation");
                            ViewGroup viewGroup2 = viewGroup;
                            if (viewGroup2 != null && (imageView2 = imageView) != null) {
                                C16880lQ.LJLLL(imageView2, viewGroup2);
                                InterfaceC92693kP interfaceC92693kP = c73411SrX;
                                if (interfaceC92693kP != null) {
                                    interfaceC92693kP.dispose();
                                }
                            }
                        }
                    });
                }
            };
        }
        try {
            FFL.LJIIIZ().getClass();
            boolean z = true;
            int LJIIJ = FFL.LJIIJ(31744, 0, "ec_add_to_cart_new_anim", true);
            if (LJIIJ != 1 && LJIIJ != 2) {
                if (this.LIZ != null) {
                    C238639Yd.LIZ(view.getContext(), this.LIZIZ, interfaceC55791Lv1.LIZ(), interfaceC55791Lv1.getContainerView(), this.LJ, new C55790Lv0(activity, this, interfaceC55791Lv1, view, str));
                    return;
                }
                return;
            }
            IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
            Context context2 = view.getContext();
            String str2 = this.LIZLLL;
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            ViewGroup viewGroup = this.LIZJ;
            c71361RzZ.getClass();
            if (viewGroup == null) {
                z = false;
            } else {
                Rect rect = new Rect();
                if (viewGroup.getLocalVisibleRect(rect) && rect.bottom - rect.top > viewGroup.getHeight() / 2) {
                    z = false;
                }
            }
            createIECommerceServicebyMonsterPlugin.doNewCartAnimation(context2, null, str2, z, interfaceC55791Lv1.LIZ(), this.LIZJ, interfaceC55791Lv1.getContainerView(), new AqS31S1300000_9(this, interfaceC55791Lv1, view, str, 0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService
    public final void LJI(TuxIconView tuxIconView, View view, String productId, String str, String str2, String str3, InterfaceC88472Yns interfaceC88472Yns, String str4, InterfaceC88476Ynw interfaceC88476Ynw) {
        String str5;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(productId, "productId");
        C28043AzX c28043AzX = C28043AzX.LJLJJLL;
        PageSourceInfo LIZJ = C39468FeK.LIZJ();
        if (LIZJ != null) {
            str5 = C27739Aud.LJI(LIZJ);
        } else {
            str5 = null;
        }
        this.LJ = (C73411SrX) c28043AzX.LLLLZ(new AddItemToCartRequest(str2, null, productId, str, 1, str3, str4, 2, null, null, null, null, null, null, str5, 0, Boolean.FALSE), view, view, true, new C65805Ps9(view, interfaceC88472Yns), new AqS116S0300000_12(interfaceC88476Ynw, tuxIconView, this, view, 26)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Ee
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9Ef
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}

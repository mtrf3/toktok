package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.ActivityC45651qj;
import X.C0C3;
import X.C200777uL;
import X.C203007xw;
import X.C203027xy;
import X.C212428Vi;
import X.C214378bB;
import X.C221108m2;
import X.C38995FSd;
import X.C61878OQg;
import X.C62822Ol8;
import X.C6U6;
import X.C81C;
import X.C81I;
import X.C82L;
import X.C82Y;
import X.C83G;
import X.C8YN;
import X.InterfaceC2048082a;
import X.TBT;
import X.V16;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS6S0201000_3;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPagePhotosAssem;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPagePhotosAssem extends BaseFullPageAssem implements C0C3 {
    public C203007xw LJLJJI;
    public final C214378bB LJLJJLL;
    public C82L LJLJL;
    public C81C LJLJLJ;
    public GestureDetector LJLJLLL;
    public final ARunnableS39S0100000_3 LJLL;
    public final C203027xy LJLLI;
    public final boolean LJLLILLLL;
    public final C200777uL LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 428));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLL;
        Integer valueOf = Integer.valueOf(R.id.hzk);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.hzk)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0078, code lost:
    
        if (r1 == com.ss.android.ugc.aweme.model.PostModeEntranceMechanism.TAP_PHOTO) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.7uL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FullPagePhotosAssem() {
        /*
            r12 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r12.LJLLL = r0
            r12.<init>()
            kotlin.jvm.internal.AqS153S0100000_3 r1 = new kotlin.jvm.internal.AqS153S0100000_3
            r0 = 428(0x1ac, float:6.0E-43)
            r1.<init>(r12, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r12.LJLJJL = r0
            kotlin.jvm.internal.AqS153S0100000_3 r5 = new kotlin.jvm.internal.AqS153S0100000_3
            r0 = 427(0x1ab, float:5.98E-43)
            r5.<init>(r12, r0)
            java.lang.Class<com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel> r0 = com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel.class
            X.Prg r4 = X.C65352Pkq.LIZ(r0)
            X.7xj r9 = X.C202877xj.INSTANCE
            boolean r0 = X.C214368bA.LJIIIIZZ
            r2 = 1
            if (r0 == 0) goto L88
            kotlin.jvm.internal.AqS153S0100000_3 r10 = new kotlin.jvm.internal.AqS153S0100000_3
            r0 = 429(0x1ad, float:6.01E-43)
            r10.<init>(r12, r0)
        L32:
            kotlin.jvm.internal.AqS60S0110000_3 r11 = X.C78926UyI.LJIIZILJ(r12, r2)
            X.8bB r3 = new X.8bB
            X.8bQ r6 = X.C214528bQ.LJLIL
            r0 = 0
            kotlin.jvm.internal.AqS61S0110000_4 r7 = X.C78926UyI.LJJII(r12, r0)
            X.7Kh r8 = X.C184077Kh.LJLIL
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.LJLJJLL = r3
            Y.ARunnableS39S0100000_3 r1 = new Y.ARunnableS39S0100000_3
            r0 = 80
            r1.<init>(r12, r0)
            r12.LJLL = r1
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r12)
            X.7xb r1 = new X.7xb
            r1.<init>()
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.7xy r0 = new X.7xy
            r0.<init>(r3, r1)
            r12.LJLLI = r0
            boolean r0 = X.C203277yN.LIZ()
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam r0 = r12.A3()
            com.ss.android.ugc.aweme.model.PostModeDetailParams r0 = r0.getPostModeDetailParams()
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.model.PostModeEntranceMechanism r1 = r0.postModeEntranceMechanism
        L76:
            com.ss.android.ugc.aweme.model.PostModeEntranceMechanism r0 = com.ss.android.ugc.aweme.model.PostModeEntranceMechanism.TAP_PHOTO
            if (r1 != r0) goto L86
        L7a:
            r12.LJLLILLLL = r2
            X.7uL r0 = new X.7uL
            r0.<init>()
            r12.LJLLJ = r0
            return
        L84:
            r1 = 0
            goto L76
        L86:
            r2 = 0
            goto L7a
        L88:
            kotlin.jvm.internal.AqS60S0110000_3 r10 = X.C78926UyI.LJIILJJIL(r12, r2)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fullpagev3.assem.FullPagePhotosAssem.<init>():void");
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            x3().sv0();
        } else {
            PostModeFullPageViewModel x3 = x3();
            x3.getClass();
            x3.withState(new AqS169S0100000_3((PhotoViewModelV2) x3, 1011));
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        Context context;
        Aweme aweme;
        x3().onPageSelected(i);
        if (i == ((PhotoSharedViewModel) this.LJLJJLL.getValue()).LJLJLJ || (context = getContext()) == null || (aweme = A3().getAweme()) == null) {
            return;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS6S0201000_3(i, context, aweme, 4));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        ViewGroup viewGroup;
        List<PhotoModeImageUrlModel> list;
        Window window;
        PhotoModeIngressEtData photoModeIngressEtData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = new GestureDetector(getContainerView().getContext(), this.LJLLJ);
        this.LJLJJI = (C203007xw) getContainerView().findViewById(R.id.hp0);
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = (PostModeTimeLoggerViewModel) this.LJLJJL.getValue();
        if (postModeTimeLoggerViewModel != null && (photoModeIngressEtData = postModeTimeLoggerViewModel.LJLILLLLZI) != null) {
            x3().LJLLLL.LIZJ = !photoModeIngressEtData.isVideoPlayFinishReported;
        }
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel2 = (PostModeTimeLoggerViewModel) this.LJLJJL.getValue();
        if (postModeTimeLoggerViewModel2 != null) {
            postModeTimeLoggerViewModel2.LJLJJI = new AqS153S0100000_3(this, 1547);
        }
        A3().getAweme();
        C203007xw c203007xw = this.LJLJJI;
        if (c203007xw != null) {
            c203007xw.LJFF(this);
        }
        C83G c83g = new C83G() { // from class: X.7xl
            @Override // X.C83G
            public final void LJIIIIZZ(MotionEvent motionEvent) {
                GestureDetector gestureDetector;
                if (motionEvent != null && (gestureDetector = FullPagePhotosAssem.this.LJLJLLL) != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
            }
        };
        C82Y c82y = new C82Y() { // from class: X.7xp
            @Override // X.C82Y
            public final void p2() {
                MutableLiveData<Boolean> mutableLiveData;
                PostModeFullPageViewModel x3 = FullPagePhotosAssem.this.x3();
                x3.setState(C202947xq.LJLIL);
                x3.withState(new AqS169S0100000_3((PhotoViewModelV2) x3, 1009));
                PostModeContainerViewModel v3 = FullPagePhotosAssem.this.v3();
                if (v3 == null || (mutableLiveData = v3.LLIIZ) == null) {
                    return;
                }
                mutableLiveData.setValue(Boolean.TRUE);
            }

            @Override // X.C82Y
            public final void E0(Float f, Boolean bool) {
                MutableLiveData<Boolean> mutableLiveData;
                PostModeContainerViewModel v3 = FullPagePhotosAssem.this.v3();
                if (v3 != null && (mutableLiveData = v3.LLIIZ) != null) {
                    mutableLiveData.setValue(Boolean.FALSE);
                }
                PostModeFullPageViewModel x3 = FullPagePhotosAssem.this.x3();
                x3.setState(C202957xr.LJLIL);
                x3.withState(new AqS107S0300000_3(x3, f, bool, 46));
            }
        };
        C6U6 c6u6 = new C6U6() { // from class: X.7xe
            @Override // X.C6U6
            public final boolean LLZ(InteractStickerStruct sticker) {
                o.LJIIIZ(sticker, "sticker");
                FullPagePhotosAssem.this.x3().kv0();
                return true;
            }
        };
        PostModeFullPageViewModel x3 = x3();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null) {
            view2 = window.getDecorView();
        } else {
            view2 = null;
        }
        if (view2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) view2;
        } else {
            viewGroup = null;
        }
        C82L c82l = new C82L(c83g, c82y, c6u6, x3, viewGroup, new InterfaceC2048082a() { // from class: X.7xs
            @Override // X.InterfaceC2048082a
            public final void LIZ(SlidesImageLoadParams slidesImageLoadParams) {
                FullPagePhotosAssem.this.x3().pv0(slidesImageLoadParams);
            }

            @Override // X.InterfaceC2048082a
            public final void LIZJ(SlidesImageLoadParams slidesImageLoadParams) {
                PostModeFullPageViewModel x32 = FullPagePhotosAssem.this.x3();
                x32.getClass();
                x32.withState(new AqS134S0200000_3(x32, slidesImageLoadParams, 295));
            }
        }, new C81I() { // from class: X.7xu
            @Override // X.C81I
            public final void LIZ() {
                FullPagePhotosAssem.this.x3().LJLL.LIZIZ++;
            }

            @Override // X.C81I
            public final void LIZIZ(int i) {
                C2045581b c2045581b = FullPagePhotosAssem.this.x3().LJLL;
                c2045581b.LJ = Math.max(c2045581b.LJ, i);
            }
        }, (PhotoSharedViewModel) this.LJLJJLL.getValue());
        this.LJLJL = c82l;
        C203007xw c203007xw2 = this.LJLJJI;
        if (c203007xw2 != null) {
            c203007xw2.setAdapter(c82l);
        }
        C82L c82l2 = this.LJLJL;
        if (c82l2 != null) {
            Aweme aweme = A3().getAweme();
            if (aweme == null || (list = V16.LJIJJLI(aweme)) == null) {
                list = C61878OQg.INSTANCE;
            }
            c82l2.LJJIIZI(list, null);
            Context context = getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            C81C c81c = new C81C(context);
            this.LJLJLJ = c81c;
            C203007xw c203007xw3 = this.LJLJJI;
            if (c203007xw3 != null) {
                c203007xw3.setScroller(c81c);
            }
            PostModeFullPageViewModel x32 = x3();
            int i = x3().LJLLILLLL;
            x32.getClass();
            x32.setState(new AqS93S0101000_3(i, x32, 19));
            C8YN.LJII(this, x3(), new TBT() { // from class: X.7xi
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C203127y8) obj).LJLLLL);
                }
            }, null, new AqS185S0100000_3(this, 199), 6);
            C8YN.LJII(this, x3(), new TBT() { // from class: X.7xk
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C203127y8) obj).LJLJJLL;
                }
            }, null, new AqS185S0100000_3(this, 201), 6);
            C8YN.LJII(this, x3(), new TBT() { // from class: X.7b9
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C203127y8) obj).LJLIL);
                }
            }, null, new AqS185S0100000_3(this, 203), 6);
            PostModeDetailParams postModeDetailParams = A3().getPostModeDetailParams();
            if (postModeDetailParams != null && postModeDetailParams.needMobVideoPlay) {
                getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.fullpagev3.assem.FullPagePhotosAssem$initView$10
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        FullPagePhotosAssem.this.x3().rv0();
                    }
                });
                return;
            }
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }
}

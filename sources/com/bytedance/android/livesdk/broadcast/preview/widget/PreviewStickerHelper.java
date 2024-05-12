package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.B4U;
import X.BQO;
import X.C0TW;
import X.C0TY;
import X.C0WF;
import X.C15650jR;
import X.C19680pw;
import X.C1KS;
import X.C29306Beo;
import X.C30355Bvj;
import X.C30397BwP;
import X.C30465BxV;
import X.C30467BxX;
import X.C30476Bxg;
import X.C30527ByV;
import X.C31014CFe;
import X.C76800UCe;
import X.C78720Uuy;
import X.C7N;
import X.InterfaceC08030Tf;
import X.InterfaceC30359Bvn;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.effect.api.SelectH5StickerInPreview;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS187S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewStickerHelper implements GenericLifecycleObserver {
    public final FrameLayout LJLIL;
    public final DataChannel LJLILLLLZI;
    public final Context LJLJI;
    public final ImageView LJLJJI;
    public final View LJLJJL;
    public final InterfaceC30359Bvn LJLJJLL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJL;
    public LiveEffect LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final InterfaceC08030Tf LJLLI;
    public final boolean LJLLILLLL;
    public C0TW LJLLJ;
    public final C30476Bxg LJLLL;
    public String LJLLLL;
    public final C30467BxX LJLLLLLL;
    public final C30465BxV LJLZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onPreviewFragmentDestroy();
        }
    }

    public final void LIZ() {
        boolean z;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLJL;
        if (C1KS.LIZLLL() && this.LJLJLJ == null) {
            z = true;
        } else {
            z = false;
        }
        interfaceC88472Yns.invoke(Boolean.valueOf(z));
    }

    public final void LIZIZ() {
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.cz4);
        }
        ImageView imageView2 = this.LJLJJI;
        if (imageView2 != null) {
            imageView2.setScaleX(1.0f);
        }
        ImageView imageView3 = this.LJLJJI;
        if (imageView3 == null) {
            return;
        }
        imageView3.setScaleY(1.0f);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onPreviewFragmentDestroy() {
        C30476Bxg c30476Bxg = this.LJLLL;
        if (c30476Bxg != null) {
            c30476Bxg.LIZ(this.LJLLLLLL);
        }
    }

    public final void LIZJ(LiveEffect liveEffect) {
        LiveEffect.CommerceExtra commerceExtra;
        ImageModel imageModel;
        InterfaceC30359Bvn interfaceC30359Bvn = this.LJLJJLL;
        String str = C0TY.LIZIZ;
        interfaceC30359Bvn.LJJIIJ(liveEffect, str);
        C0WF LIZJ = C30355Bvj.LIZJ();
        Boolean bool = null;
        LIZJ.LJIJJLI(null);
        LIZJ.LIZJ(null);
        LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
        if (stickerSDKExtra != null) {
            commerceExtra = stickerSDKExtra.commerceExtra;
        } else {
            commerceExtra = null;
        }
        if (commerceExtra == null) {
            BQO LIZ = C15650jR.LIZ();
            UrlModel urlModel = liveEffect.icon;
            if (urlModel != null) {
                imageModel = urlModel.L();
            } else {
                imageModel = null;
            }
            C78720Uuy LJIIIZ = LIZ.LJIIIZ(imageModel);
            LJIIIZ.LJIIIIZZ = R.drawable.cz4;
            LJIIIZ.LJIIJJI(this.LJLJJI);
        }
        View view = this.LJLJJL;
        if (view != null) {
            C29306Beo.LJI(view);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(liveEffect.effectId));
        String name = liveEffect.getName();
        if (name == null) {
            name = "";
        }
        hashMap.put("name", name);
        B4U.LIZ().LJJIFFI("sticker", hashMap);
        C0TW c0tw = this.LJLLJ;
        if (c0tw != null) {
            bool = Boolean.valueOf(c0tw.LJFF(liveEffect));
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C0TW c0tw2 = this.LJLLJ;
            if (c0tw2 != null) {
                c0tw2.LIZIZ(liveEffect);
            }
        } else {
            C0TW c0tw3 = this.LJLLJ;
            if (c0tw3 != null) {
                c0tw3.LIZLLL();
            }
            this.LJLILLLLZI.qv0(StickerSelectedEvent.class, new C19680pw(liveEffect, str, this.LJLLLL, false));
        }
        C31014CFe.LJFF(String.valueOf(liveEffect.effectId));
        C31014CFe.LJI(liveEffect.getResourceId());
    }

    public PreviewStickerHelper(Fragment fragment, FrameLayout frameLayout, DataChannel dataChannel, Context context, ImageView imageView, InterfaceC30359Bvn interfaceC30359Bvn, LifecycleOwner lifecycleOwner, AqS171S0100000_5 aqS171S0100000_5) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = context;
        this.LJLJJI = imageView;
        C0TW c0tw = null;
        this.LJLJJL = null;
        this.LJLJJLL = interfaceC30359Bvn;
        this.LJLJL = aqS171S0100000_5;
        this.LJLLI = C30355Bvj.LJFF();
        this.LJLLILLLL = o.LJ("insert_props", C30397BwP.LIZ);
        C30467BxX c30467BxX = new C30467BxX(this);
        this.LJLLLLLL = c30467BxX;
        this.LJLZ = new C30465BxV(this);
        dataChannel.ov0(lifecycleOwner, EffectRedDotStatusChangeEvent.class, new AqS171S0100000_5(this, 631));
        dataChannel.lv0(lifecycleOwner, StickerCancelChannel.class, new AqS171S0100000_5(this, 632));
        dataChannel.lv0(lifecycleOwner, NewInsertStickerEvent.class, new AqS171S0100000_5(this, 624));
        dataChannel.lv0(lifecycleOwner, SelectH5StickerInPreview.class, new AqS171S0100000_5(this, 625));
        C30355Bvj.LIZJ().LJIIIZ(C30527ByV.LIZIZ);
        C7N.LJII().releaseNaviAvatarResources();
        C30476Bxg c30476Bxg = new C30476Bxg(interfaceC30359Bvn);
        this.LJLLL = c30476Bxg;
        lifecycleOwner.getLifecycle().addObserver(this);
        c30476Bxg.LIZLLL(c30467BxX);
        C0TW liveEffectPalletHandler = C7N.LJII().getLiveEffectPalletHandler(new WeakReference<>(dataChannel), new WeakReference<>(fragment), c30476Bxg);
        if (liveEffectPalletHandler != null) {
            liveEffectPalletHandler.LJII(new AqS187S0100000_5(this, 3));
            c0tw = liveEffectPalletHandler;
        }
        this.LJLLJ = c0tw;
    }
}

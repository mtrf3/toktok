package com.ss.android.ugc.aweme.innerpush.ui;

import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.C10K;
import X.C16880lQ;
import X.C16970lZ;
import X.C17J;
import X.C32151Nz;
import X.C46318IFu;
import X.C4XM;
import X.C53334KwU;
import X.C56308M8a;
import X.C61878OQg;
import X.C63081OpJ;
import X.C76800UCe;
import X.C86478Xwo;
import X.C86482Xws;
import X.C86487Xwx;
import X.C86493Xx3;
import X.C86496Xx6;
import X.C86497Xx7;
import X.C86506XxG;
import X.C86512XxM;
import X.EF7;
import X.EnumC86511XxL;
import X.InterfaceC65784Pro;
import X.InterfaceC86538Xxm;
import X.KL2;
import X.ORZ;
import X.SQV;
import X.X1D;
import X.XLZ;
import Y.ACallableS112S0100000_9;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.idl.InnerPushApi;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InnerPushPopupWindow extends PopupWindow implements GenericLifecycleObserver, InterfaceC86538Xxm {
    public final ActivityC45651qj LJLIL;
    public InnerPushMessage LJLILLLLZI;
    public final C86493Xx3 LJLJI;
    public C86482Xws LJLJJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        C86478Xwo.LIZ("InnerPushPopupWindow", " current activity onDestroy........");
        LIZIZ(null, false);
        this.LJLIL.getLifecycle().removeObserver(this);
    }

    public InnerPushPopupWindow(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        this.LJLIL = activityC45651qj;
        C86493Xx3 c86493Xx3 = new C86493Xx3(activityC45651qj);
        this.LJLJI = c86493Xx3;
        c86493Xx3.setInnerPushNotifier(this);
        setContentView(c86493Xx3);
        activityC45651qj.getLifecycle().addObserver(this);
        setWidth(KL2.LJIIJJI(EF7.LIZIZ()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a_l);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public static void LIZJ(InnerPushMessage innerPushMessage) {
        C86506XxG.LIZLLL(innerPushMessage.getType(), innerPushMessage);
        innerPushMessage.getTracker().LIZJ = System.currentTimeMillis();
        innerPushMessage.getTracker().LJIILJJIL = System.currentTimeMillis() - innerPushMessage.getCreateTime();
        innerPushMessage.getTracker().LJIILL = System.currentTimeMillis() - innerPushMessage.getTracker().LJIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show getCurrentTime :");
        LIZ.append(System.currentTimeMillis());
        LIZ.append(" clientInterval:");
        LIZ.append(innerPushMessage.getTracker().LJIILL);
        LIZ.append(" receiveTime:");
        LIZ.append(innerPushMessage.getTracker().LJIIL);
        LIZ.append(" message:");
        LIZ.append(innerPushMessage);
        C86478Xwo.LIZ("InnerPushPopupWindow", X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(C10K.LIZIZ(new ACallableS112S0100000_9(new AqS165S0100000_15(innerPushMessage, 467), (InterfaceC65784Pro<C76800UCe>) 17), C10K.LJI, null), "block: () -> Unit): Task…Task.BACKGROUND_EXECUTOR)");
    }

    @Override // X.InterfaceC86538Xxm
    public final void LIZ(boolean z) {
        LIZIZ(null, z);
    }

    @Override // android.widget.PopupWindow
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    public final void LIZIZ(String str, boolean z) {
        InnerPushFreqControlStrategy freqControlStrategy;
        InnerPushBanStrategy banStrategy;
        InnerPushFreqControlStrategy freqControlStrategy2;
        InnerPushBanStrategy banStrategy2;
        InnerPushBanStrategy innerPushBanStrategy;
        InnerPushUITemplate uiTemplate;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" dismissPopup userCancel:");
        LIZ.append(z);
        LIZ.append(" reason:");
        LIZ.append(str);
        C86478Xwo.LIZ("InnerPushPopupWindow", X1D.LIZIZ(LIZ));
        if (isShowing()) {
            ActivityC45651qj activityC45651qj = this.LJLIL;
            if (activityC45651qj != null && !activityC45651qj.isFinishing() && this.LJLJI.isAttachedToWindow()) {
                dismiss();
            }
            InnerPushMessage innerPushMessage = this.LJLILLLLZI;
            if (innerPushMessage != null) {
                if (C53334KwU.LIZIZ()) {
                    Iterator<Integer> it = C86487Xwx.LIZ.iterator();
                    while (it.hasNext()) {
                        C16970lZ.LJII(it.next().intValue());
                    }
                }
                InnerPushMessage innerPushMessage2 = 0;
                if (((Boolean) C53334KwU.LIZIZ.getValue()).booleanValue() && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
                    List<Bitmap> preloadAvatar = uiTemplate.getPreloadAvatar();
                    if (preloadAvatar != null) {
                        Iterator<Bitmap> it2 = preloadAvatar.iterator();
                        while (it2.hasNext()) {
                            it2.next().recycle();
                        }
                    }
                    List<Bitmap> preloadAvatar2 = uiTemplate.getPreloadAvatar();
                    if (preloadAvatar2 != null) {
                        ((ArrayList) ORZ.LLJILJILJ(preloadAvatar2)).clear();
                    }
                    uiTemplate.setPreloadAvatar(null);
                    Bitmap preloadLabelImage = uiTemplate.getPreloadLabelImage();
                    if (preloadLabelImage != null) {
                        preloadLabelImage.recycle();
                    }
                    uiTemplate.setPreloadLabelImage(null);
                    Bitmap preloadRightImage = uiTemplate.getPreloadRightImage();
                    if (preloadRightImage != null) {
                        preloadRightImage.recycle();
                    }
                    uiTemplate.setPreloadRightImage(null);
                    Bitmap preloadTopImage = uiTemplate.getPreloadTopImage();
                    if (preloadTopImage != null) {
                        preloadTopImage.recycle();
                    }
                    uiTemplate.setPreloadTopImage(null);
                }
                if (z) {
                    InnerPushApi.LIZ(innerPushMessage, EnumC86511XxL.CANCEL_BY_USER);
                    InnerPushConfig config = innerPushMessage.getConfig();
                    if (config != null && (freqControlStrategy2 = config.getFreqControlStrategy()) != null && (banStrategy2 = freqControlStrategy2.getBanStrategy()) != null) {
                        String cacheString = C86497Xx7.LJ().getString(C86497Xx7.LIZ(banStrategy2.getId()), "");
                        o.LJIIIIZZ(cacheString, "cacheString");
                        try {
                            innerPushMessage2 = JsonParseUtils.LIZJ(InnerPushBanStrategy.class, cacheString);
                            innerPushBanStrategy = innerPushMessage2;
                        } catch (Throwable th) {
                            Throwable LJFF = AnonymousClass028.LJFF(th);
                            innerPushBanStrategy = innerPushMessage2;
                            if (LJFF != null) {
                                C86496Xx6.LJIIIIZZ(innerPushMessage2, "json_parse_object", LJFF.getMessage());
                                innerPushBanStrategy = innerPushMessage2;
                            }
                        }
                        InnerPushBanStrategy innerPushBanStrategy2 = innerPushBanStrategy;
                        if (innerPushBanStrategy2 != null) {
                            List<Long> records = innerPushBanStrategy2.getRecords();
                            if (records == null) {
                                records = C61878OQg.INSTANCE;
                            }
                            XLZ xlz = new XLZ(records, ((Number) com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig.LIZLLL.getValue()).intValue());
                            xlz.LIZ(Long.valueOf(System.currentTimeMillis()));
                            innerPushBanStrategy2.setRecords(xlz.LIZIZ);
                            C86497Xx7.LJ().storeString(C86497Xx7.LIZ(banStrategy2.getId()), C86512XxM.LIZJ(innerPushBanStrategy2));
                        } else {
                            List<Long> records2 = banStrategy2.getRecords();
                            if (records2 == null) {
                                records2 = C61878OQg.INSTANCE;
                            }
                            XLZ xlz2 = new XLZ(records2, ((Number) com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig.LIZLLL.getValue()).intValue());
                            xlz2.LIZ(Long.valueOf(System.currentTimeMillis()));
                            banStrategy2.setRecords(xlz2.LIZIZ);
                            C86497Xx7.LJ().storeString(C86497Xx7.LIZ(banStrategy2.getId()), C86512XxM.LIZJ(banStrategy2));
                        }
                    }
                } else {
                    InnerPushConfig config2 = innerPushMessage.getConfig();
                    if (config2 != null && (freqControlStrategy = config2.getFreqControlStrategy()) != null && (banStrategy = freqControlStrategy.getBanStrategy()) != null) {
                        C86497Xx7.LJ().erase(C86497Xx7.LIZ(banStrategy.getId()));
                    }
                    InnerPushApi.LIZ(innerPushMessage, EnumC86511XxL.DISAPPEAR);
                }
                C86506XxG.LIZIZ(innerPushMessage.getType(), innerPushMessage, z, str);
                C86496Xx6.LJII(innerPushMessage, z);
            }
        }
    }

    public final void LIZLLL(C86482Xws c86482Xws, InnerPushMessage innerPushMessage) {
        long j;
        this.LJLILLLLZI = innerPushMessage;
        this.LJLJJI = c86482Xws;
        this.LJLJI.setMessage(innerPushMessage);
        C86493Xx3 c86493Xx3 = this.LJLJI;
        c86493Xx3.getClass();
        FrameLayout frameLayout = c86493Xx3.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = c86493Xx3.LJLILLLLZI;
        if (frameLayout2 != null) {
            frameLayout2.addView(c86482Xws);
        }
        C86493Xx3 c86493Xx32 = this.LJLJI;
        if (innerPushMessage.getConfig() != null) {
            j = r0.getPopupDurationSeconds() * 1000;
        } else {
            j = 5000;
        }
        c86493Xx32.setShowDuration(j);
        C86493Xx3 c86493Xx33 = this.LJLJI;
        c86493Xx33.getClass();
        C86478Xwo.LIZ("inner_push_platform", "InnerPushPullLayout onShow");
        InnerPushPullUpLayout innerPushPullUpLayout = c86493Xx33.LJLIL;
        if (innerPushPullUpLayout != null) {
            innerPushPullUpLayout.LIZIZ();
        }
        c86493Xx33.LJLJJL = System.currentTimeMillis() + c86493Xx33.LJLJJLL;
        c86493Xx33.LIZJ();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null) {
            int globalRadius = uiTemplate.getGlobalRadius();
            SQV sqv = this.LJLJI.LJLJI;
            if (sqv != null) {
                float LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(globalRadius));
                Drawable findDrawableByLayerId = sqv.findDrawableByLayerId(1827182);
                if (findDrawableByLayerId instanceof ShapeDrawable) {
                    if (Math.abs(sqv.LJLIL - LJIIZILJ) < 1.0E-6d) {
                        C86478Xwo.LIZLLL("InnerPushBackgroundDrawable", "[updateCornerRadius], roundRadius is equal to current background radius, no need to update");
                    } else {
                        ((ShapeDrawable) findDrawableByLayerId).setShape(C17J.LJJIIJZLJL(LJIIZILJ));
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("[updateCornerRadius], update background radius = ");
                        LIZ.append(LJIIZILJ);
                        LIZ.append(" px");
                        C86478Xwo.LIZLLL("InnerPushBackgroundDrawable", X1D.LIZIZ(LIZ));
                        sqv.LJLIL = LJIIZILJ;
                    }
                }
            }
        }
        if (!this.LJLIL.isFinishing() && !isShowing()) {
            if (getContentView().getParent() != null) {
                ViewParent parent = getContentView().getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LJLLL(getContentView(), (ViewGroup) parent);
            }
            LIZJ(innerPushMessage);
            View decorView = this.LJLIL.getWindow().getDecorView();
            int i = -C63081OpJ.LJJJJLI(this.LJLIL);
            if (C4XM.LIZ()) {
                C56308M8a.LIZ();
            }
            C46318IFu.LIZ.getClass();
            if (C46318IFu.LIZ()) {
                try {
                    C56308M8a.LIZIZ();
                    Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(this));
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    int i2 = attributes.flags;
                    boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                    C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                    attributes.flags &= -16777217;
                    showAtLocation(decorView, 48, 0, i);
                    C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                    attributes.flags = i2;
                    return;
                } catch (Throwable unused) {
                    showAtLocation(decorView, 48, 0, i);
                    return;
                }
            }
            showAtLocation(decorView, 48, 0, i);
        }
    }
}

package com.bytedance.android.livesdk.hotword;

import X.ActivityC45651qj;
import X.C15580jK;
import X.C15650jR;
import X.C16880lQ;
import X.C29306Beo;
import X.C32663Crr;
import X.C36636EZk;
import X.C47061t0;
import X.C47121t6;
import X.C53402Kxa;
import X.C63142dq;
import X.C68152lv;
import X.C77353UXl;
import X.C78613UtF;
import X.C78720Uuy;
import X.C87277YNd;
import X.T2R;
import X.U5V;
import X.U5X;
import X.UEB;
import X.UX7;
import X.UXC;
import X.UXD;
import X.UXE;
import X.UXJ;
import X.UXK;
import X.UXO;
import X.XKQ;
import X.XKX;
import Y.ACListenerS33S0100000_13;
import Y.AObserverS81S0100000_13;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.RechargeDialogDismissEvent;
import com.bytedance.android.livesdk.dataChannel.InputDialogShowingChannel;
import com.bytedance.android.livesdk.gift.event.LiveGiftSuspensionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class HotWordGiftWidget extends LiveWidget {
    public C47121t6 LJLIL;
    public C47121t6 LJLILLLLZI;
    public C47061t0 LJLJI;
    public View LJLJJI;
    public HotWordGiftViewModel LJLJJL;
    public UXE LJLJJLL;
    public boolean LJLJL;
    public XKQ LJLJLJ;
    public final AqS179S0100000_13 LJLJLLL = new AqS179S0100000_13(this, 325);
    public final AObserverS81S0100000_13 LJLL = new AObserverS81S0100000_13(this, 47);
    public final UX7 LJLLI = UX7.LJLIL;
    public final AObserverS81S0100000_13 LJLLILLLL = new AObserverS81S0100000_13(this, 46);
    public final AqS179S0100000_13 LJLLJ = new AqS179S0100000_13(this, 323);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d6f;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZ() {
        if (this.LJLJJL != null) {
            XKQ xkq = this.LJLJLJ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            HotWordGiftViewModel hotWordGiftViewModel = this.LJLJJL;
            if (hotWordGiftViewModel != null) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(hotWordGiftViewModel), C78613UtF.LIZJ, null, new UXC(hotWordGiftViewModel, null), 2);
                return;
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        this.LJLJL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        super.hide();
        this.LJLJJL = (HotWordGiftViewModel) ViewModelProviders.of(this.widgetCallback.getFragment()).get(HotWordGiftViewModel.class);
        UXO uxo = new UXO();
        HotWordGiftViewModel hotWordGiftViewModel = this.LJLJJL;
        if (hotWordGiftViewModel != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            UXJ uxj = new UXJ(uxo);
            UXK uxk = new UXK();
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            C77353UXl c77353UXl = new C77353UXl(this, dataChannel2);
            hotWordGiftViewModel.LJLILLLLZI = uxo;
            hotWordGiftViewModel.LJLIL = uxj;
            hotWordGiftViewModel.LJLJI = uxk;
            hotWordGiftViewModel.LJLJJI = c77353UXl;
            hotWordGiftViewModel.LJLJJL = dataChannel;
            dataChannel.lv0(this, LiveGiftSuspensionEvent.class, new C53402Kxa(hotWordGiftViewModel));
            dataChannel.lv0(this, RechargeDialogDismissEvent.class, new U5X(hotWordGiftViewModel));
            dataChannel.lv0(this, InputDialogShowingChannel.class, new U5V(hotWordGiftViewModel));
            HotWordGiftViewModel hotWordGiftViewModel2 = this.LJLJJL;
            if (hotWordGiftViewModel2 != null) {
                hotWordGiftViewModel2.LJLLI.observe(this, this.LJLL);
                HotWordGiftViewModel hotWordGiftViewModel3 = this.LJLJJL;
                if (hotWordGiftViewModel3 != null) {
                    hotWordGiftViewModel3.LJLLLL.observe(this, this.LJLLI);
                    HotWordGiftViewModel hotWordGiftViewModel4 = this.LJLJJL;
                    if (hotWordGiftViewModel4 != null) {
                        hotWordGiftViewModel4.LJLLJ.observe(this, this.LJLLILLLL);
                        DataChannelGlobal.LJLJJI.ov0(CommentActionChannel.class, this, this.LJLLJ);
                        C15580jK.LIZIZ(C87277YNd.LJIIJJI(8), this.contentView);
                        View findViewById = this.contentView.findViewById(R.id.e83);
                        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.hot_word_gift_image)");
                        this.LJLJI = (C47061t0) findViewById;
                        View findViewById2 = this.contentView.findViewById(R.id.e84);
                        o.LJIIIIZZ(findViewById2, "contentView.findViewById…hot_word_gift_price_text)");
                        this.LJLILLLLZI = (C47121t6) findViewById2;
                        View findViewById3 = this.contentView.findViewById(R.id.e7q);
                        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.hot_word_gift_close)");
                        this.LJLJJI = findViewById3;
                        View findViewById4 = this.contentView.findViewById(R.id.e85);
                        o.LJIIIIZZ(findViewById4, "contentView.findViewById…d.hot_word_gift_send_btn)");
                        this.LJLIL = (C47121t6) findViewById4;
                        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this.LJLJLLL, 75), this.contentView);
                        View view = this.LJLJJI;
                        if (view != null) {
                            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this.LJLJLLL, 75), view);
                            C47121t6 c47121t6 = this.LJLIL;
                            if (c47121t6 != null) {
                                C29306Beo.LJJL(c47121t6, R.id.e85, 500L, this.LJLJLLL);
                                ExitLiveObserver exitLiveObserver = ExitLiveObserver.LJLIL;
                                View contentView = this.contentView;
                                o.LJIIIIZZ(contentView, "contentView");
                                ActivityC45651qj LIZ = C32663Crr.LIZ(contentView);
                                HotWordGiftViewModel hotWordGiftViewModel5 = this.LJLJJL;
                                if (hotWordGiftViewModel5 != null) {
                                    exitLiveObserver.getClass();
                                    if (LIZ != null) {
                                        T2R.LJIIL(LIZ, exitLiveObserver);
                                    }
                                    ExitLiveObserver.LJLILLLLZI = new WeakReference<>(hotWordGiftViewModel5);
                                    if (this.LJLJL) {
                                        this.LJLJL = false;
                                        LJZ();
                                        return;
                                    }
                                    HotWordGiftViewModel hotWordGiftViewModel6 = this.LJLJJL;
                                    if (hotWordGiftViewModel6 != null) {
                                        this.LJLJLJ = XKX.LIZLLL(ViewModelKt.getViewModelScope(hotWordGiftViewModel6), null, null, new C63142dq(this, null), 3);
                                        return;
                                    } else {
                                        o.LJIJI("viewModel");
                                        throw null;
                                    }
                                }
                                o.LJIJI("viewModel");
                                throw null;
                            }
                            o.LJIJI("sendButton");
                            throw null;
                        }
                        o.LJIJI("closeButton");
                        throw null;
                    }
                    o.LJIJI("viewModel");
                    throw null;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        ExitLiveObserver exitLiveObserver = ExitLiveObserver.LJLIL;
        View contentView = this.contentView;
        o.LJIIIIZZ(contentView, "contentView");
        ActivityC45651qj LIZ = C32663Crr.LIZ(contentView);
        exitLiveObserver.getClass();
        if (LIZ != null) {
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                Lifecycle lifecycle = LIZ.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.removeObserver(exitLiveObserver);
                }
            } else {
                XKX.LJ(C36636EZk.LIZ.LJJIJIL(), new C68152lv(LIZ, exitLiveObserver, null));
            }
        }
        WeakReference<HotWordGiftViewModel> weakReference = ExitLiveObserver.LJLILLLLZI;
        if (weakReference != null) {
            weakReference.clear();
        }
        ExitLiveObserver.LJLILLLLZI = null;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    public final void LJZI(UXE uxe) {
        int i;
        List<String> urls;
        UXD uxd = uxe.LIZJ;
        if (uxd == null) {
            return;
        }
        super.show();
        C47121t6 c47121t6 = this.LJLIL;
        if (c47121t6 != null) {
            CharSequence text = c47121t6.getText();
            if (text != null && text.length() >= 15) {
                i = R.style.a4j;
            } else {
                i = R.style.a4g;
            }
            C47121t6 c47121t62 = this.LJLIL;
            if (c47121t62 != null) {
                c47121t62.LJJIJIL(i);
                C47121t6 c47121t63 = this.LJLILLLLZI;
                if (c47121t63 != null) {
                    c47121t63.setText(String.valueOf(uxd.LIZ.diamondCount));
                    ImageModel imageModel = uxd.LIZ.icon;
                    if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                        C78720Uuy LIZ = C15650jR.LIZ().LIZ(urls);
                        LIZ.LJIIIIZZ = R.drawable.d1o;
                        C47061t0 c47061t0 = this.LJLJI;
                        if (c47061t0 != null) {
                            LIZ.LJIIJJI(c47061t0);
                        } else {
                            o.LJIJI("giftIcon");
                            throw null;
                        }
                    }
                    View contentView = this.contentView;
                    o.LJIIIIZZ(contentView, "contentView");
                    UEB.LIZ(contentView, new AqS179S0100000_13(this, 324));
                    return;
                }
                o.LJIJI("priceText");
                throw null;
            }
            o.LJIJI("sendButton");
            throw null;
        }
        o.LJIJI("sendButton");
        throw null;
    }
}

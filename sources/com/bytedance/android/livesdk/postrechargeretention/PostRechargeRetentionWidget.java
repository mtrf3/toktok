package com.bytedance.android.livesdk.postrechargeretention;

import X.ASL;
import X.C16880lQ;
import X.C29306Beo;
import X.C32812CuG;
import X.C47071t1;
import X.C73933Szx;
import X.C73943T0h;
import X.C77446UaQ;
import X.CN1;
import X.InterfaceC29856Bng;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS76S0100000_8;
import Y.AfS57S0100000_5;
import Y.AfS58S0100000_6;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PostRechargeRetentionWidget extends LiveWidget {
    public TuxSheet LJLIL;
    public LiveDialog LJLILLLLZI;
    public View LJLJI;
    public ImageView LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public PostRechargeRetentionViewModel LJLJLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d5z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        TuxSheet tuxSheet;
        PostRechargeRetentionViewModel postRechargeRetentionViewModel = this.LJLJLJ;
        if (postRechargeRetentionViewModel != null) {
            if (postRechargeRetentionViewModel.LJLILLLLZI == 1 && (tuxSheet = this.LJLIL) != null && tuxSheet.isAdded()) {
                TuxSheet tuxSheet2 = this.LJLIL;
                if (tuxSheet2 != null) {
                    tuxSheet2.dismiss();
                }
                super.hide();
                return;
            }
            PostRechargeRetentionViewModel postRechargeRetentionViewModel2 = this.LJLJLJ;
            if (postRechargeRetentionViewModel2 != null) {
                if (postRechargeRetentionViewModel2.LJLILLLLZI != 2) {
                    return;
                }
                C29306Beo.LJJJJ(this.LJLILLLLZI);
                super.hide();
                return;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r10 == null) goto L61;
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.postrechargeretention.PostRechargeRetentionWidget.show():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        super.hide();
        PostRechargeRetentionViewModel postRechargeRetentionViewModel = (PostRechargeRetentionViewModel) ViewModelProviders.of(this.widgetCallback.getFragment()).get(PostRechargeRetentionViewModel.class);
        this.LJLJLJ = postRechargeRetentionViewModel;
        if (postRechargeRetentionViewModel != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            postRechargeRetentionViewModel.LJLIL = dataChannel;
            C73943T0h.LIZ().LIZJ(this, C77446UaQ.class).LIZIZ(new AfS57S0100000_5(postRechargeRetentionViewModel, 211));
            dataChannel.lv0(this, GiftDialogDismissEvent.class, new C32812CuG(postRechargeRetentionViewModel));
            postRechargeRetentionViewModel.LJLL = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
            ((InterfaceC29856Bng) ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJI().LIZJ(C73933Szx.LJ(this))).LIZIZ(new AfS58S0100000_6(postRechargeRetentionViewModel, 35));
            PostRechargeRetentionViewModel postRechargeRetentionViewModel2 = this.LJLJLJ;
            if (postRechargeRetentionViewModel2 != null) {
                postRechargeRetentionViewModel2.LJZL.observe(this, new AObserverS76S0100000_8(this, 7));
                PostRechargeRetentionViewModel postRechargeRetentionViewModel3 = this.LJLJLJ;
                if (postRechargeRetentionViewModel3 != null) {
                    if (postRechargeRetentionViewModel3.LJLILLLLZI == 1) {
                        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.context), R.layout.d61, this.containerView, false);
                        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …et, containerView, false)");
                        this.LJLJI = LLLLIILL;
                        this.LJLJL = (TextView) LLLLIILL.findViewById(R.id.c84);
                        View view = this.LJLJI;
                        if (view != null) {
                            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 228), view.findViewById(R.id.c00));
                            View view2 = this.LJLJI;
                            if (view2 != null) {
                                C16880lQ.LJIJI((TextView) view2.findViewById(R.id.gmf), new ACListenerS25S0100000_5(this, 229));
                            } else {
                                o.LJIJI("container");
                                throw null;
                            }
                        } else {
                            o.LJIJI("container");
                            throw null;
                        }
                    } else {
                        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.context), R.layout.d60, this.containerView, false);
                        o.LJIIIIZZ(LLLLIILL2, "from(context)\n          …up, containerView, false)");
                        this.LJLJI = LLLLIILL2;
                        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 230), LLLLIILL2.findViewById(R.id.b3s));
                    }
                    View view3 = this.LJLJI;
                    if (view3 != null) {
                        View findViewById = view3.findViewById(R.id.dt6);
                        o.LJIIIIZZ(findViewById, "container.findViewById(R.id.gift_icon)");
                        this.LJLJJI = (ImageView) findViewById;
                        View view4 = this.LJLJI;
                        if (view4 != null) {
                            View findViewById2 = view4.findViewById(R.id.title);
                            o.LJIIIIZZ(findViewById2, "container.findViewById(R.id.title)");
                            this.LJLJJL = (TextView) findViewById2;
                            View view5 = this.LJLJI;
                            if (view5 != null) {
                                View findViewById3 = view5.findViewById(R.id.jo5);
                                o.LJIIIIZZ(findViewById3, "container.findViewById(R.id.send_button_text)");
                                this.LJLJJLL = (TextView) findViewById3;
                                View view6 = this.LJLJI;
                                if (view6 != null) {
                                    C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 231), view6.findViewById(R.id.jo2));
                                    PostRechargeRetentionViewModel postRechargeRetentionViewModel4 = this.LJLJLJ;
                                    if (postRechargeRetentionViewModel4 != null) {
                                        if (postRechargeRetentionViewModel4.LJLILLLLZI == 1) {
                                            ASL asl = new ASL();
                                            View view7 = this.LJLJI;
                                            if (view7 != null) {
                                                asl.LIZ(view7);
                                                TuxSheet tuxSheet = asl.LIZ;
                                                tuxSheet.LJLLJ = false;
                                                tuxSheet.LL = false;
                                                tuxSheet.LJLJI = false;
                                                this.LJLIL = tuxSheet;
                                                return;
                                            }
                                            o.LJIJI("container");
                                            throw null;
                                        }
                                        C47071t1 c47071t1 = new C47071t1(this.context);
                                        View view8 = this.LJLJI;
                                        if (view8 != null) {
                                            c47071t1.LJI(view8);
                                            c47071t1.LJIILL = false;
                                            c47071t1.LJIILJJIL = false;
                                            this.LJLILLLLZI = c47071t1.LIZ();
                                            return;
                                        }
                                        o.LJIJI("container");
                                        throw null;
                                    }
                                    o.LJIJI("viewModel");
                                    throw null;
                                }
                                o.LJIJI("container");
                                throw null;
                            }
                            o.LJIJI("container");
                            throw null;
                        }
                        o.LJIJI("container");
                        throw null;
                    }
                    o.LJIJI("container");
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
}

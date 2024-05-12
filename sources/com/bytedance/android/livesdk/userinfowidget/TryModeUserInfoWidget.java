package com.bytedance.android.livesdk.userinfowidget;

import X.B83;
import X.BCW;
import X.BZI;
import X.C018905p;
import X.C05170If;
import X.C15380j0;
import X.C15650jR;
import X.C15700jW;
import X.C16880lQ;
import X.C28787BRn;
import X.C31597Caf;
import X.C47121t6;
import X.C62643OiF;
import X.C78540Us4;
import X.C78720Uuy;
import X.CCJ;
import X.CN1;
import X.CY3;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.KL2;
import Y.ACListenerS25S0100000_5;
import Y.IDLListenerS193S0100000_5;
import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.LiveProfileLikeClickStartEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomOwnerMuteEvent;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TryModeUserInfoWidget extends LiveWidget implements InterfaceC29986Bpm {
    public ViewGroup LJLIL;
    public C31597Caf LJLILLLLZI;
    public View LJLJI;
    public C47121t6 LJLJJI;
    public View LJLJJL;
    public CY3 LJLJJLL;
    public final boolean LJLJL = LiveLikeOptSetting.INSTANCE.isOtherTextViewWidthOpt();
    public View LJLJLJ;
    public long LJLJLLL;
    public final User LJLL;
    public long LJLLI;

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "TryModeUserInfoWidget";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.del;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
    }

    public TryModeUserInfoWidget() {
        User LJ = B83.LIZ().LIZIZ().LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        this.LJLL = LJ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        CY3 cy3;
        C018905p c018905p;
        super.onCreate();
        this.LJLIL = (ViewGroup) findViewById(R.id.a2c);
        this.LJLILLLLZI = (C31597Caf) findViewById(R.id.e35);
        this.LJLJI = findViewById(R.id.gw3);
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS25S0100000_5(this, 252));
        }
        this.LJLJJI = (C47121t6) findViewById(R.id.mzt);
        findViewById(R.id.a_u);
        this.LJLJJL = findViewById(R.id.h3a);
        this.LJLJJLL = (CY3) findViewById(R.id.fr4);
        View view = this.LJLJI;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view instanceof ConstraintLayout) {
            if (view != null) {
                layoutParams2 = view.getLayoutParams();
            }
            if ((layoutParams2 instanceof C018905p) && (c018905p = (C018905p) layoutParams2) != null) {
                c018905p.matchConstraintMaxWidth = C15380j0.LIZ(92.72727f);
            }
        }
        if (this.LJLJL) {
            CY3 cy32 = this.LJLJJLL;
            if (cy32 != null) {
                List<String> gj0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).gj0();
                o.LJIIIIZZ(gj0, "getService(IBarrageServi…class.java).allFormatUnit");
                cy32.LJJIZ(gj0);
            }
            View view2 = this.LJLJI;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && (layoutParams instanceof C018905p) && (cy3 = this.LJLJJLL) != null) {
                cy3.setTextMeasureMaxWidth(((C018905p) layoutParams).matchConstraintMaxWidth);
            }
        } else {
            CY3 cy33 = this.LJLJJLL;
            if (cy33 != null) {
                cy33.setEnableMeasureOpt(false);
            }
        }
        this.LJLLI = 0L;
        Boolean bool = (Boolean) this.dataChannel.kv0(BCW.class);
        if (bool != null) {
            bool.booleanValue();
        }
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setMaxWidth(C15380j0.LIZ(131.0f));
        }
        if (KL2.LJIILJJIL(this.LJLJJL)) {
            this.LJLJLJ = this.LJLJJL;
        }
        this.LJLJLLL = 0L;
        if (isViewValid()) {
            C31597Caf c31597Caf = this.LJLILLLLZI;
            if (c31597Caf != null) {
                ImageModel avatarThumb = this.LJLL.getAvatarThumb();
                o.LJIIIIZZ(avatarThumb, "targetUser.avatarThumb");
                C62643OiF c62643OiF = new C62643OiF();
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    ArrayList arrayList = new ArrayList();
                    if (avatarThumb.getUrls() != null) {
                        arrayList.addAll(avatarThumb.getUrls());
                    }
                    C78720Uuy LJIIIIZZ = C15650jR.LIZ().LJIIIIZZ("live_head", arrayList);
                    LJIIIIZZ.LJIIL = Boolean.TRUE;
                    LJIIIIZZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
                    LJIIIIZZ.LJ = 0;
                    LJIIIIZZ.LJFF = 0;
                    LJIIIIZZ.LJIIIIZZ = R.drawable.cul;
                    LJIIIIZZ.LJIIJJI = c62643OiF;
                    LJIIIIZZ.LJIIJJI(c31597Caf);
                } else {
                    C15700jW.LIZ(0, 0, R.drawable.cul, c31597Caf, avatarThumb, c62643OiF, false);
                }
            }
            C47121t6 c47121t62 = this.LJLJJI;
            if (c47121t62 != null) {
                c47121t62.setText(C05170If.LIZ(this.LJLL));
            }
            C47121t6 c47121t63 = this.LJLJJI;
            if (c47121t63 != null) {
                c47121t63.requestLayout();
            }
            String LJIIIIZZ2 = C15380j0.LJIIIIZZ(R.plurals.mu, (int) this.LJLJLLL, BidiFormatter.getInstance(CCJ.LIZ(this.context)).unicodeWrap(((IBarrageService) CN1.LIZ(IBarrageService.class)).j90(this.LJLJLLL)));
            CY3 cy34 = this.LJLJJLL;
            if (cy34 != null) {
                cy34.setText(LJIIIIZZ2);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, LiveProfileLikeClickStartEvent.class, new AqS171S0100000_5(this, 498));
        dataChannel.lv0(this, MuteMicChannel.class, new AqS171S0100000_5(this, 499));
        dataChannel.lv0(this, RoomOwnerMuteEvent.class, new AqS171S0100000_5(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(0L);
        if (hq0 != null) {
            hq0.LIZ(this.LJLILLLLZI);
            hq0.LJ(this);
        }
        View view3 = getView();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS193S0100000_5(this, 4));
        }
    }

    public final void LJLZ(long j) {
        this.LJLJLLL = j;
        String LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.mu, (int) this.LJLJLLL, BidiFormatter.getInstance(CCJ.LIZ(this.context)).unicodeWrap(((IBarrageService) CN1.LIZ(IBarrageService.class)).j90(this.LJLJLLL)));
        CY3 cy3 = this.LJLJJLL;
        if (cy3 != null) {
            cy3.setText(LJIIIIZZ);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_trymode_like");
        LIZ.LJIJJ(C78540Us4.LJIIZILJ(), "is_new_anchor");
        LIZ.LJIJJ(Long.valueOf(j), "like_amount");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        LJLZ(this.LJLJLLL + 1);
    }
}

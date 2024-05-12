package com.bytedance.android.livesdk.broadcast.preview.widget.replay;

import X.B83;
import X.BZI;
import X.C00F;
import X.C0K2;
import X.C0NA;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C28503BGp;
import X.C28787BRn;
import X.C28929BWz;
import X.C30554Byw;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.InterfaceC30442Bx8;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.IDCSpanS31S0100000_5;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.PreviewMoreYData;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayAvailableDaysSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.preview.LivePreviewMoreSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveIsReplayBannerFluencyDownNumber;
import com.bytedance.android.livesdk.livesetting.game.LiveIsReplayBannerShowTenTimesRegionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class PreviewReplayWidget extends BannerWidget {
    public final C62822Ol8 LJLJLLL;
    public final String LJLL;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C0NA.LIZJ(C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        if (this.LJLJL) {
            C0K2.LJII(0, "ttlive_live_replay_faq_show_all", new HashMap());
            BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_replay_banner_show");
            LIZ.LJIJ(this.LJLJJI);
            LIZ.LJFF((String) this.LJLJLLL.getValue());
            LIZ.LJJIIJZLJL();
        }
    }

    public final boolean LLFZ() {
        if (LiveIsReplayBannerShowTenTimesRegionSetting.INSTANCE.getValue() || LLFFF()) {
            return true;
        }
        return false;
    }

    public PreviewReplayWidget() {
        int i;
        if (LLFFF()) {
            i = Integer.MAX_VALUE;
        } else if (LiveIsReplayBannerShowTenTimesRegionSetting.INSTANCE.getValue()) {
            i = LiveIsReplayBannerFluencyDownNumber.INSTANCE.getValue();
        } else {
            i = 1;
        }
        this.LJLJJL = i;
        this.LJLJLLL = C221108m2.LIZIZ(C28929BWz.LJLIL);
        this.LJLL = "replay_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        String LJIILL;
        TextView textView;
        ImageView imageView;
        super.LJZL();
        View view = getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.h63)) != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS25S0100000_5(this, 111));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C15380j0.LJIILJJIL(R.string.m8n));
        LIZ.append(" >");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String guideContent = C15380j0.LJIILJJIL(R.string.o1u);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l0x);
        String str = "";
        if (LJIILJJIL == null) {
            LJIILJJIL = "";
        }
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.l0y);
        if (LJIILJJIL2 == null) {
            LJIILJJIL2 = "";
        }
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.l0z);
        if (LJIILJJIL3 != null) {
            str = LJIILJJIL3;
        }
        int value = LiveReplayAvailableDaysSetting.INSTANCE.getValue();
        if (LLFZ()) {
            LJIILL = C15380j0.LJIILL(R.string.nxf, LJIILJJIL, LJIILJJIL2, Integer.valueOf(value), str);
        } else {
            LJIILL = C15380j0.LJIILL(R.string.nxg, Integer.valueOf(value), guideContent);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C00F.LIZIZ(LJIILL, ' ', LIZIZ));
        spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(this, 0), LJIILL.length() + 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), LJIILL.length(), spannableStringBuilder.length(), 33);
        if (!LLFZ()) {
            o.LJIIIIZZ(guideContent, "guideContent");
            int LJJLIIIJL = s.LJJLIIIJL(LJIILL, guideContent, 0, false, 6);
            if (LJJLIIIJL == -1) {
                return;
            } else {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), LJJLIIIJL, guideContent.length() + LJJLIIIJL, 33);
            }
        } else {
            for (String str2 : C47261Igj.LJJIJIIJI(LJIILJJIL, LJIILJJIL2, str)) {
                Integer valueOf = Integer.valueOf(s.LJJLIIIJL(LJIILL, str2, 0, false, 6));
                if (valueOf.intValue() > 0) {
                    int intValue = valueOf.intValue();
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), intValue, str2.length() + intValue, 17);
                }
            }
        }
        View view2 = getView();
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.h67)) != null) {
            textView.setText(spannableStringBuilder);
            textView.setLinksClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (LivePreviewMoreSetting.INSTANCE.useMoreBtn()) {
            this.dataChannel.ov0(this, PreviewMoreYData.class, new AqS171S0100000_5(this, 796));
        }
    }

    public final boolean LLFFF() {
        if (B83.LIZ().LIZIZ().getCurrentUser().getSecret() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C28503BGp.LIZ()) {
            return R.layout.d4s;
        }
        return R.layout.d4r;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        if (this.LJLJLJ == LiveMode.VIDEO) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJI);
            LIZ.append(this.LJLL);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C30554Byw<String> c30554Byw = InterfaceC30442Bx8.S0;
            String LIZIZ2 = c30554Byw.LIZIZ(LIZIZ);
            if (LIZIZ2 == null) {
                LIZIZ2 = CardStruct.IStatusCode.DEFAULT;
            }
            c30554Byw.LIZLLL(String.valueOf(CastIntegerProtector.parseInt(LIZIZ2) + 1), LIZIZ);
        }
        C0NA.LIZIZ(C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class));
        if (!this.LJLJL) {
            C0K2.LJII(0, "ttlive_live_replay_faq_show_all", new HashMap());
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_takepage_replay_banner_show");
            LIZ2.LJIJ(this.LJLJJI);
            LIZ2.LJFF((String) this.LJLJLLL.getValue());
            LIZ2.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (LLFFF()) {
            C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.P0;
            String str = LiveMode.SCREEN_RECORD.logStreamingType;
            o.LJIIIIZZ(str, "SCREEN_RECORD.logStreamingType");
            Boolean LIZIZ = c30554Byw.LIZIZ(str);
            if (LIZIZ == null || LIZIZ.booleanValue()) {
                String str2 = LiveMode.VIDEO.logStreamingType;
                o.LJIIIIZZ(str2, "VIDEO.logStreamingType");
                Boolean LIZIZ2 = c30554Byw.LIZIZ(str2);
                if (LIZIZ2 == null || LIZIZ2.booleanValue()) {
                    String str3 = LiveMode.THIRD_PARTY.logStreamingType;
                    o.LJIIIIZZ(str3, "THIRD_PARTY.logStreamingType");
                    Boolean LIZIZ3 = c30554Byw.LIZIZ(str3);
                    if (LIZIZ3 != null && !LIZIZ3.booleanValue()) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C30554Byw<Boolean> c30554Byw2 = InterfaceC30442Bx8.O0;
            String str4 = LiveMode.SCREEN_RECORD.logStreamingType;
            o.LJIIIIZZ(str4, "SCREEN_RECORD.logStreamingType");
            Boolean LIZIZ4 = c30554Byw2.LIZIZ(str4);
            if (LIZIZ4 != null && !LIZIZ4.booleanValue()) {
                return;
            }
            String str5 = LiveMode.VIDEO.logStreamingType;
            o.LJIIIIZZ(str5, "VIDEO.logStreamingType");
            Boolean LIZIZ5 = c30554Byw2.LIZIZ(str5);
            if (LIZIZ5 != null && !LIZIZ5.booleanValue()) {
                return;
            }
            String str6 = LiveMode.THIRD_PARTY.logStreamingType;
            o.LJIIIIZZ(str6, "THIRD_PARTY.logStreamingType");
            Boolean LIZIZ6 = c30554Byw2.LIZIZ(str6);
            if (LIZIZ6 != null && !LIZIZ6.booleanValue()) {
                return;
            }
        }
        C30554Byw<String> c30554Byw3 = InterfaceC30442Bx8.S0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LiveMode.THIRD_PARTY.logStreamingType);
        LIZ.append(this.LJLL);
        String LIZIZ7 = c30554Byw3.LIZIZ(X1D.LIZIZ(LIZ));
        String str7 = CardStruct.IStatusCode.DEFAULT;
        if (LIZIZ7 == null) {
            LIZIZ7 = CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LiveMode.SCREEN_RECORD.logStreamingType);
        LIZ2.append(this.LJLL);
        String LIZIZ8 = c30554Byw3.LIZIZ(X1D.LIZIZ(LIZ2));
        if (LIZIZ8 == null) {
            LIZIZ8 = CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LiveMode.VIDEO.logStreamingType);
        LIZ3.append(this.LJLL);
        String LIZIZ9 = c30554Byw3.LIZIZ(X1D.LIZIZ(LIZ3));
        if (LIZIZ9 != null) {
            str7 = LIZIZ9;
        }
        if (this.LJLJJL <= CastIntegerProtector.parseInt(str7) + CastIntegerProtector.parseInt(LIZIZ8) + CastIntegerProtector.parseInt(LIZIZ7)) {
            return;
        }
        super.show();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLL;
    }

    public final void LLFII(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_replay_banner_click");
        LIZ.LJIJ(this.LJLJJI);
        LIZ.LJFF((String) this.LJLJLLL.getValue());
        LIZ.LJIJJ(str, "click_position");
        LIZ.LJJIIJZLJL();
    }
}

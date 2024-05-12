package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GuidePageResource;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS37S0210000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDY implements UDZ {
    public final TextView LIZ;
    public final TextView LIZIZ;
    public final C2A4 LIZJ;
    public final FrameLayout LIZLLL;
    public final C47121t6 LJ;
    public final LiveIconView LJFF;
    public final LinearLayout LJI;
    public final ConstraintLayout LJII;
    public final String LJIIIIZZ;

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        TextView textView = this.LIZ;
        int i = 0;
        if (textView == null) {
            hashCode = 0;
        } else {
            hashCode = textView.hashCode();
        }
        int i2 = hashCode * 31;
        TextView textView2 = this.LIZIZ;
        if (textView2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = textView2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C2A4 c2a4 = this.LIZJ;
        if (c2a4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2a4.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout != null) {
            i = frameLayout.hashCode();
        }
        return this.LJIIIIZZ.hashCode() + ((this.LJII.hashCode() + ((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((i4 + i) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftGuideEducationViewComponent(tvTitle=");
        LIZ.append(this.LIZ);
        LIZ.append(", descriptionTv=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageView=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bubbleContainer=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", sendButtonRight=");
        LIZ.append(this.LJ);
        LIZ.append(", crossClose=");
        LIZ.append(this.LJFF);
        LIZ.append(", sendButtonComb=");
        LIZ.append(this.LJI);
        LIZ.append(", whiteArea=");
        LIZ.append(this.LJII);
        LIZ.append(", guideType=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    @Override // X.UDZ
    public final ConstraintLayout LIZ() {
        return this.LJII;
    }

    @Override // X.UDZ
    public final void LIZIZ() {
        C76823UDb.LIZ(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UDY)) {
            return false;
        }
        UDY udy = (UDY) obj;
        if (o.LJ(this.LIZ, udy.LIZ) && o.LJ(this.LIZIZ, udy.LIZIZ) && o.LJ(this.LIZJ, udy.LIZJ) && o.LJ(this.LIZLLL, udy.LIZLLL) && o.LJ(this.LJ, udy.LJ) && o.LJ(this.LJFF, udy.LJFF) && o.LJ(this.LJI, udy.LJI) && o.LJ(this.LJII, udy.LJII) && o.LJ(this.LJIIIIZZ, udy.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    @Override // X.UDZ
    public final void LIZJ(Context context, DataChannel dataChannel, GiftGuideMessage giftGuideMessage, LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2, int i, AqS136S0200000_5 aqS136S0200000_5, AqS37S0210000_5 aqS37S0210000_5, boolean z) {
        long j;
        ViewGroup viewGroup;
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        try {
            String str = ((Text) ListProtector.get(((GuidePageResource) ORZ.LJLLJ(giftGuideMessage.guidePageResources)).texts, 1)).key;
            if (str == null || str.length() == 0) {
                TextView textView = this.LIZIZ;
                if (textView != null) {
                    textView.setText(C15380j0.LJIILJJIL(R.string.lkj));
                }
            } else {
                TextView textView2 = this.LIZIZ;
                if (textView2 != null) {
                    textView2.setText(C86881Y7x.LIZIZ().LIZ(((Text) ListProtector.get(((GuidePageResource) ORZ.LJLLJ(giftGuideMessage.guidePageResources)).texts, 1)).key));
                }
            }
        } catch (Exception unused) {
            TextView textView3 = this.LIZIZ;
            if (textView3 != null) {
                textView3.setText(C15380j0.LJIILJJIL(R.string.lkj));
            }
        }
        TextView textView4 = this.LIZIZ;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        this.LJ.setText(C15380j0.LJIILJJIL(R.string.lkm));
        C16880lQ.LJIIZILJ(this.LJI, new ViewOnClickListenerC76829UDh(aqS136S0200000_5, aqS37S0210000_5, j, context, giftGuideMessage));
        ViewParent parent = this.LJII.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS33S0100000_13(aqS136S0200000_5, 164));
        }
        C16880lQ.LJJII(this.LJFF, new ACListenerS33S0100000_13(aqS136S0200000_5, 165));
        C2A4 c2a4 = this.LIZJ;
        if (c2a4 != null) {
            try {
                List<String> urls = ((ImageModel) ORZ.LJLLJ(((GuidePageResource) ORZ.LJLLJ(giftGuideMessage.guidePageResources)).animations)).getUrls();
                o.LJIIIIZZ(urls, "this.animations.first().urls");
                Object LJLLJ = ORZ.LJLLJ(urls);
                o.LJIIIIZZ(LJLLJ, "this.animations.first().urls.first()");
                c2a4.LLIIJI = (String) LJLLJ;
            } catch (Exception unused2) {
                C15490jB.LJ(c2a4, "tiktok_live_revenue_demand_2", "ttlive_education_panel_entry_banner.png");
            }
            c2a4.LJII();
            c2a4.LLIIJLIL = new UDW(this, giftGuideMessage);
        }
    }

    public UDY(TextView textView, TextView textView2, C2A4 c2a4, FrameLayout frameLayout, C47121t6 c47121t6, LiveIconView liveIconView, LinearLayout linearLayout, ConstraintLayout constraintLayout, String str) {
        this.LIZ = textView;
        this.LIZIZ = textView2;
        this.LIZJ = c2a4;
        this.LIZLLL = frameLayout;
        this.LJ = c47121t6;
        this.LJFF = liveIconView;
        this.LJI = linearLayout;
        this.LJII = constraintLayout;
        this.LJIIIIZZ = str;
    }
}

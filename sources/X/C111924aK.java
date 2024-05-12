package X;

import Y.ACListenerS36S0200000_1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LinkCard;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageTitle;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NamedValue;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContentKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Title;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4aK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111924aK extends AnonymousClass460<SystemCardContent> {
    public final View LLIIIL;
    public final C62822Ol8 LLIIIZ;

    @Override // X.AnonymousClass460
    public final float n0() {
        return 0.65f;
    }

    @Override // X.AnonymousClass460
    public final void o0() {
        int m0 = m0();
        if (m0 > 0) {
            int i = (C53946LFe.LIZJ(this.itemView.getContext(), null).LIZIZ - m0) / 2;
            View findViewById = this.LLIIIL.findViewById(R.id.b68);
            o.LJIIIIZZ(findViewById, "rootView.card_view");
            C26338AVi.LJI(findViewById, Integer.valueOf(i), null, Integer.valueOf(i), null, false, 26);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111924aK(View rootView, EnumC110124Tw type) {
        super(rootView, type);
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(type, "type");
        this.LLIIIL = rootView;
        this.LLIIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 811));
    }

    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, SystemCardContent systemCardContent, int i) {
        UrlModel urlModel;
        String str;
        String str2;
        List<NamedValue> infos;
        MessageTitle title;
        MessageTitle title2;
        MessageTitle title3;
        SystemCardContent systemCardContent2 = systemCardContent;
        o.LJIIIZ(msg, "msg");
        if (systemCardContent2 != null) {
            W5G w5g = (W5G) this.LLIIIL.findViewById(R.id.ef_);
            Title title4 = systemCardContent2.getTitle();
            Integer num = null;
            if (title4 != null) {
                urlModel = title4.getIcon();
            } else {
                urlModel = null;
            }
            C4AS.LJII(w5g, urlModel, "SystemCardViewHolder", null, null, 0, 0, 504);
            TextView textView = (TextView) this.LLIIIL.findViewById(R.id.eff);
            Title title5 = systemCardContent2.getTitle();
            if (title5 != null) {
                str = title5.getTitle();
            } else {
                str = null;
            }
            textView.setText(str);
            TuxTextView tuxTextView = (TuxTextView) this.LLIIIL.findViewById(R.id.efe);
            TextInfo textInfo = systemCardContent2.getTextInfo();
            if (textInfo != null && (title3 = textInfo.getTitle()) != null) {
                str2 = title3.getTitle();
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
            TextInfo textInfo2 = systemCardContent2.getTextInfo();
            if (textInfo2 != null && (title2 = textInfo2.getTitle()) != null) {
                num = Integer.valueOf(title2.getColorType());
            }
            tuxTextView.setTextColor(SystemCardContentKt.colorTypeToColor(num));
            TextInfo textInfo3 = systemCardContent2.getTextInfo();
            if (textInfo3 != null && (title = textInfo3.getTitle()) != null && title.getBold()) {
                tuxTextView.setTuxFont(43);
            }
            VideoInfo videoInfo = systemCardContent2.getVideoInfo();
            if (videoInfo == null) {
                this.LLIIIL.findViewById(R.id.efh).setVisibility(8);
            } else {
                this.LLIIIL.findViewById(R.id.efh).setVisibility(0);
                C62846OlW c62846OlW = (C62846OlW) this.LLIIIL.findViewById(R.id.efi);
                o.LJIIIIZZ(c62846OlW, "rootView.im_msg_card_video_cover");
                C1048849s.LIZ(c62846OlW, videoInfo.getCover(), "SystemCardViewHolder:videoInfo", (Drawable) this.LLIIIZ.getValue());
                C16880lQ.LJIJ((RelativeLayout) this.LLIIIL.findViewById(R.id.efh), new ACListenerS36S0200000_1(this, videoInfo, 29));
            }
            ((ViewGroup) this.LLIIIL.findViewById(R.id.efa)).removeAllViews();
            TextInfo textInfo4 = systemCardContent2.getTextInfo();
            if (textInfo4 != null && (infos = textInfo4.getInfos()) != null) {
                for (NamedValue namedValue : infos) {
                    LinearLayout linearLayout = (LinearLayout) this.LLIIIL.findViewById(R.id.efa);
                    o.LJIIIIZZ(linearLayout, "rootView.im_msg_card_info_container");
                    C43132GwK.LIZ(namedValue, linearLayout);
                }
            }
            ((ViewGroup) this.LLIIIL.findViewById(R.id.ef7)).removeAllViews();
            List<LinkCard> linkCards = systemCardContent2.getLinkCards();
            if (linkCards != null) {
                for (LinkCard card : linkCards) {
                    ViewGroup viewGroup = (ViewGroup) this.LLIIIL.findViewById(R.id.ef7);
                    o.LJIIIIZZ(viewGroup, "rootView.im_msg_card_action_container");
                    o.LJIIIZ(card, "card");
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.b7r, viewGroup, false);
                    ((TextView) LLLLIILL.findViewById(R.id.efd)).setText(card.getName());
                    ((TextView) LLLLIILL.findViewById(R.id.efb)).setText(card.getDesc());
                    C16880lQ.LJIIJ(new ACListenerS36S0200000_1(LLLLIILL, card, 96), LLLLIILL);
                    viewGroup.addView(LLLLIILL);
                }
            }
        }
    }
}

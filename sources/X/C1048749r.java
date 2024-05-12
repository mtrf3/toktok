package X;

import Y.ACListenerS27S0300000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.49r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1048749r extends AnonymousClass461<ImageCardTemplate> {
    public final C113084cC LLIIIJ;
    public final TuxIconView LLIIIL;
    public final SmartImageView LLIIIZ;
    public final TuxTextView LLIIJI;
    public final TuxTextView LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final Drawable LLIILII;

    @Override // X.AbstractC1041546x
    public final void M() {
        float dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.tu);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(((C1048949t) this.LLIIL.getValue()).LIZIZ);
        if (C1049149v.LIZ()) {
            C17N.LJJJJZ(this.LLIIIZ, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize}, Integer.valueOf(((C1048949t) this.LLIIL.getValue()).LIZ));
            c110614Vt.LJIIIIZZ = Float.valueOf(dimensionPixelSize);
            c110614Vt.LJIIJ = Float.valueOf(dimensionPixelSize);
        } else {
            C17N.LJJJJZ(this.LLIIIZ, new float[]{0.0f, dimensionPixelSize, dimensionPixelSize, 0.0f}, Integer.valueOf(((C1048949t) this.LLIIL.getValue()).LIZ));
            c110614Vt.LJIIIZ = Float.valueOf(dimensionPixelSize);
            c110614Vt.LJIIJJI = Float.valueOf(dimensionPixelSize);
        }
        this.LLIIIL.setBackground(C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048749r(View itemView, EnumC110124Tw itemType) {
        super(itemView, itemType);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(itemType, "itemType");
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 987));
        this.LLIIL = LIZIZ;
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIJ = (C113084cC) findViewById;
        View findViewById2 = itemView.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.title_tv)");
        this.LLIIJI = (TuxTextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.c7z);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.desc_tv)");
        this.LLIIJLIL = (TuxTextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.ecv);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.icon_tux)");
        TuxIconView tuxIconView = (TuxIconView) findViewById4;
        this.LLIIIL = tuxIconView;
        View findViewById5 = itemView.findViewById(R.id.ebu);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.icon_iv)");
        SmartImageView smartImageView = (SmartImageView) findViewById5;
        this.LLIIIZ = smartImageView;
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        tuxIconView.setTintColorRes(R.attr.go);
        float dimensionPixelSize = tuxIconView.getContext().getResources().getDimensionPixelSize(R.dimen.tu);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(((C1048949t) LIZIZ.getValue()).LIZIZ);
        if (C1049149v.LIZ()) {
            c110614Vt.LJIIIIZZ = Float.valueOf(dimensionPixelSize);
            c110614Vt.LJIIJ = Float.valueOf(dimensionPixelSize);
        } else {
            c110614Vt.LJIIIZ = Float.valueOf(dimensionPixelSize);
            c110614Vt.LJIIJJI = Float.valueOf(dimensionPixelSize);
        }
        Context context = tuxIconView.getContext();
        o.LJIIIIZZ(context, "tuxIconView.context");
        tuxIconView.setBackground(c110614Vt.LIZ(context));
        smartImageView.setVisibility(8);
        tuxIconView.setVisibility(0);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 101);
        }
        this.LLIILII = ((C1048949t) LIZIZ.getValue()).LIZJ;
    }

    public final void n0(String str, List<String> list) {
        boolean z;
        int hashCode;
        int LIZIZ = C107304Ja.LIZIZ(str, false);
        if (str == null || str.length() == 0 || ((hashCode = str.hashCode()) == -1533934094 ? !str.equals("now_bonus_invite") : !(hashCode == -439827310 ? str.equals("now_invite") : hashCode == 1662319721 && str.equals("now_post")))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            V92 hierarchy = this.LLIIIZ.getHierarchy();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = LIZIZ;
            Context context = this.LLIIIZ.getContext();
            o.LJIIIIZZ(context, "remoteIconView.context");
            hierarchy.LJIILL(c2068389v.LIZ(context), 1);
            this.LLIIIZ.setVisibility(0);
            this.LLIIIL.setVisibility(8);
        } else if (LIZIZ != -1) {
            this.LLIIIL.setIconRes(LIZIZ);
        }
        if (list.isEmpty()) {
            return;
        }
        this.LLIIIZ.setVisibility(0);
        this.LLIIIL.setVisibility(8);
        W5F LJII = W5U.LJII(C78939UyV.LJ(C78934UyQ.LJJIIJ(list)));
        Drawable drawable = this.LLIILII;
        LJII.LJIILIIL = drawable;
        LJII.LJIILLIIL = drawable;
        LJII.LJJIIJ = this.LLIIIZ;
        C43659HBn.LJIJ(LJII, "ImageCard:leftIcon", false, null, 6);
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        C113084cC c113084cC = this.LLIIIJ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v);
        c113084cC.setBackground(gradientDrawable);
        this.LLIIIJ.setRoundingParams(c49v.LIZ);
    }

    @Override // X.AnonymousClass461
    public final void m0(C109544Rq msg, C109544Rq c109544Rq, ImageCardTemplate imageCardTemplate, int i) {
        String decode;
        LifecycleCoroutineScope lifecycleScope;
        ImageCardTemplate imageCardTemplate2 = imageCardTemplate;
        o.LJIIIZ(msg, "msg");
        String str = imageCardTemplate2.titleBar.title.text;
        if (str.length() == 0) {
            str = C88913eJ.LIZ(this.itemView, R.string.ev4, "itemView.context.getStri…t_card_unavailable_title)");
        }
        TuxTextView tuxTextView = this.LLIIJI;
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZIZ(str);
        tuxTextView.setText(c116724i4.LIZ);
        if (imageCardTemplate2.titleBar.subtitle.text.length() == 0) {
            this.LLIIJLIL.setVisibility(8);
        } else {
            this.LLIIJLIL.setText(imageCardTemplate2.titleBar.subtitle.text);
            this.LLIIJLIL.setVisibility(0);
        }
        String str2 = null;
        if (msg.getMsgType() == 1801 && o.LJ(msg.getScene(), "now_post")) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
            if (LIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LIZIZ)) != null) {
                XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C85033Vj(msg, this, imageCardTemplate2, null), 2);
            }
        } else {
            n0(msg.getScene(), imageCardTemplate2.titleBar.leftImage.urls);
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(new ACListenerS27S0300000_1(msg, this, imageCardTemplate2, 11));
        }
        ActionLinkComponent actionLinkComponent = imageCardTemplate2.actionLinkComponent;
        if (actionLinkComponent.data.isEmpty()) {
            return;
        }
        Iterator<String> it = actionLinkComponent.data.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.length() > 0) {
                str2 = next;
                break;
            }
        }
        String str3 = str2;
        if (str3 == null || (decode = android.net.Uri.decode(str3)) == null || actionLinkComponent.linkType != ActionLinkType.DEEP_LINK) {
            return;
        }
        C26408AYa.LJIIIIZZ("inc_landing_page_show", decode, new LinkedHashMap());
    }
}

package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS18S0102000_12;
import kotlin.jvm.internal.AqS67S0110000_12;
import kotlin.jvm.internal.AqS79S1100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SVn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72207SVn extends C72209SVp {
    public static final /* synthetic */ int LJLLLL = 0;
    public boolean LJLJL;
    public String LJLJLJ;
    public final C2068389v LJLJLLL;
    public final C2068389v LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;

    @Override // X.C72209SVp
    public final int LIZ() {
        return R.layout.bel;
    }

    public TuxIconView getButton() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-button>(...)");
        return (TuxIconView) value;
    }

    public SmartImageView getCover() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-cover>(...)");
        return (SmartImageView) value;
    }

    public FrameLayout getCoverContainer() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-coverContainer>(...)");
        return (FrameLayout) value;
    }

    public ConstraintLayout getTopicItemContainer() {
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-topicItemContainer>(...)");
        return (ConstraintLayout) value;
    }

    @Override // android.view.View
    public final String getId() {
        return this.LJLJLJ;
    }

    public final void LIZIZ(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "urlModel");
        if (!getAttached()) {
            getPendingSetting().offer(new AqS156S0200000_9(this, urlModel, 17));
            return;
        }
        LIZLLL(C7MY.LIZIZ(54), O6R.LJJIIZ(C32151Nz.LJIIZILJ(81)));
        LIZJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(64)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(90)));
        setPanelItemHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(102)));
        getCover().setPlaceholderImage(R.color.aq);
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJIJI = Bitmap.Config.ARGB_8888;
        LJII.LJJIIJ = getCover();
        LJII.LIZLLL(new LDO(this));
    }

    public final void LJ(boolean z) {
        C2068389v c2068389v;
        if (!getAttached()) {
            getPendingSetting().offer(new AqS67S0110000_12(this, z, 3));
            return;
        }
        this.LJLJL = z;
        TuxIconView button = getButton();
        if (z) {
            c2068389v = this.LJLL;
        } else {
            c2068389v = this.LJLJLLL;
        }
        button.setTuxIcon(c2068389v);
    }

    public final void setButton(C2068389v newIcon) {
        o.LJIIIZ(newIcon, "newIcon");
        getButton().setTuxIcon(newIcon);
    }

    public final void setButtonOnClickListener(InterfaceC65784Pro<C76800UCe> onClick) {
        o.LJIIIZ(onClick, "onClick");
        if (!getAttached()) {
            getPendingSetting().offer(new AqS159S0200000_12(this, (C72207SVn) onClick, (InterfaceC65784Pro<C76800UCe>) 32));
        } else {
            C16880lQ.LJJJ(getButton(), new ACListenerS32S0100000_12(onClick, 66));
        }
    }

    public final void setCollected(boolean z) {
        this.LJLJL = z;
    }

    public final void setId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJLJ = str;
    }

    public final void setPanelItemHeight(int i) {
        if (!getAttached()) {
            getPendingSetting().offer(new AqS110S0101000_12(this, i, 3));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getTopicItemContainer().getLayoutParams();
        layoutParams.height = i;
        getTopicItemContainer().setLayoutParams(layoutParams);
    }

    public final void setRating(String rating) {
        o.LJIIIZ(rating, "rating");
        if (!getAttached()) {
            getPendingSetting().offer(new AqS79S1100000_12(this, rating, 2));
        } else {
            findViewById(R.id.inj).setVisibility(0);
            ((TextView) findViewById(R.id.inu)).setText(rating);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72207SVn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLJ = "";
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZ = R.raw.icon_bookmark;
        Integer valueOf = Integer.valueOf(R.attr.go);
        c2068389v.LJ = valueOf;
        this.LJLJLLL = c2068389v;
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v2.LIZ = R.raw.icon_bookmark_fill;
        c2068389v2.LJ = valueOf;
        this.LJLL = c2068389v2;
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1077));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1078));
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1079));
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1080));
    }

    public final void LIZJ(int i, int i2) {
        if (!getAttached()) {
            getPendingSetting().offer(new AqS18S0102000_12(this, i, i2, 1));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getCoverContainer().getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        getCoverContainer().setLayoutParams(layoutParams);
    }

    public final void LIZLLL(int i, int i2) {
        if (!getAttached()) {
            getPendingSetting().offer(new AqS18S0102000_12(this, i, i2, 2));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getCover().getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        getCover().setLayoutParams(layoutParams);
    }
}

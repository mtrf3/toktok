package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS79S1100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SVp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72209SVp extends FrameLayout {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public final Queue<InterfaceC65784Pro<C76800UCe>> LJLJJL;

    public int LIZ() {
        return R.layout.bbi;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLJJI = false;
        super.onDetachedFromWindow();
    }

    private final SmartImageView getIconView() {
        return (SmartImageView) this.LJLJI.getValue();
    }

    private final TextView getSubTitleView() {
        return (TextView) this.LJLILLLLZI.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.LJLIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJJI = true;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), LIZ(), this, true);
        while (((LinkedList) this.LJLJJL).peek() != null) {
            ((InterfaceC65784Pro) ((LinkedList) this.LJLJJL).poll()).invoke();
        }
        CharSequence text = getSubTitleView().getText();
        if (text == null || text.length() == 0) {
            getSubTitleView().setVisibility(8);
            TextView titleView = getTitleView();
            o.LJIIIIZZ(titleView, "titleView");
            ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
            if (layoutParams != null) {
                C018905p c018905p = (C018905p) layoutParams;
                c018905p.bottomToBottom = 0;
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = 0;
                titleView.setLayoutParams(c018905p);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public final boolean getAttached() {
        return this.LJLJJI;
    }

    public final Queue<InterfaceC65784Pro<C76800UCe>> getPendingSetting() {
        return this.LJLJJL;
    }

    public final void setAttached(boolean z) {
        this.LJLJJI = z;
    }

    public final void setIcon(UrlModel urlModel) {
        float LIZJ;
        if (urlModel == null) {
            return;
        }
        if (!this.LJLJJI) {
            ((LinkedList) this.LJLJJL).offer(new AqS159S0200000_12(this, urlModel, 31));
            return;
        }
        float LIZJ2 = KL2.LIZJ(getContext(), 64.0f);
        try {
            LIZJ = KL2.LIZJ(getContext(), (urlModel.getHeight() * 64) / urlModel.getWidth());
        } catch (Exception unused) {
            LIZJ = KL2.LIZJ(getContext(), 64.0f);
        }
        ViewGroup.LayoutParams layoutParams = getIconView().getLayoutParams();
        layoutParams.width = (int) LIZJ2;
        layoutParams.height = (int) LIZJ;
        getIconView().setLayoutParams(layoutParams);
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJIJI = Bitmap.Config.ARGB_8888;
        LJII.LJJIIJ = getIconView();
        C16880lQ.LLJJJ(LJII);
    }

    public final void setIconRes(int i) {
        if (!this.LJLJJI) {
            ((LinkedList) this.LJLJJL).offer(new AqS110S0101000_12(this, i, 2));
            return;
        }
        getIconView().setImageResource(i);
    }

    public final void setSubTitle(String subtitle) {
        o.LJIIIZ(subtitle, "subtitle");
        if (!this.LJLJJI) {
            ((LinkedList) this.LJLJJL).offer(new AqS79S1100000_12(this, subtitle, 0));
            return;
        }
        getSubTitleView().setText(subtitle);
    }

    public final void setTitle(String title) {
        o.LJIIIZ(title, "title");
        if (!this.LJLJJI) {
            ((LinkedList) this.LJLJJL).offer(new AqS79S1100000_12(this, title, 1));
            return;
        }
        getTitleView().setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C72209SVp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72209SVp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 770));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 769));
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 768));
        this.LJLJJL = new LinkedList();
    }
}

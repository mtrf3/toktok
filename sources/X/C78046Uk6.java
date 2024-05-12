package X;

import Y.ARunnableS14S1100000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uk6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78046Uk6 extends FrameLayout {
    public final ViewGroup LJLIL;
    public final C47061t0 LJLILLLLZI;
    public final TextView LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;
    public final ViewGroup LJLJJLL;
    public final C47061t0 LJLJL;
    public final TextView LJLJLJ;
    public final View LJLJLLL;
    public final float LJLL;
    public final List<RankListV2Response.Bulletin> LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;

    public final int LIZ() {
        if (CCJ.LIZ(getContext())) {
            return 1048576 - this.LJLJI.getWidth();
        }
        return 0;
    }

    public final void LIZIZ(Runnable runnable) {
        int i;
        if (!this.LJLLJ) {
            return;
        }
        int size = (this.LJLLILLLL + 1) % ((ArrayList) this.LJLLI).size();
        this.LJLJJLL.setVisibility(0);
        this.LJLJJLL.setTranslationY(this.LJLL);
        this.LJLJJLL.setAlpha(0.0f);
        this.LJLJLJ.setText(CXJ.LJFF(((RankListV2Response.Bulletin) ListProtector.get(this.LJLLI, size)).content, "").toString());
        Layout layout = this.LJLJLJ.getLayout();
        if (layout != null) {
            i = (int) layout.getLineWidth(0);
        } else {
            i = 0;
        }
        if (i > this.LJLJI.getWidth()) {
            this.LJLJLLL.setVisibility(0);
        } else {
            this.LJLJLLL.setVisibility(8);
        }
        C78720Uuy LIZ = C15650jR.LIZ().LIZ(((RankListV2Response.Bulletin) ListProtector.get(this.LJLLI, size)).icon.getUrls());
        LIZ.LJIIL = Boolean.TRUE;
        LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        int width = this.LJLJL.getWidth();
        int height = this.LJLJL.getHeight();
        LIZ.LJ = width;
        LIZ.LJFF = height;
        LIZ.LJIIJJI(this.LJLJL);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 48));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(200L);
        ofFloat2.setStartDelay(100L);
        ofFloat2.addUpdateListener(new AUListenerS100S0100000_13(this, 49));
        ofFloat2.addListener(new C78045Uk5(this, size, runnable));
        ofFloat2.start();
    }

    public final void LIZJ(RankListV2Response.Bulletin bulletin) {
        if (!this.LJLLJ) {
            return;
        }
        String obj = CXJ.LJFF(bulletin.content, "").toString();
        this.LJLJI.setText(obj);
        postOnAnimation(new ARunnableS14S1100000_13(this, obj, 3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78046Uk6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLL = C15380j0.LIZ(32.0f);
        FrameLayout.inflate(context, R.layout.dca, this);
        View findViewById = findViewById(R.id.b1_);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.bulletin_container)");
        this.LJLIL = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.b1b);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.bulletin_icon)");
        C47061t0 c47061t0 = (C47061t0) findViewById2;
        this.LJLILLLLZI = c47061t0;
        View findViewById3 = findViewById(R.id.b1d);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.bulletin_text)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.b1c);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.bulletin_start_mask_icon)");
        this.LJLJJI = findViewById4;
        View findViewById5 = findViewById(R.id.b1a);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.bulletin_end_mask_icon)");
        this.LJLJJL = findViewById5;
        View findViewById6 = findViewById(R.id.b16);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.bulletin_animator_container)");
        this.LJLJJLL = (ViewGroup) findViewById6;
        View findViewById7 = findViewById(R.id.b18);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.bulletin_animator_icon)");
        C47061t0 c47061t02 = (C47061t0) findViewById7;
        this.LJLJL = c47061t02;
        View findViewById8 = findViewById(R.id.b19);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.bulletin_animator_text)");
        this.LJLJLJ = (TextView) findViewById8;
        View findViewById9 = findViewById(R.id.b17);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.bulletin_animator_end_mask_icon)");
        this.LJLJLLL = findViewById9;
        Integer LJI = C79045V0n.LJI(R.attr.cc, context);
        if (LJI != null) {
            setBackgroundColor(LJI.intValue());
        }
        if (CCJ.LIZ(context)) {
            findViewById4.setBackgroundResource(R.drawable.cbf);
            findViewById5.setBackgroundResource(R.drawable.cbe);
            findViewById9.setBackgroundResource(R.drawable.cbe);
            c47061t0.setScaleX(-1.0f);
            c47061t02.setScaleX(-1.0f);
        }
        this.LJLLI = new ArrayList();
    }
}

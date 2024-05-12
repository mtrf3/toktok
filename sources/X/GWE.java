package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWE extends LinearLayout implements GWH {
    public static final /* synthetic */ int LJLLI = 0;
    public final C5CM LJLIL;
    public final View LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final FrameLayout LJLJJI;
    public final View LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public GWF LJLJLJ;
    public InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> LJLJLLL;
    public boolean LJLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GWH
    public final void onShow() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        setLayoutParams(layoutParams);
        C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
        GWF gwf = null;
        if (c86550Xxy.LJIIL(1002) == null) {
            GWF gwf2 = new GWF();
            c86550Xxy.LIZ.LJIIJJI(gwf2);
            c86550Xxy.LJIIIIZZ(gwf2, null);
            this.LJLJLJ = gwf2;
        } else {
            InterfaceC86486Xww LJIIL = c86550Xxy.LJIIL(1002);
            if (LJIIL instanceof GWF) {
                gwf = (GWF) LJIIL;
            }
            this.LJLJLJ = gwf;
        }
        GWF gwf3 = this.LJLJLJ;
        if (gwf3 != null) {
            gwf3.LIZJ = this;
        }
        c86550Xxy.LIZJ(new C51764KTg(1002, "click_push_publish_fail", new InnerPushConfig(0L, null, 10000, C47261Igj.LJJIJIIJI(1, 2, 3, 4, 5, 6), this.LJLJJLL, 3, null == true ? 1 : 0), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, 0, 0, null, null, null, 0, 0, null, null, null, null, 0, null, 0, null, null, 0, 0, 0, 0, null, null, 0.0f, 0, null, null, null, 0, null, null, null, null, null, -1, 1048575, null), null, null, 204));
    }

    public final int getDurationTime() {
        return this.LJLJJLL;
    }

    public final InterfaceC88471Ynr<Boolean, String, C76800UCe> getOnDismiss() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GWE(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = 5;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bo5, this, true);
        View findViewById = findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_cover)");
        this.LJLIL = (C5CM) findViewById;
        View findViewById2 = findViewById(R.id.bfp);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.close_icon)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = findViewById(R.id.mo5);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_tips)");
        this.LJLJI = (TuxTextView) findViewById3;
        o.LJIIIIZZ(findViewById(R.id.l17), "findViewById(R.id.tap_to_retry)");
        View findViewById4 = findViewById(R.id.e5s);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.hint_layer)");
        this.LJLJJI = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(R.id.ddf);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.fl_cover_container)");
        this.LJLJJL = findViewById5;
    }

    public final void setDismissListener(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLLL = listener;
    }

    public final void setDurationTime(int i) {
        this.LJLJJLL = i;
    }

    public final void setOnDismiss(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LJLJLLL = interfaceC88471Ynr;
    }

    @Override // X.GWH
    public void setText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLJI.setText(text);
    }

    @Override // X.GWH
    public final void LIZ(boolean z, boolean z2) {
        String str;
        InterfaceC112564bM interfaceC112564bM;
        if (z) {
            str = "has_new_upload";
        } else if (z2) {
            str = "is_retry_dismiss_from_external";
        } else {
            str = "";
        }
        GWF gwf = this.LJLJLJ;
        if (gwf != null && (interfaceC112564bM = gwf.LIZ) != null) {
            interfaceC112564bM.LIZIZ(str, false);
        }
    }

    public final void LIZIZ(Bitmap bitmap, int i, int i2, float f, boolean z) {
        o.LJIIIZ(bitmap, "bitmap");
        View view = this.LJLJJL;
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        if (z) {
            View view2 = this.LJLJJL;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.addRule(15);
            view2.setLayoutParams(layoutParams3);
        }
        this.LJLIL.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C5CM c5cm = this.LJLIL;
        c5cm.getClass();
        c5cm.LJLIL = f;
        c5cm.setImageBitmap(bitmap);
        c5cm.invalidate();
    }
}

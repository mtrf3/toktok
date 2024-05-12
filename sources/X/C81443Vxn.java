package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81443Vxn extends WM7 implements InterfaceC135635Tz {
    public T4X LJLIL;
    public int LJLILLLLZI;
    public ValueAnimator LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C81444Vxo LJLJJLL;
    public final InterfaceC82086WJm LJLJL;
    public final C82622Wbi LJLJLJ;

    public final void hide() {
        ValueAnimator valueAnimator;
        this.LJLJJI = false;
        ValueAnimator valueAnimator2 = this.LJLJI;
        if (valueAnimator2 != null && valueAnimator2.isStarted() && (valueAnimator = this.LJLJI) != null) {
            valueAnimator.cancel();
        }
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) this.LJLJJL.getValue();
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LJLJJLL);
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        hide();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C81443Vxn(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJLJ = diContainer;
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 266));
        this.LJLJJLL = new C81444Vxo(this);
        this.LJLJL = (InterfaceC82086WJm) diContainer.LJ(InterfaceC82086WJm.class, null);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int dimensionPixelOffset;
        int LIZ;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C82894Wg6 c82894Wg6 = C82894Wg6.LIZIZ;
        if (c82894Wg6.LJII()) {
            dimensionPixelOffset = requireSceneContext.getResources().getDimensionPixelOffset(R.dimen.f1);
        } else {
            dimensionPixelOffset = requireSceneContext.getResources().getDimensionPixelOffset(R.dimen.f0);
        }
        this.LJLILLLLZI = 0;
        LinearLayout linearLayout = new LinearLayout(requireSceneContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setVisibility(8);
        int i = 1;
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.ex);
        gradientDrawable.setCornerRadii(new float[]{dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, 0.0f, 0.0f, 0.0f, 0.0f});
        Context context2 = linearLayout.getContext();
        o.LJIIIIZZ(context2, "context");
        gradientDrawable.setColor(context2.getResources().getColor(R.color.xt));
        linearLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout2 = new LinearLayout(requireSceneContext);
        this.LJLILLLLZI += dimensionPixelOffset;
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, dimensionPixelOffset));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        Context context3 = linearLayout2.getContext();
        o.LJIIIIZZ(context3, "context");
        linearLayout2.setBackgroundColor(context3.getResources().getColor(R.color.xu));
        Context context4 = linearLayout2.getContext();
        o.LJIIIIZZ(context4, "context");
        if (c82894Wg6.LJII()) {
            LIZ = context4.getResources().getDimensionPixelSize(R.dimen.ew);
        } else {
            LIZ = (int) C74275TDb.LIZ(14.0f);
        }
        int LIZ2 = (int) C74275TDb.LIZ(24.0f);
        int LIZIZ = C04330Ez.LIZIZ(linearLayout2.getContext(), R.color.y1);
        ImageView imageView = new ImageView(requireSceneContext);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int LIZ3 = (int) C74275TDb.LIZ(8.0f);
        layoutParams2.setMargins(LIZ, LIZ3, LIZ, LIZ3);
        imageView.setLayoutParams(layoutParams2);
        imageView.setColorFilter(LIZIZ, PorterDuff.Mode.MULTIPLY);
        imageView.setImageResource(R.drawable.b5d);
        linearLayout2.addView(imageView);
        View space = new Space(requireSceneContext);
        int LIZ4 = (int) C74275TDb.LIZ(0.5f);
        if (LIZ4 >= 1) {
            i = LIZ4;
        }
        space.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        linearLayout2.addView(space);
        ImageView imageView2 = new ImageView(requireSceneContext);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(LIZ2, LIZ2);
        layoutParams3.leftMargin = LIZ;
        layoutParams3.rightMargin = LIZ;
        imageView2.setLayoutParams(layoutParams3);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setColorFilter(LIZIZ, PorterDuff.Mode.MULTIPLY);
        imageView2.setImageResource(R.drawable.b9c);
        linearLayout2.addView(imageView2);
        ImageView imageView3 = new ImageView(requireSceneContext);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(LIZ2, LIZ2);
        layoutParams4.leftMargin = LIZ;
        layoutParams4.rightMargin = LIZ;
        imageView3.setLayoutParams(layoutParams4);
        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView3.setColorFilter(LIZIZ, PorterDuff.Mode.MULTIPLY);
        imageView3.setImageResource(R.drawable.b4c);
        linearLayout2.addView(imageView3);
        linearLayout.addView(linearLayout2);
        FrameLayout frameLayout = new FrameLayout(requireSceneContext);
        frameLayout.setBackgroundColor(C04330Ez.LIZIZ(frameLayout.getContext(), R.color.xu));
        Context context5 = frameLayout.getContext();
        o.LJIIIIZZ(context5, "context");
        int dimensionPixelOffset3 = context5.getResources().getDimensionPixelOffset(R.dimen.a6e);
        this.LJLILLLLZI += dimensionPixelOffset3;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, dimensionPixelOffset3));
        T4X t4x = new T4X(requireSceneContext, null);
        t4x.LIZ(requireSceneContext);
        int LIZ5 = (int) C74275TDb.LIZ(32.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(LIZ5, LIZ5);
        layoutParams5.gravity = 17;
        t4x.setLayoutParams(layoutParams5);
        frameLayout.addView(t4x);
        this.LJLIL = t4x;
        linearLayout.addView(frameLayout);
        return linearLayout;
    }
}

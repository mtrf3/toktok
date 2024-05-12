package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.WEd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81947WEd extends FrameLayout implements InterfaceC81963WEt {
    public WET LJLIL;
    public C80841Vo5 LJLILLLLZI;
    public C81945WEb LJLJI;
    public C81949WEf LJLJJI;
    public C81955WEl LJLJJL;
    public InterfaceC81961WEr LJLJJLL;
    public final java.util.Set<Integer> LJLJL;
    public final Context LJLJLJ;
    public final int LJLJLLL;
    public boolean LJLL;
    public float LJLLI;
    public final C81950WEg LJLLILLLL;
    public final C81960WEq LJLLJ;
    public final C81946WEc LJLLL;
    public final C81953WEj LJLLLL;
    public boolean LJLLLLLL;

    public final void LJI() {
        View view;
        ViewGroup viewGroup;
        View view2;
        ViewGroup viewGroup2;
        this.LJLL = false;
        ((HashSet) this.LJLJL).clear();
        C81949WEf c81949WEf = this.LJLJJI;
        if (c81949WEf != null) {
            C81954WEk c81954WEk = c81949WEf.LJIIL;
            if (c81954WEk != null && (view2 = c81954WEk.LIZ) != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                C16880lQ.LJLLL(c81954WEk.LIZ, viewGroup2);
            }
            C81951WEh c81951WEh = this.LJLJJI.LJIILIIL;
            if (c81951WEh != null && (view = c81951WEh.LIZ) != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                C16880lQ.LJLLL(c81951WEh.LIZ, viewGroup);
            }
        }
        removeAllViews();
        InterfaceC81961WEr interfaceC81961WEr = this.LJLJJLL;
        if (interfaceC81961WEr != null) {
            DialogInterfaceOnShowListenerC81948WEe dialogInterfaceOnShowListenerC81948WEe = (DialogInterfaceOnShowListenerC81948WEe) interfaceC81961WEr;
            try {
                DialogInterfaceC39771hF dialogInterfaceC39771hF = dialogInterfaceOnShowListenerC81948WEe.LJLIL;
                if (dialogInterfaceC39771hF != null) {
                    dialogInterfaceC39771hF.dismiss();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            dialogInterfaceOnShowListenerC81948WEe.LJLJJI = false;
        }
    }

    public final void LIZ() {
        C81949WEf c81949WEf = this.LJLJJI;
        if (c81949WEf == null) {
            return;
        }
        C81954WEk c81954WEk = c81949WEf.LJIIL;
        if (c81954WEk != null && (c81949WEf.LJIJJ >= 1 || c81949WEf.LJIIZILJ)) {
            c81954WEk.LIZJ = this;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.zr, C16880lQ.LLZIL(getContext()), null);
            c81954WEk.LIZ = LLLZIIL;
            c81954WEk.LIZIZ = (C80925VpR) LLLZIIL.findViewById(R.id.i30);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            addView(c81954WEk.LIZ, layoutParams);
            c81954WEk.LIZ.setPadding(0, C63081OpJ.LJJJJLI(getContext()), 0, 0);
            c81954WEk.LIZ(this.LJLILLLLZI);
        }
        C81949WEf c81949WEf2 = this.LJLJJI;
        C81951WEh c81951WEh = c81949WEf2.LJIILIIL;
        if (c81951WEh != null) {
            if (c81949WEf2.LJIJJ >= 1 || c81949WEf2.LJIIZILJ) {
                c81951WEh.LIZIZ = this;
                View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.zq, C16880lQ.LLZIL(getContext()), null);
                c81951WEh.LIZ = LLLZIIL2;
                c81951WEh.LIZJ = (TuxTextView) LLLZIIL2.findViewById(R.id.i3t);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 80;
                addView(c81951WEh.LIZ, layoutParams2);
                c81951WEh.LIZ(this.LJLILLLLZI);
            }
        }
    }

    public final void LIZLLL() {
        View view;
        View view2;
        C81949WEf c81949WEf = this.LJLJJI;
        if (c81949WEf == null) {
            return;
        }
        C81951WEh c81951WEh = c81949WEf.LJIILIIL;
        if (c81951WEh != null && ((c81949WEf.LJIJJ >= 2 || c81949WEf.LJIIZILJ) && (view2 = c81951WEh.LIZ) != null)) {
            view2.setVisibility(8);
        }
        C81949WEf c81949WEf2 = this.LJLJJI;
        C81954WEk c81954WEk = c81949WEf2.LJIIL;
        if (c81954WEk != null) {
            if ((c81949WEf2.LJIJJ < 2 && !c81949WEf2.LJIIZILJ) || (view = c81954WEk.LIZ) == null) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public int getCurrentPosition() {
        C80841Vo5 c80841Vo5 = this.LJLILLLLZI;
        if (c80841Vo5 == null) {
            return 0;
        }
        return c80841Vo5.getCurrentItem() % this.LJLJJI.LJIJJ;
    }

    public Context getActivityContext() {
        return this.LJLJLJ;
    }

    public InterfaceC81962WEs getOnScaleListener() {
        return this.LJLLLL;
    }

    public AbstractC81958WEo getTransAdapter() {
        return this.LJLJI;
    }

    public C81949WEf getTransConfig() {
        return this.LJLJJI;
    }

    public WEY getTransListener() {
        return this.LJLLL;
    }

    public C81949WEf getTransferConfig() {
        return this.LJLJJI;
    }

    public C80766Vms getViewPager() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C81947WEd(Context context) {
        super(context);
        this.LJLJLLL = 1;
        this.LJLLILLLL = new C81950WEg(this);
        this.LJLLJ = new C81960WEq(this);
        this.LJLLL = new C81946WEc(this);
        this.LJLLLL = new C81953WEj(this);
        this.LJLLLLLL = false;
        this.LJLJLJ = context;
        this.LJLJL = new HashSet();
    }

    public final boolean LIZIZ(int i) {
        WET wet;
        int i2;
        if (this.LJLL || ((wet = this.LJLIL) != null && wet.getState() == 2)) {
            return false;
        }
        C81949WEf c81949WEf = this.LJLJJI;
        WET wet2 = null;
        if (c81949WEf != null && (i2 = c81949WEf.LJFF) > 0 && i >= i2) {
            this.LJLIL = null;
        } else {
            WEN wen = new WEN(this);
            C81949WEf transConfig = getTransConfig();
            if (transConfig != null) {
                List list = transConfig.LJIIIIZZ;
                if (list == null) {
                    list = new ArrayList();
                }
                if (list.size() > i && ListProtector.get(list, i) != null) {
                    wet2 = wen.LIZ((ImageView) ListProtector.get(list, i));
                    wen.LIZIZ((String) ListProtector.get(transConfig.LJIIJ, i), wet2, false);
                    addView(wet2, 1);
                }
            }
            this.LJLIL = wet2;
        }
        if (this.LJLIL == null) {
            LJI();
        } else {
            this.LJLILLLLZI.setVisibility(4);
        }
        LIZLLL();
        return true;
    }

    public final int LIZJ(float f) {
        C81949WEf c81949WEf = this.LJLJJI;
        if (c81949WEf == null) {
            return 0;
        }
        int i = c81949WEf.LIZJ;
        return Color.argb(Math.round(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final void LJ(int i) {
        WET wet;
        C81949WEf c81949WEf = this.LJLJJI;
        if (c81949WEf == null) {
            return;
        }
        int size = i % c81949WEf.LJIIIZ.size();
        WEN wen = new WEN(this);
        AbstractC81958WEo transAdapter = getTransAdapter();
        C81949WEf transConfig = getTransConfig();
        if (transAdapter == null || transConfig == null) {
            return;
        }
        FrameLayout frameLayout = ((C81945WEb) transAdapter).LJLJJLL.get(size);
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = frameLayout.getChildAt(i2);
                if (childAt instanceof ImageView) {
                    wet = (WET) childAt;
                    break;
                }
            }
        }
        wet = null;
        WER LIZ = transConfig.LIZ();
        if (transConfig.LJ) {
            wen.LIZJ(wet.getDrawable(), size, wet);
            return;
        }
        String str = (String) ListProtector.get(transConfig.LJIIJ, size);
        final C62875Olz c62875Olz = (C62875Olz) LIZ;
        c62875Olz.getClass();
        if (C78765Uvh.LJIILIIL(UriProtector.parse(str))) {
            final C81944WEa c81944WEa = new C81944WEa(wen, transConfig, size, wet);
            C78765Uvh.LJIILJJIL(new UrlModel(), 0, 0, new InterfaceC41846Gba() { // from class: X.WEZ
                @Override // X.InterfaceC41846Gba
                public final void accept(Object obj) {
                    C62875Olz c62875Olz2 = C62875Olz.this;
                    WES wes = c81944WEa;
                    Bitmap bitmap = (Bitmap) obj;
                    c62875Olz2.getClass();
                    if (wes == null) {
                        return;
                    }
                    if (bitmap != null && !bitmap.isRecycled()) {
                        C81944WEa c81944WEa2 = (C81944WEa) wes;
                        c81944WEa2.LIZ.LIZJ(new BitmapDrawable(C62875Olz.LIZIZ(bitmap)), c81944WEa2.LIZJ, c81944WEa2.LIZLLL);
                    } else {
                        C81944WEa c81944WEa3 = (C81944WEa) wes;
                        WEN wen2 = c81944WEa3.LIZ;
                        C81949WEf c81949WEf2 = c81944WEa3.LIZIZ;
                        wen2.LIZJ(c81949WEf2.LIZIZ(wen2.LIZIZ), c81944WEa3.LIZJ, c81944WEa3.LIZLLL);
                    }
                }
            });
        } else {
            wen.LIZJ(transConfig.LIZIZ(wen.LIZIZ), size, wet);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        WET wet;
        C81955WEl c81955WEl;
        boolean z;
        if (motionEvent.getAction() == 0) {
            this.LJLLLLLL = false;
        }
        if (!this.LJLLLLLL) {
            if (motionEvent.getPointerCount() > 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLLLLLL = z;
        }
        if (!this.LJLLLLLL && motionEvent.getPointerCount() == 1 && (wet = this.LJLIL) != null && !wet.LLD && !wet.LLF && (c81955WEl = this.LJLJJL) != null) {
            c81955WEl.getClass();
            if (motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2 && motionEvent.getRawY() - c81955WEl.LIZJ > c81955WEl.LJ) {
                            return true;
                        }
                    } else {
                        c81955WEl.LIZJ = 0.0f;
                    }
                } else {
                    c81955WEl.LIZIZ = motionEvent.getRawX();
                    c81955WEl.LIZJ = motionEvent.getRawY();
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        C81955WEl c81955WEl = this.LJLJJL;
        if (c81955WEl != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float rawX = motionEvent.getRawX() - c81955WEl.LIZIZ;
                        float rawY = motionEvent.getRawY() - c81955WEl.LIZJ;
                        float abs = Math.abs(rawY);
                        float max = Math.max(1.0f - ((abs / c81955WEl.LIZ.getHeight()) * 1.2f), 0.6f);
                        c81955WEl.LIZLLL = max;
                        float f = 1.0f - max;
                        float height = f * f * c81955WEl.LIZ.getHeight() * 0.5f;
                        c81955WEl.LIZ.LJLLI = 255.0f - (Math.min((abs / r1.getHeight()) * 2.4f, 0.8f) * 255.0f);
                        C81947WEd c81947WEd = c81955WEl.LIZ;
                        float f2 = c81947WEd.LJLLI;
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        c81947WEd.LJLLI = f2;
                        C80841Vo5 c80841Vo5 = c81947WEd.LJLILLLLZI;
                        if (c80841Vo5 != null) {
                            if (c80841Vo5.getTranslationY() >= 0.0f) {
                                C81947WEd c81947WEd2 = c81955WEl.LIZ;
                                c81947WEd2.setBackgroundColor(c81947WEd2.LIZJ(c81947WEd2.LJLLI));
                                if (c81955WEl.LIZ.getTransferConfig() != null && c81955WEl.LIZ.getTransferConfig().LJIIL != null) {
                                    C81954WEk c81954WEk = c81955WEl.LIZ.getTransferConfig().LJIIL;
                                    int round = Math.round(c81955WEl.LIZ.LJLLI);
                                    View view2 = c81954WEk.LIZ;
                                    if (view2 != null) {
                                        view2.setAlpha(round / 255.0f);
                                    }
                                }
                                c80841Vo5.setTranslationX(rawX);
                                c80841Vo5.setTranslationY(rawY - height);
                                c80841Vo5.setScaleX(c81955WEl.LIZLLL);
                                c80841Vo5.setScaleY(c81955WEl.LIZLLL);
                            } else {
                                if (c81955WEl.LIZ.getTransConfig() != null) {
                                    C81947WEd c81947WEd3 = c81955WEl.LIZ;
                                    c81947WEd3.setBackgroundColor(c81947WEd3.getTransConfig().LIZJ);
                                    if (c81955WEl.LIZ.getTransConfig().LJIIL != null && (view = c81955WEl.LIZ.getTransferConfig().LJIIL.LIZ) != null) {
                                        view.setAlpha(255 / 255.0f);
                                    }
                                }
                                c80841Vo5.setTranslationX(rawX);
                                c80841Vo5.setTranslationY(rawY);
                            }
                        }
                    }
                } else {
                    C80841Vo5 c80841Vo52 = c81955WEl.LIZ.LJLILLLLZI;
                    if (c80841Vo52 != null) {
                        if (c80841Vo52.getTranslationY() > 150.0f) {
                            C81947WEd c81947WEd4 = c81955WEl.LIZ;
                            c81947WEd4.LIZIZ(c81947WEd4.getCurrentPosition());
                        } else {
                            C80841Vo5 c80841Vo53 = c81955WEl.LIZ.LJLILLLLZI;
                            if (c80841Vo53 != null) {
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c80841Vo53, "scaleX", c80841Vo53.getScaleX(), 1.0f);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c80841Vo53, "scaleY", c80841Vo53.getScaleX(), 1.0f);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c80841Vo53, "translationX", c80841Vo53.getTranslationX(), 0.0f);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c80841Vo53, "translationY", c80841Vo53.getTranslationY(), 0.0f);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                                animatorSet.start();
                            }
                        }
                    }
                    c81955WEl.LIZIZ = 0.0f;
                    c81955WEl.LIZJ = 0.0f;
                }
            } else {
                c81955WEl.LIZIZ = motionEvent.getRawX();
                c81955WEl.LIZJ = motionEvent.getRawY();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnLayoutResetListener(InterfaceC81961WEr interfaceC81961WEr) {
        this.LJLJJLL = interfaceC81961WEr;
    }

    public final void LJFF(int i, int i2) {
        int i3 = i - i2;
        int i4 = i2 + i;
        LJ(i);
        ((HashSet) this.LJLJL).add(Integer.valueOf(i));
        if (i3 >= 0) {
            if (!((HashSet) this.LJLJL).contains(Integer.valueOf(i3))) {
                LJ(i3);
                ((HashSet) this.LJLJL).add(Integer.valueOf(i3));
            }
        }
        C81949WEf c81949WEf = this.LJLJJI;
        if (c81949WEf != null && i4 < c81949WEf.LJIIIZ.size()) {
            if (!((HashSet) this.LJLJL).contains(Integer.valueOf(i4))) {
                LJ(i4);
                ((HashSet) this.LJLJL).add(Integer.valueOf(i4));
            }
        }
    }
}

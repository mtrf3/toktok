package Y;

import X.C16310kV;
import X.C16330kX;
import X.C16880lQ;
import X.C17N;
import X.C37477EnJ;
import X.C46318IFu;
import X.C4XM;
import X.C52985Kqr;
import X.C56308M8a;
import X.C6D8;
import X.C70068Rei;
import X.C70282RiA;
import X.C70387Rjr;
import X.C70682Roc;
import X.C71306Ryg;
import X.C74902wo;
import X.C78368UpI;
import X.C78391Upf;
import X.C78688UuS;
import X.C78765Uvh;
import X.C79909VXt;
import X.C79910VXu;
import X.C88913eJ;
import X.EnumC37419EmN;
import X.FIK;
import X.InterfaceC70280Ri8;
import X.InterfaceC88472Yns;
import X.SS4;
import X.TCQ;
import X.TCR;
import X.TCS;
import X.X1D;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS12S0301000_12 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.CharSequence] */
    public final void LIZ$0() {
        TextView textView = (TextView) ((C70682Roc) this.l0).LIZ(R.id.bst);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l1;
        CharSequence charSequence = (CharSequence) this.l2;
        String str = "";
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        o.LJIIIIZZ(valueOf, "valueOf(text ?: \"\")");
        textView.setText((CharSequence) interfaceC88472Yns.invoke(valueOf));
        C71306Ryg c71306Ryg = new C71306Ryg((TuxTextView) ((C70682Roc) this.l0).LIZ(R.id.bst), (((C70682Roc) this.l0).getWidth() - C16310kV.LJFF((C70682Roc) this.l0)) - C16310kV.LJ((C70682Roc) this.l0), "", this.i3, -1.0f);
        ?? r0 = (CharSequence) this.l2;
        if (r0 != 0) {
            str = r0;
        }
        SpannableString handleText = c71306Ryg.LIZ(SpannableString.valueOf(str));
        if (c71306Ryg.LIZLLL) {
            TextView textView2 = (TextView) ((C70682Roc) this.l0).LIZ(R.id.bst);
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) this.l1;
            SpannableStringBuilder append = new SpannableStringBuilder(handleText).append((CharSequence) "...");
            o.LJIIIIZZ(append, "SpannableStringBuilder(handleText).append(\"...\")");
            textView2.setText((CharSequence) interfaceC88472Yns2.invoke(interfaceC88472Yns2.invoke(append)));
            return;
        }
        TextView textView3 = (TextView) ((C70682Roc) this.l0).LIZ(R.id.bst);
        InterfaceC88472Yns interfaceC88472Yns3 = (InterfaceC88472Yns) this.l1;
        o.LJIIIIZZ(handleText, "handleText");
        textView3.setText((CharSequence) interfaceC88472Yns3.invoke(interfaceC88472Yns3.invoke(handleText)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.CharSequence] */
    public final void LIZ$1() {
        try {
            C74902wo c74902wo = (C74902wo) ((C70682Roc) this.l0).LIZ(R.id.bst);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l1;
            CharSequence charSequence = (CharSequence) this.l2;
            String str = "";
            if (charSequence == null) {
                charSequence = "";
            }
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            o.LJIIIIZZ(valueOf, "valueOf(text ?: \"\")");
            c74902wo.setText((CharSequence) interfaceC88472Yns.invoke(valueOf));
            C71306Ryg c71306Ryg = new C71306Ryg((C74902wo) ((C70682Roc) this.l0).LIZ(R.id.bst), (((C70682Roc) this.l0).getWidth() - C16310kV.LJFF((C70682Roc) this.l0)) - C16310kV.LJ((C70682Roc) this.l0), ((C74902wo) ((C70682Roc) this.l0).LIZ(R.id.gma)).getText().toString(), this.i3, -1.0f);
            ?? r0 = (CharSequence) this.l2;
            if (r0 != 0) {
                str = r0;
            }
            SpannableString handleText = c71306Ryg.LIZ(SpannableString.valueOf(str));
            if (c71306Ryg.LIZLLL) {
                C74902wo c74902wo2 = (C74902wo) ((C70682Roc) this.l0).LIZ(R.id.bst);
                InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) this.l1;
                o.LJIIIIZZ(handleText, "handleText");
                c74902wo2.setText((CharSequence) interfaceC88472Yns2.invoke(handleText));
                ((LinearLayout) ((C70682Roc) this.l0).LIZ(R.id.gm2)).setVisibility(0);
            } else {
                C74902wo c74902wo3 = (C74902wo) ((C70682Roc) this.l0).LIZ(R.id.bst);
                InterfaceC88472Yns interfaceC88472Yns3 = (InterfaceC88472Yns) this.l1;
                o.LJIIIIZZ(handleText, "handleText");
                c74902wo3.setText((CharSequence) interfaceC88472Yns3.invoke(handleText));
                ((LinearLayout) ((C70682Roc) this.l0).LIZ(R.id.gm2)).setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    public static final void run$0(ARunnableS12S0301000_12 aRunnableS12S0301000_12) {
        boolean LIZ;
        try {
            aRunnableS12S0301000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS12S0301000_12 aRunnableS12S0301000_12) {
        boolean LIZ;
        try {
            aRunnableS12S0301000_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S0301000_12 aRunnableS12S0301000_12) {
        boolean LIZ;
        try {
            int[] iArr = new int[2];
            ((C70387Rjr) aRunnableS12S0301000_12.l0).getLocationOnScreen(iArr);
            InterfaceC70280Ri8 interfaceC70280Ri8 = ((C70282RiA) aRunnableS12S0301000_12.l1).LJZI;
            if (interfaceC70280Ri8 != null) {
                interfaceC70280Ri8.LIZ(new C70068Rei(((SaleProp) aRunnableS12S0301000_12.l2).propName, aRunnableS12S0301000_12.i3, iArr[1]));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S0301000_12 aRunnableS12S0301000_12) {
        switch (aRunnableS12S0301000_12.i3) {
            case 0:
                ((C78391Upf) aRunnableS12S0301000_12.l0).LIZ((C78368UpI) aRunnableS12S0301000_12.l1, (IapChannelUserData) aRunnableS12S0301000_12.l2);
                return;
            default:
                BaseNewMusicTabFragment baseNewMusicTabFragment = (BaseNewMusicTabFragment) aRunnableS12S0301000_12.l0;
                View anchor = (View) aRunnableS12S0301000_12.l1;
                MusicModel musicModel = (MusicModel) aRunnableS12S0301000_12.l2;
                if (baseNewMusicTabFragment.mo49getActivity() != null && !baseNewMusicTabFragment.mo49getActivity().isFinishing() && baseNewMusicTabFragment.Al() != null) {
                    SS4 Al = baseNewMusicTabFragment.Al();
                    Al.getClass();
                    o.LJIIIZ(anchor, "anchor");
                    o.LJIIIZ(musicModel, "musicModel");
                    if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                        C78765Uvh.LJIIIZ(Al.LIZIZ, musicModel.getPicPremium(), -1, -1);
                    } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                        C78765Uvh.LJIIIZ(Al.LIZIZ, musicModel.getPicBig(), -1, -1);
                    }
                    float measureText = Al.LIZJ.getPaint().measureText(C88913eJ.LIZ(Al.LIZLLL, R.string.bgf, "root.context.getString(R.string.added_to_favorite)")) + C17N.LJIILL(47.0d);
                    Al.setWidth(C17N.LJIILL(24.0d) + anchor.getWidth());
                    if (Al.getWidth() < measureText) {
                        Al.setWidth((int) measureText);
                    }
                    if (!Al.isShowing()) {
                        int width = (anchor.getWidth() - Al.getWidth()) / 2;
                        int i = -((Al.LIZLLL.getMeasuredHeight() + anchor.getHeight()) - C17N.LJIILL(16.0d));
                        if (C4XM.LIZ()) {
                            C56308M8a.LIZ();
                        }
                        C46318IFu.LIZ.getClass();
                        if (C46318IFu.LIZ()) {
                            try {
                                C56308M8a.LIZIZ();
                                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(Al));
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                int i2 = attributes.flags;
                                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                                attributes.flags &= -16777217;
                                Al.showAsDropDown(anchor, width, i);
                                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                                attributes.flags = i2;
                            } catch (Throwable unused) {
                                Al.showAsDropDown(anchor, width, i);
                            }
                        } else {
                            Al.showAsDropDown(anchor, width, i);
                        }
                    }
                    Al.LIZLLL.removeCallbacks(Al.LIZ);
                    Al.LIZLLL.postDelayed(Al.LIZ, 2000L);
                    baseNewMusicTabFragment.LLILIL.LJI("added_to_favorites_show_once", true);
                    return;
                }
                return;
        }
    }

    public static final void run$4(ARunnableS12S0301000_12 aRunnableS12S0301000_12) {
        ImageView imageView;
        switch (aRunnableS12S0301000_12.i3) {
            case 0:
                ((HashMap) ((C37477EnJ) aRunnableS12S0301000_12.l0).LIZLLL).put(((EnumC37419EmN) aRunnableS12S0301000_12.l1).getValue(), aRunnableS12S0301000_12.l2);
                return;
            case 1:
                C79909VXt this$0 = (C79909VXt) aRunnableS12S0301000_12.l0;
                View textView = (View) aRunnableS12S0301000_12.l1;
                C79910VXu this$1 = (C79910VXu) aRunnableS12S0301000_12.l2;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(textView, "$textView");
                o.LJIIIZ(this$1, "this$1");
                TCQ tcq = this$0.LJIIJJI;
                int LIZLLL = this$0.LIZLLL() + (this$1.LJIIIZ - this$1.LIZLLL());
                int LJ = (this$1.LIZJ / 2) + this$0.LJ() + (this$1.LJIIJ - this$1.LJ());
                tcq.getClass();
                View rootView = textView.getRootView();
                if (rootView != null) {
                    rootView.setDrawingCacheEnabled(true);
                    rootView.buildDrawingCache();
                    Bitmap drawingCache = rootView.getDrawingCache();
                    if (drawingCache != null) {
                        int i = tcq.LIZ;
                        int width = drawingCache.getWidth();
                        if (i > width) {
                            i = width;
                        }
                        int i2 = tcq.LIZIZ;
                        int height = drawingCache.getHeight();
                        if (i2 > height) {
                            i2 = height;
                        }
                        int i3 = LIZLLL - (tcq.LIZ / 2);
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        int width2 = drawingCache.getWidth() - i;
                        if (i3 > width2) {
                            i3 = width2;
                        }
                        int i4 = LJ - (tcq.LIZIZ / 2);
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        int height2 = drawingCache.getHeight() - i2;
                        if (i4 > height2) {
                            i4 = height2;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(drawingCache, i3, i4, i, i2);
                        rootView.destroyDrawingCache();
                        if (createBitmap != null) {
                            Paint LIZIZ = C6D8.LIZIZ(true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth() + 2, createBitmap.getHeight() + 2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap2);
                            float f = 2;
                            canvas.drawRoundRect(new RectF(1.0f, 1.0f, createBitmap.getWidth(), createBitmap.getHeight()), createBitmap.getHeight() / f, createBitmap.getHeight() / f, LIZIZ);
                            LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            canvas.drawBitmap(createBitmap, 1.0f, 1.0f, LIZIZ);
                            if (createBitmap2 != null && (imageView = tcq.LIZLLL) != null) {
                                imageView.setImageBitmap(createBitmap2);
                            }
                        }
                    }
                }
                if (!this$0.LJIIJJI.isShowing()) {
                    TCQ tcq2 = this$0.LJIIJJI;
                    int LIZLLL2 = (this$1.LIZIZ / 2) + ((this$0.LIZLLL() + this$1.LJIIIZ) - (this$0.LJIIJ / 2));
                    int LJ2 = this$1.LJ() + this$0.LJ() + this$1.LJIIJ + this$0.LJIIIZ;
                    tcq2.getClass();
                    if (C4XM.LIZ()) {
                        C56308M8a.LIZ();
                    }
                    C46318IFu.LIZ.getClass();
                    if (C46318IFu.LIZ()) {
                        try {
                            C56308M8a.LIZIZ();
                            Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(tcq2));
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            int i5 = attributes.flags;
                            boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                            C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                            attributes.flags &= -16777217;
                            tcq2.showAtLocation(textView, 0, LIZLLL2, LJ2);
                            C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                            attributes.flags = i5;
                        } catch (Throwable unused) {
                            tcq2.showAtLocation(textView, 0, LIZLLL2, LJ2);
                        }
                    } else {
                        tcq2.showAtLocation(textView, 0, LIZLLL2, LJ2);
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tcq2.getContentView(), "alpha", 0.0f, 1.0f);
                    ofFloat.setInterpolator(new TCR());
                    ofFloat.setDuration(316L);
                    ofFloat.start();
                    ValueAnimator ofInt = ValueAnimator.ofInt(C78688UuS.LJIILIIL(30), 0);
                    ofInt.setInterpolator(new TCR());
                    ofInt.setDuration(316L);
                    ofInt.addUpdateListener(new AUListenerS9S0102000_12(tcq2, LIZLLL2, LJ2, 2));
                    tcq2.LIZJ = ofInt;
                    ofInt.start();
                    return;
                }
                ValueAnimator valueAnimator = this$0.LJIIJJI.LIZJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this$0.LJIIJJI.update((this$1.LIZIZ / 2) + ((this$0.LIZLLL() + this$1.LJIIIZ) - (this$0.LJIIJ / 2)), this$1.LJ() + this$0.LJ() + this$1.LJIIJ + this$0.LJIIIZ, -1, -1);
                return;
            default:
                Reference reference = (Reference) aRunnableS12S0301000_12.l0;
                Object obj = aRunnableS12S0301000_12.l1;
                ImageView imageView2 = (ImageView) aRunnableS12S0301000_12.l2;
                try {
                    ImageView imageView3 = (ImageView) reference.get();
                    if (imageView3 != null && imageView3.getDrawable() != null && !C16330kX.LIZIZ(imageView3)) {
                        if ((((Number) C52985Kqr.LIZ.getValue()).intValue() & 2) != 2) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("activity ");
                            LIZ.append(obj);
                            LIZ.append(" image ");
                            LIZ.append(imageView2);
                            new StringBuffer(X1D.LIZIZ(LIZ));
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(" leak!!!, image drawable is ");
                            LIZ2.append(imageView2.getDrawable());
                            X1D.LIZIZ(LIZ2);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(", image background is ");
                            LIZ3.append(imageView2.getBackground());
                            X1D.LIZIZ(LIZ3);
                        }
                        FIK.LIZ.getClass();
                        if (!((PreloadWidgetsData) FIK.LIZJ.getValue()).disableRecycleImage || !(obj instanceof TCS)) {
                            if (imageView2 != null) {
                                Drawable drawable = imageView2.getDrawable();
                                if (drawable != null) {
                                    drawable.setCallback(null);
                                }
                                imageView2.setImageDrawable(null);
                            }
                            if (imageView2.getBackground() != null) {
                                try {
                                    imageView2.getBackground().setCallback(null);
                                    imageView2.setBackgroundDrawable(null);
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
        }
    }

    public ARunnableS12S0301000_12(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

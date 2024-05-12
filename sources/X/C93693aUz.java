package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.text.DecimalFormat;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aUz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93693aUz extends LinearLayout {
    public C93691aUx LJLIL;
    public C94624ak0 LJLILLLLZI;
    public ImageView LJLJI;
    public ViewGroup LJLJJI;

    public final C93691aUx getElementContainer() {
        C93691aUx c93691aUx = this.LJLIL;
        if (c93691aUx != null) {
            return c93691aUx;
        }
        o.LJIJI("elementContainer");
        throw null;
    }

    public final ViewGroup getExtraContainer() {
        ViewGroup viewGroup = this.LJLJJI;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("extraContainer");
        throw null;
    }

    public final ImageView getExtraFeatureImageView() {
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("extraFeatureImageView");
        throw null;
    }

    public final C94624ak0 getExtraStringEditText() {
        C94624ak0 c94624ak0 = this.LJLILLLLZI;
        if (c94624ak0 != null) {
            return c94624ak0;
        }
        o.LJIJI("extraStringEditText");
        throw null;
    }

    public C93693aUz(Context context) {
        super(context, null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZJ(this, 0, 0, 0, 0, null, null, null, null, null, null, 1023));
        C94623ajz attrBlock = C94623ajz.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, this);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C93691aUx c93691aUx = new C93691aUx(context2);
        c93691aUx.setLayoutParams(C93902aYM.LIZJ(this, 0, -2, 0, 0, Integer.valueOf(C93742aVm.LIZIZ(8)), null, null, null, Float.valueOf(1.0f), null, 748));
        new IDqS419S0100000_42(this, 50).invoke(c93691aUx);
        C93902aYM.LIZ(c93691aUx, this);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        C93695aV1 c93695aV1 = new C93695aV1(context3);
        c93695aV1.setLayoutParams(C93902aYM.LIZJ(this, 0, -2, 0, 0, Integer.valueOf(C93742aVm.LIZIZ(8)), null, null, null, Float.valueOf(1.0f), null, 748));
        new IDqS419S0100000_42(this, 51).invoke(c93695aV1);
        C93902aYM.LIZ(c93695aV1, this);
        setOrientation(0);
        setGravity(17);
    }

    public final void setTriggerInfo(C94219adT info) {
        o.LJIIIZ(info, "info");
        C93691aUx c93691aUx = this.LJLIL;
        if (c93691aUx != null) {
            String str = info.LJLIL;
            String string = getContext().getString(R.string.hj);
            o.LJIIIIZZ(string, "context.getString(Langua…ct_tool_trigger_helptext)");
            c93691aUx.LIZ(str, string);
            int i = C93689aUv.LIZ[info.LJLILLLLZI.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    ViewGroup viewGroup = this.LJLJJI;
                    if (viewGroup != null) {
                        C93729aVZ.LJI(viewGroup);
                        C94624ak0 c94624ak0 = this.LJLILLLLZI;
                        if (c94624ak0 != null) {
                            C93729aVZ.LJI(c94624ak0);
                            c94624ak0.setText("");
                            c94624ak0.setClickable(false);
                            c94624ak0.setTouchable(false);
                            c94624ak0.setFocusable(false);
                            c94624ak0.setFocusableInTouchMode(false);
                            c94624ak0.setHint(c94624ak0.getContext().getString(R.string.fv0));
                            ImageView imageView = this.LJLJI;
                            if (imageView != null) {
                                C93729aVZ.LJI(imageView);
                                C94217adR c94217adR = info.LJLJJI;
                                if (c94217adR != null) {
                                    ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
                                    Context context = getContext();
                                    o.LJIIIIZZ(context, "context");
                                    String str2 = c94217adR.LJLIL;
                                    ImageView imageView2 = this.LJLJI;
                                    if (imageView2 != null) {
                                        C94019aaF c94019aaF = new C94019aaF();
                                        ImageView imageView3 = this.LJLJI;
                                        if (imageView3 != null) {
                                            c94019aaF.LIZ = Integer.valueOf(imageView3.getHeight());
                                            ImageView imageView4 = this.LJLJI;
                                            if (imageView4 != null) {
                                                c94019aaF.LIZIZ = Integer.valueOf(imageView4.getHeight());
                                                c94019aaF.LJII = 0;
                                                c94019aaF.LIZIZ(ImageView.ScaleType.CENTER_INSIDE);
                                                imageLoaderService.compatLoadBitmap(context, str2, imageView2, new C94020aaG(c94019aaF), null);
                                                C94624ak0 c94624ak02 = this.LJLILLLLZI;
                                                if (c94624ak02 != null) {
                                                    C93729aVZ.LIZLLL(c94624ak02);
                                                    return;
                                                } else {
                                                    o.LJIJI("extraStringEditText");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("extraFeatureImageView");
                                            throw null;
                                        }
                                        o.LJIJI("extraFeatureImageView");
                                        throw null;
                                    }
                                    o.LJIJI("extraFeatureImageView");
                                    throw null;
                                }
                                ImageView imageView5 = this.LJLJI;
                                if (imageView5 != null) {
                                    C93729aVZ.LIZJ(imageView5);
                                    return;
                                } else {
                                    o.LJIJI("extraFeatureImageView");
                                    throw null;
                                }
                            }
                            o.LJIJI("extraFeatureImageView");
                            throw null;
                        }
                        o.LJIJI("extraStringEditText");
                        throw null;
                    }
                    o.LJIJI("extraContainer");
                    throw null;
                }
                ViewGroup viewGroup2 = this.LJLJJI;
                if (viewGroup2 != null) {
                    C93729aVZ.LJI(viewGroup2);
                    C94624ak0 c94624ak03 = this.LJLILLLLZI;
                    if (c94624ak03 != null) {
                        C93729aVZ.LJI(c94624ak03);
                        c94624ak03.setTouchable(true);
                        c94624ak03.setClickable(true);
                        c94624ak03.setFocusable(true);
                        c94624ak03.setFocusableInTouchMode(true);
                        c94624ak03.setHint("0.0s");
                        ImageView imageView6 = this.LJLJI;
                        if (imageView6 != null) {
                            C93729aVZ.LIZLLL(imageView6);
                            Double d = info.LJLJI;
                            if (d == null) {
                                return;
                            }
                            double doubleValue = d.doubleValue();
                            C94624ak0 c94624ak04 = this.LJLILLLLZI;
                            if (c94624ak04 != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(new DecimalFormat("0.0").format(doubleValue));
                                LIZ.append('s');
                                c94624ak04.setText(X1D.LIZIZ(LIZ));
                                return;
                            }
                            o.LJIJI("extraStringEditText");
                            throw null;
                        }
                        o.LJIJI("extraFeatureImageView");
                        throw null;
                    }
                    o.LJIJI("extraStringEditText");
                    throw null;
                }
                o.LJIJI("extraContainer");
                throw null;
            }
            ViewGroup viewGroup3 = this.LJLJJI;
            if (viewGroup3 != null) {
                C93729aVZ.LIZJ(viewGroup3);
                return;
            } else {
                o.LJIJI("extraContainer");
                throw null;
            }
        }
        o.LJIJI("elementContainer");
        throw null;
    }
}

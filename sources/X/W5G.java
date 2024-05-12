package X;

import Y.ARunnableS20S0110000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public class W5G extends VA8 {
    public static InterfaceC81718W5i sDefaultDraweePlaceHolderConfig;
    public static W4P<? extends AbstractC81686W4c> sDraweecontrollerbuildersupplier;
    public static boolean sEnableLazySize;
    public static boolean sEnableVisibleOpt;
    public static W65 sIDraweecontrollerbuildersupplier;
    public C81729W5t<AbstractC81686W4c> mControllerBuilder;

    private void setDefaultPlaceHolder(TypedArray typedArray) {
    }

    public static void shutDown() {
        sDraweecontrollerbuildersupplier = null;
    }

    static {
        C60700Ns0.LIZJ.getClass();
        sDraweecontrollerbuildersupplier = (W4P) C60700Ns0.LIZIZ.getValue();
        sEnableVisibleOpt = true;
    }

    public AbstractC81686W4c getControllerBuilder() {
        return this.mControllerBuilder.LIZ();
    }

    public android.net.Uri getImageUri() {
        InterfaceC81252Vui controller = getController();
        if (controller instanceof W4R) {
            W5O w5o = ((W4R) controller).LJIJI;
            if (w5o instanceof W5O) {
                return w5o.LIZIZ;
            }
            return null;
        }
        return null;
    }

    public W5G(Context context) {
        super(context);
        this.mControllerBuilder = new C81710W5a(this);
        init(context, null);
    }

    public static void enableLazySize(boolean z) {
        sEnableLazySize = z;
    }

    public static void enableVisibleOpt(boolean z) {
        sEnableVisibleOpt = z;
    }

    public static void initialize(W4P<? extends AbstractC81686W4c> w4p) {
        sDraweecontrollerbuildersupplier = w4p;
        w4p.get().getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onVisibilityAggregated(boolean z) {
        FT1.LIZ().execute(new ARunnableS20S0110000_14(this, z, 1));
    }

    public void setActualImageResource(int i) {
        setActualImageResource(i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(W5O w5o) {
        AbstractC81686W4c LIZ = this.mControllerBuilder.LIZ();
        LIZ.LIZLLL = w5o;
        LIZ.LJIIL = getController();
        setController(LIZ.LIZ());
    }

    @Override // X.VA9, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // X.VA9, android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public static void initialize(W65 w65) {
        sIDraweecontrollerbuildersupplier = w65;
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public W5G(Context context, V92 v92) {
        super(context, v92);
        this.mControllerBuilder = new C81710W5a(this);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            C81939WDv.LIZIZ();
            if (isInEditMode()) {
                getHierarchy().LJIL(null);
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else if (sDraweecontrollerbuildersupplier == null) {
                C32151Nz.LJIIIIZZ(((C81721W5l) sIDraweecontrollerbuildersupplier).LIZ(), "SimpleDraweeView was not initialized!");
                sDraweecontrollerbuildersupplier = ((C81721W5l) sIDraweecontrollerbuildersupplier).LIZ();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.v3, R.attr.v4, R.attr.v5, R.attr.xa, R.attr.acv, R.attr.acw, R.attr.acx, R.attr.b3j, R.attr.b4s, R.attr.b4t, R.attr.b5b, R.attr.b5t, R.attr.b5u, R.attr.b5v, R.attr.b7q, R.attr.b7r, R.attr.b8t, R.attr.b8u, R.attr.b8v, R.attr.b8w, R.attr.b8x, R.attr.b90, R.attr.b91, R.attr.b92, R.attr.b93, R.attr.b94, R.attr.b9b, R.attr.b9e, R.attr.b9f, R.attr.b9g, R.attr.bw9});
                try {
                    if (obtainStyledAttributes.hasValue(2)) {
                        setImageURI(android.net.Uri.parse(C16880lQ.LLLZLZ(obtainStyledAttributes, 2)), (Object) null);
                    } else if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    setDefaultPlaceHolder(obtainStyledAttributes);
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    private void setDefaultFailureImage(TypedArray typedArray, InterfaceC81718W5i interfaceC81718W5i) {
        InterfaceC78716Uuu LJ;
        if (typedArray.hasValue(5)) {
            return;
        }
        if (interfaceC81718W5i.LJ() == null) {
            LJ = InterfaceC78716Uuu.LJJJLZIJ;
        } else {
            LJ = interfaceC81718W5i.LJ();
        }
        Drawable LJI = interfaceC81718W5i.LJI();
        if (LJI != null) {
            V92 hierarchy = getHierarchy();
            hierarchy.LJIILL(LJI, 5);
            hierarchy.LJIIL(5).LJIIZILJ(LJ);
        } else {
            if (interfaceC81718W5i.LIZ() != 0) {
                V92 hierarchy2 = getHierarchy();
                hierarchy2.LJIILL(hierarchy2.LIZIZ.getDrawable(interfaceC81718W5i.LIZ()), 5);
                hierarchy2.LJIIL(5).LJIIZILJ(LJ);
                return;
            }
            if (interfaceC81718W5i.LJFF() != 0) {
                V92 hierarchy3 = getHierarchy();
                hierarchy3.LJIILL(hierarchy3.LIZIZ.getDrawable(interfaceC81718W5i.LJFF()), 5);
                hierarchy3.LJIIL(5).LJIIZILJ(LJ);
            }
        }
    }

    private void setDefaultPlaceHolderImage(TypedArray typedArray, InterfaceC81718W5i interfaceC81718W5i) {
        InterfaceC78716Uuu LIZLLL;
        if (typedArray.hasValue(8)) {
            return;
        }
        if (interfaceC81718W5i.LIZLLL() == null) {
            LIZLLL = InterfaceC78716Uuu.LJJJLZIJ;
        } else {
            LIZLLL = interfaceC81718W5i.LIZLLL();
        }
        Drawable LJI = interfaceC81718W5i.LJI();
        if (LJI != null) {
            getHierarchy().LJIJJ(LJI, LIZLLL);
        } else if (interfaceC81718W5i.LIZJ() != 0) {
            getHierarchy().LJIJI(interfaceC81718W5i.LIZJ(), LIZLLL);
        } else if (interfaceC81718W5i.LIZIZ() != 0) {
            getHierarchy().LJIJI(interfaceC81718W5i.LIZIZ(), LIZLLL);
        }
    }

    public void setActualImageResource(int i, Object obj) {
        setImageURI(C78964Uyu.LIZJ(i), obj);
    }

    public void setImageURI(android.net.Uri uri, Object obj) {
        if (sEnableLazySize && uri != null) {
            AbstractC81686W4c LIZ = this.mControllerBuilder.LIZ();
            LIZ.LIZJ = obj;
            LIZ.LJIIL = getController();
            setLazySizeAttach(new UHT(W5P.LIZLLL(uri), LIZ, this));
            return;
        }
        AbstractC81686W4c LIZ2 = this.mControllerBuilder.LIZ();
        LIZ2.LIZJ = obj;
        C81705W4v c81705W4v = (C81705W4v) LIZ2;
        c81705W4v.LJI(uri);
        c81705W4v.LJIIL = getController();
        setController(c81705W4v.LIZ());
    }

    public W5G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mControllerBuilder = new C81710W5a(this);
        init(context, attributeSet);
    }

    public void setImageURI(String str, Object obj) {
        android.net.Uri uri;
        if (str != null) {
            uri = android.net.Uri.parse(str);
        } else {
            uri = null;
        }
        setImageURI(uri, obj);
    }

    public W5G(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mControllerBuilder = new C81710W5a(this);
        init(context, attributeSet);
    }

    public W5G(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mControllerBuilder = new C81710W5a(this);
        init(context, attributeSet);
    }
}

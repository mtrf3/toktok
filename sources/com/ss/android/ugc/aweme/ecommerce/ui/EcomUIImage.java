package com.ss.android.ugc.aweme.ecommerce.ui;

import X.C58403Mw3;
import X.C61826OOg;
import X.C61828OOi;
import X.N3O;
import X.OSZ;
import X.V9P;
import X.VNU;
import X.VPA;
import X.VPD;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.ui.image.UIImage;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class EcomUIImage extends UIImage<V9P> {
    public static final Field LJLJLLL;
    public static final Field LJLL;
    public final String LJLIL;
    public HashMap<String, Object> LJLILLLLZI;
    public HashMap<String, Object> LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public final HashMap<String, Long> LJLJLJ;

    static {
        Field field;
        Field field2 = null;
        try {
            field = V9P.class.getDeclaredField("mLoaderCallback");
            field.setAccessible(true);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            field = null;
        }
        LJLJLLL = field;
        try {
            Field declaredField = V9P.class.getDeclaredField("mCurImageRequest");
            declaredField.setAccessible(true);
            field2 = declaredField;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused2) {
        }
        LJLL = field2;
    }

    public final boolean LJIJJLI() {
        String str;
        if (this.LJLJJLL > 0 && (str = this.LJLJJI) != null) {
            this.LJLJL = str;
            super.setSource(str);
            this.LJLJLJ.put(str, Long.valueOf(System.currentTimeMillis()));
            this.LJLJJLL--;
            super.onPropsUpdated();
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        String str = this.LJLJJI;
        if (str != null && this.LJLJJL) {
            LJIL(str);
            String LIZ = N3O.LIZ.LIZ(str);
            this.LJLJL = LIZ;
            if (!o.LJ(LIZ, str)) {
                LJIL(this.LJLJL);
            }
            super.setSource(this.LJLJL);
            this.LJLJLJ.put(this.LJLJL, Long.valueOf(System.currentTimeMillis()));
            this.LJLJJLL = 1;
            this.LJLJJL = false;
        }
        super.onPropsUpdated();
    }

    public final void LJIL(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.LJLIL;
        if (str2 != null) {
            C58403Mw3.LIZJ(str, new OSZ("page_name", str2));
        }
        C58403Mw3.LIZIZ(str, this.LJLJI);
        C58403Mw3.LIZIZ(str, this.LJLILLLLZI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(VPA vpa) {
        super.afterPropsUpdated(vpa);
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final V9P createView(Context context) {
        Object obj;
        V9P view = super.createView(context);
        o.LJIIIIZZ(view, "view");
        Field field = LJLJLLL;
        C61828OOi c61828OOi = null;
        if (field != null) {
            obj = field.get(view);
        } else {
            obj = null;
        }
        if (obj instanceof C61828OOi) {
            c61828OOi = (C61828OOi) obj;
        }
        view.setImageLoaderCallback(new C61826OOg(c61828OOi, this, view));
        return view;
    }

    @VPD(name = "func-params")
    public final void setFuncParams(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (readableMap != null) {
            hashMap = readableMap.asHashMap();
        } else {
            hashMap = null;
        }
        this.LJLJI = hashMap;
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.image.AbsUIImage
    public final void setSource(String str) {
        if (!o.LJ(this.LJLJJI, str)) {
            this.LJLJJI = str;
            this.LJLJJL = true;
        }
    }

    @VPD(name = "track-params")
    public final void setTrackParams(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (readableMap != null) {
            hashMap = readableMap.asHashMap();
        } else {
            hashMap = null;
        }
        this.LJLILLLLZI = hashMap;
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    public EcomUIImage(VNU vnu, String str) {
        super(vnu);
        this.LJLIL = str;
        this.LJLJJLL = 1;
        this.LJLJLJ = new HashMap<>();
    }
}

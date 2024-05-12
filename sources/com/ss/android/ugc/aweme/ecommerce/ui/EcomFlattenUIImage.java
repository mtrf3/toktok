package com.ss.android.ugc.aweme.ecommerce.ui;

import X.C58403Mw3;
import X.C61828OOi;
import X.C61829OOj;
import X.N3O;
import X.OSZ;
import X.V9H;
import X.VNU;
import X.VPA;
import X.VPD;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.ui.image.FlattenUIImage;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class EcomFlattenUIImage extends FlattenUIImage {
    public static final Field LJLJLLL;
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
        try {
            field = V9H.class.getDeclaredField("LJIILL");
            field.setAccessible(true);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            field = null;
        }
        LJLJLLL = field;
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

    @Override // com.lynx.tasm.ui.image.FlattenUIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
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

    @Override // com.lynx.tasm.ui.image.FlattenUIImage, com.lynx.tasm.behavior.ui.LynxFlattenUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        super.onAttach();
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
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

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setDataset(ReadableMap readableMap) {
        super.setDataset(readableMap);
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

    @Override // com.lynx.tasm.ui.image.FlattenUIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setImageConfig(String str) {
        super.setImageConfig(str);
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setPlaceholder(String str) {
        super.setPlaceholder(str);
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setPreFetchHeight(String str) {
        super.setPreFetchHeight(str);
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setPreFetchWidth(String str) {
        super.setPreFetchWidth(str);
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setSkipRedirection(boolean z) {
        super.setSkipRedirection(z);
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
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

    public EcomFlattenUIImage(VNU vnu, String str) {
        super(vnu);
        Object obj;
        this.LJLIL = str;
        Field field = LJLJLLL;
        if (field != null) {
            obj = field.get(this.mLynxImageManager);
        } else {
            obj = null;
        }
        C61828OOi c61828OOi = obj instanceof C61828OOi ? (C61828OOi) obj : null;
        if (field != null) {
            field.set(this.mLynxImageManager, new C61829OOj(c61828OOi, this));
        }
        this.LJLJJLL = 1;
        this.LJLJLJ = new HashMap<>();
    }
}

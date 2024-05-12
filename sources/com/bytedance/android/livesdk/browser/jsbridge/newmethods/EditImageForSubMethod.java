package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B81;
import X.C38131Exr;
import X.C68322mC;
import X.C73969T1h;
import X.C76878UFe;
import X.C76883UFj;
import X.CN1;
import X.EnumC76880UFg;
import X.InterfaceC65349Pkn;
import X.T16;
import X.UG0;
import X.UGM;
import X.UGN;
import Y.AfS62S0200000_13;
import Y.IDhS10S1100000_5;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.browser.emote.CropEmoteFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public final class EditImageForSubMethod extends AbstractC38123Exj<Params, Result> {
    public Params LJLIL;
    public Fragment LJLILLLLZI;
    public final UGM LJLJI;

    /* loaded from: classes14.dex */
    public static final class Params {

        @InterfaceC65349Pkn("base64Data")
        public String base64;

        @InterfaceC65349Pkn("emotes_show_style")
        public int emotesShowStyle;

        @InterfaceC65349Pkn("logInfo")
        public Map<String, ? extends Object> logInfo = new HashMap();

        @InterfaceC65349Pkn("max_height")
        public int max_height;

        @InterfaceC65349Pkn("max_size")
        public int max_size;

        @InterfaceC65349Pkn("max_width")
        public int max_width;

        @InterfaceC65349Pkn("min_height")
        public int min_height;

        @InterfaceC65349Pkn("min_width")
        public int min_width;

        @InterfaceC65349Pkn("url")
        public String url;
    }

    /* loaded from: classes14.dex */
    public static final class Result {

        @InterfaceC65349Pkn("edit_status")
        public Integer editStatus = 0;

        @InterfaceC65349Pkn("tempFiles")
        public PhotoFile tempFiles;

        /* loaded from: classes14.dex */
        public static final class PhotoFile {

            @InterfaceC65349Pkn("base64Data")
            public String base64;

            @InterfaceC65349Pkn("path")
            public String path;

            @InterfaceC65349Pkn("size")
            public int size;

            @InterfaceC65349Pkn("with_text_sticker")
            public int withTextSticker;
        }
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    public EditImageForSubMethod(SparkContext sparkContext) {
        Fragment fragment;
        o.LJIIIZ(sparkContext, "sparkContext");
        this.LJLJI = new UGM(this);
        Object LJIILL = sparkContext.LJIILL();
        if (LJIILL instanceof SparkPopup) {
            this.LJLILLLLZI = (Fragment) LJIILL;
            return;
        }
        if (!(LJIILL instanceof ActivityC45651qj)) {
            return;
        }
        List<Fragment> LJJJJLI = ((ActivityC45651qj) LJIILL).getSupportFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "container.supportFragmentManager.fragments");
        Iterator<Fragment> it = LJJJJLI.iterator();
        while (true) {
            if (it.hasNext()) {
                fragment = it.next();
                if (fragment instanceof SparkFragment) {
                    break;
                }
            } else {
                fragment = null;
                break;
            }
        }
        this.LJLILLLLZI = fragment;
    }

    public EditImageForSubMethod(BaseFragment baseFragment) {
        this.LJLJI = new UGM(this);
        this.LJLILLLLZI = baseFragment;
    }

    public final void LJJIFFI(CropEmoteFragment cropEmoteFragment, Bitmap bitmap) {
        FragmentManager fragmentManager;
        EnumC76880UFg enumC76880UFg;
        FragmentManager childFragmentManager;
        Params params = this.LJLIL;
        if (params != null) {
            if (bitmap != null) {
                if (bitmap.getHeight() * bitmap.getWidth() > params.max_size) {
                    return;
                }
            }
            int i = params.emotesShowStyle;
            if (i != 1 && i != 2) {
                cropEmoteFragment.LJLJJLL = new AqS195S0100000_13(this, 16);
                Fragment fragment = this.LJLILLLLZI;
                if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
                    cropEmoteFragment.show(childFragmentManager, "upload_photo");
                    return;
                }
                return;
            }
            Fragment fragment2 = this.LJLILLLLZI;
            if (fragment2 == null || (fragmentManager = fragment2.getFragmentManager()) == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(params.logInfo);
            linkedHashMap.put("entrance", "edit");
            if (bitmap.getWidth() == bitmap.getHeight()) {
                enumC76880UFg = EnumC76880UFg.XY_SCALE_TO_CENTER;
            } else {
                enumC76880UFg = EnumC76880UFg.XY_MOVE_TO_CENTER;
            }
            ((IHostSubscription) CN1.LIZ(IHostSubscription.class)).Hh(new C76883UFj(fragmentManager, enumC76880UFg, UG0.BITMAP, params.emotesShowStyle, linkedHashMap, new C76878UFe(params.min_width, params.min_height, params.max_width, params.max_height, params.max_size), true, bitmap, null, null, this.LJLJI, 1792));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, android.graphics.Bitmap] */
    @Override // X.AbstractC38123Exj
    public final void invoke(Params params, C38131Exr context) {
        Params params2 = params;
        o.LJIIIZ(params2, "params");
        o.LJIIIZ(context, "context");
        this.LJLIL = params2;
        String str = params2.base64;
        String str2 = params2.url;
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        if (str != null) {
            if (ujb.o.LJJJLIIL(str, "data:image/jpg;base64,", false)) {
                String LJLLI = s.LJLLI(str, "data:image/jpg;base64,", str);
                byte[] decode = Base64.decode(LJLLI, 0);
                c68322mC.element = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                LJJIFFI(UGN.LIZ(LJLLI), (Bitmap) c68322mC.element);
                return;
            }
            if (ujb.o.LJJJLIIL(str, "data:image/png;base64,", false)) {
                String LJLLI2 = s.LJLLI(str, "data:image/png;base64,", str);
                byte[] decode2 = Base64.decode(LJLLI2, 0);
                c68322mC.element = BitmapFactory.decodeByteArray(decode2, 0, decode2.length);
                LJJIFFI(UGN.LIZ(LJLLI2), (Bitmap) c68322mC.element);
                return;
            }
            if (ujb.o.LJJJLIIL(str, "data:image/webp;base64,", false)) {
                String LJLLI3 = s.LJLLI(str, "data:image/webp;base64,", str);
                byte[] decode3 = Base64.decode(LJLLI3, 0);
                c68322mC.element = BitmapFactory.decodeByteArray(decode3, 0, decode3.length);
                LJJIFFI(UGN.LIZ(LJLLI3), (Bitmap) c68322mC.element);
                return;
            }
        }
        if (str2 == null) {
            return;
        }
        AbstractC73672Svk.LJJIJIL(0).LJJL(T16.LIZ()).LJJIJL(new IDhS10S1100000_5(str2, c68322mC, 0)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0200000_13(c68322mC2, this, 11), B81.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod.Result r11, android.graphics.Bitmap r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod.LJJI(com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod$Result, android.graphics.Bitmap, java.lang.Integer):void");
    }
}

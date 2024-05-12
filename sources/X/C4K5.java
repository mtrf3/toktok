package X;

import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4K5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4K5 {
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C4K7.LJLIL);
    public static final java.util.Map<String, String> LJ = C113554cx.LJJL(new OSZ("[smile]", "im_e1.webp"), new OSZ("[happy]", "im_e2.webp"), new OSZ("[angry]", "im_e3.png"), new OSZ("[cry]", "im_e4.webp"), new OSZ("[embarrassed]", "im_e5.png"), new OSZ("[surprised]", "im_e6.webp"), new OSZ("[wronged]", "im_e7.webp"), new OSZ("[shout]", "im_e8.webp"), new OSZ("[flushed]", "im_e9.webp"), new OSZ("[yummy]", "im_e10.webp"), new OSZ("[complacent]", "im_e11.webp"), new OSZ("[drool]", "im_e12.webp"), new OSZ("[scream]", "im_e13.webp"), new OSZ("[weep]", "im_e14.png"), new OSZ("[speechless]", "im_e15.png"), new OSZ("[funnyface]", "im_e16.webp"), new OSZ("[laughwithtears]", "im_e17.webp"), new OSZ("[wicked]", "im_e18.webp"), new OSZ("[facewithrollingeyes]", "im_e19.webp"), new OSZ("[sulk]", "im_e20.png"), new OSZ("[thinking]", "im_e21.webp"), new OSZ("[lovely]", "im_e22.webp"), new OSZ("[greedy]", "im_e23.webp"), new OSZ("[wow]", "im_e24.webp"), new OSZ("[joyful]", "im_e25.webp"), new OSZ("[hehe]", "im_e26.webp"), new OSZ("[slap]", "im_e27.webp"), new OSZ("[tears]", "im_e28.webp"), new OSZ("[stun]", "im_e29.webp"), new OSZ("[cute]", "im_e30.webp"), new OSZ("[blink]", "im_e31.webp"), new OSZ("[disdain]", "im_e32.webp"), new OSZ("[astonish]", "im_e33.webp"), new OSZ("[rage]", "im_e34.webp"), new OSZ("[cool]", "im_e35.webp"), new OSZ("[excited]", "im_e36.webp"), new OSZ("[proud]", "im_e37.webp"), new OSZ("[smileface]", "im_e38.webp"), new OSZ("[evil]", "im_e39.webp"), new OSZ("[angel]", "im_e40.webp"), new OSZ("[laugh]", "im_e41.webp"), new OSZ("[pride]", "im_e42.webp"), new OSZ("[nap]", "im_e43.webp"), new OSZ("[loveface]", "im_e44.webp"), new OSZ("[awkward]", "im_e45.webp"), new OSZ("[shock]", "im_e46.png"));
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C4K4.LJLIL);
    public final C4K8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;

    public C4K5(C4K8 geckoEmojiUtils) {
        o.LJIIIZ(geckoEmojiUtils, "geckoEmojiUtils");
        this.LIZ = geckoEmojiUtils;
        this.LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1019));
        this.LIZJ = C221108m2.LIZIZ(C4K6.INSTANCE);
    }

    public final String LIZ(String str) {
        if (!this.LIZ.LIZIZ()) {
            return "";
        }
        Object LIZ = this.LIZ.LIZ(str);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C34B.LIZLLL("GeckoEmojiCacheManager", "getEmojiGeckoFilePath failed: ", m10exceptionOrNullimpl);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str2 = (String) LIZ;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final String LIZIZ(String text) {
        o.LJIIIZ(text, "text");
        java.util.Map<String, String> map = LJ;
        if (!map.containsKey(text)) {
            return "";
        }
        CharSequence charSequence = (CharSequence) ((java.util.Map) this.LIZIZ.getValue()).get(text);
        if (charSequence == null || charSequence.length() == 0) {
            String str = map.get(text);
            if (str == null) {
                return "";
            }
            ((java.util.Map) this.LIZIZ.getValue()).put(text, LIZ(str));
        }
        String str2 = (String) ((java.util.Map) this.LIZIZ.getValue()).get(text);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}

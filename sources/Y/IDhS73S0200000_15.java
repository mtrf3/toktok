package Y;

import X.AbstractC86724Y1w;
import X.C2058886e;
import X.C69392nv;
import X.C86715Y1n;
import X.C86716Y1o;
import X.C9XO;
import X.InterfaceC48038ItG;
import X.InterfaceC86733Y2f;
import X.Y01;
import X.Y20;
import X.Y2M;
import X.Y2U;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.StickerTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslatedSticker;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDhS73S0200000_15 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS73S0200000_15 iDhS73S0200000_15, Object obj) {
        DescriptionTranslationResult result = (DescriptionTranslationResult) obj;
        o.LJIIIZ(result, "result");
        C9XO[] values = C9XO.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (values[i].getStatusCode() == result.translationStatusCode) {
                    C86716Y1o c86716Y1o = C86716Y1o.LIZIZ;
                    InterfaceC86733Y2f interfaceC86733Y2f = (InterfaceC86733Y2f) iDhS73S0200000_15.l0;
                    String str = result.message;
                    if (str == null) {
                        str = Y2M.API_FAILED.name();
                    }
                    c86716Y1o.LJFF(interfaceC86733Y2f, str);
                } else {
                    i++;
                }
            } else {
                C86716Y1o c86716Y1o2 = C86716Y1o.LIZIZ;
                c86716Y1o2.getClass();
                Y2U y2u = (Y2U) C86716Y1o.LIZLLL.getValue();
                Aweme aweme = (Aweme) iDhS73S0200000_15.l1;
                String LIZIZ = C2058886e.LIZIZ(aweme);
                if (LIZIZ == null) {
                    LIZIZ = "";
                }
                String str2 = result.translatedContent;
                o.LJIIIIZZ(str2, "result.translatedContent");
                AbstractC86724Y1w.LJI(c86716Y1o2, (InterfaceC86733Y2f) iDhS73S0200000_15.l0, y2u.LJ(LIZIZ, str2, Y01.LIZIZ.LJJIIZI(), aweme).i());
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object apply$1(IDhS73S0200000_15 iDhS73S0200000_15, Object obj) {
        TranslationResult it = (TranslationResult) obj;
        o.LJIIIZ(it, "it");
        C86716Y1o c86716Y1o = C86716Y1o.LIZIZ;
        c86716Y1o.getClass();
        Y2U y2u = (Y2U) C86716Y1o.LIZLLL.getValue();
        Aweme aweme = (Aweme) iDhS73S0200000_15.l0;
        String LIZIZ = C2058886e.LIZIZ(aweme);
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        String str = it.translatedContent;
        o.LJIIIIZZ(str, "it.translatedContent");
        AbstractC86724Y1w.LJI(c86716Y1o, (InterfaceC86733Y2f) iDhS73S0200000_15.l1, y2u.LJ(LIZIZ, str, Y01.LIZIZ.LJJIIZI(), aweme).i());
        return Boolean.TRUE;
    }

    public static final Object apply$2(IDhS73S0200000_15 iDhS73S0200000_15, Object obj) {
        StickerTranslationResult it = (StickerTranslationResult) obj;
        o.LJIIIZ(it, "it");
        HashMap hashMap = new HashMap();
        for (TranslatedSticker translatedSticker : it.translatedStickers) {
            String str = translatedSticker.srcContent;
            o.LJIIIIZZ(str, "sticker.srcContent");
            String str2 = translatedSticker.translatedContent;
            o.LJIIIIZZ(str2, "sticker.translatedContent");
            hashMap.put(str, str2);
        }
        if (!hashMap.isEmpty()) {
            C86715Y1n c86715Y1n = C86715Y1n.LIZIZ;
            c86715Y1n.getClass();
            Y20 y20 = (Y20) C86715Y1n.LIZLLL.getValue();
            Aweme aweme = (Aweme) iDhS73S0200000_15.l0;
            String targetLang = Y01.LIZIZ.LJJIIZI();
            y20.getClass();
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(targetLang, "targetLang");
            C69392nv c69392nv = new C69392nv(targetLang, hashMap);
            y20.LIZLLL(aweme, c69392nv, targetLang);
            AbstractC86724Y1w.LJI(c86715Y1n, (InterfaceC86733Y2f) iDhS73S0200000_15.l1, c69392nv.LJLJI);
        } else {
            C86715Y1n.LIZIZ.LJFF((InterfaceC86733Y2f) iDhS73S0200000_15.l1, Y2M.API_FAILED.name());
        }
        return Boolean.valueOf(!hashMap.isEmpty());
    }

    public static final Object apply$3(IDhS73S0200000_15 iDhS73S0200000_15, Object obj) {
        MultiTranslationResult it = (MultiTranslationResult) obj;
        o.LJIIIZ(it, "it");
        HashMap hashMap = new HashMap();
        for (TranslationResult translationResult : it.results) {
            String str = translationResult.srcContent;
            o.LJIIIIZZ(str, "temp.srcContent");
            String str2 = translationResult.translatedContent;
            o.LJIIIIZZ(str2, "temp.translatedContent");
            hashMap.put(str, str2);
        }
        if (!hashMap.isEmpty()) {
            C86715Y1n c86715Y1n = C86715Y1n.LIZIZ;
            c86715Y1n.getClass();
            Y20 y20 = (Y20) C86715Y1n.LIZLLL.getValue();
            Aweme aweme = (Aweme) iDhS73S0200000_15.l0;
            String targetLang = Y01.LIZIZ.LJJIIZI();
            y20.getClass();
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(targetLang, "targetLang");
            C69392nv c69392nv = new C69392nv(targetLang, hashMap);
            y20.LIZLLL(aweme, c69392nv, targetLang);
            AbstractC86724Y1w.LJI(c86715Y1n, (InterfaceC86733Y2f) iDhS73S0200000_15.l1, c69392nv.LJLJI);
        } else {
            C86715Y1n.LIZIZ.LJFF((InterfaceC86733Y2f) iDhS73S0200000_15.l1, Y2M.API_FAILED.name());
        }
        return Boolean.valueOf(!hashMap.isEmpty());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDhS73S0200000_15(com.ss.android.ugc.aweme.feed.model.Aweme r2, X.InterfaceC86733Y2f r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDhS73S0200000_15.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, X.Y2f, int):void");
    }
}

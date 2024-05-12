package X;

import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.KEt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51387KEt extends AbstractC51386KEs {
    public boolean LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL;

    public View LIZJ(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
        Integer valueOf = Integer.valueOf(R.id.miy);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.miy);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.AbstractC51386KEs, X.InterfaceC70514Rlu
    public void Y0() {
        String str;
        Integer num;
        String str2;
        String str3;
        Word word;
        Word word2;
        Word word3;
        Word word4;
        if (!this.LJLLI) {
            return;
        }
        KF0 value = getCurrentSearchHintWord().getValue();
        String str4 = null;
        if (value != null && (word4 = value.LIZ) != null) {
            str = word4.getWord();
        } else {
            str = null;
        }
        if (o.LJ(str, getDefaultHintWord())) {
            return;
        }
        C188727au LIZ = LIZ();
        LIZ.LJIIIZ("words_source", "search_bar_outer");
        KF0 value2 = getCurrentSearchHintWord().getValue();
        if (value2 != null) {
            num = Integer.valueOf(value2.LIZIZ);
        } else {
            num = null;
        }
        LIZ.LJFF(num, "words_position");
        KF0 value3 = getCurrentSearchHintWord().getValue();
        if (value3 != null && (word3 = value3.LIZ) != null) {
            str2 = word3.getWord();
        } else {
            str2 = null;
        }
        LIZ.LJIIIZ("words_content", str2);
        KF0 value4 = getCurrentSearchHintWord().getValue();
        if (value4 != null && (word2 = value4.LIZ) != null) {
            str3 = word2.getId();
        } else {
            str3 = null;
        }
        LIZ.LJIIIZ("group_id", str3);
        KF0 value5 = getCurrentSearchHintWord().getValue();
        if (value5 != null && (word = value5.LIZ) != null) {
            str4 = word.getImplId();
        }
        LIZ.LJIIIZ("impr_id", str4);
        LIZ.LJIIIZ("search_position", getEntranceModel().LIZ);
        LIZ.LJIIIZ("search_entrance", getEntranceModel().LJII);
        java.util.Map<String, String> map = LIZ.LIZ;
        o.LJIIIIZZ(map, "generateGeneralLogEventM…               .builder()");
        C76542zS.LIZ("trending_words_show", map);
    }

    public void LJ() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            getCurrentSearchHintWord().observe(LJJIFFI, new AObserverS76S0100000_8(this, 2));
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 4)));
    }

    public void LJFF() {
        C16880lQ.LLLZIIL(R.layout.cfo, C16880lQ.LLZIL(getContext()), this);
        LJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r5 = this;
            X.KEK r0 = r5.getEntranceModel()
            X.Dxs r2 = r0.LJIIZILJ
            r0 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "context"
            if (r2 == 0) goto L39
            X.4Vt r1 = new X.4Vt
            r1.<init>()
            int r0 = r2.LJLILLLLZI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ = r0
            float r0 = X.C32151Nz.LJIIZILJ(r4)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.LIZJ = r0
            android.content.Context r0 = r5.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            android.graphics.drawable.Drawable r0 = r1.LIZ(r0)
            r5.setBackground(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L5f
        L39:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            android.content.Context r1 = r5.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
            r0 = 2130968601(0x7f040019, float:1.754586E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto L55
            int r0 = r0.intValue()
            r2.setColor(r0)
        L55:
            float r0 = X.C32151Nz.LJIIZILJ(r4)
            r2.setCornerRadius(r0)
            r5.setBackground(r2)
        L5f:
            X.KEK r0 = r5.getEntranceModel()
            X.KF5 r0 = r0.LJFF
            if (r0 == 0) goto L78
            int[] r1 = X.KF4.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            r2 = 2131379588(0x7f0a4584, float:1.837944E38)
            if (r1 == r0) goto L97
            r0 = 2
            if (r1 == r0) goto L79
        L78:
            return
        L79:
            android.content.Context r1 = r5.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
            r0 = 2130968757(0x7f0400b5, float:1.7546177E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto L78
            int r1 = r0.intValue()
            android.view.View r0 = r5.LIZJ(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
            goto L78
        L97:
            android.content.Context r1 = r5.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
            r0 = 2130968765(0x7f0400bd, float:1.7546193E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto L78
            int r1 = r0.intValue()
            android.view.View r0 = r5.LIZJ(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51387KEt.LJI():void");
    }

    public void LJII() {
        String str;
        Word word;
        C188727au LIZ = LIZ();
        LIZ.LJIIIZ("enter_from", getEntranceModel().LIZ);
        LIZ.LJIIIZ("search_entrance", getEntranceModel().LJII);
        LIZ.LJIIIZ("enter_method", "enter");
        KF0 value = getCurrentSearchHintWord().getValue();
        if (value == null || (word = value.LIZ) == null || (str = word.getWord()) == null) {
            str = "";
        }
        LIZ.LJIIIZ("search_keyword", str);
        java.util.Map<String, String> map = LIZ.LIZ;
        o.LJIIIIZZ(map, "generateGeneralLogEventM…               .builder()");
        C76542zS.LIZ("enter_search_blankpage", map);
    }

    public void W0() {
        C188727au LIZ = LIZ();
        String str = getEntranceModel().LJIIIZ;
        if (str == null) {
            str = getEntranceModel().LIZ;
        }
        LIZ.LJIIIZ("enter_from", str);
        LIZ.LJIIIZ("search_entrance", getEntranceModel().LJII);
        java.util.Map<String, String> map = LIZ.LIZ;
        o.LJIIIIZZ(map, "generateGeneralLogEventM…               .builder()");
        C76542zS.LIZ("show_search", map);
        this.LJLLI = true;
    }

    @Override // X.AbstractC51386KEs
    public SmartRoute LIZIZ(Context context) {
        Word word;
        SmartRoute LIZIZ = super.LIZIZ(context);
        String str = null;
        if (LIZIZ == null) {
            return null;
        }
        KF0 value = getCurrentSearchHintWord().getValue();
        if (value != null && (word = value.LIZ) != null) {
            try {
                str = GsonHolder.LIZLLL().LIZ().LJIILL(word);
                o.LJIIIIZZ(str, "{\n        GsonProvider.g…).gson.toJson(this)\n    }");
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                str = word.toString();
            }
        }
        LIZIZ.withParam("inbox_word", str);
        return LIZIZ;
    }

    public void LIZLLL(String str) {
        ((TextView) LIZJ(R.id.miy)).setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51387KEt(Context context, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro interfaceC65784Pro) {
        super(context, eCSearchEntranceData, kek, interfaceC65784Pro);
        this.LJLLILLLL = C62850Ola.LJFF(context, "context");
        LJFF();
        LJ();
        setDefaultHintWordInView(kek.LJ);
    }
}

package X;

import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.KEu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51388KEu extends AbstractC51386KEs {
    public final java.util.Map<Integer, View> LJLLI;

    public final View LIZJ(int i) {
        java.util.Map<Integer, View> map = this.LJLLI;
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

    @Override // X.InterfaceC70514Rlu
    public final void W0() {
    }

    @Override // X.AbstractC51386KEs
    public final C188727au LIZ() {
        Integer num;
        String str;
        String str2;
        Word word;
        Word word2;
        Word word3;
        C188727au LIZ = super.LIZ();
        LIZ.LJIIIZ("words_source", getEntranceModel().LJIIJJI);
        KF0 value = getCurrentSearchHintWord().getValue();
        String str3 = null;
        if (value != null) {
            num = Integer.valueOf(value.LIZIZ);
        } else {
            num = null;
        }
        LIZ.LJFF(num, "words_position");
        KF0 value2 = getCurrentSearchHintWord().getValue();
        if (value2 != null && (word3 = value2.LIZ) != null) {
            str = word3.getWord();
        } else {
            str = null;
        }
        LIZ.LJIIIZ("words_content", str);
        KF0 value3 = getCurrentSearchHintWord().getValue();
        if (value3 != null && (word2 = value3.LIZ) != null) {
            str2 = word2.getId();
        } else {
            str2 = null;
        }
        LIZ.LJIIIZ("group_id", str2);
        KF0 value4 = getCurrentSearchHintWord().getValue();
        if (value4 != null && (word = value4.LIZ) != null) {
            str3 = word.getImplId();
        }
        LIZ.LJIIIZ("impr_id", str3);
        LIZ.LJIIIZ("search_position", getEntranceModel().LIZ);
        LIZ.LIZLLL(1, "is_ecom_search");
        return LIZ;
    }

    @Override // X.AbstractC51386KEs, X.InterfaceC70514Rlu
    public final void Y0() {
        String str;
        Word word;
        KF0 value = getCurrentSearchHintWord().getValue();
        if (value != null && (word = value.LIZ) != null) {
            str = word.getWord();
        } else {
            str = null;
        }
        if (o.LJ(str, getDefaultHintWord())) {
            return;
        }
        java.util.Map<String, String> map = LIZ().LIZ;
        o.LJIIIIZZ(map, "generateGeneralLogEventMap().builder()");
        C76542zS.LIZ("trending_words_show", map);
    }

    @Override // X.AbstractC51386KEs
    public final SmartRoute LIZIZ(Context context) {
        String str;
        SmartRoute LIZIZ;
        Word word;
        KF0 value = getCurrentSearchHintWord().getValue();
        if (value != null && (word = value.LIZ) != null) {
            str = word.getWord();
        } else {
            str = null;
        }
        if (!C78685UuP.LJJJZ(str) || (LIZIZ = super.LIZIZ(context)) == null) {
            return null;
        }
        LIZIZ.withParam("enter_method", getEntranceModel().LJIIJ);
        LIZIZ.withParam("keyword", str);
        LIZIZ.withParam("search_hint_word", str);
        LIZIZ.withParam("back_flag", 1);
        return LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51388KEu(Context context, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro interfaceC65784Pro) {
        super(context, eCSearchEntranceData, kek, interfaceC65784Pro);
        this.LJLLI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.cfr, C16880lQ.LLZIL(getContext()), this);
        setVisibility(8);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
        if (LJJIFFI != null) {
            getCurrentSearchHintWord().observe(LJJIFFI, new AObserverS76S0100000_8(this, 4));
        }
        TuxTextView tuxTextView = (TuxTextView) LIZJ(R.id.miy);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS28S0100000_8(this, 6));
        }
        setDefaultHintWordInView(null);
    }
}

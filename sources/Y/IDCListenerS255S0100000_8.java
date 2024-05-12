package Y;

import X.C32151Nz;
import X.C47261Igj;
import X.C47959Irz;
import X.C49133JQb;
import X.C49475JbL;
import X.C50191Jmt;
import X.C51390KEw;
import X.C7MY;
import X.InterfaceC49479JbP;
import X.InterfaceC49482JbS;
import X.JUH;
import X.KF0;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.lynx.react.bridge.Callback;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IDCListenerS255S0100000_8 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS255S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS255S0100000_8 iDCListenerS255S0100000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        Word word;
        KF0 value = ((C51390KEw) iDCListenerS255S0100000_8.l0).getCurrentSearchHintWord().getValue();
        if (value != null && (word = value.LIZ) != null) {
            str = word.getWord();
        } else {
            str = null;
        }
        if ((i7 - i5 == i3 - i && ((C51390KEw) iDCListenerS255S0100000_8.l0).LJLLJ) || str == null || o.LJ(str, ((C51390KEw) iDCListenerS255S0100000_8.l0).getDefaultHintWord())) {
            return;
        }
        int width = (((C51390KEw) iDCListenerS255S0100000_8.l0).getWidth() - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)) + C7MY.LIZIZ(30))) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)) + C47959Irz.LIZJ(2, C7MY.LIZIZ(12)));
        Iterator it = C47261Igj.LJJIJIIJI(41, 51, 61, 71).iterator();
        while (it.hasNext()) {
            ((TuxTextView) ((C51390KEw) iDCListenerS255S0100000_8.l0).LIZJ(R.id.miz)).setTuxFont(((Number) it.next()).intValue());
            if (((TextView) ((C51390KEw) iDCListenerS255S0100000_8.l0).LIZJ(R.id.miz)).getPaint().measureText(str) < width) {
                break;
            }
        }
        ((C51390KEw) iDCListenerS255S0100000_8.l0).LJLLJ = true;
    }

    public static final void onLayoutChange$1(IDCListenerS255S0100000_8 iDCListenerS255S0100000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS255S0100000_8);
        C49133JQb.LIZ("qwwr", "scroll to index layout finish");
        Callback callback = (Callback) iDCListenerS255S0100000_8.l0;
        if (callback != null) {
            callback.invoke(0, new JSONObject());
        }
    }

    public static final void onLayoutChange$2(IDCListenerS255S0100000_8 iDCListenerS255S0100000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS255S0100000_8);
        JUH juh = ((SearchJediMixFeedFragment) iDCListenerS255S0100000_8.l0).LLLLIIIILLL;
        if (juh != null) {
            juh.LJFF();
        }
    }

    public static final void onLayoutChange$3(IDCListenerS255S0100000_8 iDCListenerS255S0100000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS255S0100000_8);
        JUH juh = ((SearchFeedFragment) iDCListenerS255S0100000_8.l0).LLJLLL;
        if (juh != null) {
            juh.LJFF();
        }
    }

    public static final void onLayoutChange$4(IDCListenerS255S0100000_8 iDCListenerS255S0100000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS255S0100000_8);
        C50191Jmt.LIZJ((ViewGroup) iDCListenerS255S0100000_8.l0);
    }

    public static final void onLayoutChange$5(IDCListenerS255S0100000_8 iDCListenerS255S0100000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS255S0100000_8);
        C49475JbL c49475JbL = (C49475JbL) iDCListenerS255S0100000_8.l0;
        if (c49475JbL.LJFF && c49475JbL.LJ == null) {
            InterfaceC49479JbP interfaceC49479JbP = c49475JbL.LIZJ;
            RecyclerView recyclerView = c49475JbL.LIZ;
            Set<InterfaceC49482JbS> keySet = c49475JbL.LIZ().keySet();
            o.LJIIIIZZ(keySet, "attachedChildAbilityMap.keys");
            InterfaceC49482JbS LIZIZ = interfaceC49479JbP.LIZIZ(recyclerView, 0, keySet);
            if (LIZIZ != null && (searchServiceCenter$AutoPlayAbility = ((C49475JbL) iDCListenerS255S0100000_8.l0).LIZ().get(LIZIZ)) != null) {
                ((C49475JbL) iDCListenerS255S0100000_8.l0).LIZIZ(searchServiceCenter$AutoPlayAbility);
            }
        }
    }
}

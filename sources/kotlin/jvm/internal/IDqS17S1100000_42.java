package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C93742aVm;
import X.C93806aWo;
import X.C94019aaF;
import X.C94020aaG;
import X.C94163acZ;
import X.C94210adK;
import X.C94262aeA;
import X.C94383ag7;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.viewmodel.VoiceSearchLanguageSettingViewModel;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import java.util.List;

/* loaded from: classes34.dex */
public class IDqS17S1100000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS17S1100000_42 iDqS17S1100000_42, Object obj) {
        C94163acZ receiver = (C94163acZ) obj;
        o.LJIIIZ(receiver, "$receiver");
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        Context context = receiver.getContext();
        o.LJIIIIZZ(context, "context");
        String str = iDqS17S1100000_42.s0;
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.CENTER_INSIDE);
        c94019aaF.LJII = 0;
        c94019aaF.LIZ = Integer.valueOf(((C94210adK) iDqS17S1100000_42.l1).getHeight());
        c94019aaF.LIZIZ = Integer.valueOf(((C94210adK) iDqS17S1100000_42.l1).getHeight());
        imageLoaderService.compatLoadBitmap(context, str, receiver, new C94020aaG(c94019aaF), null);
        receiver.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        receiver.setRadius(C93742aVm.LIZIZ(6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS17S1100000_42 iDqS17S1100000_42, Object it) {
        List<C94383ag7> subList;
        o.LJIIIZ(it, "it");
        C93806aWo c93806aWo = (C93806aWo) iDqS17S1100000_42.l1;
        String str = iDqS17S1100000_42.s0;
        C94262aeA c94262aeA = c93806aWo.LJLIL;
        TextView textView = c93806aWo.LJLILLLLZI.LJLJJI;
        o.LJIIIIZZ(textView, "binding.tvMore");
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0) {
            List<C94383ag7> list = c94262aeA.LJLILLLLZI;
            subList = list.subList(0, Math.min(c94262aeA.LJLJI, list.size()));
        } else {
            subList = c94262aeA.LJLILLLLZI;
        }
        c94262aeA.LJLIL = subList;
        c94262aeA.notifyDataSetChanged();
        TextView textView2 = c93806aWo.LJLILLLLZI.LJLJJI;
        o.LJIIIIZZ(textView2, "binding.tvMore");
        CharSequence text2 = textView2.getText();
        if (text2 == null || text2.length() == 0) {
            TextView textView3 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView3, "binding.tvMore");
            textView3.setText(str);
            TextView textView4 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView4, "binding.tvMore");
            textView4.setScaleY(1.0f);
        } else {
            TextView textView5 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView5, "binding.tvMore");
            textView5.setText("");
            TextView textView6 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView6, "binding.tvMore");
            textView6.setScaleY(-1.0f);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS17S1100000_42 iDqS17S1100000_42, Object runOnUIThread) {
        o.LJIIIZ(runOnUIThread, "$this$runOnUIThread");
        ((VoiceSearchViewModel) iDqS17S1100000_42.l1).setState(new IDqS9S1000000_42(iDqS17S1100000_42.s0, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS17S1100000_42 iDqS17S1100000_42, Object it) {
        o.LJIIIZ(it, "it");
        ((VoiceSearchLanguageSettingViewModel) iDqS17S1100000_42.l1).setState(new IDqS9S1000000_42(iDqS17S1100000_42.s0, 3));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS17S1100000_42(C93806aWo c93806aWo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c93806aWo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS17S1100000_42(VoiceSearchViewModel voiceSearchViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = voiceSearchViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS17S1100000_42(VoiceSearchLanguageSettingViewModel voiceSearchLanguageSettingViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = voiceSearchLanguageSettingViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS17S1100000_42(String str, C94210adK c94210adK, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c94210adK;
    }
}

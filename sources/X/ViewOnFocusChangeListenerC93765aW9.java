package X;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import java.text.DecimalFormat;
import kotlin.jvm.internal.o;

/* renamed from: X.aW9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnFocusChangeListenerC93765aW9 implements View.OnFocusChangeListener {
    public final /* synthetic */ BehaviourEditFragment LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;
    public final /* synthetic */ AbstractC94370afu LJLJI;

    public ViewOnFocusChangeListenerC93765aW9(BehaviourEditFragment behaviourEditFragment, EditText editText, AbstractC94370afu abstractC94370afu) {
        this.LJLIL = behaviourEditFragment;
        this.LJLILLLLZI = editText;
        this.LJLJI = abstractC94370afu;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        double parseDouble;
        if (!z) {
            C93692aUy c93692aUy = C94624ak0.LJLJLLL;
            EditText getPureDoubleText = this.LJLILLLLZI;
            c93692aUy.getClass();
            o.LJIIIZ(getPureDoubleText, "$this$getPureDoubleText");
            Editable text = getPureDoubleText.getText();
            o.LJIIIIZZ(text, "text");
            String charSequence = C93692aUy.LIZ(text, "").toString();
            if (charSequence.length() == 0) {
                parseDouble = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            } else {
                String format = new DecimalFormat("#.#").format(CastDoubleProtector.parseDouble(charSequence));
                o.LJIIIIZZ(format, "DecimalFormat(\"#.#\").format(content.toDouble())");
                parseDouble = CastDoubleProtector.parseDouble(format);
            }
            this.LJLJI.LJII().LJIIJJI(C78842Uww.LJIIJ(parseDouble, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 30.0d));
            this.LJLIL.Ll().kv0();
        }
    }
}

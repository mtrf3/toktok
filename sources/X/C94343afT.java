package X;

import android.widget.TextView;
import com.bytedance.effectcreatormobile.modelselect.ModelSelectFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.afT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94343afT extends C0CJ {
    public final /* synthetic */ ModelSelectFragment LJLIL;

    public C94343afT(ModelSelectFragment modelSelectFragment) {
        this.LJLIL = modelSelectFragment;
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        this.LJLIL.xl().iv0(i);
        TextView textView = ModelSelectFragment.vl(this.LJLIL).LJLJJLL;
        o.LJIIIIZZ(textView, "binding.tvModelTitle");
        List<C94256ae4> value = this.LJLIL.xl().LJLILLLLZI.LIZ.getValue();
        o.LJI(value);
        textView.setText(((C94256ae4) ListProtector.get(value, i)).LJLIL);
        ModelSelectFragment modelSelectFragment = this.LJLIL;
        List<C94256ae4> value2 = modelSelectFragment.xl().LJLILLLLZI.LIZ.getValue();
        o.LJI(value2);
        modelSelectFragment.LJLJJI = (C94256ae4) ListProtector.get(value2, i);
    }
}

package X;

import Y.AObserverS71S0200000_7;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("copyright_violation_snack_bar_task")
/* renamed from: X.Gl7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42437Gl7 extends M71 {
    public final ViewGroup LJLIL;
    public final Aweme LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;
    public AKH LJLJJI;
    public boolean LJLJJL;
    public long LJLJJLL;

    @Override // X.M74
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            AKH akh = new AKH(this.LJLIL);
            akh.LIZLLL(new AqS138S0200000_7(context, this, 56), true);
            Context context2 = context.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(context2.getString(R.string.e08));
            LIZ.append((char) 160);
            String LIZIZ = X1D.LIZIZ(LIZ);
            String string = context2.getString(R.string.e07);
            o.LJIIIIZZ(string, "context.getString(R.stri…ilePage_removedSound_cta)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZIZ);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new C42438Gl8(this, context2), 0, spannableString.length(), 17);
            if (!C80S.LIZ(this.LJLILLLLZI)) {
                spannableStringBuilder = spannableStringBuilder.append((CharSequence) spannableString);
                o.LJIIIIZZ(spannableStringBuilder, "{\n            builder.ap…(clickableSpan)\n        }");
            }
            A21 a21 = akh.LIZ;
            a21.LJ = spannableStringBuilder;
            a21.LJIIIZ = 0;
            int LIZJ2 = C173216qz.LIZJ(58.0d, context.LIZ);
            A21 a212 = akh.LIZ;
            a212.LJIIIIZZ = LIZJ2;
            a212.LIZJ = false;
            akh.LIZ.LJIIL = new AqS138S0200000_7(wrapper, this, 57);
            this.LJLJJI = akh;
            akh.LIZJ();
            this.LJLJI.observe(LIZJ, new AObserverS71S0200000_7(akh.LJ, this, 4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42437Gl7(ViewGroup view, InterfaceC55643Lsd scene, Aweme aweme, MutableLiveData<Boolean> showSnackbarLiveData) {
        super(scene);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(showSnackbarLiveData, "showSnackbarLiveData");
        this.LJLIL = view;
        this.LJLILLLLZI = aweme;
        this.LJLJI = showSnackbarLiveData;
    }
}

package X;

import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6CP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CP extends WM7 {
    public final C82622Wbi LJLIL;
    public StickerHintTextViewModel LJLILLLLZI;
    public C6CX LJLJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public final C139355dT LJLJJI = new C139355dT();
    public final float LJLJL = 8.0f;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1025));

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LJLJLJ.getValue() != null) {
            StickerHintTextViewModel stickerHintTextViewModel = this.LJLILLLLZI;
            if (stickerHintTextViewModel != null) {
                stickerHintTextViewModel.hv0().postValue(null);
            } else {
                o.LJIJI("stickerHintTextViewModel");
                throw null;
            }
        }
    }

    public C6CP(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
    }

    @Override // X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        StickerHintTextViewModel stickerHintTextViewModel;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJLJ.getValue() != null) {
            ViewModelProvider LJII = C165706es.LJII(view, null, 6);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) this.LJLJLJ.getValue());
            LIZ.append('-');
            LIZ.append(C16880lQ.LJLLILLLL(StickerHintTextViewModel.class));
            stickerHintTextViewModel = (StickerHintTextViewModel) LJII.get(X1D.LIZIZ(LIZ), StickerHintTextViewModel.class);
        } else {
            stickerHintTextViewModel = (StickerHintTextViewModel) C165706es.LJII(view, null, 6).get(StickerHintTextViewModel.class);
        }
        this.LJLILLLLZI = stickerHintTextViewModel;
        this.LJLJJL = (TextView) findViewById(R.id.ml9);
        this.LJLJJLL = (TextView) findViewById(R.id.mla);
        TextView textView = this.LJLJJL;
        o.LJI(textView);
        Context context = textView.getContext();
        o.LJIIIIZZ(context, "hintTextView!!.context");
        this.LJLJI = new C6CX(context);
        StickerHintTextViewModel stickerHintTextViewModel2 = this.LJLILLLLZI;
        if (stickerHintTextViewModel2 != null) {
            stickerHintTextViewModel2.gv0().observe(this, new AObserverS70S0100000_2(this, 324));
            StickerHintTextViewModel stickerHintTextViewModel3 = this.LJLILLLLZI;
            if (stickerHintTextViewModel3 != null) {
                stickerHintTextViewModel3.hv0().observe(this, new AObserverS70S0100000_2(this, 325));
                return;
            } else {
                o.LJIJI("stickerHintTextViewModel");
                throw null;
            }
        }
        o.LJIJI("stickerHintTextViewModel");
        throw null;
    }

    public static void LLJILJIL(TextView textView, float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        if (textView != null) {
            layoutParams = textView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) f;
            marginLayoutParams.setMarginStart((int) f);
            marginLayoutParams.topMargin = (int) f2;
        }
        if (textView == null) {
            return;
        }
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.auf, viewGroup, false, "inflater.inflate(R.layou…t_text, container, false)");
    }
}

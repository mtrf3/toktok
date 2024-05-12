package X;

import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6CQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CQ extends WM7 {
    public FTCStickerHintTextViewModel LJLIL;
    public C6CX LJLILLLLZI;
    public final C139355dT LJLJI = new C139355dT();
    public TextView LJLJJI;

    public final void LLJILJIL(float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        TextView textView = this.LJLJJI;
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
        TextView textView2 = this.LJLJJI;
        if (textView2 == null) {
            return;
        }
        textView2.setLayoutParams(marginLayoutParams);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (FTCStickerHintTextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(FTCStickerHintTextViewModel.class);
        TextView textView = (TextView) findViewById(R.id.ml9);
        this.LJLJJI = textView;
        o.LJI(textView);
        Context context = textView.getContext();
        o.LJIIIIZZ(context, "hintTextView!!.context");
        this.LJLILLLLZI = new C6CX(context);
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.LJLIL;
        if (fTCStickerHintTextViewModel != null) {
            fTCStickerHintTextViewModel.gv0().observe(this, new AObserverS70S0100000_2(this, 330));
            FTCStickerHintTextViewModel fTCStickerHintTextViewModel2 = this.LJLIL;
            if (fTCStickerHintTextViewModel2 != null) {
                if (fTCStickerHintTextViewModel2.LJLILLLLZI == null) {
                    fTCStickerHintTextViewModel2.LJLILLLLZI = new MutableLiveData<>();
                }
                MutableLiveData<C6CU> mutableLiveData = fTCStickerHintTextViewModel2.LJLILLLLZI;
                o.LJI(mutableLiveData);
                mutableLiveData.observe(this, new AObserverS70S0100000_2(this, 331));
                return;
            }
            o.LJIJI("stickerHintTextViewModel");
            throw null;
        }
        o.LJIJI("stickerHintTextViewModel");
        throw null;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd_, viewGroup, false, "inflater.inflate(R.layou…t_text, container, false)");
    }
}

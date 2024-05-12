package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftTitleDescriptionAssem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.AJi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnFocusChangeListenerC26026AJi implements View.OnFocusChangeListener {
    public final /* synthetic */ C26018AJa LJLIL;
    public final /* synthetic */ SeriesDraftTitleDescriptionAssem LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    public ViewOnFocusChangeListenerC26026AJi(C26018AJa c26018AJa, SeriesDraftTitleDescriptionAssem seriesDraftTitleDescriptionAssem, Context context) {
        this.LJLIL = c26018AJa;
        this.LJLILLLLZI = seriesDraftTitleDescriptionAssem;
        this.LJLJI = context;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (String.valueOf(((C19K) this.LJLIL.findViewById(R.id.cps)).getText()).length() == 0 && !z) {
            C26021AJd c26021AJd = this.LJLILLLLZI.LJLLILLLL;
            if (c26021AJd != null) {
                c26021AJd.LJI(true);
            }
            C26021AJd c26021AJd2 = this.LJLILLLLZI.LJLLILLLL;
            if (c26021AJd2 != null) {
                c26021AJd2.LIZLLL(this.LJLJI.getString(R.string.qmk));
            }
        }
    }
}

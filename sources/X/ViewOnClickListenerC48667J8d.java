package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.setting.api.DataSaverApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.J8d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC48667J8d extends C25849ACn implements View.OnClickListener {
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Context LJLJL;

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        return new C25848ACm(C47654In4.LIZJ(), this.LJLJJL, this, false, null, null, null, this.LJLJJLL, false, false, false, null, 64504);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC48667J8d(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        String string = fragment.getString(R.string.eed);
        o.LJIIIIZZ(string, "fragment.getString(R.string.data_saver)");
        this.LJLJJL = string;
        String string2 = fragment.getString(R.string.eec);
        o.LJIIIIZZ(string2, "fragment.getString(R.string.data_save_description)");
        this.LJLJJLL = string2;
        this.LJLJL = fragment.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        LJIIL();
        boolean z = LJFF().LJZI;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C48669J8f c48669J8f = DataSaverApi.LIZ;
        C48668J8e c48668J8e = new C48668J8e(this, i, z);
        c48669J8f.getClass();
        C48669J8f.LIZIZ.setDataSaverSetting(i).LJ(c48668J8e, C10K.LJIIIIZZ, null);
    }
}

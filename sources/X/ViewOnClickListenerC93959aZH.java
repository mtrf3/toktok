package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aZH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93959aZH implements View.OnClickListener {
    public final /* synthetic */ AKT LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Fragment LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public ViewOnClickListenerC93959aZH(AKT akt, String str, Fragment fragment, boolean z, String str2) {
        this.LJLIL = akt;
        this.LJLILLLLZI = str;
        this.LJLJI = fragment;
        this.LJLJJI = z;
        this.LJLJJL = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.LIZ();
        String songId = this.LJLILLLLZI;
        o.LJIIIZ(songId, "songId");
        C94304aeq.LJLIL.put(songId, Boolean.TRUE);
        C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
        c26045AKb.LJIIIIZZ(R.string.ban);
        c26045AKb.LJIIJ();
        C94302aeo.LJJI("1", "", "revoke_real", DspPlatform.SPOTIFY, this.LJLJJI, 0L, this.LJLJJL);
    }
}

package X;

import Y.AObserverS72S0100000_4;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.viewmodel.BindPhonePopsViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.M3i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56186M3i {
    public final ActivityC45651qj LIZ;
    public final Aweme LIZIZ;
    public final Bundle LIZJ;
    public final String LIZLLL;
    public final C56187M3j LJ;
    public final BindPhonePopsViewModel LJFF;

    public final void LIZ() {
        this.LJFF.LJLJI.observe(this.LIZ, new AObserverS72S0100000_4(this, 43));
        BindPhonePopsViewModel bindPhonePopsViewModel = this.LJFF;
        Aweme aweme = this.LIZIZ;
        bindPhonePopsViewModel.LJLIL.getClass();
        if (C56193M3p.LIZ(aweme)) {
            NextLiveData<Integer> nextLiveData = bindPhonePopsViewModel.LJLILLLLZI;
            FFL.LJIIIZ().getClass();
            nextLiveData.postValue(Integer.valueOf(FFL.LJIIJ(31744, 0, "cold_boot_bind_phone_pop_or_sheet", true)));
        }
    }

    public C56186M3i(ActivityC45651qj hostActivity, Aweme aweme, Bundle bundle) {
        o.LJIIIZ(hostActivity, "hostActivity");
        this.LIZ = hostActivity;
        this.LIZIZ = aweme;
        this.LIZJ = bundle;
        String enterFrom = bundle.getString("enter_from", "");
        this.LIZLLL = enterFrom;
        String enterMethod = bundle.getString("method", "");
        o.LJIIIIZZ(enterFrom, "enterFrom");
        o.LJIIIIZZ(enterMethod, "enterMethod");
        this.LJ = new C56187M3j(enterFrom, enterMethod);
        this.LJFF = (BindPhonePopsViewModel) ViewModelProviders.of(hostActivity).get(BindPhonePopsViewModel.class);
    }
}

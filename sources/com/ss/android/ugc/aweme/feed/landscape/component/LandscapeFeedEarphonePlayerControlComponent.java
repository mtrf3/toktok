package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C48797JDd;
import X.C48798JDe;
import X.C62822Ol8;
import X.C8MM;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LandscapeFeedEarphonePlayerControlComponent extends BasePanelComponent {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 85));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 337));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 84));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C48798JDe.LJLIL);

    public final LandscapeFeedViewPagerAbility A3() {
        return (LandscapeFeedViewPagerAbility) this.LJLIL.getValue();
    }

    public final IEarphonePlayerControlService v3() {
        return (IEarphonePlayerControlService) this.LJLJJI.getValue();
    }

    public final LandscapeFeedPlayerAbility x3() {
        return (LandscapeFeedPlayerAbility) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        Context context;
        super.onDestroy();
        if (v3().LIZIZ() && (context = getContext()) != null) {
            C16880lQ.LJJLIIIJL(context, (BroadcastReceiver) this.LJLJI.getValue());
        }
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (v3().LIZIZ()) {
            Context context = getContext();
            if (context != null) {
                C16880lQ.LJJLIIIJJI(context, (BroadcastReceiver) this.LJLJI.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), null);
            }
            C48797JDd c48797JDd = new C48797JDd(this);
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                v3().LJI(LIZLLL, c48797JDd);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        if (v3().LIZIZ()) {
            c8mm.LIZ("event_on_playing", new AqS174S0100000_8(this, 40));
        }
    }
}

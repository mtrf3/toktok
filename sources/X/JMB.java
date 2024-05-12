package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMB implements JME {
    public final /* synthetic */ SearchMixLiveCardContentAssem LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    @Override // X.N54
    public final long getCurrentPosition() {
        return 0L;
    }

    @Override // X.N54
    public final Context LIZ() {
        return this.LIZ.getContext();
    }

    @Override // X.JME
    public final C59948Nfs LIZIZ() {
        Object value = this.LIZ.LLFF.getValue();
        o.LJIIIIZZ(value, "<get-tvSponsoredLabel>(...)");
        return (C59948Nfs) value;
    }

    @Override // X.N54
    public final boolean isMute() {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LIZ), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            return searchComponentCenter$Player$PlayerControlAbility.isMute();
        }
        return false;
    }

    @Override // X.N54
    public final boolean isPlaying() {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LIZ), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            return searchComponentCenter$Player$PlayerControlAbility.isPlaying();
        }
        return false;
    }

    @Override // X.N54
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    public JMB(SearchMixLiveCardContentAssem searchMixLiveCardContentAssem, Aweme aweme) {
        this.LIZ = searchMixLiveCardContentAssem;
        this.LIZIZ = aweme;
    }
}

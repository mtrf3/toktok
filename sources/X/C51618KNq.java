package X;

import Y.ACListenerS20S0201000_2;
import Y.ACListenerS25S0201000_8;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.KNq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51618KNq extends AbstractC029409q<C51619KNr> {
    public final List<RelatedChallengeMusic> LJLIL;
    public final Context LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI = "challenge_page";

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (C79004UzY.LJJIFFI(this.LJLIL)) {
            return 0;
        }
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) ListProtector.get(this.LJLIL, i);
        if (relatedChallengeMusic != null) {
            int i2 = relatedChallengeMusic.categoryType;
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    return 0;
                }
            }
            return i3;
        }
        return super.getItemViewType(i);
    }

    public final void LJLLLLLL(C51619KNr c51619KNr, Challenge challenge) {
        if (challenge == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#");
        LIZ.append(challenge.getChallengeName());
        c51619KNr.LJLIL.setText(X1D.LIZIZ(LIZ));
        C16880lQ.LJIIZILJ(c51619KNr.LJLILLLLZI, new ACListenerS25S0201000_8(1, this, challenge, 5));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("related_tag_id", challenge.getCid());
        c188727au.LJIIIZ("tag_id", this.LJLJI);
        FMX.LJIIL("related_tag_show", c188727au.LIZ);
    }

    public final void LJLZ(C51619KNr c51619KNr, Music music) {
        if (music == null) {
            return;
        }
        c51619KNr.LJLIL.setText(music.getMusicName());
        Context context = this.LJLILLLLZI;
        if (!MusicService.LJJLIIIJJI().LJJIL(music.convertToMusicModel(), context, true)) {
            C16880lQ.LJIIZILJ(c51619KNr.LJLILLLLZI, new ACListenerS20S0201000_2(0, this, music, 2));
        } else {
            C16880lQ.LJIIZILJ(c51619KNr.LJLILLLLZI, null);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C51619KNr c51619KNr, int i) {
        C51619KNr c51619KNr2 = c51619KNr;
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) ListProtector.get(this.LJLIL, i);
        if (relatedChallengeMusic == null) {
            return;
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                Music music = relatedChallengeMusic.music;
                if (music != null) {
                    LJLZ(c51619KNr2, music);
                    return;
                }
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge == null) {
                    return;
                }
                LJLLLLLL(c51619KNr2, challenge);
                return;
            }
            LJLLLLLL(c51619KNr2, relatedChallengeMusic.challenge);
            return;
        }
        LJLZ(c51619KNr2, relatedChallengeMusic.music);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C51619KNr com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
        boolean z = true;
        if (i != 1) {
            i2 = R.layout.akl;
        } else {
            i2 = R.layout.akr;
        }
        C51619KNr c51619KNr = new C51619KNr(C16880lQ.LLLLIILL(LLZIL, i2, viewGroup, false));
        C0AX.LIZ(viewGroup, c51619KNr.itemView, R.id.lj7);
        View view = c51619KNr.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c51619KNr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C51619KNr.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c51619KNr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c51619KNr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C51619KNr.class.getName();
        return c51619KNr;
    }

    public C51618KNq(Context context, String str, List list) {
        this.LJLILLLLZI = context;
        this.LJLIL = list;
        this.LJLJI = str;
    }
}

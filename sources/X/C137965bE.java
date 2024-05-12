package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137965bE {
    public final VideoPublishEditModel LIZ;
    public final C62822Ol8 LIZIZ;

    public final StickerChallenge LIZIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-stickerChallenge>(...)");
        return (StickerChallenge) value;
    }

    public C137965bE(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LIZ = model;
        this.LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 800));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r5.LIZ.removeChallengeFromTitleAndStruct(X.C77275UUl.LJII(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZIZ()
            java.util.HashMap r0 = r0.getStickerToChallenge()
            java.lang.Object r4 = r0.get(r6)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r4 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r4
            if (r4 == 0) goto L3e
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZIZ()
            java.util.List r0 = r0.getRecordStickerChallengeList()
            java.util.Iterator r3 = r0.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r0
            java.lang.String r1 = r4.challengeName
            java.lang.String r0 = r0.challengeName
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1c
            if (r2 != 0) goto L3e
        L35:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.LIZ
            java.util.Set r0 = X.C77275UUl.LJII(r4)
            r1.removeChallengeFromTitleAndStruct(r0)
        L3e:
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZIZ()
            java.util.List r0 = r0.getStickerList()
            java.util.Collection r0 = X.C65777Prh.LIZ(r0)
            r0.remove(r6)
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZIZ()
            java.util.List r0 = r0.getStickerList()
            boolean r0 = X.ORZ.LJLJJI(r6, r0)
            if (r0 != 0) goto L6a
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZIZ()
            java.util.HashMap r0 = r0.getStickerToChallenge()
            java.util.Map r0 = X.C65777Prh.LIZJ(r0)
            r0.remove(r6)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137965bE.LIZJ(java.lang.String):void");
    }

    public final void LIZLLL(List<? extends AVChallenge> list) {
        if ((!((ArrayList) list).isEmpty()) && list != null) {
            LIZIZ().getRecordStickerChallengeList().clear();
            LIZIZ().getRecordStickerChallengeList().addAll(list);
        }
    }

    public final void LIZ(LifecycleOwner owner, final String challengeID) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(challengeID, "challengeID");
        new C41386GMc(owner, challengeID).LIZ(new BOC() { // from class: X.5a8
            @Override // X.BOC
            public final void LIZ(AVChallenge challenge) {
                List<AVChallenge> editEffectStickerChallengeList = C137965bE.this.LIZIZ().getEditEffectStickerChallengeList();
                o.LJIIIIZZ(challenge, "challenge");
                editEffectStickerChallengeList.add(challenge);
                C137965bE.this.LIZIZ().getStickerToChallenge().put(challengeID, challenge);
            }
        });
    }
}

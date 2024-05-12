package X;

import Y.AfS51S0300000_12;
import android.app.Activity;
import android.app.Dialog;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.PlayListAnchorExtra;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.SUu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72188SUu extends HSS {
    public static final C5H3<Gson> LJLLILLLL = C221108m2.LIZ(EnumC221088m0.NONE, C58454Mws.LJLIL);
    public PlayListAnchorExtra LJLJLJ;
    public C73318Sq2 LJLJLLL = new C73318Sq2();
    public boolean LJLL;
    public boolean LJLLI;

    public final PlayListAnchorExtra LJJJJJ() {
        String str;
        try {
            Gson value = LJLLILLLL.getValue();
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            } else {
                str = null;
            }
            return (PlayListAnchorExtra) value.LJI(str, PlayListAnchorExtra.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C72188SUu();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.MUSIC_PLAYLIST.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        this.LJLL = true;
        LJJJJJL(EnumC72191SUx.PLAY_LIST_ANCHOR_MAJOR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r0.isTTM() == true) goto L9;
     */
    @Override // X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C188727au r4) {
        /*
            r3 = this;
            java.lang.String r0 = "eventMapBuilder"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            com.ss.android.ugc.aweme.music.model.PlayListAnchorExtra r0 = r3.LJLJLJ
            if (r0 != 0) goto Lf
            com.ss.android.ugc.aweme.music.model.PlayListAnchorExtra r0 = r3.LJJJJJ()
            r3.LJLJLJ = r0
        Lf:
            com.ss.android.ugc.aweme.music.model.PlayListAnchorExtra r0 = r3.LJLJLJ
            if (r0 == 0) goto L28
            boolean r0 = r0.isTTM()
            r2 = 1
            if (r0 != r2) goto L28
        L1a:
            kotlin.jvm.internal.AqS54S0110000_12 r1 = new kotlin.jvm.internal.AqS54S0110000_12
            r0 = 6
            r1.<init>(r3, r2, r0)
            r3.LJJJJIZL(r1)
            r0 = 6
            X.HSS.LJJIZ(r3, r4, r0)
            return
        L28:
            r2 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72188SUu.LJIIIIZZ(X.7au):void");
    }

    @Override // X.HSS, X.S1E
    public final void LJIJJ(Aweme aweme) {
        this.LJLJLLL.dispose();
    }

    public final void LJJJJJL(EnumC72191SUx enumC72191SUx) {
        TTMStoreLink tTMStoreLink;
        if (this.LJLJLJ == null) {
            this.LJLJLJ = LJJJJJ();
        }
        PlayListAnchorExtra playListAnchorExtra = this.LJLJLJ;
        if (playListAnchorExtra != null && playListAnchorExtra.isTTM()) {
            SV7.LIZ.getClass();
            if (SV7.LJFF(false)) {
                SVA sva = SVA.TIKTOK_MUSIC;
                if (o.LJ(LJJIIZ(), "comment_anchor")) {
                    return;
                }
                String aid = LJIIIZ().LJJLL().getAid();
                o.LJIIIIZZ(aid, "getAnchorContext().aweme().aid");
                SV6.LIZIZ(sva, aid, enumC72191SUx);
                Activity LIZ = LJIIIZ().LIZ();
                PlayListAnchorExtra playListAnchorExtra2 = this.LJLJLJ;
                if (playListAnchorExtra2 == null || (tTMStoreLink = playListAnchorExtra2.store) == null) {
                    return;
                }
                String aid2 = LJIIIZ().LJJLL().getAid();
                o.LJIIIIZZ(aid2, "aid");
                SV3 LIZ2 = new C72192SUy(enumC72191SUx, LIZ, tTMStoreLink, aid2).LIZ();
                C73565Su1 LJJIJIL = AbstractC73672Svk.LJJIJIL(1);
                SV9.LIZ.getClass();
                this.LJLJLLL.LIZ(LJJIJIL.LJIIL(SV9.LIZ(), TimeUnit.SECONDS).LJJJLIIL(new AfS51S0300000_12(this, sva, LIZ2, 0), new InterfaceC64592gB() { // from class: X.9F1
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }));
            }
        }
    }

    @Override // X.HSW, X.S1E
    public final void LJIJ(Activity activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
        if (!this.LJLL) {
            this.LJLJLLL.dispose();
            this.LJLJLLL = new C73318Sq2();
        }
    }

    @Override // X.HSW, X.S1E
    public final void LJIILIIL(C7F9 chain, Dialog dialog, boolean z, boolean z2) {
        o.LJIIIZ(chain, "chain");
        if (!this.LJLL) {
            LJJJJJL(EnumC72191SUx.PLAY_LIST_ANCHOR_MINOR);
        }
    }
}

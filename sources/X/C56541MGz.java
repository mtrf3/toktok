package X;

import android.view.View;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.MGz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56541MGz implements MGV {
    public final String LJLIL;

    @Override // X.MGV
    public void onJumpToDetail(String aid) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // X.MGV
    public boolean sendCustomRequest(C51031K1b<?> c51031K1b, int i) {
        return false;
    }

    public C56541MGz(String str) {
        this.LJLIL = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0054, code lost:
    
        if (X.MEX.LIZJ() != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    @Override // X.MGV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.MGX getJumpToVideoParam(X.MGX r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r5 = this;
            java.lang.String r0 = "param"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "single_song"
            r3.LJIIIZ(r1, r0)
            java.lang.String r1 = r7.getAid()
            java.lang.String r0 = "group_id"
            r3.LJIIIZ(r0, r1)
            java.lang.String r1 = r6.LIZLLL
            java.lang.String r0 = "tag_id"
            r3.LJIIIZ(r0, r1)
            java.lang.String r1 = "rank_index"
            int r0 = r6.LJFF
            r3.LIZLLL(r0, r1)
            java.lang.String r1 = "order"
            int r0 = r6.LJFF
            r3.LIZLLL(r0, r1)
            java.lang.String r1 = r6.LJ
            java.lang.String r0 = "process_id"
            r3.LJIIIZ(r0, r1)
            r4 = 0
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(r4)
            r0.getABService()
            boolean r0 = X.MEX.LIZIZ()
            if (r0 != 0) goto L56
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(r4)
            r0.getABService()
            boolean r0 = X.MEX.LIZJ()
            if (r0 == 0) goto L8e
        L56:
            X.Z8A r0 = X.Z8A.LIZIZ
            boolean r2 = r0.enableShowFeatureVideoEntrance()
            com.ss.android.ugc.aweme.feed.model.Aweme$VideoTag r1 = r7.getDetailPageVideoTag()
            com.ss.android.ugc.aweme.feed.model.Aweme$VideoTag r0 = com.ss.android.ugc.aweme.feed.model.Aweme.VideoTag.EFFECT
            if (r1 != r0) goto La0
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(r4)
            r0.getABService()
            boolean r0 = X.MEX.LIZJ()
            if (r0 == 0) goto La0
            java.lang.String r2 = "Effect"
        L73:
            java.lang.String r1 = "prop_list"
            java.lang.String r0 = r7.getStickerIDs()
            r3.LJI(r1, r0)
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r7.getStickerEntranceInfo()
            if (r0 == 0) goto L9e
            java.lang.String r1 = r0.id
        L84:
            java.lang.String r0 = "pin_id"
            r3.LJI(r0, r1)
            java.lang.String r0 = "pin_label"
            r3.LJI(r0, r2)
        L8e:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "feed_enter"
            X.FMX.LJIIL(r0, r1)
            java.lang.String r0 = "from_music"
            r6.LIZ = r0
            java.lang.String r0 = "music_id"
            r6.LIZIZ = r0
            return r6
        L9e:
            r1 = 0
            goto L84
        La0:
            boolean r0 = r7.isPinnedByArtist()
            if (r0 == 0) goto Lab
            if (r2 == 0) goto Lab
            java.lang.String r2 = "By artist"
            goto L73
        Lab:
            boolean r0 = X.C224868s6.LIZLLL(r7)
            if (r0 == 0) goto Lba
            boolean r0 = X.MH0.LIZ()
            if (r0 == 0) goto Lba
            java.lang.String r2 = "Template"
            goto L73
        Lba:
            boolean r0 = X.C224868s6.LIZLLL(r7)
            if (r0 == 0) goto Lc9
            boolean r0 = X.MH0.LIZIZ()
            if (r0 == 0) goto Lc9
            java.lang.String r2 = "Use template"
            goto L73
        Lc9:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.getMusicStarter()
            if (r0 == 0) goto Ld2
            java.lang.String r2 = "Original"
            goto L73
        Ld2:
            java.lang.String r2 = ""
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56541MGz.getJumpToVideoParam(X.MGX, com.ss.android.ugc.aweme.feed.model.Aweme):X.MGX");
    }

    @Override // X.MGV
    public C51031K1b<?> getPresenter(int i, ActivityC45651qj activity) {
        C56542MHa c56542MHa;
        MusicDetailActivity musicDetailActivity;
        o.LJIIIZ(activity, "activity");
        C51031K1b<?> c51031K1b = new C51031K1b<>();
        if (((Boolean) C52736Kmq.LIZ.getValue()).booleanValue()) {
            if (!(activity instanceof MusicDetailActivity) || (musicDetailActivity = (MusicDetailActivity) activity) == null || (c56542MHa = musicDetailActivity.LLFII()) == null) {
                c56542MHa = new C56542MHa();
            }
        } else {
            c56542MHa = new C56542MHa();
        }
        String str = this.LJLIL;
        if (str != null) {
            c56542MHa.LJLJLJ = str;
        }
        c56542MHa.LJLILLLLZI = true;
        c51031K1b.LJJ(c56542MHa);
        return c51031K1b;
    }

    @Override // X.MGV
    public C220538l7 onCreateDetailAwemeViewHolder(View itemView, String eventLabel, MH9 awemeClickListener) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(awemeClickListener, "awemeClickListener");
        return new MH7(itemView, eventLabel, awemeClickListener);
    }
}

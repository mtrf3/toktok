package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C47261Igj;
import X.C90053g9;
import X.C90323ga;
import X.EnumC90333gb;
import X.FMX;
import X.KNV;
import X.SVL;
import X.T6U;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.TikTokMusicCollectInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qna.model.Qna;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACListenerS18S1300000_12 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS18S1300000_12 aCListenerS18S1300000_12, View view) {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(((TikTokMusicCollectInfo) aCListenerS18S1300000_12.l1).getDeepLink()).buildUpon().appendQueryParameter("tt_item_id", ((MusicFavoriteButtonAssem) aCListenerS18S1300000_12.l2).M3()).build());
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.tiktok.android.music");
        C16880lQ.LIZJ((Context) aCListenerS18S1300000_12.l3, intent);
        String str = aCListenerS18S1300000_12.s0;
        C188727au LIZLLL = KNV.LIZLLL(str, "trackId");
        LIZLLL.LJIIIZ("enter_from", "single_song");
        LIZLLL.LJIIIZ("resso_track_id", str);
        FMX.LJIIL("favorite_sync_toast_click", LIZLLL.LIZ);
        SVL.LIZ("3", "music", ((MusicFavoriteButtonAssem) aCListenerS18S1300000_12.l2).M3(), ((MusicFavoriteButtonAssem) aCListenerS18S1300000_12.l2).N3().LJLIL);
    }

    public static final void onClick$1(ACListenerS18S1300000_12 aCListenerS18S1300000_12, View view) {
        IQAInvitationService iQAInvitationService = C90053g9.LIZ;
        ActivityC45651qj requireActivity = ((Fragment) aCListenerS18S1300000_12.l1).requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        String str = aCListenerS18S1300000_12.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        EnumC90333gb enumC90333gb = EnumC90333gb.VIDEO;
        Long valueOf = Long.valueOf(((QaStruct) aCListenerS18S1300000_12.l2).getQuestionId());
        Long valueOf2 = Long.valueOf(((QaStruct) aCListenerS18S1300000_12.l2).getUserId());
        QaStruct qaStruct = (QaStruct) aCListenerS18S1300000_12.l2;
        Aweme aweme = (Aweme) aCListenerS18S1300000_12.l3;
        String valueOf3 = String.valueOf(qaStruct.getUserId());
        long questionId = qaStruct.getQuestionId();
        String questionContent = qaStruct.getQuestionContent();
        if (questionContent != null) {
            str2 = questionContent;
        }
        C90323ga.LIZ(iQAInvitationService, requireActivity, "post_qa_video", str, enumC90333gb, valueOf, valueOf2, null, new Qna(valueOf3, questionId, str2, 0, null, qaStruct.getInviteShareInfo(), C47261Igj.LJJIJ(aweme)), T6U.LJLIL, 64);
    }

    public ACListenerS18S1300000_12(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj;
        this.s0 = str;
    }
}

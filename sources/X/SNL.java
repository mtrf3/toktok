package X;

import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.CommentFilterConfig;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SNL {
    public static final SNL LIZ;
    public static boolean LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;

    public final synchronized void LIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C71909SKb c71909SKb = C71909SKb.LIZ;
        SNH snh = new SNH();
        SKH skh = new SKH();
        SNO sno = new SNO();
        c71909SKb.getClass();
        C71909SKb.LIZIZ = snh;
        C71909SKb.LIZJ = skh;
        C72041SPd.LIZ.getClass();
        C72041SPd.LIZIZ = sno;
        C71930SKw creator = C71930SKw.LIZ;
        o.LJIIIZ(creator, "creator");
        java.util.Map<Class<?>, SHH> map = SHI.LIZ;
        map.put(CommentFilterConfig.class, creator);
        map.put(PrivateAccountConfig.class, C71994SNi.LIZ);
        LIZJ();
    }

    static {
        SNL snl = new SNL();
        LIZ = snl;
        snl.LIZ();
        LIZJ = C221108m2.LIZIZ(C71992SNg.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C71993SNh.LJLIL);
    }

    public static C72041SPd LIZIZ() {
        return (C72041SPd) LIZJ.getValue();
    }

    public static void LIZJ() {
        C71909SKb c71909SKb = C71909SKb.LIZ;
        C71999SNn c71999SNn = C71999SNn.LJLIL;
        c71909SKb.getClass();
        C71909SKb.LIZ("main", c71999SNn);
        C71909SKb.LIZ("unlogin", C71989SNd.LJLIL);
        C71909SKb.LIZ("sug_to_others", C71991SNf.LJLIL);
        C71909SKb.LIZ("comment", SNK.LJLIL);
        C71909SKb.LIZ("comment_sheet", SNI.LJLIL);
        C71909SKb.LIZ("tag_mention", SNM.LJLIL);
        C71909SKb.LIZ("tag_sheet", SNN.LJLIL);
        C71909SKb.LIZ("mention_sheet", C71988SNc.LJLIL);
        C71909SKb.LIZ("chat", SNP.LJLIL);
        C71909SKb.LIZ("chat_sheet", SNQ.LJLIL);
        C71909SKb.LIZ("group_chat_sheet", SNR.LJLIL);
        C71909SKb.LIZ("story_sheet", SNU.LJLIL);
        C71909SKb.LIZ("duet", SNJ.LJLIL);
        C71909SKb.LIZ("duet_sheet", SNS.LJLIL);
        C71909SKb.LIZ("stitch", C71990SNe.LJLIL);
        C71909SKb.LIZ("stitch_sheet", SNT.LJLIL);
        C71909SKb.LIZ("sticker_sheet", SNV.LJLIL);
        C71909SKb.LIZ("downloads", SNW.LJLIL);
        C71909SKb.LIZ("music_collection", SNX.LJLIL);
        C71909SKb.LIZ("following_list_sheet", SNY.LJLIL);
        C71909SKb.LIZ("liked_list_sheet", SNZ.LJLIL);
        C71909SKb.LIZ("video_view_history", C71986SNa.LJLIL);
        C71909SKb.LIZ("profile_view_history", C71987SNb.LJLIL);
    }
}

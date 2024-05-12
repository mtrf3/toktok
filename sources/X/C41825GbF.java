package X;

import android.content.Context;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.story.forward.ForwardResult;
import com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.GbF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41825GbF {
    public static boolean LIZ;
    public static AKT LIZIZ;
    public static final java.util.Map<String, C41826GbG> LIZJ = new LinkedHashMap();
    public static final java.util.Set<String> LIZLLL = new LinkedHashSet();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C41828GbI.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C41830GbK.LJLIL);

    public static void LIZ(String str) {
        C41826GbG LIZJ2 = LIZJ(str);
        if (LIZJ2 != null) {
            java.util.Set<String> set = LIZLLL;
            if (!set.contains(str)) {
                LIZJ2.LIZIZ.getReleaseLockEvent().postValue(Boolean.TRUE);
            }
            set.remove(str);
            LIZJ.remove(str);
        }
    }

    public static C41826GbG LIZJ(String str) {
        return (C41826GbG) ((LinkedHashMap) LIZJ).get(str);
    }

    public static void LIZIZ(SmartImageView smartImageView, String str) {
        C41826GbG LIZJ2 = LIZJ(str);
        if (LIZJ2 != null) {
            if (LIZJ2.LIZ.getCoverBitmap() != null) {
                smartImageView.setImageBitmap(LIZJ2.LIZ.getCoverBitmap());
            } else {
                LIZJ2.LIZJ = smartImageView;
            }
        }
    }

    public static void LIZLLL(Context context, String str, boolean z) {
        o.LJIIIZ(context, "context");
        if (str == null) {
            return;
        }
        LIZLLL.add(str);
        C41826GbG LIZJ2 = LIZJ(str);
        if (LIZJ2 != null) {
            IStoryForwardService.DefaultImpls.editForwardTask$default(GZM.LIZIZ, context, LIZJ2.LIZ, z, null, 8, null);
        }
    }

    public static ForwardResult LJ(C41831GbL c41831GbL, QuickForwardPublishLock quickForwardPublishLock, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        Aweme aweme = c41831GbL.LJLILLLLZI;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        String secUid = aweme.getAuthor().getSecUid();
        o.LJIIIIZZ(secUid, "aweme.author.secUid");
        String nickname = aweme.getAuthor().getNickname();
        o.LJIIIIZZ(nickname, "aweme.author.nickname");
        return GZM.LIZIZ.forward2Story(c41831GbL.LJLIL, C41821GbB.LIZIZ(aweme, c41831GbL.LJLJI, null, null, 12), new QuickForwardConfig(new VideoShareInfoStruct(aid, authorUid, secUid, nickname), quickForwardPublishLock, !z), interfaceC88472Yns);
    }
}

package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.story.preload.StoryAidPreloader;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224418rN extends AbstractC65781Prl implements InterfaceC88472Yns<Intent, String> {
    public static final C224418rN INSTANCE = new C224418rN();

    public C224418rN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Intent intent) {
        String str;
        HashMap hashMap;
        o.LJIIIZ(intent, "intent");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "id");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "refer");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "enter_from_sub");
        if (LLJJIJIIJIL4 == null) {
            LLJJIJIIJIL4 = "";
        }
        String LJ = C55801LvB.LIZIZ.LJ(LLJJIJIIJIL2, LLJJIJIIJIL3, LLJJIJIIJIL4);
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(intent, "push_params");
        Bundle LIZJ = AnonymousClass036.LIZJ("__story_aid_preloader_aid", LLJJIJIIJIL, "__story_aid_preloader_type", LJ);
        LIZJ.putString("__story_aid_preloader_push_params", LLJJIJIIJIL5);
        C224068qo.LIZIZ(LIZJ, StoryAidPreloader.class);
        Serializable serializableExtra = intent.getSerializableExtra("feed_param_extra");
        Object obj = null;
        if ((serializableExtra instanceof HashMap) && (hashMap = (HashMap) serializableExtra) != null) {
            obj = hashMap.get("story_extra_author_uid");
        }
        if ((obj instanceof String) && (str = (String) obj) != null) {
            if (((RBX) HG3.LJIILL()).isMe(str)) {
                return "1";
            }
            return "2";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}

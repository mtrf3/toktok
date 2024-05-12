package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.preload.StoryUidPreloader;
import kotlin.jvm.internal.o;

/* renamed from: X.8qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224078qp extends AbstractC65781Prl implements InterfaceC88472Yns<Intent, String> {
    public static final C224078qp INSTANCE = new C224078qp();

    public C224078qp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Intent intent) {
        o.LJIIIZ(intent, "intent");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "id");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "userid");
        if (LLJJIJIIJIL2 != null) {
            str = LLJJIJIIJIL2;
        }
        String LLILLIZIL = C44384HbQ.LLILLIZIL(new InsertStory(CastLongProtector.parseLong(str), CastLongProtector.parseLong(LLJJIJIIJIL)));
        Bundle bundle = new Bundle();
        bundle.putString("__story_uid_preloader_require_uids", str);
        bundle.putString("__story_uid_preloader_insert_param", LLILLIZIL);
        C224068qo.LIZIZ(bundle, StoryUidPreloader.class);
        if (((RBX) HG3.LJIILL()).isMe(str)) {
            return "1";
        }
        return "2";
    }
}

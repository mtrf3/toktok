package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MIq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56584MIq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(CommerceMusicLogger commerceMusicLogger, C56588MIu event, RecyclerView recyclerView, InterfaceC88471Ynr interfaceC88471Ynr) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(commerceMusicLogger, "<this>");
        o.LJIIIZ(event, "event");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        recyclerView.LJIIJJI(new C56583MIp(linearLayoutManager, new C68322mC(), new LinkedHashMap(), commerceMusicLogger, event, interfaceC88471Ynr));
    }
}

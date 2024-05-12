package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.relation.utils.CommonExtKt$runOn$observer$1;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MbX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57131MbX implements InterfaceC57137Mbd {
    public static final C57131MbX LIZ = new C57131MbX();
    public static boolean LIZIZ;
    public static final String[] LIZJ;
    public static InterfaceC57133MbZ LIZLLL;

    static {
        new LinkedHashSet();
        LIZJ = new String[]{"now_invite", "now_post", "now_video", "now_post_memory", "now_video_memory", "now_others_post", "now_others_video_post"};
    }

    @Override // X.InterfaceC57137Mbd
    public final boolean getEnable() {
        if (C54218LPq.LJLIL.LIZ() && !MWW.LIZIZ() && ((Boolean) C52346KgY.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC57137Mbd
    public final void LIZ(Activity context, String itemType, String channel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(itemType, "itemType");
        o.LJIIIZ(channel, "channel");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null || LIZIZ || LJJIFFI.isFinishing() || !getEnable() || !((RBX) HG3.LJIILL()).isLogin() || !ORY.LJJIJIIJIL(itemType, LIZJ) || o.LJ(channel, "chat_merge")) {
            return;
        }
        LIZIZ = true;
        boolean z = !o.LJ(channel, "copy");
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LJJIFFI, 1045);
        o.LJIIIZ(event, "event");
        LJJIFFI.getLifecycle().addObserver(new CommonExtKt$runOn$observer$1(z, event, aqS159S0100000_9));
    }
}

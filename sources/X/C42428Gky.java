package X;

import Y.AfS53S0100000_1;
import com.bytedance.ies.actionai.jni.ActionExecutionNode;
import com.bytedance.ies.actionai.jni.ActionNodeList;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gky, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42428Gky {
    public static boolean LIZ;
    public static final java.util.Map<String, EnumC83408WoO> LIZIZ = new LinkedHashMap();

    public static boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (!((RBX) HG3.LJIILL()).isLogin() || !C19N.LJ("enable_action_ai_entrance", false) || !C19N.LJ("enable_action_ai_bot", false) || CommerceMediaServiceImpl.LIZJ().LJIIZILJ() || H7R.LJJJJL(model) || !C44701HgX.LJIILIIL(model)) {
            return false;
        }
        return true;
    }

    public static List LIZIZ(ActionNodeList actionNodeList) {
        if (actionNodeList == null || actionNodeList.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        HashSet hashSet = new HashSet();
        Iterator<ActionExecutionNode> it = actionNodeList.iterator();
        while (it.hasNext()) {
            ActionExecutionNode next = it.next();
            Object obj = ((LinkedHashMap) LIZIZ).get(next.getName());
            if (obj != null) {
                hashSet.add(obj);
            }
        }
        return ORZ.LLJI(hashSet);
    }

    public static Object LIZJ(C3CS c3cs) {
        String str;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c3cs));
        C41930Gcw c41930Gcw = C41930Gcw.LIZ;
        if (C78685UuP.LJJJZ(C41930Gcw.LIZLLL())) {
            String LIZLLL = C41930Gcw.LIZLLL();
            C3C5.m7constructorimpl(LIZLLL);
            c84654XKg.resumeWith(LIZLLL);
        } else {
            C43023GuZ LIZIZ2 = C43014GuQ.LIZIZ();
            String str2 = null;
            if (LIZIZ2 != null) {
                str = LIZIZ2.LJFF;
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                C43023GuZ LIZIZ3 = C43014GuQ.LIZIZ();
                if (LIZIZ3 != null) {
                    str2 = LIZIZ3.LJFF;
                }
                C3C5.m7constructorimpl(str2);
                c84654XKg.resumeWith(str2);
            } else {
                C73426Srm LJFF = c41930Gcw.LJFF();
                if (LJFF == null || LJFF.LJJJ(T16.LIZ()).LJJJJZI(new AfS53S0100000_1(c84654XKg, 101)) == null) {
                    C3C5.m7constructorimpl("");
                    c84654XKg.resumeWith("");
                }
                C41930Gcw.LJII();
            }
        }
        return c84654XKg.LIZ();
    }

    public static void LIZLLL(boolean z) {
        LIZ = z;
    }
}

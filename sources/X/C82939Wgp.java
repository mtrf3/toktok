package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wgp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82939Wgp {
    public static List LIZ(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "infoList");
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BeautyComposerInfo beautyInfo = (BeautyComposerInfo) it.next();
                o.LJIIIZ(beautyInfo, "beautyInfo");
                LJ.add(new ComposerInfo(beautyInfo.nodePath, beautyInfo.extra, beautyInfo.effectId, 8));
            }
        }
        return LJ;
    }
}

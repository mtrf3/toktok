package X;

import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WgY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82922WgY {
    public static final /* synthetic */ int LIZ = 0;

    public static final List<BeautyComposerInfo> LIZ(List<BeautyComposerInfo> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "nodes");
        for (BeautyComposerInfo beautyComposerInfo : list) {
            if (!o.LJ(beautyComposerInfo.nodePath, "EFFECT_ID_TYPE_FILTER")) {
                LJ.add(beautyComposerInfo);
            }
        }
        return LJ;
    }
}

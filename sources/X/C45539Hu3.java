package X;

import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hu3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45539Hu3 extends F9E {
    public final List<LiveSubMediaModel> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C45539Hu3(List<LiveSubMediaModel> mediaModelList) {
        o.LJIIIZ(mediaModelList, "mediaModelList");
        this.LJLIL = mediaModelList;
    }
}

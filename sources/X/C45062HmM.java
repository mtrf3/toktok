package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HmM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45062HmM implements InterfaceC45080Hme<C76800UCe> {
    public final VideoPublishEditModel LIZ;
    public final LinkedHashMap<OSZ<Integer, C63A>, C45082Hmg> LIZIZ;

    @Override // X.InterfaceC45080Hme
    public final void LIZ() {
    }

    @Override // X.InterfaceC45080Hme
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC45080Hme
    public final void cancel() {
        for (C45082Hmg c45082Hmg : this.LIZIZ.values()) {
            if (c45082Hmg != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cancel. url=");
                LIZ.append(c45082Hmg.LIZ);
                X1D.LIZIZ(LIZ);
                AbstractC48384Iyq abstractC48384Iyq = c45082Hmg.LIZIZ;
                if (abstractC48384Iyq != null) {
                    abstractC48384Iyq.close();
                }
            }
        }
        this.LIZIZ.clear();
    }

    public C45062HmM(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LIZ = model;
        this.LIZIZ = new LinkedHashMap<>();
    }
}

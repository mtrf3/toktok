package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.jvm.internal.o;

/* renamed from: X.4vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125284vs {
    public final EnumC126024x4 LIZ;
    public final C125184vi LIZIZ;
    public final NLETemplateModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125284vs)) {
            return false;
        }
        C125284vs c125284vs = (C125284vs) obj;
        return this.LIZ == c125284vs.LIZ && o.LJ(this.LIZIZ, c125284vs.LIZIZ) && o.LJ(this.LIZJ, c125284vs.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        NLETemplateModel nLETemplateModel = this.LIZJ;
        return hashCode + (nLETemplateModel == null ? 0 : nLETemplateModel.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MagicRequest(magicAction=");
        LIZ.append(this.LIZ);
        LIZ.append(", businessParams=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", anchor=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C125284vs(EnumC126024x4 magicAction, C125184vi businessParams, NLETemplateModel nLETemplateModel) {
        o.LJIIIZ(magicAction, "magicAction");
        o.LJIIIZ(businessParams, "businessParams");
        this.LIZ = magicAction;
        this.LIZIZ = businessParams;
        this.LIZJ = nLETemplateModel;
    }
}

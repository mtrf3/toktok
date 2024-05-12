package X;

import X.YIQ;
import X.YIS;

/* loaded from: classes16.dex */
public abstract class YIS<MessageType extends YIQ<MessageType, BuilderType>, BuilderType extends YIS<MessageType, BuilderType>> implements YID, Cloneable {
    public final YIT LJFF(YIZ yiz) {
        YIT yit = (YIT) this;
        if (yit.LJLIL.getClass().isInstance(yiz)) {
            yit.LJI((YIO) ((YIQ) yiz));
            return yit;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}

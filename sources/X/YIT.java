package X;

import X.YIO;
import X.YIT;

/* loaded from: classes16.dex */
public abstract class YIT<MessageType extends YIO<MessageType, BuilderType>, BuilderType extends YIT<MessageType, BuilderType>> extends YIS<MessageType, BuilderType> {
    public final MessageType LJLIL;
    public MessageType LJLILLLLZI;
    public boolean LJLJI = false;

    public final YIO LJII() {
        if (this.LJLJI) {
            return this.LJLILLLLZI;
        }
        MessageType messagetype = this.LJLILLLLZI;
        C87169YIz c87169YIz = C87169YIz.LIZJ;
        c87169YIz.getClass();
        c87169YIz.LIZ(messagetype.getClass()).LJIIIIZZ(messagetype);
        this.LJLJI = true;
        return this.LJLILLLLZI;
    }

    public final /* synthetic */ Object clone() {
        YIT yit = (YIT) this.LJLIL.LJIIIIZZ(5);
        yit.LJI(LJII());
        return yit;
    }

    @Override // X.YID
    public final /* synthetic */ YIO LIZIZ() {
        return this.LJLIL;
    }

    public YIT(MessageType messagetype) {
        this.LJLIL = messagetype;
        this.LJLILLLLZI = (MessageType) messagetype.LJIIIIZZ(4);
    }

    public final void LJI(YIO yio) {
        if (this.LJLJI) {
            MessageType messagetype = (MessageType) this.LJLILLLLZI.LJIIIIZZ(4);
            MessageType messagetype2 = this.LJLILLLLZI;
            C87169YIz c87169YIz = C87169YIz.LIZJ;
            c87169YIz.getClass();
            c87169YIz.LIZ(messagetype.getClass()).LIZLLL(messagetype, messagetype2);
            this.LJLILLLLZI = messagetype;
            this.LJLJI = false;
        }
        MessageType messagetype3 = this.LJLILLLLZI;
        C87169YIz c87169YIz2 = C87169YIz.LIZJ;
        c87169YIz2.getClass();
        c87169YIz2.LIZ(messagetype3.getClass()).LIZLLL(messagetype3, yio);
    }
}
